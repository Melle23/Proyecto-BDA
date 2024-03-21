package agenciafiscalpresentacion;

import Control.ControlPresentacion;
import daos.IPersonaDAO;
import daos.PersonasDAO;
import dtos.PersonasDTO;
import java.util.Date;

/**
 *
 * @author molin
 */
public class DlgRegistro extends javax.swing.JDialog {

    ControlPresentacion control = new ControlPresentacion();
    IPersonaDAO persona;
       
    
    /**
     * Creates new form DlgRegistro
     * @param parent
     * @param modal
     */
    public DlgRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        persona=new PersonasDAO();
        initComponents();

    }

    public DlgRegistro() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoRFC = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellidoP = new javax.swing.JTextField();
        campoApellidoM = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotonRegreso = new javax.swing.JButton();
        BotonRegistro = new javax.swing.JButton();
        BotonRegistro1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 250, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("RFC:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 24));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 24));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido paterno:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Apellido materno:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, 24));
        jPanel2.add(campoRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 219, -1));
        jPanel2.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 219, -1));
        jPanel2.add(campoApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 219, -1));
        jPanel2.add(campoApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 219, -1));
        jPanel2.add(campoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 219, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 610, 380));

        BotonRegreso.setBackground(new java.awt.Color(153, 255, 102));
        BotonRegreso.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BotonRegreso.setForeground(new java.awt.Color(153, 255, 102));
        jPanel1.add(BotonRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 47, -1));

        BotonRegistro.setBackground(new java.awt.Color(51, 153, 0));
        BotonRegistro.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BotonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistro.setText("Guardar y regresar");
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 250, 42));

        BotonRegistro1.setBackground(new java.awt.Color(51, 153, 0));
        BotonRegistro1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        BotonRegistro1.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistro1.setText("Guardar y solicitar licencia");
        BotonRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistro1ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        // TODO add your handling code here:
        control.desplegarMenu();
        dispose();
    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void BotonRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistro1ActionPerformed
        // TODO add your handling code here:
        personaAgregar=new PersonasDTO(campoRFC.getText(),campoNombre.getText(), campoApellidoM.getText(), campoApellidoP.getText(), campoTelefono.getText());
        persona.RegistrarPersona(persona);
        control.desplegarDlgLicencia();
        dispose();
    }//GEN-LAST:event_BotonRegistro1ActionPerformed

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
//            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DlgRegistro dialog = new DlgRegistro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JButton BotonRegistro1;
    private javax.swing.JButton BotonRegreso;
    private javax.swing.JTextField campoApellidoM;
    private javax.swing.JTextField campoApellidoP;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoRFC;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
