package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.PageBean;
import domain.User;
import service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private final UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.deleteUser(Integer.parseInt(id));
    }

    @Override
    public void delSelectedUser(String[] uids) {
        if (uids != null && uids.length > 0) {
            for (String uid : uids) {
                dao.deleteUser(Integer.parseInt(uid));
            }
        }
    }

    @Override
    public User findUserById(String id) {
        return dao.findUserById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        PageBean<User> pb = new PageBean<User>();
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);


        //调用dao查询总记录数
        int totalCount = dao.findTotalCount(condition);
        //计算总页码
        int totalPage = (totalCount % rows == 0) ? (totalCount / rows) : (totalCount / rows + 1);
        if (currentPage <= 0) {
            currentPage = 1;
        }
//        if (currentPage >= totalPage) {
//            currentPage = totalPage;
//        }
        //调用dao查询list集合
        //计算开始的记录索引
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start, rows, condition);
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);
        pb.setTotalPage(totalPage);
        pb.setList(list);
        pb.setTotalCount(totalCount);
        return pb;
    }

}
