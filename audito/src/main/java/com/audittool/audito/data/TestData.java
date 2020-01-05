package com.audittool.audito.data;

import java.security.Timestamp;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.audittool.audito.beans.DailyTask;

@Component
public class TestData implements CommandLineRunner {
	
	private Map<String, DailyTask> taskList = new HashMap<String, DailyTask>();
	
	public Map<String, DailyTask> getTaskList() {
		return taskList;
	}

	public void setTaskList(Map<String, DailyTask> taskList) {
		this.taskList = taskList;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("inside..");
		Map<String, DailyTask> taskList = new HashMap<String, DailyTask>();
		DailyTask dailyTask = new DailyTask();
		dailyTask.setAssignee("Raj");
		dailyTask.setClientName("Synergy");
		dailyTask.setLabel("Sprint-1");
		dailyTask.setDate(new Date(System.currentTimeMillis()));
		dailyTask.setStartTime(new Date(System.currentTimeMillis()));
		dailyTask.setEndTime(new Date(System.currentTimeMillis()+604800000));
		dailyTask.setDescription("TDS Filing Q2 for sysnergy system");
		dailyTask.setReporter("Faisal");
		dailyTask.setLocation("Synergy");
		dailyTask.setStatus("In Progress");
		dailyTask.setStatusPct("60");
		dailyTask.setTaskId("ADRIN-1");
		dailyTask.setTaskName("TDS Filing Q2");
		
		taskList.put(dailyTask.getTaskId(), dailyTask);;
		this.taskList = taskList;
	}

}
