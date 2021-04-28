package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Evento extends javax.swing.JFrame {

    private Evento2 evento;

    public Evento() {
        initComponents();
        setLocationRelativeTo(null);//Sirve para centrar la ventana
        setResizable(true); //Sirve para que no se pueda modificar el tamaño de la ventana

        jlbNom.setVisible(false);
        jlbCol.setVisible(false);
        jlbRaza.setVisible(false);
        jtxNombre.setVisible(false);
        jtxColor.setVisible(false);
        jtxRaza.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplPrincipal = new javax.swing.JPanel();
        jlBack = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxArete = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxDiaEvt = new javax.swing.JTextField();
        jtxAnioEvt = new javax.swing.JTextField();
        jtxNSemental = new javax.swing.JTextField();
        jtxDiag = new javax.swing.JTextField();
        jtxEdadGes = new javax.swing.JTextField();
        jtxDiaProb = new javax.swing.JTextField();
        jtxAnioProb = new javax.swing.JTextField();
        jtxTratamiento = new javax.swing.JTextField();
        jtxObser = new javax.swing.JTextField();
        jboxEvento = new javax.swing.JComboBox<>();
        jBoxMesEvt = new javax.swing.JComboBox<>();
        jBoxMesParto = new javax.swing.JComboBox<>();
        jtxASemental = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jlbNom = new javax.swing.JLabel();
        jlbCol = new javax.swing.JLabel();
        jlbRaza = new javax.swing.JLabel();
        jtxNombre = new javax.swing.JTextField();
        jtxColor = new javax.swing.JTextField();
        jtxRaza = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxEnfermedad = new javax.swing.JTextField();
        jplMinCer = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinim = new javax.swing.JLabel();
        jplMenu1 = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEvento = new javax.swing.JButton();
        BtnArbol1 = new javax.swing.JButton();
        btnBuscarVaca = new javax.swing.JButton();
        btnBuscarBecerro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Back_64px.png"))); // NOI18N
        jlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBackMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 0));
        jLabel8.setText("Registro de Evento.");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese el arete de la vaca a la que le quiere registrar un evento: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fecha de Evento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Evento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Semental Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Diagnostico:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Edad Gestación:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Fecha Probable de Parto:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tratamiento:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Observaciones:");

        jboxEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sincronización Estro", "Palpación Rectal", "Inseminación Artificial", "Ultrasonido", "Monta" }));
        jboxEvento.setSelectedIndex(-1);
        jboxEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxEventoActionPerformed(evt);
            }
        });

        jBoxMesEvt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jBoxMesParto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Semental Arete:");

        jlbNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbNom.setText("Nombre:");

        jlbCol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbCol.setText("Color:");

        jlbRaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbRaza.setText("Raza:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Enfermedad:");

        javax.swing.GroupLayout jplPrincipalLayout = new javax.swing.GroupLayout(jplPrincipal);
        jplPrincipal.setLayout(jplPrincipalLayout);
        jplPrincipalLayout.setHorizontalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304)
                        .addComponent(jLabel8))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jtxArete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jtxDiaEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jBoxMesEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtxAnioEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)
                        .addComponent(jlbNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxNombre))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jboxEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxNSemental, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxEdadGes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxObser, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                                .addComponent(jtxDiaProb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBoxMesParto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtxAnioProb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jtxEnfermedad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(jtxASemental, javax.swing.GroupLayout.Alignment.LEADING))))))
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addGap(120, 120, 120)
                                .addComponent(btnCancelar)))
                        .addGap(31, 31, 31)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbRaza)
                            .addComponent(jlbCol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 121, Short.MAX_VALUE))
        );
        jplPrincipalLayout.setVerticalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)))
                .addGap(42, 42, 42)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addComponent(jtxArete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(jBoxMesEvt)
                    .addComponent(jtxAnioEvt)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNom)
                            .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtxDiaEvt))
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3))
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jboxEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbCol))))
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbRaza)
                            .addComponent(jtxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxNSemental, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtxASemental, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxEdadGes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxDiaProb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoxMesParto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxAnioProb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxObser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(51, 51, 51)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        getContentPane().add(jplPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 45, 900, 760));

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

        getContentPane().add(jplMinCer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 50));

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
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        BtnEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.setToolTipText("Registrar evento.");
        BtnEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnEvento.setBorderPainted(false);
        BtnEvento.setContentAreaFilled(false);
        BtnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEvento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEventoActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 90, -1));

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

        btnBuscarVaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca.setToolTipText("Buscar vaca.");
        btnBuscarVaca.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnBuscarVaca.setBorderPainted(false);
        btnBuscarVaca.setContentAreaFilled(false);
        btnBuscarVaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarVaca.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarVaca.png"))); // NOI18N
        btnBuscarVaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVacaActionPerformed(evt);
            }
        });
        jplMenu1.add(btnBuscarVaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 90, -1));

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

        getContentPane().add(jplMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 808));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBackMouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea volver a la pantalla principal?", "Exit", dialogo);
        if (resultado == 0) {
            this.setVisible(false); //Oculta esta ventana
            new Principal().setVisible(true);  //Muestra la ventana Principal
        }
    }//GEN-LAST:event_jlBackMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        RegistrarEvento(); //Manda llamar al metodo RegistrarEvento ubicado mas abajo.
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea cancelar el registro del evento?", "Exit", dialogo);
        if (resultado == 0) {
            this.setVisible(false); //Oculta esta ventana
            new Principal().setVisible(true);  //Muestra la ventana Principal 
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialogo);
        if (resultado == 0) {
            System.exit(0); //Cierra el programa
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimMouseClicked
        // TODO add your handling code here:
        this.setState(Principal.ICONIFIED); //Miniminiza la ventana
    }//GEN-LAST:event_btnMinimMouseClicked

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.setVisible(false); //Oculta esta ventana
        new Buscar().setVisible(true); //Muestra la ventana de Buscar
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        this.setVisible(false); //Oculta esta ventana
        new Registro().setVisible(true); //Muestra la ventana de Registro
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        this.setVisible(false); //Oculta esta ventana
        new Becerro().setVisible(true); //Muestra la ventana de Becerro
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEventoActionPerformed
        //No se usa en esta ventana
    }//GEN-LAST:event_BtnEventoActionPerformed

    private void BtnArbol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnArbol1ActionPerformed
        this.setVisible(false); //Oculta esta ventana
        new Arbol().setVisible(true);  //Muestra la ventana de Arbol
    }//GEN-LAST:event_BtnArbol1ActionPerformed

    private void btnBuscarVacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVacaActionPerformed
        this.setVisible(false);//Oculta esta ventana
        new BuscarVaca().setVisible(true); //Muestra la ventana de BuscarVaca
    }//GEN-LAST:event_btnBuscarVacaActionPerformed

    private void btnBuscarBecerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBecerroActionPerformed
        this.setVisible(false); //Oculta esta ventana
        new BuscarCria().setVisible(true); //Muestra la ventana de BusarCria
    }//GEN-LAST:event_btnBuscarBecerroActionPerformed

    private void jboxEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxEventoActionPerformed
        String evento = jboxEvento.getSelectedItem().toString();

        if (evento.equals("Inseminación Artificial")) {
            jlbNom.setVisible(true);
            jlbCol.setVisible(true);
            jlbRaza.setVisible(true);
            jtxNombre.setVisible(true);
            jtxColor.setVisible(true);
            jtxRaza.setVisible(true);
        } else {
            jlbNom.setVisible(false);
            jlbCol.setVisible(false);
            jlbRaza.setVisible(false);
            jtxNombre.setVisible(false);
            jtxColor.setVisible(false);
            jtxRaza.setVisible(false);
        }
    }//GEN-LAST:event_jboxEventoActionPerformed

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
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnArbol1;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEvento;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscarBecerro;
    private javax.swing.JButton btnBuscarVaca;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinim;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> jBoxMesEvt;
    private javax.swing.JComboBox<String> jBoxMesParto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jboxEvento;
    private javax.swing.JLabel jlBack;
    private javax.swing.JLabel jlbCol;
    private javax.swing.JLabel jlbNom;
    private javax.swing.JLabel jlbRaza;
    private javax.swing.JPanel jplMenu1;
    private javax.swing.JPanel jplMinCer;
    private javax.swing.JPanel jplPrincipal;
    private javax.swing.JTextField jtxASemental;
    private javax.swing.JTextField jtxAnioEvt;
    private javax.swing.JTextField jtxAnioProb;
    private javax.swing.JTextField jtxArete;
    private javax.swing.JTextField jtxColor;
    private javax.swing.JTextField jtxDiaEvt;
    private javax.swing.JTextField jtxDiaProb;
    private javax.swing.JTextField jtxDiag;
    private javax.swing.JTextField jtxEdadGes;
    private javax.swing.JTextField jtxEnfermedad;
    private javax.swing.JTextField jtxNSemental;
    private javax.swing.JTextField jtxNombre;
    private javax.swing.JTextField jtxObser;
    private javax.swing.JTextField jtxRaza;
    private javax.swing.JTextField jtxTratamiento;
    // End of variables declaration//GEN-END:variables

    public void RegistrarEvento() {

        try {
            String validaArete = jtxArete.getText(); //Obtiene el arete de la vaca que se ingreso
            Manejador objValida = new Manejador(); //Se manda llamar al metodo objValida de el Manejador
            String valida = objValida.valida(validaArete); //se le Manda el arete de la vaca que se ingreso para poder validar si esta registrada

            if (valida.equals(validaArete)) { //Si la respuesta del metodo es igual al arete que se ingreso, entonces se puede continuar
                String evt = jboxEvento.getSelectedItem().toString();
                evento = new Manejador().validaEvento(evt);
                int id = evento.getId();
                if (evt.equals("Inseminación Artificial")) {
                    
                    String arete = jtxArete.getText();  //Obtiene el arete de la vaca ingresado
                    String fechaEvt = jtxAnioEvt.getText() + "-" + jBoxMesEvt.getSelectedItem().toString() + "-" + jtxDiaEvt.getText(); //Obtiene los datos para la fecha ingresados
                    String sementalNombre = jtxNSemental.getText(); //Obtiene el nombre del semental ingresado
                    String sementalArete = jtxASemental.getText(); //Obtiene el arete del semental Ingresado
                    String diagnostico = jtxDiag.getText(); //Obtiene el diagnostico ingresado
                    int edad_gestion = Integer.parseInt(jtxEdadGes.getText()); //Otiene la edad ingresada
                    String Fecha_parto = jtxAnioProb.getText() + "-" + jBoxMesParto.getSelectedItem().toString() + "-" + jtxDiaProb.getText(); //Obtiene la fecha del parto ingresada
                    String trata = jtxTratamiento.getText(); //Obtiene el tratamiento ingresado
                    String obs = jtxObser.getText(); //Ontiene las observaciones ingresadas.
                    String nombre = jtxNombre.getText();
                    String color = jtxColor.getText();
                    String raza =jtxRaza.getText();
                    String enfermedad = jtxEnfermedad.getText();

                    Manejador obj = new Manejador(); //Metodo que manda a llamar al Manejador
                    boolean respuesta = obj.RegistrarEvento(id, arete, fechaEvt, sementalNombre, sementalArete, diagnostico, edad_gestion, Fecha_parto, trata, obs,enfermedad); //Se le manda los datos obtenidos al metodo en el manejador para poder registrar el evento
                    
                    String resultado = String.valueOf(respuesta);//Obtiene la respuesta del metodo RegistrarEvento en el manejador
                    boolean respuesta2 = obj.RegistrarIA(arete,nombre,color,raza);
                    String resultado2 = String.valueOf(respuesta2);

                    if (resultado.equals("true") && resultado2.equals("true")) { //Si la respuesta es true, entonces se registro todo correctamente
                        JOptionPane.showMessageDialog(null, "Evento registrado correctamente.", "Ok.", JOptionPane.INFORMATION_MESSAGE); //Mensaje de que se registro todo correctamente

                        /////Sirve para limpiar los Jtext
                        jtxArete.setText("");
                        jtxDiaEvt.setText("");
                        jtxAnioEvt.setText("");
                        jtxNSemental.setText("");
                        jtxDiag.setText("");
                        jtxEdadGes.setText("");
                        jtxDiaProb.setText("");
                        jtxAnioProb.setText("");
                        jtxTratamiento.setText("");
                        jtxObser.setText("");
                        jboxEvento.setSelectedIndex(-1);
                        jtxEnfermedad.setText("");
                        //////////////////////////////////////

                    } else { //Si no, entonces hubo un error
                        JOptionPane.showMessageDialog(null, "No se pudo registrar el evento.", "Warning.", JOptionPane.WARNING_MESSAGE); //Mensaje de que no se pudo registrar el evento
                    }
                    

                } else {
                    
                    String arete = jtxArete.getText();  //Obtiene el arete de la vaca ingresado
                    String fechaEvt = jtxAnioEvt.getText() + "-" + jBoxMesEvt.getSelectedItem().toString() + "-" + jtxDiaEvt.getText(); //Obtiene los datos para la fecha ingresados
                    String sementalNombre = jtxNSemental.getText(); //Obtiene el nombre del semental ingresado
                    String sementalArete = jtxASemental.getText(); //Obtiene el arete del semental Ingresado
                    String diagnostico = jtxDiag.getText(); //Obtiene el diagnostico ingresado
                    int edad_gestion = Integer.parseInt(jtxEdadGes.getText()); //Otiene la edad ingresada
                    String Fecha_parto = jtxAnioProb.getText() + "-" + jBoxMesParto.getSelectedItem().toString() + "-" + jtxDiaProb.getText(); //Obtiene la fecha del parto ingresada
                    String trata = jtxTratamiento.getText(); //Obtiene el tratamiento ingresado
                    String obs = jtxObser.getText(); //Ontiene las observaciones ingresadas.
                    String enfermedad = jtxEnfermedad.getText();

                    Manejador obj = new Manejador(); //Metodo que manda a llamar al Manejador
                    boolean respuesta = obj.RegistrarEvento(id, arete, fechaEvt, sementalNombre, sementalArete, diagnostico, edad_gestion, Fecha_parto, trata, obs,enfermedad); //Se le manda los datos obtenidos al metodo en el manejador para poder registrar el evento

                    String resultado = String.valueOf(respuesta);//Obtiene la respuesta del metodo RegistrarEvento en el manejador

                    if (resultado.equals("true")) { //Si la respuesta es true, entonces se registro todo correctamente
                        JOptionPane.showMessageDialog(null, "Evento registrado correctamente.", "Ok.", JOptionPane.INFORMATION_MESSAGE); //Mensaje de que se registro todo correctamente

                        /////Sirve para limpiar los Jtext
                        jtxArete.setText("");
                        jtxDiaEvt.setText("");
                        jtxAnioEvt.setText("");
                        jtxNSemental.setText("");
                        jtxDiag.setText("");
                        jtxEdadGes.setText("");
                        jtxDiaProb.setText("");
                        jtxAnioProb.setText("");
                        jtxTratamiento.setText("");
                        jtxObser.setText("");
                        jBoxMesEvt.setSelectedIndex(-1);
                        jBoxMesParto.setSelectedIndex(-1);
                        jboxEvento.setSelectedIndex(-1);
                        jtxEnfermedad.setText("");
                        //////////////////////////////////////

                    } else { //Si no, entonces hubo un error
                        JOptionPane.showMessageDialog(null, "No se pudo registrar el evento.", "Warning.", JOptionPane.WARNING_MESSAGE); //Mensaje de que no se pudo registrar el evento
                    }
                    
                }

            } else {//Si no es igual entonces se manda un mensaje de que no se ha registrado esa vaca.
                JOptionPane.showMessageDialog(null, "No existe una vaca con ese arete.", "WARNING.", JOptionPane.WARNING_MESSAGE); //Mensaje de que no existe esa vaca registrada.
            }

        } catch (Exception e) { //Exception, muestra cualquier error que pueda ocurrir.
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
