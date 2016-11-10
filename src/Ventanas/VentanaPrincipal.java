package Ventanas;

import Datos.Empleado;
import Datos.UsuarioYContraseña;
import Datos.Utilidades;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Adrián
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    LinkedList<Empleado> listaLink = Utilidades.cambiarEmpleadosDelFicheroALaLista(); //Cargamos las listas al empezar el programa. Tanto empleados como contraseñas.
    LinkedList<UsuarioYContraseña> listaUsuarios = Utilidades.cambiarUsuariosALaLista();
    ListIterator<Empleado> listIte; //Lo necesitamos para poder avanzar y retroceder en los objetos sin que se reinicie cada vez que pulsamos.
    static String rutaFichero; //Guardamos la ruta del fichero en una variable.
    static boolean estado; //Variable usada para el buen funcionamiento de los botones de Atras y Delante.

    public VentanaPrincipal() {
        initComponents();
        valoresInicialesVentanaPrincipal();
        this.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/user_64.png"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToggleButtonCambiarOrden = new javax.swing.JToggleButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonInsertar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonAdelante = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jComboBoxOrden = new javax.swing.JComboBox();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        TitledBorder titleNombre;
        titleNombre = BorderFactory.createTitledBorder("Nombre: ");
        titleNombre.setTitleFont(fuentePersonalizada(1,13,"/Recursos/hand.ttf"));
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TitledBorder titleSueldo;
        titleSueldo = BorderFactory.createTitledBorder("Sueldo: ");
        titleSueldo.setTitleFont(fuentePersonalizada(1,13,"/Recursos/hand.ttf"));
        jTextFieldSueldo = new javax.swing.JTextField();
        TitledBorder titleSexo;
        titleSexo = BorderFactory.createTitledBorder("Sexo: ");
        titleSexo.setTitleFont(fuentePersonalizada(1,13,"/Recursos/hand.ttf"));
        jLabelSexo = new javax.swing.JLabel();
        jLabelCarita = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAbrirArchivo = new javax.swing.JMenu();
        jMenuItemInfo = new javax.swing.JMenuItem();
        jMenuItemAbrirArchivo = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemGuardarComo = new javax.swing.JMenuItem();
        jMenuItemSalirSinGuardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de empleados");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(232, 245, 252));
        jDesktopPane1.setBorder(BorderFactory.createMatteBorder(2, 5, 2, 5, new java.awt.Color(0, 80, 220)));

        jToggleButtonCambiarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sort-a-to-z.png"))); // NOI18N
        jToggleButtonCambiarOrden.setFocusPainted(false);
        jToggleButtonCambiarOrden.setRequestFocusEnabled(false);
        jToggleButtonCambiarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCambiarOrdenActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonBuscar.setMnemonic('u');
        jButtonBuscar.setText("B U S C A R");
        jButtonBuscar.setToolTipText("Busca un empleado");
        jButtonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.setFocusPainted(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonAtras.setBackground(new java.awt.Color(204, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ante.png"))); // NOI18N
        jButtonAtras.setToolTipText("Anterior empleado");
        jButtonAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtras.setFocusPainted(false);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonInsertar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonInsertar.setMnemonic('n');
        jButtonInsertar.setText("I N S E R T A R");
        jButtonInsertar.setToolTipText("Inserta un empleado nuevo");
        jButtonInsertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInsertar.setFocusPainted(false);
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonModificar.setMnemonic('m');
        jButtonModificar.setText("M O D I F I C A R");
        jButtonModificar.setToolTipText("Modifica el empleado actual");
        jButtonModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificar.setFocusPainted(false);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/exit.png"))); // NOI18N
        jButtonSalir.setToolTipText("Salir");
        jButtonSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.setFocusPainted(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonAdelante.setBackground(new java.awt.Color(204, 255, 255));
        jButtonAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sig.png"))); // NOI18N
        jButtonAdelante.setToolTipText("Siguiente empleado");
        jButtonAdelante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAdelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdelante.setFocusPainted(false);
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(fuentePersonalizada(0,12,"/Recursos/title.ttf"));
        jButtonBorrar.setMnemonic('o');
        jButtonBorrar.setText("B O R R A R");
        jButtonBorrar.setToolTipText("Borra el empleado actual");
        jButtonBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBorrar.setFocusPainted(false);
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jComboBoxOrden.setFont(fuentePersonalizada(0,12,"/Recursos/maquina.ttf"));
        jComboBoxOrden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html>Ordenar por <b>Nombre</b></html>", "<html> Ordenar por <b>Sueldo</b></html>" }));
        jComboBoxOrden.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxOrden.setRequestFocusEnabled(false);
        jComboBoxOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonCambiarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdelante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonBorrar, jButtonBuscar, jButtonInsertar, jButtonModificar});

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAdelante, jButtonAtras});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButtonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButtonCambiarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonBorrar, jButtonBuscar, jButtonInsertar, jButtonModificar});

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAdelante, jButtonAtras});

        jDesktopPane1.setLayer(jToggleButtonCambiarOrden, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonAtras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonInsertar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonAdelante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBoxOrden, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBackground(jDesktopPane1.getBackground());
        jDesktopPane2.setBorder(jDesktopPane1.getBorder());

        jTextFieldNombre.setFont(fuentePersonalizada(0,14,"/Recursos/title.ttf"));
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 175));
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombre.setBorder(titleNombre);
        jTextFieldNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldNombre.setFocusable(false);
        jTextFieldNombre.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel1.setFont(fuentePersonalizada(1,18,"/Recursos/title.ttf"));
        jLabel1.setText("Los datos del empleado ("+Utilidades.buscarEmpleadoEnLista(listaLink, this.jTextFieldNombre.getText())+" de "+listaLink.size()+") son:");

        jTextFieldSueldo.setFont(fuentePersonalizada(0,16,"/Recursos/title.ttf"));
        jTextFieldSueldo.setForeground(new java.awt.Color(0, 0, 175));
        jTextFieldSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSueldo.setBorder(titleSueldo);
        jTextFieldSueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldSueldo.setFocusable(false);
        jTextFieldSueldo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextFieldSueldo.setMinimumSize(new java.awt.Dimension(8, 34));

        jLabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSexo.setBorder(titleSexo);

        jLabelCarita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cara.gif"))); // NOI18N
        jLabelCarita.setToolTipText("Iniciar sesión");
        jLabelCarita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelCarita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCaritaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCaritaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCaritaMouseExited(evt);
            }
        });

        jLabelNombreUsuario.setBackground(new java.awt.Color(51, 0, 51));
        jLabelNombreUsuario.setFont(fuentePersonalizada(0,13,"/Recursos/title.ttf"));
        jLabelNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreUsuario.setLabelFor(jLabelCarita);
        jLabelNombreUsuario.setText("Iniciar sesión");
        jLabelNombreUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCarita))
                        .addContainerGap())
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jDesktopPane2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldNombre, jTextFieldSueldo});

        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCarita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreUsuario)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jDesktopPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldNombre, jTextFieldSueldo});

        jDesktopPane2.setLayer(jTextFieldNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTextFieldSueldo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabelSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabelCarita, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabelNombreUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuAbrirArchivo.setMnemonic('A');
        jMenuAbrirArchivo.setText("<html> <t><u>A</u>rchivo</t> </html>");

        jMenuItemInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        jMenuItemInfo.setText("Información");
        jMenuItemInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfoActionPerformed(evt);
            }
        });
        jMenuAbrirArchivo.add(jMenuItemInfo);

        jMenuItemAbrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAbrirArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/open-folder.png"))); // NOI18N
        jMenuItemAbrirArchivo.setMnemonic('a');
        jMenuItemAbrirArchivo.setText("Abrir archivo");
        jMenuItemAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirArchivoActionPerformed(evt);
            }
        });
        jMenuAbrirArchivo.add(jMenuItemAbrirArchivo);

        jMenuItemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save.png"))); // NOI18N
        jMenuItemGuardar.setMnemonic('G');
        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenuAbrirArchivo.add(jMenuItemGuardar);

        jMenuItemGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save_as.png"))); // NOI18N
        jMenuItemGuardarComo.setMnemonic('r');
        jMenuItemGuardarComo.setText("Guardar como...");
        jMenuItemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarComoActionPerformed(evt);
            }
        });
        jMenuAbrirArchivo.add(jMenuItemGuardarComo);

        jMenuItemSalirSinGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalirSinGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir_sin_guardar.png"))); // NOI18N
        jMenuItemSalirSinGuardar.setMnemonic('S');
        jMenuItemSalirSinGuardar.setText("Salir sin guardar");
        jMenuItemSalirSinGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirSinGuardarActionPerformed(evt);
            }
        });
        jMenuAbrirArchivo.add(jMenuItemSalirSinGuardar);

        jMenuBar1.add(jMenuAbrirArchivo);

        jMenu2.setMnemonic('E');
        jMenu2.setText("<html> <t><u>E</u>ditar</t> </html>");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/list.png"))); // NOI18N
        jMenuItem1.setText("Visualizar lista completa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user.png"))); // NOI18N
        jMenuItem2.setText("Borrar todos los empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDesktopPane2)
                    .addComponent(jDesktopPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Font fuentePersonalizada(int estilo, float tamaño, String fontName) {
        try {
            return Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontName)).deriveFont(estilo, tamaño);
        } catch (FontFormatException | IOException ex) {
            return new Font("Segoe UI", Font.PLAIN, 12);
        }
    }

    private void valoresInicialesVentanaPrincipal() {
        Empleado aux;
        listIte = listaLink.listIterator();
        try {
            aux = listaLink.getFirst();
            asignarValoresVentanaPrincipal(aux);
            ordenarLista();
            cambiarEstadoBotonesAtrasDelante();//Sirve para habilitar o deshabilitar los botones de atras y delante:
        } catch (NoSuchElementException e) {
        }
    }

    private void asignarValoresVentanaPrincipal(Empleado emp) {
        try {
            //Se asignan los valores del primer objeto a cada campo>
            String sueldoString = String.valueOf(emp.getSueldo());
            this.jTextFieldNombre.setText(emp.getNombre());
            this.jTextFieldSueldo.setText(sueldoString);
            if (emp.isSexo()) {
                jLabelSexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Hombre.png")));
            } else {
                jLabelSexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Mujer.png")));
            }
        } catch (NoSuchElementException | NullPointerException e) {
        }
    }

    private void cambiarEstadoBotonesAtrasDelante() {
        if (listaLink.size() == 0) {
            jLabel1.setText("Los datos del empleado (" + listaLink.size() + " de " + listaLink.size() + ") son:");
        } else {
            jLabel1.setText("Los datos del empleado (" + (Utilidades.buscarEmpleadoEnLista(listaLink, this.jTextFieldNombre.getText()) + 1) + " de " + listaLink.size() + ") son:");
        }
        if (!listaLink.isEmpty() && listaLink.size() > 1) {
            if (listIte.hasPrevious()) {
                this.jButtonAtras.setEnabled(true);
                this.jButtonAtras.setBorderPainted(true);
                jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            } else {
                this.jButtonAtras.setEnabled(false);
                this.jButtonAtras.setBorderPainted(false);
                jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
            if (listIte.hasNext()) {
                this.jButtonAdelante.setEnabled(true);
                this.jButtonAdelante.setBorderPainted(true);
                jButtonAdelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            } else {
                this.jButtonAdelante.setEnabled(false);
                this.jButtonAdelante.setBorderPainted(false);
                jButtonAdelante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
        } else {
            this.jButtonAtras.setEnabled(false);
            this.jButtonAtras.setBorderPainted(false);
            jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            this.jButtonAdelante.setEnabled(false);
            this.jButtonAdelante.setBorderPainted(false);
            jButtonAdelante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }

    private void ordenarLista() {
        switch (this.jComboBoxOrden.getSelectedIndex()) {
            case 0:
                if (this.jToggleButtonCambiarOrden.isSelected()) {
                    Collections.sort(listaLink, new Datos.OrdenarEmpleadoPorNombreInverso());
                    this.asignarValoresVentanaPrincipal(listaLink.getFirst());
                    listIte = listaLink.listIterator();
                    cambiarEstadoBotonesAtrasDelante();
                } else {
                    Collections.sort(listaLink, new Datos.OrdenarEmpleadoPorNombre());
                    this.asignarValoresVentanaPrincipal(listaLink.getFirst());
                    listIte = listaLink.listIterator();
                    cambiarEstadoBotonesAtrasDelante();
                }
                break;
            case 1:
                if (this.jToggleButtonCambiarOrden.isSelected()) {
                    Collections.sort(listaLink, new Datos.OrdenarEmpleadoPorSueldoInverso());
                    this.asignarValoresVentanaPrincipal(listaLink.getFirst());
                    listIte = listaLink.listIterator();
                    cambiarEstadoBotonesAtrasDelante();
                } else {
                    Collections.sort(listaLink, new Datos.OrdenarEmpleadoPorSueldo());
                    this.asignarValoresVentanaPrincipal(listaLink.getFirst());
                    listIte = listaLink.listIterator();
                    cambiarEstadoBotonesAtrasDelante();
                }
                break;
        }
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String[] ops = {"Guardar y salir", "Salir sin guardar"};
        Utilidades.guardarListaUsuarioEnFichero(listaUsuarios);

        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            int opt = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "SALIR DEL PROGRAMA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, ops, 0);
            switch (opt) {
                case 0:
                    Utilidades.guardarListaEnFichero(listaLink);
                    if (rutaFichero != null) {
                        Utilidades.guardarFicheroEnRutaEspecifica(listaLink, rutaFichero);
                    }
                    System.exit(0);
                    break;
                case 1:
                    System.exit(0);
                    break;
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemSalirSinGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirSinGuardarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirSinGuardarActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            Utilidades.guardarListaEnFichero(listaLink);
            if (rutaFichero != null) {
                Utilidades.guardarFicheroEnRutaEspecifica(listaLink, rutaFichero);
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Inicie sesión para GUARDAR el archivo", "INICIO DE SESIÓN OBLIGATORIO", JOptionPane.CLOSED_OPTION, 2);
        }

    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jMenuItemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfoActionPerformed
        JTextArea texto = new JTextArea();
        texto.setText("* Aplicación para el manejo de un fichero de empleados *\n\n"
                + "-Autor: Adrián Raboso Bejarano\n"
                + "-Profesor/a: Elena Pérez Nebreda\n"
                + "-Instituto: I.E.S. Enrique Tierno Galván\n"
                + "-Fecha de creación: 14/08/2016\n"
                + "-Derechos de imagenes: http://www.flaticon.com/authors/icomoon,\n"
                + "\t     http://www.dafont.com/es");
        texto.setFont(fuentePersonalizada(0, 14, "/Recursos/title.ttf"));
        texto.setBackground(new java.awt.Color(240, 240, 240));

        JOptionPane.showConfirmDialog(null, texto, "INFORMACIÓN", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemInfoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JTextArea texto = new JTextArea();
        ListIterator<Empleado> ite = listaLink.listIterator();
        Empleado emp;
        //Agregamos caracteristicas al texto de la lista
        texto.setBackground(new java.awt.Color(240, 240, 240));
        texto.setText("Lista de Empleados:\n\n");
        texto.setFont(fuentePersonalizada(0, 14, "/Recursos/title.ttf"));
        if (!listaLink.isEmpty()) {
            while (ite.hasNext()) {
                emp = ite.next();
                texto.append("- " + emp.getNombre() + "\n");
            }
            JOptionPane.showConfirmDialog(null, texto, "LISTA COMPLETA DE EMPLEADOS", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(null, "Vacia.", "LISTA COMPLETA DE EMPLEADOS", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            int res = JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar a todos los empleados de la lista?", "BORRAR LISTA COMPLETA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == 0) {
                this.valoresInicialesVentanaPrincipal();
                listaLink.clear();

                this.jTextFieldNombre.setText("");
                this.jTextFieldSueldo.setText("");
                jLabelSexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));

                cambiarEstadoBotonesAtrasDelante();
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Inicie sesión para BORRAR empleados", "INICIO DE SESIÓN OBLIGATORIO", JOptionPane.CLOSED_OPTION, 2);
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarComoActionPerformed
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            try {
                if (fileChooser.showSaveDialog(null) == fileChooser.APPROVE_OPTION) {
                    rutaFichero = fileChooser.getSelectedFile().getAbsolutePath();
                    Utilidades.guardarFicheroEnRutaEspecifica(listaLink, rutaFichero);
                    rutaFichero = null;
                }
            } catch (Exception ex) {
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Inicie sesión para GUARDAR el archivo", "INICIO DE SESIÓN OBLIGATORIO", JOptionPane.CLOSED_OPTION, 2);
        }

    }//GEN-LAST:event_jMenuItemGuardarComoActionPerformed

    private void jMenuItemAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirArchivoActionPerformed
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();

        try {
            if (fileChooser.showOpenDialog(null) == fileChooser.APPROVE_OPTION) {
                rutaFichero = fileChooser.getSelectedFile().getAbsolutePath();
                listaLink = Utilidades.cambiarEmpleadosDelFicheroALaListaConRutaEspecifica(rutaFichero);
                asignarValoresVentanaPrincipal(listaLink.getFirst());
                ordenarLista();
                cambiarEstadoBotonesAtrasDelante();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Archivo no válido", "ARCHIVO ERRÓNEO", JOptionPane.CLOSED_OPTION);
            listaLink = Utilidades.cambiarEmpleadosDelFicheroALaLista();
            asignarValoresVentanaPrincipal(listaLink.getFirst());
            ordenarLista();
            cambiarEstadoBotonesAtrasDelante();
        }
    }//GEN-LAST:event_jMenuItemAbrirArchivoActionPerformed

    private void jLabelCaritaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCaritaMouseEntered
        this.jLabelNombreUsuario.setForeground(new java.awt.Color(100, 140, 255));
    }//GEN-LAST:event_jLabelCaritaMouseEntered

    private void jLabelCaritaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCaritaMouseExited
        this.jLabelNombreUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelCaritaMouseExited

    private void jLabelCaritaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCaritaMouseClicked
        new VentanaSesion(this, true, listaUsuarios, jLabelNombreUsuario).setVisible(true);
    }//GEN-LAST:event_jLabelCaritaMouseClicked

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        valoresInicialesVentanaPrincipal();
    }//GEN-LAST:event_formHierarchyChanged

    private void jComboBoxOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenActionPerformed
        ordenarLista();
    }//GEN-LAST:event_jComboBoxOrdenActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        Empleado empBorrar;

        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            if (this.jTextFieldNombre.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Lo siento, no ha seleccionado a nadie para poder BORRAR sus datos.", "NO HAY EMPLEADO SELECCIONADO", 2);
            } else {
                int opt = JOptionPane.showConfirmDialog(null, "¿Desea borrar al empleado/a " + this.jTextFieldNombre.getText() + "?", "CONFIRMACIÓN PARA BORRAR EMPLEADO", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (opt == 0) {
                    empBorrar = Utilidades.buscarEmpleadoEnListaDevuelveEmp(listaLink, this.jTextFieldNombre.getText());
                    listaLink.remove(empBorrar);
                    listIte = listaLink.listIterator();
                    //Se asignan los valores vacios a cada campo:
                    if (!listaLink.isEmpty()) {
                        asignarValoresVentanaPrincipal(listaLink.getFirst());
                    } else {
                        this.jTextFieldNombre.setText("");
                        this.jTextFieldSueldo.setText("");
                        jLabelSexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                    }
                    cambiarEstadoBotonesAtrasDelante();
                } else {
                }
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Inicie sesión para BORRAR empleados", "INICIO DE SESIÓN OBLIGATORIO", JOptionPane.CLOSED_OPTION, 2);
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdelanteActionPerformed
        Empleado empSig;
        if (!listaLink.isEmpty() && listIte.hasNext()) {
            empSig = listIte.next();
            if ((empSig.equals(listaLink.getFirst()) && listIte.hasNext()) || !estado) {
                empSig = listIte.next();

            }
            //Ponemos los datos en los campos de la ventana Principal:
            asignarValoresVentanaPrincipal(empSig);
            cambiarEstadoBotonesAtrasDelante();
        }
        estado = true;
    }//GEN-LAST:event_jButtonAdelanteActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        String[] ops = {"Guardar y salir", "Salir sin guardar", "Cancelar"};
        Utilidades.guardarListaUsuarioEnFichero(listaUsuarios);

        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            int opt = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "SALIR DEL PROGRAMA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, ops, 0);
            switch (opt) {
                case 0:
                Utilidades.guardarListaEnFichero(listaLink);
                if (rutaFichero != null) {
                    Utilidades.guardarFicheroEnRutaEspecifica(listaLink, rutaFichero);
                }
                System.exit(0);
                break;
                case 1:
                System.exit(0);
                break;
                case 2:
                break;
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        String[] ops = {"Nombre", "Sueldo", "Cancelar"};
        int indiceEmp;
        String nombreMod;
        Empleado empModificado;

        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            //Es la condicion para saber si se esta visualizando algun empleado para poder MODIFICARLO:
            if (this.jTextFieldNombre.getText().equals("") || listaLink.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lo siento, no ha seleccionado a nadie para poder MODIFICAR sus datos.", "NO HAY EMPLEADO SELECCIONADO", 2);
            } else {
                indiceEmp = Utilidades.buscarEmpleadoEnLista(listaLink, this.jTextFieldNombre.getText());
                empModificado = listaLink.get(indiceEmp);

                //Si se esta visualizado algun empleado, saltara la ventana de modificar:
                int opt = JOptionPane.showOptionDialog(null, "¿Que desea modificar?", "MODIFICAR DATOS EMPLEADO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, ops, 0);
                switch (opt) {
                    case 0:
                    nombreMod = JOptionPane.showInputDialog(null, "Introduzca el nuevo nombre del empleado: ", "MODIFICAR NOMBRE", JOptionPane.QUESTION_MESSAGE);
                    if (nombreMod.equalsIgnoreCase("")) {
                        JOptionPane.showMessageDialog(null, "No ha insertado datos en el campo NOMBRE", "SIN DATOS", 1);
                    } else {
                        empModificado.setNombre(nombreMod);
                    }
                    break;
                    case 1:
                    try {
                        empModificado.setSueldo(Float.valueOf(JOptionPane.showInputDialog(null, "Introduzca el nuevo sueldo del empleado: ", "MODIFICAR SUELDO", JOptionPane.QUESTION_MESSAGE)));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Valor erróneo del campo SUELDO", "VALOR INCORRECTO", 1);
                    } catch (NullPointerException e) {
                    }
                    break;
                    case 2:
                    break;
                }

                ordenarLista();
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Inicie sesión para MODIFICAR empleados", "INICIO DE SESIÓN OBLIGATORIO", JOptionPane.CLOSED_OPTION, 2);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        //Generamos la ventana para insertar empleados:
        if (Utilidades.exitsUserAndPass(listaUsuarios, this.jLabelNombreUsuario.getText())) {
            new VentanaInsertar(listaLink, this, jLabelNombreUsuario.getText()).setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showConfirmDialog(null, "Inicie sesión para INSERTAR empleados", "INICIO DE SESIÓN OBLIGATORIO", JOptionPane.CLOSED_OPTION, 2);
        }
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Empleado empAtras;
        if (!listaLink.isEmpty() && listIte.hasPrevious()) {
            empAtras = listIte.previous();
            if ((empAtras.equals(listaLink.getLast()) && listIte.hasPrevious()) || estado) {
                empAtras = listIte.previous();
            }
            //Ponemos los datos en los campos de la ventana Principal:
            asignarValoresVentanaPrincipal(empAtras);
            cambiarEstadoBotonesAtrasDelante();
        }
        estado = false;
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String[] ops = {"Modificar", "Borrar", "Cancelar"};
        String nombreBuscar;
        Empleado empBuscar;

        if (listaLink.isEmpty()) {//Sirve para saber si hay empleados en la base de datos.
            JOptionPane.showMessageDialog(null, "Lo siento, no hay empleados en la base de datos.", "NO HAY EMPLEADOS", 2);
        } else {
            try {
                nombreBuscar = JOptionPane.showInputDialog(null, "Introduzca el nombre del empleado a buscar:", "BUSCAR...", JOptionPane.QUESTION_MESSAGE);//Ventana que pregunta el nombre que quiere buscar.
                empBuscar = Utilidades.buscarEmpleadoEnListaDevuelveEmp(listaLink, nombreBuscar);
                if (!nombreBuscar.equalsIgnoreCase("")) {
                    if (empBuscar != null && empBuscar.getNombre().equalsIgnoreCase(nombreBuscar)) {

                        //Salta el mensaje con los datos del empleado encontrado:
                        int opt = JOptionPane.showOptionDialog(null, "El empleado " + empBuscar.getNombre() + " tiene un sueldo de " + empBuscar.getSueldo() + " €", "MODIFICAR EMPLEADO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, ops, 0);
                        switch (opt) {
                            case 0:
                            asignarValoresVentanaPrincipal(empBuscar);
                            jButtonModificarActionPerformed(evt);
                            break;
                            case 1:
                            asignarValoresVentanaPrincipal(empBuscar);
                            jButtonBorrarActionPerformed(evt);
                            break;
                            case 2:
                            break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El empleado  no se encuentra en la base de datos.", "EMPLEADO NO ENCONTRADO", 2);//Se muestra si no encuentra nadie con ese nombre.
                    }
                }
            } catch (NoSuchElementException | NullPointerException ex) {
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jToggleButtonCambiarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCambiarOrdenActionPerformed
        if (this.jToggleButtonCambiarOrden.isSelected()) {
            jToggleButtonCambiarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sort-z-to-a.png")));
            ordenarLista();
        } else {
            jToggleButtonCambiarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/sort-a-to-z.png")));
            ordenarLista();
        }
    }//GEN-LAST:event_jToggleButtonCambiarOrdenActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdelante;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox jComboBoxOrden;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCarita;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAbrirArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbrirArchivo;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemGuardarComo;
    private javax.swing.JMenuItem jMenuItemInfo;
    private javax.swing.JMenuItem jMenuItemSalirSinGuardar;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSueldo;
    private javax.swing.JToggleButton jToggleButtonCambiarOrden;
    // End of variables declaration//GEN-END:variables
}
