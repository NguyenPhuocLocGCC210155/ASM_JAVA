/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Controller;
import Model.Bill;
import Model.Customer;
import Model.Room;
import Model.Staff;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import lib.XDate;

/**
 *
 * @author Hp
 */
public class Index extends javax.swing.JFrame {

    CardLayout cardLayout;
    CardLayout subCardLayout;
    DefaultTableModel tbModel;
    DefaultTableModel tbModelCus;
    DefaultTableModel tbModelBill;
    Controller mainc = null;
    int currentRow = -1;
    JComboBox<String>[] comboBoxes;
    JLabel[] labels;
    JButton[] buttons;
    DefaultComboBoxModel<String> model;
    BillInterface billInterface;

    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        initTableCustomer();
        initTable();
        initTableBill();
        mainc = new Controller();
        cardLayout = (CardLayout) JPRight.getLayout();
        subCardLayout = (CardLayout) JPHistoryContainer.getLayout();
        tbStaff.setDefaultEditor(Object.class, null);
        tbCus.setDefaultEditor(Object.class, null);
        tbBill.setDefaultEditor(Object.class, null);
        SetLogo();
        setImg();
        setLabel();
        setButtons();
        setComboboxes();
        System.out.println(mainc.file);
        if (mainc.file == false) {
            JOptionPane.showMessageDialog(this, "There are currently no staff");
        } else {
            fillToTable(mainc.staffList);
        }
        
