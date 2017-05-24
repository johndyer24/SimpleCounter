package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import model.Model;

public class Application extends JFrame {

	private Model model;
	private JPanel contentPane;
	private JButton incrementButton;
	private JButton decrementButton;
	private JLabel counterLabel;

	/**
	 * Create the frame.
	 */
	public Application(Model model) {
		
		// setup Model
		this.model = model;
		
		// setup components
		incrementButton = new JButton("+");
		incrementButton.setBounds(310, 130, 40, 40);
		incrementButton.setOpaque(true);
		incrementButton.setFocusPainted(false);
		incrementButton.setBackground(new Color(247, 133, 182));
		incrementButton.setMargin(new Insets(5, 5, 5, 5));
		incrementButton.setFont(new Font("Sans Serif", Font.BOLD, 24));
		
		decrementButton = new JButton("-");
		decrementButton.setBounds(100, 130, 40, 40);
		decrementButton.setOpaque(true);
		decrementButton.setFocusPainted(false);
		decrementButton.setBackground(new Color(247, 133, 182));
		decrementButton.setMargin(new Insets(5, 5, 5, 5));
		decrementButton.setFont(new Font("Sans Serif", Font.BOLD, 24));
		
		counterLabel = new JLabel(String.valueOf(model.getCounterValue()));
		counterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		counterLabel.setBounds(175, 125, 100, 50);
		counterLabel.setFont(new Font("Sans Serif", Font.BOLD, 36));
		
		// setup JPanel
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setOpaque(true);
		contentPane.setBackground(new Color(200, 222, 255));
		contentPane.setLayout(null);
		contentPane.add(incrementButton);
		contentPane.add(decrementButton);
		contentPane.add(counterLabel);
		
		// setup JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("SimpleCounter");
		setContentPane(contentPane);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void refresh() {
		counterLabel.setText(String.valueOf(model.getCounterValue()));
	}
	
	public JButton getIncrementButton() {
		return incrementButton;
	}
	
	public JButton getDecrementButton() {
		return decrementButton;
	}

}
