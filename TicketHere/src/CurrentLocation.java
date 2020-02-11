
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Canvas;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class CurrentLocation extends JFrame {

	private JPanel contentPane;
	private JTextField txtPleaseSelectYour;
	private JTextField txtYourCurrentLocation;
	private JButton btnPhayaThai;
	private JButton btnRatchaprarop;
	private JButton btnMakkasan;
	private JButton btnRamkhamhaeng;
	private JButton btnHuaMak;
	private JButton btnBanThapChang;
	private JButton btnLatKbabang;
	private JButton btnSuvarnabhumi;
	private JButton btnNext;
	private JLabel label;
	private JLabel lblBanThapChang;
	private JLabel lblHuaMak;
	private JLabel lblRamkhamhaeng;
	private JLabel lblMakkasan;
	private JLabel lblRatchaprarop;
	private JLabel lblPhayaThai;
	private JPanel panel_1;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {			
					CurrentLocation frame = new CurrentLocation();
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
	public CurrentLocation() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		LocationName location = new LocationName();
		CalculatePrice calp = new CalculatePrice();
		setTitle("🎫 TicketHere");
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
		
		txtPleaseSelectYour = new JTextField();
		txtPleaseSelectYour.setForeground(new Color(255, 255, 255));
		txtPleaseSelectYour.setEditable(false);
		txtPleaseSelectYour.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 40));
		txtPleaseSelectYour.setText("\uD83D\uDCCD Please select your board station.");
		txtPleaseSelectYour.setOpaque(false);
		txtPleaseSelectYour.setBorder(null);
		txtPleaseSelectYour.setBounds(35, 0, 807, 149);
		contentPane.add(txtPleaseSelectYour);
		txtPleaseSelectYour.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 148, 1184, 444);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnPhayaThai = new JButton("(A8)");
		btnPhayaThai.setForeground(new Color(128, 0, 0));
		btnPhayaThai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(Color.green);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);
				location.setLocationName("Phaya Thai");
				calp.setLocation(8);
				txtYourCurrentLocation.setText("Your board station is (A" + calp.getLocation()+")"+ location.getLocationName());
			}
		});
		btnPhayaThai.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPhayaThai.setBounds(17, 112, 103, 90);
		panel.add(btnPhayaThai);
		
		btnRatchaprarop = new JButton("(A7)");
		btnRatchaprarop.setForeground(new Color(128, 0, 0));
		btnRatchaprarop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(null);
				btnRatchaprarop.setBackground(Color.green);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);
				location.setLocationName("Ratchaprarop");
				calp.setLocation(7);
				txtYourCurrentLocation.setText("Your board station is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnRatchaprarop.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRatchaprarop.setBounds(172, 112, 103, 90);
		panel.add(btnRatchaprarop);
		
		btnMakkasan = new JButton("(A6)");
		btnMakkasan.setForeground(new Color(128, 0, 0));
		btnMakkasan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(Color.green);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);
				location.setLocationName("Makkasan");
				calp.setLocation(6);
				txtYourCurrentLocation.setText("Your board station is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnMakkasan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnMakkasan.setBounds(323, 112, 103, 90);
		panel.add(btnMakkasan);
		
		btnRamkhamhaeng = new JButton("(A5)");
		btnRamkhamhaeng.setForeground(new Color(128, 0, 0));
		btnRamkhamhaeng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(Color.green);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);
				location.setLocationName("Ramkhamhaeng");
				calp.setLocation(5);
				txtYourCurrentLocation.setText("Your board station is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnRamkhamhaeng.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRamkhamhaeng.setBounds(475, 112, 103, 90);
		panel.add(btnRamkhamhaeng);
		
		btnHuaMak = new JButton("(A4)");
		btnHuaMak.setForeground(new Color(128, 0, 0));
		btnHuaMak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(Color.green);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);
				location.setLocationName("Hua Mak");
				calp.setLocation(4);
				txtYourCurrentLocation.setText("Your board station is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnHuaMak.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnHuaMak.setBounds(633, 112, 103, 90);
		panel.add(btnHuaMak);
		
		btnBanThapChang = new JButton("(A3)");
		btnBanThapChang.setForeground(new Color(128, 0, 0));
		btnBanThapChang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(Color.green);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);
				location.setLocationName("Ban Thap Chang");
				calp.setLocation(3);
				txtYourCurrentLocation.setText("Your board station is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnBanThapChang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnBanThapChang.setBounds(791, 112, 103, 90);
		panel.add(btnBanThapChang);
		
		btnLatKbabang = new JButton("(A2)");
		btnLatKbabang.setForeground(new Color(128, 0, 0));
		btnLatKbabang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(Color.green);
				btnSuvarnabhumi.setBackground(null);
				btnNext.setEnabled(true);
				location.setLocationName("Lat Kbabang");
				calp.setLocation(2);
				txtYourCurrentLocation.setText("Your board station is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnLatKbabang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnLatKbabang.setBounds(940, 112, 103, 90);
		panel.add(btnLatKbabang);
		
		btnSuvarnabhumi = new JButton("(A1)");
		btnSuvarnabhumi.setForeground(new Color(128, 0, 0));
		btnSuvarnabhumi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPhayaThai.setBackground(null);
				btnRatchaprarop.setBackground(null);
				btnMakkasan.setBackground(null);
				btnRamkhamhaeng.setBackground(null);
				btnHuaMak.setBackground(null);
				btnBanThapChang.setBackground(null);
				btnLatKbabang.setBackground(null);
				btnSuvarnabhumi.setBackground(Color.green);
				btnNext.setEnabled(true);
				location.setLocationName("Suvarnabhumi");
				calp.setLocation(1);
				txtYourCurrentLocation.setText("Your board station is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnSuvarnabhumi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSuvarnabhumi.setBounds(1048, 233, 103, 90);
		panel.add(btnSuvarnabhumi);
		
		JLabel lblSuvarnabhumi = new JLabel("\uD83D\uDEE7Suvarnabhumi\r\n");
		lblSuvarnabhumi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuvarnabhumi.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblSuvarnabhumi.setBounds(1012, 335, 172, 26);
		panel.add(lblSuvarnabhumi);
		
		JLabel lblLatKbabang = new JLabel("Lat Kbabang");
		lblLatKbabang.setHorizontalAlignment(SwingConstants.CENTER);
		lblLatKbabang.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblLatKbabang.setBounds(930, 72, 126, 29);
		panel.add(lblLatKbabang);
		
		JLabel label_1 = new JLabel(" \u256E");
		label_1.setForeground(new Color(128, 0, 0));
		label_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 73));
		label_1.setBounds(1055, 112, 70, 72);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("|");
		label_2.setForeground(new Color(128, 0, 0));
		label_2.setFont(new Font("Segoe UI Symbol", Font.BOLD, 70));
		label_2.setBounds(1089, 168, 21, 76);
		panel.add(label_2);
		
		lblBanThapChang = new JLabel("Ban Thap Chang");
		lblBanThapChang.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanThapChang.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblBanThapChang.setBounds(764, 212, 172, 29);
		panel.add(lblBanThapChang);
		
		lblHuaMak = new JLabel("Hua Mak");
		lblHuaMak.setHorizontalAlignment(SwingConstants.CENTER);
		lblHuaMak.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblHuaMak.setBounds(596, 72, 172, 29);
		panel.add(lblHuaMak);
		
		lblRamkhamhaeng = new JLabel("Ramkhamhaeng");
		lblRamkhamhaeng.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamkhamhaeng.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblRamkhamhaeng.setBounds(445, 212, 172, 29);
		panel.add(lblRamkhamhaeng);
		
		lblMakkasan = new JLabel("Makkasan");
		lblMakkasan.setHorizontalAlignment(SwingConstants.CENTER);
		lblMakkasan.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblMakkasan.setBounds(309, 72, 139, 29);
		panel.add(lblMakkasan);
		
		label = new JLabel("______________________");
		label.setForeground(new Color(128, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 72));
		label.setBounds(78, 72, 1045, 103);
		panel.add(label);
		
		lblRatchaprarop = new JLabel("Ratchaprarop");
		lblRatchaprarop.setHorizontalAlignment(SwingConstants.CENTER);
		lblRatchaprarop.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblRatchaprarop.setBounds(141, 214, 172, 29);
		panel.add(lblRatchaprarop);
		
		lblPhayaThai = new JLabel("Phaya Thai");
		lblPhayaThai.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhayaThai.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblPhayaThai.setBounds(-10, 74, 172, 29);
		panel.add(lblPhayaThai);
		txtYourCurrentLocation = new JTextField();
		txtYourCurrentLocation.setBounds(27, 339, 719, 105);
		panel.add(txtYourCurrentLocation);
		txtYourCurrentLocation.setText("");
		txtYourCurrentLocation.setOpaque(false);
		txtYourCurrentLocation.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 36));
		txtYourCurrentLocation.setEditable(false);
		txtYourCurrentLocation.setColumns(10);
		txtYourCurrentLocation.setBorder(null);
		
		label_3 = new JLabel("\u2193");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 204, 51));
		label_3.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 50));
		label_3.setBounds(15, 178, 103, 63);
		panel.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\BTS_Logo.png"));
		label_4.setBounds(46, 218, 43, 63);
		panel.add(label_4);
		
		label_5 = new JLabel("(N2)");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		label_5.setBounds(17, 274, 103, 29);
		panel.add(label_5);
		
		label_6 = new JLabel("BTS Shukumvit Line");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		label_6.setBounds(-10, 294, 161, 29);
		panel.add(label_6);
		
		label_7 = new JLabel("\u2193");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(0, 51, 102));
		label_7.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 50));
		label_7.setBounds(323, 178, 103, 63);
		panel.add(label_7);
		
		label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\MRT_logo.png"));
		label_8.setBounds(346, 218, 60, 61);
		panel.add(label_8);
		
		label_9 = new JLabel("(BL21)");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
		label_9.setBounds(325, 272, 103, 29);
		panel.add(label_9);
		
		label_10 = new JLabel("MRT Blue Line");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
		label_10.setBounds(298, 294, 161, 29);
		panel.add(label_10);
		
		btnNext = new JButton("Next \u25B6");
		btnNext.setForeground(new Color(50, 205, 50));
		btnNext.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnNext.setBackground(Color.WHITE);
		btnNext.setEnabled(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentLocation.super.setVisible(false);
				DestinationLocation destination = new DestinationLocation();
				destination.setVisible(true);
			}
		});
		btnNext.setBounds(1003, 613, 180, 105);
		contentPane.add(btnNext);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 0));
		panel_1.setBounds(2, 20, 1198, 107);
		contentPane.add(panel_1);
	}
	protected JButton getBtnPhayaThai() {
		return btnPhayaThai;
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
	protected JButton getBtnNext() {
		return btnNext;
	}
}

