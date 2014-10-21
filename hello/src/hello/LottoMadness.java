package hello;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class LottoMadness extends JFrame {

	private static final long serialVersionUID = 1L;
	 JPanel[] row = new JPanel[6];

	// 创建组件
	JCheckBox[] check = new JCheckBox[2];
	JLabel quick = new JLabel("Quick");
	JLabel personal = new JLabel("Personal");

	public LottoMadness() {
		// 创建外框
		super("Lotto Madness");
		setSize(600, 400);
		setLookAndFeel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		// 分配空间
		for (int i = 0; i < 6; i++) {
			row[i] = new JPanel();
		}
		for (int i = 0; i < 2; i++) {
			check[i] = new JCheckBox();
		}
		// 添加组件，管理器
		GridLayout layout = new GridLayout(6, 1, 1, 1);
		setLayout(layout);
		for (int i = 0; i < 6; i++) {
			add(row[i]);// （报错二）
//			add(check[i]);
		}
		// FlowLayout layout0=new FlowLayout(FlowLayout.CENTER);
	}

	public void setLookAndFeel() {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			System.out.println("setLookAndFeel出错" + e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new LottoMadness();
	}

}