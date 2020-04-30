package com.muke.sell.DaoRepository;

import com.muke.sell.DAO.User;

import java.util.List;

public interface UserRs {

    //根据用户名查询用户
    public User querryBy_name(String name);

    //查询出已成年的用户
    public List<User> get_adult();

    //根据性别查询用户
    public List<User> querryBy_sex(String sex);

    //查询出所有用户
    public List<User> get_AllUser();
}
