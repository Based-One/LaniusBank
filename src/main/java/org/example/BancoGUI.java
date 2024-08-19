package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class BancoGUI extends JFrame {
    private JScrollPane scrollPane1;

public String[] solicitarDatos6(String dato0, String dato1, String dato2, String dato3,String dato4 ){
    JTextField camp1 = new JTextField(5);
    JTextField camp2 = new JTextField(5);
    JTextField camp3 = new JTextField(5);
    JTextField camp4 = new JTextField(5);
     JTextField camp5 = new JTextField(5);
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
    public String[] solicitarDatos2r(String mensaje1, String mensaje2) {
    JTextField campo1 = new JTextField(5);
        JTextField campo2 = new JTextField(5);
        JComboBox<String> comboBox1= comboBox;

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
        panel.add(comboBox1, constraints);
        constraints.gridy = 2;
        panel.add(label2, constraints);
        constraints.gridy = 3;
        panel.add(campo2, constraints);
        comboBox.addActionListener(e -> campo1.setText(String.valueOf(comboBox.getSelectedItem())));

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

        JPanel panel= new JPanel(new GridBagLayout());
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
    public String[] solicitarDatos4r(String mensaje1, String mensaje2, String mensaje3, String mensaje4) {

        JTextField camp1 = new JTextField(5);
        JTextField camp2 = new JTextField(5);
        JTextField camp3 = new JTextField(5);
        JTextField camp4 = new JTextField(5);
        JRadioButton W = new JRadioButton("F");
        JRadioButton M = new JRadioButton("M");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(W);
        buttonGroup.add(M);

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
        panel.add(label4, constraints);

        constraints.gridy = 7;
        panel.add(radiobutton(W, M), constraints);

        ActionListener actionListener = e -> {
            if (W.isSelected()) {
                camp4.setText("F");
            } else if (M.isSelected()) {
                camp4.setText("M");
            }
        };
        W.addActionListener(actionListener);
        M.addActionListener(actionListener);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese los datos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{camp1.getText(), camp2.getText(), camp3.getText(), camp4.getText()};
        }
        return null;
    }
    public String[] solicitarDatos3r(String mensaje1, String mensaje2, String mensaje3, String mensajeRadio) {

        JTextField camp1 = new JTextField(5);
        JTextField camp2 = new JTextField(5);
        JTextField camp3 = new JTextField(5);
        JRadioButton W = new JRadioButton("F");
        JRadioButton M = new JRadioButton("M");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(W);
        buttonGroup.add(M);

        Font font = new Font("Times New Roman", Font.PLAIN, 14);
        camp1.setFont(font);
        camp2.setFont(font);
        camp3.setFont(font);

        JLabel label1 = new JLabel(mensaje1);
        label1.setBorder(new EmptyBorder(10, 10, 10, 10));
        label1.setFont(font);

        JLabel label2 = new JLabel(mensaje2);
        label2.setBorder(new EmptyBorder(10, 10, 10, 10));
        label2.setFont(font);

        JLabel label3 = new JLabel(mensaje3);
        label3.setBorder(new EmptyBorder(10, 10, 10, 10));
        label3.setFont(font);

        JLabel labelRadio = new JLabel(mensajeRadio);
        labelRadio.setBorder(new EmptyBorder(10,10,10,10));
        labelRadio.setFont(font);

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
        panel.add(labelRadio, constraints);

        constraints.gridy = 7;
        panel.add(radiobutton(W, M), constraints);

        ActionListener actionListener = e -> {
            if (W.isSelected()) {
                camp3.setText("F");
            } else if (M.isSelected()) {
                camp3.setText("M");
            }
        };
        W.addActionListener(actionListener);
        M.addActionListener(actionListener);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese los datos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{camp1.getText(), camp2.getText(), camp3.getText()};
        }
        return null;
    }
    public String[] solicitarRadio(String mensaje1) {
        JTextField campo1 = new JTextField(5);
        JRadioButton MXN = new JRadioButton("Pesos mexicanos");
        JRadioButton DI = new JRadioButton("Divisas extranjeras");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(MXN);
        buttonGroup.add(DI);
        Font font = new Font("Times New Roman", Font.PLAIN, 14);



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
        panel.add(radiobutton(MXN,DI), constraints);

        ActionListener actionListener = e -> {
            if (MXN.isSelected()) {
                campo1.setText("MXN");
            } else if (DI.isSelected()) {
                campo1.setText("DI");
            }
        };
        MXN.addActionListener(actionListener);
        DI.addActionListener(actionListener);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese los datos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{campo1.getText() };
        }
        return null;
    }

    private final HashMap<Integer,Clientes> millonarios;
    private final Listas<CuentasAhorros> millonariosLista;
    private final Listas<SolicitudesExtracciones> listasExtrac;
    private final Listas<Solicitudes> solicitudes;
    private final Banco banco;
    private JPanel mainPanel;
    private JButton SolicitudDeposito,CrearAh,Mill,Atender,MosAho,MosSoli,MosCueCli,MostrarMIll,mostrarClientes, prueba;
    private JScrollPane scroll1,scroll3;
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

    public static void main(String[] args) {

        JFrame frame = new JFrame("BancoGUI");
        frame.setContentPane(new BancoGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Image imageIcon = new ImageIcon("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG1 (2).jpg").getImage();
        frame.setIconImage(imageIcon);
        frame.setResizable(true);
    }
    public BancoGUI() {
        this.banco = new Banco();
this.millonariosLista = new Listas<>();
        this.millonarios = new HashMap<>();
//        this.bankActive = false;
        this.listasExtrac = new Listas<>();
        this.clients = new HashMap<>();
        this.paises = new HashMap<>();
        this.comboBox = new JComboBox<>();
        this.solicitudes = new Listas<>();

        SolicitudDeposito.addActionListener(e -> {
            while (true) {
                try {
//                     Solicitar ID del beneficiario
                    String[] datosIngresados1 = solicitarDatos1("Ingrese el ID del beneficiario");
                    int idBeneficiario = Integer.parseInt(datosIngresados1[0]);

                    // Verificar si el ID del beneficiario es válido
                    if (!clients.containsKey(idBeneficiario)) {
                        JOptionPane.showMessageDialog(null, "ID incorrecto o no existe");
                        break;
                    }
                    String[] radio = solicitarRadio("Ingrese la moneda");
                    System.out.println(radio[0]);
                    if (radio[0].equals("MXN")) {


                        // Verificar si el cliente tiene cuentas asociadas
                        if (clients.get(idBeneficiario).clistas.esVacia() && clients.get(idBeneficiario) != null) {
                            // Solicitar nombre y monto para la solicitud de depósito
                            String[] datosIngresados2 = solicitarDatos2("Ingrese el nombre", "Ingrese el monto");

                            // Crear una instancia de SolicitudDeposito y agregarla a la lista de solicitudes
                            solicitudes.addElement(new SolicitudesDeposito(idBeneficiario, clients.get(idBeneficiario).clistas.longitud(), datosIngresados2[0], Float.parseFloat(datosIngresados2[1])));
                            JOptionPane.showMessageDialog(null, "Solicitud de depósito ha sido realizada con éxito");
                            break;
                        } else {
                            // Si el cliente no tiene cuentas asociadas, solicitar datos adicionales para la solicitud de depósito
                            String[] datosIngresados = solicitarDatos3("Número de la cuenta", "Ingrese el nombre", "Ingrese el monto:");

                            // Verificar si los datos ingresados son válidos
                            if (datosIngresados != null) {
                                if (Integer.parseInt(datosIngresados[0]) < 0 || Float.parseFloat(datosIngresados[2]) < 0) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos");
                                } else {
                                    int idCliente = Integer.parseInt(datosIngresados1[0]);
                                    // Verificar si el ID del cliente es válido
                                    if (clients.get(idCliente) != null) {
                                        // Crear una instancia de SolicitudDeposito y agregarla a la lista de solicitudes
                                        solicitudes.addElement(new SolicitudesDeposito(idCliente, Integer.parseInt(datosIngresados[0]), datosIngresados[1], Float.parseFloat(datosIngresados[2])));
                                        JOptionPane.showMessageDialog(null, "Solicitud de depósito ha sido realizada con éxito");
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "ID incorrecto o el cliente no existe");
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    } else if (radio[0].equals("DI")) {
                        // Verificar si el cliente tiene cuentas asociadas
                        if (clients.get(idBeneficiario).clistas.esVacia() && clients.get(idBeneficiario) != null) {
                            // Solicitar nombre y monto para la solicitud de depósito
                            String[] datosIngresados2 = solicitarDatos2("Ingrese el nombre", "Ingrese el monto");

                            // Crear una instancia de SolicitudDeposito y agregarla a la lista de solicitudes
                            solicitudes.addElement(new SolicitudesDivisas(idBeneficiario, clients.get(idBeneficiario).clistas.longitud() - 1, datosIngresados2[0], Float.parseFloat(datosIngresados2[1])));
                            JOptionPane.showMessageDialog(null, "Solicitud de depósito ha sido realizada con éxito");
                            break;
                        } else {
                            // Si el cliente no tiene cuentas asociadas, solicitar datos adicionales para la solicitud de depósito
                            String[] datosIngresados = solicitarDatos3("Número de la cuenta", "Ingrese el nombre", "Ingrese el monto:");

                            // Verificar si los datos ingresados son válidos
                            if (datosIngresados != null) {
                                if (Integer.parseInt(datosIngresados[0]) < 0 || Float.parseFloat(datosIngresados[2]) < 0) {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos");
                                } else {
                                    int idCliente = Integer.parseInt(datosIngresados1[0]);
                                    // Verificar si el ID del cliente es válido
                                    if (clients.get(idCliente) != null) {
                                        // Crear una instancia de SolicitudDeposito y agregarla a la lista de solicitudes
                                        solicitudes.addElement(new SolicitudesDivisas(idCliente, Integer.parseInt(datosIngresados[0]), datosIngresados[1], Float.parseFloat(datosIngresados[2])));
                                        JOptionPane.showMessageDialog(null, "Solicitud de depósito ha sido realizada con éxito");
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "ID incorrecto o el cliente no existe");
                                    }
                                }
                            } else {
                                break;
                            }
                        }

                    } else break;
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Algo salió mal");
                    break;
                }
            }
        });


        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG1 (3).jpg", 200, 200, Mill);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG3 (2).jpg", 200, 200, SolicitudDeposito);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG3 (3).jpg", 200, 200, Atender);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG4..jpg", 200, 200, CrearAh);
        setIconToButton("C:/Users/esteb/IdeaProjects/Software_Bank/src/Images/OIG3 (4).jpg", 200, 200, CrearExtrac);
         MosAho.setToolTipText("Mostrar las cuentas de ahorro");
        Atender.addActionListener(e -> {
            if (solicitudes.longitud() > 0) {

                JOptionPane.showMessageDialog(null, solicitudes.longitud() + " Solicitudes fueron atendidas con exito");
                banco.atenderSolicitudes(solicitudes, clients);
            } else {
                JOptionPane.showMessageDialog(null, "No hay solicitudes las cuales atender");

            }
        });

        Mill.addActionListener(e -> {
            if (!clients.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Cuentas de ahorro con más de 1M han sido eliminadas con éxito");
                banco.bajaAMillonarios(clients,millonarios);
            } else {
                JOptionPane.showMessageDialog(null, "No hay clientes");
            }


        });

        CrearExtrac.addActionListener(e -> {
            try {

                String[] datosIdCliente = solicitarDatos1("Ingrese su ID");
                if (datosIdCliente == null) {
                    return;
                }

                int idCliente = Integer.parseInt(datosIdCliente[0]);

                if (!clients.containsKey(idCliente)) {
                    JOptionPane.showMessageDialog(null, "No hay ningún cliente asociado con ese ID.");
                    return;
                }

                String[] datosExtraccion = solicitarDatos4r("Ingrese el número de cuenta", "Ingrese su nombre", "Monto", "Sexo");
                if (datosExtraccion == null) {
                    return;
                }

                int numeroCuenta = Integer.parseInt(datosExtraccion[0]);
                float monto = Float.parseFloat(datosExtraccion[2]);
                String sexo = datosExtraccion[3];

                CuentasAhorros cuenta = clients.get(idCliente).getClistas().obtener(numeroCuenta);
                if (cuenta == null) {
                    JOptionPane.showMessageDialog(null, "No existe ninguna cuenta asociada con ese número.");
                    return;
                }

                if (monto > cuenta.getSaldoAct()) {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes en la cuenta: " + cuenta.getSaldoAct());
                    return;
                }

                if (monto < 0) {
                    JOptionPane.showMessageDialog(null, "No se puede ingresar un monto negativo.");
                    return;
                }

                if (clients.get(idCliente) instanceof Extranjero) {
                    paises();
                    String[] datosExtra = solicitarDatos2r("Ingrese su nacionalidad", "Ingrese su dirección");
                    listasExtrac.addElement(new SolicitudesExtracciones(idCliente, numeroCuenta, datosExtraccion[1], monto, sexo, datosExtra[0], datosExtra[1]));
                } else {
                    listasExtrac.addElement(new SolicitudesExtracciones(idCliente, numeroCuenta, datosExtraccion[1], monto, sexo));
                }

                JOptionPane.showMessageDialog(null, "Solicitud de extracción realizada con éxito.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage());
            }
        });



        MostrarMIll.addActionListener(e -> {
            if (!millonarios.isEmpty()) {
                StringBuilder millonariosS = new StringBuilder();
                for (Clientes millonario : millonarios.values()) {
                    // Obtener la lista de cuentas de ahorro del millonario
                    Listas<CuentasAhorros> cuentasAhorro = millonario.getClistas();

                    // Iterar sobre las cuentas de ahorro del millonario
                    for (int i = 0; i < cuentasAhorro.longitud(); i++) {
                        CuentasAhorros cuenta = cuentasAhorro.obtener(i);
                        // Verificar si el saldo de la cuenta es mayor a un millón
                        if (cuenta.getSaldoAct() > 1000000) {
                            millonariosS.append("Nombre: ").append(millonario.name).append("Cuenta de ahorro con id: ").append(millonario.getIdben()).append(" y saldo de: $").append(cuenta.getSaldoAct()).append("\n");
                        }
                    }
                }

                if (!millonariosS.isEmpty()) {
                    JOptionPane.showMessageDialog(null, millonariosS.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No hay cuentas de ahorro con más de 1M");
                }
            } else {
                JOptionPane.showMessageDialog(null, "vacio");
            }
        });



        MosSoli.addActionListener(e -> {
            StringBuilder mensaje = new StringBuilder();
            for (int i = 0; i < solicitudes.longitud(); i++) {
                Solicitudes solicitud = solicitudes.obtener(i);
                if (solicitud instanceof SolicitudesDeposito depositoSolicitud) {
                    mensaje.append("Solicitud de Depósito:\n");
                    mensaje.append("Número de cuenta: ").append(depositoSolicitud.idCuenta).append("\n");
                    mensaje.append("Monto: ").append(depositoSolicitud.getMonto()).append("\n");
                    mensaje.append("Número del beneficiario: ").append(depositoSolicitud.getNumid()).append("\n");
                } else if (solicitud instanceof SolicitudesExtracciones extraccionSolicitud) {
                    mensaje.append("Solicitud de Retiro:\n");
                    mensaje.append("Número de cuenta: ").append(extraccionSolicitud.idCuenta).append("\n");
                    mensaje.append("Monto: ").append(extraccionSolicitud.getMonto()).append("\n");
                    mensaje.append("Número del cliente: ").append(extraccionSolicitud.getNumid()).append("\n");
                }else if (solicitud instanceof SolicitudesDivisas divisas) {
                    mensaje.append("Solicitud de Divisa:\n");
                    mensaje.append("Número de cuenta: ").append(divisas.idCuenta).append("\n");
                    mensaje.append("Monto: ").append(divisas.getMonto()).append("\n");
                    mensaje.append("Número del cliente: ").append(divisas.getNumid()).append("\n");
                }
                mensaje.append("\n");
            }
            if (mensaje.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay solicitudes pendientes.");
            } else {
                JTextArea textArea = new JTextArea(mensaje.toString());
                textArea.setEditable(false);

                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 300)); // Establecer el tamaño preferido del panel desplazable

                JOptionPane.showMessageDialog(null, scrollPane, "Solicitudes Pendientes", JOptionPane.PLAIN_MESSAGE);
            }
        });

        MosAho.addActionListener(e -> {
            if (!clients.isEmpty()) {
                StringBuilder Ahorro = new StringBuilder();

                // Recorre todos los clientes y sus cuentas de ahorro asociadas
                for (Clientes cliente : clients.values()) {
                    for (int i = 0; i < cliente.clistas.longitud(); i++) {
                        CuentasAhorros cuenta = cliente.clistas.obtener(i);
                        Ahorro.append("ID del cliente: ").append(cliente.getIdben()).append(" ")
                                .append("ID de la cuenta: ").append(cuenta.getNumCu()).append(" ")
                                .append("Saldo: $").append(cuenta.getSaldoAct()).append("\n");
                    }

                }

                JOptionPane.showMessageDialog(null, Ahorro.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No hay cuentas de ahorro para mostrar");
            }
        });


        CrearAh.addActionListener(e -> {


            while (true) {
                String[] datosIngresados = solicitarDatos2("Ingrese ID:", "Ingrese el saldo:");

                if (datosIngresados != null) {
                    try {
                        if (clients.isEmpty()){
                            JOptionPane.showMessageDialog(null,"No hay clientes");
                            return;
                        }

                        if (datosIngresados.length >= 1) {
                            int idNum = Integer.parseInt(datosIngresados[0]);
                            float saldo = datosIngresados.length == 2 ? Float.parseFloat(datosIngresados[1]) : 0;
                            if (Integer.parseInt(datosIngresados[1]) == 0){
                                JOptionPane.showMessageDialog(null,"Cuidao, no se pueden crear cuentas con cero de saldo pillo");
                                return;
                            }
                            if (saldo < 0 || idNum < 0) {
                                JOptionPane.showMessageDialog(null, "Los valores ingresados no pueden ser negativos.");
                                return;
                            }
                            CuentasAhorros nuevaCuenta = new CuentasAhorros(idNum,clients.get(idNum).clistas.longitud(), saldo);

                            clients.get(idNum).getClistas().addElement(nuevaCuenta);
                            JOptionPane.showMessageDialog(null, "La cuenta con ID '" + idNum + "' ha sido creada exitosamente.");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos.");
                    }
                } else {
                    break;
                }
            }
        });


        MosCueCli.addActionListener(e -> {
            while (true) {
                try {
                    String[] ingresarDatos = solicitarDatos1("Ingrese el ID del cliente");
                    if (ingresarDatos != null) {

                        StringBuilder clienInfo = new StringBuilder();
                        int clienteID = Integer.parseInt(ingresarDatos[0]);
                        Clientes cliente = clients.get(clienteID);
                        for (int i = 0; i < clients.get(clienteID).clistas.longitud(); i++) {
                            cliente.clistas.obtener(i).setNumCu(i + 1);
                        }
                        if (cliente != null) {
                            if (!cliente.clistas.esVacia()) {
                                clienInfo.append("Cliente: ").append(cliente.getName()).append("  ID: ").append(cliente.getIdben()).append("\n");
                                for (int i = 0; i < cliente.clistas.longitud(); i++) {
                                    clienInfo.append("Numero de la cuenta: ").append(cliente.clistas.obtener(i).getNumCu()).append("\n");
                                    clienInfo.append("Saldo: ").append(cliente.clistas.obtener(i).getSaldoAct()).append("\n\n");
                                }

                            } else {
                                clienInfo.append("El cliente no tiene cuentas asociadas.");
                            }
                            JOptionPane.showMessageDialog(null, clienInfo.toString());
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "El ID es incorrecto o el cliente no existe");
                        }
                    } else {
                        break;
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Algo salió mal");
                }
            }
        });

        MosExtr.addActionListener(e -> {
            if (listasExtrac.longitud() > 0) {
                StringBuilder Extract = new StringBuilder();
                for (int i = 0; i < listasExtrac.longitud(); i++) {
                    Extract.append(i + 1).append(" ").append("Nombre: ").append(listasExtrac.obtener(i).getNombre()).append("ID: ").append(listasExtrac.obtener(i).getNumid()).append(" por un monto de").append(listasExtrac.obtener(i).getMonto());

                }
                JOptionPane.showMessageDialog(null, Extract.toString());

            } else {
                JOptionPane.showMessageDialog(null, "No hay nada para mostrar");
            }


        });
        ElSoli.addActionListener(e -> {
            if (!solicitudes.esVacia()) {
                int idSolicitud;
                try {
                    idSolicitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la solicitud de depósito que desea eliminar:"));

                    // Buscar la solicitud en la lista general de solicitudes
                    for (int i = 0; i < solicitudes.longitud(); i++) {
                        Solicitudes solicitud = solicitudes.obtener(i);
                        if (solicitud instanceof SolicitudesDeposito && solicitud.idCuenta == idSolicitud) {
                            solicitudes.eliminarIndex(i);
                            JOptionPane.showMessageDialog(null, "La solicitud de depósito ha sido eliminada correctamente.");
                            return; // Salir del método después de eliminar la solicitud
                        }
                    }
                    // Si no se encuentra la solicitud
                    JOptionPane.showMessageDialog(null, "La solicitud de depósito con ID " + idSolicitud + " no existe.");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido para el ID de la solicitud.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay solicitudes para eliminar.");
            }
        });

        EliCuenta.addActionListener(e -> {
            if (!clients.isEmpty()) {
                try {
                    String[] dato = solicitarDatos1("Ingrese el ID del cliente el cual desea eliminar la cuenta");
                    if (dato == null){
                        return;
                    }
                    int idCliente = Integer.parseInt(dato[0]);

                    if (idCliente >= 0 ) {
                        Clientes cliente = clients.get(Integer.parseInt(dato[0]));

                        // Verificar si el cliente tiene cuentas asociadas
                        if (!cliente.getClistas().esVacia()) {
                            int indiceCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el índice de la cuenta que desea eliminar para el cliente " + cliente.getName() + ":"));

                            if (indiceCuenta >= 0 && indiceCuenta < cliente.getClistas().longitud()) {
                                cliente.getClistas().eliminarIndex(indiceCuenta);
                                JOptionPane.showMessageDialog(null, "La cuenta ha sido eliminada correctamente para el cliente " + cliente.getName() + ".");
                            } else {
                                JOptionPane.showMessageDialog(null, "El índice de la cuenta es inválido.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El cliente " + cliente.getName() + " no tiene cuentas para eliminar.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El índice del cliente es inválido.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número válido para el índice del cliente y de la cuenta.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay clientes para eliminar cuentas.");
            }
        });

        CreaCl.addActionListener(e -> {

            while (true) {
                try {
                    String[] ingresarDatos = solicitarDatos6("Ingresar numero de identificacion", "Ingresar nombre completo", "Sexo", "Ingresar direccion", "¿Es el cliente extranjero?");
                    if (ingresarDatos != null) {
                        if (clients.containsKey(Integer.parseInt(ingresarDatos[0]))) {
                            JOptionPane.showMessageDialog(null, "Ya hay un cliente con ese ID");
                            return;
                        }
                        paises();
                        Clientes ho;
                        if (ingresarDatos[4].equals("SI")) {
                            JPanel jPanel = combobox();
                            JOptionPane.showMessageDialog(null, jPanel, "Ingrese pais de procedencia", JOptionPane.PLAIN_MESSAGE);
                            String nacionalidad = (String) comboBox.getSelectedItem();
                            ho = new Extranjero(clients.size(), Integer.parseInt(ingresarDatos[0]), ingresarDatos[1], ingresarDatos[2], ingresarDatos[3], "");
                            ho.setNacionalidad(nacionalidad);
                            clients.put(Integer.parseInt(ingresarDatos[0]), ho);
                            JOptionPane.showMessageDialog(null, "El cliente ha sido creado");

                        } else if (ingresarDatos[4].equals("NO")) {
                            ho = new Nacionales(clients.size(), Integer.parseInt(ingresarDatos[0]), ingresarDatos[1], ingresarDatos[2], ingresarDatos[3], "México");
                            clients.put(Integer.parseInt(ingresarDatos[0]), ho);
                            JOptionPane.showMessageDialog(null, "El cliente ha sido creado");
                        } else break;
                    } else {
                        break;
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos");
                }


            }
        });
        prueba.addActionListener(e -> {
            try {
                // Generar un ID único para el cliente
                int id = clients.size() + 1;

                // Verificar si el ID ya existe
                if (clients.containsKey(id)) {
                    JOptionPane.showMessageDialog(null, "Error: El ID generado ya está en uso.");
                    return;
                }

                // Crear un nuevo cliente extranjero como prueba
                Clientes nuevoCliente = new Extranjero(id, id, "Cliente Prueba " + id, "M", "Dirección de Prueba " + id, "País de Prueba");

                // Agregar el nuevo cliente a la lista de clientes
                clients.put(id, nuevoCliente);

                // Solicitar saldo para la cuenta
                float saldo = 1000000000; // Por ejemplo, saldo inicial de $1000

                // Crear una nueva cuenta de ahorros con el mismo ID que el cliente
                CuentasAhorros nuevaCuenta = new CuentasAhorros(id, saldo);
// Crear una nueva cuenta de ahorros con el mismo ID que el cliente

// Obtener la lista de cuentas del cliente extranjero y agregar la nueva cuenta
                Listas<CuentasAhorros> cuentasCliente = nuevoCliente.getClistas();
                if (cuentasCliente != null) {
                    int sizeBefore = cuentasCliente.getSize();
                    cuentasCliente.addElement(nuevaCuenta);
                    int sizeAfter = cuentasCliente.getSize();

                    // Imprimir el tamaño antes y después de agregar la nueva cuenta
                    System.out.println("Tamaño de la lista antes de agregar: " + sizeBefore);
                    System.out.println("Tamaño de la lista después de agregar: " + sizeAfter);
                } else {
                    System.out.println("Error: La lista de cuentas del cliente es null.");
                }


                // Obtener la lista de cuentas del cliente extranjero y agregar la nueva cuenta

                // Agregar la nueva cuenta a la lista general de cuentas de ahorro
//                AhorroListas.addElement(nuevaCuenta);

                // Registrar la transacción

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(null, "Cliente de prueba y cuenta asociada creados exitosamente con ID: " + id);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: El ID generado no es válido.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al agregar cliente y cuenta de prueba: " + ex.getMessage());
            }
        });
//MostrarLogs.addActionListener(e -> mostrarLogs());

        mostrarClientes.addActionListener(e -> {
            JTextArea clientesInfoTextArea = new JTextArea(20, 50); // Define un JTextArea con tamaño inicial
            clientesInfoTextArea.setEditable(false); // Hace que el JTextArea no sea editable
            JScrollPane scrollPane = new JScrollPane(clientesInfoTextArea); // Agrega el JTextArea a un JScrollPane

            StringBuilder clientesInfo = new StringBuilder();
            if (clients.isEmpty()) {
                clientesInfo.append("No hay clientes que mostrar");
            } else {
                for (Clientes cliente : clients.values()) {
                    clientesInfo.append("ID del cliente: ").append(cliente.getIdben()).append("\n");
                    clientesInfo.append("Nombre: ").append(cliente.getName()).append("\n");
                    clientesInfo.append("Sexo: ").append(cliente.getSex()).append("\n");
                    clientesInfo.append("Cuentas de ahorro:").append(cliente.clistas.longitud()).append("\n");
                    if (cliente.clistas.esVacia()) {
                        clientesInfo.append("    - Este cliente no tiene cuentas de ahorro registradas\n");
                    } else {
                        for (int i = 0; i < cliente.clistas.longitud(); i++) {
                            CuentasAhorros cuenta = cliente.clistas.obtener(i);
                            clientesInfo.append("    - ID de la cuenta: ").append(cuenta.getNumCu()).append("\n");
                            clientesInfo.append("      Saldo actual: ").append(cuenta.getSaldoAct()).append("\n");
                        }
                    }
                    if (cliente instanceof Nacionales nacional) {
                        clientesInfo.append("Tipo de cliente: Nacional\n");
                        clientesInfo.append("Número total de cuentas: ").append(nacional.getClistas().longitud()).append("\n");
                    } else if (cliente instanceof Extranjero extranjero) {
                        clientesInfo.append("Tipo de cliente: Extranjero\n");
                        clientesInfo.append("Número total de cuentas: ").append(extranjero.getClistas().longitud()).append("\n");
                    }
                    clientesInfo.append("-----------------------").append("\n");
                }
            }

            clientesInfoTextArea.setText(clientesInfo.toString()); // Establece el texto en el JTextArea

            JOptionPane.showMessageDialog(null, scrollPane, "Todos los clientes", JOptionPane.PLAIN_MESSAGE);
        });

    }

        private void paises() {
        String[] paises1 = {"Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"
        };
        String[] codPais = {"AF", "AL", "DE", "AD", "AO", "AG", "SA", "DZ", "AR", "AM", "AU", "AT", "AZ", "BS", "BD", "BB", "BH", "BE", "BZ", "BJ", "BY", "MM", "BO", "BA", "BW", "BR", "BN", "BG", "BF", "BI", "BT", "CV", "KH", "CM", "CA", "QA", "TD", "CL", "CN", "CY", "VA", "CO", "KM", "KP", "KR", "CI", "CR", "HR", "CU", "DK", "DM", "EC", "EG", "SV", "AE", "ER", "SK", "SI", "ES", "US", "EE", "ET", "PH", "FI", "FJ", "FR", "GA", "GM", "GE", "GH", "GD", "GR", "GT", "GY", "GN", "GQ", "GW", "HT", "HN", "HU", "IN", "ID", "IQ", "IR", "IE", "IS", "MH", "SB", "IL", "IT", "JM", "JP", "JO", "KZ", "KE", "KG", "KI", "KW", "LA", "LS", "LV", "LB", "LR", "LY", "LI", "LT", "LU", "MK", "MG", "MY", "MW", "MV", "ML", "MT", "MA", "MU", "MR", "FM", "MD", "MC", "MN", "ME", "MZ", "NA", "NR", "NP", "NI", "NE", "NG", "NO", "NZ", "OM", "NL", "PK", "PW", "PA", "PG", "PY", "PE", "PL", "PT", "GB", "CF", "CZ", "CG", "CD", "DO", "RW", "RO", "RU", "WS", "KN", "SM", "VC", "LC", "ST", "SN", "RS", "SC", "SL", "SG", "SY", "SO", "LK", "SZ", "ZA", "SD", "SS", "SE", "CH", "SR", "TH", "TZ", "TJ", "TL", "TG", "TO", "TT", "TN", "TM", "TR", "TV", "UA", "UG", "UY", "UZ", "VU", "VE", "VN", "YE", "DJ", "ZM", "ZW"};

        for (int i = 0; i < paises1.length; i++) {
            paises.put(codPais[i], paises1[i]);

            comboBox = new JComboBox<>(paises1);
        }
    }

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
//    private void mostrarLogs() {
//        StringBuilder logs = new StringBuilder();
//
//        try {
//            BufferedReader depositosReader = new BufferedReader(new FileReader(RegistroTransacciones.DEPOSIT_LOG_FILE));
//            BufferedReader retirosReader = new BufferedReader(new FileReader(RegistroTransacciones.WITHDRAWAL_LOG_FILE));
//
//            String line;
//            logs.append("Registros de Depósitos:\n");
//            while ((line = depositosReader.readLine()) != null) {
//                logs.append(line).append("\n");
//            }
//
//            logs.append("\nRegistros de Retiros:\n");
//            while ((line = retirosReader.readLine()) != null) {
//                logs.append(line).append("\n");
//            }
//
//            depositosReader.close();
//            retirosReader.close();
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(null, "Error al leer los archivos de registro: " + ex.getMessage());
//            return;
//        }
//
//        JTextArea logsArea = new JTextArea(logs.toString());
//        JScrollPane scrollPane = new JScrollPane(logsArea);
//        scrollPane.setPreferredSize(new Dimension(400, 300));
//
//        JOptionPane.showMessageDialog(null, scrollPane, "Logs de Depósitos y Retiros", JOptionPane.PLAIN_MESSAGE);
//    }



}
