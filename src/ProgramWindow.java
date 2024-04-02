import panel.BattlePanel;
import panel.StartPanel;
import panel.CharacterSelecetPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramWindow extends JFrame {

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

        //this.add(startPage);
        this.add(selectPage);
        //this.add(battlePage);
    }
}
