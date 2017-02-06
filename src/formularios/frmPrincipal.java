/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author marco
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivos = new javax.swing.JMenu();
        mnuArchivosClientes = new javax.swing.JMenuItem();
        mnuArchivosUsuarios = new javax.swing.JMenuItem();
        mnuArchivosProductos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArchivosCambioUsuario = new javax.swing.JMenuItem();
        mnuCambioClave = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArchivosSalir = new javax.swing.JMenuItem();
        mnuMovimientos = new javax.swing.JMenu();
        mnuMovimientosNuevaFactura = new javax.swing.JMenuItem();
        mnuMovimientosReporteFactura = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaAcercaDe = new javax.swing.JMenuItem();
        mnuAyuda2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturacion");

        dpnEscritorio.setBackground(new java.awt.Color(181, 176, 176));

        mnuArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/archivo.png"))); // NOI18N
        mnuArchivos.setText("Archivos");

        mnuArchivosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        mnuArchivosClientes.setText("Clientes");
        mnuArchivos.add(mnuArchivosClientes);

        mnuArchivosUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuarios.png"))); // NOI18N
        mnuArchivosUsuarios.setText("Usuarios");
        mnuArchivosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivosUsuariosActionPerformed(evt);
            }
        });
        mnuArchivos.add(mnuArchivosUsuarios);

        mnuArchivosProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos.png"))); // NOI18N
        mnuArchivosProductos.setText("Productos");
        mnuArchivosProductos.setToolTipText("");
        mnuArchivos.add(mnuArchivosProductos);
        mnuArchivos.add(jSeparator1);

        mnuArchivosCambioUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cambioUsuario.png"))); // NOI18N
        mnuArchivosCambioUsuario.setText("Cambio de Usuario");
        mnuArchivos.add(mnuArchivosCambioUsuario);

        mnuCambioClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cambioClave.png"))); // NOI18N
        mnuCambioClave.setText("Cambio de Clave");
        mnuArchivos.add(mnuCambioClave);
        mnuArchivos.add(jSeparator2);

        mnuArchivosSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuArchivosSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        mnuArchivosSalir.setText("Salir");
        mnuArchivosSalir.setHideActionText(true);
        mnuArchivosSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivosSalirActionPerformed(evt);
            }
        });
        mnuArchivos.add(mnuArchivosSalir);

        jMenuBar1.add(mnuArchivos);

        mnuMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/movimientos.png"))); // NOI18N
        mnuMovimientos.setText("Movimientos");

        mnuMovimientosNuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factura.png"))); // NOI18N
        mnuMovimientosNuevaFactura.setText("Nueva Factura");
        mnuMovimientos.add(mnuMovimientosNuevaFactura);

        mnuMovimientosReporteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reporte.png"))); // NOI18N
        mnuMovimientosReporteFactura.setText("Reporte Factura");
        mnuMovimientos.add(mnuMovimientosReporteFactura);

        jMenuBar1.add(mnuMovimientos);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mnuAyudaAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acercaDe.png"))); // NOI18N
        mnuAyudaAcercaDe.setText("Acerca de");
        mnuAyuda.add(mnuAyudaAcercaDe);

        mnuAyuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ayuda2.png"))); // NOI18N
        mnuAyuda2.setText("ayuda");
        mnuAyuda.add(mnuAyuda2);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivosUsuariosActionPerformed
        frmUsuarios misUsuarios= new frmUsuarios();
       dpnEscritorio.add(misUsuarios);
       
       misUsuarios.show();
    }//GEN-LAST:event_mnuArchivosUsuariosActionPerformed

    private void mnuArchivosSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivosSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuArchivosSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuArchivos;
    private javax.swing.JMenuItem mnuArchivosCambioUsuario;
    private javax.swing.JMenuItem mnuArchivosClientes;
    private javax.swing.JMenuItem mnuArchivosProductos;
    private javax.swing.JMenuItem mnuArchivosSalir;
    private javax.swing.JMenuItem mnuArchivosUsuarios;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuAyuda2;
    private javax.swing.JMenuItem mnuAyudaAcercaDe;
    private javax.swing.JMenuItem mnuCambioClave;
    private javax.swing.JMenu mnuMovimientos;
    private javax.swing.JMenuItem mnuMovimientosNuevaFactura;
    private javax.swing.JMenuItem mnuMovimientosReporteFactura;
    // End of variables declaration//GEN-END:variables
}