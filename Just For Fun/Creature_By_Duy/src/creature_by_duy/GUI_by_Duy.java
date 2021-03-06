/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creature_by_duy;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class GUI_by_Duy extends javax.swing.JFrame {
    private DefaultTableModel dtmcreature;
    private CreatureList list;
    private int selectedIndex =-1;
    /**
     * Creates new form GUI_by_Duy
     */
    public GUI_by_Duy() {
        initComponents();
        myInits();
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
        jLabel1 = new javax.swing.JLabel();
        cboCrtype = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboSexType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboYthucType = new javax.swing.JComboBox<>();
        cboLoiSongtype = new javax.swing.JComboBox<>();
        txtTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSoChan = new javax.swing.JTextField();
        txtTapTinh = new javax.swing.JTextField();
        cboHanhDong = new javax.swing.JComboBox<>();
        jToggleButtonADD = new javax.swing.JToggleButton();
        jToggleButtonREMOVE = new javax.swing.JToggleButton();
        jToggleButtonSEARCH = new javax.swing.JToggleButton();
        jToggleButtonGETALL = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCreatures = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Creature Type");

        cboCrtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Human", "Animal" }));
        cboCrtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCrtypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên");

        jLabel3.setText("Ngày Sinh");

        jLabel4.setText("Giới Tính");

        cboSexType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đực", "Cái" }));

        jLabel5.setText("Ý Thức");

        jLabel6.setText("Hành Động");

        jLabel7.setText("Số Chân");

        jLabel8.setText("Tập Tính");

        jLabel9.setText("Lối Sống");

        cboYthucType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Có Ý Thức", "Vô Ý Thức" }));

        cboLoiSongtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đơn Độc", "Bầy Đàn" }));

        cboHanhDong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "War", "Farm", "Giao Phối :V" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(cboCrtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboSexType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboLoiSongtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboYthucType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTapTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoChan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboHanhDong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(81, 81, 81)))))
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboCrtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(cboYthucType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboHanhDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboSexType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSoChan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTapTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboLoiSongtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButtonADD.setText("ADD");
        jToggleButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonADDActionPerformed(evt);
            }
        });

        jToggleButtonREMOVE.setText("REMOVE");

        jToggleButtonSEARCH.setText("SEARCH");

        jToggleButtonGETALL.setText("GET ALL LIST");

        tblCreatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Name", "Date of Birth", "SEX", "Ý Thức", "Action", "Số Chân", "Tập Tính", "Lối Sống", "Age count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCreatures);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jToggleButtonADD)
                        .addGap(99, 99, 99)
                        .addComponent(jToggleButtonREMOVE)
                        .addGap(91, 91, 91)
                        .addComponent(jToggleButtonSEARCH)
                        .addGap(98, 98, 98)
                        .addComponent(jToggleButtonGETALL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonADD)
                    .addComponent(jToggleButtonREMOVE)
                    .addComponent(jToggleButtonSEARCH)
                    .addComponent(jToggleButtonGETALL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCrtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCrtypeActionPerformed
        lock(cboCrtype.getSelectedIndex());
    }//GEN-LAST:event_cboCrtypeActionPerformed

    private void jToggleButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonADDActionPerformed
        if (cboCrtype.getSelectedIndex()==0) {
            list.add(new Human(cboYthucType.getSelectedItem().toString(),
                    cboHanhDong.getSelectedItem().toString(),
                    txtTen.getText().trim(),
                    StringToDate(txtNgaySinh.getText().trim()),
                    cboSexType.getSelectedItem().toString()));
            napData();
            Clear();
        } else {
            list.add(new Animal(Integer.parseInt(txtSoChan.getText().trim()),
                    txtTapTinh.getText().trim(),
                    cboLoiSongtype.getSelectedItem().toString(),
                    txtTen.getText().trim(),
                    StringToDate(txtNgaySinh.getText().trim()),
                    cboSexType.getSelectedItem().toString()));
            napData();
            Clear();
        }
    }//GEN-LAST:event_jToggleButtonADDActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_by_Duy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_by_Duy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_by_Duy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_by_Duy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_by_Duy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCrtype;
    private javax.swing.JComboBox<String> cboHanhDong;
    private javax.swing.JComboBox<String> cboLoiSongtype;
    private javax.swing.JComboBox<String> cboSexType;
    private javax.swing.JComboBox<String> cboYthucType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButtonADD;
    private javax.swing.JToggleButton jToggleButtonGETALL;
    private javax.swing.JToggleButton jToggleButtonREMOVE;
    private javax.swing.JToggleButton jToggleButtonSEARCH;
    private javax.swing.JTable tblCreatures;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoChan;
    private javax.swing.JTextField txtTapTinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void myInits() {
        setTitle("Ahihihi");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        dtmcreature = (DefaultTableModel) tblCreatures.getModel();
        tblCreatures.setModel(dtmcreature);
        list = new CreatureList();
        lock(0);
    }

    private void lock(int crtype) {
        boolean ok =true;
        if(crtype ==0){
            ok = false;
        }
        cboYthucType.setEnabled(!ok);
        cboHanhDong.setEnabled(!ok);
        txtSoChan.setEnabled(ok);
        txtTapTinh.setEnabled(ok);
        cboLoiSongtype.setEnabled(ok);
    }

    private Date StringToDate(String nS) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private String DateToString(Date date){
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    private void napData() {
        xoaData();
        int stt =0;
        for (Creature cr : list.getAll()) {
            themMotDong(++stt, cr);
        }
    }

    private void Clear() {
        txtTen.setText("");
        txtNgaySinh.setText("");
        txtSoChan.setText("");
        txtTapTinh.setText("");
    }

    private void xoaData() {
        while(dtmcreature.getRowCount()>0){
            dtmcreature.removeRow(0);
        }
    }

    private void themMotDong(int stt, Creature cr) {
        if (cr instanceof Human) {
            dtmcreature.addRow(new Object[]{
                ""+stt,
                cr.getTen(),
                DateToString(cr.getNgaySinh()),
                cr.getGioiTinh(),
                ((Human) cr).getyThuc(),
                ((Human) cr).getHanhDong(),
                null,
                null,
                null,
                ((Human) cr).tinhTuoiTho()
            });
        } else if(cr instanceof Animal){
            dtmcreature.addRow(new Object[]{
                ""+stt,
                cr.getTen(),
                DateToString(cr.getNgaySinh()),
                cr.getGioiTinh(),
                null,
                null,
                ((Animal) cr).getSoChan(),
                ((Animal) cr).getTapTinh(),
                ((Animal) cr).getLoiSong(),
                ((Animal) cr).tinhTuoiTho()
            });
        }
    }
}
