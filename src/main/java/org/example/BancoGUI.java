package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class BancoGUI extends JFrame {
    private JScrollPane scrollPane1;
    private final JTextField camp5;
public String[] solicitarDatos6(String dato0, String dato1, String dato2, String dato3,String dato4 ){
    JTextField camp1 = new JTextField(5);
    JTextField camp2 = new JTextField(5);
    JTextField camp3 = new JTextField(5);
    JTextField camp4 = new JTextField(5);
JRadioButton YE  = new JRadioButton("SI");
JRadioButton NO = new JRadioButton("NO");
    JRadioButton W = new JRadioButton("F");
    JRadioButton M = new JRadioButton("M");

    W.setBorderPainted(false);
    M.setBorderPainted(false);
    W.setMargin(new Insets(0,0,0,0));
    M.setMargin(new Insets(0,0,0,0));
    Font font = new Font("Times New Roman", Font.PLAIN,14);
    camp1.setFont(font);
    camp2.setFont(font);
    camp3.setFont(font);
    camp4.setFont(font);


    JLabel label1 = new JLabel(dato0);
    label1.setFont(font);
    label1.setBorder(new EmptyBorder(10,10,10,10));
    JLabel label2 = new JLabel(dato1);
    label2.setFont(font);
    label2.setBorder(new EmptyBorder(10,10,10,10));
    JLabel label3 = new JLabel(dato2);
    label3.setBorder(new EmptyBorder(10,10,10,10));
    label3.setFont(font);
    JLabel label4 = new JLabel(dato3);
    label4.setBorder(new EmptyBorder(10,10,10,10));
    label4.setFont(font);
    JLabel label5 = new JLabel(dato4);
    label5.setBorder(new EmptyBorder(10,10,10,10));
    label5.setFont(font);

    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBorder(new EmptyBorder(10, 10, 10, 10));
    panel.setBackground(Color.ORANGE);


    ButtonGroup  buttonGroup = new ButtonGroup();
    ButtonGroup buttonGroup1 = new ButtonGroup();
    buttonGroup1.add(YE);
    buttonGroup1.add(NO);
    W.setBackground(Color.ORANGE);
    M.setBackground(Color.ORANGE);
    buttonGroup.add(W);
    buttonGroup.add(M);

    GridBagConstraints constraints = new GridBagConstraints();
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.weightx = 0.5;
    constraints.gridx = 0;
    constraints.gridy = 0;
    panel.add(label1, constraints);
    constraints.gridy = 1;
    panel.add(camp1, constraints);
    constraints.gridy = 2;
    panel.add(label2, constraints);
    constraints.gridy = 3;
    panel.add(camp2, constraints);
    constraints.gridy = 4;
    panel.add(label3, constraints);
    constraints.gridy = 5;
    panel.add(radiobutton(W,M), constraints);
    constraints.gridy = 6;
    panel.add(label4, constraints);
    constraints.gridy = 7;
    panel.add(camp4,constraints);
    constraints.gridy =8;
    panel.add(label5,constraints);
    constraints.gridy = 9;
    panel.add(radiobutton(YE,NO),constraints);
    constraints.gridy = 10;
    ActionListener actionListener = e->{
if (W.isSelected()){
    camp3.setText("F");
}
else if (M.isSelected()){
    camp3.setText("M");
}
    };
    ActionListener actionListener1 = e -> {
      if (YE.isSelected()){
          camp5.setText("SI");
      } else if (NO.isSelected()) {
          camp5.setText("NO");
      }
    };
    W.addActionListener(actionListener);
    M.addActionListener(actionListener);
    YE.addActionListener(actionListener1);
    NO.addActionListener(actionListener1);

    int result = JOptionPane.showConfirmDialog(null, panel,
            "Ingrese los datos", JOptionPane.OK_CANCEL_OPTION);
    if (result == JOptionPane.OK_OPTION) {
        return new String[]{camp1.getText(), camp2.getText(), camp3.getText(),camp4.getText(),camp5.getText()};
    }
    return null;
}
    public String[] solicitarDatos2(String mensaje1, String mensaje2) {
        JTextField campo1 = new JTextField(5);
        JTextField campo2 = new JTextField(5);

        Font font = new Font("Times New Roman", Font.PLAIN, 14);
        campo1.setFont(font);
        campo2.setFont(font);

        // Create labels with padding and custom font
        JLabel label1 = new JLabel(mensaje1);
        label1.setBorder(new EmptyBorder(10, 10, 10, 10));
        label1.setFont(font);

        JLabel label2 = new JLabel(mensaje2);
        label2.setBorder(new EmptyBorder(10, 10, 10, 10));
        label2.setFont(font);

        // Create a panel with a GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.ORANGE);

        // Add the labels and text fields to the panel
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label1, constraints);
        constraints.gridy = 1;
        panel.add(campo1, constraints);
        constraints.gridy = 2;
        panel.add(label2, constraints);
        constraints.gridy = 3;
        panel.add(campo2, constraints);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese los datos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{campo1.getText(), campo2.getText()};
        }
        return null;
    }
    public String[] solicitarDatos1(String mensaje1) {
        JTextField campo1 = new JTextField(5);

        Font font = new Font("Times New Roman", Font.PLAIN, 14);
        campo1.setFont(font);


        JLabel label1 = new JLabel(mensaje1);
        label1.setBorder(new EmptyBorder(10, 10, 10, 10));
        label1.setFont(font);

        // Create a panel with a GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.ORANGE);

        // Add the labels and text fields to the panel
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label1, constraints);
        constraints.gridy = 1;
        panel.add(campo1, constraints);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese los datos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{campo1.getText() };
        }
        return null;
    }
    public String[] solicitarDatos3(String mensaje1, String mensaje2, String mensaje3) {

        JTextField campo1 = new JTextField(5);
        JTextField campo2 = new JTextField(5);
        JTextField campo3 = new JTextField(5);

        Font font = new Font("Times New Roman", Font.PLAIN, 14);
        campo1.setFont(font);
        campo2.setFont(font);
        campo3.setFont(font);

        JLabel label1 = new JLabel(mensaje1);
        label1.setBorder(new EmptyBorder(10, 10, 10, 10));
        label1.setFont(font);

        JLabel label2 = new JLabel(mensaje2);
        label2.setBorder(new EmptyBorder(10, 10, 10, 10));
        label2.setFont(font);

        JLabel label3 = new JLabel(mensaje3);
        label3.setBorder(new EmptyBorder(10, 10, 10, 10));
        label3.setFont(font);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.ORANGE);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label1, constraints);
        constraints.gridy = 1;
        panel.add(campo1, constraints);
        constraints.gridy = 2;
        panel.add(label2, constraints);
        constraints.gridy = 3;
        panel.add(campo2, constraints);
        constraints.gridy = 4;
        panel.add(label3, constraints);
        constraints.gridy = 5;
        panel.add(campo3, constraints);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese lo" +
                        "s datos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{campo1.getText(), campo2.getText(), campo3.getText()};
        }
        return null;
    }
    public String[] solicitarDatos4(String mensaje1, String mensaje2, String mensaje3, String mensaje4) {


        JTextField camp1 = new JTextField(5);
        JTextField camp2 = new JTextField(5);
        JTextField camp3 = new JTextField(5);
        JTextField camp4 = new JTextField(5);


        Font font = new Font("Times New Roman", Font.PLAIN, 14);
        camp1.setFont(font);
        camp2.setFont(font);
        camp3.setFont(font);
        camp4.setFont(font);


        JLabel label1 = new JLabel(mensaje1);
        label1.setBorder(new EmptyBorder(10, 10, 10, 10));
        label1.setFont(font);

        JLabel label2 = new JLabel(mensaje2);
        label2.setBorder(new EmptyBorder(10, 10, 10, 10));
        label2.setFont(font);

        JLabel label3 = new JLabel(mensaje3);
        label3.setBorder(new EmptyBorder(10, 10, 10, 10));
        label3.setFont(font);
        JLabel label4 = new JLabel(mensaje4);
        label4.setBorder(new EmptyBorder(10,10,10,10));
        label4.setFont(font);

        JPanel panel= new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.ORANGE);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label1, constraints);
        constraints.gridy = 1;
        panel.add(camp1, constraints);
        constraints.gridy = 2;
        panel.add(label2, constraints);
        constraints.gridy = 3;
        panel.add(camp2, constraints);
        constraints.gridy = 4;
        panel.add(label3, constraints);
        constraints.gridy = 5;
        panel.add(camp3, constraints);
        constraints.gridy = 6;
        panel.add(label4,constraints);
        constraints.gridy = 7;
        panel.add(camp4,constraints);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese los datos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{camp1.getText(), camp2.getText(), camp3.getText(),camp4.getText()};
        }
        return null;
    }

    private final Listas<CuentasAhorros> AhorroListas;
    private final Listas<SolicitudesDeposito> solicitudesDepositoListas;
    private final Listas<CuentasAhorros> millonarios;
    private final Listas<SolicitudesExtracciones> listasExtrac;
    private final Banco banco;
    private JPanel mainPanel;
    private JButton SolicitudDeposito,CrearAh,Mill,Atender,MosAho,MosSoli,MosCueCli,MostrarMIll,mostrarClientes;
    private JScrollPane scroll1,scroll2,scroll3;
    private JButton CrearExtrac;
    private JButton atenderExtr;
    private JButton MosExtr;
    private JButton EliCuenta;
    private JButton ElSoli;
    private JPanel panel1;
    private JButton CreaCl;
    private JButton mostrarClientesButton;
    private final HashMap<Integer,Clientes> clients;
    private final HashMap<String,String> paises;
    JComboBox<String> comboBox ;
