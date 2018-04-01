package com.mes.baseserver.base.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class LyfBasePersonnel {
    @Id
//    @GeneratedValue
    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
    private String perId;
    private String perCode;
    private String perName;
    private String perUsername;
    private String perPassword;
    private String perType;
    private String perPhone;
    private String perEmail;
    private String perCard;
    private Date perCreatetime;
    private Date perUpdatetime;
    private Long perUse;

    public LyfBasePersonnel(String perId,String perCode, String perName, String perUsername, String perPassword, String perType, String perPhone, String perEmail, String perCard, Date perCreatetime, Date perUpdatetime, Long perUse) {
        this.perId = perId;
        this.perCode = perCode;
        this.perName = perName;
        this.perUsername = perUsername;
        this.perPassword = perPassword;
        this.perType = perType;
        this.perPhone = perPhone;
        this.perEmail = perEmail;
        this.perCard = perCard;
        this.perCreatetime = perCreatetime;
        this.perUpdatetime = perUpdatetime;
        this.perUse = perUse;
    }

    public LyfBasePersonnel() {
    }

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId;
    }

    public String getPerCode() {
        return perCode;
    }

    public void setPerCode(String perCode) {
        this.perCode = perCode;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPerUsername() {
        return perUsername;
    }

    public void setPerUsername(String perUsername) {
        this.perUsername = perUsername;
    }

    public String getPerPassword() {
        return perPassword;
    }

    public void setPerPassword(String perPassword) {
        this.perPassword = perPassword;
    }

    public String getPerType() {
        return perType;
    }

    public void setPerType(String perType) {
        this.perType = perType;
    }

    public String getPerPhone() {
        return perPhone;
    }

    public void setPerPhone(String perPhone) {
        this.perPhone = perPhone;
    }

    public String getPerEmail() {
        return perEmail;
    }

    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail;
    }

    public String getPerCard() {
        return perCard;
    }

    public void setPerCard(String perCard) {
        this.perCard = perCard;
    }

    public Date getPerCreatetime() {
        return perCreatetime;
    }

    public void setPerCreatetime(Date perCreatetime) {
        this.perCreatetime = perCreatetime;
    }

    public Date getPerUpdatetime() {
        return perUpdatetime;
    }

    public void setPerUpdatetime(Date perUpdatetime) {
        this.perUpdatetime = perUpdatetime;
    }

    public Long getPerUse() {
        return perUse;
    }

    public void setPerUse(Long perUse) {
        this.perUse = perUse;
    }
}
