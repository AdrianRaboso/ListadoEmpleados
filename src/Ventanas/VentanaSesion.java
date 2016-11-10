package Ventanas;

import Datos.UsuarioYContraseña;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Adrián
 */
public class VentanaSesion extends javax.swing.JDialog {

    LinkedList listaUsuario;
    JLabel etiqueta;

    public VentanaSesion(java.awt.Frame parent, boolean modal, LinkedList usuario, JLabel label) {
        super(parent, modal);
        etiqueta = label;
        listaUsuario = usuario;
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/user_64.png"));
        setIconImage(icon);
    }

    public VentanaSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public String getjPasswordFieldContraseña() {
        return jPasswordFieldContraseña.getText();
    }

    public String getjTextFieldUsuario() {
        return jTextFieldUsuario.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SESIÓN");
        setResizable(false);

        jLabel1.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabel2.setText("Password:");

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });

        jButtonAceptar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonAceptar.setText("A C E P T A R");
        jButtonAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel3.setFont(fuentePersonalizada(1,16,"/Recursos/hand.ttf"));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIO DE SESION");

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseñaKeyTyped(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cara.gif"))); // NOI18N

        jLabel5.setFont(fuentePersonalizada(0,14,"/Recursos/title.ttf"));
        jLabel5.setText("¿Aún no te has registrado?");

        jLabelRegistro.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabelRegistro.setText("<html><p><u>Regístrate aquí</u></p></html>");
        jLabelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordFieldContraseña)))
                        .addGap(93, 93, 93))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordFieldContraseña, jTextFieldUsuario});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAceptar, jButtonCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordFieldContraseña, jTextFieldUsuario});

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

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        Iterator<UsuarioYContraseña> ite = listaUsuario.iterator();
        UsuarioYContraseña user;
        boolean encontrado = false;

        if (this.jTextFieldUsuario.getText().equals("") || this.jPasswordFieldContraseña.getText().equals("")) {
            JOptionPane.showConfirmDialog(null, "Faltan datos", "SIN DATOS", JOptionPane.CANCEL_OPTION, 1);
        } else {
            try {
                do {
                    user = ite.next();
                    if (this.jTextFieldUsuario.getText().equals(user.getUser())) {
                        encontrado = true;
                        break;
                    }
                } while (ite.hasNext());
                if (encontrado) {
                    etiqueta.setText(this.jTextFieldUsuario.getText());
                    this.dispose();
                } else {
                    JOptionPane.showConfirmDialog(null, "Usuario no registrado", "NO REGISTRADO", JOptionPane.CANCEL_OPTION, 1);
                }
            } catch (NoSuchElementException e) {
                JOptionPane.showConfirmDialog(null, "Usuario no registrado", "NO REGISTRADO", JOptionPane.CANCEL_OPTION, 1);
            }
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jLabelRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistroMouseEntered
        this.jLabelRegistro.setForeground(new java.awt.Color(100, 140, 255));
    }//GEN-LAST:event_jLabelRegistroMouseEntered

    private void jLabelRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistroMouseExited
        this.jLabelRegistro.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelRegistroMouseExited

    private void jLabelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistroMouseClicked
        new VentanaRegistro(this, true, listaUsuario).setVisible(true);
    }//GEN-LAST:event_jLabelRegistroMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaSesion dialog = new VentanaSesion(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
