import Item.Armor;
import Item.Weapon;
import Character.*;
import Panel.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class ProgramWindow extends JFrame {
    private Player charSelection;
    private Weapon[] weaponArr = new Weapon[]{new Weapon("Halberd", 10), new Weapon("Rapier", 8), new Weapon("Ice Wand", 5)};
    private Armor[] armorArr = new Armor[]{new Armor("Chain Mail",100,0,10),
                                            new Armor("Sputum", 50,0,20),
                                            new Armor("Amulet",40,40,0)};

    private Weapon weaponChoice = weaponArr[0];
    private Armor armorChoice = armorArr[0];

    public ProgramWindow() {
        this.setResizable(false);
        this.setBounds(100, 0, 1000, 800);
        this.setTitle("Assignment 3");
        this.setLayout(new CardLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Exits program when X is hit

        StartPanel startPage = new StartPanel();
        CharacterSelecetPanel selectPage = new CharacterSelecetPanel();
        BattlePanel battlePage = new BattlePanel();


        startPage.getStartBotton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startPage.setVisible(false);
                selectPage.setVisible(true);
            }
        });

        selectPage.getSelectButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //create monster and character when button press
                Monster slime = new Monster();
                ImageIcon mImage = new ImageIcon("Image/slime.png");
                battlePage.getMonsterImage().setIcon(mImage);
                battlePage.getMonsterDescription().setText(slime.toString());

                if(selectPage.getCharRadio1().isSelected())
                {
                    charSelection = new Ninja(selectPage.getCharacterName().getText(),weaponChoice,armorChoice,
                            parseInt(selectPage.getCharacterHP().getText()), parseInt(selectPage.getCharacterMP().getText()),
                            parseInt(selectPage.getCharacterATK().getText()), parseInt(selectPage.getCharacterDEF().getText()));

                    battlePage.getPlayerDescription().setText(charSelection.toString());
                    ImageIcon pImage = new ImageIcon("Image/Ninja.png");
                    battlePage.getPlayerImage().setIcon(pImage);
                }
                else if(selectPage.getCharRadio2().isSelected())
                {
                    charSelection = new Archer(selectPage.getCharacterName().getText(),weaponChoice,armorChoice,
                            parseInt(selectPage.getCharacterHP().getText()), parseInt(selectPage.getCharacterMP().getText()),
                            parseInt(selectPage.getCharacterATK().getText()), parseInt(selectPage.getCharacterDEF().getText()));

                    battlePage.getPlayerDescription().setText(charSelection.toString());
                    ImageIcon pImage = new ImageIcon("Image/Archer.png");
                    battlePage.getPlayerImage().setIcon(pImage);
                }
                else if(selectPage.getCharRadio3().isSelected())
                {
                    charSelection = new Knight(selectPage.getCharacterName().getText(),weaponChoice,armorChoice,
                            parseInt(selectPage.getCharacterHP().getText()), parseInt(selectPage.getCharacterMP().getText()),
                            parseInt(selectPage.getCharacterATK().getText()), parseInt(selectPage.getCharacterDEF().getText()));

                    battlePage.getPlayerDescription().setText(charSelection.toString());
                    ImageIcon pImage = new ImageIcon("Image/Knight.png");
                    battlePage.getPlayerImage().setIcon(pImage);
                }
                else if(selectPage.getCharRadio4().isSelected())
                {
                    charSelection = new Shaman(selectPage.getCharacterName().getText(),weaponChoice,armorChoice,
                            parseInt(selectPage.getCharacterHP().getText()), parseInt(selectPage.getCharacterMP().getText()),
                            parseInt(selectPage.getCharacterATK().getText()), parseInt(selectPage.getCharacterDEF().getText()));

                    battlePage.getPlayerDescription().setText(charSelection.toString());
                    ImageIcon pImage = new ImageIcon("Image/Shaman.png");
                    battlePage.getPlayerImage().setIcon(pImage);
                }

                //change page
                selectPage.setVisible(false);
                battlePage.setVisible(true);
            }
        });

        //reroll the state when press
        selectPage.getRerollButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectPage.getCharacterHP().setText(String.valueOf(new Random().nextInt(100,200)));
                selectPage.getCharacterMP().setText(String.valueOf(new Random().nextInt(100,200)));
                selectPage.getCharacterATK().setText(String.valueOf(new Random().nextInt(10,20)));
                selectPage.getCharacterDEF().setText(String.valueOf(new Random().nextInt(10,20)));
            }
        });

        //Archer radio button
        selectPage.getCharRadio2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Archer.png");
                selectPage.getCharacterImage().setIcon(image);
                selectPage.getCharacterDescription().setText("This is Archer, it has 5 bonus atk");
            }
        });

        //ninja radio button
        selectPage.getCharRadio1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Ninja.png");
                selectPage.getCharacterImage().setIcon(image);
                selectPage.getCharacterDescription().setText("This is Ninja, it has 5 bonus def");
            }
        });

        //Knight radio button
        selectPage.getCharRadio3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Knight.png");
                selectPage.getCharacterImage().setIcon(image);
                selectPage.getCharacterDescription().setText("This is Knight, it has 50 bonus hp");
            }
        });

        //Shaman radio button
        selectPage.getCharRadio4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Shaman.png");
                selectPage.getCharacterImage().setIcon(image);
                selectPage.getCharacterDescription().setText("This is Shaman, it has 50 bonus mp");
            }
        });

        //weapon redio button
        selectPage.getWeaponRadio1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Halberd.png");
                selectPage.getItemImage().setIcon(image);
                selectPage.getItemDescription().setText(weaponArr[0].getName() + "\n" + "Atk + " + weaponArr[0].getAtkBonus());
                weaponChoice = weaponArr[0];
            }
        });

        selectPage.getWeaponRadio2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Rapier.png");
                selectPage.getItemImage().setIcon(image);
                selectPage.getItemDescription().setText(weaponArr[1].getName() + "\n" + "Atk + " + weaponArr[1].getAtkBonus());
                weaponChoice = weaponArr[1];
            }
        });

        selectPage.getWeaponRadio3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Ice Wand.png");
                selectPage.getItemImage().setIcon(image);
                selectPage.getItemDescription().setText(weaponArr[2].getName() + "\n" + "Atk + " + weaponArr[2].getAtkBonus());
                weaponChoice = weaponArr[2];
            }
        });

        //armor radio button
        selectPage.getArmorRadio1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Chain Mail.png");
                selectPage.getItemImage().setIcon(image);
                selectPage.getItemDescription().setText(armorArr[0].getName() + "\n" + "HP + " + armorArr[0].getHpBonus() + "\n" +
                        "MP + " + armorArr[0].getMpBonus() + "\n" + "Def + " + armorArr[0].getDefBonus());
                armorChoice = armorArr[0];
            }
        });

        selectPage.getArmorRadio2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Scutum.png");
                selectPage.getItemImage().setIcon(image);
                selectPage.getItemDescription().setText(armorArr[1].getName() + "\n" + "HP + " + armorArr[1].getHpBonus() + "\n" +
                        "MP + " + armorArr[1].getMpBonus() + "\n" + "Def + " + armorArr[1].getDefBonus());
                armorChoice = armorArr[1];
            }
        });

        selectPage.getArmorRadio3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("Image/Amulet.png");
                selectPage.getItemImage().setIcon(image);
                selectPage.getItemDescription().setText(armorArr[2].getName() + "\n" + "HP + " + armorArr[2].getHpBonus() + "\n" +
                        "MP + " + armorArr[2].getMpBonus() + "\n" + "Def + " + armorArr[2].getDefBonus());
                armorChoice = armorArr[2];
            }
        });

        this.add(startPage);
        this.add(selectPage);
        this.add(battlePage);
    }
}
