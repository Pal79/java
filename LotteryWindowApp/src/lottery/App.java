package lottery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {

	private JFrame frmLottsorsolsvesLeosztsban;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmLottsorsolsvesLeosztsban.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLottsorsolsvesLeosztsban = new JFrame();
		frmLottsorsolsvesLeosztsban.setTitle("Lottósorsolás éves leosztásban");
		frmLottsorsolsvesLeosztsban.setBounds(100, 100, 862, 504);
		frmLottsorsolsvesLeosztsban.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLottsorsolsvesLeosztsban.getContentPane().setLayout(null);
		
		JLabel labelRandomNumbers = new JLabel("");
		labelRandomNumbers.setBounds(10, 10, 160, 447);
		frmLottsorsolsvesLeosztsban.getContentPane().add(labelRandomNumbers);
	}

}
