package baitap2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BtFlowLayout extends JFrame {
	public BtFlowLayout() {
		super("Demo FlowLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Jpanel
		JPanel pnFlow = new JPanel();
		pnFlow.setLayout(new FlowLayout());
		pnFlow.setBackground(Color.CYAN);
		JButton btn1 = new JButton("FlowLayout");
		JButton btn2 = new JButton("Add cac control");
		JButton btn3 = new JButton("Het cho chua");
		JButton btn4 = new JButton("Xuong dong");
		JButton btn5 = new JButton("Cach 1 dong");
		pnFlow.add(btn1);
		pnFlow.add(btn2);
		pnFlow.add(btn3);
		pnFlow.add(btn4);
		pnFlow.add(btn5);
		Container con = getContentPane();// call JFrame
		con.add(pnFlow);// add Panel vao JFrame

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BtFlowLayout sc = new BtFlowLayout();
		sc.setSize(500, 500);
		sc.setLocationRelativeTo(null);
		sc.setVisible(true);

	}

}
