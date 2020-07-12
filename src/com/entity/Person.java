package com.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //时间格式化
    public String getDate() {
        if (this.date != null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String dateone = dateFormat.format(this.date);
            return dateone;
        }else {
            return "";
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
