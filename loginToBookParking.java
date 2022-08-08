package parkingproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginToBookParking extends JFrame {

	private JPanel contentPane;
	private JTextField txtPleaseCanYour;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginToBookParking frame = new loginToBookParking();
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
	public loginToBookParking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPleaseCanYour = new JTextField();
		txtPleaseCanYour.setEditable(false);
		txtPleaseCanYour.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseCanYour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPleaseCanYour.setText("PLEASE SCAN YOUR REGISTERED PARKING ID");
		txtPleaseCanYour.setBounds(32, 111, 388, 67);
		contentPane.add(txtPleaseCanYour);
		txtPleaseCanYour.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PLEASE ENTER USER ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(32, 37, 206, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(250, 39, 170, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("AND");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(175, 74, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(158, 191, 97, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcomepage wlpg=new welcomepage();
				wlpg.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(357, 0, 75, 25);
		contentPane.add(btnNewButton_1);
	}
}
