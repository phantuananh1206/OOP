/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javaapplicationgiangvien.DSGV;
import javaapplicationgiangvien.GVCoHuu;
import javaapplicationgiangvien.GVThinhGiang;
import javaapplicationgiangvien.GiangVien;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gemini
 */
public class QLGV extends javax.swing.JFrame {
    private DSGV danhSach;
    private DefaultTableModel dtmDanhSach,dtmUpdate;
    private int selectedIndex = -1 ;
    
    
    public QLGV() {
        initComponents();
        myInits();
    }

    private void myInits(){
        setTitle("Quản Lý Giảng Viên");
        setLocationRelativeTo(null);
        dtmDanhSach = (DefaultTableModel) jTableQLGV.getModel();
        dtmUpdate = (DefaultTableModel) jTableUpdate.getModel();
        jTableUpdate.setModel(dtmUpdate);
        jTableQLGV.setModel(dtmDanhSach);
        danhSach = new DSGV();
        thietlapkhoa(0);
        jButtonApplyUpdate.setEnabled(false);
        jButtonC.setEnabled(false);
    }
    
    private boolean ChonPhai(){
      if(buttonGroup28.isSelected(jRadioNam.getModel())){
          return true;
      }else{
          return false;
      }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameUpdate = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUpdate = new javax.swing.JTable();
        jButtonApplyUpdate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTimUpdate = new javax.swing.JTextField();
        jButtonOkeUpdate = new javax.swing.JButton();
        buttonGroup28 = new javax.swing.ButtonGroup();
        jFrameTBL = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTBL = new javax.swing.JTable();
        jFrametimtheoma = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldTImma = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jFramexoatheoma = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldxoatheoma = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jFrameChen = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldChen = new javax.swing.JTextField();
        jButtonChen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableQLGV = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSogio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxChonLoai = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNgayVao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLuongCB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldMaHD = new javax.swing.JTextField();
        jRadioNam = new javax.swing.JRadioButton();
        jRadioNu = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonxoa = new javax.swing.JButton();
        jButtonthem = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonShowTBL = new javax.swing.JButton();
        jButtonHienThiGVCH = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonHienThiTatCa = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jFrameUpdate.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameUpdate.setTitle("Cập nhật thông tin");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ tên", "Phái", "Số giờ", "Mã HĐ", "Ngày vào", "Lương CB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane3.setViewportView(jTableUpdate);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonApplyUpdate.setText("Apply");
        jButtonApplyUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApplyUpdateActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Mã");

        jButtonOkeUpdate.setText("OK");
        jButtonOkeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkeUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldTimUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOkeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldTimUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOkeUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrameUpdateLayout = new javax.swing.GroupLayout(jFrameUpdate.getContentPane());
        jFrameUpdate.getContentPane().setLayout(jFrameUpdateLayout);
        jFrameUpdateLayout.setHorizontalGroup(
            jFrameUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameUpdateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonApplyUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jFrameUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrameUpdateLayout.setVerticalGroup(
            jFrameUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameUpdateLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonApplyUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFrameTBL.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameTBL.setTitle("Trung bình lương và phụ cấp");

        jTableTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Lương", "Phụ cấp", "Trung bình"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableTBL);
        if (jTableTBL.getColumnModel().getColumnCount() > 0) {
            jTableTBL.getColumnModel().getColumn(0).setHeaderValue("Mã");
            jTableTBL.getColumnModel().getColumn(1).setHeaderValue("Tên");
            jTableTBL.getColumnModel().getColumn(2).setHeaderValue("Lương");
            jTableTBL.getColumnModel().getColumn(3).setHeaderValue("Phụ cấp");
            jTableTBL.getColumnModel().getColumn(4).setHeaderValue("Trung bình");
        }

        javax.swing.GroupLayout jFrameTBLLayout = new javax.swing.GroupLayout(jFrameTBL.getContentPane());
        jFrameTBL.getContentPane().setLayout(jFrameTBLLayout);
        jFrameTBLLayout.setHorizontalGroup(
            jFrameTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameTBLLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jFrameTBLLayout.setVerticalGroup(
            jFrameTBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameTBLLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel11.setText("Nhập mã cần tìm");

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrametimtheomaLayout = new javax.swing.GroupLayout(jFrametimtheoma.getContentPane());
        jFrametimtheoma.getContentPane().setLayout(jFrametimtheomaLayout);
        jFrametimtheomaLayout.setHorizontalGroup(
            jFrametimtheomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrametimtheomaLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jTextFieldTImma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jFrametimtheomaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrametimtheomaLayout.setVerticalGroup(
            jFrametimtheomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrametimtheomaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrametimtheomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTImma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel12.setText("Nhập mã cần xóa");

        jButton6.setText("OK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFramexoatheomaLayout = new javax.swing.GroupLayout(jFramexoatheoma.getContentPane());
        jFramexoatheoma.getContentPane().setLayout(jFramexoatheomaLayout);
        jFramexoatheomaLayout.setHorizontalGroup(
            jFramexoatheomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFramexoatheomaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jFramexoatheomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldxoatheoma, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jFramexoatheomaLayout.setVerticalGroup(
            jFramexoatheomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFramexoatheomaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFramexoatheomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldxoatheoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel10.setText("Nhập hàng cần chèn");

        jButtonChen.setText("OK");
        jButtonChen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameChenLayout = new javax.swing.GroupLayout(jFrameChen.getContentPane());
        jFrameChen.getContentPane().setLayout(jFrameChenLayout);
        jFrameChenLayout.setHorizontalGroup(
            jFrameChenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameChenLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jTextFieldChen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonChen, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jFrameChenLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrameChenLayout.setVerticalGroup(
            jFrameChenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameChenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrameChenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChen)
                    .addComponent(jTextFieldChen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jTableQLGV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Họ Tên", "Phái", "Số giờ", "Mã HĐ", "Ngày Vào", "Lương CB", "Lương", "Phụ cấp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
        jTableQLGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQLGVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableQLGV);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Mã");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Số giờ");

        jLabel4.setText("Phái");

        jComboBoxChonLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GVCH", "GVTG" }));
        jComboBoxChonLoai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxChonLoaiItemStateChanged(evt);
            }
        });

        jLabel5.setText("Loại ");

        jLabel6.setText("Ngày vào");

        jLabel7.setText("Lương CB");

        jLabel8.setText("Mã HĐ");

        buttonGroup28.add(jRadioNam);
        jRadioNam.setText("Nam");

        buttonGroup28.add(jRadioNu);
        jRadioNu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxChonLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldHoten)
                    .addComponent(jTextFieldMa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioNam)
                            .addComponent(jTextFieldSogio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioNu))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldNgayVao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldMaHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addComponent(jComboBoxChonLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSogio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNgayVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioNam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioNu))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonxoa.setText("Xóa");
        jButtonxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonxoaActionPerformed(evt);
            }
        });

        jButtonthem.setText("Thêm");
        jButtonthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonthemActionPerformed(evt);
            }
        });

        jButtonC.setText("Chèn");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonthem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonthem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonShowTBL.setText("Trung bình lương và phụ cấp");
        jButtonShowTBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowTBLActionPerformed(evt);
            }
        });

        jButtonHienThiGVCH.setText("Hiện thị Giảng Viên Cơ Hữu");
        jButtonHienThiGVCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHienThiGVCHActionPerformed(evt);
            }
        });

        jButton1.setText("Cập nhật dữ liệu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xóa theo mã");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Tìm theo mã");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonHienThiTatCa.setText("Hiển thị tất cả");
        jButtonHienThiTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHienThiTatCaActionPerformed(evt);
            }
        });

        jButton3.setText("Hiển thị Giảng Viên TG");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHienThiGVCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonShowTBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHienThiTatCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHienThiTatCa)
                .addGap(168, 168, 168)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHienThiGVCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowTBL)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonthemActionPerformed
       boolean add;
        if(jComboBoxChonLoai.getSelectedIndex()==0){  
         add = danhSach.them(new GVCoHuu(ChuyenStringThanhDate(jTextFieldNgayVao.getText().trim()),Double.parseDouble(jTextFieldLuongCB.getText().trim()),jTextFieldMa.getText().trim(),jTextFieldHoten.getText().trim(),Integer.parseInt(jTextFieldSogio.getText().trim()),ChonPhai()));    
        }else{
         add = danhSach.them(new GVThinhGiang(jTextFieldMaHD.getText().trim(),jTextFieldMa.getText().trim(),jTextFieldHoten.getText().trim(),Integer.parseInt(jTextFieldSogio.getText().trim()),ChonPhai()));
      
        }
      napdulieu();
        if (add) {
            JOptionPane.showMessageDialog(rootPane,"Thêm thành công");
            thietlapkhoabutton();
            clear();
        }
    }//GEN-LAST:event_jButtonthemActionPerformed

    private void jComboBoxChonLoaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxChonLoaiItemStateChanged
        thietlapkhoa(jComboBoxChonLoai.getSelectedIndex());
    }//GEN-LAST:event_jComboBoxChonLoaiItemStateChanged

    private void jButtonxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonxoaActionPerformed
       String ma ="";
       if(selectedIndex!=-1){
       ma = dtmDanhSach.getValueAt(selectedIndex,1).toString();
       }
       if(danhSach.xoa(ma)){
         napdulieu();
         thietlapkhoabutton();
         selectedIndex = -1;
       }
    }//GEN-LAST:event_jButtonxoaActionPerformed

    private void jTableQLGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQLGVMouseClicked
        selectedIndex = jTableQLGV.getSelectedRow();
    }//GEN-LAST:event_jTableQLGVMouseClicked

    private void jButtonHienThiTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHienThiTatCaActionPerformed
      napdulieu();
    }//GEN-LAST:event_jButtonHienThiTatCaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jFrametimtheoma.setVisible(true);
        jFrametimtheoma.pack();
        jFrametimtheoma.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFramexoatheoma.setVisible(true);
        jFramexoatheoma.pack();
        jFramexoatheoma.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonHienThiGVCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHienThiGVCHActionPerformed
        XoaDuLieuTrongModel(dtmDanhSach);
        int stt=0;
        for (GiangVien gv : danhSach.giangViens) {
            if(gv instanceof GVCoHuu){
                themmotdong(++stt, gv);
            }
        }
    }//GEN-LAST:event_jButtonHienThiGVCHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           jFrameUpdate.setVisible(true);
           jFrameUpdate.pack();
           jFrameUpdate.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonOkeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkeUpdateActionPerformed
       
        if (danhSach.tim(jTextFieldTimUpdate.getText().trim()) != null) {
                XoaDuLieuTrongModel(dtmUpdate);
                themmotdong(danhSach.tim(jTextFieldTimUpdate.getText().trim()));
                jButtonApplyUpdate.setEnabled(true);
                
        }else{
            JOptionPane.showMessageDialog(null,"Không tìm thấy");
        }
    }//GEN-LAST:event_jButtonOkeUpdateActionPerformed

    private void jButtonApplyUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApplyUpdateActionPerformed
       String ma="";
       boolean check = false;
      ma = dtmUpdate.getValueAt(0,0).toString();
      if(danhSach.tim(ma)!= null){
          if(danhSach.tim(ma) instanceof GVThinhGiang){
              danhSach.giangViens.set(danhSach.vitri(ma),new GVThinhGiang(
                      dtmUpdate.getValueAt(0,4).toString().trim()
                      ,dtmUpdate.getValueAt(0,0).toString().trim()
                      ,dtmUpdate.getValueAt(0,1).toString().trim()
                      ,Integer.parseInt(dtmUpdate.getValueAt(0,3).toString().trim())
                      ,(Boolean)dtmUpdate.getValueAt(0,2)));
          }else{
            danhSach.giangViens.set(danhSach.vitri(ma),new GVCoHuu(
                    ChuyenStringThanhDate(dtmUpdate.getValueAt(0,5).toString())
                    ,Double.parseDouble(dtmUpdate.getValueAt(0,6).toString().trim())
                    ,dtmUpdate.getValueAt(0,0).toString()
                    ,dtmUpdate.getValueAt(0,1).toString()
                    ,Integer.parseInt(dtmUpdate.getValueAt(0,3).toString())
                    ,(Boolean)dtmUpdate.getValueAt(0,2)));
          }
          check = true;
      }
        if (check) {
            JOptionPane.showMessageDialog(null,"Cập nhật thành công");
            XoaDuLieuTrongModel(dtmUpdate);
            jTextFieldTimUpdate.setText("");
            XoaDuLieuTrongModel(dtmDanhSach);
            napdulieu();
            jButtonApplyUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonApplyUpdateActionPerformed

    private void jButtonChenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChenActionPerformed
        boolean check= false;
        if(!jTextFieldChen.getText().trim().isEmpty() && !jTextFieldChen.getText().trim().equals("0") ){
         if(jComboBoxChonLoai.getSelectedIndex()==0){  
        danhSach.giangViens.add(Integer.parseInt(jTextFieldChen.getText().trim())-1 ,new GVCoHuu(ChuyenStringThanhDate(jTextFieldNgayVao.getText().trim()),Double.parseDouble(jTextFieldLuongCB.getText().trim()),jTextFieldMa.getText().trim(),jTextFieldHoten.getText().trim(),Integer.parseInt(jTextFieldSogio.getText().trim()),ChonPhai()));
        check = true;
        }else{
        danhSach.giangViens.add(Integer.parseInt(jTextFieldChen.getText().trim())-1,new GVThinhGiang(jTextFieldMaHD.getText().trim(),jTextFieldMa.getText().trim(),jTextFieldHoten.getText().trim(),Integer.parseInt(jTextFieldSogio.getText().trim()),ChonPhai()));
        check = true;
         }
        }else{
            JOptionPane.showMessageDialog(null,"Are You Kidding Me ???");
        }
        if (check) {
            JOptionPane.showMessageDialog(null,"Chèn Thành Công ");
            XoaDuLieuTrongModel(dtmDanhSach);
            napdulieu();
            jTextFieldChen.setText("");
            clear();
        }
    }//GEN-LAST:event_jButtonChenActionPerformed

    private void jButtonShowTBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowTBLActionPerformed
        jFrameTBL.setVisible(true);
        jFrameTBL.pack();
        jFrameTBL.setLocationRelativeTo(null);
        tinhtrungbinh();
    }//GEN-LAST:event_jButtonShowTBLActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        XoaDuLieuTrongModel(dtmDanhSach);
        if(danhSach.tim(jTextFieldTImma.getText().trim()) != null){
          themmotdong(1,danhSach.tim(jTextFieldTImma.getText().trim()));
          jTextFieldTImma.setText("");
      }else{
            JOptionPane.showMessageDialog(null,"Không tìm thấy");
             jTextFieldTImma.setText("");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(danhSach.xoa(jTextFieldxoatheoma.getText().trim())){
        napdulieu();
        thietlapkhoabutton();
        jTextFieldxoatheoma.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"Không tìm thấy");
             jTextFieldxoatheoma.setText("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         XoaDuLieuTrongModel(dtmDanhSach);
        int stt=0;
        for (GiangVien gv : danhSach.giangViens) {
            if(gv instanceof GVThinhGiang){
                themmotdong(++stt, gv);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
      jFrameChen.setVisible(true);
      jFrameChen.pack();
      jFrameChen.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonCActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLGV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLGV().setVisible(true);
            }
        });
    }
    
    private Date ChuyenStringThanhDate(String strdate){
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(strdate);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(rootPane,"Nhập sai ngày rồi ");
            return null;
        }
    }
    private String DST(Date indate){
      return new SimpleDateFormat("dd/MM/yyyy").format(indate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonApplyUpdate;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonChen;
    private javax.swing.JButton jButtonHienThiGVCH;
    private javax.swing.JButton jButtonHienThiTatCa;
    private javax.swing.JButton jButtonOkeUpdate;
    private javax.swing.JButton jButtonShowTBL;
    private javax.swing.JButton jButtonthem;
    private javax.swing.JButton jButtonxoa;
    private javax.swing.JComboBox<String> jComboBoxChonLoai;
    private javax.swing.JFrame jFrameChen;
    private javax.swing.JFrame jFrameTBL;
    private javax.swing.JFrame jFrameUpdate;
    private javax.swing.JFrame jFrametimtheoma;
    private javax.swing.JFrame jFramexoatheoma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioNam;
    private javax.swing.JRadioButton jRadioNu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableQLGV;
    private javax.swing.JTable jTableTBL;
    private javax.swing.JTable jTableUpdate;
    private javax.swing.JTextField jTextFieldChen;
    private javax.swing.JTextField jTextFieldHoten;
    private javax.swing.JTextField jTextFieldLuongCB;
    private javax.swing.JTextField jTextFieldMa;
    private javax.swing.JTextField jTextFieldMaHD;
    private javax.swing.JTextField jTextFieldNgayVao;
    private javax.swing.JTextField jTextFieldSogio;
    private javax.swing.JTextField jTextFieldTImma;
    private javax.swing.JTextField jTextFieldTimUpdate;
    private javax.swing.JTextField jTextFieldxoatheoma;
    // End of variables declaration//GEN-END:variables

    private void napdulieu() {
      XoaDuLieuTrongModel(dtmDanhSach);
      int stt=0;
        for (GiangVien gv : danhSach.giangViens ) {
            themmotdong(++stt,gv);
        }
    }

    private void XoaDuLieuTrongModel(DefaultTableModel dtm ) {
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
    }

     private void themmotdong(int stt,GiangVien gv) {
        if(gv instanceof GVThinhGiang){
            dtmDanhSach.addRow(new Object[]{" "+stt,gv.getMa(),gv.getHoTen(),gv.isPhai(),gv.getSoGio(),((GVThinhGiang)gv).getMaHopDong(),null,null,((GVThinhGiang) gv).luong(),((GVThinhGiang) gv).phuCap()});
        }
        if(gv instanceof GVCoHuu){
            dtmDanhSach.addRow(new Object[]{" "+stt,gv.getMa(),gv.getHoTen(),gv.isPhai(),gv.getSoGio(),null,DST(((GVCoHuu) gv).getNgayVao()),((GVCoHuu) gv).getLuongCB(),((GVCoHuu) gv).luong(),((GVCoHuu) gv).phuCap()});
        }
    }
     private void themmotdong(GiangVien gv) {
        if(gv instanceof GVThinhGiang){
            dtmUpdate.addRow(new Object[]{gv.getMa(),gv.getHoTen(),gv.isPhai(),gv.getSoGio(),((GVThinhGiang)gv).getMaHopDong(),null,null});
        }
        if(gv instanceof GVCoHuu){
            dtmUpdate.addRow(new Object[]{gv.getMa(),gv.getHoTen(),gv.isPhai(),gv.getSoGio(),null,DST(((GVCoHuu) gv).getNgayVao()),((GVCoHuu) gv).getLuongCB()});
        }
    }
     private void themmotdongtb(GiangVien gv,DefaultTableModel dtm) {
            dtm.addRow(new Object[]{gv.getMa(),gv.getHoTen(),gv.luong(),gv.phuCap(),(gv.luong()+gv.phuCap())/2});
    }

    private void thietlapkhoa(int item) {
      if(item ==0){
            jTextFieldMaHD.setEnabled(true);
            jTextFieldNgayVao.setEnabled(true);
            jTextFieldLuongCB.setEnabled(true);
            jTextFieldMaHD.setEnabled(false);
      }
      if(item ==1){
            jTextFieldMaHD.setEnabled(false);
            jTextFieldNgayVao.setEnabled(false);
            jTextFieldLuongCB.setEnabled(false);
            jTextFieldMaHD.setEnabled(true);
      }
    }
    private void thietlapkhoabutton(){
        if(dtmDanhSach.getRowCount()>0){
            jButtonC.setEnabled(true);
        }else{
            jButtonC.setEnabled(false);
        }
    }
    
    private void clear(){
        jTextFieldHoten.setText("");
        jTextFieldLuongCB.setText("");
        jTextFieldMa.setText("");
        jTextFieldMaHD.setText("");
        jTextFieldNgayVao.setText("");
        jTextFieldSogio.setText("");
    }

    private void tinhtrungbinh() {
       DefaultTableModel dtmtbl = (DefaultTableModel) jTableTBL.getModel();
       jTableTBL.setModel(dtmtbl);
        XoaDuLieuTrongModel(dtmtbl);
        for (GiangVien gv : danhSach.giangViens) {
            themmotdongtb(gv,dtmtbl);
        }
    }

    
    
    
    
}
