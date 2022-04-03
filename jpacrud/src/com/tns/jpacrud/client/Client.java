package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) {
//CRUD operation calling activity
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
// Create Operation
		student.setStudentId(100);
		student.setName("Prashant");
		service.addStudent(student);
		
// Retrieve Operation
		student = service.findStudentById(100);
		System.out.print("ID:" + student.getStudentId());
		System.out.println(" Name:" + student.getName());
		
// Update Operation
		student = service.findStudentById(100);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		
//at this breakpoint, we have updated record added in first section
		//updated operation
		student = service.findStudentById(100);
		System.out.print("ID:" + student.getStudentId());
		System.out.println(" Name:" + student.getName());
		
		
		
//at this breakpoint, record is removed from table
// Delete Operation
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("Row Removed");
	}
}