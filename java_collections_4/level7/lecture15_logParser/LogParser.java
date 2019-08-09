package javarush.java_collections_4.level7.lecture15_logParser;
/*
package com.javarush.task.task39.task3913;
*/

import javarush.java_collections_4.level7.lecture15_logParser.query.*;

import java.io.*;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogParser implements IPQuery, UserQuery, DateQuery, EventQuery, QLQuery {
    private Path path;
    private List<File> list = new ArrayList<File>();

    public LogParser(Path logDir) {
        path = logDir;
    }

    /**
     * должен возвращать количество уникальных IP адресов за выбранный период.
     */
    @Override
    public int getNumberOfUniqueIPs(Date after, Date before) {
        return getUniqueIPs(after, before).size();
    }

    /**
     * должен возвращать множество, содержащее все не повторяющиеся IP адреса за выбранный период.
     */
    @Override
    public Set<String> getUniqueIPs(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<>();
        for (Log log : sortSet) {
            if (returnSet.contains(log.getIp())) {
            } else {
                returnSet.add(log.getIp());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать IP адреса, с которых работал переданный пользователь за выбранный период.
     */
    @Override
    public Set<String> getIPsForUser(String user, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<>();
        for (Log log : sortSet) {
            if (user.equalsIgnoreCase(log.getName())) {
                returnSet.add(log.getIp());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать IP адреса, с которых было произведено переданное событие за выбранный период.
     */
    @Override
    public Set<String> getIPsForEvent(Event event, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<>();
        for (Log log : sortSet) {
            if (event.equals(log.getEvent())) {
                returnSet.add(log.getIp());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать IP адреса, события с которых закончилось переданным статусом за выбранный период.
     */
    @Override
    public Set<String> getIPsForStatus(Status status, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<>();
        for (Log log : sortSet) {
            if (status.equals(log.getStatus())) {
                returnSet.add(log.getIp());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать множество содержащее всех пользователей.
     */
    @Override
    public Set<String> getAllUsers() {
        Set<Log> sortSet = getLogs(null, null);
        Set<String> returnSet = new HashSet<>();
        for (Log log : sortSet) {
            if (returnSet.contains(log.getName())) {

            } else {
                returnSet.add(log.getName());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать количество уникальных пользователей за выбранный период.
     */
    @Override
    public int getNumberOfUsers(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<>();
        for (Log log : sortSet) {
            if (returnSet.contains(log.getName())) {
            } else {
                returnSet.add(log.getName());
            }
        }
        return returnSet.size();
    }

    /**
     * должен возвращать количество событий от переданного пользователя за выбранный период.
     */
    @Override
    public int getNumberOfUserEvents(String user, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<Event> returnSet = new HashSet<Event>();
        for (Log log : sortSet) {
            if (user.equalsIgnoreCase(log.getName())) {
                returnSet.add(log.getEvent());
            }
        }
        return returnSet.size();
    }

    /**
     * должен возвращать пользователей, которые работали с переданного IP адреса за выбранный период.
     */
    @Override
    public Set<String> getUsersForIP(String ip, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (ip.equals(log.getIp())) {
                returnSet.add(log.getName());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать пользователей, которые были залогинены за выбранный период.
     */
    @Override
    public Set<String> getLoggedUsers(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (Event.LOGIN.equals(log.getEvent())) {
                returnSet.add(log.getName());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать пользователей, которые скачали плагин за выбранный период.
     */
    @Override
    public Set<String> getDownloadedPluginUsers(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (Event.DOWNLOAD_PLUGIN.equals(log.getEvent())) {
                returnSet.add(log.getName());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать пользователей, которые отправили сообщение за выбранный период.
     */
    @Override
    public Set<String> getWroteMessageUsers(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (Event.WRITE_MESSAGE.equals(log.getEvent())) {
                returnSet.add(log.getName());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать пользователей, которые решали любую задачу за выбранный период.
     */
    @Override
    public Set<String> getSolvedTaskUsers(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (Event.SOLVE_TASK.equals(log.getEvent())) {
                returnSet.add(log.getName());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать пользователей, которые решали задачу с номером task за выбранный период.
     */
    @Override
    public Set<String> getSolvedTaskUsers(Date after, Date before, int task) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (Event.SOLVE_TASK.equals(log.getEvent())) {
                if ((task+"").equals(log.getDop())) {
                    returnSet.add(log.getName());
                }
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать пользователей, которые решили любую задачу за выбранный период.
     */
    @Override
    public Set<String> getDoneTaskUsers(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (Event.DONE_TASK.equals(log.getEvent())) {
                returnSet.add(log.getName());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать пользователей, которые решили задачу с номером task за выбранный период.
     */
    @Override
    public Set<String> getDoneTaskUsers(Date after, Date before, int task) {
        Set<Log> sortSet = getLogs(after, before);
        Set<String> returnSet = new HashSet<String>();
        for (Log log : sortSet) {
            if (Event.DONE_TASK.equals(log.getEvent())) {
                if ((task+"").equals(log.getDop())) {
                    returnSet.add(log.getName());
                }
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать множество дат, когда переданный пользователь произвел переданное событие за выбранный период.
     */
    @Override
    public Set<Date> getDatesForUserAndEvent(String user, Event event, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<Date> returnSet = new HashSet<Date>();
        for (Log log : sortSet) {
            if (event.equals(log.getEvent())) {
                if (user.equalsIgnoreCase(log.getName())) {
                    returnSet.add(log.getDate());
                }
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать множество дат, когда любое событие не выполнилось за выбранный период.
     */
    @Override
    public Set<Date> getDatesWhenSomethingFailed(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<Date> returnSet = new HashSet<Date>();
        for (Log log : sortSet) {
            if (Status.FAILED.equals(log.getStatus())) {
                returnSet.add(log.getDate());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать множество дат, когда любое событие закончилось ошибкой за выбранный период.
     */
    @Override
    public Set<Date> getDatesWhenErrorHappened(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<Date> returnSet = new HashSet<Date>();
        for (Log log : sortSet) {
            if (Status.ERROR.equals(log.getStatus())) {
                returnSet.add(log.getDate());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать дату, когда переданный пользователь впервые залогинился за выбранный период.
     * Если такой даты в логах нет - null.
     */
    @Override
    public Date getDateWhenUserLoggedFirstTime(String user, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        List<Log> set = new ArrayList<>();
        for (Log log : sortSet) {
            if (user.equalsIgnoreCase(log.getName())) {
                if (Event.LOGIN.equals(log.getEvent())) {
                    if (Status.OK.equals(log.getStatus())) {
                        set.add(log);
                    }
                }
            }
        }

        Collections.sort(set, new Comparator<Log>() {
            @Override
            public int compare(Log o1, Log o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        if (set.isEmpty()) {
            return null;
        } else {
            return set.get(0).getDate();
        }
    }

    /**
     * должен возвращать дату,
     * когда переданный пользователь впервые попытался решить задачу с номером task за выбранный период.
     * Если такой даты в логах нет - null.
    */
    @Override
    public Date getDateWhenUserSolvedTask(String user, int task, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        List<Log> set = new ArrayList<>();
        for (Log log : sortSet) {
            if (user.equalsIgnoreCase(log.getName())) {
                if (Event.SOLVE_TASK.equals(log.getEvent())) {
                    if ((task+"").equals(log.getDop())) {
                        set.add(log);
                    }
                }
            }
        }
        Collections.sort(set, new Comparator<Log>() {
            @Override
            public int compare(Log o1, Log o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        if (set.isEmpty()) {
            return null;
        } else {
            return set.get(0).getDate();
        }
    }

    /**
     * должен возвращать дату,
     * когда переданный пользователь впервые решил задачу с номером task за выбранный период.
     * Если такой даты в логах нет - null.
     */
    @Override
    public Date getDateWhenUserDoneTask(String user, int task, Date after, Date before) {
        Set<Date> set = new HashSet<>();
        getLogs(after, before).forEach(item -> {
            if (item.getEvent().equals(Event.DONE_TASK)&&item.getName().equals(user)&&item.getDop().equals(task+""))
                set.add(item.getDate());
        });
        List<Date> list=new ArrayList(set);
        Collections.sort(list);
        if(list.size()!=0)return list.get(0);
        return null;
    }

    /**
     * должен возвращать множество дат, когда переданный пользователь написал сообщение за выбранный период.
     */
    @Override
    public Set<Date> getDatesWhenUserWroteMessage(String user, Date after, Date before) {
        Set<Date> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (Event.WRITE_MESSAGE.equals(log.getEvent())&&user.equalsIgnoreCase(log.getName())&&Status.OK.equals(log.getStatus()))
                returnSet.add(log.getDate());
        });
        return returnSet;
    }

    /**
     * должен возвращать множество дат, когда переданный пользователь скачал плагин за выбранный период.
     */
    @Override
    public Set<Date> getDatesWhenUserDownloadedPlugin(String user, Date after, Date before) {
        Set<Date> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (Event.DOWNLOAD_PLUGIN.equals(log.getEvent())&&user.equalsIgnoreCase(log.getName())&&Status.OK.equals(log.getStatus()))
                returnSet.add(log.getDate());
        });
        return returnSet;
    }

    /**
     * должен возвращать количество уникальных событий за выбранный период.
     */
    @Override
    public int getNumberOfAllEvents(Date after, Date before) {
        Set<Event> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (!returnSet.contains(log.getEvent()))
                returnSet.add(log.getEvent());
        });

        return returnSet.size();
    }

    /**
     * должен возвращать множество уникальных событий за выбранный период.
     */
    @Override
    public Set<Event> getAllEvents(Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        Set<Event> returnSet = new HashSet<>();
        for (Log log : sortSet) {
            if (!returnSet.contains(log.getEvent())) {
                returnSet.add(log.getEvent());
            }
        }
        return returnSet;
    }

    /**
     * должен возвращать множество уникальных событий, которые происходили с переданного IP адреса за выбранный период.
     */
    @Override
    public Set<Event> getEventsForIP(String ip, Date after, Date before) {
        Set<Event> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (log.getDop().equals(ip)&&(!returnSet.contains(log.getEvent())))
                returnSet.add(log.getEvent());
        });
        return returnSet;
    }

    /**
     * должен возвращать множество уникальных событий, которые произвел переданный пользователь за выбранный период.
     */
    @Override
    public Set<Event> getEventsForUser(String user, Date after, Date before) {
        Set<Event> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (user.equalsIgnoreCase(log.getName())&&(!returnSet.contains(log.getEvent())))
                returnSet.add(log.getEvent());
        });
        return returnSet;
    }

    /**
     * должен возвращать множество уникальных событий, у которых статус выполнения FAILED за выбранный период.
     */
    @Override
    public Set<Event> getFailedEvents(Date after, Date before) {
        Set<Event> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (log.getStatus().equals(Status.FAILED)&&(!returnSet.contains(log.getEvent())))
                returnSet.add(log.getEvent());
        });
        return returnSet;
    }

    /**
     * должен возвращать множество уникальных событий, у которых статус выполнения ERROR за выбранный период.
     */
    @Override
    public Set<Event> getErrorEvents(Date after, Date before) {
        Set<Event> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (log.getStatus().equals(Status.ERROR)&&(!returnSet.contains(log.getEvent())))
                returnSet.add(log.getEvent());
        });
        return returnSet;
    }

    /**
     * должен возвращать количество попыток решить задачу с номером task за выбранный период.
     */
    @Override
    public int getNumberOfAttemptToSolveTask(int task, Date after, Date before) {
        Set<Log> returnSet = new HashSet<>();
        getLogs(after, before).forEach(log -> {
            if (log.getDop().equals(task+"")&&log.getEvent().equals(Event.SOLVE_TASK))
                returnSet.add(log);
        });
        return returnSet.size();
    }

    /**
     * должен возвращать количество успешных решений задачи с номером task за выбранный период.
     */
    @Override
    public int getNumberOfSuccessfulAttemptToSolveTask(int task, Date after, Date before) {
        Set<Log> sortSet = getLogs(after, before);
        List<Log> set = new ArrayList<>();
        for (Log log : sortSet) {
            if (Event.DONE_TASK.equals(log.getEvent())) {
                if ((log.getDop()).equals(task+"")) {
                    set.add(log);
                }
            }
        }
        return set.size();
    }

    /**
     * должен возвращать мапу (номер_задачи : количество_попыток_решить_ее) за выбранный период.
     */
    @Override
    public Map<Integer, Integer> getAllSolvedTasksAndTheirNumber(Date after, Date before) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Log> sortSet = getLogs(after, before);
        for (Log log : sortSet) {
            if (Event.SOLVE_TASK.equals(log.getEvent())) {
                Integer a = Integer.parseInt(log.getDop());
                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                } else {
                    map.put(a, 1);
                }
            }
        }
        return map;
    }

    /**
     * должен возвращать мапу (номер_задачи : сколько_раз_ее_решили) за выбранный период.
     */
    @Override
    public Map<Integer, Integer> getAllDoneTasksAndTheirNumber(Date after, Date before) {
        Map<Integer, Integer> map = new HashMap<>();
        getLogs(after, before).forEach(log -> {
            if (Event.DONE_TASK.equals(log.getEvent()))
                if (map.containsKey(Integer.parseInt(log.getDop())))
                    map.put(Integer.parseInt(log.getDop()), map.get(Integer.parseInt(log.getDop()))+1);
                else
                    map.put(Integer.parseInt(log.getDop()), 1);
        });
        return map;
    }

    /**
     * должен поддерживать только следующие запросы:
     * 5.1.1. get ip
     * 5.1.2. get user
     * 5.1.3. get date
     * 5.1.4. get event
     * 5.1.5. get status
     * Реальные объекты в возвращаемом множестве должны быть типа String для запросов ip и user,
     * для запроса date - тип объектов Date, для event и status - Event и Status соответственно.
     */
    @Override
    public Set<Object> execute(String query) {
        String field1 = "";
        String field2 = "";
        String value1 = "";
        String value2 = "";
        String value3 = "";

        List<String> values = new ArrayList<>();
        Pattern pattern = Pattern.compile("\"[\\w \\.:]+\"");
        Matcher matcher = pattern.matcher(query);
        while (matcher.find()) {
            values.add(matcher.group().replace("\"", ""));
        }

        if (query.split(" ").length > 2) {
            field1 = query.split(" ")[1];
            field2 = query.split(" ")[3];
            value1 = values.get(0);
            if (values.size() > 1) {
                value2 = values.get(1);
                value3 = values.get(2);
            }
        }

        Set<Object> querySet = new HashSet<>();
        for (String line : getLinesFromLogs()) {
            String[] lineParts = line.split("\\t");
            if (values.size() == 0) {
                switch (query) {
                    case "get ip":
                        querySet.add(lineParts[0]);
                        break;
                    case "get user":
                        querySet.add(lineParts[1]);
                        break;
                    case "get date":
                        Date date = getDate(lineParts[2]);
                        querySet.add(date);
                        break;
                    case "get event":
                        Event event = Event.valueOf(lineParts[3].split(" ")[0]);
                        querySet.add(event);
                        break;
                    case "get status":
                        Status status = Status.valueOf(lineParts[4]);
                        querySet.add(status);
                        break;
                }
            } else {
                switch (field1) {
                    case "ip":
                        switch (field2) {
                            case "ip":
                            case "user":
                            case "date":
                                if (value1.equals(lineParts[getField2Index(field2)])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            querySet.add(lineParts[0]);
                                        }
                                    } else {
                                        querySet.add(lineParts[0]);
                                    }
                                }
                                break;
                            case "status":
                                if (value1.equals(lineParts[getField2Index(field2)])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            if (!(date.equals(getDate(value2))||date.equals(getDate(value3))))
                                                querySet.add(lineParts[0]);
                                        }
                                    } else {
                                        querySet.add(lineParts[0]);
                                    }
                                }
                                break;
                            case "event":
                                if (value1.equals(lineParts[3].split(" ")[0])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            if (!(date.equals(getDate(value2))||date.equals(getDate(value3))))
                                                querySet.add(lineParts[0]);
                                        }
                                    } else {
                                        querySet.add(lineParts[0]);
                                    }
                                }
                                break;
                        }
                        break;
                    case "user":
                        switch (field2) {
                            case "ip":
                            case "user":
                            case "date":
                            case "status":
                                if (value1.equals(lineParts[getField2Index(field2)])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            querySet.add(lineParts[1]);
                                        }
                                    } else {
                                        querySet.add(lineParts[1]);
                                    }
                                }
                                break;
                            case "event":
                                if (value1.equals(lineParts[3].split(" ")[0])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            querySet.add(lineParts[1]);
                                        }
                                    } else {
                                        querySet.add(lineParts[1]);
                                    }
                                }
                                break;
                        }
                        break;
                    case "date":
                        switch (field2) {
                            case "ip":
                            case "user":
                            case "date":
                            case "status":
                                if (value1.equals(lineParts[getField2Index(field2)])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            date = getDate(lineParts[2]);
                                            querySet.add(date);
                                        }
                                    } else {
                                        Date date = getDate(lineParts[2]);
                                        querySet.add(date);
                                    }
                                }
                                break;
                            case "event":
                                if (value1.equals(lineParts[3].split(" ")[0])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            if (!(date.equals(getDate(value2))||date.equals(getDate(value3)))) {
                                                date = getDate(lineParts[2]);
                                                querySet.add(date);
                                            }
                                        }
                                    } else {
                                        Date date = getDate(lineParts[2]);
                                        querySet.add(date);
                                    }
                                }
                                break;
                        }
                        break;
                    case "event":
                        switch (field2) {
                            case "ip":
                            case "user":
                            case "date":
                            case "status":
                                if (value1.equals(lineParts[getField2Index(field2)])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            Event event = Event.valueOf(lineParts[3].split(" ")[0]);
                                            querySet.add(event);
                                        }
                                    } else {
                                        Event event = Event.valueOf(lineParts[3].split(" ")[0]);
                                        querySet.add(event);
                                    }
                                }
                                break;
                            case "event":
                                if (value1.equals(lineParts[3].split(" ")[0])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            Event event = Event.valueOf(lineParts[3].split(" ")[0]);
                                            querySet.add(event);
                                        }
                                    } else {
                                        Event event = Event.valueOf(lineParts[3].split(" ")[0]);
                                        querySet.add(event);
                                    }
                                }
                                break;
                        }
                        break;
                    case "status":
                        switch (field2) {
                            case "ip":
                            case "user":
                            case "date":
                            case "status":
                                if (value1.equals(lineParts[getField2Index(field2)])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            Status status = Status.valueOf(lineParts[4]);
                                            querySet.add(status);
                                        }
                                    } else {
                                        Status status = Status.valueOf(lineParts[4]);
                                        querySet.add(status);
                                    }
                                }
                                break;
                            case "event":
                                if (value1.equals(lineParts[3].split(" ")[0])) {
                                    if (values.size() == 3) {
                                        Date date = getDate(lineParts[2]);
                                        if (isCompatibleDate(date.getTime(), getDate(value2), getDate(value3))) {
                                            Status status = Status.valueOf(lineParts[4]);
                                            querySet.add(status);
                                        }
                                    } else {
                                        Status status = Status.valueOf(lineParts[4]);
                                        querySet.add(status);
                                    }
                                }
                                break;
                        }
                        break;
                }
            }
        }
        return querySet;
    }

    private int getField2Index(String field2) {
        switch (field2) {
            case "ip":
                return 0;
            case "user":
                return 1;
            case "date":
                return 2;
            case "event":
                return 3;
            case "status":
                return 4;
        }
        return -1;
    }

    private Set<Log> sortByDate(Set<Log> set, Date after, Date before) {
        Set<Log> sortSet = new HashSet<Log>();
        if (after == null) {
            if (before == null) {
                return set;
            } else {
                for (Log log : set) {
                    if (log.getDate().getTime() <= before.getTime()) {
                        sortSet.add(log);
                    }
                }
                return sortSet;
            }
        } else {
            if (before == null) {
                for (Log log : set) {
                    if (log.getDate().getTime() >= after.getTime()) {
                        sortSet.add(log);
                    }
                }
                return sortSet;
            } else {
                for (Log log : set) {
                    if ((log.getDate().getTime() <= before.getTime()) && (log.getDate().getTime() >= after.getTime())) {
                        sortSet.add(log);
                    }
                }
                return sortSet;
            }
        }
    }

    private Set<Log> getLogs(Date after, Date before) {
        Set<Log> set = setLog(getWordsFromLogs(getLinesFromLogs()));
        Set<Log> newSet = sortByDate(set, after, before);
        if (newSet == null) {
            return new HashSet<Log>();
        } else {
            return newSet;
        }
    }

    private Set<Log> setLog(Set<String[]> set) {
        Set<Log> logSet = new HashSet<Log>();
        for (String[] lines : set) {
            String ip = lines[0];
            Status status = getStatus(lines[lines.length - 1]);
            String dop = "";
            boolean bl = false;
            int n = 0;
            try {
                int a = Integer.parseInt(lines[lines.length - 2]);
                dop = a + "";
                bl = true;
            } catch (Exception e) {
            }
            if (bl) {
                n = 1;
            }
            Event event = getEvent(lines[lines.length - 2 - n]);
            Date date = getDate(lines[lines.length - 3 - n], lines[lines.length - 4 - n]);
            String name = "";
            for (int b = 1; b < lines.length - 4 - n; b++) {
                name = name + " " + lines[b];
            }
            name = name.substring(1);
            logSet.add(new Log(ip, name, date, event, status, dop));
        }
        return logSet;
    }

    private Date getDate(String time, String date) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH);
        Date formatDate = null;
        try {
            formatDate = dateFormat.parse(date + " " + time);
        } catch (ParseException e) {
        }
        return formatDate;
    }

    private boolean isCompatibleDate(long lineDateTime, Date after, Date before) {
        if (after == null && before == null) {
            return true;
        } else if (after == null) {
            if (lineDateTime <= before.getTime()) {
                return true;
            }
        } else if (before == null) {
            if (lineDateTime >= after.getTime()) {
                return true;
            }
        } else {
            if (lineDateTime >= after.getTime() && lineDateTime <= before.getTime()) {
                return true;
            }
        }
        return false;
    }

    private Date getDate(String part) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH);
        Date date = null;
        try {
            date = dateFormat.parse(part);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    private Event getEvent(String event) {
        if (Event.LOGIN.toString().equals(event)) {
            return Event.LOGIN;
        } else {
            if (Event.DONE_TASK.toString().equals(event)) {
                return Event.DONE_TASK;
            } else {
                if (Event.DOWNLOAD_PLUGIN.toString().equals(event)) {
                    return Event.DOWNLOAD_PLUGIN;
                } else {
                    if (Event.SOLVE_TASK.toString().equals(event)) {
                        return Event.SOLVE_TASK;
                    } else {
                        return Event.WRITE_MESSAGE;
                    }
                }
            }
        }
    }

    private Status getStatus(String status) {
        if (Status.FAILED.toString().equals(status)) {
            return Status.FAILED;
        } else {
            if (Status.OK.toString().equals(status)) {
                return Status.OK;
            } else {
                return Status.ERROR;
            }
        }
    }

    private Set<String[]> getWordsFromLogs(Set<String> set) {
        Set<String[]> strings = new HashSet<String[]>();
        for (String string : set) {
            String[] mass = string.split(String.format("\\s"));
            strings.add(mass);
        }
        return strings;
    }

    private Set<String> getLinesFromLogs() {
        Set<String> set = new HashSet<>();
        getFilesFromDirectory(path.toFile());
        for (File file : list) {
            {
                {
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        while (reader.ready()) {
                            set.add(reader.readLine());
                        }
                    } catch (Exception e) {

                    }
                }
            }
        }
        return set;
    }

    private void getFilesFromDirectory(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                getFilesFromDirectory(fileEntry);
            } else {
                if (fileEntry.getName().endsWith(".log"))
                    list.add(fileEntry);
            }
        }
    }

    class Log {
        private String ip;
        private String name;
        private Date date;
        private Event event;
        private Status status;
        private String dop;

        public Log(String ip, String name, Date date, Event event, Status status, String dop) {
            this.ip = ip;
            this.name = name;
            this.date = date;
            this.event = event;
            this.status = status;
            this.dop = dop;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Event getEvent() {
            return event;
        }

        public void setEvent(Event event) {
            this.event = event;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public String getDop() {
            return dop;
        }

        public void setDop(String dop) {
            this.dop = dop;
        }

    }
}
