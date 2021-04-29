package homework;

public class StudentManager extends UserManager {
public void doHomework(Student student) {
	System.out.println("ödev yapýldý: "+student.homework);
}
public void attendance(Student student) {
	if(student.giveAttendance==true) {
		System.out.println("yoklama verildi");
	}
	else { 
		System.out.println("yoklama verilemedi");
	}
}
}
