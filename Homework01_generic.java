package com.tge.generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: Homework01_generic
 * Package: com.tge.generic
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/13 - 22:44
 * Version:
 */
public class Homework01_generic {
    public static void main(String[] args) {


    }

    @Test
    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,18,"jack"));
        dao.save("002",new User(2,20,"tom"));
        dao.save("003",new User(3,22,"smith"));
        List<User> list = dao.list();
        System.out.println(list);

        dao.update("003",new User(3,25,"mary"));
        List<User> list1 = dao.list();
        System.out.println(list1);
        dao.delete("002");
        list = dao.list();
        System.out.println(list);
    }
}

class DAO<T> {

    private Map<String,T> map = new HashMap<>();


    public void save(String id, T entity){
        map.put(id,entity);
    }

    public T get(String id){
      return map.get(id);
    }

    public void update(String id, T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        ArrayList<T> arrayList = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            arrayList.add(map.get(key));
        }
        return arrayList;
    }

    public void delete(String id){
        map.remove(id);
    }


}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
