package com.aaa.entity;

public class Wcomplaints {
    private Integer comid;
    private String combranch;
    private String comtuser;
    private String comexpnum;
    private Integer comfinemoney;
    private String comcontent;
    private String comdate;
    private String heiger;
    private String hname;

    @Override
    public String toString() {
        return "Wcomplaints{" +
                "comid=" + comid +
                ", combranch='" + combranch + '\'' +
                ", comtuser='" + comtuser + '\'' +
                ", comexpnum='" + comexpnum + '\'' +
                ", comfinemoney=" + comfinemoney +
                ", comcontent='" + comcontent + '\'' +
                ", comdate='" + comdate + '\'' +
                ", heiger='" + heiger + '\'' +
                ", hname='" + hname + '\'' +
                '}';
    }

    public Integer getComid() {
        return comid;
    }

    public void setComid(Integer comid) {
        this.comid = comid;
    }

    public String getCombranch() {
        return combranch;
    }

    public void setCombranch(String combranch) {
        this.combranch = combranch;
    }

    public String getComtuser() {
        return comtuser;
    }

    public void setComtuser(String comtuser) {
        this.comtuser = comtuser;
    }

    public String getComexpnum() {
        return comexpnum;
    }

    public void setComexpnum(String comexpnum) {
        this.comexpnum = comexpnum;
    }

    public Integer getComfinemoney() {
        return comfinemoney;
    }

    public void setComfinemoney(Integer comfinemoney) {
        this.comfinemoney = comfinemoney;
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    public String getComdate() {
        return comdate;
    }

    public void setComdate(String comdate) {
        this.comdate = comdate;
    }

    public String getHeiger() {
        return heiger;
    }

    public void setHeiger(String heiger) {
        this.heiger = heiger;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }
}
