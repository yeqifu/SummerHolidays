package Example0629;

public class Work {
	private String workTime;
	private String workContent;
	
	public Work(String workTime, String workContent) {
		super();
		this.workTime = workTime;
		this.workContent = workContent;
	}
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public String getWorkContent() {
		return workContent;
	}
	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}
	
}
