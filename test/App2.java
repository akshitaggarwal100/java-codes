import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class App2 extends Applet implements ActionListener {
	double celcius;
	double fahrenheit;

	Label cLabel;
	TextField cInput;

	Button b;

	public void init() {
		cLabel = new Label("Enter in celcius: ");
		add(cLabel);

		cInput = new TextField(20);
		add(cInput);

		b = new Button("Convert");
		b.addActionListener(this);
		add(b);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			celcius = Double.parseDouble(cInput.getText());
			fahrenheit = ((celcius * 9) / 5) + 32;
			repaint();
		} catch (Exception er) {
			showStatus("Enter valid input");
		}
	}

	public void paint(Graphics g) {
		Font f = new Font("Arial", Font.BOLD, 25);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString(celcius + "Celcius = " + fahrenheit + "Fahrenheit", 30, 200);
	}
}