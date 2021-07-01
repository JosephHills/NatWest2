package com.qa.personTask;

public class Person {

	public Person(String name, int age, String jobtitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle; 
		}

	
	
	
	
		@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobtitle=" + jobtitle + "]";
	}





		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

		private String name;
		private int age;
		private String jobtitle;

	}


