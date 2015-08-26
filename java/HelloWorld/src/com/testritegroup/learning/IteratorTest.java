package com.testritegroup.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorTest {

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
		//list collection Iterator <== 指標的用法
		Iterator<Student> it = students.iterator();
		while(it.hasNext()){
			Student student = it.next();
			System.out.println(student.getName()+" age:"+ student.getAge());
		}
		
	}

}
