package javarush.java_collections_4.level7.lecture8.task6.space.crew;
/*
package com.javarush.task.task37.task3713.space.crew;
*/
public abstract class AbstractCrewMember {
    public enum CompetencyLevel {
        NOVICE,
        INTERMEDIATE,
        ADVANCED,
        EXPERT
    }

    protected CompetencyLevel competencyLevel;

    protected AbstractCrewMember nextCrewMember;

    public void setNextCrewMember(AbstractCrewMember nextCrewMember) {
        this.nextCrewMember = nextCrewMember;
    }

    public void handleRequest(CompetencyLevel competencyLevel, String request) {
        if (this.competencyLevel ==  competencyLevel) {
            doTheJob(request);
            return;
        }

        if (this.competencyLevel.ordinal() <  competencyLevel.ordinal()) {
            nextCrewMember.handleRequest(competencyLevel, request);
        }
    }

    protected abstract void doTheJob(String request);
}

