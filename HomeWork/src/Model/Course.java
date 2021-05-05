package Model;

public class Course {
	public Course() {}
	public Course(int id, User user, String course, int progress) {
		this.id = id;
		this.user = user;
		this.course = course;
		this.progress = progress;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public int getProgress() {
		return progress;
	}


	public void setProgress(int progress) {
		this.progress = progress;
	}


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	private int id;
	private User user;
	private String course;
	private int progress;
	
}
