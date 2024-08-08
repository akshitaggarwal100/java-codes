import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class App3 extends Applet implements ActionListener {
		TextField n1;
		TextField n2;
		TextField n3;
	int a, b, c;
	Button bt;
	public void init() {
		n1 = new TextField("Enter number 1: ");
		n2 = new TextField("Enter number 2: ");
		n3 = new TextField("Enter number 3: ");
		add(n1);
		add(n2);
		add(n3);
		bt = new Button("Add");
		bt.addActionListener(this);
		add(bt);
	}

	public void actionPerformed(ActionEvent e) {
		a = Integer.parseInt(n1.getText());
		b = Integer.parseInt(n2.getText());
		c = Integer.parseInt(n3.getText());
		repaint();
	}

	public void paint(Graphics g) {
		Font f = new Font("Arial", Font.BOLD, 25);
		g.setFont(f);
		g.setColor(Color.black);
		int sum = a+b+c;
		g.drawString("Sum = " + sum, 50, 100);
	}
}

/*
<applet code="App3.class" width="900" height="900">
</applet>

*/