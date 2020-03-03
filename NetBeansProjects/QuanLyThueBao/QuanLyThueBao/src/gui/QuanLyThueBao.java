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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BINHPA-PC
 */
public class QuanLyThueBao extends javax.swing.JFrame {
    private DefaultTableModel dtmThueBaos;
    private DSTB danhSach;
    public  int selectIndex = -1;
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
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTongTien = new javax.swing.JButton();
        btnHienThiTatCa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThueBaos = new javax.swing.JTable();
        txtNgayThueBao = new javax.swing.JTextField();
        jbtnTim = new javax.swing.JButton();
        jTextFieldtimma = new javax.swing.JTextField();
        jTextFieldxoama = new javax.swing.JTextField();
        jbtnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Loại thuê bao");

        cboLoaiThueBao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TBTraTruoc", "TBTraSau" }));
        cboLoaiThueBao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiThueBaoItemStateChanged(evt);
            }
        });

        jLabel2.setText("Mã thuê bao");

        jLabel3.setText("Tên thuê bao");

        jLabel4.setText("Khuyến mãi");

        jLabel5.setText("Tiền nạp");

        jLabel6.setText("Số tin nhắn");

        jLabel7.setText("Phí tin nhắn");

        jLabel8.setText("Số cuộc gọi");

        jLabel9.setText("Phí cuộc gọi");

        jLabel10.setText("Ngày thuê bao");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThem.setText("Thêm");
        btnThem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                btnThemAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
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

        btnHienThiTatCa.setText("Hiển thị tất cả");
        btnHienThiTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiTatCaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(btnHienThiTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHienThiTatCa)
                .addContainerGap())
        );

        tblThueBaos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Tên", "Loại thuê bao", "Khuyến mãi", "Tiền nạp", "Ngày thuê bao", "Số tin nhắn", "Phí tin nhắn", "Số cuộc gọi", "Phí cuộc gọi", "Tiền cước"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThueBaos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThueBaosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThueBaos);

        jbtnTim.setText("Tìm");
        jbtnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTimActionPerformed(evt);
            }
        });

        jbtnXoa.setText("Xóa");
        jbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhiCuocGoi, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(txtSoCuocGoi)
                            .addComponent(txtPhiTinNhan)
                            .addComponent(txtSoTinNhan)
                            .addComponent(txtNgayThueBao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldtimma, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jTextFieldxoama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnTim)
                            .addComponent(jbtnXoa)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNgayThueBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTim)
                            .addComponent(jTextFieldtimma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoTinNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtPhiTinNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldxoama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnXoa))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboLoaiThueBaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiThueBaoItemStateChanged
        // TODO add your handling code here:
        thietLapKhoa(cboLoaiThueBao.getSelectedIndex());
    }//GEN-LAST:event_cboLoaiThueBaoItemStateChanged

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        boolean check=false;
        if(cboLoaiThueBao.getSelectedIndex()==0) {
            danhSach.them(new TBTraTruoc(Double.parseDouble(txtTienNap.getText().trim()), txtMaThueBao.getText().trim(), txtTenThueBao.getText().trim()
                    , Double.parseDouble(txtKhuyenMai.getText().trim())));
            check = true;
        }else{
            danhSach.them(new TBTraSau(Integer.parseInt(txtSoTinNhan.getText().trim()), Integer.parseInt(txtSoCuocGoi.getText().trim()), Double.parseDouble(txtPhiTinNhan.getText().trim()), Double.parseDouble(txtPhiCuocGoi.getText().trim()), chuyenChuoiThanhNgay(txtNgayThueBao.getText().trim()), txtMaThueBao.getText().trim()
                    , txtTenThueBao.getText().trim()
                    , Double.parseDouble(txtKhuyenMai.getText().trim())));
            check = true;
        }
        if(check){
        napDuLieuVaoModel();
            hienThiThongBao("Thêm thành công");
        clearTextField();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String ma = "";
        if(selectIndex!=-1){
            ma = dtmThueBaos.getValueAt(selectIndex, 1).toString();
        }
        if(danhSach.xoa(ma)==1){
            hienThiThongBao("Xoa thanh cong");
            napDuLieuVaoModel();
            selectIndex = -1;
        }
        
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblThueBaosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThueBaosMouseClicked
        // TODO add your handling code here:
        selectIndex = tblThueBaos.getSelectedRow();
        
    }//GEN-LAST:event_tblThueBaosMouseClicked

    private void btnThemAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnThemAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemAncestorMoved

    private void btnHienThiTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiTatCaActionPerformed
       xoaDuLieuTrongBang();
       napDuLieuVaoModel();
    }//GEN-LAST:event_btnHienThiTatCaActionPerformed

    private void jbtnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTimActionPerformed
       
            
    }//GEN-LAST:event_jbtnTimActionPerformed

    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jbtnXoaActionPerformed

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
    private javax.swing.JButton btnTongTien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cboLoaiThueBao;
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
    private javax.swing.JTextField jTextFieldtimma;
    private javax.swing.JTextField jTextFieldxoama;
    private javax.swing.JButton jbtnTim;
    private javax.swing.JButton jbtnXoa;
    private javax.swing.JTable tblThueBaos;
    private javax.swing.JTextField txtKhuyenMai;
    private javax.swing.JTextField txtMaThueBao;
    private javax.swing.JTextField txtNgayThueBao;
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
        danhSach = new DSTB();
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
        txtNgayThueBao.setEnabled(OK);
        txtSoCuocGoi.setEnabled(OK);
        txtPhiCuocGoi.setEnabled(OK);
        txtSoTinNhan.setEnabled(OK);
        txtPhiTinNhan.setEnabled(OK);
    }

    private Date chuyenChuoiThanhNgay(String trim) {
        try {
            return new SimpleDateFormat("yyyy").parse(trim);
        } catch (ParseException e) {
                hienThiThongBao("Nhap chinh xac");
             return null;
        }
       
    }

    private void napDuLieuVaoModel() {
        xoaDuLieuTrongBang();
        int stt=0;
        for (ThueBao thueBao : danhSach.layDanhSach()) {
            themMotDong(++stt,thueBao);
            
        }
    }

    private void xoaDuLieuTrongBang() {
        while(dtmThueBaos.getRowCount()>0){
            dtmThueBaos.removeRow(0);
        }
    }

    private void themMotDong(int stt, ThueBao tb) {   
        try{
            dtmThueBaos.addRow(new Object[]{
                " "+stt,tb.getMa(),
                tb.getTen(),
                "TBTraTruoc",
                tb.getKhuyenMai(),
                ((TBTraTruoc)tb).getTienNap(),
                null,null,null,null,null,
                ((TBTraTruoc)tb).tinhCuoc()});
        }catch(ClassCastException e){
            dtmThueBaos.addRow(new Object[]{
                " "+stt,
                tb.getMa(),
                tb.getTen(),
                "TBTraSau",
                tb.getKhuyenMai(),
                null,
                ((TBTraSau)tb).getNgayThueBao(),
                ((TBTraSau)tb).getSoTinNhan(),
                ((TBTraSau)tb).getPhiTinNhan(),
                ((TBTraSau)tb).getSoCuocGoi(),
                ((TBTraSau)tb).getPhiCuocGoi(),
                ((TBTraSau)tb).tinhCuoc()});
        }
        
    }

    private void clearTextField() {
        txtKhuyenMai.setText("");
        txtMaThueBao.setText("");
        txtNgayThueBao.setText("");
        txtPhiCuocGoi.setText("");
        txtPhiTinNhan.setText("");
        txtSoCuocGoi.setText("");
        txtSoTinNhan.setText("");
        txtTenThueBao.setText("");
        txtTienNap.setText("");
      
    }

    private void hienThiThongBao(String thongBao) {
        JOptionPane.showMessageDialog(null, thongBao);
    }
}