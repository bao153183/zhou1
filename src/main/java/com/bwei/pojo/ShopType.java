package com.bwei.pojo;

public class ShopType {
    /**
     * 商品类型表
     */

    private int tid;

    private  String tname;


    public ShopType() {
        super();
    }

    @Override
    public String toString() {
        return "ShopType{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public ShopType(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
