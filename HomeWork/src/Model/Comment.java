package Model;

public class Comment {

	public Comment(int id, int userId, int courseId, int lectureId,String comment) {
		this.id = id;
		this.userId = userId;
		this.courseId = courseId;
		this.lectureId = lectureId;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
	}

	public int getcourseId() {
		return courseId;
	}

	public void setcourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getlectureId() {
		return lectureId;
	}

	public void setlectureId(int lectureId) {
		this.lectureId = lectureId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	private int id;
	private int userId;
	private int courseId;
	private int lectureId;
	private String comment;

}
