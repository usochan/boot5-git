package com.usochantest44.datatest.pojo;

public class hgame {

    private Integer hid;
    private String hname;
    private Integer parentid;
    private String level;

    public hgame(){

    }

    public hgame(Integer hid, String hname, Integer parentId, String level) {
        this.hid = hid;
        this.hname = hname;
        this.parentid = parentId;
        this.level = level;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public Integer getParentId() {
        return parentid;
    }

    public void setParentId(Integer parentId) {
        this.parentid = parentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
