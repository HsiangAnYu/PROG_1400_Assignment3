package panel;

import javax.swing.*;
import java.awt.*;

public class CharacterSelecetPanel extends JPanel {

    private JLabel characterImage = new JLabel("");
    private JTextArea characterDescription = new JTextArea("");
    private JRadioButton charNinjaRadio = new JRadioButton("Ninja");
    private JRadioButton charArcherRadio = new JRadioButton("Archer");
    private JRadioButton charKnightRadio = new JRadioButton("Knight");
    private JRadioButton charShamanRadio = new JRadioButton("Shaman");
    private JTextField characterName = new JTextField();
    private JTextField characterHP = new JTextField();
    private JTextField characterMP = new JTextField();
    private JTextField characterATK = new JTextField();
    private JTextField characterDEF = new JTextField();
    private JButton rerollButton = new JButton("Reroll");
    private JButton selectButton = new JButton("Select");
    private JRadioButton weaponRadio1 = new JRadioButton("Weapon");
    private JRadioButton weaponRadio2 = new JRadioButton("Weapon");
    private JRadioButton weaponRadio3 = new JRadioButton("Weapon");
    private JRadioButton armorRadio1 = new JRadioButton("Armor");
    private JRadioButton armorRadio2 = new JRadioButton("Armor");
    private JRadioButton armorRadio3 = new JRadioButton("Armor");
    private JTextArea itemDescription = new JTextArea("Item Description");

    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 16);

    public CharacterSelecetPanel() {
        this.setBounds(0,0, super.getWidth(), super.getHeight());
        this.setLayout(null);

        //character image
        JLabel characterLabel = new JLabel("Character Generator", SwingConstants.CENTER);
        characterLabel.setBounds(60,0,280,50);
        characterLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        characterImage.setBounds(60,50,280,280);
        characterImage.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        characterDescription.setBounds(60,350,280,100);
        characterDescription.setMargin(new Insets(10,10,10,10));
        characterDescription.setFont(buttonFont);
        characterDescription.setEnabled(false);//make it not able to input
        characterDescription.setDisabledTextColor(Color.black);//change text color

        //character select
        charNinjaRadio.setBounds(500, 0, 100, 50);
        charNinjaRadio.setFont(buttonFont);
        charArcherRadio.setBounds(600,0,100,50);
        charArcherRadio.setFont(buttonFont);
        charKnightRadio.setBounds(700,0,100,50);
        charKnightRadio.setFont(buttonFont);
        charShamanRadio.setBounds(800,0,100,50);
        charShamanRadio.setFont(buttonFont);

        //character info
        JLabel nameLabel = new JLabel("Enter Name: ");
        nameLabel.setBounds(500,100,100,50);
        nameLabel.setFont(buttonFont);
        characterName.setBounds(600,100,300,50);
        characterName.setFont(buttonFont);

        JLabel characterHPLabel = new JLabel("HP:");
        characterHPLabel.setBounds(400, 200,100,50);
        characterHPLabel.setFont(buttonFont);
        JLabel characterMPLabel = new JLabel("MP:");
        characterMPLabel.setBounds(400,300,100,50);
        characterMPLabel.setFont(buttonFont);
        JLabel characterAtkLabel = new JLabel("ATK:");
        characterAtkLabel.setBounds(600,200,100,50);
        characterAtkLabel.setFont(buttonFont);
        JLabel characterDefLabel = new JLabel("DEF:");
        characterDefLabel.setBounds(600,300,100,50);
        characterDefLabel.setFont(buttonFont);

        characterHP.setBounds(480,200,100,50);
        characterHP.setFont(buttonFont);
        characterHP.setEnabled(false);
        characterHP.setDisabledTextColor(Color.black);
        characterMP.setBounds(480,300,100,50);
        characterMP.setFont(buttonFont);
        characterMP.setEnabled(false);
        characterMP.setDisabledTextColor(Color.black);
        characterATK.setBounds(680,200,100,50);
        characterATK.setFont(buttonFont);
        characterATK.setEnabled(false);
        characterATK.setDisabledTextColor(Color.black);
        characterDEF.setBounds(680,300,100,50);
        characterDEF.setFont(buttonFont);
        characterDEF.setEnabled(false);
        characterDEF.setDisabledTextColor(Color.black);

        //check button
        rerollButton.setBounds(830,230,110,90);
        rerollButton.setFont(buttonFont);
        selectButton.setBounds(600, 400,300,50);
        selectButton.setFont(buttonFont);

        //weapon radio button
        JLabel weaponLabel = new JLabel("Select Weapon: ");
        weaponLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        weaponLabel.setBounds(60,500,240,50);

        weaponRadio1.setBounds(60,550,240,50);
        weaponRadio1.setFont(buttonFont);
        weaponRadio2.setBounds(60,600,240,50);
        weaponRadio2.setFont(buttonFont);
        weaponRadio3.setBounds(60,650,240,50);
        weaponRadio3.setFont(buttonFont);


        //armor radio button
        JLabel armorLabel = new JLabel("Select Armor: ");
        armorLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        armorLabel.setBounds(300,500,240,50);

        armorRadio1.setBounds(300,550,240,50);
        armorRadio1.setFont(buttonFont);
        armorRadio2.setBounds(300,600,240,50);
        armorRadio2.setFont(buttonFont);
        armorRadio3.setBounds(300,650,240,50);
        armorRadio3.setFont(buttonFont);



        itemDescription.setBounds(600, 500, 300, 200);
        itemDescription.setMargin(new Insets(10,10,10,10));
        itemDescription.setFont(buttonFont);
        itemDescription.setEnabled(false);//make it not able to input
        itemDescription.setDisabledTextColor(Color.black);//change text color


        this.add(characterLabel);
        this.add(characterImage);
        this.add(characterDescription);
        this.add(charNinjaRadio);
        this.add(charKnightRadio);
        this.add(charShamanRadio);
        this.add(charArcherRadio);
        this.add(nameLabel);
        this.add(characterName);
        this.add(characterHPLabel);
        this.add(characterMPLabel);
        this.add(characterAtkLabel);
        this.add(characterDefLabel);
        this.add(characterHP);
        this.add(characterMP);
        this.add(characterATK);
        this.add(characterDEF);
        this.add(rerollButton);
        this.add(selectButton);

        this.add(weaponLabel);
        this.add(weaponRadio1);
        this.add(weaponRadio2);
        this.add(weaponRadio3);
        this.add(armorLabel);
        this.add(armorRadio1);
        this.add(armorRadio2);
        this.add(armorRadio3);
        this.add(itemDescription);
        this.setVisible(true);//default first page
    }
}
