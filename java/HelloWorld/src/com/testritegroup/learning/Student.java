package com.testritegroup.learning;

//plain object pure Object POPO
//標準的 java bin 
public class Student {
	// contructor
	// 可以存在很多contructor
    
	public Student(String initName) {
		this.name = initName;
	}
    static final int bornCount = 206; //static不用new, final不能被更改
	
    static public int getBornCount(){
    	return bornCount;
    }
    
    //封裝設定的變數值 好處可以很清楚的知道 也不用去找設計文件
    public static final int STUDENT_GENDER_MALE = 1;
    public static final int STUDENT_GENDER_FEMALE = 0;
    
    private int gender;
    
    public void setGender(int gender) throws ECException{
    	if(gender != STUDENT_GENDER_MALE && gender != STUDENT_GENDER_FEMALE){
    		throw new ECException("EC001","IT_ERROR "," Illegal gender value"+gender);
    	}
    	this.gender = gender;
    }
    
    private String name;
	private int age;
	private String skill;

	// Method
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		if(age > 150){
			throw new Exception("too old!");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
}
