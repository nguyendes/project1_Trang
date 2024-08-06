/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ChiTietSP;
import model.SanPham;
import service.ChiTietSanPhamService;

/**
 *
 * @author Admin
 */
public class CTSP extends javax.swing.JFrame {
 private ChiTietSanPhamService ct = new ChiTietSanPhamService();
    private List<ChiTietSP> list = new ArrayList<>();
    private DefaultTableModel dtm = new DefaultTableModel();
    /**
     * Creates new form CTSP
     */
    public CTSP() {
        initComponents();
        this.fillTable();
    }
     public void fillTable(){
        list = ct.getAllCTSP();
        dtm = (DefaultTableModel) tblSPCT.getModel();
        dtm.setRowCount(0);
        for (ChiTietSP chi : list) {
            dtm.addRow(chi.toRowTable());
        }
    }
      public void clear(){
        txtMa.setText("");
        txtTen.setText("");
        txtGia.setText("");
        txtSL.setText("");
        cbbChatlieu.setSelectedIndex(-1);
        cbbKichThuoc.setSelectedIndex(-1);
        cbbMauSac.setSelectedIndex(-1);
        rdoCon.setSelected(true);
      
       
    }  
      
      public ChiTietSP readForm(){
        ChiTietSP ct = new ChiTietSP();
        ct.setMaSPCT(txtMa.getText());
        ct.setTenSP(txtTen.getText());
        ct.setGia(Float.valueOf(txtGia.getText()));
        ct.setSoLuong(Integer.parseInt(txtSL.getText()));
        ct.setChatLieu(cbbChatlieu.getSelectedItem().toString());
        ct.setKichThuoc(cbbKichThuoc.getSelectedItem().toString());
        ct.setMauSac(cbbMauSac.getSelectedItem().toString());
         if(rdoCon.isSelected()){
            ct.setTrangThai(1);
        }
        if(rdoHet.isSelected()){
            ct.setTrangThai(0);
        }
        return ct;
    }
       public void fillForm(ChiTietSP ctsp){
        txtMa.setText(ctsp.getMaSPCT());
        txtTen.setText(ctsp.getTenSP());
        txtGia.setText(String.valueOf(ctsp.getGia()));
        txtSL.setText(String.valueOf(ctsp.getSoLuong()));
        cbbChatlieu.setSelectedIndex(cbbChatlieu.getSelectedItem().toString());
        cbbKichThuoc.setSelectedIndex(cbbKichThuoc.getSelectedItem().toString());
        cbbMauSac.setSelectedIndex(cbbMauSac.getSelectedItem().toString());
         
         if(rdoCon.isSelected()){
            ct.setTrangThai(1);
        }
        if(rdoHet.isSelected()){
            ct.setTrangThai(0);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSPCT = new javax.swing.JTable();
        lblMAct = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        lblSL = new javax.swing.JLabel();
        lblChatlieu = new javax.swing.JLabel();
        lblMauSac = new javax.swing.JLabel();
        lblKT = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        cbbChatlieu = new javax.swing.JComboBox<>();
        cbbMauSac = new javax.swing.JComboBox<>();
        cbbKichThuoc = new javax.swing.JComboBox<>();
        rdoCon = new javax.swing.JRadioButton();
        rdoHet = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblSPCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SPCT", "Tên SP", "Giá", "Số lượng", "Chất liệu", "Màu sắc ", "Kích Thước", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(tblSPCT);

        lblMAct.setText("Mã SPCT");

        lblTen.setText("Tên SP");

        lblGia.setText("Giá");

        lblSL.setText("Số lượng");

        lblChatlieu.setText("Chất liệu");

        lblMauSac.setText("Màu săc");

        lblKT.setText("Kích thước");

        lblTrangThai.setText("Trạng thái");

        cbbChatlieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chất nỉ", "Chất cotton", "Chất Len", "Chất lụa", "Chất kaki" }));

        cbbMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xanh", "Đỏ", "Đen", "Trắng", "Hồng", "Tím" }));

        cbbKichThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));

        buttonGroup1.add(rdoCon);
        rdoCon.setText("Còn hàng");

        buttonGroup1.add(rdoHet);
        rdoHet.setText("Hết hàng");

        btnThem.setText("Thêm");

        btnSua.setText("Cập nhật");

        btnnew.setText("Làm mới");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblSL, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChatlieu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMauSac, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMAct, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoCon, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(rdoHet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMa, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(txtTen)
                    .addComponent(txtGia)
                    .addComponent(txtSL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbbKichThuoc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbMauSac, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbChatlieu, javax.swing.GroupLayout.Alignment.LEADING, 0, 104, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnnew))
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMAct)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGia)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSL)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChatlieu)
                            .addComponent(cbbChatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnnew)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMauSac)
                    .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKT)
                    .addComponent(cbbKichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai)
                    .addComponent(rdoCon)
                    .addComponent(rdoHet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CTSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CTSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnnew;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChatlieu;
    private javax.swing.JComboBox<String> cbbKichThuoc;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChatlieu;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblKT;
    private javax.swing.JLabel lblMAct;
    private javax.swing.JLabel lblMauSac;
    private javax.swing.JLabel lblSL;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoHet;
    private javax.swing.JTable tblSPCT;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
