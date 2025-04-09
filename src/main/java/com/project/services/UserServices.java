package com.project.services;

import com.project.dao.UserDao;
import com.project.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Service
public class UserServices {
    private UserDao userDao;

   public User save(User user) {
       user.setCreatedAt(LocalDateTime.now());
       return userDao.save(user);
   }

   public List<User> findAll() {

       return userDao.findAll();
   }

   public User update(User user) {
       user.setUpdatedAt(LocalDateTime.now());
       return userDao.save(user);
   }

   public void delete(int id) {
       userDao.deleteById(id);
   }

   public User findById(int id) {
       return userDao.findById(id).get();
   }

   public void deleteAll() {
       userDao.deleteAll();
   }
}
