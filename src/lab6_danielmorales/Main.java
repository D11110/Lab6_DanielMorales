/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_danielmorales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        btn_listarrrr.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_planeta = new javax.swing.JTextField();
        tf_age = new javax.swing.JSpinner();
        tf_raza = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        tf_poder = new javax.swing.JComboBox<>();
        jd_modificar = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jd_eliminar = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jd_listarUniversos = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_verUniversos = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btn_listarrrr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jd_agregar.setMinimumSize(new java.awt.Dimension(350, 410));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Poder:");

        jLabel4.setText("Años:");

        jLabel5.setText("Planeta de procedencia:");

        jLabel6.setText("Raza:");

        tf_age.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        tf_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humano", "Amanto" }));

        jButton7.setText("Agregar");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Regresar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        tf_poder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout jd_agregarLayout = new javax.swing.GroupLayout(jd_agregar.getContentPane());
        jd_agregar.getContentPane().setLayout(jd_agregarLayout);
        jd_agregarLayout.setHorizontalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton8))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jd_agregarLayout.setVerticalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        jd_modificar.setMinimumSize(new java.awt.Dimension(500, 500));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Poder", "Años", "Planeta", "Raza"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jButton2.setText("Regresar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton5.setText("Modificar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jd_eliminar.setMinimumSize(new java.awt.Dimension(500, 500));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Poder", "Años", "Planeta de procedencia", "Raza"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla2);

        jButton11.setText("Eliminar");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("Regresar");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarLayout = new javax.swing.GroupLayout(jd_eliminar.getContentPane());
        jd_eliminar.getContentPane().setLayout(jd_eliminarLayout);
        jd_eliminarLayout.setHorizontalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton12)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jd_eliminarLayout.setVerticalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
        );

        jd_listarUniversos.setMinimumSize(new java.awt.Dimension(500, 280));
        jd_listarUniversos.setPreferredSize(new java.awt.Dimension(500, 280));

        ta_verUniversos.setColumns(20);
        ta_verUniversos.setRows(5);
        jScrollPane4.setViewportView(ta_verUniversos);

        jButton3.setText("Regresar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_listarUniversosLayout = new javax.swing.GroupLayout(jd_listarUniversos.getContentPane());
        jd_listarUniversos.getContentPane().setLayout(jd_listarUniversosLayout);
        jd_listarUniversosLayout.setHorizontalGroup(
            jd_listarUniversosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarUniversosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_listarUniversosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(jd_listarUniversosLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_listarUniversosLayout.setVerticalGroup(
            jd_listarUniversosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarUniversosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Bienvenido al sistema de los Shinsengumi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 44));

        jButton1.setText("Agregar ser vivo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        jButton6.setText("Abrir universo");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, -1, -1));

        jButton10.setText("Crear universo");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, -1));

        btn_listarrrr.setText("Visualizar universo");
        btn_listarrrr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarrrrMouseClicked(evt);
            }
        });
        getContentPane().add(btn_listarrrr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6_danielmorales/Shinsengumi_group.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 1040, 700));

        jMenu1.setText("Seres Vivos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Agregar ser vivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Modificar ser vivo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Eliminar ser vivo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<SerVivo> lista = new ArrayList();

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        jd_agregar.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        jd_agregar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        jd_agregar.setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked

    Universo u = new Universo();

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        String nombre = tf_nombre.getText();
        int poder = Integer.parseInt(tf_poder.getSelectedItem().toString());
        String age = tf_age.getValue().toString();
        String planeta = tf_planeta.getText();
        String raza = tf_raza.getSelectedItem().toString();

        SerVivo sv = new SerVivo(nombre, poder, age, planeta, raza);
        lista.add(sv);

        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        Object[] newRow = {
            nombre,
            poder,
            age,
            planeta,
            raza
        };
        modelo.addRow(newRow);
        tabla1.setModel(modelo);
        tabla2.setModel(modelo);

        JOptionPane.showMessageDialog(jd_agregar, "Ser vivo creado exitosamente");

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay seres vivos creados, no se puede crear Universo");
        } else {
            try {
                JFileChooser filechooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de texto", "txt");
                filechooser.addChoosableFileFilter(filter);
                int seleccionado = filechooser.showSaveDialog(this);
                FileWriter fw = null;
                BufferedWriter bw = null;
                if (seleccionado == JFileChooser.APPROVE_OPTION) {
                    try {
                        if (filechooser.getFileFilter().getDescription().equals("Archivo de texto")) {
                            archivo = new File(filechooser.getSelectedFile().getPath() + ".txt");
                        } else {
                            archivo = filechooser.getSelectedFile();
                        }
                        Universo u = new Universo();
                        u.iniciarUniverso(archivo + ".txt");
                        u.cargarArchivo();
                        for (SerVivo sv : lista) {
                            u.getSeresVivos().add(sv);
                        }
                        u.escribirArchivo();
                        lista.clear();
                    } catch (Exception e) {

                    }
                }
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_modificar.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try {
            Universo u = new Universo();
            u.iniciarUniverso(archivo.getPath());
            u.cargarArchivo();
            String aux = "";
            for (SerVivo sv : u.getSeresVivos()) {
                aux += u.getSeresVivos().indexOf(sv) + ">" + sv.getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice que desea modificar"));
            int indAMod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del dato que va a modificar:"
                    + "\n1. Nombre"
                    + "                     \n2. Edad"
                    + "                     \n3. Raza"
                    + "                     \n4. Poder"
                    + "                     \n5. Planeta"));
            switch (indAMod) {
                case 1:
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    u.getSeresVivos().get(op).setNombre(nuevoNombre);
                    break;
                case 2:
                    try {
                        String nuevaEdad = JOptionPane.showInputDialog("Ingrese la nueva edad:");
                        u.getSeresVivos().get(op).setAños(nuevaEdad);
                        u.escribirArchivo();
                    } catch (Exception e) {
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(this, "1. Humano 2. Amanto");
                    int indRaza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva raza:"));
                    String nuevaRaza = "";
                    switch (indRaza) {
                        case 1:
                            nuevaRaza = "Humano";
                            break;
                        case 2:
                            nuevaRaza = "Amanto";
                            break;
                    }
                    u.getSeresVivos().get(op).setRaza(nuevaRaza);
                    break;
                case 4:
                    int nuevoPoder = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo poder:"));
                    while (nuevoPoder < 1 || nuevoPoder > 10) {
                        JOptionPane.showMessageDialog(null, "1-10 solamente");
                        nuevoPoder = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo poder:"));
                    }
                    u.getSeresVivos().get(op).setPoder(nuevoPoder);
                    break;
                case 5:
                    String nuevoPlaneta = JOptionPane.showInputDialog("Ingrese el nuevo planeta:");
                    u.getSeresVivos().get(op).setPlanetaProcedencia(nuevoPlaneta);
                    break;
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            u.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        abierto = false;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if (tabla1.getSelectedRow() >= 0) {
            String nombre = JOptionPane.showInputDialog(jd_modificar, "Ingrese el nombre:");
            int poder = Integer.parseInt(JOptionPane.showInputDialog(jd_modificar, "Ingrese el poder:"));
            String age = JOptionPane.showInputDialog(jd_modificar, "Ingrese la edad:");
            String planeta = JOptionPane.showInputDialog(jd_modificar, "Ingrese el planeta:");
            String raza = JOptionPane.showInputDialog(jd_modificar, "Ingrese la raza:");

            SerVivo sv = new SerVivo(nombre, poder, age, planeta, raza);
            DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();

            Object[] newRow = {
                nombre,
                poder,
                age,
                planeta,
                raza
            };

            modelo.addRow(newRow);
            modelo.removeRow(tabla1.getSelectedRow());
            tabla1.setModel(modelo);
            tabla2.setModel(modelo);

            JOptionPane.showMessageDialog(jd_modificar, "Elemento modificado exitosamente");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
        jd_eliminar.setVisible(false);
    }//GEN-LAST:event_jButton12MouseClicked

    File archivo = null;

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        String aux = "";
        try {
            Universo u = new Universo();
            u.iniciarUniverso(archivo.getPath());
            u.cargarArchivo();

            for (SerVivo sv : u.getSeresVivos()) {
                aux += u.getSeresVivos().indexOf(sv) + "->" + sv.getNombre() + "\n";
            }

            JOptionPane.showMessageDialog(this, aux);
            int eli = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice a eliminar"));
            u.getSeresVivos().remove(eli);

            u.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Eliminado correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        if (tabla2.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
            modelo.removeRow(tabla2.getSelectedRow());
            tabla2.setModel(modelo);
            tabla1.setModel(modelo);

            JOptionPane.showMessageDialog(jd_eliminar, "Elemento eliminado exitosamente");
        }
    }//GEN-LAST:event_jButton11MouseClicked

    boolean abierto = false;

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        abierto = true;
        btn_listarrrr.setEnabled(true);

        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            FileReader fr = null;
            try {
                archivo = fc.getSelectedFile();

                ta_verUniversos.setText("");
                if (archivo.isFile()) {
                    fr = new FileReader(archivo);
                    BufferedReader br = new BufferedReader(fr);
                    String linea = "";
                    while ((linea = br.readLine()) != null) {
                        ta_verUniversos.append(linea);
                        ta_verUniversos.append("\n");
                    }

                }

                Universo u = new Universo();
                u.iniciarUniverso(archivo.getPath());
                u.cargarArchivo();
                for (SerVivo sv : u.getSeresVivos()) {
                    lista.add(sv);
                }
                jd_listarUniversos.setModal(true);
                jd_listarUniversos.pack();
                jd_listarUniversos.setLocationRelativeTo(this);
                jd_listarUniversos.setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void btn_listarrrrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarrrrMouseClicked
        // TODO add your handling code here:
        if (abierto) {
            jd_listarUniversos.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Necesita volver a cargar el archivo");
        }
    }//GEN-LAST:event_btn_listarrrrMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jd_listarUniversos.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_listarrrr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JDialog jd_eliminar;
    private javax.swing.JDialog jd_listarUniversos;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JTextArea ta_verUniversos;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JSpinner tf_age;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_planeta;
    private javax.swing.JComboBox<String> tf_poder;
    private javax.swing.JComboBox<String> tf_raza;
    // End of variables declaration//GEN-END:variables
}
