package baitap6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class DemoCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField hienThi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoCalculator frame = new DemoCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 0, 419, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		
		hienThi = new JTextField();
		hienThi.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE));
		hienThi.setHorizontalAlignment(SwingConstants.TRAILING);
		hienThi.setFont(new Font("Tahoma", Font.PLAIN, 31));
		hienThi.setBounds(0, 5, 414, 48);
		panel.add(hienThi);
		hienThi.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 56, 414, 268);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 5, 0, 0));
		
		JButton so1 = new JButton("1");
		so1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		so1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so1.getText());
					hienThi.setText(String.valueOf(so));
				}
			
			}
		});
		panel_1.add(so1);
		
		JButton so2 = new JButton("2");
		so2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so2.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so2);
		
		JButton so3 = new JButton("3");
		so3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so3.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so3);
		
		
		
		JButton chia = new JButton("/");
		chia.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				a = Long.parseLong(hienThi.getText());
				if(a!= 0) {
					phepToan = "/";
					hienThi.setText("0");
				}
			}
		});
		chia.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(chia);
		
		JButton canBac2 = new JButton("SQRT");
		canBac2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+canBac2.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		canBac2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(canBac2);
		
		JButton so4 = new JButton("4");
		so4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so4.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so4);
		
		JButton so5 = new JButton("5");
		so5.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so5.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so5);
		
		JButton so6 = new JButton("6");
		so6.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so6.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so6);
		
		JButton nhan = new JButton("*");
		nhan.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				a = Long.parseLong(hienThi.getText());
				phepToan = "*"; hienThi.setText("0");
			}
		});
		nhan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(nhan);
		
		JButton phantram = new JButton("%");
		phantram.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				a = Long.parseLong(hienThi.getText());
				phepToan = "%"; hienThi.setText("0");
			}
		});
		phantram.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(phantram);
		
		JButton so7 = new JButton("7");
		so7.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so7.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so7);
		
		JButton so8 = new JButton("8");
		so8.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so8.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
			
		});
		so8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so8);
		
		JButton so9 = new JButton("9");
		so9.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so9.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so9);
		
		JButton tru = new JButton("-");
		tru.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				a = Long.parseLong(hienThi.getText());
				phepToan = "-"; hienThi.setText("0");
			}
		});
		tru.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(tru);
		
		JButton phanso = new JButton("1/X");
		phanso.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(phanso);
		
		JButton so0 = new JButton("0");
		so0.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String gt = hienThi.getText();
				if(gt.length()<12) {
					if(gt.equals("0")) gt ="";
					long so = Long.parseLong(gt+so0.getText());
					hienThi.setText(String.valueOf(so));
				}
			}
		});
		so0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(so0);
		
		JButton Congtru = new JButton("+/-");
		Congtru.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(Congtru);
		
		JButton xoa = new JButton("C");
		xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		xoa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(xoa);
		
		JButton cong = new JButton("+");
		cong.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				a = Long.parseLong(hienThi.getText());
				phepToan = "+"; hienThi.setText("0");
			}
		});
		cong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(cong);
		
		JButton Bang = new JButton("=");
		Bang.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if(phepToan.length()>0) {
					long b = Long.parseLong(hienThi.getText());
					if(phepToan.equals("+")) {
						long kq =a+b;
						hienThi.setText(String.valueOf(kq));
						
					}else if(phepToan.equals("-")) {
						long kq = a-b;
						hienThi.setText(String.valueOf(kq));
					}else if(phepToan.equals("*")) {
						long kq = a*b;
						hienThi.setText(String.valueOf(kq));
					}else if(phepToan.equals("/")) {
						float kq =(float) a/b;
						hienThi.setText(String.valueOf(kq));
					}
					phepToan = ""; a= 0; 
				}
			}
		});
		Bang.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(Bang);
	}
	private long a = 0;
	private String phepToan = "";
}



