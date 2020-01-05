package com.audittool.audito.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.audittool.audito.beans.DailyTask;
import com.audittool.audito.beans.TaskFilter;
import com.audittool.audito.data.TestData;
import com.audittool.audito.service.DailyTaskService;

@RestController
@RequestMapping("/dailyTask")
public class DailyTaskController {
	
	@Autowired
	TestData testdata;
	
	@Autowired
	DailyTaskService dailyTaskService;
	
	int taskId = 1;
	String taskGroup = "ADRIN-";

	@GetMapping("/user")
	public List<DailyTask> getDailyTaskUser(@RequestParam String userName) {
		if(null != userName && !userName.isEmpty()) {
			return dailyTaskService.dailyTaskwithUserName(userName);
		}
		return null;
	}
	
	@RequestMapping("/filter")
	public Collection<DailyTask> getDailyTaskFilter(@RequestBody(required=true) TaskFilter filter) {
		return testdata.getTaskList().values();
	}
	
	/*@GetMapping("/dailyTask/all")
	public Map<String, DailyTask> getAllDailyTask(@RequestParam(required=false) String count) {
		return testdata.getTaskList();
	}*/
	
	@PostMapping("/create")
	public String addDailyTask(@RequestBody DailyTask dailyTask) {
		if(null != dailyTask) {
			String taskidGen = taskGroup+(taskId++);
			dailyTask.setTaskId(taskidGen);
			System.out.println("Creating task:"+taskidGen);
			testdata.getTaskList().put(taskidGen, dailyTask);
			return "Success";
		}
		return "Failure";
	}
	
	@PostMapping("/")
	public DailyTask readDailyTask(@RequestParam String dailyTaskId) {
		if(null != dailyTaskId) {
			System.out.println("Reading task:"+dailyTaskId);
			return testdata.getTaskList().get(dailyTaskId);
		}
		return null;
	}
	
	@PostMapping("/update")
	public String updateDailyTask(@RequestBody DailyTask dailyTask) {
		if(null != dailyTask) {
			System.out.println("Updating task:"+dailyTask.getTaskId());
			testdata.getTaskList().put(dailyTask.getTaskId(), dailyTask);
			return "Success";
		}
		return "Failure";
	}
	
	@PostMapping("/delete")
	public String deleteDailyTask(@RequestParam String dailyTaskId) {
		if(null != dailyTaskId) {
			System.out.println("Updating task:"+dailyTaskId);
			testdata.getTaskList().remove(dailyTaskId);
			return "Success";
		}
		return "Failure";
	}
}
