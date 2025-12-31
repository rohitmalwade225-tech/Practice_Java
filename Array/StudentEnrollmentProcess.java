package Lambda.Practice_Java.Array;

import java.util.Iterator;
import java.util.Scanner;

record Course(Integer id, String name, Double fee)
{
	
}

record Offer(String offerText)
{
	
}

record EducationlInstitute(Course[] courses,Offer[] offer) {
	public void  enrollStudentInCourse(int courseId, String studentName)
	{
		for(Course c : courses)
		{
			if(courseId==c.id())
			{
				System.out.println(studentName+" entrolled in: "+c.name());
				return;
			}
		}
		System.out.println("Course with ID "+courseId+" not found");
	}
}

record Students(String name, EducationlInstitute institute)
{
	public void viewCoursesAndFees()
	{
		Course[] courses = institute.courses();
		for (Course course : courses) {
			System.out.println(course);
		}

	}
	
	public void viewOffers()
	
	{
		Offer[] offer = institute.offer();
				for(Offer offer1 : offer)
				{
					System.out.println(offer);
				}
	}
	
	public void enrollnCourse(Integer courseID)
	{
		institute.enrollStudentInCourse(courseID, name);
	}
}


public class StudentEnrollmentProcess {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		String studentName=sc.next();
		  Course [] courses= {
				  new Course(1, "Java", 35000D),
				  new Course(2, ".Net ", 30000D),
				  new Course(3, "Python", 32000D)
		  };
		  
		  Offer [] offers= {
				  new Offer("Special discount: Get 20% off on all courses!"),
				  new Offer("Limited time offer: Enroll in any two courses and get one course free!")
		  };
		EducationlInstitute ed=new EducationlInstitute(courses, offers);
		
		Students student = new Students(studentName, ed);
		student.viewCoursesAndFees();
		student.viewOffers();
		System.out.println("Enter courseId to entole");
		int Student=sc.nextInt();
		student.enrollnCourse(Student);
		
	}

}
 