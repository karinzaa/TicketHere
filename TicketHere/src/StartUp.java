import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;

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
		frmTickethere.setResizable(false);
		frmTickethere.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Karinzaa\\Desktop\\1913110449\\TicketHere\\TicketHere\\Icon.png"));
		frmTickethere.setTitle("TicketHere");
		frmTickethere.setBounds(100, 100, 1200, 800);
		frmTickethere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTickethere.getContentPane().setLayout(null);
		
		txtTickethere = new JTextField();
		txtTickethere.setEditable(false);
		txtTickethere.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 99));
		txtTickethere.setHorizontalAlignment(SwingConstants.CENTER);
		txtTickethere.setBorder(null);
		txtTickethere.setText("🎫 TicketHere");
		txtTickethere.setBounds(125, 79, 964, 227);
		frmTickethere.getContentPane().add(txtTickethere);
		txtTickethere.setColumns(10);
		
		JButton btnStart = new JButton("▶ Start");
		btnStart.setForeground(new Color(50, 205, 50));
		btnStart.setBackground(new Color(255, 255, 255));
		btnStart.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 50));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTickethere.dispose();
				CurrentLocation current = new CurrentLocation();
				current.setVisible(true);
			}
		});
		btnStart.setBounds(123, 326, 966, 336);
		frmTickethere.getContentPane().add(btnStart);
	}
}
