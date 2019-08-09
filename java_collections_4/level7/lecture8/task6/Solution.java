package javarush.java_collections_4.level7.lecture8.task6;
/*
package com.javarush.task.task37.task3713;
*/

import javarush.java_collections_4.level7.lecture8.task6.space.SpaceShip;
import javarush.java_collections_4.level7.lecture8.task6.space.crew.AbstractCrewMember;

/*
Chain of Responsibility
*/
public class Solution {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        AbstractCrewMember crewMember = spaceShip.getCrewChain();

        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.EXPERT, "ATTACK");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.NOVICE, "WASH THE FLOOR");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.INTERMEDIATE, "CHECK ENGINE");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.ADVANCED, "SET ROUTE");
    }
}

