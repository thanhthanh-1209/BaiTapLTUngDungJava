package baitap1;

import javax.swing.JFrame;

public class showWindow extends JFrame{
	//show Window
	public showWindow() {
		super("Demo Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showWindow sc = new showWindow();
		sc.setSize(500, 500);
		sc.setLocationRelativeTo(null);
		sc.setVisible(true);

	}

}
