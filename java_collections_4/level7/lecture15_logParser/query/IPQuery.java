package javarush.java_collections_4.level7.lecture15_logParser.query;
/*
package com.javarush.task.task39.task3913.query;
*/
import javarush.java_collections_4.level7.lecture15_logParser.Event;
import javarush.java_collections_4.level7.lecture15_logParser.Status;

import java.util.Date;
import java.util.Set;

public interface IPQuery {
    int getNumberOfUniqueIPs(Date after, Date before);

    Set<String> getUniqueIPs(Date after, Date before);

    Set<String> getIPsForUser(String user, Date after, Date before);

    Set<String> getIPsForEvent(Event event, Date after, Date before);

    Set<String> getIPsForStatus(Status status, Date after, Date before);
}
