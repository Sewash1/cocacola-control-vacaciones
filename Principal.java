import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  private JMenuBar mb;
  private JMenu mo, mc, ma, mcf;
  private JMenuItem mica,miro,mine,mimo,miec,mis,minu;
  private JLabel Llogo,Lbienvenido,Ltitle,Lnombre,Lapellidop,Lapellidom,
                 Ldepartamento,Lantiguedad,Lresultado,Lfooter;
  private JTextField TFnombre,TFapellidop,TFapellidom;
  private JComboBox Cdepartamento,Cantiguedad;
  private JTextArea TA1;
  String nombre = "";

  public Principal(){

    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanabienvenida = new Bienvenida();
    nombre = ventanabienvenida.texto;

    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);

    mo = new JMenu("Opciones");
    mo.setBackground(new Color(255,0,0));
    mo.setFont(new Font("",1,14));
    mo.setForeground(new Color(255,255,255));
    mb.add(mo);

      mcf = new JMenu("Color de fondo");
      mcf.setFont(new Font("",1,14));
      mcf.setForeground(new Color(255,0,0));
      mo.add(mcf);

	miro = new JMenuItem("Rojo");
        miro.setFont(new Font("",1,14));
        miro.setForeground(new Color(255,0,0));
        mcf.add(miro);
        miro.addActionListener(this);

	mine = new JMenuItem("Negro");
        mine.setFont(new Font("",1,14));
        mine.setForeground(new Color(255,0,0));
        mcf.add(mine);
        mine.addActionListener(this);

	mimo = new JMenuItem("Morado");
        mimo.setFont(new Font("",1,14));
        mimo.setForeground(new Color(255,0,0));
        mcf.add(mimo);
        mimo.addActionListener(this);

      minu = new JMenuItem("nuevo");
      minu.setFont(new Font("",1,14));
      minu.setForeground(new Color(255,0,0));
      mo.add(minu);
      minu.addActionListener(this);

      mis = new JMenuItem("Salir");
      mis.setFont(new Font("",1,14));
      mis.setForeground(new Color(255,0,0));
      mo.add(mis);
      minu.addActionListener(this);
 
    mc = new JMenu("Calcular");
    mc.setBackground(new Color(255,0,0));
    mc.setFont(new Font("",1,14));
    mc.setForeground(new Color(255,255,255));
    mb.add(mc);

      mica = new JMenuItem("Vacaciones");
      mica.setFont(new Font("",1,14));
      mica.setForeground(new Color(255,0,0));
      mc.add(mica);
      mica.addActionListener(this);

    ma = new JMenu("Acerca de");
    ma.setBackground(new Color(255,0,0));
    ma.setFont(new Font("",1,14));
    ma.setForeground(new Color(255,255,255));
    mb.add(ma);

      miec = new JMenuItem("El creador");
      miec.setFont(new Font("",1,14));
      miec.setForeground(new Color(255,0,0));
      ma.add(miec);
      miec.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    Llogo = new JLabel(imagen);
    Llogo.setBounds(5,5,250,100);
    add(Llogo);

    Lbienvenido = new JLabel("Bienvenido " + nombre);
    Lbienvenido.setBounds(280,30,300,50);
    Lbienvenido.setFont(new Font("",1,32));
    Lbienvenido.setForeground(new Color(255,255,255));
    add(Lbienvenido);

    Ltitle = new JLabel("Datos del trabajador para el c\u00e1lculo de vacaciones");
    Ltitle.setBounds(45,140,900,25);
    Ltitle.setFont(new Font("",0,24));
    Ltitle.setForeground(new Color(255,255,255));
    add(Ltitle);

    Lnombre = new JLabel("Nombre completo");
    Lnombre.setBounds(25,188,150,25);
    Lnombre.setFont(new Font("",0,14));
    Lnombre.setForeground(new Color(255,255,255));
    add(Lnombre);

      TFnombre = new JTextField();
      TFnombre.setBounds(25,213,150,25);
      TFnombre.setBackground(new Color(224,224,224));
      TFnombre.setFont(new Font("",1,14));
      TFnombre.setForeground(new Color(255,0,0));
      add(TFnombre);

    Lapellidop = new JLabel("Apellido Paterno");
    Lapellidop.setBounds(25,248,180,25);
    Lapellidop.setFont(new Font("",0,14));
    Lapellidop.setForeground(new Color(255,255,255));
    add(Lapellidop);

      TFapellidop = new JTextField();
      TFapellidop.setBounds(25,273,150,25);
      TFapellidop.setBackground(new Color(224,224,224));
      TFapellidop.setFont(new Font("",1,14));
      TFapellidop.setForeground(new Color(255,0,0));
      add(TFapellidop);

    Lapellidom = new JLabel("Apellido Materno");
    Lapellidom.setBounds(25,308,180,25);
    Lapellidom.setFont(new Font("",0,14));
    Lapellidom.setForeground(new Color(255,255,255));
    add(Lapellidom);

      TFapellidom = new JTextField();
      TFapellidom.setBounds(25,334,150,25);
      TFapellidom.setBackground(new Color(224,224,224));
      TFapellidom.setFont(new Font("",1,14));
      TFapellidom.setForeground(new Color(255,0,0));
      add(TFapellidom);

    Ldepartamento = new JLabel("Selecciona del departamento:");
    Ldepartamento.setBounds(220,188,200,25);
    Ldepartamento.setFont(new Font("",0,14));
    Ldepartamento.setForeground(new Color(255,255,255));
    add(Ldepartamento);

      Cdepartamento = new JComboBox();
      Cdepartamento.setBounds(220,213,200,25);
      Cdepartamento.setBackground(new Color(224,224,224));
      Cdepartamento.setFont(new Font("",1,14));
      Cdepartamento.setForeground(new Color(255,0,0));
      add(Cdepartamento);

	Cdepartamento.addItem("");
	Cdepartamento.addItem("Atenci\u00f3n al Cliente");
	Cdepartamento.addItem("Departamento de Lo\u00edstica");
	Cdepartamento.addItem("Departamento de Gerencia");

    Lantiguedad = new JLabel("Selecciona la Antig\u00fcedad:");
    Lantiguedad.setBounds(220,248,180,25);
    Lantiguedad.setFont(new Font("",0,14));
    Lantiguedad.setForeground(new Color(255,255,255));
    add(Lantiguedad);

      Cantiguedad = new JComboBox();
      Cantiguedad.setBounds(220,273,220,25);
      Cantiguedad.setBackground(new Color(224,224,224));
      Cantiguedad.setFont(new Font("",1,14));
      Cantiguedad.setForeground(new Color(255,0,0));
      add(Cantiguedad);

	Cantiguedad.addItem("");
	Cantiguedad.addItem("1 a\u00f1o de servicio");
	Cantiguedad.addItem("2 a 6 a\u00f1os de servicio");
	Cantiguedad.addItem("7 o m\u00e1s a\u00f1os de servicio");

    Lresultado = new JLabel("Resultado del C\u00e1lculo:");
    Lresultado.setBounds(220,307,180,25);
    Lresultado.setFont(new Font("",0,14));
    Lresultado.setForeground(new Color(255,255,255));
    add(Lresultado);

    TA1 = new JTextArea();
    TA1.setBounds(220,334,300,100);
    TA1.setEditable(false);
    TA1.setBackground(new Color(224,224,224));
    TA1.setFont(new Font("",1,11));
    TA1.setForeground(new Color(255,0,0));
    TA1.setText("\n     En este lugar aparece el resultado de las" +
                "\n     vacaciones que dispones.");
    add(TA1);

    Lfooter = new JLabel("2017 The Coca-Cola Company | Todos los derechos reservados");
    Lfooter.setBounds(135,445,500,30);
    Lfooter.setFont(new Font("",0,12));
    Lfooter.setForeground(new Color(255,255,255));
    add(Lfooter);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == mica){
      String v1 = TFnombre.getText();
      String v2 = TFapellidop.getText();
      String v3 = TFapellidom.getText();
      String v4 = Cdepartamento.getSelectedItem().toString();
      String v5 = Cantiguedad.getSelectedItem().toString();

      if(v1.equals("") || v2.equals("") || v3.equals("") ||
         v4.equals("") || v5.equals("")){

	JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
      } else{
	if(v4.equals("Atenci\u00f3n al Cliente")){

		if(v5.equals("1 a\u00f1o de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 6 d\u00edas de vacaciones.");
		}
		if(v5.equals("2 a 6 a\u00f1os de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 14 d\u00edas de vacaciones.");
		}
		if(v5.equals("7 o m\u00e1s a\u00f1os de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 20 d\u00edas de vacaciones.");
		}
	}
	if(v4.equals("Departamento de Lo\u00edstica")){

		if(v5.equals("1 a\u00f1o de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 7 d\u00edas de vacaciones.");
		}
		if(v5.equals("2 a 6 a\u00f1os de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 15 d\u00edas de vacaciones.");
		}
		if(v5.equals("7 o m\u00e1s a\u00f1os de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 22 d\u00edas de vacaciones.");
		}
	}
	if(v4.equals("Departamento de Gerencia")){

		if(v5.equals("1 a\u00f1o de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 10 d\u00edas de vacaciones.");
		}
		if(v5.equals("2 a 6 a\u00f1os de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 20 d\u00edas de vacaciones.");
		}
		if(v5.equals("7 o m\u00e1s a\u00f1os de servicio")){
			TA1.setText("\n     El trabajador " + v1 + " " + v2 + " " + v3 +
				    "\n     quien labora en " + v4 + "\n     con " + v5 +
				    "\n     recibe 30 d\u00edas de vacaciones.");
		}
	}
      }
    }
    if(e.getSource() == miro){
    	getContentPane().setBackground(new Color(255,0,0));
    }
    if(e.getSource() == mine){
    	getContentPane().setBackground(new Color(0,0,0));
    }
    if(e.getSource() == mimo){
    	getContentPane().setBackground(new Color(51,0,51));
    }
    if(e.getSource() == minu){
    	TFnombre.setText("");
    	TFapellidop.setText("");
    	TFapellidom.setText("");
    	Cdepartamento.setSelectedIndex(0);
    	Cantiguedad.setSelectedIndex(0);
        TA1.setText("\n     En este lugar aparece el resultado de las" +
                    "\n     vacaciones que dispones.");
    }
    if(e.getSource() == mis){
      Bienvenida ventanabienvenida = new Bienvenida();
      ventanabienvenida.setBounds(10,10,350,450);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      this.setVisible(false);
    }
    if(e.getSource() == miec){
	JOptionPane.showMessageDialog(null, "Desarrollado por Tsuki");
    }
  }

  public static void main(String args[]){
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(10,10,640,535);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
  }
}