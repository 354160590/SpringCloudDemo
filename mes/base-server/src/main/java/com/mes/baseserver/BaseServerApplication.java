package com.mes.baseserver;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class BaseServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseServerApplication.class, args);
	}
//	@Value("${server.port}")
//	String port;
//	@Value("${foo}")
//	String foo;
//	@RequestMapping("/hi")
//	public String home(@RequestParam String name) {
//		return "hi "+name+",i am from port:" +port+" base-server"+"mqInfo"+foo;
//	}
//	@RequestMapping("/findTest")
//	@ResponseBody
//	public String test(){
//		return "123";
//	}
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();

		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

		//处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);

		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

		HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;

		return new HttpMessageConverters(converter);

	}
}
