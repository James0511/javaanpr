/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author EDULALO
 */
public class CrearVehiculo extends javax.swing.JFrame {
    /**
     * Creates new form auto
     */
    private int cod_registro;
    private ResultSet result;
    
    public CrearVehiculo() {
        initComponents();
    }

    public JTextField getCedulaUsuario() {
        return CedulaUsuario;
    }

    public void setCedulaUsuario(JTextField CedulaUsuario) {
        this.CedulaUsuario = CedulaUsuario;
    }
    //para hacer las consultas sql
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Guardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Placa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Color = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CedulaUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/save_38549.png"))); // NOI18N
        Guardar.setText("GUARDAR");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel9.setText("Placa: ");

        jLabel10.setText("Marca:");

        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        jLabel11.setText("Modelo:");

        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });

        jLabel8.setText("Color:");

        jLabel2.setText("Cedula:");

        CedulaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/auto-fondo.png"))); // NOI18N
        jLabel1.setText("Registro Veh�culo");
        jLabel1.setAutoscrolls(true);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setNextFocusableComponent(this);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/returnbackredoarrow_82934.png"))); // NOI18N
        Volver.setText("Atras");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9)
                                .addComponent(CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Guardar))
                            .addGap(19, 19, 19))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaActionPerformed

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeloActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolverActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        int bandera = 0;
        
        if (!Placa.getText().matches("([A-Z]{3,4}\\d{3,4})$")) {
                JOptionPane.showMessageDialog(null, "Placa Invalida");
                bandera = 1;
        }
        
        if (!Modelo.getText().matches("\\w{2,10}")) {
                JOptionPane.showMessageDialog(null, "Modelo Invalido");
                bandera = 1;
        }
        
        if (!Marca.getText().matches("[a-zA-Z ]*\\S$")) {
                JOptionPane.showMessageDialog(null, "Marca Invalida");
                bandera = 1;
        }
        
        if (!Color.getText().matches("[a-zA-Z ]*\\S$")) {
                JOptionPane.showMessageDialog(null, "Color Invalido");
                bandera = 1;
        }
        
        if (bandera == 0) {
            BuscarCodRSQL();
            CrearAutoSQL();
        }
        
    }//GEN-LAST:event_GuardarActionPerformed
    
    public void CrearAutoSQL(){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String contrasenia = "1234";
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String sql
                    = "INSERT INTO automoviles(placa, modelo, color, marca, cod_cliente ) VALUES ('"+Placa.getText()+"','"+Modelo.getText()+"','"+Color.getText()+"','"+Marca.getText()+"','"+cod_registro+"');";
            result = st.executeQuery(sql);
            result.close();
            st.close();
            conexion.close();
        }catch(Exception e){
            System.out.println("Error de Conexion "+ e.getMessage());
        } 
    }
    
    private void CedulaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaUsuarioActionPerformed
        
    }//GEN-LAST:event_CedulaUsuarioActionPerformed
    
    public void BuscarCodRSQL(){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String contrasenia = "1234";
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            String sql
                    = "SELECT * from cliente WHERE cedula_cliente = '"+CedulaUsuario.getText()+"';";
            result = st.executeQuery(sql);
            while (result.next()){
                cod_registro = result.getInt("cod_cliente");
            }
            result.close();
            st.close();
            conexion.close();
        }catch(Exception e){}
        System.out.println(cod_registro);
    }
    
    public void ConexionUsuario(String CedulaT){
        System.out.println(CedulaT);
        CedulaUsuario.setText(CedulaT);
        CedulaUsuario.setEnabled(false);
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
            java.util.logging.Logger.getLogger(CrearVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CedulaUsuario;
    private javax.swing.JTextField Color;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField Placa;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
