
package vista;
import poo.Multa;
import conexion.ConectarBD;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author capri
 */
public class Administrador extends javax.swing.JFrame {
   ConectarBD con = new ConectarBD();
    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
           setLocationRelativeTo(null);//Centra la ventana
           setTitle("Sistema Administrador");
           consultarDatos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableMultas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegistarConductor = new javax.swing.JButton();
        btnRegistarVehiculo = new javax.swing.JButton();
        btnEditar_Eliminar = new javax.swing.JButton();
        btnEditar_Eliminar_Vehiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 5, 52));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema Administrador ");

        btnVolver.setBackground(new java.awt.Color(102, 255, 102));
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github.png"))); // NOI18N
        btnVolver.setText("Volver a menu ");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(102, 255, 102));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github.png"))); // NOI18N
        btnSalir.setText("Salir ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        JTableMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matricula", "Descripcion", "Costo"
            }
        ));
        jScrollPane1.setViewportView(JTableMultas);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/placa-de-policia (2).png"))); // NOI18N

        btnRegistarConductor.setBackground(new java.awt.Color(102, 255, 102));
        btnRegistarConductor.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistarConductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github.png"))); // NOI18N
        btnRegistarConductor.setText("Registar Conductor");
        btnRegistarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarConductorActionPerformed(evt);
            }
        });

        btnRegistarVehiculo.setBackground(new java.awt.Color(102, 255, 102));
        btnRegistarVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github.png"))); // NOI18N
        btnRegistarVehiculo.setText("Registar Vehiculo");
        btnRegistarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarVehiculoActionPerformed(evt);
            }
        });

        btnEditar_Eliminar.setBackground(new java.awt.Color(102, 255, 102));
        btnEditar_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github.png"))); // NOI18N
        btnEditar_Eliminar.setText("Editar o Eliminar Conductor");
        btnEditar_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar_EliminarActionPerformed(evt);
            }
        });

        btnEditar_Eliminar_Vehiculo.setBackground(new java.awt.Color(102, 255, 102));
        btnEditar_Eliminar_Vehiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar_Eliminar_Vehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github.png"))); // NOI18N
        btnEditar_Eliminar_Vehiculo.setText("Editar o Eliminar Vehiculo");
        btnEditar_Eliminar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar_Eliminar_VehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEditar_Eliminar_Vehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistarConductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistarConductor)
                        .addGap(30, 30, 30)
                        .addComponent(btnRegistarVehiculo)
                        .addGap(29, 29, 29)
                        .addComponent(btnEditar_Eliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnSalir)
                    .addComponent(btnEditar_Eliminar_Vehiculo))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      System.exit(1);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarConductorActionPerformed
        
          RegistroConductor conductor = new RegistroConductor();
           conductor.setVisible(true);
           this.hide();//Oculta Ventana Anterior
    }//GEN-LAST:event_btnRegistarConductorActionPerformed

    private void btnRegistarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarVehiculoActionPerformed
        RegistroVehiculo vehiculo = new RegistroVehiculo();
        vehiculo.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegistarVehiculoActionPerformed

    private void btnEditar_Eliminar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar_Eliminar_VehiculoActionPerformed
        ModificarVehiuculo vehiuclo = new ModificarVehiuculo();
        vehiuclo.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnEditar_Eliminar_VehiculoActionPerformed

    private void btnEditar_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar_EliminarActionPerformed
        ModificarConductor conductot = new ModificarConductor();
        conductot.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnEditar_EliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PanelPrincipal pane = new PanelPrincipal();
        pane.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnVolverActionPerformed
 public void consultarDatos(){
      try {
            con.conectarBDOracle();
            DefaultTableModel modeloMulta = new DefaultTableModel();
            this.JTableMultas.setModel(modeloMulta);
            con.rs = con.stmt.executeQuery("SELECT v.PLACA, m.Motivo, m.Monto_Total FROM MULTA m JOIN Vehiculo v ON m.ID_Vehiculo = v.id_vehiculo");
            ResultSetMetaData rsmd = con.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloMulta.addColumn("PLACA");
            modeloMulta.addColumn("Motivo");
            modeloMulta.addColumn("Monto");
            while(con.rs.next()){
                  Object []fila = new Object[cantidadColumnas];
                  for (int i = 0; i < cantidadColumnas; i++) {//Inicia For
                      fila[i] = con.rs.getObject(i+1);
                  }//Termina for
                  
                  modeloMulta.addRow(fila);
              }
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error 2. de BD Consulta\n"+ex);
        }
       
     
     
 }
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableMultas;
    private javax.swing.JButton btnEditar_Eliminar;
    private javax.swing.JButton btnEditar_Eliminar_Vehiculo;
    private javax.swing.JButton btnRegistarConductor;
    private javax.swing.JButton btnRegistarVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
