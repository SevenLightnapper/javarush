package javarush.java_collections_4.level3.lecture5.task5;
/*
package com.javarush.task.task33.task3305;
*/
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "className")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RacingBike.class, name = "race-bike"),
        @JsonSubTypes.Type(value = Motorbike.class, name = "motorbike"),
        @JsonSubTypes.Type(value = Car.class, name = "car")
})
public abstract class Vehicle {
    protected String name;
    protected String owner;
    protected int age;
}
