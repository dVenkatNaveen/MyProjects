package com.naveen.jobapp;

import com.naveen.jobapp.model.JobPost;
import com.naveen.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobPosts=jobService.getAllJobs();
        m.addAttribute("jobPosts",jobPosts);
        return "viewalljobs";
    }
}
