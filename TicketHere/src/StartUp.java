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
		frmTickethere.setTitle("🎫 TicketHere");
		frmTickethere.setBounds(100, 100, 1200, 800);
		frmTickethere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTickethere.getContentPane().setLayout(null);
		
		txtTickethere = new JTextField();
		txtTickethere.setForeground(new Color(255, 255, 255));
		txtTickethere.setBackground(new Color(128, 0, 0));
		txtTickethere.setEditable(false);
		txtTickethere.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 99));
		txtTickethere.setHorizontalAlignment(SwingConstants.CENTER);
		txtTickethere.setBorder(null);
		txtTickethere.setText("🎫 TicketHere");
		txtTickethere.setBounds(-1, 79, 1196, 227);
		frmTickethere.getContentPane().add(txtTickethere);
		txtTickethere.setColumns(10);
		
		JButton btnStart = new JButton("▶ Start \u25C0");
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
		btnStart.setBounds(244, 405, 712, 257);
		frmTickethere.getContentPane().add(btnStart);
	}
}
