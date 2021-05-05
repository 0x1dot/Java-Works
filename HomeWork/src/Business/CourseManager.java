package Business;
import Model.Course;
import Model.User;

public class CourseManager {
    public Course addCourse(int id, String courseName, User user, int percentage) {
        Course course = new Course();
        course.setId(id);
        course.setCourse(courseName);
        course.setUser(user);
        course.setProgress(percentage);
        return course;
    }

    public void listCourses(Course[] courses) {
        for (Course course : courses) {
            System.out.println(course.getCourse());
        }
    }
}
