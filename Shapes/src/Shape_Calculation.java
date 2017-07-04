import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Shape_Calculation {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shape_Calculation window = new Shape_Calculation();
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
	public Shape_Calculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton squareB = new JButton("Square");
		squareB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Square s = new Square();
				//Display_Calculation display = new Display_Calculation(s);
				//display.main(null);
				SquareCalculation sq = new SquareCalculation();
				sq.setVisible(true);
				
			}
		});
		squareB.setBounds(165, 51, 89, 23);
		frame.getContentPane().add(squareB);
		
		JButton circleB = new JButton("Circle");
		circleB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CircleCalculation cc = new CircleCalculation();
				cc.setVisible(true);
			}
		});
		circleB.setBounds(165, 86, 89, 23);
		frame.getContentPane().add(circleB);
		
		JButton triangleB = new JButton("Triangle");
		triangleB.setBounds(165, 120, 89, 23);
		frame.getContentPane().add(triangleB);
		
		JLabel lblShapesCalculations = new JLabel("Shapes Calculations");
		lblShapesCalculations.setBounds(169, 0, 112, 33);
		frame.getContentPane().add(lblShapesCalculations);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(401, 31, -359, 14);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 31, 414, 2);
		frame.getContentPane().add(separator_1);
	}
}
