package com.bwei.pojo;
/**
 * 商品表
 */
public class Shop {

    private int id;

    private  String imges;

    private  String name;

    private  String introl;

    private  int money;

    private  String starttime;

    private  String endtime;

    private int stater;

    private int tid;

    private String tname;


    public Shop() {
        super();
    }

    public Shop(int id, String imges, String name, String introl, int money, String starttime, String endtime, int stater, int tid, String tname) {
        this.id = id;
        this.imges = imges;
        this.name = name;
        this.introl = introl;
        this.money = money;
        this.starttime = starttime;
        this.endtime = endtime;
        this.stater = stater;
        this.tid = tid;
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", imges='" + imges + '\'' +
                ", name='" + name + '\'' +
                ", introl='" + introl + '\'' +
                ", money=" + money +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", stater=" + stater +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImges() {
        return imges;
    }

    public void setImges(String imges) {
        this.imges = imges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntrol() {
        return introl;
    }

    public void setIntrol(String introl) {
        this.introl = introl;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public int getStater() {
        return stater;
    }

    public void setStater(int stater) {
        this.stater = stater;
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
