package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.Application;

public class DecrementController implements ActionListener {
	
	Model model;
	Application application;
	
	public DecrementController(Model model, Application application) {
		this.model = model;
		this.application = application;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.decrementCounter();
		application.refresh();
	}

}
