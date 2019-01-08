package com.shtel.secure.platform.issue.model;

import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Auther: 陈文强
 * @Date: 2019/1/7 15:38
 * @Description: 任务pojo类
 */
@Table(name = "ws_task")
@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private String urls;
    private Integer siteinfo;
    private Integer availability;
    private Integer blackLinks;
    private Integer malscan;
    private Integer keyword;
    private Integer sql;
    private Integer xss;
    private Integer webvul;
    private Integer info_leak;
    private Integer cgi;
    private Integer csrf;
    private Integer is_period;
    private Integer formCrack;
    private String message;
    private Date create_time;
    private Date update_time;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public Integer getSiteinfo() {
        return siteinfo;
    }

    public void setSiteinfo(Integer siteinfo) {
        this.siteinfo = siteinfo;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public Integer getBlackLinks() {
        return blackLinks;
    }

    public void setBlackLinks(Integer blackLinks) {
        this.blackLinks = blackLinks;
    }

    public Integer getMalscan() {
        return malscan;
    }

    public void setMalscan(Integer malscan) {
        this.malscan = malscan;
    }

    public Integer getKeyword() {
        return keyword;
    }

    public void setKeyword(Integer keyword) {
        this.keyword = keyword;
    }

    public Integer getSql() {
        return sql;
    }

    public void setSql(Integer sql) {
        this.sql = sql;
    }

    public Integer getXss() {
        return xss;
    }

    public void setXss(Integer xss) {
        this.xss = xss;
    }

    public Integer getWebvul() {
        return webvul;
    }

    public void setWebvul(Integer webvul) {
        this.webvul = webvul;
    }

    public Integer getInfo_leak() {
        return info_leak;
    }

    public void setInfo_leak(Integer info_leak) {
        this.info_leak = info_leak;
    }

    public Integer getCgi() {
        return cgi;
    }

    public void setCgi(Integer cgi) {
        this.cgi = cgi;
    }

    public Integer getCsrf() {
        return csrf;
    }

    public void setCsrf(Integer csrf) {
        this.csrf = csrf;
    }

    public Integer getIs_period() {
        return is_period;
    }

    public void setIs_period(Integer is_period) {
        this.is_period = is_period;
    }

    public Integer getFormCrack() {
        return formCrack;
    }

    public void setFormCrack(Integer formCrack) {
        this.formCrack = formCrack;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}