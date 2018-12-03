package mahJong;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static org.junit.Assert.assertEquals;

//import java.io.InputStream;
import java.util.ArrayList;
//import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
//import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Main {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		ArrayList<JTextField> fields = new ArrayList<JTextField>();
		ImageIcon img = new ImageIcon("./resources/tt.png");
		
		frame.setBounds(40, 100, 1200, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon img_I = new ImageIcon("./resources/final_i.jpg");
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(66, 11, 1164, 775);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMahjongFunFun = new JLabel("Mahjong Fun Fun Fun (Mahjong Calculation System)");
		lblMahjongFunFun.setBounds(100, 5, 1000, 44);
		panel_1.add(lblMahjongFunFun);
		lblMahjongFunFun.setFont(new Font ("", Font.BOLD, 20));
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 365, 86, 20);
		panel_1.add(textField_1);
		textField_1.setText("M1");
		textField_1.setColumns(10);
		fields.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 365, 86, 20);
		panel_1.add(textField_2);
		textField_2.setText("M2");
		textField_2.setColumns(10);
		fields.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(290, 365, 86, 20);
		panel_1.add(textField_3);
		textField_3.setText("M3");
		textField_3.setColumns(10);
		fields.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(630, 365, 86, 20);
		panel_1.add(textField_4);
		textField_4.setText("M4");
		textField_4.setColumns(10);
		fields.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(770, 365, 86, 20);
		panel_1.add(textField_5);
		textField_5.setText("M5");
		textField_5.setColumns(10);
		fields.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(910, 365, 86, 20);
		panel_1.add(textField_6);
		textField_6.setText("M6");
		textField_6.setColumns(10);
		fields.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 551, 86, 20);
		panel_1.add(textField_7);
		textField_7.setText("M7");
		textField_7.setColumns(10);
		fields.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(150, 551, 86, 20);
		panel_1.add(textField_8);
		textField_8.setText("M8");
		textField_8.setColumns(10);
		fields.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(290, 551, 86, 20);
		panel_1.add(textField_9);
		textField_9.setText("M9");
		textField_9.setColumns(10);
		fields.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(630, 551, 86, 20);
		panel_1.add(textField_10);
		textField_10.setText("H7");
		textField_10.setColumns(10);
		fields.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(770, 551, 86, 20);
		panel_1.add(textField_11);
		textField_11.setText("H7");
		textField_11.setColumns(10);
		fields.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(910, 551, 86, 20);
		panel_1.add(textField_12);
		textField_12.setText("H7");
		textField_12.setColumns(10);
		fields.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(395, 697, 86, 20);
		panel_1.add(textField_13);
		textField_13.setText("H6");
		textField_13.setColumns(10);
		fields.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBounds(535, 697, 86, 20);
		panel_1.add(textField_14);
		textField_14.setText("H6");
		textField_14.setColumns(10);
		fields.add(textField_14);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(766, 45, 345, 165);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(img_I);
		
		JLabel lblM = new JLabel("T: Dot S: Bamboo M: Character H: Honor");
		lblM.setBounds(839, 21, 299, 20);
		panel_1.add(lblM);
		
		JLabel lblRules = new JLabel("Rules:");
		lblRules.setBounds(783, 24, 46, 14);
		panel_1.add(lblRules);
		
		JLabel lblMeld_1 = new JLabel("Meld 1");
		lblMeld_1.setBounds(153, 247, 46, 14);
		panel_1.add(lblMeld_1);
		
		JLabel lblMeld_2 = new JLabel("Meld 2");
		lblMeld_2.setBounds(783, 247, 46, 14);
		panel_1.add(lblMeld_2);
		
		JLabel lblMeld3 = new JLabel("Meld 3");
		lblMeld3.setBounds(153, 433, 46, 14);
		panel_1.add(lblMeld3);
		
		JLabel lblMeld_4 = new JLabel("Meld 4");
		lblMeld_4.setBounds(783, 433, 46, 14);
		panel_1.add(lblMeld_4);
		
		JLabel lblNewLabel = new JLabel("Eye");
		lblNewLabel.setBounds(495, 590, 79, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblInstructions = new JLabel("Instructions");
		lblInstructions.setBounds(26, 83, 79, 14);
		panel_1.add(lblInstructions);
		
		JTextArea txtrYouAre = new JTextArea();
		txtrYouAre.setText("1.You are required to enter the 14 tiles in the below 14 boxes." + '\n' + "The first 12 tiles are used to form the four melds and the last 2 tiles" + '\n' +"are used for the eyes." + '\n' + 
				"2.Please input the tiles in a correct sequence! That means each" + '\n' +"3 tiles to form a valid meld must be kept in a sequence, like"+ '\n'+ 
				"they are placed in box 1,2 and 3. For the eyes, they must be" + '\n' + 
				"placed at last. Otherwise, our system MAY NOT detect it as a" + '\n' + "legal hand.");
		JScrollPane sp = new JScrollPane(txtrYouAre);
		sp.setBounds(101, 78, 440, 146);
		panel_1.add(sp);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(740, 697, 89, 23);
		panel_1.add(btnCheck);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(864, 697, 89, 23);
		panel_1.add(btnClear);
		
		
		JLabel lblHandName = new JLabel("Hand Type:");
		lblHandName.setFont(new Font ("", Font.BOLD, 14));
		lblHandName.setBounds(19, 750, 300, 14);
		panel_1.add(lblHandName);
		
		JLabel lblType = new JLabel();
		lblType.setBounds(122, 750, 269, 14);
		panel_1.add(lblType);
		
		JLabel lblResult_1 = new JLabel("Fan Point:");
		lblResult_1.setFont(new Font ("", Font.BOLD, 14));
		lblResult_1.setBounds(19, 720, 106, 14);
		panel_1.add(lblResult_1);
		
		JLabel lblPoint = new JLabel();
		lblPoint.setBounds(122, 720, 46, 14);
		panel_1.add(lblPoint);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font ("", Font.BOLD, 18));
		lblResult.setBounds(19, 690, 121, 14);
		panel_1.add(lblResult);
		
		JLabel label = new JLabel();
		label.setBounds(231, 409, 79, 84);
		panel_1.add(label);
		
		JLabel lblImg_1 = new JLabel();
		lblImg_1.setBounds(20, 291, 80, 64);
		panel_1.add(lblImg_1);
		lblImg_1.setIcon(img);
		
		JLabel lblImg_2 = new JLabel();
		lblImg_2.setBounds(160, 291, 80, 64);
		panel_1.add(lblImg_2);
		lblImg_2.setIcon(img);
		
		JLabel lblImg_3 = new JLabel();
		lblImg_3.setBounds(300, 291, 80, 64);
		panel_1.add(lblImg_3);
		lblImg_3.setIcon(img);
		
		JLabel lblImg_4 = new JLabel();
		lblImg_4.setBounds(630, 291, 80, 64);
		panel_1.add(lblImg_4);
		lblImg_4.setIcon(img);
		
		JLabel lblImg_5 = new JLabel();
		lblImg_5.setBounds(770, 291, 80, 64);
		panel_1.add(lblImg_5);
		lblImg_5.setIcon(img);
		
		JLabel lblImg_6 = new JLabel();
		lblImg_6.setBounds(910, 291, 80, 64);
		panel_1.add(lblImg_6);
		lblImg_6.setIcon(img);
		
		JLabel lblImg_7 = new JLabel();
		lblImg_7.setBounds(20, 477, 80, 64);
		panel_1.add(lblImg_7);
		lblImg_7.setIcon(img);
		
		JLabel lblImg_8 = new JLabel();
		lblImg_8.setBounds(160, 477, 80, 64);
		lblImg_8.setIcon(img);
		panel_1.add(lblImg_8);
		
		JLabel lblImg_9 = new JLabel();
		lblImg_9.setBounds(300, 477, 80, 64);
		panel_1.add(lblImg_9);
		lblImg_9.setIcon(img);
		
		JLabel lblImg_10 = new JLabel();
		lblImg_10.setBounds(630, 477, 80, 64);
		panel_1.add(lblImg_10);
		lblImg_10.setIcon(img);
		
		JLabel lblImg_11 = new JLabel();
		lblImg_11.setBounds(770, 477, 80, 64);
		panel_1.add(lblImg_11);
		lblImg_11.setIcon(img);
		
		JLabel lblImg_12 = new JLabel();
		lblImg_12.setBounds(910, 477, 80, 64);
		panel_1.add(lblImg_12);
		lblImg_12.setIcon(img);
	
		JLabel lblImg_13 = new JLabel();
		lblImg_13.setBounds(400, 610, 80, 64);
		panel_1.add(lblImg_13);
		lblImg_13.setIcon(img);
		
		JLabel lblImg_14 = new JLabel();
		lblImg_14.setBounds(540, 605, 80, 84);
		panel_1.add(lblImg_14);
		lblImg_14.setIcon(img);
		
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0; i < fields.size(); i++)
				{
					fields.get(i).setText("");
				}
			}
		});
		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String[] temp = new String[14];
				for (int i = 0; i < fields.size(); i++)
				{
					System.out.println(fields.get(i).getText());
					temp[i] = fields.get(i).getText();
//					input += fields.get(i).getText();
				}
