package xuanke;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MineMap {
	
	public Map<String,Student> students;
	
	public MineMap(){
		this.students = new HashMap<String,Student>();
	}
	
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("输入学生ID");
			String ID = console.next();
			// 被占用否？
			Student  st = students.get(ID);
			if(st == null){
				System.out.println("输入名字");
				String name = console.next();
				Student newStu = new Student(name,ID);
				students.put(ID, newStu);
				System.out.println("成功添加学生"+students.get(ID).name);
				i++;				
			}else{
				System.out.println("被占用！");
				continue;
			}
		}
	}
	
	public void testMapKeySet(){
		//keySet 返回map中所有键的集合？？？？？
		Set<String> keySet = students.keySet();
		
		System.out.println("有 "+students.size()+"个学生");
		
		//遍历 keySet
		for (String stuId : keySet) {
			Student st = students.get(stuId);
			if(st != null)
				System.out.println("学生: "+st.name);
		}
	}
	
	public void removeStu(){
		System.out.println("输入要删除的ID");		
		Scanner console = new Scanner(System.in);
		String ID = console.next();
		while(true){
			// 判断是否有学生对象;
			Student st = students.get(ID);
			if(st == null){
				System.out.println("ID 不存在");
				continue;
			}
			students.remove(ID);
			System.out.println("已被删除"+ st.name);
			break;
		}
	}
	
	//enteySet 遍历Map
	public void testEntrySet(){
		// 返回的是所有键值对;
		Set<Entry<String,Student>> entrySet = students.entrySet();
		
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得:"+entry.getKey());
			System.out.println("对应的值为： "+entry.getValue().name);
		}
	}
	
	public void testModify(){
		System.out.println("输入要修改的学生ID");
		Scanner console = new Scanner(System.in);
		String stuID ;
		while(true){
			stuID = console.next();
			Student student = students.get(stuID);
			if(student == null){
				System.out.println("ID 不存在");
				continue;
			}
			System.out.println("当前学生是 "+student.name);
			System.out.println("输入要修改的名字");
			String newName = console.next();
			students.put(stuID, new Student(newName, stuID));
			System.out.println("done!");
			break;
			}
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MineMap m = new MineMap();
		m.testPut();
		m.testMapKeySet();
		m.testModify();
		m.testEntrySet();
		//m.removeStu();
		//m.testEntrySet();
		

	}

}
