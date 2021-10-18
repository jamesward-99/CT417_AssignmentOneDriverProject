/*	Driver Class
 *	Name: James Ward, ID: 18394566
 */
package CT417AssignmentOneDriverProject;

import CT417AssignmentOne.Student;
import CT417AssignmentOne.Module;
import CT417AssignmentOne.CourseProgramme;
import org.joda.time.LocalDate;

public class DriverClass {

	public static void main(String[] args) {
		Student s1 = new Student("James", 22, "06/08/1999", 18394566);
		Student s2 = new Student("Jim", 21, "22/10/2000", 19555199);
		Student s3 = new Student("Jack", 24, "08/02/1997", 17171843);
		Student s4 = new Student("Joey", 25, "30/03/1996", 16986662);
		
		Module m1 = new Module("CS101", "Software Development I");
		Module m2 = new Module("CE101", "Hardware Systems I");
		Module m3 = new Module("CS102", "Advanced Programming");
		Module m4 = new Module("CE102", "Introduction to Cybersecurity");
		
		CourseProgramme c1 = new CourseProgramme("Computer Science", new LocalDate(2021, 9, 6), new LocalDate(2022, 5, 11));
		CourseProgramme c2 = new CourseProgramme("Electronic & Computer Engineering", new LocalDate(2021, 9, 6), new LocalDate(2022, 5, 11));
		
		c1.addModule(m1);
		c1.addModule(m3);
		c2.addModule(m2);
		c2.addModule(m4);
		c1.addStudent(s1);
		c1.addStudent(s4);
		c2.addStudent(s2);
		c2.addStudent(s3);
		
		CourseProgramme[] courses = {c1, c2};
		
		for(CourseProgramme cp : courses) {
			cp.getModulesRegisteredFor().forEach(module -> System.out.println(module));
			cp.getStudent().forEach(student -> System.out.println(student));
		}
	}
}