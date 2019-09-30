package baitap4;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BtBorderLayout extends JFrame {
	public BtBorderLayout() {
		super("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.red);
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		JButton btn1 = new JButton("NORTH");
		pnNorth.add(btn1);
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.red);
		pnBorder.add(pnSouth, BorderLayout.SOUTH);
		JButton btn2 = new JButton("SOUTH");
		pnSouth.add(btn2);
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.BLUE);
		pnBorder.add(pnWest, BorderLayout.WEST);
		JButton btn3 = new JButton("WEST");
		pnWest.add(btn3);
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.BLUE);
		pnBorder.add(pnEast, BorderLayout.EAST);
		JButton btn4 = new JButton("EAST");
		pnEast.add(btn4);
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		pnBorder.add(pnCenter, BorderLayout.CENTER);
		JButton btn5 = new JButton("Center");
		pnCenter.add(btn5);
		getContentPane().add(pnBorder);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BtBorderLayout sc = new BtBorderLayout();
		sc.setSize(400, 300);
		sc.setLocationRelativeTo(null);
		sc.setVisible(true);

	}

}
