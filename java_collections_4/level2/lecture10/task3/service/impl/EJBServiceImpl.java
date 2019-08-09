package javarush.java_collections_4.level2.lecture10.task3.service.impl;

import javarush.java_collections_4.level2.lecture10.task3.service.Service;

public class EJBServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing the EJBService");
    }

    @Override
    public String getName() {
        return "EJBService";
    }

}

