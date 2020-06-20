package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = UserServiceImpl.getInstance();
        userService.createUsersTable();
        User user1 = new User("Ivan", "Ivanov", (byte) 30);
        User user2 = new User("Igor", "Petrov", (byte) 41);
        User user3 = new User("Sergei", "Sergeev", (byte) 15);
        User user4 = new User("Eugene", "Eugenov", (byte) 65);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем - "+user1.getName()+" добавлен в базу");
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем - "+user2.getName()+" добавлен в базу");
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем - "+user3.getName()+" добавлен в базу");
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем - "+user4.getName()+" добавлен в базу");
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
