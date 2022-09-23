package web.browser.surendra;

import javax.swing.*;
import javafx.application.PlatForm;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebView;
import javafx.scene.Scene;

public class WebBrowser extends JFrame implements Runnable{
	
	private JFXPanel panel;

	public void run(){
		setTitle("Search");
		setBounds(0,0,1950,1050);
		setVisible(true);
		
		panel=new JFXPanel();
		add(panel);
		
		Platform.runLater(() ->  {
			WebView view=new WebView();
			view.getEngine().load("http://www.google.com");
		
			panel.setScene(new Scene(view));
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new WebBrowser());
	}

}
