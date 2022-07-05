package dao;

import domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void addUser(User user);

    void deleteUser(int id);

    User findUserById(int id);

    void updateUser(User user);

    int findTotalCount(Map<String, String[]> condition);

    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}
