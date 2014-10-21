package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Qmain {
	public static void main(String[] args) {
//		System.out.println(args[0]);
		
//		String release_date="2014-10-01-00.00.00";
//		System.out.println(release_date.substring(0,10));
//		release_date=release_date.substring(0,10);
//		System.out.println(release_date);
		
		
		
//		
//		String N = "终端公司河南分公司/营销中心/豫南营销中心";   
//		String b="营销中心";
//		System.out.println(N.indexOf(b));
//		System.out.println(N.lastIndexOf(b));
		
//		Scanner read = new Scanner(System.in);
//		Hashtable<Character, Integer> hm = new Hashtable<Character,Integer>();
//		ArrayList<Character> list = new ArrayList<Character>();
//		String str = read.next().trim();
//		char [] ch = str.toCharArray();
//		for(char c:ch){
//			System.out.print(c+"\t");
//			if(hm.containsKey(c)){
//				hm.put(c, hm.get(c)+1);
//			}else{
//				hm.put(c, 1);
//				list.add(c);
//			}
//		}
//		Iterator<Character> it = hm.keySet().iterator();
//		System.out.println("begin:");
//		char count = 0;
//		while(it.hasNext()){
//			count = it.next();
//			if(count==' '){
//				System.out.println("空格有"+hm.get(count));
//			}else{
//				System.out.println(count+"有"+hm.get(count));
//			}
//		}
		
		
		
		Scanner read = new Scanner(System.in);
		String yhm = read.next();
//		int mm = read.nextInt();
//		if(yhm.trim().equals("好")&&mm==123){
//			System.out.println("很好！");
//		}
//		return;
		Map<String,String> map = new HashMap<String, String>();
		map.put("admin", "admin");
		String user = new String("admin") ;
		if(map.get("admin")!="admin"){
			System.out.println("haha");
		}
		if(yhm!="admin"){
			System.out.println("haha");
		}
		
	}
	
	
}
