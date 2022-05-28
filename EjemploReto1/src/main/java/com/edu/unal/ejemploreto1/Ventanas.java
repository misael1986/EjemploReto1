/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.ejemploreto1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ventanas extends JFrame implements ActionListener {

    private JLabel label;
    private JTextField texto;
    private JTextArea area;
    private JButton boton;
    private JButton borrar;
    private String saludo = "Hola, ";

    Ventanas() {
        this.setSize(600, 400);
        this.setVisible(true);
        this.setLayout(new FlowLayout());

        label = new JLabel("Nombre:");
        Font fuente= new Font("Comic Sans MS",Font.BOLD,14);
        label.setFont(fuente);
        texto = new JTextField(20);
        Color colorText= new Color(5,5,195);
        texto.setForeground(colorText);
        texto.setBackground(Color.ORANGE);
        texto.setFont(new Font("Biome",Font.ITALIC,20));
        boton = new JButton("Enviar");
        boton.addActionListener(this);
        borrar = new JButton("Borrar");
        borrar.addActionListener(this);
        area= new JTextArea(20,5);

        this.add(label);
        this.add(texto);
        this.add(boton);
        this.add(borrar);
        this.add(area);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton) {
            JOptionPane.showMessageDialog(this, saludo + this.texto.getText());
        } else if (e.getSource() == this.borrar) {
            this.texto.setText("");
        }
    }

    public void cambiar() {
        this.label.setText("Name:");
        this.boton.setText("Save");
        this.borrar.setText("Erase");
        this.saludo = "Hello, ";
    }

}
