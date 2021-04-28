package Interfaz;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class Cria extends javax.swing.JFrame {

    private CriaSG cria;
    Connection conn = null;
    private PreparedStatement sentencia;
    private ResultSet resultado;

    public Cria() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMinCer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jplPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxBuscar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jlBack = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxAreteCria = new javax.swing.JTextField();
        jtxAreteMadre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxPesoCria = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxObsv = new javax.swing.JTextArea();
        jtxFechaParto = new javax.swing.JTextField();
        jtxSexo = new javax.swing.JTextField();
        jlbImagen = new javax.swing.JLabel();
        jlbImagen2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxColor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtxEval = new javax.swing.JTextField();
        jplMenu = new javax.swing.JPanel();
        BtnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Registro1 = new javax.swing.JButton();
        BtnBuscar1 = new javax.swing.JButton();
        BtnArbol = new javax.swing.JButton();
        BtnEvento = new javax.swing.JButton();
        btnBuscarVaca = new javax.swing.JButton();
        btnBuscarBecerro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplMinCer.setBackground(new java.awt.Color(255, 255, 255));
        jplMinCer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Multiply_32px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jplMinCer.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jplMinCer.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 30, 30));

        getContentPane().add(jplMinCer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 50));

        jplPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ingresa el Numero del arete:");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnSearch.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnSearch.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 0));
        jLabel8.setText("Buscar cria.");

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Back_64px.png"))); // NOI18N
        jlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBackMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Arete de la cria:");

        jtxAreteCria.setEditable(false);

        jtxAreteMadre.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Arete de la madre:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Fecha del parto:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Sexo:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Peso al nacer:");

        jtxPesoCria.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Observaciones:");

        jtxObsv.setEditable(false);
        jtxObsv.setColumns(20);
        jtxObsv.setLineWrap(true);
        jtxObsv.setRows(5);
        jScrollPane1.setViewportView(jtxObsv);

        jtxFechaParto.setEditable(false);

        jtxSexo.setEditable(false);

        jlbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbImagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Color:");

        jtxColor.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Evaluación:");

        jtxEval.setEditable(false);

        javax.swing.GroupLayout jplPrincipalLayout = new javax.swing.GroupLayout(jplPrincipal);
        jplPrincipal.setLayout(jplPrincipalLayout);
        jplPrincipalLayout.setHorizontalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(331, 331, 331))
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxAreteCria, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxPesoCria, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtxColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(jtxSexo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxFechaParto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxAreteMadre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jtxEval, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                                .addComponent(jlbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jlbImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );
        jplPrincipalLayout.setVerticalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addComponent(jlbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jlbImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxAreteCria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtxAreteMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtxFechaParto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtxPesoCria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jtxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jtxEval, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(jplPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 900, 750));

        jplMenu.setBackground(new java.awt.Color(51, 51, 51));
        jplMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 39)));
        jplMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jplMenu.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 92, 0));
        jLabel4.setText("Menu");
        jplMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        Registro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro1.setToolTipText("Registrar una vaca.");
        Registro1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        Registro1.setBorderPainted(false);
        Registro1.setContentAreaFilled(false);
        Registro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro1ActionPerformed(evt);
            }
        });
        jplMenu.add(Registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        BtnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar1.setToolTipText("Buscar algun evento.");
        BtnBuscar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnBuscar1.setBorderPainted(false);
        BtnBuscar1.setContentAreaFilled(false);
        BtnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscar1ActionPerformed(evt);
            }
        });
        jplMenu.add(BtnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        BtnArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/arbol.png"))); // NOI18N
        BtnArbol.setToolTipText("Registrar árbol genealógico.");
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
        jplMenu.add(BtnArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        BtnEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.setToolTipText("Registrar evento.");
        BtnEvento.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnEvento.setBorderPainted(false);
        BtnEvento.setContentAreaFilled(false);
        BtnEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEvento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/evento.png"))); // NOI18N
        BtnEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEventoActionPerformed(evt);
            }
        });
        jplMenu.add(BtnEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 90, -1));

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
        jplMenu.add(btnBuscarVaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 90, -1));

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
        jplMenu.add(btnBuscarBecerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 90, -1));

        getContentPane().add(jplMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialogo);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        mostrar();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBackMouseClicked

        this.setVisible(false);
        new BuscarCria().setVisible(true);

    }//GEN-LAST:event_jlBackMouseClicked

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        this.setVisible(false);
        new Becerro().setVisible(true);
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void Registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro1ActionPerformed
        this.setVisible(false);
        new Registro().setVisible(true);
    }//GEN-LAST:event_Registro1ActionPerformed

    private void BtnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscar1ActionPerformed
        this.setVisible(false);
        new Buscar().setVisible(true);
    }//GEN-LAST:event_BtnBuscar1ActionPerformed

    private void BtnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnArbolActionPerformed
        this.setVisible(false);
        new Arbol().setVisible(true);
    }//GEN-LAST:event_BtnArbolActionPerformed

    private void BtnEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEventoActionPerformed
        this.setVisible(false);
        new Evento().setVisible(true);
    }//GEN-LAST:event_BtnEventoActionPerformed

    private void btnBuscarVacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVacaActionPerformed
        this.setVisible(false);
        new BuscarVaca().setVisible(true);
    }//GEN-LAST:event_btnBuscarVacaActionPerformed

    private void btnBuscarBecerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBecerroActionPerformed

    }//GEN-LAST:event_btnBuscarBecerroActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnArbol;
    private javax.swing.JButton BtnBuscar1;
    private javax.swing.JButton BtnEvento;
    private javax.swing.JButton Registro1;
    private javax.swing.JButton btnBuscarBecerro;
    private javax.swing.JButton btnBuscarVaca;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBack;
    private javax.swing.JLabel jlbImagen;
    private javax.swing.JLabel jlbImagen2;
    private javax.swing.JPanel jplMenu;
    private javax.swing.JPanel jplMinCer;
    private javax.swing.JPanel jplPrincipal;
    private javax.swing.JTextField jtxAreteCria;
    private javax.swing.JTextField jtxAreteMadre;
    private javax.swing.JTextField jtxBuscar;
    private javax.swing.JTextField jtxColor;
    private javax.swing.JTextField jtxEval;
    private javax.swing.JTextField jtxFechaParto;
    private javax.swing.JTextArea jtxObsv;
    private javax.swing.JTextField jtxPesoCria;
    private javax.swing.JTextField jtxSexo;
    // End of variables declaration//GEN-END:variables

    private void mostrar() {
        try {
            String validaArete = jtxBuscar.getText();
            Manejador objValida = new Manejador();
            String valida = objValida.validaCria(validaArete);

            if (valida.equals(validaArete)) {
                String arete = jtxBuscar.getText();
                cria = new Manejador().buscarCria(arete);

                jtxAreteCria.setText(cria.getArete());
                jtxAreteMadre.setText(cria.getFkidvacaarete());
                jtxFechaParto.setText(cria.getFecha_parto());
                jtxSexo.setText(cria.getSexo());
                jtxPesoCria.setText(String.valueOf(cria.getPeso_nacimiento()));

                jtxObsv.setText(cria.getObservaciones());
                jtxColor.setText(cria.getColor());
                jtxEval.setText(String.valueOf(cria.getEvaluacion()));
                foto();
                foto2();

            } else {
                JOptionPane.showMessageDialog(null, "No hay ninguna cria registrada con ese Arete.", "Warning.", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static Connection ConnectDB() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby:.\\Registro");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    private void foto() {
        String arete = jtxBuscar.getText();
        String qry = "SELECT FOTOBU FROM BECERRO WHERE ARETE ='" + arete + "'";
        ImageIcon img = null;
        InputStream is = null;
        try {
            conn = Buscar.ConnectDB();
            sentencia = conn.prepareStatement(qry);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                is = resultado.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                img = new ImageIcon(bi);
                Icon imgEscalada = new ImageIcon(img.getImage().getScaledInstance(jlbImagen.getWidth(),
                        jlbImagen.getHeight(), Image.SCALE_DEFAULT));

                jlbImagen.setIcon(imgEscalada);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void foto2() {
        String arete = jtxBuscar.getText();
        String qry = "SELECT FOTOBD FROM BECERRO WHERE ARETE ='" + arete + "'";
        ImageIcon img = null;
        InputStream is = null;
        try {
            conn = Buscar.ConnectDB();
            sentencia = conn.prepareStatement(qry);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                is = resultado.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                img = new ImageIcon(bi);
                Icon imgEscalada = new ImageIcon(img.getImage().getScaledInstance(jlbImagen2.getWidth(),
                        jlbImagen2.getHeight(), Image.SCALE_DEFAULT));

                jlbImagen2.setIcon(imgEscalada);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

   
}
