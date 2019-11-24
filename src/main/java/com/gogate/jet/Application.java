package com.gogate.jet;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.gogate.jet.components.RepositoriesPanel;
import com.gogate.jet.components.SettingsPanel;

public class Application extends JFrame {

	private static final long serialVersionUID = 1L;

	public void createAndShowGUI() {
	    this.setSize(600, 400);	    
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JTabbedPane tabbedPane = new JTabbedPane();
	    JComponent panelSettings = new SettingsPanel();
	    tabbedPane.addTab("Settings", null, panelSettings,"Settings");
	    JComponent panelRepositories = new RepositoriesPanel();
	    tabbedPane.addTab("Repositories", null, panelRepositories,"Repositories");	    
	    this.add(tabbedPane);
	    this.setVisible(true);
	    
	}

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
	    	public void run() {
	    		Application app = new Application();
	    		UIManager.put("swing.boldMetal", Boolean.FALSE);
			    app.createAndShowGUI();
	    	}
	    });
	}
	
}
