package com.testritegroup.learning;

public class HelloWorld {

	public void runJob(Student st) {

		//System.out.println("Running Job" + st.getName() + st.getAge());

	}

	/*
	 * say hello
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("Hello World OLD Max " + args[0]);
		} else {

			for (int j = 0; j < 10; j++) {

				System.out.println("Hello World  Max");
				
				Student javastudent = new JavaStudent("Max", "Java");
				Student student = new Student("max");
				try {
					student.setGender(j);
					student.setAge(1000);
				} catch (ECException ec) {
					// TODO Auto-generated catch block
					System.out.println(ec.getECExceptionMessage());
					//e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					if(e instanceof ECException){ //介紹型別的轉換
						ECException ece = (ECException) e;
						System.out.println(ece.getECExceptionMessage());
					}
					e.printStackTrace();
				}finally{
					//不管對錯都要執行這裡
					System.out.println("finally ....");
				}
				//javastudent.setAge(42);
				System.out.println(javastudent.getName());
				//student.codingJava();
				
				PhpStudent phpStudent = new PhpStudent("Max", "Php");
				phpStudent.codingPhp();
				
				Computer com = new Laptop();
				System.out.println("GET A Computer:"+com.doSomething());
			}

		}
	}

}
