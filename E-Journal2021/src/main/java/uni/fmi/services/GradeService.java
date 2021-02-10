package uni.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.Student;

public class GradeService {

	public static String grades(String firstName, String grade) {
		
		List<Student> studentList = GetStudent();
		
		if(firstName.isEmpty()) {
			return "Empty name. Please insert student's name";
		}
		if(grade.isEmpty()) {
			return "The grade is empty.Please enter a grade between 2 and 6";
		}
		int gradeNumber = Integer.parseInt(grade);
		if(gradeNumber > 6) {
			return "The grade is bigger than 6.Please enter a grade between 2 and 6";
		}
		if (gradeNumber < 2) {
			return "The grade is smaller than 2.Please enter a grade between 2 and 6";
		}
		boolean checkStudent = studentList.stream().anyMatch(student ->
        									student.getFirstName().equals(firstName) );
		return "Added successfully";
		
	}
	 public static List<Student> GetStudent(){
	        Student student = new Student();
	        student.setFirstName("Teodor");
	        List<Student> studentList = new ArrayList<Student>();
	        studentList.add(student);
	        return studentList;
	 }
}
