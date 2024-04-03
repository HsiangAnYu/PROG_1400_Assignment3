package Panel;

import javax.swing.*;

public class StartPanel extends JPanel {
    private JButton startBotton;

    public StartPanel() {
        this.setBounds(0,0, super.getWidth(), super.getHeight());
        this.setLayout(null);

        startBotton = new JButton("Start");
        startBotton.setBounds(400, 250, 300, 50);

        this.add(startBotton);
        this.setVisible(true);//default first page

        this.setVisible(true);//default first page
    }

    public JButton getStartBotton() {
        return startBotton;
    }
}
