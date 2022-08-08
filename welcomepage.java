package parkingproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;

public class welcomepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomepage frame = new welcomepage();
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
	public welcomepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO myPARKING");
		lblNewLabel.setBounds(99, 13, 236, 40);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LOGIN AS ADMIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adminlogin adlog=new adminlogin();
				adlog.setVisible(true);
			}
		});
		btnNewButton.setBounds(31, 81, 168, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN AS SECURITY MANAGER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secmanwel slogin=new secmanwel();
				slogin.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(31, 133, 244, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LOGIN TO BOOK PARKING");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginToBookParking lgbook=new loginToBookParking();
				lgbook.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(31, 191, 200, 25);
		contentPane.add(btnNewButton_2);
	}
}
