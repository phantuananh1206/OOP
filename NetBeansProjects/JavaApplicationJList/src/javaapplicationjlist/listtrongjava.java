
package javaapplicationjlist;

import javax.swing.DefaultListModel;
import javax.swing.JList;


public class listtrongjava extends javax.swing.JFrame {

    
    public listtrongjava() {
        initComponents();
        setLocationRelativeTo(null);
        Khoitaodanhsachtrong();
    }
    private DefaultListModel<String> list1,list2;
    private void Khoitaodanhsachtrong(){
        list1 = new DefaultListModel<String>();
        danhsach1.setModel(list1);
        list2 = new DefaultListModel<String>();
        danhsach2.setModel(list2);
    }
    private void moveselected(JList a,DefaultListModel Ea,JList b,DefaultListModel Eb){
        int Selectedindex = -1;
        while((Selectedindex = a.getSelectedIndex()) != -1){
            Eb.addElement(Ea.getElementAt(Selectedindex));
            Ea.removeElementAt(Selectedindex);
        }
    }
    private void moveall(JList a,DefaultListModel Ea,JList b,DefaultListModel Eb){
        for(int i =0;i<Ea.getSize();i++){
            Eb.addElement(Ea.getElementAt(i));
        }
        Ea.removeAllElements();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldadd = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btndeleted = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        danhsach1 = new javax.swing.JList<>();
        btnmoveright = new javax.swing.JButton();
        btnmoverightall = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        danhsach2 = new javax.swing.JList<>();
        btnmoveleftall = new javax.swing.JButton();
        btnmoveleft = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toi test Jlist");

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndeleted.setText("Deleted");
        btndeleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletedActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        danhsach1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        danhsach1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                danhsach1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                danhsach1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(danhsach1);

        btnmoveright.setText(">");
        btnmoveright.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                btnmoverightAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnmoveright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverightActionPerformed(evt);
            }
        });

        btnmoverightall.setText(">>");
        btnmoverightall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoverightallActionPerformed(evt);
            }
        });

        danhsach2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(danhsach2);

        btnmoveleftall.setText("<<");
        btnmoveleftall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveleftallActionPerformed(evt);
            }
        });

        btnmoveleft.setText("<");
        btnmoveleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveleftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmoveright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmoverightall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmoveleftall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmoveleft, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnmoveright)
                .addGap(18, 18, 18)
                .addComponent(btnmoverightall)
                .addGap(18, 18, 18)
                .addComponent(btnmoveleftall)
                .addGap(18, 18, 18)
                .addComponent(btnmoveleft)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jTextFieldadd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btndeleted, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btndeleted)
                    .addComponent(jTextFieldadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void danhsach1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_danhsach1AncestorMoved
      
    }//GEN-LAST:event_danhsach1AncestorMoved

    private void danhsach1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_danhsach1AncestorAdded
       
    }//GEN-LAST:event_danhsach1AncestorAdded

    private void btnmoverightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverightActionPerformed
        moveselected(danhsach1, list1, danhsach2, list2);
    }//GEN-LAST:event_btnmoverightActionPerformed

    private void btnmoverightAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnmoverightAncestorMoved
      
    }//GEN-LAST:event_btnmoverightAncestorMoved

    private void btnmoverightallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoverightallActionPerformed
        moveall(danhsach1, list1, danhsach2, list2);
    }//GEN-LAST:event_btnmoverightallActionPerformed

    private void btnmoveleftallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveleftallActionPerformed
        moveall(danhsach2, list2, danhsach1, list1);
    }//GEN-LAST:event_btnmoveleftallActionPerformed

    private void btnmoveleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveleftActionPerformed
        moveselected(danhsach2, list2, danhsach1, list1);
    }//GEN-LAST:event_btnmoveleftActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        additem1vaolist1(danhsach1, list1);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletedActionPerformed
        xoa1itemkhichonL(danhsach1, list1);
        xoa1itemkhichonR(danhsach2, list2);
    }//GEN-LAST:event_btndeletedActionPerformed
    private void xoa1itemkhichonL(JList a,DefaultListModel Ea){
        int Selectedindexa = -1;
        while((Selectedindexa = a.getSelectedIndex()) != -1 ){
            Ea.removeElementAt(Selectedindexa);
           
        }
    }
    private void xoa1itemkhichonR(JList b,DefaultListModel Eb){
        int Selectedindexa = -1;
        while((Selectedindexa = b.getSelectedIndex()) != -1 ){
            Eb.removeElementAt(Selectedindexa);
           
        }
    }
    
    
    private void additem1vaolist1(JList list1,DefaultListModel Ea){
        String Elementaddstring;
        Elementaddstring = jTextFieldadd.getText();
        if(Elementaddstring.equals("")){
        }else{
             Ea.addElement(jTextFieldadd.getText());
        }
        jTextFieldadd.setText("");
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
            java.util.logging.Logger.getLogger(listtrongjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listtrongjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listtrongjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listtrongjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listtrongjava().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndeleted;
    private javax.swing.JButton btnmoveleft;
    private javax.swing.JButton btnmoveleftall;
    private javax.swing.JButton btnmoveright;
    private javax.swing.JButton btnmoverightall;
    private javax.swing.JList<String> danhsach1;
    private javax.swing.JList<String> danhsach2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldadd;
    // End of variables declaration//GEN-END:variables
}
