package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author capri
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
         setLocationRelativeTo(null);//Centra la ventana
         ProgressBarIniciado();//Llamada al cargar la barra de progresos
    }
           private void ProgressBarIniciado(){
            Timer mTimer = new Timer(60, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            pbCarga.setValue(pbCarga.getValue() + 1);
            pbCarga.setStringPainted(true);
           
            pbCarga.setString("Loading..." + pbCarga.getValue() + "%");

            // Detiene el temporizador cuando se llega al 100%
            if (pbCarga.getValue() >= 100) {
                pbCarga.setBackground(Color.GREEN);
                ((Timer)e.getSource()).stop();
               
                // Cierra la ventana de carga y abre la segunda ventana
                cerrarVentanaCarga();
                abrirNuevaVentana();
            }
        }
    });

            mTimer.start();
            
            
        }//Termina Metodo
        // Método para cerrar la ventana de carga
        private void cerrarVentanaCarga(){
              this.dispose(); // Cierra la ventana actual
            
        }
        
// Método para abrir una nueva ventana
        private void abrirNuevaVentana() {
        // Aquí debes colocar el código para abrir la nueva ventana
         // Por ejemplo:
        PanelPrincipal ventana = new PanelPrincipal();
    ventana.setVisible(true);
}
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pbCarga = new javax.swing.JProgressBar();
        lblMg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Bienvenido al Sistema De Gestion de Multas ");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        getContentPane().add(pbCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 440, 39));

        lblMg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Martinez, tamaño 650x450 pixeles (2).png"))); // NOI18N
        getContentPane().add(lblMg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblMg;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JProgressBar pbCarga;
    // End of variables declaration//GEN-END:variables
}
