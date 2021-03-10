package com.example.blooddonor;

public class Userinformation {
    private String dname;
    private String bgroup;
    private String gender;
    private String phoneNum;
    private String donDOB;
    private String donaddress;
    private String doncity;

    public Userinformation() {}

    public Userinformation(String dname, String bgroup, String gender, String phoneNum, String donDOB, String donaddress, String doncity) {
        this.dname = dname;
        this.bgroup=bgroup;
        this.gender=gender;
        this.phoneNum=phoneNum;
        this.donDOB=donDOB;
        this.donaddress=donaddress;
        this.doncity=doncity;
    }
    public String getDname(){
        return dname;
    }
    public String getBgroup(){
        return bgroup;
    }
    public String getGender(){
        return gender;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getDonDOB(){
        return donDOB;
    }
    public String getDonaddress(){
        return donaddress;
    }
    public String getDoncity(){
        return doncity;
    }



}
