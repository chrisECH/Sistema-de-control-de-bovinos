package Interfaz;

import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Christian
 */
public class Registro extends javax.swing.JFrame {

    String ruta;
    String ruta2;

    public Registro() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana
        setResizable(true); //Evita que se modifique el tamaño
        
         jlblOtro.setVisible(false);
         jtxRaza.setVisible(false);
         jlblOtraBaja.setVisible(false);
         jtxOtro.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMenu1 = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEvento = new javax.swing.JButton();
        BtnArbol1 = new javax.swing.JButton();
        btnBuscarVaca = new javax.swing.JButton();
        BtnEvento1 = new javax.swing.JButton();
        BtnArbol = new javax.swing.JButton();
        btnBuscarVaca1 = new javax.swing.JButton();
        btnBuscarBecerro = new javax.swing.JButton();
        jplMinCer = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinim = new javax.swing.JLabel();
        jplPrincipal = new javax.swing.JPanel();
        jlBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxCarac = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxPesoNac = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxColor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxPesoDest = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtxDiaBaja = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtxDiaNac = new javax.swing.JTextField();
        jtxArete = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxObservaciones = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtxAnioNac = new javax.swing.JTextField();
        jtxAnioBaja = new javax.swing.JTextField();
        comboBoxSexo = new javax.swing.JComboBox<>();
        jBoxMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBoxMesBaja = new javax.swing.JComboBox<>();
        jlbImagen2 = new javax.swing.JLabel();
        btnAbrirImagen = new javax.swing.JButton();
        jlbImagen = new javax.swing.JLabel();
        btnAbrirImagen2 = new javax.swing.JButton();
        jboxCausa = new javax.swing.JComboBox<>();
        jtxOtro = new javax.swing.JTextField();
        jboxRaza = new javax.swing.JComboBox<>();
        jtxRaza = new javax.swing.JTextField();
        jlblOtro = new javax.swing.JLabel();
        jlblOtraBaja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jplMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jplMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 39)));
        jplMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar.setToolTipText("Buscar algun evento.");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnBuscar.setBorderPainted(false);
        BtnBuscar.setContentAreaFilled(false);
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 92, 0));
        jLabel9.setText("Menu");
        jplMenu1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        btnRegistrar.setToolTipText("Registrar una vaca.");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        btnRegistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jplMenu1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerrocafe.png"))); // NOI18N
        BtnAgregar.setToolTipText("Registrar cria.");
        BtnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnAgregar.setBorderPainted(false);
        BtnAgregar.setContentAreaFilled(false);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerrocafe.png"))); // NOI18N
        BtnAgregar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerrocafe.png"))); // NOI18N
        BtnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        BtnEvento.setToolTipText("Registrar cria.");
        BtnEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnEvento.setBorderPainted(false);
        BtnEvento.setContentAreaFilled(false);
        BtnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEventoActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 90, -1));

        BtnArbol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol1.setToolTipText("Registrar árbol genealógico.");
        BtnArbol1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnArbol1.setBorderPainted(false);
        BtnArbol1.setContentAreaFilled(false);
        BtnArbol1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnArbol1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnArbol1ActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnArbol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        btnBuscarVaca.setToolTipText("Registrar cria.");
        btnBuscarVaca.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnBuscarVaca.setBorderPainted(false);
        btnBuscarVaca.setContentAreaFilled(false);
        btnBuscarVaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarVaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVacaActionPerformed(evt);
            }
        });
        jplMenu1.add(btnBuscarVaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 90, -1));

        BtnEvento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento1.setToolTipText("Registrar evento.");
        BtnEvento1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnEvento1.setBorderPainted(false);
        BtnEvento1.setContentAreaFilled(false);
        BtnEvento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEvento1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEvento1ActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnEvento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 90, -1));

        BtnArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol.setToolTipText("Registrar cria.");
        BtnArbol.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnArbol.setBorderPainted(false);
        BtnArbol.setContentAreaFilled(false);
        BtnArbol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnArbol.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnArbolActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        btnBuscarVaca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca1.setToolTipText("Buscar vaca.");
        btnBuscarVaca1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnBuscarVaca1.setBorderPainted(false);
        btnBuscarVaca1.setContentAreaFilled(false);
        btnBuscarVaca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarVaca1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVaca1ActionPerformed(evt);
            }
        });
        jplMenu1.add(btnBuscarVaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 90, -1));

        btnBuscarBecerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerroBusqueda.png"))); // NOI18N
        btnBuscarBecerro.setToolTipText("Buscar cria.");
        btnBuscarBecerro.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnBuscarBecerro.setBorderPainted(false);
        btnBuscarBecerro.setContentAreaFilled(false);
        btnBuscarBecerro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBecerro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerroBusqueda.png"))); // NOI18N
        btnBuscarBecerro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerroBusqueda.png"))); // NOI18N
        btnBuscarBecerro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerroBusqueda.png"))); // NOI18N
        btnBuscarBecerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBecerroActionPerformed(evt);
            }
        });
        jplMenu1.add(btnBuscarBecerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 90, -1));

        jplMinCer.setBackground(new java.awt.Color(255, 255, 255));
        jplMinCer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jplMinCer.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 30, 30));

        btnMinim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimMouseClicked(evt);
            }
        });
        jplMinCer.add(btnMinim, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 30, 30));

        jplPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Back_64px.png"))); // NOI18N
        jlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBackMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Arete:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Raza:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Características:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Color:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Peso al nacer:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Peso al destete:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Fecha de baja:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Causa de baja:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Observaciones:");

        jtxObservaciones.setColumns(20);
        jtxObservaciones.setLineWrap(true);
        jtxObservaciones.setRows(5);
        jScrollPane1.setViewportView(jtxObservaciones);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 0));
        jLabel8.setText("Registro.");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_aceptar.png"))); // NOI18N
        btnAceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_aceptar.png"))); // NOI18N
        btnAceptar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_aceptar.png"))); // NOI18N
        btnAceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_aceptar.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelarbtn.png"))); // NOI18N
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelarbtn.png"))); // NOI18N
        btnCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelarbtn.png"))); // NOI18N
        btnCancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelarbtn.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hembra", "Macho" }));
        comboBoxSexo.setSelectedIndex(-1);

        jBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jBoxMes.setSelectedIndex(-1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("En el apartado de pesos, ingrese unicamente los números.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Nota:");

        jBoxMesBaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jBoxMesBaja.setSelectedIndex(-1);

        jlbImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAbrirImagen.setText("Agregar foto");
        btnAbrirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirImagenActionPerformed(evt);
            }
        });

        jlbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAbrirImagen2.setText("Agregar foto");
        btnAbrirImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirImagen2ActionPerformed(evt);
            }
        });

        jboxCausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermedad", "Venta pie cría", "Infértil", "Pododermatitis", "Lesión", "Desecho", "Improductivo", "Otra" }));
        jboxCausa.setSelectedIndex(-1);
        jboxCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxCausaActionPerformed(evt);
            }
        });

        jboxRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suiza", "Simmental", "Brahman", "Brahman/Simmental", "Brahman/Suiza", "Otra" }));
        jboxRaza.setSelectedIndex(-1);
        jboxRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxRazaActionPerformed(evt);
            }
        });

        jlblOtro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblOtro.setText("Otra:");

        jlblOtraBaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblOtraBaja.setText("Otra:");

        javax.swing.GroupLayout jplPrincipalLayout = new javax.swing.GroupLayout(jplPrincipal);
        jplPrincipal.setLayout(jplPrincipalLayout);
        jplPrincipalLayout.setHorizontalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)))
                    .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                                .addComponent(btnAbrirImagen2)
                                .addGap(104, 104, 104))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addComponent(jboxCausa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jlblOtraBaja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxOtro)
                                .addGap(72, 72, 72))
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxPesoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxPesoDest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                                        .addComponent(jboxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jlblOtro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8))))
                                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                                        .addComponent(jtxDiaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBoxMesBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxAnioBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                                .addComponent(btnAbrirImagen)
                                .addGap(105, 105, 105))))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addComponent(jtxDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxCarac, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxArete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addGap(56, 56, 56)
                                .addComponent(btnCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jplPrincipalLayout.setVerticalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jlbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrirImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbrirImagen2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(78, 78, 78))
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxArete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jboxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblOtro))
                .addGap(12, 12, 12)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBoxMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jtxDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtxCarac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jtxPesoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jtxDiaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoxMesBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxAnioBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jboxCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jlblOtraBaja))
                        .addGap(14, 14, 14)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxPesoDest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jplMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplMinCer, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jplPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jplMinCer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jplPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.setVisible(false); //oculta esta ventana
        new Buscar().setVisible(true); //Muestra la ventana de Buscar
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //No hace nada, puesto que se encuentra en esa ventana, este metodo es del boton registrar del menu lateral.
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        this.setVisible(false); // Oculta esta ventana
        new Becerro().setVisible(true); //Muestra la ventana de Becerro
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEventoActionPerformed

    }//GEN-LAST:event_BtnEventoActionPerformed

    private void BtnArbol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnArbol1ActionPerformed
        this.setVisible(false); //Oculta esta ventana
        new Arbol().setVisible(true); //Muetsra la ventana de Arbol
    }//GEN-LAST:event_BtnArbol1ActionPerformed

    private void btnBuscarVacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVacaActionPerformed
        this.setVisible(false); //Oculta esta ventana
        new Evento().setVisible(true);  //Muestra la ventana de Evento
    }//GEN-LAST:event_btnBuscarVacaActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        int dialogo = JOptionPane.YES_NO_OPTION; //Guarda un valor dependiendo de la opcion a seleccionar
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialogo); //Muestra el aviso
        if (resultado == 0) { //Si presiona el boton Si, equivale a un 0 y se cierra el programa
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimMouseClicked
        // TODO add your handling code here:
        this.setState(Principal.ICONIFIED); //Miniminiza la ventana
    }//GEN-LAST:event_btnMinimMouseClicked

    private void jlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBackMouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;//Guarda un valor dependiendo de la opcion a seleccionar
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea volver a la pantalla principal?", "Exit", dialogo);//Muestra el aviso
        if (resultado == 0) { //Si presiona el boton Si, equivale a un 0 y vuelve a la ventana principal
            this.setVisible(false); //Cierra esta ventana 
            new Principal().setVisible(true); // Muestra la ventana Principal
        }
    }//GEN-LAST:event_jlBackMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Registrar(); //Llama al boton Registrar
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int dialogo = JOptionPane.YES_NO_OPTION;//Guarda un valor dependiendo de la opcion a seleccionar
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea cancelar el registro?", "Exit", dialogo);//Muestra el aviso
        if (resultado == 0) {//Si presiona el boton Si, equivale a un 0 , cancela el registro
            this.setVisible(false); //Cierra esta ventana
            new Principal().setVisible(true); //Muestra la ventana Principal
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void BtnEvento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEvento1ActionPerformed
        this.setVisible(false); //Cierra esta ventana
        new Evento().setVisible(true); //Muestra la ventana Evento
    }//GEN-LAST:event_BtnEvento1ActionPerformed

    private void BtnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnArbolActionPerformed
        //No hace nada
    }//GEN-LAST:event_BtnArbolActionPerformed

    private void btnBuscarVaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVaca1ActionPerformed
        this.setVisible(false); //Cierra esta ventana
        new BuscarVaca().setVisible(true); //Muestra la ventana BuscarVaca
    }//GEN-LAST:event_btnBuscarVaca1ActionPerformed

    private void btnAbrirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirImagenActionPerformed
        JFileChooser jf = new JFileChooser(); //Metodo para el FileChooser

        int ap = jf.showOpenDialog(this);
        if (ap == JFileChooser.APPROVE_OPTION) {

            ruta = jf.getSelectedFile().getAbsolutePath();
            ImageIcon imagen = new ImageIcon(ruta);

            Icon imgEscalada = new ImageIcon(imagen.getImage().getScaledInstance(jlbImagen.getWidth(),
                    jlbImagen.getHeight(), Image.SCALE_DEFAULT));

            jlbImagen.setIcon(imgEscalada);
            this.repaint();
        }
    }//GEN-LAST:event_btnAbrirImagenActionPerformed

    private void btnAbrirImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirImagen2ActionPerformed
        JFileChooser jf = new JFileChooser();

        int ap = jf.showOpenDialog(this);
        if (ap == JFileChooser.APPROVE_OPTION) {

            ruta2 = jf.getSelectedFile().getAbsolutePath(); //Guarda la ruta de la imagen
            ImageIcon imagen2 = new ImageIcon(ruta2); //Guarda la imagen en forma de icono

            Icon imgEscalada2 = new ImageIcon(imagen2.getImage().getScaledInstance(jlbImagen2.getWidth(),
                    jlbImagen2.getHeight(), Image.SCALE_DEFAULT)); //Escala la imagen de acuerdo a las dimensiones del jLabel

            jlbImagen2.setIcon(imgEscalada2); //Implementa la imagen 
            this.repaint();
        }
    }//GEN-LAST:event_btnAbrirImagen2ActionPerformed

    private void btnBuscarBecerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBecerroActionPerformed
        this.setVisible(false); //Cierra esta ventana
        new BuscarCria().setVisible(true); //Muestra la ventana Buscar Cria
    }//GEN-LAST:event_btnBuscarBecerroActionPerformed

    private void jboxRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxRazaActionPerformed
        String raza = jboxRaza.getSelectedItem().toString();
        if(raza.equals("Otra")){
            jlblOtro.setVisible(true);
            jtxRaza.setVisible(true);
        }else{
            jlblOtro.setVisible(false);
            jtxRaza.setVisible(false);
        }
    }//GEN-LAST:event_jboxRazaActionPerformed

    private void jboxCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxCausaActionPerformed
        String otraBaja = jboxCausa.getSelectedItem().toString();
        if(otraBaja.equals("Otra")){
            jlblOtraBaja.setVisible(true);
            jtxOtro.setVisible(true);
        }else{
            jlblOtraBaja.setVisible(false);
            jtxOtro.setVisible(false);
        }
    }//GEN-LAST:event_jboxCausaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnArbol;
    private javax.swing.JButton BtnArbol1;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEvento;
    private javax.swing.JButton BtnEvento1;
    private javax.swing.JButton btnAbrirImagen;
    private javax.swing.JButton btnAbrirImagen2;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscarBecerro;
    private javax.swing.JButton btnBuscarVaca;
    private javax.swing.JButton btnBuscarVaca1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinim;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JComboBox<String> jBoxMes;
    private javax.swing.JComboBox<String> jBoxMesBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jboxCausa;
    private javax.swing.JComboBox<String> jboxRaza;
    private javax.swing.JLabel jlBack;
    private javax.swing.JLabel jlbImagen;
    private javax.swing.JLabel jlbImagen2;
    private javax.swing.JLabel jlblOtraBaja;
    private javax.swing.JLabel jlblOtro;
    private javax.swing.JPanel jplMenu1;
    private javax.swing.JPanel jplMinCer;
    private javax.swing.JPanel jplPrincipal;
    private javax.swing.JTextField jtxAnioBaja;
    private javax.swing.JTextField jtxAnioNac;
    private javax.swing.JTextField jtxArete;
    private javax.swing.JTextField jtxCarac;
    private javax.swing.JTextField jtxColor;
    private javax.swing.JTextField jtxDiaBaja;
    private javax.swing.JTextField jtxDiaNac;
    private javax.swing.JTextArea jtxObservaciones;
    private javax.swing.JTextField jtxOtro;
    private javax.swing.JTextField jtxPesoDest;
    private javax.swing.JTextField jtxPesoNac;
    private javax.swing.JTextField jtxRaza;
    // End of variables declaration//GEN-END:variables
    private void Registrar() {

        try {
            Manejador obj = new Manejador(); //Llama al metodo Manejador, encargao de hacer las consultas e inserciones

            //////////////////Obtiene ls textos escritos en los jText asi como los de los comboBox/////////////////////
            String arete = jtxArete.getText();
            String sexo = comboBoxSexo.getSelectedItem().toString();
            String raza = jboxRaza.getSelectedItem().toString();
            String otraza = jtxRaza.getText();
            String mes = jBoxMes.getSelectedItem().toString();
            String Fechanac = jtxAnioNac.getText() + "-" + mes + "-" + jtxDiaNac.getText();
            String carac = jtxCarac.getText();
            String color = jtxColor.getText();
            float pesoNac = Float.parseFloat(jtxPesoNac.getText());
            float pesoDest = Float.parseFloat(jtxPesoDest.getText());
            String mesBaja = jBoxMesBaja.getSelectedItem().toString();
            String FechaBaja = jtxAnioBaja.getText() + "-" + mesBaja + "-" + jtxDiaBaja.getText();
            String causa = jboxCausa.getSelectedItem().toString();
            String otro = jtxOtro.getText();
            String obsv = jtxObservaciones.getText();

            //////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (causa.equals("Otra") && raza.equals("Otra")) { //Si los RadioButton estan seleccionados, se le mandaran otros textos al manejador//////////////////
                
                    boolean respuesta = obj.RegistrarVaca(arete, sexo, otraza, Fechanac, carac, color, pesoNac, pesoDest, FechaBaja, otro, obsv, ruta, ruta2);
                    String resultado = String.valueOf(respuesta);

                    if (resultado.equals("true")) {
                        JOptionPane.showMessageDialog(null, "Vaca registrada correctamente.", "Ok.", JOptionPane.INFORMATION_MESSAGE);
                        jtxArete.setText("");
                        jtxRaza.setText("");
                        jtxDiaNac.setText("");
                        jtxAnioNac.setText("");
                        jtxCarac.setText("");
                        jtxColor.setText("");
                        jtxPesoNac.setText("");
                        jtxPesoDest.setText("");
                        jtxDiaBaja.setText("");
                        jtxAnioBaja.setText("");
                        jboxCausa.setSelectedIndex(-1);
                        jtxObservaciones.setText("");
                        jlbImagen.setText("");
                        jtxOtro.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo registrar a la vaca.", "Warning.", JOptionPane.WARNING_MESSAGE);
                    }
               

            } else if (causa.equals("Otra")) {//Si solo se selecciona el RadioButton de Otro, solo cambia lo que se va a mandar de la causa de baja
               
                    boolean respuesta = obj.RegistrarVaca(arete, sexo, raza, Fechanac, carac, color, pesoNac, pesoDest, FechaBaja, otro, obsv, ruta, ruta2);
                    String resultado = String.valueOf(respuesta);

                    if (resultado.equals("true")) {
                        JOptionPane.showMessageDialog(null, "Vaca registrada correctamente.", "Ok.", JOptionPane.INFORMATION_MESSAGE);
                        jtxArete.setText("");
                        jtxRaza.setText("");
                        jtxDiaNac.setText("");
                        jtxAnioNac.setText("");
                        jtxCarac.setText("");
                        jtxColor.setText("");
                        jtxPesoNac.setText("");
                        jtxPesoDest.setText("");
                        jtxDiaBaja.setText("");
                        jtxAnioBaja.setText("");
                        jboxCausa.setSelectedIndex(-1);
                        jtxObservaciones.setText("");
                        jlbImagen.setText("");
                        jtxOtro.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo registrar a la vaca.", "Warning.", JOptionPane.WARNING_MESSAGE);
                    }
               

            } else if (raza.equals("Otra")) { //Si solo se selecciona el RadioButton de otra raza, solo se cambiara el string de Raza
               
                    boolean respuesta = obj.RegistrarVaca(arete, sexo, otraza, Fechanac, carac, color, pesoNac, pesoDest, FechaBaja, causa, obsv, ruta, ruta2);
                    String resultado = String.valueOf(respuesta);

                    if (resultado.equals("true")) {
                        JOptionPane.showMessageDialog(null, "Vaca registrada correctamente.", "Ok.", JOptionPane.INFORMATION_MESSAGE);
                        jtxArete.setText("");
                        jtxRaza.setText("");
                        jtxDiaNac.setText("");
                        jtxAnioNac.setText("");
                        jtxCarac.setText("");
                        jtxColor.setText("");
                        jtxPesoNac.setText("");
                        jtxPesoDest.setText("");
                        jtxDiaBaja.setText("");
                        jtxAnioBaja.setText("");
                        jboxCausa.setSelectedIndex(-1);
                        jtxObservaciones.setText("");
                        jlbImagen.setText("");
                        jtxOtro.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo registrar a la vaca.", "Warning.", JOptionPane.WARNING_MESSAGE);
                    }
                
            } else { //Si no se seleccona nunguno todo se manda tal y como esta o como se ingreso.
                
                boolean respuesta = obj.RegistrarVaca(arete, sexo, raza, Fechanac, carac, color, pesoNac, pesoDest, FechaBaja, causa, obsv, ruta, ruta2);
                String resultado = String.valueOf(respuesta);

                if (resultado.equals("true")) {
                    JOptionPane.showMessageDialog(null, "Vaca registrada correctamente.", "Ok.", JOptionPane.INFORMATION_MESSAGE);
                    jtxArete.setText("");
                    jtxRaza.setText("");
                    jtxDiaNac.setText("");
                    jtxAnioNac.setText("");
                    jtxCarac.setText("");
                    jtxColor.setText("");
                    jtxPesoNac.setText("");
                    jtxPesoDest.setText("");
                    jtxDiaBaja.setText("");
                    jtxAnioBaja.setText("");

                    jtxObservaciones.setText("");
                    jlbImagen.setText("");
                    jtxOtro.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar a la vaca.", "Warning.", JOptionPane.WARNING_MESSAGE);
                }
                
                
            }

        } catch (Exception e) { //Si añgo esta mal, mandara un aviso.
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
