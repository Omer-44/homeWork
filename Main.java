package homework;

public class Main {

	public static void main(String[] args) {
	Student student=new Student();
	StudentManager manager=new StudentManager();
	
student.email="omer@gmail.com";
student.password="123456789";
student.homework="veri yapıları";
student.giveAttendance=true;
manager.login(student);
manager.attendance(student);
manager.doHomework(student);
}
}
