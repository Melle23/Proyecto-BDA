package agenciafiscalpresentacion;

import Control.ControlPresentacion;
import consultas.ConsultasLicencias;
import consultas.IConsultasLicencias;
import daos.LicenciasDAO;
import daos.PersonasDAO;
import dtos.LicenciaDTO;
import entidades.AgenciaFiscalPersistencia;
import entidades.EnumTipoLicencia;
import entidades.EnumVigenciaLicencia;
import entidades.Licencia;
import entidades.Persona;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author molin
 */
public class DlgLicencia extends javax.swing.JDialog {

    ControlPresentacion control = new ControlPresentacion();
    IConsultasLicencias personaConsulta;
    EnumTipoLicencia licencia;
    private JComboBox<String> comboBox;

    /**
     * Creates new form DlgLicencia
     *
     * @param parent
     * @param modal
     */
    public DlgLicencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public DlgLicencia() {
        initComponents();
//        this.personaConsulta=new ConsultasLicencias();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSolicitante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        comboBoxVigencia = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        botonRegreso = new javax.swing.JButton();
        comboBoxTipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        fechaVencimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(235, 250, 239));

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));

        jPanel8.setBackground(new java.awt.Color(159, 224, 159));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel10.setText("DATOS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel10)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Solicitante:");

        txtSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolicitanteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Vigencia:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Discapacitado:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Importe:");

        comboBoxVigencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        comboBoxVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVigenciaActionPerformed(evt);
            }
        });
        comboBoxVigencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxVigenciaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboBoxVigenciaKeyReleased(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(153, 255, 102));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        botonRegreso.setBackground(new java.awt.Color(153, 255, 102));
        botonRegreso.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        botonRegreso.setText("Volver");
        botonRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresoActionPerformed(evt);
            }
        });

        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Si", "No" }));
        comboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de vencimiento :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("RFC:");

        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxVigencia, 0, 248, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSolicitante)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(fechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botonRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 168, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(fechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("LICENCIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel2)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresoActionPerformed

        control.desplegarMenu();
        dispose();// TODO add your handling code here:


    }//GEN-LAST:event_botonRegresoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String importeTexto = txtImporte.getText();
        if (comboBoxTipo.getItemAt(0).isEmpty() || comboBoxVigencia.getItemAt(0).isEmpty() || txtSolicitante.getText().isEmpty() || txtRFC.getText().isEmpty() || txtImporte.getText().isEmpty() || fechaVencimiento.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            String tipoSeleccionado = comboBoxTipo.getSelectedItem().toString();
            EnumTipoLicencia tipo;
            switch (tipoSeleccionado) {
                case "Si":
                    tipo = EnumTipoLicencia.DISCAPACITADOS;
                    break;
                case "No":
                    tipo = EnumTipoLicencia.NORMAL;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Tipo de licencia no válido", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
            
            String vigenciaSeleccionada = comboBoxVigencia.getSelectedItem().toString();
           
            EnumVigenciaLicencia vigencia;
            switch (vigenciaSeleccionada) {
                case "1":
                    vigencia = EnumVigenciaLicencia.UNO;
                    break;
                case "2":
                    vigencia = EnumVigenciaLicencia.DOS;
                    break;
                case "3":
                    vigencia = EnumVigenciaLicencia.TRES;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Vigencia no válida", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
            Float importe = Float.valueOf(importeTexto);

            LicenciasDAO licenciasDAO = new LicenciasDAO();
            Persona persona = licenciasDAO.BuscarPersonaPoRFC(txtRFC.getText());

            Licencia licencias = new Licencia(txtRFC.getText(), persona, tipo, vigencia, fechaVencimiento.getDate());

            licenciasDAO.RegistrarLicencia(licencias);
            JOptionPane.showMessageDialog(this, "Licencia agregada con éxito", "Confirmación", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolicitanteActionPerformed

    private void comboBoxVigenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxVigenciaKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_comboBoxVigenciaKeyReleased

    private void comboBoxVigenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxVigenciaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVigenciaKeyPressed

    private void comboBoxVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVigenciaActionPerformed
//         TODO add your handling code here:

        String opcionSeleccionada = comboBoxVigencia.getSelectedItem().toString();

        // Eliminar todos los caracteres que no son dígitos de la cadena
        opcionSeleccionada = opcionSeleccionada.replaceAll("\\D", "");

        int anio;

        try {
            // Convertir la cadena a un entero, se coloca el numero directamente en el parametro
            anio = Integer.parseInt(opcionSeleccionada);

            // El switch
            switch (opcionSeleccionada) {
                case "1":
                    anio = EnumVigenciaLicencia.UNO.compareTo(EnumVigenciaLicencia.UNO);
                    break;
                case "2":
                    anio = EnumVigenciaLicencia.DOS.compareTo(EnumVigenciaLicencia.DOS);
                    break;
                case "3":
                    anio = EnumVigenciaLicencia.TRES.compareTo(EnumVigenciaLicencia.TRES);
                    break;
                default:
                    System.out.println("Otro numero");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Opción inválida: ");
        }
        int importe;

        if (opcionSeleccionada.equalsIgnoreCase("1")) {
            importe = 600;
        } else if (opcionSeleccionada.equalsIgnoreCase("2")) {
            importe = 900;
        } else if (opcionSeleccionada.equalsIgnoreCase("3")) {
            importe = 1100;
        } else {
            return;
        }

        txtImporte.setText(String.valueOf(importe));

    }//GEN-LAST:event_comboBoxVigenciaActionPerformed

    private void comboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoActionPerformed

        String discapacidadSeleccionada = comboBoxTipo.getSelectedItem().toString();

        int importe;

        if (discapacidadSeleccionada.equals("Si")) {
            if (comboBoxVigencia.getSelectedItem().toString().equals("1")) {
                importe = 200;
            } else if (comboBoxVigencia.getSelectedItem().toString().equals("2")) {
                importe = 500;
            } else if (comboBoxVigencia.getSelectedItem().toString().equals("3")) {
                importe = 700;
            } else {

                throw new IllegalArgumentException("Vigencia inválida");
            }
        } else if (discapacidadSeleccionada.equals("No")) {
            if (comboBoxVigencia.getSelectedItem().toString().equals("1")) {
                importe = 600;
            } else if (comboBoxVigencia.getSelectedItem().toString().equals("2")) {
                importe = 900;
            } else if (comboBoxVigencia.getSelectedItem().toString().equals("3")) {
                importe = 1100;
            } else {

                throw new IllegalArgumentException("Vigencia inválida");
            }
        } else {
            return;
        }

        txtImporte.setText(String.valueOf(importe));

    }//GEN-LAST:event_comboBoxTipoActionPerformed

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed

//    public void calcularFecha(Date fecha){
//     if(comboBoxVigencia.getSelectedItem().toString().equals("1")) 
//     {
//     }
//     
//    }  
    public void mostrarNombreSolicitante(String nombreSolicitante) {
        txtSolicitante.setText(nombreSolicitante);
    }
    
    public void mostrarRFC(String rfc){
        txtRFC.setText(rfc);
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DlgLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DlgLicencia dialog = new DlgLicencia(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegreso;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JComboBox<String> comboBoxVigencia;
    private com.toedter.calendar.JDateChooser fechaVencimiento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSolicitante;
    // End of variables declaration//GEN-END:variables

    
}
