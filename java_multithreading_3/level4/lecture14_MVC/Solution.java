package javarush.java_multithreading_3.level4.lecture14_MVC;

import javarush.java_multithreading_3.level4.lecture14_MVC.controller.Controller;
import javarush.java_multithreading_3.level4.lecture14_MVC.model.MainModel;
import javarush.java_multithreading_3.level4.lecture14_MVC.model.Model;
import javarush.java_multithreading_3.level4.lecture14_MVC.view.EditUserView;
import javarush.java_multithreading_3.level4.lecture14_MVC.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();
        EditUserView editUserView = new EditUserView();

        controller.setEditUserView(editUserView);
        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("Sidorov", 126L, 2);
        usersView.fireEventShowDeletedUsers();
    }
}