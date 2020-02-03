
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		LocationName location = new LocationName();
		CalculatePrice calp = new CalculatePrice();
		setTitle("TicketHere");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("\uD83D\uDDD9 Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 284, 107, 64);
		contentPane.add(btnExit);
		
		txtPleaseSelectYour = new JTextField();
		txtPleaseSelectYour.setEditable(false);
		txtPleaseSelectYour.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));
		txtPleaseSelectYour.setText("\uD83D\uDCCD Please select your current location");
		txtPleaseSelectYour.setOpaque(false);
		txtPleaseSelectYour.setBorder(null);
		txtPleaseSelectYour.setBounds(10, 0, 439, 55);
		contentPane.add(txtPleaseSelectYour);
		txtPleaseSelectYour.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 57, 824, 216);
		contentPane.add(panel);
		panel.setLayout(null);
		txtYourCurrentLocation = new JTextField();
		txtYourCurrentLocation.setText("");
		txtYourCurrentLocation.setOpaque(false);
		txtYourCurrentLocation.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		txtYourCurrentLocation.setEditable(false);
		txtYourCurrentLocation.setColumns(10);
		txtYourCurrentLocation.setBorder(null);
		txtYourCurrentLocation.setBounds(131, 292, 453, 49);
		contentPane.add(txtYourCurrentLocation);
		btnPhayaThai = new JButton("(A8)Phaya Thai");
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
				txtYourCurrentLocation.setText("Your current location is (A" + calp.getLocation()+")"+ location.getLocationName());
			}
		});
		btnPhayaThai.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnPhayaThai.setBounds(0, 11, 201, 90);
		panel.add(btnPhayaThai);
		
		btnRatchaprarop = new JButton("(A7)Ratchaprarop");
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
				txtYourCurrentLocation.setText("Your current location is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnRatchaprarop.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRatchaprarop.setBounds(205, 11, 201, 90);
		panel.add(btnRatchaprarop);
		
		btnMakkasan = new JButton("(A6)Makkasan");
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
				txtYourCurrentLocation.setText("Your current location is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnMakkasan.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnMakkasan.setBounds(416, 11, 201, 90);
		panel.add(btnMakkasan);
		
		btnRamkhamhaeng = new JButton("(A5)Ramkhamhaeng");
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
				txtYourCurrentLocation.setText("Your current location is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnRamkhamhaeng.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnRamkhamhaeng.setBounds(621, 11, 201, 90);
		panel.add(btnRamkhamhaeng);
		
		btnHuaMak = new JButton("(A4)Hua Mak");
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
				txtYourCurrentLocation.setText("Your current location is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnHuaMak.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnHuaMak.setBounds(0, 112, 201, 90);
		panel.add(btnHuaMak);
		
		btnBanThapChang = new JButton("(A3)Ban Thap Chang");
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
				txtYourCurrentLocation.setText("Your current location is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnBanThapChang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnBanThapChang.setBounds(205, 112, 201, 90);
		panel.add(btnBanThapChang);
		
		btnLatKbabang = new JButton("(A2)Lat Kbabang");
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
				txtYourCurrentLocation.setText("Your current location is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnLatKbabang.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnLatKbabang.setBounds(416, 112, 201, 90);
		panel.add(btnLatKbabang);
		
		btnSuvarnabhumi = new JButton("(A1)Suvarnabhumi");
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
				txtYourCurrentLocation.setText("Your current location is (A"+ calp.getLocation()+")" + location.getLocationName());
			}
		});
		btnSuvarnabhumi.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSuvarnabhumi.setBounds(621, 112, 201, 90);
		panel.add(btnSuvarnabhumi);
		
		btnNext = new JButton("Next \u25B6");
		btnNext.setBackground(new Color(0, 255, 0));
		btnNext.setEnabled(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentLocation.super.setVisible(false);
				DestinationLocation destination = new DestinationLocation();
				destination.setVisible(true);
			}
		});
		btnNext.setBounds(727, 284, 107, 64);
		contentPane.add(btnNext);
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

