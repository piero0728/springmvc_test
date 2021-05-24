package cn.k0508.pojo;

import java.util.Date;

public class Emp {
    private Integer eid;

    private String ename;

    private String esex;

    private Date estartime;

    private Float epay;

    private Integer did;

    private Dept dept;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex == null ? null : esex.trim();
    }

    public Date getEstartime() {
        return estartime;
    }

    public void setEstartime(Date estartime) {
        this.estartime = estartime;
    }

    public Float getEpay() {
        return epay;
    }

    public void setEpay(Float epay) {
        this.epay = epay;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}