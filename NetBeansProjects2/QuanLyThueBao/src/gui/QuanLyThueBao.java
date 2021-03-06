/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import core.DSTB;
import core.TBTraSau;
import core.TBTraTruoc;
import core.ThueBao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BINHPA-PC
 */
public class QuanLyThueBao extends javax.swing.JFrame {
    private DefaultTableModel dtmThueBaos;
    private DSTB danhSach;
    /**
     * Creates new form QuanLyThueBao
     */
    public QuanLyThueBao() {
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

        jLabel1 = new javax.swing.JLabel();
        cboLoaiThueBao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtMaThueBao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenThueBao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKhuyenMai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTienNap = new javax.swing.JTextField();
        txtPhiCuocGoi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSoTinNhan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhiTinNhan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSoCuocGoi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ftfNgayThueBao = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTongTien = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnHienThiTatCa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThueBaos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Loại thuê bao:");

        cboLoaiThueBao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TBTraTruoc", "TBTraSau" }));
        cboLoaiThueBao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiThueBaoItemStateChanged(evt);
            }
        });

        jLabel2.setText("Mã thuê bao:");

        jLabel3.setText("Tên thuê bao:");

        jLabel4.setText("Khuyến mãi:");

        jLabel5.setText("Tiền nạp:");

        jLabel6.setText("Số tin nhắn:");

        jLabel7.setText("Phí tin nhắn:");

        jLabel8.setText("Số cuộc gọi");

        jLabel9.setText("Phí cuộc gọi:");

        jLabel10.setText("Ngày thuê bao:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTongTien.setText("Tổng tiền thuê bao trả sau");

        btnTim.setText("Tìm");

        btnHienThiTatCa.setText("Hiển thị tất cả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTongTien)
                .addGap(18, 18, 18)
                .addComponent(btnTim)
                .addGap(43, 43, 43)
                .addComponent(btnHienThiTatCa)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnTongTien)
                    .addComponent(btnTim)
                    .addComponent(btnHienThiTatCa))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tblThueBaos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Tên", "Loại thuê bao", "Khuyến mãi", "Tiền nạp", "Ngày thuê bao", "Số tin nhắn", "Phí tin nhắn", "Số cuộc gọi", "Phí cuộc gọi", "Tiền cước"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThueBaos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTienNap)
                                    .addComponent(txtKhuyenMai)
                                    .addComponent(txtTenThueBao)
                                    .addComponent(cboLoaiThueBao, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                    .addComponent(txtMaThueBao, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPhiCuocGoi, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                        .addComponent(txtSoCuocGoi)
                                        .addComponent(txtPhiTinNhan)
                                        .addComponent(txtSoTinNhan))
                                    .addComponent(ftfNgayThueBao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ftfNgayThueBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoTinNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPhiTinNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSoCuocGoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPhiCuocGoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboLoaiThueBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaThueBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenThueBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTienNap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboLoaiThueBaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiThueBaoItemStateChanged
        // TODO add your handling code here:
        thietLapKhoa(cboLoaiThueBao.getSelectedIndex());
    }//GEN-LAST:event_cboLoaiThueBaoItemStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
      
        
        
        
        danhSach = new DSTB();
        if (cboLoaiThueBao.getSelectedIndex()==0) {
      
            danhSach.them(new TBTraTruoc(Double.parseDouble(txtTienNap.getText()), txtMaThueBao.getText(), txtTenThueBao.getText(), Double.parseDouble( txtKhuyenMai.getText())  ));
        }else{
            try {
                danhSach.them(new TBTraSau(  Integer.parseInt( txtSoTinNhan.getText()) ,Integer.parseInt( txtSoCuocGoi.getText()), Double.parseDouble(txtPhiTinNhan.getText()), Double.parseDouble(txtPhiCuocGoi.getText()),ChuyenStringSangDate(ftfNgayThueBao.getText() ) , txtMaThueBao.getText(),  txtTenThueBao.getText(),  Double.parseDouble( txtKhuyenMai.getText()) ));
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyThueBao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        napDuLieuVaoModel();
        
       
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed
      
    public Date ChuyenStringSangDate(String  text ) throws ParseException
     {
              
              SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
              Date date1 = formatter1.parse(text);
         return date1;
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
            java.util.logging.Logger.getLogger(QuanLyThueBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyThueBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyThueBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyThueBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThueBao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThiTatCa;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTongTien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cboLoaiThueBao;
    private javax.swing.JFormattedTextField ftfNgayThueBao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable tblThueBaos;
    private javax.swing.JTextField txtKhuyenMai;
    private javax.swing.JTextField txtMaThueBao;
    private javax.swing.JTextField txtPhiCuocGoi;
    private javax.swing.JTextField txtPhiTinNhan;
    private javax.swing.JTextField txtSoCuocGoi;
    private javax.swing.JTextField txtSoTinNhan;
    private javax.swing.JTextField txtTenThueBao;
    private javax.swing.JTextField txtTienNap;
    // End of variables declaration//GEN-END:variables

    private void myInits() {
        setTitle("Ứng dụng quản lý thuê bao");
        setLocationRelativeTo(null);
        dtmThueBaos = (DefaultTableModel) tblThueBaos.getModel();
        tblThueBaos.setModel(dtmThueBaos);
        
      
        
        thietLapKhoa(0);
    }
    // 0 - thuê bao trả trước
    // 1 - thuê bao trả sau
    private void thietLapKhoa(int loaiThueBao){
        boolean OK = true;
        if (loaiThueBao==0) {
            OK = false;
        }
        txtTienNap.setEnabled(!OK);
        ftfNgayThueBao.setEnabled(OK);
        txtSoCuocGoi.setEnabled(OK);
        txtPhiCuocGoi.setEnabled(OK);
        txtSoTinNhan.setEnabled(OK);
        txtPhiTinNhan.setEnabled(OK);
    
  
    }
   
     
    
    public void re()
    {
        txtTienNap.setText(null);
        ftfNgayThueBao.setText(null);
        txtSoCuocGoi.setText(null);
        txtPhiCuocGoi.setText(null);
        txtSoTinNhan.setText(null);
        txtPhiTinNhan.setText(null);
        txtKhuyenMai.setText(null);
        txtMaThueBao.setText(null);
        txtTenThueBao.setText(null);   
    
    }
    private void napDuLieuVaoModel() {
        int i = 1 ;
        
        if(cboLoaiThueBao.getSelectedIndex() == 0)
        {
            
           for( ThueBao temp : danhSach.layDanhSach()   )
           {
                 if( temp instanceof TBTraTruoc )
                 {  
                     
                    dtmThueBaos.addRow( new Object[] {i++,temp.getMa(),temp.getTen(),cboLoaiThueBao.getSelectedItem().toString(),temp.getKhuyenMai(),((TBTraTruoc)temp).getTienNap(),null,null,null,null,null,((TBTraTruoc)temp).tinhCuoc()} );
                 
                 }
               re();
           
           }
           
        }else {
        
          for( ThueBao temp : danhSach.layDanhSach()   )
           {
                 if( temp instanceof TBTraSau )
                 {  
                     
                    dtmThueBaos.addRow( new Object[] {i++,temp.getMa(),temp.getTen(),cboLoaiThueBao.getSelectedItem().toString(),temp.getKhuyenMai(),null,((TBTraSau)temp).getNgayThueBao(),((TBTraSau)temp).getSoTinNhan(),((TBTraSau)temp).getPhiTinNhan(),((TBTraSau)temp).getSoCuocGoi(),((TBTraSau)temp).getPhiCuocGoi(),((TBTraSau)temp).tinhCuoc()} );
                 
                 }
           
           
           }
           re();
        }
        
        
    }
}
