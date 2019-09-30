package baitap5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

public class GiaiPtBac2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoa;
	private JTextField txtSoc;
	private JTextField textField_1;
	private JTextField txtSob;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaiPtBac2 frame = new GiaiPtBac2();
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
	public GiaiPtBac2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSoa = new JTextField();
		txtSoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtSoa.setBounds(0, 0, 434, 35);
		txtSoa.setBackground(Color.LIGHT_GRAY);
		txtSoa.setForeground(Color.BLACK);
		txtSoa.setHorizontalAlignment(SwingConstants.CENTER);
		txtSoa.setText("GI\u1EA2I PH\u01AF\u01A0NG TR\u00CCNH B\u1EACC 2");
		contentPane.add(txtSoa);
		txtSoa.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51)), "Nh\u1EADp a,b,c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 45, 434, 161);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 47, 118, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		txtSob = new JTextField();
		txtSob.setBounds(169, 16, 118, 20);
		panel_1.add(txtSob);
		txtSob.setColumns(10);
		
		txtSoc = new JTextField();
		txtSoc.setBounds(169, 78, 118, 17);
		panel_1.add(txtSoc);
		txtSoc.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("a");
		lblNewLabel.setBounds(148, 19, 48, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("b");
		lblNewLabel_1.setBounds(148, 50, 48, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("c");
		lblNewLabel_2.setBounds(148, 81, 48, 14);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(169, 130, 118, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel txtKetQua = new JLabel("K\u1EBFt Qu\u1EA3");
		txtKetQua.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtKetQua.setHorizontalAlignment(SwingConstants.CENTER);
		txtKetQua.setBounds(179, 106, 91, 13);
		panel_1.add(txtKetQua);
		
		JButton btnGiai = new JButton("GI\u1EA2I");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGiai.setBounds(74, 227, 89, 23);
		panel.add(btnGiai);
		
		JButton btnXoaTrang = new JButton("X\u00D3A TR\u1EAENG");
		btnXoaTrang.setHorizontalAlignment(SwingConstants.RIGHT);
		btnXoaTrang.setBounds(173, 227, 109, 23);
		panel.add(btnXoaTrang);
		
		JButton btnThoat = new JButton("THO\u00C1T");
		btnThoat.setHorizontalAlignment(SwingConstants.LEFT);
		btnThoat.setBounds(307, 227, 89, 23);
		panel.add(btnThoat);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(51, 153, 255), new Color(102, 153, 255), new Color(102, 153, 255), new Color(102, 153, 255)), "Ch\u1ECDn Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 215, 434, 46);
		panel.add(panel_2);
	}
}
