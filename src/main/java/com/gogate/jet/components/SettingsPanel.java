package com.gogate.jet.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingsPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(SettingsPanel.class);
	private JButton saveButton;
	private JButton loadButton;
	private JTextField settingsFilePath;
	private JFileChooser fileChooser;
	
	public SettingsPanel() {
		init();
	}
	
	public void init(){
		this.setLayout(new FlowLayout());
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		settingsFilePath = new JTextField();
		settingsFilePath.setColumns(30);
		fileChooser = new JFileChooser();
		fileChooser.setVisible(false);
		loadButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				logger.info(e.getActionCommand());
			}			
		});
		this.add(fileChooser);
		this.add(settingsFilePath);
		this.add(saveButton);
		this.add(loadButton);
		this.setVisible(true);		
	}
	
}

