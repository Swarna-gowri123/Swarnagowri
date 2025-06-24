package com.example.student;
import java.sql.*;
import java.util.*;

	public class StudentDAO 
	{
	    Connection conn = DBConnection.getConnection();

	    public void addStudents(Students s) 
	    {
	    	String sql = "INSERT INTO students(id,name, age, grade) VALUES (?,?, ?, ?)";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) 
	        {
	        	stmt.setInt(1,s.getId());
	        	stmt.setString(2, s.getName());
	            stmt.setInt(3, s.getAge());
	            stmt.setString(4, s.getGrade());
	            stmt.executeUpdate();
	            System.out.println("Student added successfully!");
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }

	    
	    
public List<Students> getAllStudents()
	    {
	        List<Students> list = new ArrayList<>();
	        String sql = "SELECT * FROM students";
	        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql))
	        {
	            while (rs.next()) 
	            {
	                Students s = new Students();
	                s.setId(rs.getInt("id"));
	                s.setName(rs.getString("name"));
	                s.setAge(rs.getInt("age"));
	                s.setGrade(rs.getString("grade"));
	                list.add(s);
	            }
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        return list;
	    }

	  
	    
public void updateStudents(Students s) 
	    {
	        String sql = "UPDATE students SET name=?, age=?, grade=? WHERE id=?";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) 
	        {
	            stmt.setString(1, s.getName());
	            stmt.setInt(2, s.getAge());
	            stmt.setString(3, s.getGrade());
	            stmt.setInt(4, s.getId());
	            stmt.executeUpdate();
	            System.out.println("Student updated successfully!");
	        }
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }

	    
	    
 public void deleteStudents(int id) 
	    {
	        String sql = "DELETE FROM students WHERE id=?";
	        try (PreparedStatement stmt = conn.prepareStatement(sql)) 
	        {
	            stmt.setInt(1, id);
	            stmt.executeUpdate();
	            System.out.println("Student deleted successfully!");
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	}


