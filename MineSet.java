package xuanke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MineSet {
	
	public List<Course> courseToSelect;
	
	public MineSet(){
		courseToSelect = new ArrayList<Course>();
	}
	
	public void addCoures(){
		Course cr1 = new Course("1", "C primer plus");
		courseToSelect.add(cr1);
		Course t = (Course) courseToSelect.get(0);
		//System.out.println("add a course:"+t.id+" "+t.name);
		
		Course cr2 = new Course("2", "C++ primer plus");
		courseToSelect.add(0,cr2);
		t = (Course) courseToSelect.get(0);
		//System.out.println("add a course:"+t.id+" "+t.name);
		
		Course [] arrCourse = {new Course("3", "java"),new Course("4", "Thinking java")};
		courseToSelect.addAll(Arrays.asList(arrCourse));
		t = (Course) courseToSelect.get(2);
	//	System.out.println("add a course:"+t.id+" "+t.name);		
		t = (Course) courseToSelect.get(3);		
		//System.out.println("add a course:"+t.id+" "+t.name);
		
		Course [] arrCourse2 = {new Course("5", "Math"),new Course("6", "English")};
		courseToSelect.addAll(2, Arrays.asList(arrCourse2));
		t = (Course) courseToSelect.get(2);
		//System.out.println("add a course:"+t.id+" "+t.name);		
		t = (Course) courseToSelect.get(3);		
		//System.out.println("add a course:"+t.id+" "+t.name);
		
	}
	
	public void forEach(){
		Iterator it  =  courseToSelect.iterator();
		System.out.println("This is Coures list by iteartor");
		// while 
		/*while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("Course"+ cr.id+" "+cr.name);
		}
		*/
		for (Object obj :courseToSelect ) {
			Course cr = (Course)obj;
			System.out.println("Course"+ cr.id+" "+cr.name);
		}		
	}
	
	public void forEachCoures(Student stu){
		
		for (Course cr : stu.courses) {
			System.out.println("you chose"+ cr.id+ " "+cr.name);
		}
	}
	
	/**
	 * LIST 的contains 
	 * @param args
	 */
	public void listContains(){
		Course course = courseToSelect.get(0);
		System.out.println("取得"+course.name);
		System.out.println("是否包含 "+course.name+"，"+courseToSelect.contains(course));
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MineSet m1 = new MineSet();
		m1.addCoures();
		m1.listContains();
		
		/*		 		
		m1.forEach();
		// new student
		Student  stu = new Student("hydra", "1");
		System.out.println("welcome: "+stu.name);
		// new Scanner
		Scanner console = new Scanner(System.in);
		
		
		for(int i =0 ; i<3;i++){
			System.out.println("Course id pls :");
			String inId = console.next();
			for (Course cr : m1.courseToSelect) {
				if(cr.id.equals(inId)){
					stu.courses.add(cr);
				}
			}
		}
		System.out.println(stu.courses.size()+" Coures you chosed");
		m1.forEachCoures(stu);
		*/
		
		
	}

}
