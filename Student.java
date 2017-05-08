package xuanke;

import java.util.HashSet;
import java.util.Set;

/*
 * class of student
 */
public class Student {
	
	public String name;
	public String id;
	
	public Set<Course> courses;
	
	public Student(String name,String id){
		this.id = id;
		this.name = name;
		this.courses = new HashSet();
	}
}
