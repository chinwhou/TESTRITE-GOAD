package com.testritegroup.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> studentsMap = new HashMap<String,Student>(); //<限定list存放的型別>
		
		for(int i=0; i<10 ; i++){
			Student student = new Student("Name"+ i);
			//students.add(new String("test"));
			try {
				student.setAge(i+5);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			studentsMap.put(student.getName(), student);
		}
		Student student = studentsMap.get("Name3");
		System.out.println(student.getName()+" age:"+student.getAge());
	}

}
