package com.project.services;

import com.project.dao.ApplicationDao;
import com.project.model.Application;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ApplicationService {
    private ApplicationDao applicationDao;

    public Application getById(int id) {
        return applicationDao.findById(id).get();
    }
    public List<Application> findAll() {
        return applicationDao.findAll();
    }

   public Application save(Application application) {
        return applicationDao.save(application);
   }

    public Application updateJob(Application application) {

        return applicationDao.save(application);
    }

    public void deleteJob(int id) {
      applicationDao.deleteById(id);
    }

    public void deleteAllJob() {
        applicationDao.deleteAll();
    }
}
