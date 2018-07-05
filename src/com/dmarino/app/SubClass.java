package com.dmarino.app;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SubClass extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1171845788111126058L;
	private int cantidad;
	private JTextField clicks;
		
	
	public SubClass() {
		this.cantidad=0;
		setLayout(new GridLayout(3,1));
	        
	    add(new JLabel("Contador de clicks: "));
	        
	    clicks = new JTextField();
	    clicks.setText(this.cantidad+"");
	    clicks.setEditable(false);
	    add(clicks);
	        
	    JButton boton = new JButton("click");
	    boton.addActionListener(this);
	    boton.setActionCommand("click");     
	    
	    boton.setBackground(new Color(0,200,25));
	    add(boton);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("click")) {
			this.cantidad++;
			clicks.setText(this.cantidad+"");
		}
	}
}