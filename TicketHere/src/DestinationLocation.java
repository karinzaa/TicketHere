
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		setTitle("TicketHere");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("\uD83D\uDDD9 Exit");
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 284, 107, 64);
		contentPane.add(btnExit);
		
		LocationName location = new LocationName();
		CalculatePrice calp = new CalculatePrice();
		txtPleaseSelectYour = new JTextField();
		txtPleaseSelectYour.setText("\uD83D\uDE89 Please select your destination");
		txtPleaseSelectYour.setOpaque(false);
		txtPleaseSelectYour.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));
		txtPleaseSelectYour.setEditable(false);
		txtPleaseSelectYour.setColumns(10);
		txtPleaseSelectYour.setBorder(null);
		txtPleaseSelectYour.setBounds(10, 0, 367, 56);
		contentPane.add(txtPleaseSelectYour);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 56, 824, 216);
		contentPane.add(panel);
		
		txtYourDestinationIs = new JTextField();
		txtYourDestinationIs.setText("");
		txtYourDestinationIs.setOpaque(false);
		txtYourDestinationIs.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		txtYourDestinationIs.setEditable(false);
		txtYourDestinationIs.setColumns(10);
		txtYourDestinationIs.setBorder(null);
		txtYourDestinationIs.setBounds(134, 293, 404, 49);
		contentPane.add(txtYourDestinationIs);
		
		btnPhayathai = new JButton("(A8)Phaya Thai");
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
		btnPhayathai.setBounds(0, 11, 201, 90);
		panel.add(btnPhayathai);
		
		btnRatchaprarop = new JButton("(A7)Ratchaprarop");
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
		btnRatchaprarop.setBounds(205, 11, 201, 90);
		panel.add(btnRatchaprarop);
		
		btnMakkasan = new JButton("(A6)Makkasan");
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
		btnMakkasan.setBounds(416, 11, 201, 90);
		panel.add(btnMakkasan);
		
		btnRamkhamhaeng = new JButton("(A5)Ramkhamhaeng");
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
		btnRamkhamhaeng.setBounds(621, 11, 201, 90);
		panel.add(btnRamkhamhaeng);
		
		btnHuaMak = new JButton("(A4)Hua Mak");
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
		btnHuaMak.setBounds(0, 112, 201, 90);
		panel.add(btnHuaMak);
		
		btnBanThapChang = new JButton("(A3)Ban Thap Chang");
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
		btnBanThapChang.setBounds(205, 112, 201, 90);
		panel.add(btnBanThapChang);
		
		btnLatKbabang = new JButton("(A2)Lat Kbabang");
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
		btnLatKbabang.setBounds(416, 112, 201, 90);
		panel.add(btnLatKbabang);
		
		btnSuvarnabhumi = new JButton("(A1)Suvarnabhumi");
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
		btnSuvarnabhumi.setBounds(621, 112, 201, 90);
		panel.add(btnSuvarnabhumi);
		
	
		
		btnNext = new JButton("Next \u25B6");
		btnNext.setBackground(Color.GREEN);
		btnNext.setEnabled(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DestinationLocation.super.setVisible(false);
				SummitTicket sumTicket = new SummitTicket();
				sumTicket.setVisible(true);
			}
		});
		btnNext.setBounds(727, 284, 107, 64);	
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("\u25C0 Back");
		btnBack.setBackground(Color.ORANGE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentLocation current = new CurrentLocation();
				current.setVisible(true);
				DestinationLocation.super.setVisible(false);
			}
		});
		btnBack.setBounds(594, 284, 112, 64);
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
