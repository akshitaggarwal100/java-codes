import java.awt.event.*;
import java.applet.*
import java.awt.*;

public class App4 extends Applet implements ActionListener {
	Button b;
	TextField num;
	int n;
	public void init() {
		num = new TextField(20);
		add(num);
		b = new Button("Convert");
		b.addActionListener(this);
		add(b);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
		try {
			n = Integer.parse
			repaint();
		} catch (Exception er) {
			showStatus("Enter valid input");
		}
		}
	}

	public void paint(Graphics g) {
		Font f = new Font("Arial", Font.BOLD, 25);
		g.setFont(f);
		g.setColor(Color.black);
		for(int i = 1; i <= 10; i++) {
			
		}
	}
}