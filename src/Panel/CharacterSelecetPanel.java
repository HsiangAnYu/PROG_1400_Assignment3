package Panel;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CharacterSelecetPanel extends JPanel {

    //all objects that need to be use in JFrame
    private JLabel characterImage = new JLabel("");
    private JTextArea characterDescription = new JTextArea("");
    private JRadioButton charNinjaRadio = new JRadioButton("Ninja");
    private JRadioButton charArcherRadio = new JRadioButton("Archer");
    private JRadioButton charKnightRadio = new JRadioButton("Knight");
    private JRadioButton charShamanRadio = new JRadioButton("Shaman");
    private JTextField characterName = new JTextField();
    private JTextField characterHP = new JTextField(String.valueOf(new Random().nextInt(100,200)));
    private JTextField characterMP = new JTextField(String.valueOf(new Random().nextInt(100,200)));
    private JTextField characterATK = new JTextField(String.valueOf(new Random().nextInt(10,20)));
    private JTextField characterDEF = new JTextField(String.valueOf(new Random().nextInt(10,20)));
    private JButton rerollButton = new JButton("Reroll");
    private JButton selectButton = new JButton("Select");
    private JRadioButton weaponHalberd = new JRadioButton("Halberd");
    private JRadioButton weaponRapier = new JRadioButton("Rapier");
    private JRadioButton weaponIceWand = new JRadioButton("Ice Wand");
    private JRadioButton armorChainMail = new JRadioButton("ChainMail");
    private JRadioButton armorScutum = new JRadioButton("Scutum");
    private JRadioButton armorAmulet = new JRadioButton("Amulet");
    private JLabel itemImage = new JLabel();
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
        ImageIcon ninjaImage = new ImageIcon("Image/Ninja.png");
        characterImage.setIcon(ninjaImage);


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
        charNinjaRadio.setSelected(true);

        //button group for character
        ButtonGroup charRadioGroup = new ButtonGroup();
        charRadioGroup.add(charNinjaRadio);
        charRadioGroup.add(charArcherRadio);
        charRadioGroup.add(charKnightRadio);
        charRadioGroup.add(charShamanRadio);

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

        weaponHalberd.setBounds(60,550,240,50);
        weaponHalberd.setFont(buttonFont);
        weaponRapier.setBounds(60,600,240,50);
        weaponRapier.setFont(buttonFont);
        weaponIceWand.setBounds(60,650,240,50);
        weaponIceWand.setFont(buttonFont);
        weaponHalberd.setSelected(true);

        //button group for weapon
        ButtonGroup weaponRadioGroup = new ButtonGroup();
        weaponRadioGroup.add(weaponHalberd);
        weaponRadioGroup.add(weaponRapier);
        weaponRadioGroup.add(weaponIceWand);


        //armor radio button
        JLabel armorLabel = new JLabel("Select Armor: ");
        armorLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        armorLabel.setBounds(300,500,240,50);

        armorChainMail.setBounds(300,550,240,50);
        armorChainMail.setFont(buttonFont);
        armorScutum.setBounds(300,600,240,50);
        armorScutum.setFont(buttonFont);
        armorAmulet.setBounds(300,650,240,50);
        armorAmulet.setFont(buttonFont);
        armorChainMail.setSelected(true);

        //button group from armor
        ButtonGroup armorRadioGroup = new ButtonGroup();
        armorRadioGroup.add(armorChainMail);
        armorRadioGroup.add(armorScutum);
        armorRadioGroup.add(armorAmulet);

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
        this.add(weaponHalberd);
        this.add(weaponRapier);
        this.add(weaponIceWand);
        this.add(armorLabel);
        this.add(armorChainMail);
        this.add(armorScutum);
        this.add(armorAmulet);
        this.add(itemImage);
        this.add(itemDescription);
        this.setVisible(true);//default first page
    }
}
