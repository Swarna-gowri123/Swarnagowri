package com.example.student;

public class Students 
{
    private int id;
    private String name;
    private int age;
    private String grade;

    public Students(int id, String name, int age, String grade)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Students() {} 

    
    public int getId() 
    { 
    	return id; 
    	}
    public String getName() 
    { 
    	return name;
    	}
    public int getAge() 
    { 
    	return age;
    	}
    public String getGrade() 
    { 
    	return grade;
    	}

    
    public void setId(int id) 
    {
    	this.id = id; 
    	}
    public void setName(String name) 
    {
    	this.name = name;
    }
    public void setAge(int age) 
    {
    	this.age = age;
    	}
    public void setGrade(String grade)
    {
    	this.grade = grade;
    	}
}
