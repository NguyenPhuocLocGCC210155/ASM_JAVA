/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Controller;
import Model.Bill;
import Model.Customer;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hp
 */
public class BillInterface extends javax.swing.JFrame {

    double total;
    int hairCut = 60000;
    int normalBen = 180000;
    int hightBen = 360000;
    int dying = 120000;
    CardLayout cardLayout;
    Controller mainc = new Controller();
    boolean isNormal = false;
    boolean isHight = false;
    int ben = 0;
    boolean IsCuscomter = false;
    String styleList = "";

    /**
     * Creates new form Bill
     */
    public BillInterface() {
        initComponents();
        SetLogo();
        cardLayout = (CardLayout) JPContainer.getLayout();
        Image i = new ImageIcon(Index.class.getResource("/Image/barber.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon iconbar = new ImageIcon(i);
        lbLogoBill.setIcon(iconbar);
        this.setLocationRelativeTo(null);
    }

    JFrame frontScreen;

    public BillInterface(String styleList, Index aThis) {
        initComponents();
        SetLogo();
        this.styleList = styleList;
        frontScreen = aThis;
        cardLayout = (CardLayout) JPContainer.getLayout();
        Image i = new ImageIcon(Index.class.getResource("/Image/barber.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon iconbar = new ImageIcon(i);
        lbLogoBill.setIcon(iconbar);
        this.setLocationRelativeTo(null);
    }

    public void SetLogo() {
        String imagePath = "./src/Image/barber.png";
        ImageIcon icon = new ImageIcon(imagePath);
        int imageWidth = icon.getIconWidth();
        int imageHeight = icon.getIconHeight();
        int labelWidth = lbLogo.getWidth();
        int labelHeight = lbLogo.getHeight();
        double widthRatio = (double) labelWidth / imageWidth;
        double heightRatio = (double) labelHeight / imageHeight;
        double ratio = Math.min(widthRatio, heightRatio);
        int newImageWidth = (int) (imageWidth * ratio);
        int newImageHeight = (int) (imageHeight * ratio);
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(newImageWidth, newImageHeight, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        lbLogo.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBending = new javax.swing.ButtonGroup();
        btnDying = new javax.swing.ButtonGroup();
        JPContainer = new javax.swing.JPanel();
        JPBill = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rdNormal = new javax.swing.JRadioButton();
        rdHight = new javax.swing.JRadioButton();
        cbDying = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cbHairCut = new javax.swing.JCheckBox();
        JPDetail = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbLogoBill = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIsHairCut = new javax.swing.JLabel();
        txtIsBending = new javax.swing.JLabel();
        txtIsDying = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtStylist = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTimes = new javax.swing.JLabel();
        txtTotalBill = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPContainer.setLayout(new java.awt.CardLayout());

        JPBill.setBackground(new java.awt.Color(255, 255, 255));
        JPBill.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Create Invoice");

        btnBending.add(rdNormal);
        rdNormal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rdNormal.setText("Normal bending");
        rdNormal.setActionCommand("nor");
        rdNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNormalActionPerformed(evt);
            }
        });

        btnBending.add(rdHight);
        rdHight.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rdHight.setText("Premium bending");
        rdHight.setActionCommand("high");
        rdHight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHightActionPerformed(evt);
            }
        });

        cbDying.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cbDying.setText("Is hair dying");
        cbDying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDyingActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("Total:");

