
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
public class BuscarVaca extends javax.swing.JFrame {

     Connection conn = null;
    private PreparedStatement sentencia;
    private ResultSet resultado;
    DefaultTableModel model = new DefaultTableModel();
    
    public BuscarVaca() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        
        Object col[] ={"Arete","Sexo","Raza","Fecha de nacimiento","Caracteristicas","Color","Peso al nacer","Peso al destete","Fecha baja","Causa de baja","Observaciones"};
        model.setColumnIdentifiers(col);
        tablaVaca.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMenu = new javax.swing.JPanel();
        BtnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Registro1 = new javax.swing.JButton();
        BtnBuscar1 = new javax.swing.JButton();
        BtnArbol = new javax.swing.JButton();
        BtnEvento = new javax.swing.JButton();
        btnBuscarVaca = new javax.swing.JButton();
        btnBuscarBecerro = new javax.swing.JButton();
        jplPrincipal = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxBuscar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVaca = new javax.swing.JTable();
        jlBack = new javax.swing.JLabel();
        jplMinCer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btnBuscarVaca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jplPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btnMostrar.setBackground(new java.awt.Color(255, 153, 51));
        btnMostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrar.setText("Mostrar  todas las vacas registradas.");
        btnMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

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
        jLabel8.setText("Buscar vaca.");

        tablaVaca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Arete", "Sexo", "Raza", "Fecha de nacimiento", "Caracteristicas", "Color", "Peso al nacer", "Peso al destete", "Fecha baja", "Causa de baja", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVaca);

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Back_64px.png"))); // NOI18N
        jlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplPrincipalLayout = new javax.swing.GroupLayout(jplPrincipal);
        jplPrincipal.setLayout(jplPrincipalLayout);
        jplPrincipalLayout.setHorizontalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(331, 331, 331))
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
                .addGap(18, 18, 18)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jplPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 750));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        //No se usa en esta ventana
    }//GEN-LAST:event_btnBuscarVacaActionPerformed

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

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarTodo();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void jlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBackMouseClicked
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea volver a la pantalla principal?", "Exit", dialogo);
        if (resultado == 0) {
            this.setVisible(false);
            new Principal().setVisible(true);
        }
    }//GEN-LAST:event_jlBackMouseClicked

    private void btnBuscarBecerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBecerroActionPerformed
        this.setVisible(false);
        new BuscarCria().setVisible(true);
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
            java.util.logging.Logger.getLogger(BuscarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarVaca().setVisible(true);
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
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable tablaVaca;
    // End of variables declaration//GEN-END:variables

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
        String qry = "SELECT IDVACAARETE,SEXO,RAZA,FECHANAC,CARACTERISTICAS,COLOR,PESO_NACER,PESO_DEST,FECHA_BAJA,CAUSA_BAJA,OBSERVACIONES FROM VACA WHERE IDVACAARETE = '"+arete+"'";
        
        try{
            conn=Buscar.ConnectDB();
            sentencia = conn.prepareStatement(qry);
            resultado = sentencia.executeQuery();
            Object [] tablaVaca=new Object[11];
            
            while(resultado.next()){
               tablaVaca[0] = resultado.getString("IDVACAARETE");
               tablaVaca[1] = resultado.getString("SEXO");
               tablaVaca[2] = resultado.getString("RAZA");
               tablaVaca[3] = resultado.getString("FECHANAC");
               tablaVaca[4] = resultado.getString("CARACTERISTICAS");
               tablaVaca[5] = resultado.getString("COLOR");
               tablaVaca[6] = resultado.getString("PESO_NACER");
               tablaVaca[7] = resultado.getString("PESO_DEST");
               tablaVaca[8] = resultado.getString("FECHA_BAJA");
               tablaVaca[9] = resultado.getString("CAUSA_BAJA");
               tablaVaca[10] = resultado.getString("OBSERVACIONES");
               
               
               model.addRow(tablaVaca);
               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void mostrarTodo() {
        
        String qry = "SELECT IDVACAARETE,SEXO,RAZA,FECHANAC,CARACTERISTICAS,COLOR,PESO_NACER,PESO_DEST,FECHA_BAJA,CAUSA_BAJA,OBSERVACIONES FROM VACA";
        
        try{
            conn=Buscar.ConnectDB();
            sentencia = conn.prepareStatement(qry);
            resultado = sentencia.executeQuery();
            Object [] tablaVaca=new Object[11];
            
            while(resultado.next()){
               tablaVaca[0] = resultado.getString("IDVACAARETE");
               tablaVaca[1] = resultado.getString("SEXO");
               tablaVaca[2] = resultado.getString("RAZA");
               tablaVaca[3] = resultado.getString("FECHANAC");
               tablaVaca[4] = resultado.getString("CARACTERISTICAS");
               tablaVaca[5] = resultado.getString("COLOR");
               tablaVaca[6] = resultado.getString("PESO_NACER");
               tablaVaca[7] = resultado.getString("PESO_DEST");
               tablaVaca[8] = resultado.getString("FECHA_BAJA");
               tablaVaca[9] = resultado.getString("CAUSA_BAJA");
               tablaVaca[10] = resultado.getString("OBSERVACIONES");
               
               
               model.addRow(tablaVaca);
               
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
