package hello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class CheckHttp {
		public static void main(String[] args) throws Exception {
			
			
			Socket s = new Socket("weibo.com", 80);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write("OPTIONS / HTTP/1.1");
			bw.newLine();
			bw.write("Host: http://weibo.com/u/37100:80");
			bw.newLine();
			bw.write("Content-Type: text/html");
			bw.newLine();
			bw.newLine();
			bw.flush();
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			bw.close();
			br.close();
			s.close();

	}

}
