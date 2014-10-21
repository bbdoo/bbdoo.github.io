package hello;

import java.util.HashMap;
import java.util.Hashtable;
//import java.util.Scanner;

class TestScanner {

	public static void main(String[] args) {
//			int a=0,b=0,c=0;
//			Scanner reader =new Scanner(System.in);
//			System.out.println("从键盘输入第一个整数:");
//			a=reader.nextInt();
//			System.out.println("从键盘输入第二个整数:");
//			b=reader.nextInt();
//			c=a/b;
//			System.out.println("a/b=" +c);
			
			Hashtable<Object, Object> ht = new Hashtable<>();
			ht.put("word", 123);
			System.out.println(ht.get("word"));
			if(ht.containsKey("word")){
				 ht.put("word", ht.get("word").toString());
				 System.out.println(ht.get("word"));
				 System.out.println(ht.size());
			 }
			
//			HashMap<Object, Object> hm = new HashMap<Object, Object>();
			
	}

	}

