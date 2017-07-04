import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SquareCalculation extends JFrame {

	private JPanel contentPane;
	private JTextField lengthField;
	private JTextField areaResult;
	private JTextField circumfranceResult;
	Square square = new Square();
	private JButton btnBack;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SquareCalculation frame = new SquareCalculation();
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
	public SquareCalculation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lengthField = new JTextField();
		lengthField.setBounds(165, 52, 86, 20);
		contentPane.add(lengthField);
		lengthField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Length");
		lblNewLabel.setBounds(68, 55, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton areaB = new JButton("Area");
		areaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String l = lengthField.getText();
				float[] length = {Float.parseFloat(l)};
				
				float area = square.area(length);
				String Area = Float.toString(area);
				
				
				areaResult.setText(Area);
				
			}
		});
		areaB.setBounds(68, 104, 89, 23);
		contentPane.add(areaB);
		
		JButton circumfranceB = new JButton("Circumfrance");
		circumfranceB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String l = lengthField.getText();
				float[] length = {Float.parseFloat(l)};
				
				float circumfrance = square.circumfrance(length);
				String Circumfrance = Float.toString(circumfrance);
				
				circumfranceResult.setText(Circumfrance);
			}
		});
		circumfranceB.setBounds(269, 104, 117, 23);
		contentPane.add(circumfranceB);
		
		areaResult = new JTextField();
		areaResult.setBounds(71, 151, 86, 20);
		contentPane.add(areaResult);
		areaResult.setColumns(10);
		
		circumfranceResult = new JTextField();
		circumfranceResult.setBounds(278, 151, 86, 20);
		contentPane.add(circumfranceResult);
		circumfranceResult.setColumns(10);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shape_Calculation sc = new Shape_Calculation();
				//sc.main(null);
				
				dispose();
				
			}
		});
		btnBack.setBounds(10, 227, 89, 23);
		contentPane.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//dispose();
				System.exit(0);
			}
		});
		btnExit.setBounds(335, 227, 89, 23);
		contentPane.add(btnExit);
	}

}
