package parkingproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ticketissue extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketissue frame = new ticketissue();
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
	public ticketissue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Issue Parking Violation Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retributionuser reuser=new retributionuser();
				reuser.setVisible(true);
			}
		});
		btnNewButton.setBounds(24, 57, 226, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Extend Parking Time");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EXTENDTIME extime=new EXTENDTIME();
				extime.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(24, 128, 226, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit Spot Session Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editparkslotdetail eprkdet=new editparkslotdetail();
				eprkdet.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(24, 196, 226, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOG OUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secmanwel secwel=new secmanwel();
				secwel.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(337, 0, 95, 25);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("myPARKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(79, 0, 171, 31);
		contentPane.add(lblNewLabel);
	}

}
