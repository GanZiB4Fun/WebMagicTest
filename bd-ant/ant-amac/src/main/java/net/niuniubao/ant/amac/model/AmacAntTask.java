package net.niuniubao.ant.amac.model;

/**
 * 任务处理记录
 */
public class AmacAntTask  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;


	private Long taskId; //taskId
	private Long taskHtmlId; //taskHtmlId
	private java.util.Date taskCreateTime; //taskCreateTime
	private java.util.Date taskFinishTime; //taskFinishTime
	private Integer taskStatus; //taskStatus
	private String taskType; //taskType

	public void setTaskId(Long value) {
		this.taskId = value;
	}
	
	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskHtmlId(Long value) {
		this.taskHtmlId = value;
	}
	
	public Long getTaskHtmlId() {
		return this.taskHtmlId;
	}

	public void setTaskCreateTime(java.util.Date value) {
		this.taskCreateTime = value;
	}
	
	public java.util.Date getTaskCreateTime() {
		return this.taskCreateTime;
	}

	public void setTaskFinishTime(java.util.Date value) {
		this.taskFinishTime = value;
	}
	
	public java.util.Date getTaskFinishTime() {
		return this.taskFinishTime;
	}

	public void setTaskStatus(Integer value) {
		this.taskStatus = value;
	}
	
	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskType(String value) {
		this.taskType = value;
	}
	
	public String getTaskType() {
		return this.taskType;
	}

}

