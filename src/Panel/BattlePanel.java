package Panel;

import javax.swing.*;
import java.awt.*;

public class BattlePanel extends JPanel {

    //all objects that need to be use in JFrame
    private JLabel playerImage = new JLabel();
    private JLabel monsterImage = new JLabel();
    private JTextArea playerDescription = new JTextArea();
    private JTextArea monsterDescription = new JTextArea();
    private JTextArea battleDescription = new JTextArea();

    Font descriptionFont = new Font("Comic Sans MS", Font.PLAIN, 16);

    public BattlePanel () {
        this.setBounds(0,0, super.getWidth(), super.getHeight());
        this.setLayout(null);

        //image
        JLabel characterLabel = new JLabel("Character", SwingConstants.CENTER);
        characterLabel.setBounds(60,0,280,50);
        characterLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        playerImage.setBounds(60,50,280,280);
        playerImage.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        JLabel monserLabel = new JLabel("Monster", SwingConstants.CENTER);
        monserLabel.setBounds(660,0,280,50);
        monserLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        monsterImage.setBounds(660,50,280,280);
        monsterImage.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        JLabel vsLabel = new JLabel("VS", SwingConstants.CENTER);
        vsLabel.setBounds(400,200,200,50);
        vsLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        //player description
        playerDescription.setBounds(60, 400, 200, 300);
        playerDescription.setMargin(new Insets(10,10,10,10));
        playerDescription.setFont(descriptionFont);
        playerDescription.setEnabled(false);//make it not able to input
        playerDescription.setDisabledTextColor(Color.black);//change text color

        //monster description
        monsterDescription.setBounds(740, 400, 200, 300);
        monsterDescription.setMargin(new Insets(10,10,10,10));
        monsterDescription.setFont(descriptionFont);
        monsterDescription.setEnabled(false);//make it not able to input
        monsterDescription.setDisabledTextColor(Color.black);//change text color

        //battle description
        battleDescription.setBounds(340, 400, 320, 300);
        battleDescription.setMargin(new Insets(10,10,10,10));
        battleDescription.setFont(descriptionFont);
        battleDescription.setEnabled(false);//make it not able to input
        battleDescription.setDisabledTextColor(Color.black);//change text color

        //add objects to panel
        this.add(characterLabel);
        this.add(playerImage);
        this.add(monsterImage);
        this.add(monserLabel);
        this.add(vsLabel);
        this.add(playerDescription);
        this.add(monsterDescription);
        this.add(battleDescription);
    }

    public JLabel getPlayerImage() {
        return playerImage;
    }

    public JLabel getMonsterImage() {
        return monsterImage;
    }

    public JTextArea getPlayerDescription() {
        return playerDescription;
    }

    public JTextArea getMonsterDescription() {
        return monsterDescription;
    }

    public JTextArea getBattleDescription() {
        return battleDescription;
    }

    public Font getDescriptionFont() {
        return descriptionFont;
    }
}
