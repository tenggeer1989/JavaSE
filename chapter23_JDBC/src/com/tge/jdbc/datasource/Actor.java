package com.tge.jdbc.datasource;



/**
 * ClassName: Actor
 * Package: com.tge.jdbc.datasource
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/27 - 22:48
 * Version:
 */
public class Actor {
    private Integer id;
    private String name;
    private String sex;
    private String borndate;
    private String phone;

    public Actor() { //一定要给一个无参构造器[反射需要]
    }

    public Actor(Integer id, String name, String sex, String borndate, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.borndate = borndate;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBorndate() {
        return borndate;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\nActor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", borndate=" + borndate +
                ", phone='" + phone + '\'' +
                '}';
    }

}
