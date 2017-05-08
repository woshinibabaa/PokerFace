package xuanke;

import java.util.ArrayList;
import java.util.List;

public final class Generic {
	/*
	 * 
	 */
	public List<Course> courese;
	
	public Generic(){
		this.courese = new ArrayList<Course>();
	}
	
	/*
	 * test add
	 */
	public void add(){
		Course cr = new Course("1", "Chinese");
		courese.add(cr);
		
	// 	courese.add("fuckyou");  can't add
		
		Course cr2 = new Course("2", "Basic Java");
		courese.add(cr2);
	}
	
	public void forEach(){
		for (Course cr : courese) {
			System.out.println(cr.id +" "+cr.name);
		}
	}
	
	public void addChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "ChildOO";
		courese.add(ccr);
	}
	
	public void basicType(){
		List <Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("basicType is "+list.get(0));
	}
	 
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Generic t = new Generic();
		t.add();
		t.addChild();
		t.forEach();
		t.basicType();
	}

}
