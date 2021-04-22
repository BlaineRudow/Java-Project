package priority;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StatScene implements ActionListener{
	JFrame window = new JFrame("Dungeons & Dragons Character Creator - Stats");
	JLabel titleLabel = new JLabel("Character Stats:");
	JLabel charLabel = new JLabel( "Character Name: " + Main.player.name );
	JLabel raceLabel = new JLabel( "Character Race: " + Main.player.race );
	JLabel classLabel = new JLabel("Character Class: " + Main.player.charClass);
	JButton previousButton = new JButton("Previous");
	GridLayout gl = new GridLayout();
	
	StatScene(){		
		//Layout stuff
		gl.setRows(5);
		gl.setColumns(1);
		window.setLayout(gl);
		
		//Add listener to buttons
		previousButton.addActionListener(this);
		
		window.add(titleLabel);
		window.add(charLabel);
		window.add(raceLabel);
		window.add(classLabel);
		window.add(previousButton);
		
		// more layout stuff
		window.setSize(800,400);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==previousButton ) {
			ClassScene c = new ClassScene();
		}	
	}
	
}
