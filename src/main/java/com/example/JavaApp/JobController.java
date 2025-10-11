package com.example.JavaApp;

import com.example.JavaApp.model.JobPost;

import com.example.JavaApp.service.JobService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    //By default @request mapping is Get HTTP method.
    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    //1. here the handleForm is action mentioned in addjob which is called when a submit a request to post job details.
    //2. here when we hit submit to form and it's action request is post method to /handleForm uri, therefore using annotation @PostMapping.
    @PostMapping("handleForm")
    public String handleForm(@NonNull final JobPost jobPost) {
        jobService.addJob(jobPost);
        return "success";
    }
}
