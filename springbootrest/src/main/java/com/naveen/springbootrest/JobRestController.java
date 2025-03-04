package com.naveen.springbootrest;

import com.naveen.springbootrest.model.JobPost;
import com.naveen.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping(value = "jobPosts", produces = "application/json")
    @ResponseBody //by default it thinks that returning is jsp page to override that we use reponseBody say it return json type response data.
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping(value = "jobPost",consumes = "application/json")
    public JobPost addPost(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        return jobPost;
    }

    @PutMapping("jobPost")
    public String updatePost(@RequestBody JobPost jobPost){
            jobService.updateJob(jobPost);
            return "Job Post Added";
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int jobId){
        jobService.deleteJob(jobId);
        return "Deleted";
    }
}
