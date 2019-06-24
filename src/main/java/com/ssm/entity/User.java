package com.ssm.entity;

import java.util.Date;

public class User {
    private Long id;
    private String memberNum;      //由系统自动生成 类似qq号
    private String password;
    private Float balance;         // 余额
    private Date renewaled;        // 最近一次充值时间
    private Date created;          // 会员创建时间
    private Date consumed;         // 最近一次消费时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Date getRenewaled() {
        return renewaled;
    }

    public void setRenewaled(Date renewaled) {
        this.renewaled = renewaled;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getConsumed() {
        return consumed;
    }

    public void setConsumed(Date consumed) {
        this.consumed = consumed;
    }
}
