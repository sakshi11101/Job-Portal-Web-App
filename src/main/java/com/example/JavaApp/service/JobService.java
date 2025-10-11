package com.example.JavaApp.service;

import com.example.JavaApp.model.JobPost;
import com.example.JavaApp.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobrepo;

    public void addJob(JobPost jobPost) {
        jobrepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobrepo.getAllJobs();
    }
}
