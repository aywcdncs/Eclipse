package com.qakj.crm.pojo;

public class Supplierinfo {
    private Integer id;

    private String suppNumber;

    private String suppName;

    private String suppPhone;

    private String suppAddress;

    private Integer suppCredit;

    private String suppliesNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppNumber() {
        return suppNumber;
    }

    public void setSuppNumber(String suppNumber) {
        this.suppNumber = suppNumber == null ? null : suppNumber.trim();
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName == null ? null : suppName.trim();
    }

    public String getSuppPhone() {
        return suppPhone;
    }

    public void setSuppPhone(String suppPhone) {
        this.suppPhone = suppPhone == null ? null : suppPhone.trim();
    }

    public String getSuppAddress() {
        return suppAddress;
    }

    public void setSuppAddress(String suppAddress) {
        this.suppAddress = suppAddress == null ? null : suppAddress.trim();
    }

    public Integer getSuppCredit() {
        return suppCredit;
    }

    public void setSuppCredit(Integer suppCredit) {
        this.suppCredit = suppCredit;
    }

    public String getSuppliesNumber() {
        return suppliesNumber;
    }

    public void setSuppliesNumber(String suppliesNumber) {
        this.suppliesNumber = suppliesNumber == null ? null : suppliesNumber.trim();
    }
}