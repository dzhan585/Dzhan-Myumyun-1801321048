package uni.fmi.models;

import uni.fmi.services.GradeService;

public class GradesScreenModel {

	private String firstName;
	private String grade;
	private String message;

	public void navigateToMe() {
		
		System.out.println("The home page is opened");
		
	}

	public void enterSubject() {
		System.out.println("Teacher enters his subject");
		
	}

	public void enterStudent(String firstName) {
		this.firstName = firstName;
		
	}

	public void enterGrade(String grade) {
		this.grade = grade;
		
	}

	public void clickAddButton() {
		message = GradeService.grades(firstName, grade);
		
	}

	public String checkMessage() {
		
		return message;
	}
	

}