//    private boolean bankActive;
//    private Jra

//    private JButton CrearAh;
//    private JButton Mill;
//    private JButton Atender;
//    private JButton MosAho;
//    private JButton MosSoli;
//    private JButton Imagen2;
//    private JButton imagen1Button;
//    private JButton Imagen3;
//    private JButton MostrarMIll;
//    private JButton BANK;

    public static void main(String[] args) {

        JFrame frame = new JFrame("BancoGUI");
        frame.setContentPane(new BancoGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Image imageIcon = new ImageIcon("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG1 (2).jpg").getImage();
        frame.setIconImage(imageIcon);
        frame.setResizable(false);
    }
    public BancoGUI()
    {
        this.solicitudesDepositoListas = new Listas<>();
        this.AhorroListas = new Listas<>();
        this.banco = new Banco(AhorroListas, solicitudesDepositoListas);
        this.millonarios = new Listas<>();
//        this.bankActive = false;
        this.listasExtrac = new Listas<>();
        this.clients = new HashMap<>();
        this.paises = new HashMap<>();
        this.camp5 = new JTextField(5);
        this.comboBox = new JComboBox<>();

        SolicitudDeposito.addActionListener(e -> {
            boolean a = false;
            while (true) {
                try{


                    String[] datosIngresados = solicitarDatos3("Ingrese el ID del beneficiario:", "Ingrese el nombre", "Ingrese el monto:");
                    if (datosIngresados != null) {
                        if (Integer.parseInt(datosIngresados[0]) < 0 || Float.parseFloat(datosIngresados[1]) < 0) {
                            JOptionPane.showMessageDialog(null, "Chistoson mi compa");
                        } else {
                            solicitudesDepositoListas.addElement(new SolicitudesDeposito(Integer.parseInt(datosIngresados[0]), datosIngresados[1], Float.parseFloat(datosIngresados[1])));
                            JOptionPane.showMessageDialog(null, "Solicitud de depósito a: '" + datosIngresados[2] + "' ha sido realizada con exito");
                            break;
                        }

                }
                else {
                    a = true;
                    break;
                }

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Error!!!!!!!!!");
                }
            }
            if (!a){
            int result =JOptionPane.showConfirmDialog(null,"Agregar otro?");
            if (result ==JOptionPane.OK_OPTION){
                while (true) {
                    try{


                        String[] datosIngresados = solicitarDatos3("Ingrese el ID del beneficiario:", "Ingrese el nombre:", "Ingrese el monto:");
                        if (datosIngresados != null) {
                            if (Integer.parseInt(datosIngresados[0])<0||Float.parseFloat(datosIngresados[1])<0){
                                JOptionPane.showMessageDialog(null,"Que intentas mi chaval");
                            }
                            else {
                                solicitudesDepositoListas.addElement(new SolicitudesDeposito(Integer.parseInt(datosIngresados[0]), datosIngresados[2], Float.parseFloat(datosIngresados[1])));
                                JOptionPane.showMessageDialog(null, "Solicitud de depósito a: '" + datosIngresados[2] + "' ha sido realizada con exito");
                                int resulf = JOptionPane.showConfirmDialog(null,"Agregar otro?");
                                if (resulf == JOptionPane.OK_OPTION){

                                }
                                else {
                                    break;
                                }
                            }

                        }
                        else {
                            break;
                        }

                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null,"Error!!!!!!!!!");
                    }
                }
            }

        }});
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG1 (3).jpg", 200, 200, Mill);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG3 (2).jpg", 200, 200, SolicitudDeposito);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG3 (3).jpg", 200, 200, Atender);
//        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG3.NQLrZK.jpg",200,200,MosAho);
//        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/mill.jpg",200,200,MostrarMIll);
//        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG4.jpg",200,200,MosSoli);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG4..jpg",200,200,CrearAh);
//            setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG1 (1).jpg",200,200,MosSoli);
//        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/Screenshot 2024-03-29 124426.png",500,300, BANK);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG3 (4).jpg",200,200,CrearExtrac);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG2 (1).jpg",200,200, atenderExtr);
        MosAho.setToolTipText("Mostrar las cuentas de ahorro");
        Atender.addActionListener(e -> {
            if (solicitudesDepositoListas.longitud() > 0) {

                JOptionPane.showMessageDialog(null, solicitudesDepositoListas.longitud()+ " Solicitudes fueron atendidas con exito");
                banco.atenderDepos(AhorroListas, solicitudesDepositoListas);

            } else {
                JOptionPane.showMessageDialog(null,"No hay solicitudes las cuales atender");

            }
        });

        Mill.addActionListener(e -> {
            if (!AhorroListas.esVacia()) {
                JOptionPane.showMessageDialog(null, "Cuentas de ahorro con más de 1M han sido eliminadas con éxito");
                banco.bajaAMillonarios(AhorroListas, millonarios);
            }
            else if (AhorroListas.esVacia()){
                JOptionPane.showMessageDialog(null,"No hay cuentas de Ahorro");
            }



        });

