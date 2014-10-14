package hello;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Frame1 {
	public static void main(String args[]){
		//基本框架
		JFrame f=new JFrame("JTable表单");
		f.setSize(500,400);
		//f.setResizable(false);
		
		f.setLocation(600, 400);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		//jpanel
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		//f
		f.setLayout(new BorderLayout());
		f.add(jp1,BorderLayout.NORTH);
		f.add(jp2,BorderLayout.CENTER);
		f.add(jp3,BorderLayout.SOUTH);
		//lb
		JLabel lb1=new JLabel("编号");
		JLabel lb2=new JLabel("姓名");
		JLabel lb3=new JLabel("单位");
		JLabel lb4=new JLabel("电话");
		//tf
		TextField tf1=new TextField("",5);
		TextField tf2=new TextField("",5);
		TextField tf3=new TextField("",5);
		TextField tf4=new TextField("",5);
		//jp1
		jp1.setLayout(new FlowLayout());
		jp1.add(lb1);
		jp1.add(tf1);
		jp1.add(lb2);
		jp1.add(tf2);
		jp1.add(lb3);
		jp1.add(tf3);
		jp1.add(lb4);
		jp1.add(tf4);
		//jp2
		jp2.setLayout(new BorderLayout());
		JScrollPane js1;
		JScrollPane js2;
		String[] title = { "编号", "姓名", "单位", "电话" };
		String[][]data = {{"1","hlp","hcit","13811112222"}};
		JTable jt1=new JTable(data,title);
		js1=new JScrollPane(jt1);
		js2=new JScrollPane(jt1);
		jp2.add(js1);
		jp2.add(js2);
		jp2.add(jt1);
		
		//jp3
		jp3.setLayout(new FlowLayout());
		jp3.add(new JButton("修改"));
		jp3.add(new JButton("添加"));
		jp3.add(new JButton("删除"));
		//显示窗体
		f.setVisible(true);
	}
}