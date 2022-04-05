package com.test;

import org.hibernate.Session;

import com.Util.HibernateUtil;
import com.instructor.Course;
import com.instructor.Instructor;
import com.instructor.InstructorDetail;
import com.instructor.Review;

public class GetCourseAndReview {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		System.out.println("Creating new Course and reviews");

		//create some courses
//		Course tempCourse1 = new Course("AP Computer science");
		
		int theId = 10;
		Course cr = session.get(Course.class, theId);
		
		System.out.println("Course details: "+ cr);
		System.out.println(cr.getReviews());
		

		
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Done!");
	}

}
