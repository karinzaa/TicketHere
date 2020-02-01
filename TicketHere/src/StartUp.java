import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class StartUp {

	private JFrame frmTickethere;
	private JTextField txtTickethere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUp window = new StartUp();
					window.frmTickethere.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTickethere = new JFrame();
		frmTickethere.setIconImage(Toolkit.getDefaultToolkit().getImage(StartUp.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		frmTickethere.setTitle("TicketHere");
		frmTickethere.setBounds(100, 100, 640, 350);
		frmTickethere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTickethere.getContentPane().setLayout(null);
		
		txtTickethere = new JTextField();
		txtTickethere.setEditable(false);
		txtTickethere.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		txtTickethere.setHorizontalAlignment(SwingConstants.CENTER);
		txtTickethere.setOpaque(false);
		txtTickethere.setBorder(null);
		txtTickethere.setText("TicketHere");
		txtTickethere.setBounds(209, 11, 205, 60);
		frmTickethere.getContentPane().add(txtTickethere);
		txtTickethere.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTickethere.dispose();
				CurrentLocation current = new CurrentLocation();
				current.setVisible(true);
			}
		});
		btnStart.setFont(new Font("Trebuchet MS", Font.BOLD, 38));
		btnStart.setBounds(189, 115, 255, 55);
		frmTickethere.getContentPane().add(btnStart);
	}
}
