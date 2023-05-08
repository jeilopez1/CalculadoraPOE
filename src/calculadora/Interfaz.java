/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Choice;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Interfaz extends JFrame implements ActionListener {

    JLabel Numero1, Numero2, Resultado;
    JTextField TNumero1, TNumero2, TResultado;
    Choice Opciones;
    JPanel p1;
    JButton Realizar;
    String Sumar="Sumar", Restar="Restar", Multiplicar="Multiplicar", Dividir="Dividir";
    Operacion OP = new Operacion();

    public Interfaz() {
        JPanel p1 = new JPanel();
        setTitle("Ventana");

        setLocationRelativeTo(this);

        Numero1 = new JLabel("Numero 1");
        Numero2 = new JLabel("Numero 2");
        Resultado = new JLabel("Resultado");
        TNumero1 = new JTextField();
        TNumero2 = new JTextField();

        Opciones = new Choice();
        Opciones.addItem(Sumar);
        Opciones.addItem(Restar);
        Opciones.addItem(Multiplicar);
        Opciones.addItem(Dividir);

        Realizar = new JButton("Realizar");
        Realizar.addActionListener(this);
        TResultado = new JTextField();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weightx = 0.3;

        gbc.fill = GridBagConstraints.BOTH;
        add(Numero1, gbc);

        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        gbc.weighty = 0.3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(TNumero1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Numero2, gbc);

        gbc.gridx = 6;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(TNumero2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Resultado, gbc);

        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(Opciones, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        add(TResultado, gbc);

        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.NONE;
        add(Realizar, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

        pack();
        setVisible(true);
    }

    void CtrlVentana() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Realizar) {

            if (Opciones.getSelectedItem().equals(Sumar)) {
                TResultado.setText("" + OP.Sumar(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
            } else if (Opciones.getSelectedItem().equals(Restar)) {
                TResultado.setText("" + OP.Restar(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
            } else if (Opciones.getSelectedItem().equals(Multiplicar)) {
                TResultado.setText("" + OP.Multiplicar(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
            } else if (Opciones.getSelectedItem().equals(Dividir)) {
                TResultado.setText("" + OP.Dividir(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
            }
        }

    }

}
