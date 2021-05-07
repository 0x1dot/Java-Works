import Business.CommentManager;
import Business.CourseManager;
import Business.UserManager;
import Model.Comment;
import Model.Course;
import Model.User;

public class Main {

	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();
        UserManager userManager = new UserManager();
        CommentManager commentManager = new CommentManager();
        
        User educator = userManager.addUsers(1, "Engin", "DEMIRO�");
        User student = userManager.addUsers(2, "Murat", "DURSUN");

        Course course1 = courseManager.addCourse(1
                , "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", educator, 36);
        Course course2 = courseManager.addCourse(2
                , "Yaz�l�m Geli�tirici Yetiştirme Kampı (C# + ANGULAR)", educator, 5);

        Comment  comment1 = commentManager.addComment(1, student.getId(), course1.getId(), 3, "Tebrikler.");
        Comment  comment2 = commentManager.addComment(1, student.getId(), course2.getId(), 4, "github.com/0x1dot");
        
        Course[] courses = {course1, course2};
        Comment[] comments = {comment1, comment2};
        
        courseManager.listCourses(courses);
        commentManager.listCourses(comments);
	}

}
