package homework;

public class InstructorManager extends UserManager{
public void addRecord(Instructor instructor) {
	System.out.println("kay�t eklendi: "+instructor.record);
}
public void Attendance(Instructor instructor) {
	if(instructor.takeAttendance==true) {
		System.out.println("yoklama al�nd�.");
	}
	else {
		System.out.println("yoklama al�nmad�");
	}
}
}
