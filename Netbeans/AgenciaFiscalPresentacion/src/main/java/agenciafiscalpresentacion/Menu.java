package agenciafiscalpresentacion;

import Control.ControlPresentacion;
import javax.swing.JOptionPane;

/**
 *
 * @author molin
 */
public class Menu extends javax.swing.JFrame {

    ControlPresentacion control = new ControlPresentacion();

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        BotonRegistro = new javax.swing.JButton();
        BotonLicencias = new javax.swing.JButton();
        BotonPlacas = new javax.swing.JButton();
        BotonConsultas = new javax.swing.JButton();
        BotonReportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENÚ");

        jPanel1.setBackground(new java.awt.Color(230, 243, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegistro.setOpaque(false);
        BotonRegistro.setContentAreaFilled(false);
        BotonRegistro.setBorderPainted(false);
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 180, 50));

        BotonLicencias.setOpaque(false);
        BotonLicencias.setContentAreaFilled(false);
        BotonLicencias.setBorderPainted(false);
        BotonLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLicenciasActionPerformed(evt);
            }
        });
        jPanel1.add(BotonLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 180, 50));

        BotonPlacas.setOpaque(false);
        BotonPlacas.setContentAreaFilled(false);
        BotonPlacas.setBorderPainted(false);
        BotonPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPlacasActionPerformed(evt);
            }
        });
        jPanel1.add(BotonPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 180, 50));

        BotonConsultas.setOpaque(false);
        BotonConsultas.setContentAreaFilled(false);
        BotonConsultas.setBorderPainted(false);
        BotonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(BotonConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 180, 50));

        BotonReportes.setOpaque(false);
        BotonReportes.setContentAreaFilled(false);
        BotonReportes.setBorderPainted(false);
        BotonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReportesActionPerformed(evt);
            }
        });
        jPanel1.add(BotonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\favel\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto-BDA\\Netbeans\\AgenciaFiscalPresentacion\\src\\main\\java\\Imagenes\\Pantalla_Principal.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        // TODO add your handling code here:
        control.desplegarRegistro();
        dispose();
    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void BotonPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPlacasActionPerformed

        String[] botones = {"Renovar Placas", "Registrar Placas"};

        int variable = JOptionPane.showOptionDialog(null, "Tramite", "Placas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null/*icono*/, botones, botones[0]);

        if(variable == 0){
            control.desplegarDlgPlacasUsadas();
            dispose();
        }else{
            control.desplegarDlgPlacasNuevas();
            dispose();
        }
                
        System.out.println(variable);

    }//GEN-LAST:event_BotonPlacasActionPerformed

    private void BotonLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLicenciasActionPerformed
        // TODO add your handling code here:
        control.desplegarDlgLicencia();
        dispose();

    }//GEN-LAST:event_BotonLicenciasActionPerformed

    private void BotonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReportesActionPerformed
        // TODO add your handling code here:
        control.desplegarDlgReporte();
        dispose();
    }//GEN-LAST:event_BotonReportesActionPerformed

    private void BotonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultasActionPerformed
        // TODO add your handling code here:
        control.desplegarDlgConsultas();
        dispose();
    }//GEN-LAST:event_BotonConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultas;
    private javax.swing.JButton BotonLicencias;
    private javax.swing.JButton BotonPlacas;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JButton BotonReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
