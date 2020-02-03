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
		frmTickethere.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		frmTickethere.setTitle("TicketHere");
		frmTickethere.setBounds(100, 100, 640, 350);
		frmTickethere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTickethere.getContentPane().setLayout(null);
		
		txtTickethere = new JTextField();
		txtTickethere.setEditable(false);
		txtTickethere.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 36));
		txtTickethere.setHorizontalAlignment(SwingConstants.CENTER);
		txtTickethere.setOpaque(false);
		txtTickethere.setBorder(null);
		txtTickethere.setText("🎫 TicketHere");
		txtTickethere.setBounds(167, 64, 275, 60);
		frmTickethere.getContentPane().add(txtTickethere);
		txtTickethere.setColumns(10);
		
		JButton btnStart = new JButton("▶ Start");
		btnStart.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 25));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTickethere.dispose();
				CurrentLocation current = new CurrentLocation();
				current.setVisible(true);
			}
		});
		btnStart.setBounds(167, 145, 282, 71);
		frmTickethere.getContentPane().add(btnStart);
	}
}
