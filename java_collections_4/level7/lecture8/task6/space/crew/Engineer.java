package javarush.java_collections_4.level7.lecture8.task6.space.crew;
/*
package com.javarush.task.task37.task3713.space.crew;
*/
public class Engineer extends AbstractCrewMember {
    public Engineer (AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println(request + " is a common engineering task. To the work!");
    }
}

