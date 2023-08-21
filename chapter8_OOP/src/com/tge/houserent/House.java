package com.tge.houserent;



/**
 * ClassName: House
 * Package: com.tge.houserent
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 21:12
 * Version:
 */
public class House {
    private int id;
    private String host;
    private String tel;
    private String addr;
    private int rent;
    private String status;

    public House(int id, String host, String tel, String addr, int rent, String status) {
        this.id = id;
        this.host = host;
        this.tel = tel;
        this.addr = addr;
        this.rent = rent;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "\t" + host + "\t" + tel + "\t" + addr + "\t" + rent + "\t" + status + "\n";
    }
}
