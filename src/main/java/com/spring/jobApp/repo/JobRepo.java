package com.spring.jobApp.repo;

import com.spring.jobApp.model.JobPost;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, null, "text", 2, null),
            new JobPost(2, null, "text", 2, null)
    ));

    public void addJob(JobPost job) {
        jobs.add(job);
    }

    public List<JobPost> getAllJobs() {
        return jobs;
    }
}
