
package Interfaz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian
 */
public class Sanidad extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();
    
    public Sanidad() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMenu1 = new javax.swing.JPanel();
        BtnAgregarCria = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Registro2 = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnArbol = new javax.swing.JButton();
        BtnEvento = new javax.swing.JButton();
        btnBuscarVaca = new javax.swing.JButton();
        btnBuscarBecerro = new javax.swing.JButton();
        jplPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnVacunacion = new javax.swing.JButton();
        jbtnDespara = new javax.swing.JButton();
        jbtnDescorne = new javax.swing.JButton();
        jbtnVitaminas = new javax.swing.JButton();
        jbtnDestete = new javax.swing.JButton();
        jbtnBuscarVacun = new javax.swing.JButton();
        jbtnBuscarVitam = new javax.swing.JButton();
        jbtnBuscarDest = new javax.swing.JButton();
        jbtnBuscarDesc = new javax.swing.JButton();
        jbtnBuscarDespara = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jplMinCer = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jplMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 127, 39)));
        jplMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAgregarCria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerrocafe.png"))); // NOI18N
        BtnAgregarCria.setToolTipText("Registrar cria.");
        BtnAgregarCria.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        BtnAgregarCria.setBorderPainted(false);
        BtnAgregarCria.setContentAreaFilled(false);
        BtnAgregarCria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregarCria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerrocafe.png"))); // NOI18N
        BtnAgregarCria.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/becerrocafe.png"))); // NOI18N
        BtnAgregarCria.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscarP.png"))); // NOI18N
        BtnAgregarCria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarCriaActionPerformed(evt);
            }
        });
        jplMenu1.add(BtnAgregarCria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 92, 0));
        jLabel6.setText("Menu");
        jplMenu1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        Registro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro2.setToolTipText("Registrar una vaca.");
        Registro2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        Registro2.setBorderPainted(false);
        Registro2.setContentAreaFilled(false);
        Registro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton_send_1.png"))); // NOI18N
        Registro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registro2ActionPerformed(evt);
            }
        });
        jplMenu1.add(Registro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

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
        jplMenu1.add(BtnArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

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
        jplMenu1.add(BtnEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 90, -1));

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

        getContentPane().add(jplMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 800));

        jplPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 92, 0));
        jLabel2.setText("Registrar Sanidad/Destete.");

        jlBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_Back_64px.png"))); // NOI18N
        jlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBackMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 92, 0));
        jLabel3.setText("Buscar Sanidad/Destete.");

        jbtnVacunacion.setBackground(new java.awt.Color(255, 127, 45));
        jbtnVacunacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnVacunacion.setText("Registrar Vacunación");
        jbtnVacunacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnVacunacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVacunacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnVacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVacunacionActionPerformed(evt);
            }
        });

        jbtnDespara.setBackground(new java.awt.Color(255, 127, 45));
        jbtnDespara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDespara.setText("Registrar Desparasitación");
        jbtnDespara.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDespara.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDespara.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDespara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDesparaActionPerformed(evt);
            }
        });

        jbtnDescorne.setBackground(new java.awt.Color(255, 127, 45));
        jbtnDescorne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDescorne.setText("Registrar Descorne");
        jbtnDescorne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDescorne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDescorne.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDescorne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDescorneActionPerformed(evt);
            }
        });

        jbtnVitaminas.setBackground(new java.awt.Color(255, 127, 45));
        jbtnVitaminas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnVitaminas.setText("Registrar Vitaminización");
        jbtnVitaminas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnVitaminas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVitaminas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnVitaminas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVitaminasActionPerformed(evt);
            }
        });

        jbtnDestete.setBackground(new java.awt.Color(255, 127, 45));
        jbtnDestete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnDestete.setText("Registrar Destete");
        jbtnDestete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDestete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnDestete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnDestete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDesteteActionPerformed(evt);
            }
        });

        jbtnBuscarVacun.setBackground(new java.awt.Color(255, 127, 45));
        jbtnBuscarVacun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBuscarVacun.setText("Buscar Vacunación");
        jbtnBuscarVacun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBuscarVacun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscarVacun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBuscarVacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarVacunActionPerformed(evt);
            }
        });

        jbtnBuscarVitam.setBackground(new java.awt.Color(255, 127, 45));
        jbtnBuscarVitam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBuscarVitam.setText("Buscar Vitaminización");
        jbtnBuscarVitam.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBuscarVitam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscarVitam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBuscarVitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarVitamActionPerformed(evt);
            }
        });

        jbtnBuscarDest.setBackground(new java.awt.Color(255, 127, 45));
        jbtnBuscarDest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBuscarDest.setText("Buscar Destete");
        jbtnBuscarDest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBuscarDest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscarDest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBuscarDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarDestActionPerformed(evt);
            }
        });

        jbtnBuscarDesc.setBackground(new java.awt.Color(255, 127, 45));
        jbtnBuscarDesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBuscarDesc.setText("Buscar Descorne");
        jbtnBuscarDesc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBuscarDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscarDesc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBuscarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarDescActionPerformed(evt);
            }
        });

        jbtnBuscarDespara.setBackground(new java.awt.Color(255, 127, 45));
        jbtnBuscarDespara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBuscarDespara.setText("Buscar Desparasitación");
        jbtnBuscarDespara.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBuscarDespara.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscarDespara.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBuscarDespara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarDesparaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jplPrincipalLayout = new javax.swing.GroupLayout(jplPrincipal);
        jplPrincipal.setLayout(jplPrincipalLayout);
        jplPrincipalLayout.setHorizontalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                            .addContainerGap(22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnBuscarDest, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106))
                        .addGroup(jplPrincipalLayout.createSequentialGroup()
                            .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnBuscarVacun, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnBuscarVitam, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(35, 35, 35)
                            .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnBuscarDespara, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnBuscarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jplPrincipalLayout.createSequentialGroup()
                        .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jplPrincipalLayout.createSequentialGroup()
                                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnVitaminas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnDespara, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnDescorne, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPrincipalLayout.createSequentialGroup()
                        .addComponent(jbtnDestete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))))
            .addComponent(jSeparator1)
        );
        jplPrincipalLayout.setVerticalGroup(
            jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPrincipalLayout.createSequentialGroup()
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDespara, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnVitaminas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDescorne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnDestete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBuscarDespara, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscarVacun, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBuscarVitam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnBuscarDest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        getContentPane().add(jplPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 900, 750));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarCriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarCriaActionPerformed
        ///No se usa en esta ventana
    }//GEN-LAST:event_BtnAgregarCriaActionPerformed

    private void Registro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registro2ActionPerformed
        this.setVisible(false);
        new Registro().setVisible(true);
    }//GEN-LAST:event_Registro2ActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.setVisible(false);
        new Buscar().setVisible(true);
    }//GEN-LAST:event_BtnBuscarActionPerformed

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

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        int dialogo = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialogo);
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimMouseClicked
        // TODO add your handling code here:
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_btnMinimMouseClicked

    private void jlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBackMouseClicked
            this.setVisible(false);
            new Becerro().setVisible(true);
        
    }//GEN-LAST:event_jlBackMouseClicked

    private void btnBuscarBecerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBecerroActionPerformed
        this.setVisible(false);
        new BuscarCria().setVisible(true);
    }//GEN-LAST:event_btnBuscarBecerroActionPerformed

    private void jbtnDesparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDesparaActionPerformed
        new Desparasitacion().setVisible(true);
    }//GEN-LAST:event_jbtnDesparaActionPerformed

    private void jbtnDescorneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDescorneActionPerformed
       new Descorne().setVisible(true);
    }//GEN-LAST:event_jbtnDescorneActionPerformed

    private void jbtnVitaminasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVitaminasActionPerformed
        new Vitaminas().setVisible(true);
    }//GEN-LAST:event_jbtnVitaminasActionPerformed

    private void jbtnVacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVacunacionActionPerformed
       new Vacunacion().setVisible(true);
    }//GEN-LAST:event_jbtnVacunacionActionPerformed

    private void jbtnDesteteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDesteteActionPerformed
        new Destete().setVisible(true);
    }//GEN-LAST:event_jbtnDesteteActionPerformed

    private void jbtnBuscarVacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarVacunActionPerformed
        new BuscarVacun().setVisible(true);
    }//GEN-LAST:event_jbtnBuscarVacunActionPerformed

    private void jbtnBuscarVitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarVitamActionPerformed
        new BuscarVitam().setVisible(true);
    }//GEN-LAST:event_jbtnBuscarVitamActionPerformed

    private void jbtnBuscarDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarDestActionPerformed
        new BuscarDest().setVisible(true);
    }//GEN-LAST:event_jbtnBuscarDestActionPerformed

    private void jbtnBuscarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarDescActionPerformed
        new BuscarDesc().setVisible(true);
    }//GEN-LAST:event_jbtnBuscarDescActionPerformed

    private void jbtnBuscarDesparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarDesparaActionPerformed
        new BuscarDespara().setVisible(true);
    }//GEN-LAST:event_jbtnBuscarDesparaActionPerformed

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
            java.util.logging.Logger.getLogger(Sanidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sanidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sanidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sanidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sanidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarCria;
    private javax.swing.JButton BtnArbol;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEvento;
    private javax.swing.JButton Registro2;
    private javax.swing.JButton btnBuscarBecerro;
    private javax.swing.JButton btnBuscarVaca;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnBuscarDesc;
    private javax.swing.JButton jbtnBuscarDespara;
    private javax.swing.JButton jbtnBuscarDest;
    private javax.swing.JButton jbtnBuscarVacun;
    private javax.swing.JButton jbtnBuscarVitam;
    private javax.swing.JButton jbtnDescorne;
    private javax.swing.JButton jbtnDespara;
    private javax.swing.JButton jbtnDestete;
    private javax.swing.JButton jbtnVacunacion;
    private javax.swing.JButton jbtnVitaminas;
    private javax.swing.JLabel jlBack;
    private javax.swing.JPanel jplMenu1;
    private javax.swing.JPanel jplMinCer;
    private javax.swing.JPanel jplPrincipal;
    // End of variables declaration//GEN-END:variables

    
     

   
}
