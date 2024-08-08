import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class App extends Applet implements ActionListener {
    Label radiusL;
    Label colorL;
    TextField radius;
    TextField color;
    Button b;
    Color c;
    int r;

    public void init() {
        radiusL = new Label("Enter Radius: ");
        add(radiusL);

        radius = new TextField(20);
        add(radius);

        colorL = new Label("Enter Color: ");
        add(colorL);

        color = new TextField(20);
        add(color);

        b = new Button("Make Circle");
        add(b);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            c = Color.decode(color.getText());
            r = Integer.parseInt(radius.getText());

            repaint();
        } catch (NumberFormatException e) {
            showStatus("Enter valid input");
        }
    }

    public void paint(Graphics g) {
        g.setColor(c);
        g.fillOval(r, r, r * 2, r * 2);
    }
}
