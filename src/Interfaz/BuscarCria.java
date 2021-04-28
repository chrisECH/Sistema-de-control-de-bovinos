
package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian
 */
public class BuscarCria extends javax.swing.JFrame {
    
    Connection conn = null;
    private PreparedStatement sentencia;
    private ResultSet resultado;
    DefaultTableModel model = new DefaultTableModel();
    
    public BuscarCria() {
       initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        
        
        Object col[] ={"Arete","Arete de la Madre","Fecha del parto","Sexo","Peso al nacer","Color","Evaluacion","Observaciones"};
        model.setColumnIdentifiers(col);
        tablaBecerro.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMinCer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jplPrincipal = new javax.swing.JPanel();
        btnMostrarCria = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBecerro = new javax.swing.JTable();
        jlBack = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        jtxBuscar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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

        jplPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btnMostrarCria.setBackground(new java.awt.Color(255, 153, 51));
        btnMostrarCria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrarCria.setText("Mostrar cria en especifico.");
        btnMostrarCria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMostrarCria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCriaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 92, 0));
        jLabel8.setText("Buscar cria.");

        tablaBecerro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Arete", "Arete de la Madre", "Fecha del parto", "Sexo", "Peso al nacer", "Color", "Evaluación", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaBecerro);

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Back_64px.png"))); // NOI18N
        jlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBackMouseClicked(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(255, 153, 51));
        btnMostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrar.setText("Mostrar  todas las crias registradas.");
        btnMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ingresa el arete de la madre:");

        javax.swing.GroupLayout jplPrincipalLayout = new javax.swing.GroupLayout(jplPrincipal);
        jplPrincipal.setLayout(jplPrincipalLayout);
        jplPrincipalLayout.setHorizontalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(331, 331, 331))
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnMostrarCria, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jplPrincipalLayout.setVerticalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarCria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

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
        btnBuscarBecerro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarBecerro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerroBusqueda.png"))); // NOI18N
        btnBuscarBecerro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerroBusqueda.png"))); // NOI18N
        btnBuscarBecerro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerroBusqueda.png"))); // NOI18N
        btnBuscarBecerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBecerroActionPerformed(evt);
            }
        });
        jplMenu.add(btnBuscarBecerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jplMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jplMinCer, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jplPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jplMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jplMinCer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jplPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

    private void btnMostrarCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCriaActionPerformed
        this.setVisible(false);
        new Cria().setVisible(true);
    }//GEN-LAST:event_btnMostrarCriaActionPerformed

    private void jlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBackMouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea volver a la pantalla principal?", "Exit", dialogo);
        if (resultado == 0) {
            this.setVisible(false);
            new Principal().setVisible(true);
        }
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

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarTodo();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarBecerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBecerroActionPerformed
        
    }//GEN-LAST:event_btnBuscarBecerroActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        mostrar();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarCria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCria().setVisible(true);
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
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarCria;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBack;
    private javax.swing.JPanel jplMenu;
    private javax.swing.JPanel jplMinCer;
    private javax.swing.JPanel jplPrincipal;
    private javax.swing.JTextField jtxBuscar;
    private javax.swing.JTable tablaBecerro;
    // End of variables declaration//GEN-END:variables

    private void mostrarTodo() {
         
        String qry = "SELECT * FROM BECERRO" ;
        
        try{
            conn=Buscar.ConnectDB();
            sentencia = conn.prepareStatement(qry);
            resultado = sentencia.executeQuery();
            Object [] tablaBecerro=new Object[8];
            
            while(resultado.next()){
               tablaBecerro[0] = resultado.getString("ARETE");
               tablaBecerro[1] = resultado.getString("FKIDVACAARETE");
               tablaBecerro[2] = resultado.getString("FECHA_PARTO");
               tablaBecerro[3] = resultado.getString("SEXO");
               tablaBecerro[4] = resultado.getString("PESO_NACIMIENTO");
               tablaBecerro[5] = resultado.getString("COLOR");
               tablaBecerro[6] = resultado.getString("EVALUACION");
               tablaBecerro[7] = resultado.getString("OBSERVACIONES");
               model.addRow(tablaBecerro);
               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
     public static Connection ConnectDB(){
    try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby:.\\Registro");
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}

    private void mostrar() {
        String arete = jtxBuscar.getText();
        String qry = "SELECT * FROM BECERRO WHERE FKIDVACAARETE = '"+arete+"'" ;
        
        try{
            conn=Buscar.ConnectDB();
            sentencia = conn.prepareStatement(qry);
            resultado = sentencia.executeQuery();
            Object [] tablaBecerro=new Object[8];
            
            while(resultado.next()){
               tablaBecerro[0] = resultado.getString("ARETE");
               tablaBecerro[1] = resultado.getString("FKIDVACAARETE");
               tablaBecerro[2] = resultado.getString("FECHA_PARTO");
               tablaBecerro[3] = resultado.getString("SEXO");
               tablaBecerro[4] = resultado.getString("PESO_NACIMIENTO");
               tablaBecerro[5] = resultado.getString("COLOR");
               tablaBecerro[6] = resultado.getString("EVALUACION");
               tablaBecerro[7] = resultado.getString("OBSERVACIONES");
               model.addRow(tablaBecerro);
               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
