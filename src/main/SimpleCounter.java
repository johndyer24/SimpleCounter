package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controller.DecrementController;
import controller.IncrementController;
import model.Model;
import view.Application;

public class SimpleCounter {

	private Model model;
	private Application application;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					SimpleCounter theApp = new SimpleCounter();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create Model, Application, and add Controllers
	 */
	public SimpleCounter() {
		model = new Model();
		application = new Application(model);
		application.getIncrementButton().addActionListener(new IncrementController(model, application));
		application.getDecrementButton().addActionListener(new DecrementController(model, application));
	}

}
