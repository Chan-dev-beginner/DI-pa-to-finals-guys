
package LIBRARY;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import LIBRARY.dataBase;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AddBook extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddBook.class.getName());
    
    private void loadBooksToTable() {
    try {
        Connection con = dataBase.getConnection();
        String sql = "SELECT * FROM books";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) Jtable_ShowDisplay.getModel();
        model.setRowCount(0); // clear table first

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("Book_Code"),
                rs.getString("Title"),
                rs.getString("Author"),
                rs.getString("Genre"),
                rs.getInt("Availability")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }
    /**
     * Creates new form BookCatalog
     */
    public AddBook() {
        initComponents();
        loadBooksToTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InsertBttn = new javax.swing.JButton();
        UpdateBttn = new javax.swing.JButton();
        DeleteBttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtable_ShowDisplay = new javax.swing.JTable();
        buttonback = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFauthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFbookTitle = new javax.swing.JTextField();
        TFbookCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFbookGenre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFcopiesAvailable = new javax.swing.JTextField();
        ShowAllBttn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("ADD BOOK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(373, 373, 373))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        InsertBttn.setBackground(new java.awt.Color(51, 0, 0));
        InsertBttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InsertBttn.setForeground(new java.awt.Color(255, 255, 255));
        InsertBttn.setText("+ INSERT");
        InsertBttn.addActionListener(this::InsertBttnActionPerformed);

        UpdateBttn.setBackground(new java.awt.Color(51, 0, 0));
        UpdateBttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateBttn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBttn.setText("UPDATE");
        UpdateBttn.addActionListener(this::UpdateBttnActionPerformed);

        DeleteBttn.setBackground(new java.awt.Color(51, 0, 0));
        DeleteBttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBttn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBttn.setText("DELETE");
        DeleteBttn.addActionListener(this::DeleteBttnActionPerformed);

        Jtable_ShowDisplay.setForeground(new java.awt.Color(51, 0, 0));
        Jtable_ShowDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BookCode", "BookTitle", "Author", "BookGenre", "NumberOfCopies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Jtable_ShowDisplay.setSelectionBackground(new java.awt.Color(153, 153, 153));
        Jtable_ShowDisplay.setSelectionForeground(new java.awt.Color(51, 0, 0));
        Jtable_ShowDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_ShowDisplayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Jtable_ShowDisplay);

        buttonback.setBackground(new java.awt.Color(51, 0, 0));
        buttonback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonback.setForeground(new java.awt.Color(255, 255, 255));
        buttonback.setText("BACK");
        buttonback.addActionListener(this::buttonbackActionPerformed);

        jPanel4.setBackground(new java.awt.Color(51, 0, 0));
        jPanel4.setForeground(new java.awt.Color(51, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOK CODE:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BOOK TITLE:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AUTHOR:");

        TFbookCode.addActionListener(this::TFbookCodeActionPerformed);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BOOK GENRE:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NUMBER OF COPIES:");

        TFcopiesAvailable.addActionListener(this::TFcopiesAvailableActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFauthor)
                    .addComponent(TFbookCode)
                    .addComponent(TFbookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TFbookGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(TFcopiesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TFbookGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TFcopiesAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFbookCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFbookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        ShowAllBttn.setBackground(new java.awt.Color(51, 0, 0));
        ShowAllBttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowAllBttn.setForeground(new java.awt.Color(255, 255, 255));
        ShowAllBttn.setText("REFRESH");
        ShowAllBttn.addActionListener(this::ShowAllBttnActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonback))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(InsertBttn)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateBttn)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                                .addComponent(ShowAllBttn)))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBttn)
                    .addComponent(DeleteBttn)
                    .addComponent(InsertBttn)
                    .addComponent(ShowAllBttn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InsertBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBttnActionPerformed
        // TODO add your handling code here:
        String Book_Code = TFbookCode.getText();
        String Title = TFbookTitle.getText();
        String Author = TFauthor.getText();
        String Genre = TFbookGenre.getText();
        String Availability = TFcopiesAvailable.getText();
        
        try {
            Connection con = dataBase.getConnection();
            Statement st=con.createStatement();
            st.executeUpdate("INSERT INTO books VALUES ('"+Book_Code+"','"+Title+"','"+Author+"','"+Genre+"','"+Availability+"')");
            JOptionPane.showMessageDialog(null, "Successfully Update");
            setVisible(false);
            new AddBook().setVisible(true);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Book Code already exist");
            setVisible(false);
            new AddBook().setVisible(true);
        }
             
    }//GEN-LAST:event_InsertBttnActionPerformed

    private void TFcopiesAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcopiesAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcopiesAvailableActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        // TODO add your handling code here:
        AdminMain m = new AdminMain();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonbackActionPerformed

    private void TFbookCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFbookCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFbookCodeActionPerformed

    private void ShowAllBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllBttnActionPerformed
        // TODO add your handling code here:
        loadBooksToTable();
        
        
    }//GEN-LAST:event_ShowAllBttnActionPerformed

    private void UpdateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBttnActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE books SET Title=?,Author=?,Genre=?,Availability=? WHERE Book_Code=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lbs_jdbc","root","");
            pst = con.prepareStatement(sql);
            pst.setString(5, TFbookCode.getText());
            pst.setString(1, TFbookTitle.getText());
            pst.setString(2, TFauthor.getText());
            pst.setString(3, TFbookGenre.getText());
            pst.setString(4, TFcopiesAvailable.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successfully");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdateBttnActionPerformed

    private void DeleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBttnActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM books WHERE Book_Code=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lbs_jdbc","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1, TFbookCode.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, " Delete Successfully");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteBttnActionPerformed

    private void Jtable_ShowDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_ShowDisplayMouseClicked
        // TODO add your handling code here:
        int i = Jtable_ShowDisplay.getSelectedRow();
        TableModel model =Jtable_ShowDisplay.getModel();
        TFbookCode.setText(model.getValueAt(i,0).toString());
        TFbookTitle.setText(model.getValueAt(i,1).toString());
        TFauthor.setText(model.getValueAt(i,2).toString());
        TFbookGenre.setText(model.getValueAt(i,3).toString());
        TFcopiesAvailable.setText(model.getValueAt(i,4).toString());
        
        
    }//GEN-LAST:event_Jtable_ShowDisplayMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AddBook().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBttn;
    private javax.swing.JButton InsertBttn;
    private javax.swing.JTable Jtable_ShowDisplay;
    private javax.swing.JButton ShowAllBttn;
    private javax.swing.JTextField TFauthor;
    private javax.swing.JTextField TFbookCode;
    private javax.swing.JTextField TFbookGenre;
    private javax.swing.JTextField TFbookTitle;
    private javax.swing.JTextField TFcopiesAvailable;
    private javax.swing.JButton UpdateBttn;
    private javax.swing.JButton buttonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

