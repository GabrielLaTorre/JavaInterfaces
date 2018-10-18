package ProyectoInerfaces;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener, ChangeListener{
   
    private JLabel label1;
    private JRadioButton radio1;
    private JButton boton1;
    
public Formulario(){
    setLayout(null);
    label1 = new JLabel("Aceptar términos y condiciones");
    label1.setBounds(10,10,400,30);
    add(label1);

    radio1  = new JRadioButton("Acepto");
    radio1.setBounds(10,50,100,30);
    radio1.addChangeListener(this);
    add(radio1);
    
    boton1 = new JButton("Aceptar");
    boton1.setBounds(10,100,100,30);
    add(boton1);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
 }

public void stateChanged(ChangeEvent e){
    if(radio1.isSelected() == true){
        boton1.setEnabled(true);
    } else {boton1.setEnabled(false);}
 }

public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
        System.exit(0);
    }
 }
}