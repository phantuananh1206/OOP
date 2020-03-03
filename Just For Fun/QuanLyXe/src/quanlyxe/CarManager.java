/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyxe;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class CarManager extends javax.swing.JFrame {

    DefaultTableModel dtmloaiPhuongTien, dtmUpdate;
    CarList danhSachs;
    /**
     * Creates new form CarManager
     */
    public CarManager() {
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

        jfrmUpdate = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUpdate = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnLuu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbLoaiPhuongTien = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtBienSo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNhaSanXuat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoChoNgoi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNamSanXuat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGiaGoc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTuyenDuong = new javax.swing.JTextField();
        txtCuocVanChuyen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLePhiTTDB = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnLietKe = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbLoaiPhuongTien = new javax.swing.JTable();

        tblUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Biển số", "Nhà SX", "Số chỗ ngồi", "Năm SX", "Giá gốc", "Tuyến đường", "Cước vận chuyển", "Lệ phí TTDB", "Giá xe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUpdateMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUpdate);

        btnLuu.setText("Save");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(btnLuu)
                .addContainerGap(579, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jfrmUpdateLayout = new javax.swing.GroupLayout(jfrmUpdate.getContentPane());
        jfrmUpdate.getContentPane().setLayout(jfrmUpdateLayout);
        jfrmUpdateLayout.setHorizontalGroup(
            jfrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrmUpdateLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jfrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jfrmUpdateLayout.setVerticalGroup(
            jfrmUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrmUpdateLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Loại phương tiện :");

        jcbLoaiPhuongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bus", "Luxury Car" }));
        jcbLoaiPhuongTien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbLoaiPhuongTienItemStateChanged(evt);
            }
        });
        jcbLoaiPhuongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLoaiPhuongTienActionPerformed(evt);
            }
        });

        jLabel2.setText("Biển số :");

        jLabel3.setText("Nhà sản xuất :");

        jLabel4.setText("Số chỗ ngồi :");

        jLabel5.setText("Năm sản xuất :");

        jLabel6.setText("Giá gốc :");

        jLabel7.setText("Tuyến đường :");

        jLabel8.setText("Cước vận chuyển :");

        jLabel9.setText("Lệ phí TTDB : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbLoaiPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBienSo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtNhaSanXuat)
                    .addComponent(txtSoChoNgoi)
                    .addComponent(txtNamSanXuat)
                    .addComponent(txtGiaGoc))
                .addGap(205, 205, 205)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTuyenDuong)
                    .addComponent(txtCuocVanChuyen)
                    .addComponent(txtLePhiTTDB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbLoaiPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTuyenDuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCuocVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtLePhiTTDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGiaGoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

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

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnLietKe.setText("Liệt kê");
        btnLietKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLietKeActionPerformed(evt);
            }
        });

        btnHienThi.setText("Hiển thị");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnThem)
                .addGap(71, 71, 71)
                .addComponent(btnXoa)
                .addGap(75, 75, 75)
                .addComponent(btnCapNhat)
                .addGap(71, 71, 71)
                .addComponent(btnTim)
                .addGap(74, 74, 74)
                .addComponent(btnLietKe)
                .addGap(91, 91, 91)
                .addComponent(btnHienThi)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(btnTim)
                    .addComponent(btnLietKe)
                    .addComponent(btnHienThi))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jtbLoaiPhuongTien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Biển số", "Nhà SX", "Số chỗ ngồi", "Năm SX", "Giá gốc", "Tuyến đường", "Cước vận chuyển", "Lệ phí TTDB", "Giá xe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(jtbLoaiPhuongTien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (jcbLoaiPhuongTien.getSelectedIndex() == 0){
            danhSachs.themMoi(new Bus(txtTuyenDuong.getText().trim(),
                    txtBienSo.getText().trim(),
                    txtNhaSanXuat.getText().trim(), 
                    Integer.parseInt(txtSoChoNgoi.getText().trim()), 
                    chuyenStringThanhNgay(txtNamSanXuat.getText().trim()), 
                    Double.parseDouble(txtGiaGoc.getText().trim())));
                    napDuLieuVaobang(dtmloaiPhuongTien);
                    hienThiThongBao("Thêm thành công");
//                    clearAllField();
        } else{
            danhSachs.themMoi(new LuxuryCar(Double.parseDouble(txtCuocVanChuyen.getText().trim()),
                    Double.parseDouble(txtLePhiTTDB.getText().trim()), 
                    txtBienSo.getText().trim(),
                    txtNhaSanXuat.getText().trim(), 
                    Integer.parseInt(txtSoChoNgoi.getText().trim()), 
                    chuyenStringThanhNgay(txtNamSanXuat.getText().trim()), 
                    Double.parseDouble(txtGiaGoc.getText().trim())));
                    napDuLieuVaobang(dtmloaiPhuongTien);
                    hienThiThongBao("Thêm thành công");
//                    clearAllField();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void jcbLoaiPhuongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLoaiPhuongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbLoaiPhuongTienActionPerformed

    private void jcbLoaiPhuongTienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbLoaiPhuongTienItemStateChanged
        thietLapKhoa(jcbLoaiPhuongTien.getSelectedIndex());
    }//GEN-LAST:event_jcbLoaiPhuongTienItemStateChanged

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String bienSoXe = JOptionPane.showInputDialog("Nhập biển số cần xóa : ");
               if (danhSachs.xoa(bienSoXe)){
                   napDuLieuVaobang(dtmloaiPhuongTien);
                   hienThiThongBao("Xóa thành công");
               }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        String bienSoXe = JOptionPane.showInputDialog("Nhập biển số cần xóa : ");
            xoaDuLieuCu(dtmloaiPhuongTien);
        if (danhSachs.timKiem(bienSoXe) != null){
            themMotDong(1, danhSachs.timKiem(bienSoXe), dtmloaiPhuongTien);
            hienThiThongBao("Tìm thành công");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        napDuLieuVaobang(dtmloaiPhuongTien);
    }//GEN-LAST:event_btnHienThiActionPerformed

    private void btnLietKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLietKeActionPerformed
        String giaChiDinh = JOptionPane.showInputDialog("Nhập giá chỉ định : ");
        int stt = 0;
        xoaDuLieuCu(dtmloaiPhuongTien);
        for (Car car : danhSachs.lietKeDanhSach(giaChiDinh)) {
            themMotDong(++stt, car, dtmloaiPhuongTien);
        }
    }//GEN-LAST:event_btnLietKeActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if (jcbLoaiPhuongTien.getSelectedIndex() == 0){
            danhSachs.capNhat(this.jtbLoaiPhuongTien.getSelectedRow(),new Bus(txtTuyenDuong.getText().trim(),
                    txtBienSo.getText().trim(),
                    txtNhaSanXuat.getText().trim(), 
                    Integer.parseInt(txtSoChoNgoi.getText().trim()), 
                    chuyenStringThanhNgay(txtNamSanXuat.getText().trim()), 
                    Double.parseDouble(txtGiaGoc.getText().trim())));
                    napDuLieuVaobang(dtmloaiPhuongTien);
                    hienThiThongBao("Cập nhật thành công");
