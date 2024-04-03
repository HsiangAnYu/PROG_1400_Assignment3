package Panel;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CharacterSelecetPanel extends JPanel {
    //array for radio button
    private String[] charArr = new String[]{"Ninja", "Archer", "Knight", "Shaman"};
    private String[] weaponArr = new String[]{"Halberd", "Rapier", "Ice Wand"};
    private String[] armorArr  = new String[]{"Chain Mail", "Sputum", "Amulet"};

    //all objects that need to be use in JFrame
    private JLabel characterImage = new JLabel("");
    private JTextArea characterDescription = new JTextArea("This is Ninja, it has 5 bonus def");
    private JRadioButton charRadio1 = new JRadioButton(charArr[0]);
    private JRadioButton charRadio2 = new JRadioButton(charArr[1]);
    private JRadioButton charRadio3 = new JRadioButton(charArr[2]);
    private JRadioButton charRadio4 = new JRadioButton(charArr[3]);
    private JTextField characterName = new JTextField("Player");
    private JTextField characterHP = new JTextField(String.valueOf(new Random().nextInt(100,200)));
    private JTextField characterMP = new JTextField(String.valueOf(new Random().nextInt(100,200)));
    private JTextField characterATK = new JTextField(String.valueOf(new Random().nextInt(10,20)));
    private JTextField characterDEF = new JTextField(String.valueOf(new Random().nextInt(10,20)));
    private JButton rerollButton = new JButton("Reroll");
    private JButton selectButton = new JButton("Select");
    private JRadioButton weaponRadio1 = new JRadioButton(weaponArr[0]);
    private JRadioButton weaponRadio2 = new JRadioButton(weaponArr[1]);
    private JRadioButton weaponRadio3 = new JRadioButton(weaponArr[2]);
    private JRadioButton armorRadio1 = new JRadioButton(armorArr[0]);
    private JRadioButton armorRadio2 = new JRadioButton(armorArr[1]);
    private JRadioButton armorRadio3 = new JRadioButton(armorArr[2]);
    private JLabel itemImage = new JLabel();
    private JTextArea itemDescription = new JTextArea("Halberd\nAtk + 10");

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
        ImageIcon ninjaImage = new ImageIcon("Image/Ninja.png");
        characterImage.setIcon(ninjaImage);


        characterDescription.setBounds(60,350,280,100);
        characterDescription.setMargin(new Insets(10,10,10,10));
        characterDescription.setFont(buttonFont);
        characterDescription.setEnabled(false);//make it not able to input
        characterDescription.setDisabledTextColor(Color.black);//change text color

        //character select
        charRadio1.setBounds(500, 0, 100, 50);
        charRadio1.setFont(buttonFont);
        charRadio2.setBounds(600,0,100,50);
        charRadio2.setFont(buttonFont);
        charRadio3.setBounds(700,0,100,50);
        charRadio3.setFont(buttonFont);
        charRadio4.setBounds(800,0,100,50);
        charRadio4.setFont(buttonFont);
        charRadio1.setSelected(true);

        //button group for character
        ButtonGroup charRadioGroup = new ButtonGroup();
        charRadioGroup.add(charRadio1);
        charRadioGroup.add(charRadio2);
        charRadioGroup.add(charRadio3);
        charRadioGroup.add(charRadio4);

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
        weaponRadio1.setSelected(true);

        //button group for weapon
        ButtonGroup weaponRadioGroup = new ButtonGroup();
        weaponRadioGroup.add(weaponRadio1);
        weaponRadioGroup.add(weaponRadio2);
        weaponRadioGroup.add(weaponRadio3);


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
        armorRadio1.setSelected(true);

        //button group from armor
        ButtonGroup armorRadioGroup = new ButtonGroup();
        armorRadioGroup.add(armorRadio1);
        armorRadioGroup.add(armorRadio2);
        armorRadioGroup.add(armorRadio3);

        //item image and description
        itemImage.setBounds(550,504,192,192);
        itemImage.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        ImageIcon halberdImage = new ImageIcon("Image/Halberd.png");
        itemImage.setIcon(halberdImage);

        itemDescription.setBounds(750, 500, 150, 200);
        itemDescription.setMargin(new Insets(10,10,10,10));
        itemDescription.setFont(buttonFont);
        itemDescription.setEnabled(false);//make it not able to input
        itemDescription.setDisabledTextColor(Color.black);//change text color


        this.add(characterLabel);
        this.add(characterImage);
        this.add(characterDescription);
        this.add(charRadio1);
        this.add(charRadio3);
        this.add(charRadio4);
        this.add(charRadio2);
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
        this.add(itemImage);
        this.add(itemDescription);
    }

    public JLabel getCharacterImage() {
        return characterImage;
    }

    public JTextArea getCharacterDescription() {
        return characterDescription;
    }

    public JRadioButton getCharRadio1() {
        return charRadio1;
    }

    public JRadioButton getCharRadio2() {
        return charRadio2;
    }

    public JRadioButton getCharRadio3() {
        return charRadio3;
    }

    public JRadioButton getCharRadio4() {
        return charRadio4;
    }

    public JTextField getCharacterName() {
        return characterName;
    }

    public JTextField getCharacterHP() {
        return characterHP;
    }

    public JTextField getCharacterMP() {
        return characterMP;
    }

    public JTextField getCharacterATK() {
        return characterATK;
    }

    public JTextField getCharacterDEF() {
        return characterDEF;
    }

    public JButton getRerollButton() {
        return rerollButton;
    }

    public JButton getSelectButton() {
        return selectButton;
    }

    public JRadioButton getWeaponRadio1() {
        return weaponRadio1;
    }

    public JRadioButton getWeaponRadio2() {
        return weaponRadio2;
    }

    public JRadioButton getWeaponRadio3() {
        return weaponRadio3;
    }

    public JRadioButton getArmorRadio1() {
        return armorRadio1;
    }

    public JRadioButton getArmorRadio2() {
        return armorRadio2;
    }

    public JRadioButton getArmorRadio3() {
        return armorRadio3;
    }

    public JLabel getItemImage() {
        return itemImage;
    }

    public JTextArea getItemDescription() {
        return itemDescription;
    }
}
