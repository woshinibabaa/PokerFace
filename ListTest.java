package xuanke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

/*
 * nmb
 */
public class ListTest {
	
	public List courseToSelect;
	
	public ListTest(){
		this.courseToSelect = new ArrayList();
	}
	
	
	public void addCoures(){
		Course cr1 = new Course("1", "C primer plus");
		courseToSelect.add(cr1);
		Course t = (Course) courseToSelect.get(0);
		System.out.println("add a course:"+t.id+" "+t.name);
		
		Course cr2 = new Course("2", "C++ primer plus");
		courseToSelect.add(0,cr2);
		t = (Course) courseToSelect.get(0);
		System.out.println("add a course:"+t.id+" "+t.name);
		
		Course [] arrCourse = {new Course("3", "java"),new Course("4", "Thinking java")};
		courseToSelect.addAll(Arrays.asList(arrCourse));
		t = (Course) courseToSelect.get(2);
		System.out.println("add a course:"+t.id+" "+t.name);		
		t = (Course) courseToSelect.get(3);		
		System.out.println("add a course:"+t.id+" "+t.name);
		
		Course [] arrCourse2 = {new Course("5", "Math"),new Course("6", "English")};
		courseToSelect.addAll(2, Arrays.asList(arrCourse2));
		t = (Course) courseToSelect.get(2);
		System.out.println("add a course:"+t.id+" "+t.name);		
		t = (Course) courseToSelect.get(3);		
		System.out.println("add a course:"+t.id+" "+t.name);
		
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
	
	public void changeCoures(){
		courseToSelect.set(4,new Course("7", "DeadEnd"));
	}
	
	public void delCoures(){
		courseToSelect.remove(0);
	}
	
	public static void main (String []args){
		ListTest t1 = new ListTest();
		t1.addCoures();
		System.out.println("--------------");
		t1.forEach();
		System.out.println("--------------");
		t1.changeCoures();
		t1.forEach();
		System.out.println("--------------");
		t1.delCoures();
		t1.forEach();
		
		
	}
	
}
