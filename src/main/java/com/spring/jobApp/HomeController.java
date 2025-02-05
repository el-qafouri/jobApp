package com.spring.jobApp;

import com.spring.jobApp.model.JobPost;
import com.spring.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(Model model) {
        model.addAttribute("JobPost", new JobPost());
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(@ModelAttribute("JobPost") JobPost jobPost, Model m) {
        m.addAttribute("jobPost", jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewJobs(Model model) {
        List<JobPost> jobs = service.getAllJobs();
        model.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

}
