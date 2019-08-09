package javarush.java_collections_4.level2.lecture10.task3;
/*
package com.javarush.task.task32.task3212;
*/
/*
import com.javarush.task.task32.task3212.service.Service;
*/
/*
Service Locator
*/

import javarush.java_collections_4.level2.lecture10.task3.service.Service;

public class Solution {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();

    }

}

