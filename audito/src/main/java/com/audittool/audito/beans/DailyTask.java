package com.audittool.audito.beans;

import java.security.Timestamp;
import java.util.Date;

public class DailyTask {

	private String taskName;
	private String taskId;
	private String assignee;
	private String reporter;
	private String label;
	private Date date;
	private Date startTime;
	private Date endTime;
	private String clientName;
	private String description;
	private String location;
	private String status;
	private String statusPct;
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusPct() {
		return statusPct;
	}
	public void setStatusPct(String statusPct) {
		this.statusPct = statusPct;
	}
	
	@Override
	public String toString() {
		return "DailyTask [taskName=" + taskName + ", taskId=" + taskId + ", assignee=" + assignee + ", reporter="
				+ reporter + ", label=" + label + ", date=" + date + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", clientName=" + clientName + ", description=" + description + ", location=" + location + ", status="
				+ status + ", statusPct=" + statusPct + "]";
	}
	
}
