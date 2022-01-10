package com.msa5.Customer.entity;

public class Customer {

	//id, name, gender , age , preferredFood(veg or nonveg)
	private int id;
	private String name;
	private String gender;
	private int age;
	private String prefferedFood;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String gender, int age, String prefferedFood) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.prefferedFood = prefferedFood;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrefferedFood() {
		return prefferedFood;
	}

	public void setPrefferedFood(String prefferedFood) {
		this.prefferedFood = prefferedFood;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", prefferedFood="
				+ prefferedFood + "]";
	}
	
}
