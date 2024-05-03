package DoublePendulum;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DoublePendulumFrame extends JFrame {
    DoublePendulumShape pendulum1 = new DoublePendulumShape();
    JPanel graphics;
    JPanel mainPanel;
    JTextArea title;

    public DoublePendulumFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        graphics = new JPanel();
        title = new JTextArea("Chaos theory in action:");
        mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(graphics, BorderLayout.CENTER);
        mainPanel.add(title, BorderLayout.NORTH);
        
        this.setContentPane(mainPanel);
        this.setSize(new Dimension(500, 500));

        
        this.repaint();
    }

}
