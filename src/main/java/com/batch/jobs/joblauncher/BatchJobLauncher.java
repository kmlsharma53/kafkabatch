package com.batch.jobs.joblauncher;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;


public class BatchJobLauncher extends QuartzJobBean{


	static final String JOB_NAME = "jobName";

	private static Log log = LogFactory.getLog(BatchJobLauncher.class);

	private JobLocator jobLocator;

	private JobLauncher jobLauncher;


	public void setJobLocator(JobLocator jobLocator) {
		this.jobLocator = jobLocator;
	}


	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) {
		Map<String, Object> jobDataMap = context.getMergedJobDataMap();
		String jobName = (String) jobDataMap.get(JOB_NAME);
		log.info("Quartz trigger firing with Spring Batch jobName="+jobName);
		JobParameters jobParameters = getJobParametersFromJobMap(jobDataMap);
		try {
			jobLauncher.run(jobLocator.getJob(jobName), jobParameters);
		}
		catch (JobExecutionException e) {
			log.error("Could not execute job.", e);
		}
	}


	private JobParameters getJobParametersFromJobMap(Map<String, Object> jobDataMap) {
		JobParametersBuilder builder = new JobParametersBuilder();
		for (Entry<String, Object> entry : jobDataMap.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			if (value instanceof String && !key.equals(JOB_NAME)) {
				builder.addString(key, (String) value);
			}
			else if (value instanceof Float || value instanceof Double) {
				builder.addDouble(key, ((Number) value).doubleValue());
			}
			else if (value instanceof Integer || value instanceof Long) {
				builder.addLong(key, ((Number)value).longValue());
			}
			else if (value instanceof Date) {
				builder.addDate(key, (Date) value);
			}
		}
		return builder.toJobParameters();
	}
}
