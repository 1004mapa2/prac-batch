package org.park.firstbatch.jobs;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
@RequiredArgsConstructor
public class ScheduleJob {

    private final Job pracJob;
    private final JobLauncher jobLauncher;

//    @Scheduled(cron = "*/2 * * * * *")
    public void executeBusJob() {
        Date now = new Date();
        JobParameters jobParameters = new JobParametersBuilder().addDate("date", now).toJobParameters();

        try {
            jobLauncher.run(pracJob, jobParameters);
        }catch (Exception e) {
        }
    }
}
