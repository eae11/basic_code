package service;

import domain.PageBean;
import domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    /*
        查询所有用户信息
         */
    List<User> findAll();

    User login(User user);

    void addUser(User user);

    void deleteUser(String id);

    void delSelectedUser(String[] uids);

    User findUserById(String id);

    void updateUser(User user);

    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
