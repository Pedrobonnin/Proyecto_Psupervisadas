/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps_Inventario;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import static ps_Inventario.Dashboard.content;
import java.awt.BorderLayout;

/**
 *
 * @author Antonio
 */
public class Articulos extends javax.swing.JPanel {

    Connect conn;
    Connection reg;
    /**
     * Creates new form Principal
     */
    public Articulos() {
        initComponents();
        conn = new Connect();
        reg = conn.getConnection();
        try {
            GetArticulos();
        } catch (SQLException ex) {
            Logger.getLogger(Articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bid = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(238, 238, 238));
        setMinimumSize(new java.awt.Dimension(890, 430));
        setPreferredSize(new java.awt.Dimension(890, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevo.setBackground(new java.awt.Color(18, 90, 173));
        nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoMousePressed(evt);
            }
        });
        nuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        nuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 60, 20));

        add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 80, 30));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Elemento");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        bid.setBackground(new java.awt.Color(238, 238, 238));
        bid.setForeground(new java.awt.Color(102, 102, 102));
        bid.setText("Ingrese el ID del Elemento a buscar");
        bid.setBorder(null);
        bid.setSelectionColor(new java.awt.Color(248, 130, 41));
        bid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bidMousePressed(evt);
            }
        });
        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 60, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps_Inventario/images/Sin título-1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        button.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 5, 30, 20));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 90, 30));

        edit.setBackground(new java.awt.Color(5, 115, 0));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");
        edit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 60, 20));

        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 80, 30));

        delete.setBackground(new java.awt.Color(153, 9, 0));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Borrar");
        delete.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 60, 20));

        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 80, 30));

        jTable1.setBackground(new java.awt.Color(238, 238, 238));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Elemento", "Fecha", "Categoría", "Descripción", "Stock", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void bidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bidMousePressed
       if(bid.getText().equals("Ingrese el ID del Elemento a buscar"))
        bid.setText("");
    }//GEN-LAST:event_bidMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColorNuevo(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColorNuevo(button);
    }//GEN-LAST:event_buttonMouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // Abrir sección
        
        UpElementos p1 = new UpElementos();
        p1.setSize(890, 430);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jLabel3MousePressed

    private void nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseEntered
        setColorNuevo(nuevo);
    }//GEN-LAST:event_nuevoMouseEntered

    private void nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseExited
        resetColorNuevo(nuevo);
    }//GEN-LAST:event_nuevoMouseExited

    private void nuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMousePressed
        // Abrir sección
        UpUsers p1 = new UpUsers();
        p1.setSize(890, 430);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_nuevoMousePressed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        setColorEditar(edit);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        resetColorEditar(edit);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        setColorEliminar(delete);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        resetColorEliminar(delete);
    }//GEN-LAST:event_deleteMouseExited

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if(bid.getText().equals("") || bid.getText() == null || bid.getText().equals(" "))
            bid.setText("Ingrese el ID del Elemento a buscar");
    }//GEN-LAST:event_jTable1MousePressed
    // BORRAR
    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        try {
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el Elemento a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                Statement stm = reg.createStatement();
                ResultSet counter = stm.executeQuery("SELECT * FROM `articulos`");

                int count = 0;
                while(counter.next()){count++;}

                String list[][] = new String[count][12];
                int i = 0;
                ResultSet re = stm.executeQuery("SELECT * FROM `articulos`");
                while(re.next()){
                    list[i][0] = re.getString("id");
                    list[i][1] = re.getString("elemento");
                    list[i][2] = re.getString("date");
                    list[i][3] = re.getString("category");
                    list[i][4] = re.getString("description");
                    list[i][5] = re.getString("stock");
                    list[i][6] = re.getString("available");
                    i++;
                }
                String id = list[idcell][0];
                if(id == null || id.equals("")){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    Statement stm2=null;
                    try {
                    stm2 = reg.createStatement();
                    } catch (SQLException ex) {
                    Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                    stm2.executeUpdate("DELETE FROM `articulos` WHERE `id` = '"+id+"'");
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Elemento borrado! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    GetArticulos();
                    } catch (SQLException ex) {
                    Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteMousePressed

    // EDITAR
    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        try {
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el articulo a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                
                Statement stm = reg.createStatement();
                ResultSet counter = stm.executeQuery("SELECT * FROM `articulos`");

                int count = 0;
                while(counter.next()){count++;}

                String list[][] = new String[count][12];
                int i = 0;
                ResultSet re = stm.executeQuery("SELECT * FROM `articulos`");
                while(re.next()){
                    list[i][0] = re.getString("id");
                    list[i][1] = re.getString("elemento");
                    list[i][2] = re.getString("date");   
                    list[i][3] = re.getString("category");
                    list[i][4] = re.getString("description");
                    list[i][5] = re.getString("stock");
                    list[i][6] = re.getString("available");
                    i++;
                }
                String id = list[idcell][0];
                if(id == null || id.equals("")){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el articulo a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    String bid = ""+list[idcell][0];
                    String belemento = list[idcell][1];
                    String bdate = list[idcell][2];
                    String bcategory = list[idcell][3];
                    String bdesc = list[idcell][4];
                    String bstock = list[idcell][5];
                    String bavai = list[idcell][6];            

                    UpElementos p1 = new UpElementos(bid, belemento, bdate, bcategory, bdesc, bstock, bavai);
                    p1.setSize(890, 430);
                    p1.setLocation(5, 5);

                    content.removeAll();
                    content.add(p1, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editMousePressed
    // BUSCAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        try {
            String inf = bid.getText();
            Statement stm = reg.createStatement();
            ResultSet counter = stm.executeQuery("SELECT * FROM `articulos` WHERE id LIKE '"+inf+"%'");
            
            int count = 0;
            while(counter.next()){count++;}
            
            String list[][] = new String[count][12];
            int i = 0;
            ResultSet re = stm.executeQuery("SELECT * FROM `articulos` WHERE id LIKE '"+inf+"%'");
            while(re.next()){
            list[i][0] = re.getString("id");
            list[i][1] = re.getString("elemento");
            list[i][2] = re.getString("date");
            list[i][3] = re.getString("category");
            list[i][4] = re.getString("description");
            list[i][5] = re.getString("stock");
            list[i][6] = re.getString("available");
            i++;
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Elemento","Fecha de Pub.", "Categoría", "Descripción", "Stock", "Disponibles"
        }));
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonMousePressed

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        setColorNuevo(nuevo);
    }//GEN-LAST:event_jLabel3MouseEntered

     private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {                                     
        resetColorNuevo(nuevo);
    }    
     
    void setColorEliminar(JPanel panel){
        panel.setBackground(new Color(191, 11, 0));
    }
    void resetColorEliminar(JPanel panel){
        panel.setBackground(new Color(153, 9, 0));
    }
    
    void setColorEditar(JPanel panel){
        panel.setBackground(new Color(6, 153, 0));
    }
    void resetColorEditar(JPanel panel){
        panel.setBackground(new Color(5, 115, 0));
    }
    
     void setColorNuevo(JPanel panel){
        panel.setBackground(new Color(21, 109, 211));
    }
    void resetColorNuevo(JPanel panel){
        panel.setBackground(new Color(18, 90, 173));
    }
    
    private void GetArticulos() throws SQLException{
        Statement stm = reg.createStatement();
        ResultSet counter = stm.executeQuery("SELECT * FROM `articulos`");
        
        int count = 0;
        while(counter.next()){count++;}
        
        String list[][] = new String[count][12];
        int i = 0;
        ResultSet re = stm.executeQuery("SELECT * FROM `articulos`");
        while(re.next()){
            list[i][0] = re.getString("id");
            list[i][1] = re.getString("elemento");
            list[i][2] = re.getString("date");
            list[i][3] = re.getString("category");
            list[i][4] = re.getString("description");
            list[i][5] = re.getString("stock");
            list[i][6] = re.getString("available");
            i++;
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Elemento", "Fecha de Pub.","Categoría", "Descripción", "Stock", "Disponibles"
        }));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField bid;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel nuevo;
    // End of variables declaration//GEN-END:variables
}