//					String[] temp = new String[14];
//					for(int i = 0;i < 28;i+=2)temp[i/2] = input.substring(i, i+2);
					Calculator calculator = new Calculator(temp);
					//System.out.println("Points: "+calculator.getWinPoint());
					lblPoint.setText(Integer.toString(calculator.getWinPoint()));
					//System.out.println("Scoring Hands: "+calculator.getWinName());
					lblType.setText(calculator.getWinName());
			}
		});	
	}

//	public static void main(String args[])
//	{
//		
//		System.out.println("Description: H - Honour Tile, S - Bamboo Tile, T - Dots Tile, M - Characters Tile");
//		System.out.println("Winds Tile Description: H1 - East Wind, H2 - South Wind, H3 - West Wind, H4 - North Wind");
//		System.out.println("Dragons Tile Description: H5 - Red, H6 - Green, H7 - White");
//		System.out.println("Simples Tile Description: T1 - 1Dot, S3 - 3 Bamboos, M6 - 6 Characters");
//		System.out.println("Input Example: M1M2M3M4M5M6M7M8M9H7H7H7H6H6");
//		//M1 M2 M3 M4 M5 M6 M7 M8 M9 H7 H7 H7 H6 H6
//		System.out.println("Tips: A Pair of eyes should be placed at the last.");
//		System.out.println("Tips: The input should be in increasing order like H1H2H3 but not H3H2H1");
//		System.out.print("Please input your tiles (14 Tiles):");
//		Scanner in = new Scanner(System.in);
//		String[] temp = new String[14];
//		int count = 0;
//		while(count < 14)
//		{
//			String tiles = in.next();
//			temp[count++] = tiles;
//		}
//		if(count < 14)System.out.println("Error: Insufficient Tiles");
//		else
//		{
////			for(int i = 0;i < 28;i+=2)temp[i/2] = tiles.substring(i, i+2);
//			Calculator calculator = new Calculator(temp);
//			System.out.println("Points: "+calculator.getWinPoint());
//			System.out.println("Scoring Hands: "+calculator.getWinName());
//			in.close();
//		}
//	}
}
