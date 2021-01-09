package com.longruan.demo1.entity;

public class Employee {
    private int employeeID;
    private String displayName;
    private int departId;
    private String loginName;
    private String agentNO;
    private String phone;
    private Boolean sex;

    public int getEmployeeID() {
        return employeeID;
    }

    public String getAgentNO() {
        return agentNO;
    }

    public void setAgentNO(String agentNO) {
        this.agentNO = agentNO;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
