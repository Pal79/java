package prime;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class PrimeWindowApp {

	private JFrame frmPrmszmok;
	private JTextField tfIsPrime;
	private JTextField tfWhichPrimes;
	private JTextField tfHowManyPrimes;
	private JLabel lblIsPrime;
	private JLabel lblWhichPrimes;
	private JLabel lblHowManyPrimes;
	private JButton btnIsPrime;
	private JButton btnWhichPrimes;
	private JButton btnHowManyPrimes;
	private JButton btnExit;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeWindowApp window = new PrimeWindowApp();
					window.frmPrmszmok.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeWindowApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrmszmok = new JFrame();
		frmPrmszmok.setTitle("PRÍMSZÁMOK");
		frmPrmszmok.setBounds(100, 100, 850, 485);
		frmPrmszmok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrmszmok.getContentPane().setLayout(null);
		
		lblIsPrime = new JLabel("Írj be egy számot, hogy megtudd, prímszám e: ");
		lblIsPrime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIsPrime.setBounds(10, 10, 580, 30);
		frmPrmszmok.getContentPane().add(lblIsPrime);
		
		lblWhichPrimes = new JLabel("Írj be egy számot, hogy megtudd, 1 és a beírt szám között mely prímek vannak: ");
		lblWhichPrimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhichPrimes.setBounds(10, 50, 580, 30);
		frmPrmszmok.getContentPane().add(lblWhichPrimes);
		
		lblHowManyPrimes = new JLabel("Írj be egy számot, hogy megtudd, 1 és a megadott szám között hány prím van: ");
		lblHowManyPrimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHowManyPrimes.setBounds(10, 90, 580, 30);
		frmPrmszmok.getContentPane().add(lblHowManyPrimes);
		
		btnIsPrime = new JButton("Mehet");
		btnIsPrime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tfIsPrime.getText());
				lblResult.setText(isPrime(num));
			}
		});
		btnIsPrime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIsPrime.setBounds(700, 10, 120, 30);
		frmPrmszmok.getContentPane().add(btnIsPrime);
		
		tfIsPrime = new JTextField();
		tfIsPrime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfIsPrime.setBounds(600, 10, 90, 30);
		frmPrmszmok.getContentPane().add(tfIsPrime);
		tfIsPrime.setColumns(10);
		
		tfWhichPrimes = new JTextField();
		tfWhichPrimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfWhichPrimes.setColumns(10);
		tfWhichPrimes.setBounds(600, 50, 90, 30);
		frmPrmszmok.getContentPane().add(tfWhichPrimes);
		
		tfHowManyPrimes = new JTextField();
		tfHowManyPrimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfHowManyPrimes.setColumns(10);
		tfHowManyPrimes.setBounds(600, 90, 90, 30);
		frmPrmszmok.getContentPane().add(tfHowManyPrimes);
		
		btnWhichPrimes = new JButton("Mehet");
		btnWhichPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tfWhichPrimes.getText());
				lblResult.setText(primesWriteOut(num));
			}
		});
		btnWhichPrimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnWhichPrimes.setBounds(700, 50, 120, 30);
		frmPrmszmok.getContentPane().add(btnWhichPrimes);
		
		btnHowManyPrimes = new JButton("Mehet");
		btnHowManyPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tfHowManyPrimes.getText());
				lblResult.setText(primesCount(num));
			}
		});
		btnHowManyPrimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHowManyPrimes.setBounds(700, 90, 120, 30);
		frmPrmszmok.getContentPane().add(btnHowManyPrimes);
		
		btnExit = new JButton("Kilépés");
		btnExit.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBounds(355, 360, 120, 30);
		frmPrmszmok.getContentPane().add(btnExit);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResult.setBounds(10, 150, 810, 200);
		frmPrmszmok.getContentPane().add(lblResult);
	}
	
	public String isPrime(int num) {
	    boolean prim = true;
	    String result = "";
	    
	    if (num == 1 || num == 0) {
	    	result = "Az adott szám: " + num + ", nem prímszám!";
	    	prim = false;
	    } else {
	    	for (int j = 2; j <= Math.sqrt(num); j++) {
	    		if (num % j == 0) {
	    			prim = false;
	    			result = "Az adott szám: " + num + ", nem prímszám!";
	    			break;
	    		}
	    	}
	    	if(prim == true) {
	    		result = "Az adott szám: " + num + ", prímszám!";
	    	}
	    }
	    return result;
	}
	
	public String primesWriteOut(int num) {
		boolean isPrime = true;
		int count = 0;
		String result = "";
		
		for(int i = 2; i <= num; i++) {
			isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				count++;
				result += i + " ";
			}
		}
		return result;
	}
	
	public String primesCount(int num) {
		boolean isPrime = true;
		int count = 0;
		String result = "";
		
		for(int i = 2; i <= num; i++) {
			isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				count++;
			}
		}
		result = "Összesen " + count + " prím van 1 és " + num + " között!";
		return result;
	}
}
