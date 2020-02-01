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

public class SummitTicket extends JFrame {

	private JPanel contentPane;
	private JTextField txtSummitTicket;
	private JTextField txtYourLocation;
	private JTextField txtYourDestination;
	private JTextField txtTotalPrice;
	private JTextField textField;
	private JButton button_1;

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
		setTitle("TicketHere");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSummitTicket = new JTextField();
		txtSummitTicket.setText("Summit Ticket");
		txtSummitTicket.setOpaque(false);
		txtSummitTicket.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		txtSummitTicket.setEditable(false);
		txtSummitTicket.setColumns(10);
		txtSummitTicket.setBorder(null);
		txtSummitTicket.setBounds(30, 27, 220, 57);
		contentPane.add(txtSummitTicket);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 95, 824, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		LocationName location = new LocationName();
		CalculatePrice calp = new CalculatePrice();
		txtYourLocation = new JTextField();
		txtYourLocation.setText("Your location        : (A"+ calp.getLocation() +")" + location.getLocationName());
		txtYourLocation.setOpaque(false);
		txtYourLocation.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		txtYourLocation.setEditable(false);
		txtYourLocation.setColumns(10);
		txtYourLocation.setBorder(null);
		txtYourLocation.setBounds(30, 11, 634, 57);
		panel.add(txtYourLocation);
		
		txtYourDestination = new JTextField();
		txtYourDestination.setText("Your destination   : (A"+ calp.getDestination() +")" + location.getDestinationName());
		txtYourDestination.setOpaque(false);
		txtYourDestination.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		txtYourDestination.setEditable(false);
		txtYourDestination.setColumns(10);
		txtYourDestination.setBorder(null);
		txtYourDestination.setBounds(30, 71, 634, 57);
		panel.add(txtYourDestination);
		
		txtTotalPrice = new JTextField();
		txtTotalPrice.setText("Total Price            : " + calp.getPrice() + " Baht.");
		txtTotalPrice.setOpaque(false);
		txtTotalPrice.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setColumns(10);
		txtTotalPrice.setBorder(null);
		txtTotalPrice.setBounds(30, 139, 634, 57);
		panel.add(txtTotalPrice);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		textField = new JTextField();
		textField.setBounds(30, 195, 255, 34);
		panel.add(textField);
		textField.setText("Date :"+dtf.format(now));
		textField.setOpaque(false);
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SummitTicket.super.setVisible(false);
				DestinationLocation destination = new DestinationLocation();
				destination.setVisible(true);
			}
		});
		button.setBounds(646, 357, 89, 23);
		contentPane.add(button);
		
		JButton btnSummit = new JButton("Summit");
		btnSummit.setBounds(745, 357, 89, 23);
		contentPane.add(btnSummit);
		
		button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(745, 11, 89, 23);
		contentPane.add(button_1);
	}
}