//                    clearAllField();
        } else{
            danhSachs.capNhat(this.jtbLoaiPhuongTien.getSelectedRow(),new LuxuryCar(Double.parseDouble(txtCuocVanChuyen.getText().trim()),
                    Double.parseDouble(txtLePhiTTDB.getText().trim()), 
                    txtBienSo.getText().trim(),
                    txtNhaSanXuat.getText().trim(), 
                    Integer.parseInt(txtSoChoNgoi.getText().trim()), 
                    chuyenStringThanhNgay(txtNamSanXuat.getText().trim()), 
                    Double.parseDouble(txtGiaGoc.getText().trim())));
                    napDuLieuVaobang(dtmloaiPhuongTien);
                    hienThiThongBao("Cập nhật thành công");
//                    clearAllField();
        }
//        String bienSoXe = JOptionPane.showInputDialog("Nhập biển số cần cập nhật : ");
//        
//        if (danhSachs.timKiem(bienSoXe)!= null){
//            xoaDuLieuCu(dtmUpdate);
//            themMotDong(1, danhSachs.timKiem(bienSoXe), dtmUpdate);
//            jfrmUpdate.setVisible(true);
//            jfrmUpdate.pack();
//            jfrmUpdate.setLocationRelativeTo(null);
//        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        
//        String bienSoXe = dtmUpdate.getValueAt(0, 1).toString();
//        if (danhSachs.timKiem(bienSoXe) instanceof Bus){
//            danhSachs.capNhat(this.tblUpdate.getSelectedRow(),new Bus(dtmUpdate.getValueAt(0, 6).toString(),
//                    dtmUpdate.getValueAt(0, 1).toString(),
//                    dtmUpdate.getValueAt(0, 2).toString(), 
//                    Integer.parseInt(dtmUpdate.getValueAt(0, 3).toString()), 
//                    chuyenStringThanhNgay(dtmUpdate.getValueAt(0, 4).toString()), 
//                    Double.parseDouble(dtmUpdate.getValueAt(0, 5).toString())) );
//                    napDuLieuVaobang(dtmloaiPhuongTien);
//                    hienThiThongBao("Cập nhật thành công");
//                    jfrmUpdate.setVisible(false);
//        }else{
//            danhSachs.capNhat(this.tblUpdate.getSelectedRow(), new LuxuryCar(Double.parseDouble(dtmUpdate.getValueAt(0, 7).toString()),
//                    Double.parseDouble(dtmUpdate.getValueAt(0, 8).toString()), 
//                    dtmUpdate.getValueAt(0, 1).toString(),
//                    dtmUpdate.getValueAt(0, 2).toString(), 
//                    Integer.parseInt(dtmUpdate.getValueAt(0, 3).toString()), 
//                    chuyenStringThanhNgay(dtmUpdate.getValueAt(0, 4).toString()), 
//                    Double.parseDouble(dtmUpdate.getValueAt(0, 5).toString())) );
//                    napDuLieuVaobang(dtmloaiPhuongTien);
//                    hienThiThongBao("Cập nhật thành công");
//                    jfrmUpdate.setVisible(false);
//        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUpdateMouseClicked
        
    }//GEN-LAST:event_tblUpdateMouseClicked

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
            java.util.logging.Logger.getLogger(CarManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnLietKe;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbLoaiPhuongTien;
    private javax.swing.JFrame jfrmUpdate;
    private javax.swing.JTable jtbLoaiPhuongTien;
    private javax.swing.JTable tblUpdate;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtCuocVanChuyen;
    private javax.swing.JTextField txtGiaGoc;
    private javax.swing.JTextField txtLePhiTTDB;
    private javax.swing.JTextField txtNamSanXuat;
    private javax.swing.JTextField txtNhaSanXuat;
    private javax.swing.JTextField txtSoChoNgoi;
    private javax.swing.JTextField txtTuyenDuong;
    // End of variables declaration//GEN-END:variables

    private void myInits() {
        setTitle("Quan ly phuong tien");
        
        setLocationRelativeTo(null);
        
        dtmloaiPhuongTien = (DefaultTableModel) jtbLoaiPhuongTien.getModel();
        jtbLoaiPhuongTien.setModel(dtmloaiPhuongTien);
        
        dtmUpdate = (DefaultTableModel) tblUpdate.getModel();
        tblUpdate.setModel(dtmUpdate);
        
        danhSachs = new CarList();
        
        thietLapKhoa(0);
    }

    private void thietLapKhoa(int loaiPhuongTien) {
        boolean OK = true ;
        if (loaiPhuongTien == 0 ){
            OK = false;
        }
        
        txtTuyenDuong.setEnabled(!OK);
        txtCuocVanChuyen.setEnabled(OK);
        txtLePhiTTDB.setEnabled(OK);
    }
    private Date chuyenStringThanhNgay(String date){
        try {
            return new SimpleDateFormat("yyyy").parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private String chuyenDateThanhString(Date date){
        return new SimpleDateFormat("yyyy").format(date);
    }

    private void napDuLieuVaobang(DefaultTableModel dtm) {
        xoaDuLieuCu(dtm);
        int stt = 0;
        for (Car car : danhSachs.cars) {
            themMotDong(++stt, car, dtm);
        }
    }

    private void xoaDuLieuCu(DefaultTableModel dtm) {
        while (dtm.getRowCount() > 0 ){
            dtm.removeRow(0);
        }
    }

    private void themMotDong(int stt, Car car, DefaultTableModel dtm) {
        if (car instanceof Bus){
            dtm.addRow(new Object[]{
                "" + stt, car.getBienSo(), car.getNhaSX(), car.getSoChoNgoi(), chuyenDateThanhString(car.getNamSX()), car.getGiaGoc(), ((Bus) car).getTuyenDuong(), null ,null, ((Bus)car).tinhGiaXe()
            });
        }else{
             dtm.addRow(new Object[]{
                "" + stt, car.getBienSo(), car.getNhaSX(), car.getSoChoNgoi(), chuyenDateThanhString(car.getNamSX()), car.getGiaGoc(), null, ((LuxuryCar)car).getCuocVanChuyen() , ((LuxuryCar)car).getLePhiTTDB(), ((LuxuryCar)car).tinhGiaXe()
            });
        }
    }

    private void hienThiThongBao(String thongBao) {
        JOptionPane.showMessageDialog(null, thongBao);
    }
    
    private void clearAllField() {
        txtBienSo.setText("");
        txtCuocVanChuyen.setText("");
        txtGiaGoc.setText("");
        txtLePhiTTDB.setText("");
        txtNamSanXuat.setText("");
        txtNhaSanXuat.setText("");
        txtSoChoNgoi.setText("");
        txtTuyenDuong.setText("");
    }
}