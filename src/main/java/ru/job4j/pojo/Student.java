package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String FIO;
    private String group;


    private Date ofBegin;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getOfBegin() {
        return ofBegin;
    }

    public void setOfBegin(Date ofBegin) {
        this.ofBegin = ofBegin;
    }
}
