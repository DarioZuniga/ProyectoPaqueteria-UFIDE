package proyectopaqueteria.programacionclienteservidor;
import javax.swing.JOptionPane;
import java.io.*;

public class Archivos3_ModificarR extends javax.swing.JFrame {

    public Archivos3_ModificarR() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Funcionalidades del Sistema");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cédula");

        jLabel2.setText("Primer Apellido");

        jLabel3.setText("Segundo Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Dirección");

        jLabel6.setText("Teléfono");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Salario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/asking.png"))); // NOI18N
        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(77, 77, 77))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel7)))
                                        .addGap(0, 36, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(26, 26, 26)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void agregar() {
        Operacion op = new Operacion();
        op.setCedula(jTextField1.getText());
        op.setPrimAp(jTextField2.getText());
        op.setSegAp(jTextField3.getText());
        op.setNombre(jTextField4.getText());
        op.setDirecc(jTextField5.getText());
        op.setTelef(jTextField6.getText());
        op.setSalario(Double.parseDouble(jTextField7.getText()));
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("Paquete.dat", true));
            salida.writeUTF(op.getCedula());
            salida.writeUTF(op.getPrimAp());
            salida.writeUTF(op.getSegAp());
            salida.writeUTF(op.getNombre());
            salida.writeUTF(op.getDirecc());
            salida.writeUTF(op.getTelef());
            salida.writeDouble(op.getSalario());
            JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!");
            salida.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "¡Error al guardar!");
        }
    }

    public void consultar() {
        boolean proximo = true;
        Operacion op = new Operacion();
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("Paquete.dat"));
            try {
                while (true) {
                    op.setCedula(entrada.readUTF());
                    op.setPrimAp(entrada.readUTF());
                    op.setSegAp(entrada.readUTF());
                    op.setNombre(entrada.readUTF());
                    op.setDirecc(entrada.readUTF());
                    op.setTelef(entrada.readUTF());
                    op.setSalario(entrada.readDouble());
                    if (op.getCedula().equals(jTextField1.getText())) {
                        jTextField2.setText(op.getPrimAp());
                        jTextField3.setText(op.getSegAp());
                        jTextField4.setText(op.getNombre());
                        jTextField5.setText(op.getDirecc());
                        jTextField6.setText(op.getTelef());
                        jTextField7.setText(String.valueOf(op.getSalario()));
                        proximo = false;
                    }
                }
            } catch (EOFException eeof) {
                entrada.close();
                if (proximo) {
                    JOptionPane.showMessageDialog(null, "¡No se encontró el dato buscado!");
                }
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo!");
        }
    }

    public void modificar() {
        Operacion op = new Operacion();
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("Paquete.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("auxiliar.dat"));
            try {
                while (true) {
                    op.setCedula(entrada.readUTF());
                    op.setPrimAp(entrada.readUTF());
                    op.setSegAp(entrada.readUTF());
                    op.setNombre(entrada.readUTF());
                    op.setDirecc(entrada.readUTF());
                    op.setTelef(entrada.readUTF());
                    op.setSalario(entrada.readDouble());
                    if (op.getCedula().equals(jTextField1.getText())) {
                        op.setCedula(jTextField1.getText());
                        op.setPrimAp(jTextField2.getText());
                        op.setSegAp(jTextField3.getText());
                        op.setNombre(jTextField4.getText());
                        op.setDirecc(jTextField5.getText());
                        op.setTelef(jTextField6.getText());
                        op.setSalario(Double.parseDouble(jTextField7.getText()));
                    }
                    salida.writeUTF(op.getCedula());
                    salida.writeUTF(op.getPrimAp());
                    salida.writeUTF(op.getSegAp());
                    salida.writeUTF(op.getNombre());
                    salida.writeUTF(op.getDirecc());
                    salida.writeUTF(op.getTelef());
                    salida.writeDouble(op.getSalario());
                }
            } catch (EOFException ex) {
                entrada.close();
                salida.close();
                JOptionPane.showMessageDialog(null,"¡Datos fueron modificados correctamente!");
                intercambiar();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo!");
        }
    }

    public void eliminar() {
        Operacion op = new Operacion();
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("Paquete.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("auxiliar.dat"));
            try {
                while (true) {
                    op.setCedula(entrada.readUTF());
                    op.setPrimAp(entrada.readUTF());
                    op.setSegAp(entrada.readUTF());
                    op.setNombre(entrada.readUTF());
                    op.setDirecc(entrada.readUTF());
                    op.setTelef(entrada.readUTF());
                    op.setSalario(entrada.readDouble());
                    if (!op.getCedula().equals(jTextField1.getText())) {
                        salida.writeUTF(op.getCedula());
                        salida.writeUTF(op.getPrimAp());
                        salida.writeUTF(op.getSegAp());
                        salida.writeUTF(op.getNombre());
                        salida.writeUTF(op.getDirecc());
                        salida.writeUTF(op.getTelef());
                        salida.writeDouble(op.getSalario());
                    }
                }
            } catch (EOFException eofe) {
                salida.close();
                entrada.close();
                JOptionPane.showMessageDialog(null, "¡Datos fueron borrados correctamente!");
                intercambiar();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo!");
        }
    }

    public void intercambiar() {
        Operacion op = new Operacion();
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("auxiliar.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("Paquete.dat"));
            try {
                op.setCedula(entrada.readUTF());
                op.setPrimAp(entrada.readUTF());
                op.setSegAp(entrada.readUTF());
                op.setNombre(entrada.readUTF());
                op.setDirecc(entrada.readUTF());
                op.setTelef(entrada.readUTF());
                op.setSalario(entrada.readDouble());
                salida.writeUTF(op.getCedula());
                salida.writeUTF(op.getPrimAp());
                salida.writeUTF(op.getSegAp());
                salida.writeUTF(op.getNombre());
                salida.writeUTF(op.getDirecc());
                salida.writeUTF(op.getTelef());
                salida.writeDouble(op.getSalario());
            } catch (EOFException eofe) {
                salida.close();
                entrada.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo!");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int salir=JOptionPane.showConfirmDialog(null,"¿Desea salir?","Salir",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(salir==0){
           System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        consultar();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Archivos3_ModificarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivos3_ModificarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivos3_ModificarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivos3_ModificarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivos3_ModificarR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
