


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Carr�Parfait {


	public static void main(String[] args) 
	{
		Fenetre win = new Fenetre();
		
		
		
		System.out.println("choisissez un nombre");

	}
	
	public static class Fenetre extends JFrame 
	{
		public Fenetre()
		{
			this.setTitle("Ma premi�re fen�tre Java");
			this.setSize(800, 500);
			this.setLocationRelativeTo(null);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		    this.setVisible(true);
		    
		    JPanel pan = new JPanel();
		    pan.setBackground(Color.GRAY);
		    this.add(pan);
		    //this.setContentPane(pan);
		    
		    JLabel label1 = new JLabel("Choisissez un nombre");
		    pan.add(label1);
		    label1.setHorizontalTextPosition(JLabel.CENTER);
		    
		    JTextField text = new JTextField("ici");
		    label1.setHorizontalTextPosition(JLabel.CENTER);
		    
		    pan.add(text);
		    
		    JButton button = new JButton("Validez");
		    pan.add(button);
		    label1.setHorizontalTextPosition(JLabel.CENTER);
		    button.addActionListener (new Action1());
		 }
	}
	
	static class Action1 implements ActionListener {        
		  public void actionPerformed (ActionEvent e) {     
		    
			  
			String nb = text.getText();
			  
			 JFrame frame2 = new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(200,200);
		    JLabel label = new JLabel("you clicked me");
		    JPanel panel = new JPanel();
		    frame2.add(panel);
		    panel.add(label);       
		  }
		}   

}