        txtTotal.setText("0.0");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Make Bill");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Phone ");

        jLabel5.setText("Name");

        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneFocusLost(evt);
            }
        });

        txtName.setEditable(false);

        cbHairCut.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cbHairCut.setText("Hair Cut");
        cbHairCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHairCutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPBillLayout = new javax.swing.GroupLayout(JPBill);
        JPBill.setLayout(JPBillLayout);
        JPBillLayout.setHorizontalGroup(
            JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPBillLayout.createSequentialGroup()
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(JPBillLayout.createSequentialGroup()
                        .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPBillLayout.createSequentialGroup()
                                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdNormal)
                                    .addComponent(cbDying)
                                    .addComponent(cbHairCut)
                                    .addGroup(JPBillLayout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(rdHight)))
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBillLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPBillLayout.createSequentialGroup()
                                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)
                                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        JPBillLayout.setVerticalGroup(
            JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBillLayout.createSequentialGroup()
                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPBillLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(JPBillLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHairCut))
                .addGap(18, 18, 18)
                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdNormal)
                    .addComponent(rdHight)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDying)
                    .addComponent(jLabel3)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        JPContainer.add(JPBill, "Bill");

        JPDetail.setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("LOSKY BARBER BILL");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setText("Date:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Stylelist:");
        jLabel10.setAutoscrolls(true);

        txtDate.setText("1");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("Customer");
        jLabel11.setToolTipText("");
        jLabel11.setAutoscrolls(true);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Service:");
        jLabel12.setToolTipText("");
        jLabel12.setAutoscrolls(true);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setText("Current times");
        jLabel14.setToolTipText("");
        jLabel14.setAutoscrolls(true);

        jLabel15.setText("60000 VND discount for customers who have cut their hair at the salon 6 times");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setText("Total: ");
        jLabel18.setToolTipText("");
        jLabel18.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogoBill, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIsHairCut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtStylist, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIsBending, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtIsDying, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(265, 265, 265)))
                        .addContainerGap(39, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogoBill, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIsHairCut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIsBending, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtIsDying, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDate))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout JPDetailLayout = new javax.swing.GroupLayout(JPDetail);
        JPDetail.setLayout(JPDetailLayout);
        JPDetailLayout.setHorizontalGroup(
            JPDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDetailLayout.createSequentialGroup()
                .addGroup(JPDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPDetailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(JPDetailLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        JPDetailLayout.setVerticalGroup(
            JPDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPContainer.add(JPDetail, "Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Customer currentCus = null;
        boolean[] isService = new boolean[2];
        isService[0] = cbHairCut.isSelected();
        isService[1] = cbDying.isSelected();
        String cusPhone = txtPhone.getText();
        String cusName = txtName.getText();
        try{
        Double total = Double.parseDouble(txtTotal.getText());
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "You can not change total");
        }
        if (isService[0] == false && isService[1] == false && ben == 0) {
            JOptionPane.showMessageDialog(this, "Do not have any service");
        } else if (cusName.equals("") || cusPhone.equals("")) {
            JOptionPane.showMessageDialog(this, "Field empty");
        } else {
            if (IsCuscomter == false) {
                Customer cus = new Customer(txtName.getText(), txtPhone.getText(), 1);
                mainc.customersList.add(cus);
                currentCus = mainc.customersList.get(mainc.customersList.size() - 1);
                mainc.SaveCustomer();
            } else {
                for (Customer c : mainc.customersList) {
                    if (c.getPhone().equals(txtPhone.getText())) {
                        txtName.setText(c.getName());
                        c.setTimes(c.getTimes() + 1);
                        mainc.SaveCustomer();
                        currentCus = c;
                        IsCuscomter = true;
                        break;
                    } else {
                        txtName.setEditable(true);
                        IsCuscomter = false;
                    }
                }
            }
            setBill(styleList, cusName, isService, ben, total, currentCus);
            cardLayout.show(JPContainer, "Detail");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbHairCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHairCutActionPerformed
        // TODO add your handling code here:
        if (cbHairCut.isSelected()) {
            total += hairCut;
            txtTotal.setText(total + "");
        } else {
            total -= hairCut;
            txtTotal.setText(total + "");
        }
    }//GEN-LAST:event_cbHairCutActionPerformed

    private void txtPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusLost
        // TODO add your handling code here:
        if (txtPhone.getText().matches("^0\\d{9}$")) {
            for (Customer c : mainc.customersList) {
                if (c.getPhone().equals(txtPhone.getText())) {
                    txtName.setText(c.getName());
                    IsCuscomter = true;
                    break;
                } else {
                    txtName.setEditable(true);
                    IsCuscomter = false;
                }
            }
        } else if (txtPhone.getText().equals("")) {
            IsCuscomter = false;
        } else {
            txtName.setText("");
            IsCuscomter = false;
            JOptionPane.showMessageDialog(this, "Wrong structure of phone number");
        }

    }//GEN-LAST:event_txtPhoneFocusLost

    private void cbDyingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDyingActionPerformed
        // TODO add your handling code here:
        if (cbDying.isSelected()) {
            total += dying;
            txtTotal.setText(total + "");
        } else {
            total -= dying;
            txtTotal.setText(total + "");
        }
    }//GEN-LAST:event_cbDyingActionPerformed

    private void rdNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNormalActionPerformed
        // TODO add your handling code here:
        if (isNormal) {
            btnBending.clearSelection();
            isNormal = false;
            total -= normalBen;
            ben = 0;
            txtTotal.setText(total + "");
        } else {
            isNormal = true;
            if (isHight) {
                total -= hightBen;
                ben = 0;
                isHight = false;
            }
            ben = 1;
            total += normalBen; // Tăng giá trị của total tương ứng với normalBen
            txtTotal.setText(total + "");
        }
    }//GEN-LAST:event_rdNormalActionPerformed

    private void rdHightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHightActionPerformed
        // TODO add your handling code here:
        if (isHight) {
            btnBending.clearSelection();
            isHight = false;
            total -= hightBen;
            ben = 0;
            txtTotal.setText(total + "");
        } else {
            isHight = true;
            if (isNormal) {
                total -= normalBen;
                ben = 0;
                isNormal = false;
            }
            ben = 2;
            total += hightBen; // Tăng giá trị của total tương ứng với hightBen
            txtTotal.setText(total + "");
        }
    }//GEN-LAST:event_rdHightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardLayout.show(JPContainer, "Bill");
        cbHairCut.setSelected(false);
        cbDying.setSelected(false);
        btnBending.clearSelection();
        txtName.setText("");
        txtPhone.setText("");
        txtTotal.setText("");
        total = 0;
    }//GEN-LAST:event_btnBackActionPerformed

    private void setBill(String styleList, String cusName, boolean[] service, int ben, double total, Customer customer) {
        txtCustomer.setText(cusName);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDate = currentDate.format(dateFormatter);
        txtCustomer.setText(cusName);
        txtStylist.setText(styleList);
        txtDate.setText(formatDate);
        txtTimes.setText(customer.getTimes().toString());
        if (service[0]) {
            txtIsHairCut.setText("Haircut 60.000 VND");
        }
        if (service[1]) {
            txtIsDying.setText("Dying 120.000 VND");
        }
        if (ben == 0) {
        } else if (ben == 1) {
            txtIsBending.setText("Normal bending 180.00 VND");
        } else {
            txtIsBending.setText("Premium bending 360.000");
        }
        if (customer.getTimes() >= 6) {
            customer.setTimes(0);
            mainc.SaveCustomer();
            double totalAfter = total - 60000;
            String totalString = total + " - 60000 = " + totalAfter;
            txtTotalBill.setText(totalString);
        } else {
            txtTotalBill.setText(total + "");
        }
        Bill bill = new Bill(ben, total, cusName, styleList, formatDate, service);
        mainc.billList.add(bill);
        mainc.SaveBill();
        printBill();
    }

    private void printBill() {
        Container container = this.getContentPane();

// Lấy panel cần thiết từ container
        JPanel panel = jPanel1;

// Cập nhật giá trị cho các thành phần trong panel
// ...
// Tạo file PDF và in panel vào file đó
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\bill.pdf"));
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            PdfTemplate template = contentByte.createTemplate(panel.getWidth(), panel.getHeight());
            Graphics2D g2 = template.createGraphics(panel.getWidth(), panel.getHeight());

            // Thiết lập đối tượng Graphics2D để sử dụng Font render context
            // của panel để đảm bảo rằng font và kích thước của nó đồng nhất
            // với giao diện hiển thị
            panel.printAll(g2);
            g2.dispose();

            // Tính toán vị trí của panel trong trang PDF để căn giữa
            float pdfPanelWidth = panel.getWidth();
            float pdfPanelHeight = panel.getHeight();
            float pdfPageWidth = document.getPageSize().getWidth();
            float pdfPageHeight = document.getPageSize().getHeight();
            float pdfPanelX = (pdfPageWidth - pdfPanelWidth) / 2;
            float pdfPanelY = (pdfPageHeight - pdfPanelHeight) / 2;

            // Vẽ panel vào file PDF với vị trí căn giữa
            contentByte.addTemplate(template, pdfPanelX, pdfPanelY);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }
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
            java.util.logging.Logger.getLogger(BillInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPBill;
    private javax.swing.JPanel JPContainer;
    private javax.swing.JPanel JPDetail;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup btnBending;
    private javax.swing.ButtonGroup btnDying;
    private javax.swing.JCheckBox cbDying;
    private javax.swing.JCheckBox cbHairCut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbLogoBill;
    private javax.swing.JRadioButton rdHight;
    private javax.swing.JRadioButton rdNormal;
    private javax.swing.JLabel txtCustomer;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtIsBending;
    private javax.swing.JLabel txtIsDying;
    private javax.swing.JLabel txtIsHairCut;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JLabel txtStylist;
    private javax.swing.JLabel txtTimes;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtTotalBill;
    // End of variables declaration//GEN-END:variables

}
