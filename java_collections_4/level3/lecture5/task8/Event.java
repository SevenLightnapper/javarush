package javarush.java_collections_4.level3.lecture5.task8;
/*
package com.javarush.task.task33.task3313;
*/
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Event {
    public String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
    public Date eventDate;

    public Event(String name) {
        this.name = name;
        eventDate = new Date();
    }
}
