
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DestinationLocation extends CurrentLocation {

	private JPanel contentPane;
	private JTextField txtPleaseSelectYour;
	private JTextField txtYourDestinationIs;
	private JButton btnPhayathai;
	private JButton btnRatchaprarop;
	private JButton btnMakkasan;
	private JButton btnRamkhamhaeng;
	private JButton btnHuaMak;
	private JButton btnBanThapChang;
	private JButton btnLatKbabang;
	private JButton btnSuvarnabhumi;
	private JButton btnNext;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DestinationLocation frame = new DestinationLocation();
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
	public DestinationLocation() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		setTitle("TicketHere");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("\uD83D\uDDD9 Exit");
		btnExit.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnExit.setForeground(Color.RED);
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 613, 206, 105);
		contentPane.add(btnExit);
		
		LocationName location = new LocationName();
		CalculatePrice calp = new CalculatePrice();
		txtPleaseSelectYour = new JTextField();
		txtPleaseSelectYour.setText("\uD83D\uDE89 Please select your destination station.");
		txtPleaseSelectYour.setOpaque(false);
		txtPleaseSelectYour.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 40));
		txtPleaseSelectYour.setEditable(false);
		txtPleaseSelectYour.setColumns(10);
		txtPleaseSelectYour.setBorder(null);
		txtPleaseSelectYour.setBounds(35, 0, 807, 149);
		contentPane.add(txtPleaseSelectYour);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 148, 1164, 444);
		contentPane.add(panel);
		
		btnPhayathai = new JButton("(A8)");
		btnPhayathai.setForeground(new Color(128, 0, 0));
		btnPhayathai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(Color.green);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);;
				
				location.setDestinationName("Phaya Thai");
				calp.setDestination(8);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")"+ location.getDestinationName());
			}
		});
		btnPhayathai.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPhayathai.setBounds(17, 112, 103, 90);
		panel.add(btnPhayathai);
		
		btnRatchaprarop = new JButton("(A7)");
		btnRatchaprarop.setForeground(new Color(128, 0, 0));
		btnRatchaprarop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(null);
				btnRatchaprarop.setBackground(Color.green);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);;
				location.setDestinationName("Ratchaprarop");
				calp.setDestination(7);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")" + location.getDestinationName());
			}
		});
		btnRatchaprarop.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRatchaprarop.setBounds(172, 112, 103, 90);
		panel.add(btnRatchaprarop);
		
		btnMakkasan = new JButton("(A6)");
		btnMakkasan.setForeground(new Color(128, 0, 0));
		btnMakkasan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(Color.green);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);;
				location.setDestinationName("Makkasan");
				calp.setDestination(6);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")" + location.getDestinationName());
			}
		});
		btnMakkasan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnMakkasan.setBounds(323, 112, 103, 90);
		panel.add(btnMakkasan);
		
		btnRamkhamhaeng = new JButton("(A5)");
		btnRamkhamhaeng.setForeground(new Color(128, 0, 0));
		btnRamkhamhaeng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(Color.green);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);;
				location.setDestinationName("Ramkhamhaeng");
				calp.setDestination(5);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")" + location.getDestinationName());
			}
		});
		btnRamkhamhaeng.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRamkhamhaeng.setBounds(475, 112, 103, 90);
		panel.add(btnRamkhamhaeng);
		
		btnHuaMak = new JButton("(A4)");
		btnHuaMak.setForeground(new Color(128, 0, 0));
		btnHuaMak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(Color.green);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);;
				location.setDestinationName("Hua Mak");
				calp.setDestination(4);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")" + location.getDestinationName());
			}
		});
		btnHuaMak.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnHuaMak.setBounds(633, 112, 103, 90);
		panel.add(btnHuaMak);
		
		btnBanThapChang = new JButton("(A3)");
		btnBanThapChang.setForeground(new Color(128, 0, 0));
		btnBanThapChang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(Color.green);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);;
				location.setDestinationName("Ban Thap Chang");
				calp.setDestination(3);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")" + location.getDestinationName());
			}
		});
		btnBanThapChang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnBanThapChang.setBounds(791, 112, 103, 90);
		panel.add(btnBanThapChang);
		
		btnLatKbabang = new JButton("(A2)");
		btnLatKbabang.setForeground(new Color(128, 0, 0));
		btnLatKbabang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(Color.green);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);;
				location.setDestinationName("Lat Kbabang");
				calp.setDestination(2);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")" + location.getDestinationName());
			}
		});
		btnLatKbabang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnLatKbabang.setBounds(940, 112, 103, 90);
		panel.add(btnLatKbabang);
		
		btnSuvarnabhumi = new JButton("(A1)");
		btnSuvarnabhumi.setForeground(new Color(128, 0, 0));
		btnSuvarnabhumi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayathai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(Color.green);
				btnNext.setEnabled(true);;
				location.setDestinationName("Suvarnabhumi");
				calp.setDestination(1);
				txtYourDestinationIs.setText("Your destination is (A"+calp.getDestination() + ")" + location.getDestinationName());
			}
		});
		btnSuvarnabhumi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSuvarnabhumi.setBounds(1019, 238, 103, 90);
		panel.add(btnSuvarnabhumi);
		
		label = new JLabel("\uD83D\uDEE7Suvarnabhumi\r\n");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label.setBounds(971, 333, 172, 26);
		panel.add(label);
		
		label_4 = new JLabel("Lat Kbabang");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label_4.setBounds(930, 72, 126, 29);
		panel.add(label_4);
		
		label_5 = new JLabel("Ban Thap Chang");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label_5.setBounds(764, 212, 172, 29);
		panel.add(label_5);
		
		label_7 = new JLabel("Ramkhamhaeng");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label_7.setBounds(447, 212, 172, 29);
		panel.add(label_7);
		
		label_6 = new JLabel("Hua Mak");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label_6.setBounds(598, 72, 172, 29);
		panel.add(label_6);
		
		label_8 = new JLabel("Phaya Thai");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label_8.setBounds(-11, 74, 172, 29);
		panel.add(label_8);
		
		label_9 = new JLabel("\uD83D\uDE87");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(new Color(0, 204, 0));
		label_9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 50));
		label_9.setBounds(16, 217, 103, 72);
		panel.add(label_9);
		
		label_10 = new JLabel("\u2193");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(new Color(0, 204, 51));
		label_10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 50));
		label_10.setBounds(16, 172, 103, 63);
		panel.add(label_10);
		
		label_11 = new JLabel("BTS Shukumvit Line");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		label_11.setBounds(-11, 299, 161, 29);
		panel.add(label_11);
		
		label_12 = new JLabel("(N2)");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		label_12.setBounds(16, 277, 103, 29);
		panel.add(label_12);
		
		label_13 = new JLabel("Ratchaprarop");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label_13.setBounds(140, 214, 172, 29);
		panel.add(label_13);
		
		label_14 = new JLabel("Makkasan");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		label_14.setBounds(308, 72, 139, 29);
		panel.add(label_14);
		
		label_15 = new JLabel("\u2193");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.BLUE);
		label_15.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 50));
		label_15.setBounds(322, 172, 103, 63);
		panel.add(label_15);
		
		label_16 = new JLabel("\uD83D\uDE87");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(Color.BLUE);
		label_16.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 50));
		label_16.setBounds(322, 217, 103, 72);
		panel.add(label_16);
		
		label_17 = new JLabel("(BL21)");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		label_17.setBounds(322, 277, 103, 29);
		panel.add(label_17);
		
		label_18 = new JLabel("MRT Blue Line");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		label_18.setBounds(295, 299, 161, 29);
		panel.add(label_18);
		
		label_2 = new JLabel(" \u256E");
		label_2.setForeground(new Color(128, 0, 0));
		label_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 73));
		label_2.setBounds(1030, 112, 70, 72);
		panel.add(label_2);
		
		label_3 = new JLabel("|");
		label_3.setForeground(new Color(128, 0, 0));
		label_3.setFont(new Font("Segoe UI Symbol", Font.BOLD, 70));
		label_3.setBounds(1064, 168, 21, 76);
		panel.add(label_3);
		
		label_1 = new JLabel("_____________________");
		label_1.setForeground(new Color(128, 0, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 72));
		label_1.setBounds(101, 72, 979, 103);
		panel.add(label_1);
		
		txtYourDestinationIs = new JTextField();
		txtYourDestinationIs.setBounds(26, 339, 719, 105);
		panel.add(txtYourDestinationIs);
		txtYourDestinationIs.setText("");
		txtYourDestinationIs.setOpaque(false);
		txtYourDestinationIs.setFont(new Font("Segoe UI", Font.PLAIN, 36));
		txtYourDestinationIs.setEditable(false);
		txtYourDestinationIs.setColumns(10);
		txtYourDestinationIs.setBorder(null);
		
	
		
		btnNext = new JButton("Next \u25B6");
		btnNext.setBackground(new Color(255, 255, 255));
		btnNext.setForeground(new Color(50, 205, 50));
		btnNext.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnNext.setEnabled(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DestinationLocation.super.setVisible(false);
				SummitTicket sumTicket = new SummitTicket();
				sumTicket.setVisible(true);
			}
		});
		btnNext.setBounds(994, 613, 180, 105);	
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("\u25C0 Back");
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.setForeground(new Color(255, 165, 0));
		btnBack.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentLocation current = new CurrentLocation();
				current.setVisible(true);
				DestinationLocation.super.setVisible(false);
			}
		});
		btnBack.setBounds(803, 614, 177, 104);
		contentPane.add(btnBack);
		if(location.getLocationName().equals("Phaya Thai")) {	
			btnPhayathai.setEnabled(false);
		 }
		if(location.getLocationName().equals("Ratchaprarop")) {	
			btnRatchaprarop.setEnabled(false);
		 }
		if(location.getLocationName().equals("Makkasan")) {	
				btnMakkasan.setEnabled(false);
		 }
		if(location.getLocationName().equals("Ramkhamhaeng")) {	
				btnRamkhamhaeng.setEnabled(false);
		 }
		if(location.getLocationName().equals("Hua Mak")) {
			 btnHuaMak.setEnabled(false);
		 }
		if(location.getLocationName().equals("Ban Thap Chang")) {
			 btnBanThapChang.setEnabled(false);
		 }
		 if(location.getLocationName().equals("Lat Kbabang")) {
			 btnLatKbabang.setEnabled(false);
		 }
		 if(location.getLocationName().equals("Suvarnabhumi")) {	
			btnSuvarnabhumi.setEnabled(false);
		}
	}
	protected JButton getBtnPhayathai() {
		return btnPhayathai;
	}
	protected JButton getBtnRatchaprarop() {
		return btnRatchaprarop;
	}
	protected JButton getBtnMakkasan() {
		return btnMakkasan;
	}
	protected JButton getBtnRamkhamhaeng() {
		return btnRamkhamhaeng;
	}
	protected JButton getBtnHuaMak() {
		return btnHuaMak;
	}
	protected JButton getBtnBanThapChang() {
		return btnBanThapChang;
	}
	protected JButton getBtnLatKbabang() {
		return btnLatKbabang;
	}
	protected JButton getBtnSuvarnabhumi() {
		return btnSuvarnabhumi;
	}
	public JButton getButton() {
		return btnNext;
	}
}
