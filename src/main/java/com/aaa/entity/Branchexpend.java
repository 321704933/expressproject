package com.aaa.entity;

import java.util.Date;

public class Branchexpend {
    private Integer braexid;
    private String braexname;
    private Integer braexludannumber;
    private Integer braexrecnumber;
    private Integer braexsendnumber;
    private Integer bradaojiannumber;
    private Integer braextakenumber;
    private Integer brawentijiannumber;
    private Integer braexqiannumber;
    private Double braexludan;
    private Double braexaddress;
    private Double braexaddresser;
    private Double bradaojian;
    private Double braexdelivery;
    private Double brawentijian;
    private Double braexsign;
    private Double zongfeiyong;
    private Date braexdate;
    private Integer complaintsnumber;
    private Double complaintsmoney;

    public Integer getComplaintsnumber() {
        return complaintsnumber;
    }

    public void setComplaintsnumber(Integer complaintsnumber) {
        this.complaintsnumber = complaintsnumber;
    }

    public Double getComplaintsmoney() {
        return complaintsmoney;
    }

    public void setComplaintsmoney(Double complaintsmoney) {
        this.complaintsmoney = complaintsmoney;
    }

    public Branchexpend() {
    }

    @Override
    public String toString() {
        return "Branchexpend{" +
                "braexid=" + braexid +
                ", braexname='" + braexname + '\'' +
                ", braexludannumber=" + braexludannumber +
                ", braexrecnumber=" + braexrecnumber +
                ", braexsendnumber=" + braexsendnumber +
                ", bradaojiannumber=" + bradaojiannumber +
                ", braextakenumber=" + braextakenumber +
                ", brawentijiannumber=" + brawentijiannumber +
                ", braexqiannumber=" + braexqiannumber +
                ", braexludan=" + braexludan +
                ", braexaddress=" + braexaddress +
                ", braexaddresser=" + braexaddresser +
                ", bradaojian=" + bradaojian +
                ", braexdelivery=" + braexdelivery +
                ", brawentijian=" + brawentijian +
                ", braexsign=" + braexsign +
                ", zongfeiyong=" + zongfeiyong +
                ", braexdate=" + braexdate +
                '}';
    }

    public Branchexpend(Integer braexid, String braexname, Integer braexludannumber, Integer braexrecnumber, Integer braexsendnumber, Integer bradaojiannumber, Integer braextakenumber, Integer brawentijiannumber, Integer braexqiannumber, Double braexludan, Double braexaddress, Double braexaddresser, Double bradaojian, Double braexdelivery, Double brawentijian, Double braexsign, Double zongfeiyong, Date braexdate) {
        this.braexid = braexid;
        this.braexname = braexname;
        this.braexludannumber = braexludannumber;
        this.braexrecnumber = braexrecnumber;
        this.braexsendnumber = braexsendnumber;
        this.bradaojiannumber = bradaojiannumber;
        this.braextakenumber = braextakenumber;
        this.brawentijiannumber = brawentijiannumber;
        this.braexqiannumber = braexqiannumber;
        this.braexludan = braexludan;
        this.braexaddress = braexaddress;
        this.braexaddresser = braexaddresser;
        this.bradaojian = bradaojian;
        this.braexdelivery = braexdelivery;
        this.brawentijian = brawentijian;
        this.braexsign = braexsign;
        this.zongfeiyong = zongfeiyong;
        this.braexdate = braexdate;
    }

    public Integer getBraexid() {
        return braexid;
    }

    public void setBraexid(Integer braexid) {
        this.braexid = braexid;
    }

    public String getBraexname() {
        return braexname;
    }

    public void setBraexname(String braexname) {
        this.braexname = braexname;
    }

    public Integer getBraexludannumber() {
        return braexludannumber;
    }

    public void setBraexludannumber(Integer braexludannumber) {
        this.braexludannumber = braexludannumber;
    }

    public Integer getBraexrecnumber() {
        return braexrecnumber;
    }

    public void setBraexrecnumber(Integer braexrecnumber) {
        this.braexrecnumber = braexrecnumber;
    }

    public Integer getBraexsendnumber() {
        return braexsendnumber;
    }

    public void setBraexsendnumber(Integer braexsendnumber) {
        this.braexsendnumber = braexsendnumber;
    }

    public Integer getBradaojiannumber() {
        return bradaojiannumber;
    }

    public void setBradaojiannumber(Integer bradaojiannumber) {
        this.bradaojiannumber = bradaojiannumber;
    }

    public Integer getBraextakenumber() {
        return braextakenumber;
    }

    public void setBraextakenumber(Integer braextakenumber) {
        this.braextakenumber = braextakenumber;
    }

    public Integer getBrawentijiannumber() {
        return brawentijiannumber;
    }

    public void setBrawentijiannumber(Integer brawentijiannumber) {
        this.brawentijiannumber = brawentijiannumber;
    }

    public Integer getBraexqiannumber() {
        return braexqiannumber;
    }

    public void setBraexqiannumber(Integer braexqiannumber) {
        this.braexqiannumber = braexqiannumber;
    }

    public Double getBraexludan() {
        return braexludan;
    }

    public void setBraexludan(Double braexludan) {
        this.braexludan = braexludan;
    }

    public Double getBraexaddress() {
        return braexaddress;
    }

    public void setBraexaddress(Double braexaddress) {
        this.braexaddress = braexaddress;
    }

    public Double getBraexaddresser() {
        return braexaddresser;
    }

    public void setBraexaddresser(Double braexaddresser) {
        this.braexaddresser = braexaddresser;
    }

    public Double getBradaojian() {
        return bradaojian;
    }

    public void setBradaojian(Double bradaojian) {
        this.bradaojian = bradaojian;
    }

    public Double getBraexdelivery() {
        return braexdelivery;
    }

    public void setBraexdelivery(Double braexdelivery) {
        this.braexdelivery = braexdelivery;
    }

    public Double getBrawentijian() {
        return brawentijian;
    }

    public void setBrawentijian(Double brawentijian) {
        this.brawentijian = brawentijian;
    }

    public Double getBraexsign() {
        return braexsign;
    }

    public void setBraexsign(Double braexsign) {
        this.braexsign = braexsign;
    }

    public Double getZongfeiyong() {
        return zongfeiyong;
    }

    public void setZongfeiyong(Double zongfeiyong) {
        this.zongfeiyong = zongfeiyong;
    }

    public Date getBraexdate() {
        return braexdate;
    }

    public void setBraexdate(Date braexdate) {
        this.braexdate = braexdate;
    }
}
