package Business;
import Model.Comment;

public class CommentManager {
	public Comment addComment(int id, int userId, int courseId, int lectureId, String coment) {
		Comment comment = new Comment(id,userId,courseId,lectureId,coment);
		return comment;
	}

	public void listCourses(Comment[] comments) {
		for (Comment comment : comments) {
			System.out.println(comment.getComment());
		}
	}
}