        if (mainc.isCalendar == false) {
            JOptionPane.showMessageDialog(this, "There are currently no calendar");
            updateComboBoxModels();
        } else {
            loadSelectedValues();
        }
        if (mainc.isCustomers == true) {
            fillTableCustomer(mainc.customersList);
        }
        if (mainc.isBill == true) {
            fillTabeleBill();
        }
        createCalendarInterface();
        this.setLocationRelativeTo(null);
    }

    private void setLabel() {
        labels = new JLabel[8];
        labels[0] = jName1;
        labels[1] = jName2;
        labels[2] = jName3;
        labels[3] = jName4;
        labels[4] = jName5;
        labels[5] = jName6;
        labels[6] = jName7;
        labels[7] = jName8;
    }

    private void setImg() {
        Image i = new ImageIcon(Index.class.getResource("/Image/chair.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon iconChair = new ImageIcon(i);
        btn1.setIcon(iconChair);
        btn2.setIcon(iconChair);
        btn4.setIcon(iconChair);
        btn3.setIcon(iconChair);
        btn5.setIcon(iconChair);
        btn6.setIcon(iconChair);
        btn7.setIcon(iconChair);
        btn8.setIcon(iconChair);

        Image mirror = new ImageIcon(Index.class.getResource("/Image/mirro.png")).getImage().getScaledInstance(65, 70, Image.SCALE_SMOOTH);
        ImageIcon mirrorIcon = new ImageIcon(mirror);
        lb1.setIcon(mirrorIcon);
        lb2.setIcon(mirrorIcon);
        lb3.setIcon(mirrorIcon);
        lb4.setIcon(mirrorIcon);

        Image img1 = new ImageIcon(Index.class.getResource("/Image/oclock.jpg")).getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        Image img2 = new ImageIcon(Index.class.getResource("/Image/iconbar.png")).getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        Image img3 = new ImageIcon(Index.class.getResource("/Image/bullhead.png")).getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);

        ImageIcon icon1 = new ImageIcon(img1);
        ImageIcon icon2 = new ImageIcon(img2);
        ImageIcon icon3 = new ImageIcon(img3);

        lb5.setIcon(icon1);
        lb6.setIcon(icon2);
        lb7.setIcon(icon3);
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

        jLabel3 = new javax.swing.JLabel();
        JPContainAll = new javax.swing.JPanel();
        JPLeft = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        btnPaying = new javax.swing.JButton();
        btnCalendar = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        JPRight = new javax.swing.JPanel();
        JPPaying = new Room();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jName1 = new javax.swing.JLabel();
        jName2 = new javax.swing.JLabel();
        jName3 = new javax.swing.JLabel();
        jName4 = new javax.swing.JLabel();
        jName5 = new javax.swing.JLabel();
        jName6 = new javax.swing.JLabel();
        jName7 = new javax.swing.JLabel();
        jName8 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        JPCalendar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStaff = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        cb6 = new javax.swing.JComboBox<>();
        cb7 = new javax.swing.JComboBox<>();
        cb8 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        JPHistory = new javax.swing.JPanel();
        JPHistoryContainer = new javax.swing.JPanel();
        JPCustomer = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCus = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        btnAddCus = new javax.swing.JButton();
        txtCusPhone = new javax.swing.JTextField();
        txtPerTimes = new javax.swing.JTextField();
        btnEditCus = new javax.swing.JButton();
        btnRemoveCus = new javax.swing.JButton();
        JPBill = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBill = new javax.swing.JTable();
        btnCustomer1 = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPContainAll.setBackground(new java.awt.Color(255, 255, 255));

        JPLeft.setBackground(new java.awt.Color(255, 255, 255));
        JPLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPaying.setBackground(new java.awt.Color(0, 0, 0));
        btnPaying.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPaying.setForeground(new java.awt.Color(255, 255, 255));
        btnPaying.setText("PAYING");
        btnPaying.setBorder(null);
        btnPaying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayingActionPerformed(evt);
            }
        });

        btnCalendar.setBackground(new java.awt.Color(0, 0, 0));
        btnCalendar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCalendar.setForeground(new java.awt.Color(255, 255, 255));
        btnCalendar.setText("CALENDAR");
        btnCalendar.setBorder(null);
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });

        btnCustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnCustomer.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setText("HISTORY");
        btnCustomer.setBorder(null);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EXIT");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPLeftLayout = new javax.swing.GroupLayout(JPLeft);
        JPLeft.setLayout(JPLeftLayout);
        JPLeftLayout.setHorizontalGroup(
            JPLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPaying, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPLeftLayout.setVerticalGroup(
            JPLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLeftLayout.createSequentialGroup()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnPaying, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPRight.setBackground(new java.awt.Color(255, 255, 255));
        JPRight.setLayout(new java.awt.CardLayout());

        JPPaying.setBackground(new java.awt.Color(255, 255, 255));

        btn1.setBorder(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBorder(null);

        btn3.setBorder(null);

        btn4.setBorder(null);

        lb1.setMaximumSize(new java.awt.Dimension(50, 50));

        btn5.setBorder(null);

        btn6.setBorder(null);

        btn7.setBorder(null);

        btn8.setBorder(null);

        jName1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName1.setText("1");

        jName2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName2.setText("2");

        jName3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName3.setText("3");

        jName4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName4.setText("4");

        jName5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName5.setText("5");

        jName6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName6.setText("6");

        jName7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName7.setText("7");

        jName8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jName8.setText("8");

        javax.swing.GroupLayout JPPayingLayout = new javax.swing.GroupLayout(JPPaying);
        JPPaying.setLayout(JPPayingLayout);
        JPPayingLayout.setHorizontalGroup(
            JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPayingLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPayingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPPayingLayout.createSequentialGroup()
                                .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jName1)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPPayingLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPayingLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPPayingLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jName2))
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPPayingLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(JPPayingLayout.createSequentialGroup()
                                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jName3))
                                .addGap(40, 40, 40)
                                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jName4)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))))
                    .addGroup(JPPayingLayout.createSequentialGroup()
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jName5))
                        .addGap(40, 40, 40)
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jName6))
                        .addGap(40, 40, 40)
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jName7))
                        .addGap(40, 40, 40)
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jName8)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(132, Short.MAX_VALUE))))
        );
        JPPayingLayout.setVerticalGroup(
            JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPayingLayout.createSequentialGroup()
                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPayingLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPPayingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jName1)
                    .addComponent(jName2)
                    .addComponent(jName3)
                    .addComponent(jName4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jName5)
                    .addComponent(jName6)
                    .addComponent(jName7)
                    .addComponent(jName8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPPayingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );

        JPRight.add(JPPaying, "Paying");

        JPCalendar.setBackground(new java.awt.Color(255, 255, 255));

        tbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbStaffMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbStaffMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbStaff);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("StaffCode");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Phone");

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(0, 0, 0));
        btnRemove.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setText("Seat number 1");
        jLabel14.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setText("Seat number 2");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setText("Seat number 3");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setText("Seat number 4");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setText("Seat number 5");

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setText("Seat number 6");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel20.setText("Seat number 7");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel21.setText("Seat number 8");

        cb1.setName("cb1"); // NOI18N

        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setBorder(null);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPCalendarLayout = new javax.swing.GroupLayout(JPCalendar);
        JPCalendar.setLayout(JPCalendarLayout);
        JPCalendarLayout.setHorizontalGroup(
            JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
            .addGroup(JPCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCalendarLayout.createSequentialGroup()
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPCalendarLayout.createSequentialGroup()
                                .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPCalendarLayout.createSequentialGroup()
                                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                                .addComponent(txtCode))))
                                    .addGroup(JPCalendarLayout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67)
                                .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel18)))
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb1, 0, 200, Short.MAX_VALUE)
                            .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(JPCalendarLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPCalendarLayout.setVerticalGroup(
            JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPCalendarLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCalendarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPCalendarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(cb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JPRight.add(JPCalendar, "Calendar");

        JPHistory.setBackground(new java.awt.Color(255, 255, 255));

        JPHistoryContainer.setLayout(new java.awt.CardLayout());

        JPCustomer.setBackground(new java.awt.Color(204, 255, 255));

        tbCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbCusMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbCus);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Phone");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Times");

        btnAddCus.setBackground(new java.awt.Color(0, 0, 0));
        btnAddCus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnAddCus.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCus.setText("Add");
        btnAddCus.setBorder(null);
        btnAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCusActionPerformed(evt);
            }
        });

        txtPerTimes.setEditable(false);

        btnEditCus.setBackground(new java.awt.Color(0, 0, 0));
        btnEditCus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnEditCus.setForeground(new java.awt.Color(255, 255, 255));
        btnEditCus.setText("Edit");
        btnEditCus.setBorder(null);
        btnEditCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCusActionPerformed(evt);
            }
        });

        btnRemoveCus.setBackground(new java.awt.Color(0, 0, 0));
        btnRemoveCus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRemoveCus.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveCus.setText("Remove");
        btnRemoveCus.setBorder(null);
        btnRemoveCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPCustomerLayout = new javax.swing.GroupLayout(JPCustomer);
        JPCustomer.setLayout(JPCustomerLayout);
        JPCustomerLayout.setHorizontalGroup(
            JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(JPCustomerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPerTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCusPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addComponent(btnAddCus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEditCus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnRemoveCus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        JPCustomerLayout.setVerticalGroup(
            JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCusPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtPerTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddCus)
                        .addComponent(btnEditCus)
                        .addComponent(btnRemoveCus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPHistoryContainer.add(JPCustomer, "Customer");

        tbBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbBill);

        javax.swing.GroupLayout JPBillLayout = new javax.swing.GroupLayout(JPBill);
        JPBill.setLayout(JPBillLayout);
        JPBillLayout.setHorizontalGroup(
            JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        JPBillLayout.setVerticalGroup(
            JPBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPHistoryContainer.add(JPBill, "Bill");

        btnCustomer1.setBackground(new java.awt.Color(0, 0, 0));
        btnCustomer1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCustomer1.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer1.setText("Customer");
        btnCustomer1.setBorder(null);
        btnCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomer1ActionPerformed(evt);
            }
        });

        btnBill.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBill.setText("Bill");
        btnBill.setBorder(null);
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPHistoryLayout = new javax.swing.GroupLayout(JPHistory);
        JPHistory.setLayout(JPHistoryLayout);
        JPHistoryLayout.setHorizontalGroup(
            JPHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPHistoryLayout.createSequentialGroup()
                .addGroup(JPHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPHistoryContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPHistoryLayout.createSequentialGroup()
                        .addComponent(btnCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPHistoryLayout.setVerticalGroup(
            JPHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPHistoryLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JPHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(JPHistoryContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPRight.add(JPHistory, "cardHis");

        javax.swing.GroupLayout JPContainAllLayout = new javax.swing.GroupLayout(JPContainAll);
        JPContainAll.setLayout(JPContainAllLayout);
        JPContainAllLayout.setHorizontalGroup(
            JPContainAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPContainAllLayout.createSequentialGroup()
                .addComponent(JPRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPContainAllLayout.setVerticalGroup(
            JPContainAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPContainAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPContainAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        // TODO add your handling code here:
        cardLayout.show(JPRight, "Calendar");
        txtCode.setEditable(true);
    }//GEN-LAST:event_btnCalendarActionPerformed

    private void btnPayingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayingActionPerformed
        // TODO add your handling code here:
        cardLayout.show(JPRight, "Paying");
    }//GEN-LAST:event_btnPayingActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String code = txtCode.getText();
        String name = txtName.getText();
        String phone = txtPhone.getText();
        if ("".equals(code) || "".equals(name) || "".equals(phone)) {
            JOptionPane.showMessageDialog(this, "Field can not empty");
        } else {
            Staff s = new Staff(code, name, phone);
            checkFormStaff(code, phone, s);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        currentRow = tbStaff.getSelectedRow();
        if (currentRow >= 0) {
            int res = JOptionPane.showConfirmDialog(null, "Do you want to delete this staff, You must update the entire work schedule if you delete 1 employee ");
            if (res == 0) {
                mainc.staffList.remove(currentRow);
                resetForm(1);
                mainc.saveFile();
                fillToTable(mainc.staffList);
                mainc.calendarList.clear();
                updateComboBoxModels();
                mainc.saveCalendar();
                createCalendarInterface();
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tbStaffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStaffMousePressed
        // TODO add your handling code here:
        currentRow = tbStaff.getSelectedRow();
        showDetail(currentRow);
    }//GEN-LAST:event_tbStaffMousePressed

    private void tbStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStaffMouseEntered
        // TODO add your handling code here:
        resetForm(1);
        txtCode.setEditable(true);
    }//GEN-LAST:event_tbStaffMouseEntered

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveSelectedValues();
        setButtons();
        createCalendarInterface();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        mainc.calendarList.clear();
        updateComboBoxModels();
        mainc.saveCalendar();
        createCalendarInterface();
        setButtons();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomer1ActionPerformed
        // TODO add your handling code here:
        btnBill.setBackground(Color.white);
        btnBill.setForeground(Color.black);
        btnCustomer1.setBackground(Color.black);
        btnCustomer1.setForeground(Color.white);
        subCardLayout.show(JPHistoryContainer, "Customer");
    }//GEN-LAST:event_btnCustomer1ActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        cardLayout.show(JPRight, "cardHis");
        btnBill.setBackground(Color.white);
        btnBill.setForeground(Color.black);
        btnCustomer1.setBackground(Color.black);
        btnCustomer1.setForeground(Color.white);
        subCardLayout.show(JPHistoryContainer, "Customer");
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        // TODO add your handling code here:
        btnBill.setBackground(Color.black);
        btnBill.setForeground(Color.white);
        btnCustomer1.setBackground(Color.white);
        btnCustomer1.setForeground(Color.black);
        subCardLayout.show(JPHistoryContainer, "Bill");
    }//GEN-LAST:event_btnBillActionPerformed

    private void btnAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCusActionPerformed
        // TODO add your handling code here:
        if (!txtCusPhone.getText().equals("") && !txtCusName.getText().equals("")) {
            Customer cus = new Customer(txtCusName.getText(), txtCusPhone.getText(), 0);
            AddCustomer(txtCusPhone.getText(), txtCusName.getText(), cus);
        } else
            JOptionPane.showMessageDialog(this, "Field can not empty");
    }//GEN-LAST:event_btnAddCusActionPerformed

    private void tbCusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCusMousePressed
        // TODO add your handling code here:
        currentRow = tbCus.getSelectedRow();
        showCustomerDetail(currentRow);
    }//GEN-LAST:event_tbCusMousePressed

    private void btnRemoveCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCusActionPerformed
        // TODO add your handling code here:
        currentRow = tbCus.getSelectedRow();
        mainc.customersList.remove(currentRow);
        mainc.SaveCustomer();
        fillTableCustomer(mainc.customersList);
        resetForm(2);
    }//GEN-LAST:event_btnRemoveCusActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Do you want to update this staff, You must update the entire work schedule if you delete 1 employee ");
        if (res == 0) {
        UpdateStaff();
        fillToTable(mainc.staffList);
        mainc.saveFile();
        mainc.calendarList.clear();
        updateComboBoxModels();
        mainc.saveCalendar();
        createCalendarInterface();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnEditCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnEditCusActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void updateCus(){
        Customer c = mainc.customersList.get(currentRow);
        if (txtCusName.getText().equals("") || txtCusPhone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Empty Field");
        }
        else{
            c.setName(txtCusName.getText());
            c.setPhone(txtCusPhone.getText());
        }
    }
    
    private void UpdateStaff(){
        if (txtName.getText().equals("") || txtPhone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Empty Field");
        }
        else{
            Staff s = mainc.staffList.get(currentRow);
            s.setName(txtName.getText());
            s.setPhone(txtPhone.getText());
        }
    }
    
    private void AddCustomer(String phone, String name, Customer customer) {
        boolean phoneExists = false;
        if (!phone.matches("^0\\d{9}$")) {
            JOptionPane.showMessageDialog(this, "Wrong structure of phone number");
            return;
        } else {
            for (Customer c : mainc.customersList) {
                if (c.getPhone().equals(phone)) {
                    phoneExists = true;
                    break;
                }
            }
        }
        if (phoneExists == false) {
            mainc.customersList.add(customer);
            mainc.SaveCustomer();
            fillTableCustomer(mainc.customersList);
        } else {
            JOptionPane.showMessageDialog(this, "Existed phone");
        }
    }

    private void fillToTable(ArrayList<Staff> st) {
        tbModel.setRowCount(0);
        for (Staff s : st) {
            Object[] rows = new Object[]{s.getStaffCode(), s.getName(), s.getPhone()};
            tbModel.addRow(rows);
        }
    }

    private void fillTableCustomer(ArrayList<Customer> cus) {
        tbModelCus.setRowCount(0);
        for (Customer c : cus) {
            Object[] rows = new Object[]{c.getPhone(), c.getName(), c.getTimes()};
            tbModelCus.addRow(rows);
        }
    }
    
    private void fillTabeleBill(){
        tbModelBill.setRowCount(0);
        for (Bill b : mainc.billList) {
            Object[] rows = new Object[]{b.getCusName(), b.getSytleList(), b.getTotal(), b.getDate()};
            tbModelBill.addRow(rows);
        }
    }

    private void checkFormStaff(String code, String phone, Staff st) {
        boolean phoneExists = false;
        boolean codeExists = false;
        if (!code.matches("^0\\d{3}$")) {
            JOptionPane.showMessageDialog(this, "Wrong structure of staff code, it must be a sequence of 4 digits and start with 0");
            return;
        } else if (!phone.matches("^0\\d{9}$")) {
            JOptionPane.showMessageDialog(this, "Wrong structure of phone number");
            return;
        } else {
            for (Staff s : mainc.staffList) {
                if (s.getStaffCode().equals(code)) {
                    codeExists = true;
                    break;
                }
                if (s.getPhone().equals(phone)) {
                    phoneExists = true;
                    break;
                }
            }
        }
        if (codeExists == true) {
            JOptionPane.showMessageDialog(this, "Staff code already exists");
        }
        if (phoneExists == true) {
            JOptionPane.showMessageDialog(this, "Phone number code already exists");
        }
        if (codeExists == false && phoneExists == false) {
            mainc.staffList.add(st);
            mainc.saveFile();
            fillToTable(mainc.staffList);
            setComboboxes();
        }
    }

    private void showDetail(int r) {
        Staff s = mainc.staffList.get(r);
        String code = (String) tbStaff.getValueAt(r, 0);
        String name = (String) tbStaff.getValueAt(r, 1);
        String phone = (String) tbStaff.getValueAt(r, 2);
        txtCode.setText(code);
        txtName.setText(name);
        txtPhone.setText(phone);
        txtCode.setEditable(false);
    }

    private void showCustomerDetail(int r) {
        Customer c = mainc.customersList.get(r);
        String phone = (String) tbCus.getValueAt(r, 0);
        String name = (String) tbCus.getValueAt(r, 1);
        Integer times = (Integer) tbCus.getValueAt(r, 2);
        txtCusName.setText(name);
        txtCusPhone.setText(phone);
        txtPerTimes.setText(times + "");
    }

    private void resetForm(int r) {
        if (r == 1) {
            txtCode.setText("");
            txtName.setText("");
            txtPhone.setText("");
        } else if (r == 2) {
            txtCusName.setText("");
            txtCusPhone.setText("");
            txtPerTimes.setText("");
        }
    }

    private void initTable() {
        String[] columnNames = {"ID", "Name", "Phone"};
        tbModel = new DefaultTableModel(columnNames, 0);
        tbStaff.setModel(tbModel);
    }
    
    private void initTableBill(){
        String[] columnNames = {"Customer", "Stylelist", "Total", "Date"};
        tbModelBill = new DefaultTableModel(columnNames, 0);
        tbBill.setModel(tbModelBill);
    }

    private void initTableCustomer() {
        String[] columnCustomer = {"Phone", "Name", "Times"};
        tbModelCus = new DefaultTableModel(columnCustomer, 0);
        tbCus.setModel(tbModelCus);
    }

    private void setComboboxes() {
        comboBoxes = new JComboBox[8];
        comboBoxes[0] = (JComboBox<String>) cb1;
        comboBoxes[1] = (JComboBox<String>) cb2;
        comboBoxes[2] = (JComboBox<String>) cb3;
        comboBoxes[3] = (JComboBox<String>) cb4;
        comboBoxes[4] = (JComboBox<String>) cb5;
        comboBoxes[5] = (JComboBox<String>) cb6;
        comboBoxes[6] = (JComboBox<String>) cb7;
        comboBoxes[7] = (JComboBox<String>) cb8;
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Kiểm tra khi một nhân viên đã được chọn ở một JComboBox
                    for (JComboBox<String> cb : comboBoxes) {
                        if (!cb.equals(comboBox) && comboBox.getSelectedItem() != null
                                && comboBox.getSelectedItem().equals(cb.getSelectedItem())) {
                            if (comboBox.getSelectedItem().equals("Choose an staff")) {
                                return;
                            } else {
                                mainc.calendarList.add(comboBox.getSelectedItem().toString());
                                int result = JOptionPane.showConfirmDialog(null, "The staff has been selected in another chair! Do you still want the staff to take over this chair?", "Confirmation", JOptionPane.YES_NO_OPTION);
                                if (result == JOptionPane.YES_OPTION) {
                                    return; // Giữ nguyên giá trị trong JComboBox hiện tại
                                } else {
                                    comboBox.setSelectedIndex(0); // Reset lại giá trị trong JComboBox hiện tại
                                    return;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    private void setButtons() {
        buttons = new JButton[8];
        buttons[0] = btn1;
        buttons[1] = btn2;
        buttons[2] = btn3;
        buttons[3] = btn4;
        buttons[4] = btn5;
        buttons[5] = btn6;
        buttons[6] = btn7;
        buttons[7] = btn8;
        for (int i = 0; i < buttons.length; i++) {
            final int currentIndex = i; // Khai báo biến trung gian để giữ giá trị của i
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    makeBill(currentIndex); // Truyền giá trị của currentIndex vào makeBill()
                }
            });
        }
    }

    private void updateComboBoxModels() {
        // Thêm model vào từng JComboBox
        for (int i = 0; i < comboBoxes.length; i++) {
            model = new DefaultComboBoxModel<>();
            model.addElement("Choose an staff");
            for (Staff staff : mainc.staffList) {
                model.addElement(staff.getName());
            }
            comboBoxes[i].setModel(model);
        }
    }

    private void updateComboBoxModels(int i) {
        // Thêm model vào từng JComboBox
        model = new DefaultComboBoxModel<>();
        model.addElement("Choose an staff");
        for (Staff staff : mainc.staffList) {
            model.addElement(staff.getName());
            comboBoxes[i].setModel(model);
        }
    }

    private void saveSelectedValues() {
        mainc.calendarList.clear();
        for (int i = 0; i < comboBoxes.length; i++) {
            String selectedValue = (String) comboBoxes[i].getSelectedItem();
            if (!selectedValue.equals("Choose an staff")) {
                mainc.calendarList.add(selectedValue);
            } else {
                mainc.calendarList.add(""); // Thêm giá trị rỗng vào mainc.calendarList
            }
        }
        mainc.saveCalendar();
    }

    private void loadSelectedValues() {
        for (int i = 0; i < comboBoxes.length; i++) {
            model = new DefaultComboBoxModel<>();
            if (i < mainc.calendarList.size()) { // Kiểm tra nếu i < kích thước của danh sách
                String selectedValue = mainc.calendarList.get(i);
                if (!selectedValue.equals("")) {
                    model.addElement(selectedValue);
                } else {
                    model.addElement("Empty"); // Set lại giá trị đặc biệt vào JComboBox
                    updateComboBoxModels(i);
                }
            } else {
                model.addElement("Empty"); // Thêm giá trị đặc biệt vào danh sách
                updateComboBoxModels(i);
            }
            comboBoxes[i].setModel(model);
        }
    }

    private void createCalendarInterface() {
        for (int i = 0; i < comboBoxes.length; i++) {
            if (!comboBoxes[i].getSelectedItem().equals("Choose an staff") && !comboBoxes[i].getSelectedItem().equals("Empty")) {
                labels[i].setText(comboBoxes[i].getSelectedItem().toString().substring(comboBoxes[i].getSelectedItem().toString().lastIndexOf(" ") + 1));
            } else {
                labels[i].setText(i + 1 + "");
            }
        }
    }

    private void makeBill(int i) {
        if (!comboBoxes[i].getSelectedItem().toString().equals("Choose an staff")) {
            BillInterface r = null;
            r = new BillInterface(comboBoxes[i].getSelectedItem().toString(), this);
            r.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There are no employees working here");
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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPBill;
    private javax.swing.JPanel JPCalendar;
    private javax.swing.JPanel JPContainAll;
    private javax.swing.JPanel JPCustomer;
    private javax.swing.JPanel JPHistory;
    private javax.swing.JPanel JPHistoryContainer;
    private javax.swing.JPanel JPLeft;
    public static javax.swing.JPanel JPPaying;
    private javax.swing.JPanel JPRight;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCus;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnCustomer1;
    private javax.swing.JButton btnEditCus;
    private javax.swing.JButton btnPaying;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRemoveCus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JComboBox<String> cb7;
    private javax.swing.JComboBox<String> cb8;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jName1;
    private javax.swing.JLabel jName2;
    private javax.swing.JLabel jName3;
    private javax.swing.JLabel jName4;
    private javax.swing.JLabel jName5;
    private javax.swing.JLabel jName6;
    private javax.swing.JLabel jName7;
    private javax.swing.JLabel jName8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JTable tbBill;
    private javax.swing.JTable tbCus;
    private javax.swing.JTable tbStaff;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusPhone;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPerTimes;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
