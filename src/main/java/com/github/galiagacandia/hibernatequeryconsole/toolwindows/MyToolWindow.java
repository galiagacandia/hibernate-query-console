package com.github.galiagacandia.hibernatequeryconsole.toolwindows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyToolWindow {
    private JPanel myToolWindowContent;
    private JLabel myTexto;
    private JButton refreshToolWindowButton;

    public MyToolWindow() {
        refreshToolWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generaTexto();
            }
        });
    }

    private void generaTexto(){
        this.myTexto.setText("Hola Mundo");
    }

    public JPanel getContent(){
        return this.myToolWindowContent;
    }
}
