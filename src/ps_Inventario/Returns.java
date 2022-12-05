/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps_Inventario;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Antonio
 */
public class Returns extends javax.swing.JPanel {
    Lendings Inter;
    /**
     * Creates new form Principal
     */
    public Returns() {
        initComponents();
        Inter = new Lendings();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        articulo_id = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(850, 430));
        setPreferredSize(new java.awt.Dimension(890, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Devolución de Libro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Articulo ID");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Dni Usuario");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 10, 350));

        articulo_id.setForeground(new java.awt.Color(102, 102, 102));
        articulo_id.setText("Ingrese el ID del Articulo a devolver");
        articulo_id.setBorder(null);
        articulo_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                articulo_idMousePressed(evt);
            }
        });
        articulo_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articulo_idActionPerformed(evt);
            }
        });
        add(articulo_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, 30));

        dni.setForeground(new java.awt.Color(102, 102, 102));
        dni.setText("Ingrese el Dni del usuario");
        dni.setBorder(null);
        dni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dniMousePressed(evt);
            }
        });
        add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 30));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Devolver");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 50));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps_Inventario/images/iStock.jpg"))); // NOI18N
        Image.setMaximumSize(new java.awt.Dimension(750, 430));
        Image.setMinimumSize(new java.awt.Dimension(750, 430));
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void articulo_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articulo_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articulo_idActionPerformed

    private void dniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dniMousePressed
       if(dni.getText().equals("Ingrese el Dni del usuario"))
        dni.setText("");
       if(articulo_id.getText().equals("") || articulo_id.getText() == null || articulo_id.getText().equals(" "))
        articulo_id.setText("Ingrese el ID del Articulo a devolver");
    }//GEN-LAST:event_dniMousePressed

    private void articulo_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulo_idMousePressed
        if(articulo_id.getText().equals("Ingrese el ID del Articulo a devolver"))
            articulo_id.setText("");
        if(dni.getText().equals("") || dni.getText() == null || dni.getText().equals(" "))
            dni.setText("Ingrese el Dni del usuario");
    }//GEN-LAST:event_articulo_idMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    // DEVOLVER
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        String artic = articulo_id.getText();
        String dn = dni.getText();
        int intdn = 0;
        
        // Conditions
        if(dn.equals("") || artic.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe rellenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            articulo_id.requestFocus();
        }
        else{
            try
            {
                intdn = Integer.parseInt(dni.getText());
                
                if(intdn <= 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "El dni del usuario debe ser mayor a 0. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                     dni.requestFocus();
                }
                
                try {
                    // Verificamos el usuario
                    boolean pase = Inter.UserExist(intdn);
                    if(!pase){
                        javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún usuario con ese dni. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                         dni.requestFocus();
                    }
                    // Verificamos el libro
                    else if (!Inter.Articulo(artic))
                    {
                        javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún libro con esa ID. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        articulo_id.requestFocus();
                    }
                    else if(!Inter.CheckLending(intdn, artic)){
                        javax.swing.JOptionPane.showMessageDialog(this, "No se ha podido encontrar el préstamo correspiendote a los datos ingresados. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        articulo_id.requestFocus();
                    }
                    else{
                        // DEVOLVEMOS
                        Inter.Devolutions(intdn, artic);
                        dni.setText("");
                        articulo_id.setText("");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Returns.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(this, "El Dni del usuario debe ser un número entero. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 dni.requestFocus();
            }            
        }   
    }//GEN-LAST:event_buttonMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField articulo_id;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
