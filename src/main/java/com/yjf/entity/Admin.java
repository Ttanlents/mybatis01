package com.yjf.entity;

/**
 * @author 余俊锋
 * @date 2020/10/9 19:29
 * @Description
 */
public class Admin {
    private Integer adminId;
    private String adminCode;
    private String adminPassword;
    private String adminName;
    private String adminTelephone;
    private String adminEmail;
    private String adminEnrolldate;

    public Admin() {
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminTelephone() {
        return adminTelephone;
    }

    public void setAdminTelephone(String adminTelephone) {
        this.adminTelephone = adminTelephone;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminEnrolldate() {
        return adminEnrolldate;
    }

    public void setAdminEnrolldate(String adminEnrolldate) {
        this.adminEnrolldate = adminEnrolldate;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminCode='" + adminCode + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminTelephone='" + adminTelephone + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminEnrolldate='" + adminEnrolldate + '\'' +
                '}';
    }
}
