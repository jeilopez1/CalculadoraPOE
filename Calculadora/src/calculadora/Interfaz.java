/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

    List Lista;
    JPanel p1;
    JButton Limpiar;
    String Sumar = "Sumar", Restar = "Restar", Multiplicar = "Multiplicar", Dividir = "Dividir";

    Operacion OP = new Operacion();

    public Interfaz() {
        setTitle("Ventana");
        setSize(400, 600);

        setLocationRelativeTo(this);

        Numero1 = new JLabel("Numero 1");
        Numero2 = new JLabel("Numero 2");
        Resultado = new JLabel("Resultado");
        TNumero1 = new JTextField();
        TNumero2 = new JTextField();

        Lista = new List();
        Lista.addActionListener(this);
        Lista.setBackground(new Color(238, 238, 238));
        Lista.add(Sumar);
        Lista.add(Restar);
        Lista.add(Multiplicar);
        Lista.add(Dividir);


        Limpiar = new JButton("Limpiar");

        Limpiar.addActionListener(this);
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

        gbc.fill = GridBagConstraints.BOTH;

        add(Lista, gbc);

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

        add(Limpiar, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        }
        );
        Lista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent EVT) {
                if (EVT.getSource() == Lista) {
                    int nuevo = Lista.getSelectedIndex() + 1;
                    switch (nuevo) {
                        case 1:
                            TResultado.setText("" + OP.Sumar(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
                            break;
                        case 2:
                            TResultado.setText("" + OP.Restar(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
                            break;
                        case 3:
                            TResultado.setText("" + OP.Multiplicar(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
                            break;
                        case 4:
                            TResultado.setText("" + OP.Dividir(Integer.parseInt(TNumero1.getText()), Integer.parseInt(TNumero2.getText())));
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        );
        pack();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent al) {
        if(al.getSource()==Limpiar){
            TNumero1.setText("");
            TNumero2.setText("");
            TResultado.setText("");
            
        
        }

    }

}
