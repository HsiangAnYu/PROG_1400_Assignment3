package Panel;

import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {
    //all objects that need to be use in JFrame
    private JButton startButton;

    public StartPanel() {
        //set panel size
        this.setBounds(0,0, super.getWidth(), super.getHeight());
        this.setLayout(null);

        //title and title image
        JLabel titleLabel = new JLabel("Character Generator", SwingConstants.CENTER);
        titleLabel.setBounds(200,50,600,100);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 48));

        JLabel titleImage = new JLabel();
        titleImage.setBounds(290,200,420,300);
        ImageIcon tImage  = new ImageIcon("Image/Skull Dragon.png");
        titleImage.setIcon(tImage);

        //start button
        startButton = new JButton("Start");
        startButton.setBounds(300, 550, 400, 100);
        startButton.setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        //add to panel
        this.add(startButton);
        this.add(titleImage);
        this.add(titleLabel);

        this.setVisible(true);//default first page
    }

    public JButton getStartButton() {
        return startButton;
    }
}
