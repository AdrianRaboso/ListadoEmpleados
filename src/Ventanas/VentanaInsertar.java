package Ventanas;

import Datos.Empleado;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Frame;
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
public class VentanaInsertar extends javax.swing.JDialog {

    LinkedList<Empleado> listaEmp;
    Frame ventanaPrincipal;
    String sesion;

    public VentanaInsertar() {

    }

    public VentanaInsertar(LinkedList lista, Frame ventana, String user) {
        listaEmp = lista;
        ventanaPrincipal = ventana;
        sesion = user;
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/emp_64.png"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIntroNombre = new javax.swing.JTextField();
        jTextFieldIntroSueldo = new javax.swing.JTextField();
        jRadioButtonHombre = new javax.swing.JRadioButton();
        jRadioButtonMujer = new javax.swing.JRadioButton();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelMensajeLetras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insertar empleado");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(fuentePersonalizada(1,16,"/Recursos/hand.ttf"));
        jLabel1.setText("DATOS DEL EMPLEADO");

        jLabel2.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jLabel3.setText("Sueldo:");

        jTextFieldIntroNombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextFieldIntroNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextFieldIntroNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldIntroNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldIntroNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldIntroNombreFocusLost(evt);
            }
        });
        jTextFieldIntroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIntroNombreKeyTyped(evt);
            }
        });

        jTextFieldIntroSueldo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextFieldIntroSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextFieldIntroSueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldIntroSueldo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldIntroSueldoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldIntroSueldoFocusLost(evt);
            }
        });
        jTextFieldIntroSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldIntroSueldoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIntroSueldoKeyTyped(evt);
            }
        });

        sexo.add(jRadioButtonHombre);
        jRadioButtonHombre.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jRadioButtonHombre.setText("Hombre");
        jRadioButtonHombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonHombre.setFocusPainted(false);
        jRadioButtonHombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jRadioButtonHombreKeyTyped(evt);
            }
        });

        sexo.add(jRadioButtonMujer);
        jRadioButtonMujer.setFont(fuentePersonalizada(0,14,"/Recursos/hand.ttf"));
        jRadioButtonMujer.setText("Mujer");
        jRadioButtonMujer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMujer.setFocusPainted(false);
        jRadioButtonMujer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jRadioButtonMujerKeyTyped(evt);
            }
        });

        jButtonAceptar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonAceptar.setText("A C E P T A R");
        jButtonAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceptar.setFocusPainted(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonCancelar.setText("C A N C E L A R");
        jButtonCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cara.gif"))); // NOI18N

        jLabelMensajeLetras.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabelMensajeLetras.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldIntroNombre)
                                        .addComponent(jTextFieldIntroSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelMensajeLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jRadioButtonMujer))
                            .addComponent(jRadioButtonHombre)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)))
                        .addGap(38, 38, 38))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAceptar, jButtonCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIntroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldIntroSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensajeLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonHombre)
                    .addComponent(jRadioButtonMujer))
                .addGap(35, 35, 35)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        //Creamos las variables donde guardaremos el contenido de los campos de nombre, sueldo y sexo:
        boolean faltanDatos;
        boolean sexoBool = true;
        Float sueldo;

        //Sirve para saber si es hombre o mujer:
        if (this.jRadioButtonHombre.isSelected()) {
            sexoBool = true;
        } else if (this.jRadioButtonMujer.isSelected()) {
            sexoBool = false;
        }

        //Creamos un objeto empleado y lo guardamos en el fichero baseDatosEmpleado.txt si cumple que todos los campos esten completos:
        if (this.jTextFieldIntroNombre.getText().equals("") && this.jTextFieldIntroSueldo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No ha insertado ningún dato.", "NO HA INSERTADO DATOS", 1);
            faltanDatos = true;
        } else if (this.jTextFieldIntroNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No ha insertado ningun NOMBRE", "NO HA INSERTADO NOMBRE", 1);
            faltanDatos = true;
        } else if (this.jTextFieldIntroSueldo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No ha insertado ningun SUELDO", "NO HA INSERTADO SUELDO", 1);
            faltanDatos = true;
        } else if (!this.jRadioButtonHombre.isSelected() && !this.jRadioButtonMujer.isSelected()) {
            JOptionPane.showMessageDialog(null, "No ha insertado ningun SEXO", "NO HA INSERTADO SEXO", 1);
            faltanDatos = true;
        } else {
            //Introducimos los datos en la lista:
            try {
                faltanDatos = false;
                sueldo = Float.parseFloat(jTextFieldIntroSueldo.getText()); //Convertimos el campo sueldo a float.
                Empleado emp = new Empleado(jTextFieldIntroNombre.getText(), sueldo, sexoBool);
                listaEmp.add(emp);
            } catch (NumberFormatException ex) {
                faltanDatos = true;//Si inserta letras en el campo sueldo le saltara un mensaje
                JOptionPane.showMessageDialog(null, "Ha insertado letras en el campo SUELDO", "HA INSERTADO LETRAS", 1);
            }
        }
        //Por ultimo, salimos e iniciamos de nuevo la ventana Principal si los datos estan bien indicados:
        if (!faltanDatos) {
            this.dispose();
            ventanaPrincipal.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        ventanaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    /**
     *
     * Verificacion grafica para la insercion de letras en el campo sueldo:
     */
    private void jTextFieldIntroNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIntroNombreFocusGained
        this.jTextFieldIntroNombre.setBackground(new Color(230, 255, 255));
    }//GEN-LAST:event_jTextFieldIntroNombreFocusGained

    private void jTextFieldIntroNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIntroNombreFocusLost
        this.jTextFieldIntroNombre.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jTextFieldIntroNombreFocusLost

    private void jTextFieldIntroSueldoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIntroSueldoFocusGained
        this.jTextFieldIntroSueldo.setBackground(new Color(230, 255, 255));
    }//GEN-LAST:event_jTextFieldIntroSueldoFocusGained

    private void jTextFieldIntroSueldoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIntroSueldoFocusLost
        this.jTextFieldIntroSueldo.setBackground(new Color(255, 255, 254));
    }//GEN-LAST:event_jTextFieldIntroSueldoFocusLost

    private void jTextFieldIntroSueldoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIntroSueldoKeyReleased
        try {
            Float.parseFloat(jTextFieldIntroSueldo.getText());
            this.jTextFieldIntroSueldo.setBackground(new Color(230, 255, 255));
            this.jLabelMensajeLetras.setText("");
        } catch (NumberFormatException ex) {
            if (this.jTextFieldIntroSueldo.getText().equals("")) {
                this.jTextFieldIntroSueldo.setBackground(new Color(230, 255, 255));
            } else {
                this.jTextFieldIntroSueldo.setBackground(new Color(255, 204, 204));
                this.jLabelMensajeLetras.setText("Ha introducido letras");
            }
        }
    }//GEN-LAST:event_jTextFieldIntroSueldoKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jTextFieldIntroNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIntroNombreKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            this.jButtonAceptar.doClick();
        }
    }//GEN-LAST:event_jTextFieldIntroNombreKeyTyped

    private void jTextFieldIntroSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIntroSueldoKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            this.jButtonAceptar.doClick();
        }
    }//GEN-LAST:event_jTextFieldIntroSueldoKeyTyped

    private void jRadioButtonMujerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButtonMujerKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            this.jButtonAceptar.doClick();
        }
    }//GEN-LAST:event_jRadioButtonMujerKeyTyped

    private void jRadioButtonHombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButtonHombreKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            this.jButtonAceptar.doClick();
        }
    }//GEN-LAST:event_jRadioButtonHombreKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInsertar().setVisible(true);
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
    private javax.swing.JLabel jLabelMensajeLetras;
    private javax.swing.JRadioButton jRadioButtonHombre;
    private javax.swing.JRadioButton jRadioButtonMujer;
    private javax.swing.JTextField jTextFieldIntroNombre;
    private javax.swing.JTextField jTextFieldIntroSueldo;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}
