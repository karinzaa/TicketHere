import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		setTitle("TicketHere");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSummitTicket = new JTextField();
		txtSummitTicket.setText("🎫 Summit Ticket");
		txtSummitTicket.setOpaque(false);
		txtSummitTicket.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 26));
		txtSummitTicket.setEditable(false);
		txtSummitTicket.setColumns(10);
		txtSummitTicket.setBorder(null);
		txtSummitTicket.setBounds(31, 0, 237, 65);
		contentPane.add(txtSummitTicket);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 68, 824, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		LocationName location = new LocationName();
		CalculatePrice calp = new CalculatePrice();
		txtYourLocation = new JTextField();
		txtYourLocation.setText(" 📍  Your location        : (A"+ calp.getLocation() +")" + location.getLocationName());
		txtYourLocation.setOpaque(false);
		txtYourLocation.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));
		txtYourLocation.setEditable(false);
		txtYourLocation.setColumns(10);
		txtYourLocation.setBorder(null);
		txtYourLocation.setBounds(30, 11, 634, 57);
		panel.add(txtYourLocation);
		
		txtYourDestination = new JTextField();
		txtYourDestination.setText("🚉 Your destination   : (A"+ calp.getDestination() +")" + location.getDestinationName());
		txtYourDestination.setOpaque(false);
		txtYourDestination.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));
		txtYourDestination.setEditable(false);
		txtYourDestination.setColumns(10);
		txtYourDestination.setBorder(null);
		txtYourDestination.setBounds(30, 71, 634, 57);
		panel.add(txtYourDestination);
		
		txtTotalPrice = new JTextField();
		txtTotalPrice.setText(" 💲  Total Price            : " + calp.getPrice() + " Baht.");
		txtTotalPrice.setOpaque(false);
		txtTotalPrice.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setColumns(10);
		txtTotalPrice.setBorder(null);
		txtTotalPrice.setBounds(30, 139, 634, 57);
		panel.add(txtTotalPrice);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		textField = new JTextField();
		textField.setBounds(40, 195, 255, 34);
		panel.add(textField);
		textField.setText("📅 "+dtf.format(now));
		textField.setOpaque(false);
		textField.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("↓");
		textField_1.setOpaque(false);
		textField_1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 26));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(288, 57, 25, 34);
		panel.add(textField_1);
		
		JButton btnBack = new JButton("◀ Back");
		btnBack.setBackground(Color.ORANGE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SummitTicket.super.setVisible(false);
				DestinationLocation destination = new DestinationLocation();
				destination.setVisible(true);
			}
		});
		btnBack.setBounds(564, 316, 112, 64);
		contentPane.add(btnBack);
		
		JButton btnSummit = new JButton("☑ Summit");
		btnSummit.setBackground(Color.GREEN);
		btnSummit.setBounds(697, 316, 129, 64);
		contentPane.add(btnSummit);
		
		btnExit = new JButton("🗙 Exit");
		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(31, 316, 107, 64);
		contentPane.add(btnExit);
	}
}
