package com.testritegroup.learning;

public class PhpStudent extends Student {
	public PhpStudent(String name, String skill) {
		super(name);
		this.setSkill(skill);
	}

	public String getName() {
		System.out.println("in overwrite method ");
		return super.getName();
	}

	public void codingPhp() {
		System.out.println("I am Php");
	}
}
