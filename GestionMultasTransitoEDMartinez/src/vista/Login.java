
package vista;
import conexion.ConectarBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.text.PasswordView;


import poo.Usuario;
/**
 *
 * @author capri
 */
public class Login extends javax.swing.JFrame {
ConectarBD con =  new ConectarBD();
   

    public static RegistarUsuario fr;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login Principal");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panePrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblMg = new javax.swing.JLabel();
        paneDatos = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panePrincipal.setBackground(new java.awt.Color(1, 5, 52));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 255, 0));
        lblTitulo.setText("Acceso Al Sistema");

        lblMg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/download (8).jpeg"))); // NOI18N

        paneDatos.setBackground(new java.awt.Color(146, 140, 140));
        paneDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Capturar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        paneDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        lblUserName.setText("Usuario");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));

        btnAcceder.setBackground(new java.awt.Color(51, 255, 51));
        btnAcceder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(0, 0, 0));
        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ingresar (1).png"))); // NOI18N
        btnAcceder.setText("Acceder al Sistema");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(51, 255, 51));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/github.png"))); // NOI18N
        btnRegistrar.setText("Registrar ");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneDatosLayout = new javax.swing.GroupLayout(paneDatos);
        paneDatos.setLayout(paneDatosLayout);
        paneDatosLayout.setHorizontalGroup(
            paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnAcceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(paneDatosLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword)
                    .addComponent(lblUserName))
                .addGap(31, 31, 31)
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneDatosLayout.setVerticalGroup(
            paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceder)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panePrincipalLayout = new javax.swing.GroupLayout(panePrincipal);
        panePrincipal.setLayout(panePrincipalLayout);
        panePrincipalLayout.setHorizontalGroup(
            panePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panePrincipalLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(paneDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(panePrincipalLayout.createSequentialGroup()
                .addGroup(panePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panePrincipalLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblMg))
                    .addGroup(panePrincipalLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panePrincipalLayout.setVerticalGroup(
            panePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblMg)
                .addGap(27, 27, 27)
                .addComponent(paneDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        fr = new RegistarUsuario();
        fr.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
         String userName = txtUserName.getText();
         String password = new String(txtPassword.getPassword()).trim();
        
         if(userName.isEmpty() || password.isEmpty()){
             JOptionPane.showMessageDialog(null, "No Puede Haber Espacios Vacios En Las Areas De Usuario Y Constraseña");
         }
         else {
             String consultaSQl ="SELECT TIPOUSUARIO FROM usuarios WHERE username = ' "+userName+ " ' AND password = ' " +password+ "  ' ";
             try {
                 con.conectarBDOracle();
                 PreparedStatement stmt = con.cn.prepareStatement(consultaSQl);
                 stmt.setString(1, userName);
                 stmt.setString(2, password);
                 con.rs = stmt.executeQuery();
             } catch (SQLException ex) {
             }
         }
         
         
         
       
               
         
    }//GEN-LAST:event_btnAccederActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblMg;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel paneDatos;
    private javax.swing.JPanel panePrincipal;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
