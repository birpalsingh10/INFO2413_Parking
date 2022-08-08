package parkingproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class retributionuser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					retributionuser frame = new retributionuser();
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
	public retributionuser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PARKING VIOLATION TICKET");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(93, 0, 259, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(22, 46, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(171, 43, 196, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TICKET ISSUE DATE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(22, 86, 116, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 83, 196, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("VEHICLE NUMBER PLATE");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(22, 127, 150, 16);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(171, 124, 196, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("VIOLATION TYPE");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(22, 166, 116, 16);
		contentPane.add(lblNewLabel_4);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("PARKING AT WRONG SPOT");
		chckbxNewCheckBox.setBounds(171, 162, 196, 25);
		contentPane.add(chckbxNewCheckBox);
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PARKING BEFORE OR AFTER AUTHORISED TIME");
		chckbxNewCheckBox_1.setBounds(171, 212, 311, 25);
		contentPane.add(chckbxNewCheckBox_1);
		
		final JCheckBox chckbxNewCheckBox_2 = new JCheckBox("OCCUPY MORE THAN ONE SPOT");
		chckbxNewCheckBox_2.setBounds(171, 262, 231, 25);
		contentPane.add(chckbxNewCheckBox_2);
		
		final JCheckBox chckbxNewCheckBox_3 = new JCheckBox("OTHER(PROPERTY, LOUD MUSIC, RASH DRIVING)");
		chckbxNewCheckBox_3.setBounds(171, 312, 312, 25);
		contentPane.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ticketissue ticissue=new ticketissue();
				ticissue.setVisible(true);
			}
		});
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userID=textField.getText();
				String issuedate=textField_1.getText();
				String vehnum=textField_2.getText();
				
				if(chckbxNewCheckBox.isSelected()) {
					String viotype="PARKING AT WRONG SPOT";
					
				}
				else if(chckbxNewCheckBox_1.isSelected()) {
					String viotype="PARKING BEFORE OR AFTER AUTHORISED TIME";
					
				}
				else if(chckbxNewCheckBox_2.isSelected()) {
					String viotype="OCCUPY MORE THAN ONE SPOT";
					
				}
				else if(chckbxNewCheckBox_3.isSelected()) {
					String viotype="OTHER(PROPERTY, LOUD MUSIC, RASH DRIVING";
					
				}
				
				String viotype=textField_2.getText();
				ticsubmit obj=new ticsubmit();
				obj.my_ticsubmit(userID,issuedate,vehnum,viotype);
			}
		});
		btnNewButton.setBounds(152, 361, 97, 25);
		contentPane.add(btnNewButton);
		btnNewButton_1.setBounds(413, 0, 69, 25);
		contentPane.add(btnNewButton_1);
	}
}
