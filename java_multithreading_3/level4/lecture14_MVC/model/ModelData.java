package javarush.java_multithreading_3.level4.lecture14_MVC.model;

import javarush.java_multithreading_3.level4.lecture14_MVC.bean.User;

import java.util.List;

public class ModelData {
    private User activeUser;
    private boolean displayDeletedUserList;
    private List<User> users;

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
