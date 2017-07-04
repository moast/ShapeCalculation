import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircleCalculation extends JFrame {

	private JPanel contentPane;
	private JTextField radiusField;
	private JTextField areaField;
	private JTextField circumfranceField;
	Circle circle = new Circle();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircleCalculation frame = new CircleCalculation();
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
	public CircleCalculation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRadius = new JLabel("Radius");
		lblRadius.setBounds(118, 53, 46, 14);
		contentPane.add(lblRadius);
		
		radiusField = new JTextField();
		radiusField.setBounds(191, 50, 86, 20);
		contentPane.add(radiusField);
		radiusField.setColumns(10);
		
		JButton btnArea = new JButton("Area");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String r = radiusField.getText();
               if(r == null){
					
					return;
				}
				float[] radius = {Float.parseFloat(r)};
				String area = Float.toString(circle.area(radius));
			
				
				
				areaField.setText(area);
			
			
			}
		});
		btnArea.setBounds(75, 106, 89, 23);
		contentPane.add(btnArea);
		
		JButton btnCircumfrance = new JButton("Circumfrance");
		btnCircumfrance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String r = radiusField.getText();
				if(r == null){
					
					return;
				}
				float[] radius = {Float.parseFloat(r)};
				String circumfrance = Float.toString(circle.circumfrance(radius));
				
				circumfranceField.setText(circumfrance);
			}
		});
		btnCircumfrance.setBounds(263, 106, 112, 23);
		contentPane.add(btnCircumfrance);
		
		areaField = new JTextField();
		areaField.setBounds(78, 140, 86, 20);
		contentPane.add(areaField);
		areaField.setColumns(10);
		
		circumfranceField = new JTextField();
		circumfranceField.setText("");
		circumfranceField.setBounds(273, 140, 86, 20);
		contentPane.add(circumfranceField);
		circumfranceField.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Shape_Calculation sc = new Shape_Calculation();
				sc.main(null);
				
				dispose();
				
			}
		});
		btnBack.setBounds(20, 227, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(321, 227, 89, 23);
		contentPane.add(btnExit);
	}

}
