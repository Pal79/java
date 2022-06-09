package lottery;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {

	private JFrame frmLottsorsolsvesLeosztsban;
	private JLabel labelRandomNumbers;
	private JButton btnNewButton;

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
		frmLottsorsolsvesLeosztsban.setBounds(100, 100, 263, 534);
		frmLottsorsolsvesLeosztsban.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLottsorsolsvesLeosztsban.getContentPane().setLayout(null);
		
		labelRandomNumbers = new JLabel("");
		labelRandomNumbers.setBounds(10, 10, 229, 410);
		frmLottsorsolsvesLeosztsban.getContentPane().add(labelRandomNumbers);
		
		btnNewButton = new JButton("Generate Lottery Numbers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(10, 436, 229, 21);
		frmLottsorsolsvesLeosztsban.getContentPane().add(btnNewButton);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(78, 467, 85, 21);
		frmLottsorsolsvesLeosztsban.getContentPane().add(btnExit);
	}
	
	public static Random r = new Random();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private JButton btnExit;
	
	private static boolean arrayCheck(int[] array, int search) {
		boolean result = true;
		for (int item : array) {
			if(item == search) {
				result = false;
			}
		}
		return result;
	}
	
	private static void matrixArrayUpload(int[][] matrix) {
		int[] tempArray = new int[5];
		int number;
		boolean result;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				do {
					number = r.nextInt((90-1)+1)+1;
					result = arrayCheck(tempArray, number);
				} while(!result);
				tempArray[j] = number;
				matrix[i][j] = tempArray[j];
			}
		}
	}
	
	private static void matrixArrayWriteOut(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print((i+1) + ". hét nyerőszámai: ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
