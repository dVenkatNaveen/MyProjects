package com.naveen.springbootrest.repo;

import com.naveen.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    // ArrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<>();

    // Constructor to initialize dummy jobs
    public JobRepo() {
        jobs.add(new JobPost(1, "Software Engineer", "Develop and maintain software applications", 2, List.of("Java", "Spring Boot", "MySQL")));
        jobs.add(new JobPost(2, "Frontend Developer", "Design and implement user interfaces", 3, List.of("Angular", "TypeScript", "HTML", "CSS")));
        jobs.add(new JobPost(3, "Data Scientist", "Analyze data and build predictive models", 4, List.of("Python", "Machine Learning", "TensorFlow")));
        jobs.add(new JobPost(4, "DevOps Engineer", "Automate deployment and manage cloud infrastructure", 5, List.of("Docker", "Kubernetes", "AWS", "Terraform")));
        jobs.add(new JobPost(5, "Cybersecurity Analyst", "Monitor and secure IT systems", 3, List.of("Network Security", "Penetration Testing", "SIEM")));
    }
    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJob(int postId) {
       for(JobPost jobPost:jobs){
           if(jobPost.getPostId()==postId){
               return jobPost;
           }
       }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1:jobs){
            if(jobPost1.getPostId()==jobPost.getPostId()){
                jobPost1.setPostId(jobPost.getPostId());
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int jobId) {
        for(JobPost jobPost:jobs){
            if(jobPost.getPostId()==jobId){
               jobs.remove(jobPost);
            }
        }
    }
}
