package com.test;

import org.hibernate.Session;

import com.Util.HibernateUtil;
import com.instructor.Course;
import com.instructor.Instructor;
import com.instructor.InstructorDetail;
import com.instructor.Review;

public class CreateCourseAndReview {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		System.out.println("Creating new Course and reviews");

		//create some courses
//		Course tempCourse1 = new Course("AP Computer science");
		
		Course cr = new Course("AP Computer science");
		cr.addReview(new Review("Wow simple wow Great course.. love it!"));
		cr.addReview(new Review("Hmm Cool course, could be better"));
		cr.addReview(new Review("Whaaaat the course all about"));
		
		System.out.println("saving the course: "+cr);
		System.out.println(cr.getReviews());
		
		session.save(cr);
		

		
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Done!");
	}

}
