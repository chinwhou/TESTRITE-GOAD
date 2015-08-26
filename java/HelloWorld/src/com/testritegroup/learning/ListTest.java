package com.testritegroup.learning;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<Student>(); //<限定list存放的型別>
		
		for(int i=0; i<10 ; i++){
			Student student = new Student(" Name "+ i);
			students.add(student);
			//students.add(new String("test"));
			try {
				student.setAge(i+5);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		students.remove(5);
		students.add(5,new Student("new Member"));
		Student student5 = students.get(5);
		try {
			student5.setAge(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total students count:"+students.size());
		System.out.println("Student 6:"+students.get(5));	
	    int no = 1;
	    for(Student student:students){
	    	System.out.println(no+" "+student.getName()+" age:"+ student.getAge());
	    	no++;
	    }

	    int count = students.size();
	    for(int i = 0;i< count; i++){
	    	Student student = students.get(i);
	    	System.out.println(no+" "+student.getName()+" age:"+ student.getAge());
	    }
	    System.out.println("Total students count:"+students.size());		
	}

}
