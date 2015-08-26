package com.testritegroup.learning;

public class JavaStudent extends Student {
	public JavaStudent(String name, String skill) {
		super(name);
		this.setSkill(skill);
	}

	public String getName() {
		System.out.println("in overwrite method ");
		return super.getName();
	}

	public void codingJava() {
		System.out.println("I am Java");
	}
}
