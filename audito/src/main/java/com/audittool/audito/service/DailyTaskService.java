package com.audittool.audito.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audittool.audito.beans.DailyTask;
import com.audittool.audito.data.TestData;

@Service
public class DailyTaskService {
	
	@Autowired
	TestData testData;

	public List<DailyTask> dailyTaskwithUserName(String userName){
		List<DailyTask> dailyTaskList = new ArrayList<DailyTask>();
		
		for (DailyTask dailyTask : testData.getTaskList().values()) {
			if(userName.equals(dailyTask.getAssignee())) {
				dailyTaskList.add(dailyTask);
			}
		}
		return dailyTaskList;
	}
}
