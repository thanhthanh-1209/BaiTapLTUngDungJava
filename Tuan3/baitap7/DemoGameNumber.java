package baitap7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoGameNumber {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoGameNumber window = new DemoGameNumber();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoGameNumber() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String title = JOptionPane.showInputDialog("Enter your name");
		frame = new JFrame();
		frame.setTitle(title);
		frame.setBounds(100, 100, 408, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 392, 31);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTrochoixeposo = new JLabel("TR\u00D2 CH\u01A0I X\u1EBEP \u00D4 S\u1ED0");
		lblTrochoixeposo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrochoixeposo.setToolTipText("");
		lblTrochoixeposo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTrochoixeposo.setBounds(0, 0, 392, 31);
		panel.add(lblTrochoixeposo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 31, 392, 186);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton so15 = new JButton("15");
		so15.setBounds(0, 1, 98, 46);
		panel_1.add(so15);
		
		JButton so14 = new JButton("14");
		so14.setBounds(98, 1, 98, 46);
		panel_1.add(so14);
		
		JButton so13 = new JButton("13");
		so13.setBounds(196, 1, 98, 46);
		panel_1.add(so13);
		
		JButton so12 = new JButton("12");
		so12.setBounds(294, 1, 98, 46);
		panel_1.add(so12);
		
		JButton so11 = new JButton("11");
		so11.setBounds(0, 47, 98, 46);
		panel_1.add(so11);
		
		JButton so10 = new JButton("10");
		so10.setBounds(98, 47, 98, 46);
		panel_1.add(so10);
		
		JButton so9 = new JButton("9");
		so9.setBounds(196, 47, 98, 46);
		panel_1.add(so9);
		
		JButton so8 = new JButton("8");
		so8.setBounds(294, 47, 98, 46);
		panel_1.add(so8);
		
		JButton so7 = new JButton("7");
		so7.setBounds(0, 93, 98, 46);
		panel_1.add(so7);
		
		JButton so6 = new JButton("6");
		so6.setBounds(98, 93, 98, 46);
		panel_1.add(so6);
		
		JButton so5 = new JButton("5");
		so5.setBounds(196, 93, 98, 46);
		panel_1.add(so5);
		
		JButton so4 = new JButton("4");
		so4.setBounds(294, 93, 98, 46);
		panel_1.add(so4);
		
		JButton so3 = new JButton("3");
		so3.setBounds(0, 139, 98, 46);
		panel_1.add(so3);
		
		JButton so2 = new JButton("2");
		so2.setBounds(98, 139, 98, 46);
		panel_1.add(so2);
		
		JButton so1 = new JButton("1");
		so1.setBounds(196, 139, 98, 46);
		panel_1.add(so1);
		
		JButton btnTrong = new JButton("");
		btnTrong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnTrong.setBounds(294, 139, 98, 46);
		panel_1.add(btnTrong);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 214, 392, 47);
		frame.getContentPane().add(panel_2);
		
		JButton btnNewButton_16 = new JButton("B\u1EAFt \u0110\u1EA7u");
		btnNewButton_16.setBounds(151, 11, 91, 25);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.setLayout(null);
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_16.setForeground(new Color(0, 0, 0));
		panel_2.add(btnNewButton_16);
	}

}