CrearExtrac.addActionListener(e -> {
    boolean a = true;
    while(true){

        if (!AhorroListas.esVacia()) {
            String[] datosIngresados =solicitarDatos4("Ingrese su ID","Ingrese su nombre", "Monto", "Sexo");
            if (datosIngresados!= null){
            try {

                for (int i = 0; i < AhorroListas.longitud(); i++) {
                    if (Integer.parseInt(datosIngresados[1]) == AhorroListas.obtener(i).getPos()){
                        if (Float.parseFloat(datosIngresados[3]) >AhorroListas.obtener(i).getSaldoAct()){
                            JOptionPane.showMessageDialog(null,"Fondos insuficientes: $" +AhorroListas.obtener(i).getSaldoAct());
                            return;
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Numero de cuenta no encontrado");
                    }
                }
                if (Float.parseFloat(datosIngresados[3])<0){
                    JOptionPane.showMessageDialog(null,"Numeros negativos");
                    return;
                }
                if (extranjero()) {
                    String[] dats = solicitarDatos2("Ingrese su nacionalidad", "Ingrese su dirección");
                    listasExtrac.addElement(new SolicitudesExtracciones(Integer.parseInt(datosIngresados[0]), datosIngresados[1], Float.parseFloat(datosIngresados[2]), datosIngresados[3].charAt(0), dats[0], dats[1]));

                } else {
                    listasExtrac.addElement(new SolicitudesExtracciones(Integer.parseInt(datosIngresados[0]),datosIngresados[1], Float.parseFloat(datosIngresados[2])));

                }
                JOptionPane.showMessageDialog(null, "Solicitud de extraccion realizada con exito");
                break;


            }catch(Exception ex ){
JOptionPane.showMessageDialog(null,"Datos ingresados no valido");
            }


    }
        else {
            a = false;
        break;}
        }else if (AhorroListas.esVacia()){
           JOptionPane.showMessageDialog(null,"No hay cuentas de ahorro");
           a = false;
           break;
        }
        else {
            a = false;
            break;
        }


}
if (a){
    int result = JOptionPane.showConfirmDialog(null,"Agregar otro?");
    if (result == JOptionPane.OK_OPTION){
        while(true){

            if (!AhorroListas.esVacia()) {
                String[] datosIngresados =solicitarDatos4("Ingrese su ID","Ingrese su nombre", "Monto", "Sexo");
                if (datosIngresados!= null){
                    try {

                        for (int i = 0; i < AhorroListas.longitud(); i++) {
                            if (Integer.parseInt(datosIngresados[1]) == AhorroListas.obtener(i).getIdBen()){
                                if (Float.parseFloat(datosIngresados[3]) >AhorroListas.obtener(i).getSaldoAct()){
                                    JOptionPane.showMessageDialog(null,"Fondos insuficientes");
                                }
                            }
                        }
                        if (Float.parseFloat(datosIngresados[3])<0){
                            JOptionPane.showMessageDialog(null,"Numeros negativos    ");
                        }
                        if (extranjero()) {
                            String[] dats = solicitarDatos2("Ingrese su nacionalidad", "Ingrese su dirección");
                            listasExtrac.addElement(new SolicitudesExtracciones(Integer.parseInt(datosIngresados[0]), datosIngresados[1], Float.parseFloat(datosIngresados[2]), datosIngresados[3].charAt(0), dats[0], dats[1]));

                        } else {
                            listasExtrac.addElement(new SolicitudesExtracciones(Integer.parseInt(datosIngresados[0]), datosIngresados[1], datosIngresados[2].charAt(0)));

                        }
                        JOptionPane.showMessageDialog(null, "Solicitud de extraccion realizada con exito");
                        int resulf = JOptionPane.showConfirmDialog(null,"Agregar otro?");
                        if (resulf == JOptionPane.OK_OPTION){

                        }
                        else {
                            break;
                        }


                    }catch(Exception ex ){
                        JOptionPane.showMessageDialog(null,"Datos ingresados no valido");
                    }


                }
                else {

                    break;}
            }else if (AhorroListas.esVacia()){
                JOptionPane.showMessageDialog(null,"No hay cuentas de ahorro");
                break;
            }
            else {
                break;
            }


        }
    }
}
});
        atenderExtr.addActionListener(e -> {
            if (!AhorroListas.esVacia()){
            if (listasExtrac.longitud()>0){
                JOptionPane.showMessageDialog(null,listasExtrac.longitud() +" Extracciones fueron atendidas con exito");
            banco.ExtraerDinero(AhorroListas,listasExtrac);
            }
            else{
                JOptionPane.showMessageDialog(null,"No hay solicitudes pendientes");
            }


        }
        else {
            JOptionPane.showMessageDialog(null,"No hay cuentas de ahorro de las cuales extraer");
            }
        });


        MostrarMIll.addActionListener(e -> {
            if (millonarios.longitud() > 0) {
                StringBuilder millonariosS = new StringBuilder();
                for (int i = 0; i < millonarios.longitud(); i++) {
                    millonariosS.append("Cuenta de ahorro con id: ").append(millonarios.obtener(i).getIdBen()).append(" y saldo de: $").append(millonarios.obtener(i).getSaldoAct()).append("\n");
                }
                JOptionPane.showMessageDialog(null, millonariosS.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No hay cuentas de ahorro con más de 1M");
            }
        });

        MosSoli.addActionListener(e -> {
            if (solicitudesDepositoListas.longitud() > 0) {
                StringBuilder solicitudes = new StringBuilder();
                for (int i = 0; i < solicitudesDepositoListas.longitud(); i++) {
                    solicitudes.append(i+1).append(". Solicitud de depósito a: ").append(solicitudesDepositoListas.obtener(i).getNombre())
                            .append(" por un monto de: $")
                            .append(solicitudesDepositoListas.obtener(i).getMonto())
                            .append("\n");
                }
                JOptionPane.showMessageDialog(null, solicitudes.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No hay solicitudes de depósito pendientes");
            }
        });
        MosAho.addActionListener(e -> {
                if (AhorroListas.longitud() > 0) {
                    StringBuilder Ahorro = new StringBuilder();
                    for (int i = 0; i < AhorroListas.longitud(); i++) {
                        AhorroListas.obtener(i).setPos(i+1);
                        Ahorro.append(i + 1).append(" ").append("ID: ").append(AhorroListas.obtener(i).getIdBen())
                                .append(" Saldo: $")
                                .append(AhorroListas.obtener(i).getSaldoAct())
                                .append("\n");
                    }
                    JOptionPane.showMessageDialog(null, Ahorro.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No hay cuentas de ahorro para mostrar");
                }
//            JOptionPane.showMessageDialog("" +);
        });
        CrearAh.addActionListener(e->{
boolean a = true;

            while (true){
                String[] datosIngresados = solicitarDatos2("Ingrese ID:", "Ingrese el saldo:");
                if (datosIngresados != null){
                try {
                    if (datosIngresados.length>=1){

                int idNum = Integer.parseInt(datosIngresados[0]);
                float saldo = 0;
                    if (datosIngresados.length == 2 && datosIngresados[1] != null&& !datosIngresados[1].isEmpty()) {
                        saldo = Float.parseFloat(datosIngresados[1]);


                    }
                    if (saldo<0||idNum<0){
                        JOptionPane.showMessageDialog(null,"Negativos?");
                        return;
                    }
                    if (clients.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No hay clientes");
                        return;
                    }
                CuentasAhorros h = new CuentasAhorros(idNum,saldo);
                            Clientes cliente = clients.get(idNum);
                            if (cliente != null) {
                                cliente.clistas.addElement(h);
                                AhorroListas.addElement(h);
//Falta añadir la cuenta a la lista de cuentas del cliente
                                JOptionPane.showMessageDialog(null, "Cuenta con ID: '" + datosIngresados[0] + "' ha sido creada con exito");
                                break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Datos ingresados no validos");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos");
                    }
                } else {
                    a = false;
                    break;
                }




            }
            if (a) {
                int result = JOptionPane.showConfirmDialog(null, "¿Agregar otro?");
                if (result == JOptionPane.OK_OPTION) {
                    while (true) {
                        String[] datosIngresados = solicitarDatos2("Ingrese ID:", "Ingrese el saldo:");
                        if (datosIngresados != null) {
                            try {
                                if (datosIngresados.length >= 1) {

                                    int idNum = Integer.parseInt(datosIngresados[0]);
                                    float saldo = 0;
                                    if (datosIngresados.length == 2 && datosIngresados[1] != null && !datosIngresados[1].isEmpty()) {
                                        saldo = Float.parseFloat(datosIngresados[1]);


                                    }
                                    if (saldo < 0 || idNum < 0) {
                                        JOptionPane.showMessageDialog(null, "Negativos?");
                                        return;
                                    }
                                    if (clients.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Debe crear un cliente primero");
                                        return;
                                    }
                                    Clientes cliente = clients.get(Integer.parseInt(datosIngresados[0]));

                                    if (cliente != null && Integer.parseInt(datosIngresados[0]) == clients.get(Integer.parseInt(datosIngresados[0])).getIdben()) {
                                        AhorroListas.addElement(new CuentasAhorros(idNum, saldo));
                                        String s = clients.get(Integer.parseInt(datosIngresados[0])).getNacionalidad();

                                        if (s.equalsIgnoreCase("méxico")) {
                                            if (cliente instanceof Nacionales mexicano) {
                                                mexicano.getClistas().addElement(new CuentasAhorros(Integer.parseInt(datosIngresados[0]), Float.parseFloat(datosIngresados[1])));
                                            }
                                        } else {
                                            if (cliente instanceof Extranjero extranjero) {
                                                extranjero.clistas.addElement(new CuentasAhorros(Integer.parseInt(datosIngresados[0]), Float.parseFloat(datosIngresados[1])));
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El ID recibido no es valido o el cliente no existe");
                                        break;
                                    }


                                    JOptionPane.showMessageDialog(null, "Cuenta con ID: '" + datosIngresados[0] + "' ha sido creada con exito");
                                    break;

                                } else {
                                    JOptionPane.showMessageDialog(null, "Datos ingresados no validos");
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos");
                            }
                        } else {
                            break;
                        }


                    }


                }
            }
        });


        MosCueCli.addActionListener(e -> {
            while (true){ try {
                String[] ingresarDatos = solicitarDatos1("Ingrese el ID del cliente");
                if (ingresarDatos != null) {
                    StringBuilder clienInfo = new StringBuilder();
                    Clientes cliente = clients.get(Integer.parseInt(ingresarDatos[0]));
                    if (cliente != null) {
                        for (int i = 0; i <= cliente.clistas.getSize(); i++) {
                            if (!cliente.clistas.esVacia()) {
                                clienInfo.append("Cliente: ").append(cliente.name).append("  ").append(cliente.getIdben()).append("\n");
                                clienInfo.append("Numero de la cuenta").append(cliente.clistas.obtener(i).getPos()).append("\n");
                                clienInfo.append("Saldo").append(cliente.clistas.obtener(i).getSaldoAct());
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay cuentas");
                                return;
                            }

                        }

                        JOptionPane.showMessageDialog(null, clienInfo.toString());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "El ID es incorrecto o el cliente no existe");
                    }
                } else {
break;
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Algo fue mal");

            }

        }});
        MosExtr.addActionListener(e ->{
            if (listasExtrac.longitud()>0){
                StringBuilder Extract = new StringBuilder();
                for (int i = 0; i < listasExtrac.longitud(); i++) {
                    Extract.append(i+1).append(" ").append("Nombre: ").append(listasExtrac.obtener(i).getNombre()).append("ID: ").append(listasExtrac.obtener(i).getNumid()).append(" por un monto de").append(listasExtrac.obtener(i).getMonto());

                }
                JOptionPane.showMessageDialog(null,Extract.toString());

            } else{
                JOptionPane.showMessageDialog(null,"No hay nada para mostrar");
            }



        });
        ElSoli.addActionListener(e -> {
            if (!solicitudesDepositoListas.esVacia()){
            int dato;
            dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Eliminar solicitud"));

            solicitudesDepositoListas.eliminarIndex(dato);

        }
        else {
            JOptionPane.showMessageDialog(null,"No hay nada que eliminar");
            }
        });

        EliCuenta.addActionListener(e -> {
            if (!AhorroListas.esVacia()){
                int dato;
                dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Indice a eliminar"));
                AhorroListas.eliminarIndex(dato);

            }
            else {
                JOptionPane.showMessageDialog(null,"No hay nada que eliminar");
            }
        });
        CreaCl.addActionListener(e -> {

            while (true) {
                try {
                    String[] ingresarDatos = solicitarDatos6("Ingresar numero de identificacion", "Ingresar nombre completo", "Sexo", "Ingresar direccion", "¿Es el cliente extranjero?");
                    if (ingresarDatos != null) {

                    String[] paises1 = {"Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"
                    };
                    String[] codPais = {"AF", "AL", "DE", "AD", "AO", "AG", "SA", "DZ", "AR", "AM", "AU", "AT", "AZ", "BS", "BD", "BB", "BH", "BE", "BZ", "BJ", "BY", "MM", "BO", "BA", "BW", "BR", "BN", "BG", "BF", "BI", "BT", "CV", "KH", "CM", "CA", "QA", "TD", "CL", "CN", "CY", "VA", "CO", "KM", "KP", "KR", "CI", "CR", "HR", "CU", "DK", "DM", "EC", "EG", "SV", "AE", "ER", "SK", "SI", "ES", "US", "EE", "ET", "PH", "FI", "FJ", "FR", "GA", "GM", "GE", "GH", "GD", "GR", "GT", "GY", "GN", "GQ", "GW", "HT", "HN", "HU", "IN", "ID", "IQ", "IR", "IE", "IS", "MH", "SB", "IL", "IT", "JM", "JP", "JO", "KZ", "KE", "KG", "KI", "KW", "LA", "LS", "LV", "LB", "LR", "LY", "LI", "LT", "LU", "MK", "MG", "MY", "MW", "MV", "ML", "MT", "MA", "MU", "MR", "FM", "MD", "MC", "MN", "ME", "MZ", "NA", "NR", "NP", "NI", "NE", "NG", "NO", "NZ", "OM", "NL", "PK", "PW", "PA", "PG", "PY", "PE", "PL", "PT", "GB", "CF", "CZ", "CG", "CD", "DO", "RW", "RO", "RU", "WS", "KN", "SM", "VC", "LC", "ST", "SN", "RS", "SC", "SL", "SG", "SY", "SO", "LK", "SZ", "ZA", "SD", "SS", "SE", "CH", "SR", "TH", "TZ", "TJ", "TL", "TG", "TO", "TT", "TN", "TM", "TR", "TV", "UA", "UG", "UY", "UZ", "VU", "VE", "VN", "YE", "DJ", "ZM", "ZW"};

                    for (int i = 0; i < paises1.length; i++) {
                        paises.put(codPais[i], paises1[i]);

                        comboBox = new JComboBox<>(paises1);
                    }
                        Clientes ho;
                        if (ingresarDatos[4].equals("SI")) {
                            JPanel jPanel = combobox();
                            JOptionPane.showMessageDialog(null, jPanel, "Ingrese pais de procedencia", JOptionPane.PLAIN_MESSAGE);
                            String nacionalidad = (String) comboBox.getSelectedItem();
                            ho = new Extranjero(clients.size(), Integer.parseInt(ingresarDatos[0]), ingresarDatos[1], ingresarDatos[2], ingresarDatos[3], "");
                            ho.setNacionalidad(nacionalidad);
                            clients.put(Integer.parseInt(ingresarDatos[0]), ho);

                        } else if (ingresarDatos[4].equals("NO")) {
                            ho = new Nacionales(clients.size(), Integer.parseInt(ingresarDatos[0]), ingresarDatos[1], ingresarDatos[2], ingresarDatos[3], "México");
                            clients.put(Integer.parseInt(ingresarDatos[0]),ho);
                        }
                        else break;
                }  else {
                    break;
                }
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos");
                    }


        }});

        mostrarClientes.addActionListener(e ->  {
            StringBuilder clientesInfo = new StringBuilder();
            if (clients.isEmpty()){
                JOptionPane.showMessageDialog(null,"No hay clientes que mostrar");
                return;
            }
                    for (Clientes cliente : clients.values()) {
                        clientesInfo.append("ID del cliente: ").append(cliente.getIdben()).append("\n");
                        clientesInfo.append("Nombre: ").append(cliente.getName()).append("\n");
                        clientesInfo.append("Sexo: ").append(cliente.getSex()).append("\n");
                        clientesInfo.append("Dirección: ").append(cliente.getDireccion()).append("\n");
                        clientesInfo.append("Nacionalidad: ").append(cliente.getNacionalidad()).append("\n");

                        if (cliente instanceof Nacionales nacional) {
                            clientesInfo.append("Tipo de cliente: Nacional\n");
                            clientesInfo.append("Número total de cuentas: ").append(nacional.getClistas().getSize()).append("\n");
                        } else if (cliente instanceof Extranjero extranjero) {
                            clientesInfo.append("Tipo de cliente: Extranjero\n");
                            clientesInfo.append("Número total de cuentas: ").append(extranjero.getClistas().getSize()).append("\n");
                        }
                        clientesInfo.append("\n");
                    }
                    JOptionPane.showMessageDialog(null,clientesInfo.toString(),"Todos los clientes",JOptionPane.PLAIN_MESSAGE);
    });}
    public boolean extranjero(){
        JPanel messagePanel = new JPanel();
        messagePanel.add(new JLabel("¿Es usted extranjero?"));
        int response = JOptionPane.showConfirmDialog(null, messagePanel, "Confirm", JOptionPane.YES_NO_OPTION);
        return response == JOptionPane.OK_OPTION;
    }
    private void setIconToButton(String file, int ancho, int altura, JButton button) {
        ImageIcon originalIcon = new ImageIcon(file);
        Image image = originalIcon.getImage();
        Image resizedImage = image.getScaledInstance(ancho, altura, java.awt.Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        button.setIcon(resizedIcon);
    }
    private static JPanel radiobutton(JRadioButton... button){
        JPanel radio = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        radio.setBackground(Color.ORANGE);
        for (JRadioButton radioButton: button){
            radioButton.setBackground(Color.ORANGE);
            radio.add(radioButton);
        }
        return radio;
    }
    private  JPanel combobox(){
        String[] paises1 = {"Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"
        };
        String[] codPais  = {"Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés","Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre","Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"
        };

        for (int i = 0; i < paises1.length; i++) {
            paises.put(codPais[i],paises1[i]); //para posterior
        }
JTextField c5 = new JTextField();



        JPanel pael = new JPanel();
        JFrame frame = new JFrame("Ejemplo de JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        comboBox = new JComboBox<>(paises1);
        comboBox.addActionListener(e -> c5.setText(String.valueOf(comboBox.getSelectedItem())));
        pael.add(comboBox);
        return pael;
    }



}
