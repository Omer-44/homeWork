package homework;

public class InstructorManager extends UserManager{
public void addRecord(Instructor instructor) {
	System.out.println("kayýt eklendi: "+instructor.record);
}
public void Attendance(Instructor instructor) {
	if(instructor.takeAttendance==true) {
		System.out.println("yoklama alýndý.");
	}
	else {
		System.out.println("yoklama alýnmadý");
	}
}
}
