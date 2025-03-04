package com.naveen.jobapp.repo;

import com.naveen.jobapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    // ArrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<>();

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }
}
