import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class SummitTicket extends JFrame {

	private JPanel contentPane;
	private JTextField txtSummitTicket;
	private JTextField txtYourLocation;
	private JTextField txtYourDestination;
	private JTextField txtTotalPrice;
	private JTextField textField;
	private JButton btnExit;
	private JTextField textField_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SummitTicket frame = new SummitTicket();
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
	public SummitTicket() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		setTitle("🎫 TicketHere");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSummitTicket = new JTextField();
		txtSummitTicket.setForeground(new Color(255, 255, 255));
		txtSummitTicket.setText("🎫 Summit Ticket");
		txtSummitTicket.setOpaque(false);
		txtSummitTicket.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 40));
		txtSummitTicket.setEditable(false);
		txtSummitTicket.setColumns(10);
		txtSummitTicket.setBorder(null);
		txtSummitTicket.setBounds(35, 0, 807, 149);
		contentPane.add(txtSummitTicket);
		
		JPanel panel = new JPanel();
		panel.setBounds(9, 152, 1173, 442);
		contentPane.add(panel);
		panel.setLayout(null);
		LocationName location = new LocationName();
		CalculatePrice calp = new CalculatePrice();
		txtYourLocation = new JTextField();
		txtYourLocation.setText(" 📍  Your board station is           : (A"+ calp.getLocation() +")" + location.getLocationName());
		txtYourLocation.setOpaque(false);
		txtYourLocation.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 35));
		txtYourLocation.setEditable(false);
		txtYourLocation.setColumns(10);
		txtYourLocation.setBorder(null);
		txtYourLocation.setBounds(131, 0, 955, 143);
		panel.add(txtYourLocation);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\u2193");
		textField_1.setOpaque(false);
		textField_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 60));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(643, 124, 59, 34);
		panel.add(textField_1);
		
		txtYourDestination = new JTextField();
		txtYourDestination.setText("🚉 Your destination station is   : (A"+ calp.getDestination() +")" + location.getDestinationName());
		txtYourDestination.setOpaque(false);
		txtYourDestination.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 35));
		txtYourDestination.setEditable(false);
		txtYourDestination.setColumns(10);
		txtYourDestination.setBorder(null);
		txtYourDestination.setBounds(132, 136, 954, 137);
		panel.add(txtYourDestination);
		
		txtTotalPrice = new JTextField();
		txtTotalPrice.setForeground(new Color(255, 255, 255));
		txtTotalPrice.setText(" 💲  Total Price                       : " + calp.getPrice() + " Baht.");
		txtTotalPrice.setOpaque(false);
		txtTotalPrice.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 40));
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setColumns(10);
		txtTotalPrice.setBorder(null);
		txtTotalPrice.setBounds(128, 248, 955, 148);
		panel.add(txtTotalPrice);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		textField = new JTextField();
		textField.setForeground(new Color(128, 128, 128));
		textField.setBounds(142, 394, 945, 34);
		panel.add(textField);
		textField.setText("📅 "+dtf.format(now));
		textField.setOpaque(false);
		textField.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBounds(1, 282, 1171, 82);
		panel.add(panel_1);
		
		JButton btnBack = new JButton("◀ Back");
		btnBack.setForeground(new Color(255, 140, 0));
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SummitTicket.super.setVisible(false);
				DestinationLocation destination = new DestinationLocation();
				destination.setVisible(true);
			}
		});
		btnBack.setBounds(803, 614, 177, 104);
		contentPane.add(btnBack);
		
		JButton btnSummit = new JButton("☑ Summit");
		btnSummit.setForeground(new Color(50, 205, 50));
		btnSummit.setBackground(new Color(255, 255, 255));
		btnSummit.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnSummit.setBounds(1001, 613, 180, 105);
		contentPane.add(btnSummit);
		btnSummit.addActionListener(new ActionListener() {
			
			 @Override
			   public void actionPerformed(ActionEvent e) {
			    try {
			     File desktop = new File(System.getProperty("user.home"), "/Desktop");
			     PrintStream write = new PrintStream(new File(desktop, "TicketHere.txt"));
			     write.println("==============================================================");
			     write.println("[ARL PASS]                          No."+ now );
			     write.println("--------------------------------------------------------------");
			     write.println("\n      (A" + calp.getLocation()+ ")  " +location.getLocationName() + "    -->    "+  "(A" + calp.getDestination()+ ")  " + location.getDestinationName());
			     write.println("\n--------------------------------------------------------------");
			     write.println("(Time Stamp) "+ dtf.format(now) + "\t      [Price " + calp.getPrice() + " Bath.]");
			     write.println("==============================================================");
			     write.close();
			     JOptionPane.showMessageDialog(null, "Thank you for buying the ticket!", "TicketHere", JOptionPane.INFORMATION_MESSAGE);
			     System.exit(0);
			    } catch (FileNotFoundException e1) {
			     e1.printStackTrace();
			    }
			    
			   }
		});
		
		btnExit = new JButton("🗙 Exit");
		btnExit.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnExit.setBackground(new Color(255, 255, 255));
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 613, 206, 105);
		contentPane.add(btnExit);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 0));
		panel_2.setBounds(1, 19, 1193, 107);
		contentPane.add(panel_2);
	}
}
