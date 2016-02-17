package com.lz.dao.imp;

import com.lz.dao.UserDao;
import com.lz.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Maven on 2016/2/17.
 */
@Repository("userDao")
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public User load(String id) {
        return (User) this.getCurrentSession().load(User.class, id);
    }

    @Override
    public User get(String id) {
        return (User) this.getCurrentSession().get(User.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findAll() {
        List<User> acctUsers = this.getCurrentSession().createQuery("from User").setCacheable(true).list();
        return acctUsers;
    }

    @Override
    public void persist(User entity) {
        this.getCurrentSession().persist(entity);
    }

    @Override
    public String save(User entity) {
        return (String) this.getCurrentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(User entity) {
        this.getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(String id) {
        User entity = this.load(id);
        this.getCurrentSession().delete(entity);
    }

    @Override
    public void flush() {
        this.getCurrentSession().flush();
    }
}
