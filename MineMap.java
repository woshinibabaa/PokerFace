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
			System.out.println("����ѧ��ID");
			String ID = console.next();
			// ��ռ�÷�
			Student  st = students.get(ID);
			if(st == null){
				System.out.println("��������");
				String name = console.next();
				Student newStu = new Student(name,ID);
				students.put(ID, newStu);
				System.out.println("�ɹ����ѧ��"+students.get(ID).name);
				i++;				
			}else{
				System.out.println("��ռ�ã�");
				continue;
			}
		}
	}
	
	public void testMapKeySet(){
		//keySet ����map�����м��ļ��ϣ���������
		Set<String> keySet = students.keySet();
		
		System.out.println("�� "+students.size()+"��ѧ��");
		
		//���� keySet
		for (String stuId : keySet) {
			Student st = students.get(stuId);
			if(st != null)
				System.out.println("ѧ��: "+st.name);
		}
	}
	
	public void removeStu(){
		System.out.println("����Ҫɾ����ID");		
		Scanner console = new Scanner(System.in);
		String ID = console.next();
		while(true){
			// �ж��Ƿ���ѧ������;
			Student st = students.get(ID);
			if(st == null){
				System.out.println("ID ������");
				continue;
			}
			students.remove(ID);
			System.out.println("�ѱ�ɾ��"+ st.name);
			break;
		}
	}
	
	//enteySet ����Map
	public void testEntrySet(){
		// ���ص������м�ֵ��;
		Set<Entry<String,Student>> entrySet = students.entrySet();
		
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ��:"+entry.getKey());
			System.out.println("��Ӧ��ֵΪ�� "+entry.getValue().name);
		}
	}
	
	public void testModify(){
		System.out.println("����Ҫ�޸ĵ�ѧ��ID");
		Scanner console = new Scanner(System.in);
		String stuID ;
		while(true){
			stuID = console.next();
			Student student = students.get(stuID);
			if(student == null){
				System.out.println("ID ������");
				continue;
			}
			System.out.println("��ǰѧ���� "+student.name);
			System.out.println("����Ҫ�޸ĵ�����");
			String newName = console.next();
			students.put(stuID, new Student(newName, stuID));
			System.out.println("done!");
			break;
			}
	}
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MineMap m = new MineMap();
		m.testPut();
		m.testMapKeySet();
		m.testModify();
		m.testEntrySet();
		//m.removeStu();
		//m.testEntrySet();
		

	}

}
