package Ventanas;

import Datos.UsuarioYContraseña;
import Datos.Utilidades;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Adrián
 */
public class VentanaRegistro extends javax.swing.JDialog {

    LinkedList listaUsuario = new LinkedList();

    public VentanaRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public VentanaRegistro(javax.swing.JDialog parent, boolean modal, LinkedList usuarios) {
        super(parent, modal);
        listaUsuario = usuarios;
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/user_64.png"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarContraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelMensajeLetras = new javax.swing.JLabel();
        jLabelMinimoCaracteres = new javax.swing.JLabel();
        jLabelSeguridadContraseña = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO");
        setResizable(false);

        jLabel1.setFont(fuentePersonalizada(1,16,"/Recursos/hand.ttf"));
        jLabel1.setText("REGISTRO DE USUARIO");

        jLabel2.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabel2.setText("Nuevo usuario:");

        jLabel3.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabel3.setText("Nueva password:");

        jLabel4.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabel4.setText("Confirmar password:");

        jTextFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusLost(evt);
            }
        });
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });

        jPasswordFieldContraseña.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPasswordFieldContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPasswordFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusLost(evt);
            }
        });
        jPasswordFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseñaKeyTyped(evt);
            }
        });

        jPasswordFieldConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPasswordFieldConfirmarContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPasswordFieldConfirmarContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldConfirmarContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldConfirmarContraseñaFocusLost(evt);
            }
        });
        jPasswordFieldConfirmarContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldConfirmarContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldConfirmarContraseñaKeyTyped(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cara.gif"))); // NOI18N

        jButtonAceptar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonAceptar.setText("R E G I S T R A R S E");
        jButtonAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAceptar.setEnabled(false);
        jButtonAceptar.setFocusPainted(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonCancelar.setText("C A N C E L A R");
        jButtonCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelMensajeLetras.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabelMensajeLetras.setForeground(new java.awt.Color(255, 0, 51));

        jLabelMinimoCaracteres.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jLabelSeguridadContraseña.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMensajeLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelMinimoCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(jPasswordFieldContraseña)
                                    .addComponent(jPasswordFieldConfirmarContraseña))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabelSeguridadContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGap(48, 48, 48))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAceptar, jButtonCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMinimoCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSeguridadContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordFieldConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensajeLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordFieldConfirmarContraseña, jPasswordFieldContraseña, jTextFieldUsuario});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAceptar, jButtonCancelar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Font fuentePersonalizada(int estilo, float tamaño, String fontName) {
        try {
            return Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontName)).deriveFont(estilo, tamaño);
        } catch (FontFormatException | IOException ex) {
            return new Font("Segoe UI", Font.PLAIN, 12);
        }
    }

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        this.jTextFieldUsuario.setBackground(new Color(230, 255, 255));
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void jTextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusLost
        this.jTextFieldUsuario.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jTextFieldUsuarioFocusLost

    private void jPasswordFieldContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusGained
        this.jPasswordFieldContraseña.setBackground(new Color(230, 255, 255));
    }//GEN-LAST:event_jPasswordFieldContraseñaFocusGained

    private void jPasswordFieldContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusLost
        this.jPasswordFieldContraseña.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPasswordFieldContraseñaFocusLost

    private void jPasswordFieldConfirmarContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarContraseñaFocusGained
        this.jPasswordFieldConfirmarContraseña.setBackground(new Color(230, 255, 255));
    }//GEN-LAST:event_jPasswordFieldConfirmarContraseñaFocusGained

    private void jPasswordFieldConfirmarContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarContraseñaFocusLost
        this.jPasswordFieldConfirmarContraseña.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPasswordFieldConfirmarContraseñaFocusLost

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (!Utilidades.exitsUserAndPass(listaUsuario, this.jTextFieldUsuario.getText())) {
            UsuarioYContraseña user = new UsuarioYContraseña(this.jTextFieldUsuario.getText(), this.jPasswordFieldContraseña.getText());
            listaUsuario.add(user);
            this.dispose();
        } else {
            JOptionPane.showConfirmDialog(null, "El usuario ya se encuentra en la base de datos.", "USUARIO EXISTENTE", JOptionPane.CLOSED_OPTION, 1);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jPasswordFieldConfirmarContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarContraseñaKeyReleased
        if (this.jPasswordFieldContraseña.getText().equals(this.jPasswordFieldConfirmarContraseña.getText()) || this.jPasswordFieldContraseña.getText().equals("")) {
            this.jLabelMensajeLetras.setText("");
        } else {
            this.jLabelMensajeLetras.setText("La contraseña no coincide");
        }
        habilitarRegistro();

    }//GEN-LAST:event_jPasswordFieldConfirmarContraseñaKeyReleased
    private void habilitarRegistro() {
        //Condiciones para habilitar el boton de REGISTRARSE:
        if ((this.jPasswordFieldContraseña.getText().equals(this.jPasswordFieldConfirmarContraseña.getText()) || this.jPasswordFieldContraseña.getText().equals("")) && this.jTextFieldUsuario.getText().length() >= 6 && !this.jTextFieldUsuario.getText().equals("") && !this.jPasswordFieldContraseña.getText().equals("") && !this.jPasswordFieldConfirmarContraseña.getText().equals("")) {
            jButtonAceptar.setEnabled(true);
        } else {
            jButtonAceptar.setEnabled(false);
        }
    }
    private void jTextFieldUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyReleased
        if (this.jTextFieldUsuario.getText().length() < 6) {
            this.jLabelMinimoCaracteres.setText("(Mínimo 6 caracteres)");
        } else {
            this.jLabelMinimoCaracteres.setText("");
        }
        habilitarRegistro();
    }//GEN-LAST:event_jTextFieldUsuarioKeyReleased

    private void jPasswordFieldContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaKeyReleased
        if (this.jPasswordFieldContraseña.getText().length() <= 4) {
            this.jLabelSeguridadContraseña.setText("Contraseña débil");
            this.jLabelSeguridadContraseña.setForeground(Color.red);
        } else if (this.jPasswordFieldContraseña.getText().length() <= 8) {
            this.jLabelSeguridadContraseña.setText("Contraseña media");
            this.jLabelSeguridadContraseña.setForeground(new java.awt.Color(153, 153, 0));
        } else {
            this.jLabelSeguridadContraseña.setText("Contraseña fuerte");
            this.jLabelSeguridadContraseña.setForeground(Color.green);
        }
        habilitarRegistro();
    }//GEN-LAST:event_jPasswordFieldContraseñaKeyReleased

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            this.jButtonAceptar.doClick();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    private void jPasswordFieldContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            this.jButtonAceptar.doClick();
        }
    }//GEN-LAST:event_jPasswordFieldContraseñaKeyTyped

    private void jPasswordFieldConfirmarContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarContraseñaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            this.jButtonAceptar.doClick();
        }
    }//GEN-LAST:event_jPasswordFieldConfirmarContraseñaKeyTyped

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
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaRegistro dialog = new VentanaRegistro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMensajeLetras;
    private javax.swing.JLabel jLabelMinimoCaracteres;
    private javax.swing.JLabel jLabelSeguridadContraseña;
    private javax.swing.JPasswordField jPasswordFieldConfirmarContraseña;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
