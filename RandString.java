package xuanke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandString {	
		List<String> randStr = new ArrayList<>();
		
	public void getRandStr(){
		String n = "abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";		
		Random random = new Random();				
		for(int i =0;i<10;i++){	
			int j =0;
			StringBuffer sb = new StringBuffer();			
		for(int k = random.nextInt(10)+1;j<k;){
				if(k==0){
					continue;
				}else{
					int a = random.nextInt(n.length()-1);			
					sb.append(n.charAt(a));	
					j++;
				}
			}
		randStr.add(sb.toString());			
		}		
	}
	
	public void forEcheGetRandStr(){
		for (String string : randStr) {
			System.out.println(string);
		}
	}
	
	public void sortRandStr(){
		Collections.sort(randStr);
	}
		
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RandString rs = new RandString();
		rs.getRandStr();
		rs.forEcheGetRandStr();
		System.out.println("--------------");
		rs.sortRandStr();
		rs.forEcheGetRandStr();
		
	}

}
