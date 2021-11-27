import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miVioleta, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno,
        labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
  private JTextField textNombreTrabajador, textAPaternoTrabajador, textAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  String nombreAdministrador = "";


   public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color (255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdministrador = ventanaBienvenida.texto;

    mb = new JMenuBar();
    mb.setBackground(new Color(255,0,0));
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255,0,0));
    menuOpciones.setFont(new Font("Andale Mono", 1,14));
    menuOpciones.setForeground(new Color(255,255,255));
    mb.add(menuOpciones);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255,0,0));
    menuCalcular.setFont(new Font("Andale Mono", 1,14));
    menuCalcular.setForeground(new Color(255,255,255));
    mb.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de");
    menuAcercaDe.setBackground(new Color(255,0,0));
    menuAcercaDe.setFont(new Font("Andale Mono", 1,14));
    menuAcercaDe.setForeground(new Color(255,255,255));
    mb.add(menuAcercaDe);

    menuColorFondo = new JMenu("Color del fondo");
    menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorFondo.setForeground(new Color(255,0,0));
    menuOpciones.add(menuColorFondo);

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono",1,14));
    miCalculo.setForeground(new Color(255,0,0));
    miCalculo.addActionListener(this);
    menuCalcular.add(miCalculo);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono",1,14));
    miRojo.setForeground(new Color(255,0,0));
    miRojo.addActionListener(this);
    menuColorFondo.add(miRojo);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono",1,14));
    miNegro.setForeground(new Color(255,0,0));
    miNegro.addActionListener(this);
    menuColorFondo.add(miNegro);

    miVioleta = new JMenuItem("Violeta");
    miVioleta.setFont(new Font("Andale Mono",1,14));
    miVioleta.setForeground(new Color(255,0,0));
    miVioleta.addActionListener(this);
    menuColorFondo.add(miVioleta);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono",1,14));
    miNuevo.setForeground(new Color(255,0,0));
    miNuevo.addActionListener(this);
    menuOpciones.add(miNuevo);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono",1,14));
    miSalir.setForeground(new Color(255,0,0));
    miSalir.addActionListener(this);
    menuOpciones.add(miSalir);

    miElCreador = new JMenuItem("La creadora");
    miElCreador.setFont(new Font("Andale Mono",1,14));
    miElCreador.setForeground(new Color(255,0,0));
    miElCreador.addActionListener(this);
    menuAcercaDe.add(miElCreador);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5,5,250,100);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
    labelBienvenido.setBounds(280,30,300,50);
    labelBienvenido.setFont(new Font("Andale Mono",1,32));
    labelBienvenido.setForeground (new Color(255,255,255));
    add(labelBienvenido);

    labelTitle = new JLabel("Datos del trabajador para el cálculo de sus vacaciones");
    labelTitle.setBounds(45,140,900,25);
    labelTitle.setFont(new Font("Andale Mono",0,24));
    labelTitle.setForeground(new Color(255,255,255));
    add(labelTitle);

    labelNombre = new JLabel("Nombre completo");
    labelNombre.setBounds(25,188,180,25);
    labelNombre.setFont(new Font("Andale Mono", 1,12));
    labelNombre.setForeground(new Color(255,255,255));
    add(labelNombre);

    textNombreTrabajador = new JTextField();
    textNombreTrabajador.setBounds(25,213,150,25);
    textNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
    textNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
    add(textNombreTrabajador);

    labelAPaterno = new JLabel("Apellido Paterno:");
    labelAPaterno.setBounds(25,248,180,25);
    labelAPaterno.setFont(new Font("Andale Mono", 1,12));
    labelAPaterno.setForeground(new Color(255,255,255));
    add(labelAPaterno);

    textAPaternoTrabajador = new JTextField();
    textAPaternoTrabajador.setBounds(25,273,150,25);
    textAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
    textAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
    add(textAPaternoTrabajador);

    labelAMaterno = new JLabel("Apellido Materno:");
    labelAMaterno.setBounds(25,308,180,25);
    labelAMaterno.setFont(new Font("Andale Mono", 1,12));
    labelAMaterno.setForeground(new Color(255,255,255));
    add(labelAMaterno);

    textAMaternoTrabajador = new JTextField();
    textAMaternoTrabajador.setBounds(25,334,150,25);
    textAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
    textAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
    add(textAMaternoTrabajador);

    labelDepartamento = new JLabel("Selecciona el departamento:");
    labelDepartamento.setBounds(220,188,180,25);
    labelDepartamento.setFont(new Font("Andale Mono", 1,12));
    labelDepartamento.setForeground(new Color(255,255,255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,213,220,25);
    comboDepartamento.setBackground(new java.awt.Color(224,224,224));
    comboDepartamento.setForeground(new java.awt.Color(255,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atención al cliente");
    comboDepartamento.addItem("Departamento de Logística");
    comboDepartamento.addItem("Departamento de Gerencia");

    labelAntiguedad = new JLabel("Selecciona tu antigüedad:");
    labelAntiguedad.setBounds(220,248,180,25);
    labelAntiguedad.setFont(new Font("Andale Mono", 1,12));
    labelAntiguedad.setForeground(new Color(255,255,255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220,273,220,25);
    comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
    comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años o más de servicio");

    labelResultado = new JLabel("Resultado del cálculo:");
    labelResultado.setBounds(220, 307,180,25);
    labelResultado.setFont(new Font("Andale Mono", 1,12));
    labelResultado.setForeground(new Color(255,255,255));
    add(labelResultado);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(224,224,224));
    textarea1.setFont(new Font("Andale Mono",1,11));
    textarea1.setForeground(new Color(255,0,0));
    textarea1.setText("\n Aquí aparecerá el resultado del cálculo de las vacaciones");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220,333,385,90);
    add(scrollpane1);

    labelfooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
    labelfooter.setBounds(135,445,500,30);
    labelfooter.setFont(new Font("Andale Mono",1,12));
    labelfooter.setForeground (new java.awt.Color(255,255,255));
    add(labelfooter);
 }

   public void actionPerformed(ActionEvent e){

    if (e.getSource() == miCalculo){
      String nombreTrabajador = textNombreTrabajador.getText();
      String AP = textAPaternoTrabajador.getText();
      String AM = textAMaternoTrabajador.getText();
      String Departamento = comboDepartamento.getSelectedItem().toString();
      String Antiguedad = comboAntiguedad.getSelectedItem().toString();

     if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
        Departamento.equals("") || Antiguedad.equals("")){
      JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

   }else{
      if(Departamento.equals("Atención al Cliente")){

                                    if(Antiguedad.equals("1 año de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 6 días de vacaciones");
                                    }
                                    if(Antiguedad.equals("2 a 6 años de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 14 días de vacaciones");
                                    }
                                    if(Antiguedad.equals("7 años o más de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 20 días de vacaciones");
                                    }
                                  }
      if(Departamento.equals("Departamento de Logística")){

                                    if(Antiguedad.equals("1 año de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 7 días de vacaciones");
                                    }
                                    if(Antiguedad.equals("2 a 6 años de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 15 días de vacaciones");
                                    }
                                    if(Antiguedad.equals("7 años o más de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 22 días de vacaciones");
                                    }
                                  }
      if(Departamento.equals("Departamento de Gerencia")){

                                    if(Antiguedad.equals("1 año de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 10 días de vacaciones");
                                    }
                                    if(Antiguedad.equals("2 a 6 años de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 20 días de vacaciones");
                                    }
                                    if(Antiguedad.equals("7 años o más de servicio")){
                                        textarea1.setText("\n El trabajador " + nombreTrabajador + " " + AP + " "+AM+
                                                          "\n quien trabaja en " + Departamento + " con " + Antiguedad+
                                                          "\n recibe 30 días de vacaciones");
                                    }
                                  }


   }
  }
    if (e.getSource() == miRojo){
       getContentPane().setBackground(new Color(255,0,0));
  }
    if (e.getSource() == miNegro){
       getContentPane().setBackground(new Color(0,0,0));
  }
    if (e.getSource() == miVioleta){
       getContentPane().setBackground(new Color(51,0,51));
  }
    if (e.getSource() == miNuevo){

       textNombreTrabajador.setText("");
       textAPaternoTrabajador.setText("");
       textAMaternoTrabajador.setText("");
       comboDepartamento.setSelectedIndex(0);
       comboAntiguedad.setSelectedIndex(0);
       textarea1.setText("\n    Aquí aparece el resultado del cálculo de las vacaciones");
  }
    if (e.getSource() == miSalir){
           Bienvenida bienvenida = new Bienvenida();
           bienvenida.setBounds(0,0,350,450);
           bienvenida.setVisible(true);
           bienvenida.setResizable(false);
           bienvenida.setLocationRelativeTo(null);
           this.setVisible(false);
  }
    if (e.getSource() == miElCreador){
          JOptionPane.showMessageDialog(null, "Desarrollado por Nadine Cueva");
  }
 }
    public static void main(String args[]){
       Principal principal = new Principal();
       principal.setBounds(0,0,640,535);
       principal.setVisible(true);
       principal.setResizable(false);
       principal.setLocationRelativeTo(null);
 }
}