package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.Application;

public class IncrementController implements ActionListener {
	
	Model model;
	Application application;
	
	public IncrementController(Model model, Application application) {
		this.model = model;
		this.application = application;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.incrementCounter();
		application.refresh();
	}

}
