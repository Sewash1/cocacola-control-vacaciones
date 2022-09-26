import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JTextArea textarea1;
  String nombre = "";

  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanabienvenida = new Bienvenida();
    nombre = ventanabienvenida.texto;

    label1 = new JLabel("T\u00c9\nRMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    add(label1);
    
    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBounds(10,40,575,200);
    textarea1.setText("\n\n          T\u00e9\rminos y condiciones" +
                      "\n\n           ACUERDO A" +
                      "\n           ACUERDO B" +
                      "\n           ACUERDO C");
    add(textarea1);
    
    check1 = new JCheckBox("Yo " + nombre + " acepto");
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No acepto");
    boton2.setBounds(120,290,100,30);
    boton2.addActionListener(this);
    add(boton2);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(imagen);
    label2.setBounds(315,135,300,300);
    add(label2);
  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
    boton1.setEnabled(true);
    boton2.setEnabled(false);
    } else{
    boton1.setEnabled(false);
    boton2.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      Principal ventanaPrincipal = new Principal();
      ventanaPrincipal.setBounds(10,10,640,535);
      ventanaPrincipal.setVisible(true);
      ventanaPrincipal.setResizable(false);
      this.setVisible(false);
    } else if(e.getSource() == boton2){
      Bienvenida ventanabienvenida = new Bienvenida();
      ventanabienvenida.setBounds(10,10,350,450);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      this.setVisible(false);
    }
  }

  public static void main(String args[]){
    Licencia ventanalicencia = new Licencia();
    ventanalicencia.setBounds(10,10,600,360);
    ventanalicencia.setVisible(true);
    ventanalicencia.setResizable(false);
  }
}