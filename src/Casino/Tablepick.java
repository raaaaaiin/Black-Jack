/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Reyn
 */
public class Tablepick extends javax.swing.JFrame {

    int speed;
    Timer a;
    int k;
    int bet = 0;

    /**
     * Creates new form Bet
     */
    public Tablepick() {

        /*BlackJack Init = new BlackJack();
         Authentication auth = new Authentication();
         BlackJackFunction bjfunc = new BlackJackFunction();
         auth.Dir();
         Init.Initialize();*/
        BlackJack Init = new BlackJack();
        Authentication auth = new Authentication();
        BlackJackFunction bjfunc = new BlackJackFunction();
        BlackJack func = new BlackJack();
        
        Init.Initialize();
        initComponents();
        jPanel2.setBackground(new Color(0, 0, 0, 120));
        jPanel3.setBackground(new Color(0, 0, 0, 120));
        jPanel4.setBackground(new Color(0, 0, 0, 120));
        int z = func.one.GameSpeed;
        if (z == 1000) {
            jSlider1.setValue(0);
        } else if (z == 750) {
            jSlider1.setValue(1);
        } else if (z == 500) {
            jSlider1.setValue(2);
        } else if (z == 250) {
            jSlider1.setValue(3);
        }
        int value = (func.one.exp * 100) / (func.one.requirement);
        jLabel44.setText("$: " + String.valueOf(func.one.Money));
        jProgressBar1.setValue(value);
        jProgressBar1.setToolTipText("Level: " + String.valueOf(func.one.level));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel44 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setOpaque(false);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 50, 50));

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 53, 235, 378));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 53, 277, 378));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 53, 232, 378));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(23, 23, 23));
        jProgressBar1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(103, 65, 114));
        jProgressBar1.setToolTipText("0");
        jProgressBar1.setValue(10);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 13, -1, -1));

        jLabel44.setBackground(new java.awt.Color(30, 30, 30));
        jLabel44.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("jLabel8");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 30));

        jTextField3.setBackground(new java.awt.Color(23, 23, 23));
        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 3, 30));

        jTextField1.setBackground(new java.awt.Color(23, 23, 23));
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 3));

        jPanel7.setBackground(new java.awt.Color(25, 25, 25));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 30));

        jSlider1.setBackground(new java.awt.Color(23, 23, 23));
        jSlider1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(23, 23, 23));
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(4);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(0);
        jSlider1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game Speed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jSlider1.setOpaque(false);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 220, 60));

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Hard");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 53, 230, 50));

        jLabel32.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Table with high bet");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 230, -1));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Players and the Dealers ");
        jLabel33.setToolTipText("");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 230, -1));

        jLabel34.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("are more strategic and ");
        jLabel34.setToolTipText("");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 230, 20));

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Do not want to risk their bet");
        jLabel35.setToolTipText("");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 230, -1));

        jLabel36.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Available Bets");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 230, -1));

        jLabel37.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("$: 12,500");
        jLabel37.setToolTipText("");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 190, -1));

        jLabel38.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("$: 15,000");
        jLabel38.setToolTipText("");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 190, -1));

        jLabel39.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("$: 20,000");
        jLabel39.setToolTipText("");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 190, -1));

        jLabel40.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("$: 40,000");
        jLabel40.setToolTipText("");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 190, -1));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Requirement");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 230, -1));

        jLabel42.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Level 15");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 230, 50));

        jLabel43.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setToolTipText("");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 150, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Normal");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 53, 270, 50));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Table with larger bet");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 270, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Players and the Dealers ");
        jLabel21.setToolTipText("");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("are more ");
        jLabel22.setToolTipText("");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 270, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Precise on their decision!");
        jLabel23.setToolTipText("");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 270, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Available Bets");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 270, -1));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("$: 1,500");
        jLabel25.setToolTipText("");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 180, -1));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("$: 2,500");
        jLabel26.setToolTipText("");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 180, -1));

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("$: 5,000");
        jLabel27.setToolTipText("");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 180, -1));

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("$: 10,000");
        jLabel28.setToolTipText("");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 180, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Requirement");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 270, -1));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Level 10");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 270, 50));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Available Bets");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("$: 100");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Requirement");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Level 0");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 240, 50));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Table with low Bet");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 20));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("$: 1,000");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Risk Taker than ever!");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("$: 500");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Easy");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 240, 50));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("$: 10");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Players and the Dealers ");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("are more ");
        jLabel18.setToolTipText("");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Betpick.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        maximize(jPanel2, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18);

    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        minimize(jPanel2, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        maximize(jPanel3, jLabel19, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel30);

    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        minimize(jPanel3, jLabel19, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel30);

    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
       BlackJack func = new BlackJack();
        if(func.one.level > 10){
            this.dispose();
            BetHard hard = new BetHard();
            hard.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(null,"Insuficient Level");
        }


    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        maximize(jPanel4, jLabel31, jLabel32, jLabel33, jLabel34, jLabel35, jLabel36, jLabel37, jLabel38, jLabel39, jLabel40, jLabel41, jLabel42);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        minimize(jPanel4, jLabel31, jLabel32, jLabel33, jLabel34, jLabel35, jLabel36, jLabel37, jLabel38, jLabel39, jLabel40, jLabel41, jLabel42);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
BlackJack func = new BlackJack();
        if(func.one.level > -1){
            this.dispose();
            BetEasy easy = new BetEasy();
            easy.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(null,"Insuficient Level");
        }


    }//GEN-LAST:event_jPanel2MouseClicked

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        BlackJack func = new BlackJack();
        int x = jSlider1.getValue();
        func.one.GameSpeed = Speedtest(x);

    }//GEN-LAST:event_jSlider1StateChanged

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        BlackJack func = new BlackJack();
        if(func.one.level > 15){
            this.dispose();
            BetNormal Normal = new BetNormal();
            Normal.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(null,"Insuficient Level");
        }

        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
       this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

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
            java.util.logging.Logger.getLogger(Tablepick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablepick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablepick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablepick.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablepick().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
public void maximize(javax.swing.JPanel z, javax.swing.JLabel a, javax.swing.JLabel b, javax.swing.JLabel c,
            javax.swing.JLabel d, javax.swing.JLabel e, javax.swing.JLabel f, javax.swing.JLabel g,
            javax.swing.JLabel h, javax.swing.JLabel i, javax.swing.JLabel j, javax.swing.JLabel k,
            javax.swing.JLabel l) {
        z.setBackground(new Color(0, 0, 0, 0));
        Font currentFont = a.getFont();
        Font currentFont1 = b.getFont();
        Font currentFont2 = c.getFont();
        Font currentFont3 = d.getFont();
        Font currentFont4 = e.getFont();
        Font currentFont5 = f.getFont();
        Font currentFont6 = g.getFont();
        Font currentFont7 = h.getFont();
        Font currentFont8 = i.getFont();
        Font currentFont9 = j.getFont();
        Font currentFont10 = k.getFont();
        Font currentFont11 = l.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 2f);
        Font newFont1 = currentFont.deriveFont(currentFont1.getSize() + 2f);
        Font newFont2 = currentFont.deriveFont(currentFont2.getSize() + 2f);
        Font newFont3 = currentFont.deriveFont(currentFont3.getSize() + 2f);
        Font newFont4 = currentFont.deriveFont(currentFont4.getSize() + 2f);
        Font newFont5 = currentFont.deriveFont(currentFont5.getSize() + 2f);
        Font newFont6 = currentFont.deriveFont(currentFont6.getSize() + 2f);
        Font newFont7 = currentFont.deriveFont(currentFont7.getSize() + 2f);
        Font newFont8 = currentFont.deriveFont(currentFont8.getSize() + 2f);
        Font newFont9 = currentFont.deriveFont(currentFont9.getSize() + 2f);
        Font newFont10 = currentFont.deriveFont(currentFont10.getSize() + 2f);
        Font newFont11 = currentFont.deriveFont(currentFont11.getSize() + 2f);
        a.setFont(newFont);
        b.setFont(newFont1);
        c.setFont(newFont2);
        d.setFont(newFont3);
        e.setFont(newFont4);
        f.setFont(newFont5);
        g.setFont(newFont6);
        h.setFont(newFont7);
        i.setFont(newFont8);
        j.setFont(newFont9);
        k.setFont(newFont10);
        l.setFont(newFont11);
    }

    public void minimize(javax.swing.JPanel z, javax.swing.JLabel a, javax.swing.JLabel b, javax.swing.JLabel c,
            javax.swing.JLabel d, javax.swing.JLabel e, javax.swing.JLabel f, javax.swing.JLabel g,
            javax.swing.JLabel h, javax.swing.JLabel i, javax.swing.JLabel j, javax.swing.JLabel k,
            javax.swing.JLabel l) {
        z.setBackground(new Color(0, 0, 0, 120));
        Font currentFont = a.getFont();
        Font currentFont1 = b.getFont();
        Font currentFont2 = c.getFont();
        Font currentFont3 = d.getFont();
        Font currentFont4 = e.getFont();
        Font currentFont5 = f.getFont();
        Font currentFont6 = g.getFont();
        Font currentFont7 = h.getFont();
        Font currentFont8 = i.getFont();
        Font currentFont9 = j.getFont();
        Font currentFont10 = k.getFont();
        Font currentFont11 = l.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() - 2f);
        Font newFont1 = currentFont.deriveFont(currentFont1.getSize() - 2f);
        Font newFont2 = currentFont.deriveFont(currentFont2.getSize() - 2f);
        Font newFont3 = currentFont.deriveFont(currentFont3.getSize() - 2f);
        Font newFont4 = currentFont.deriveFont(currentFont4.getSize() - 2f);
        Font newFont5 = currentFont.deriveFont(currentFont5.getSize() - 2f);
        Font newFont6 = currentFont.deriveFont(currentFont6.getSize() - 2f);
        Font newFont7 = currentFont.deriveFont(currentFont7.getSize() - 2f);
        Font newFont8 = currentFont.deriveFont(currentFont8.getSize() - 2f);
        Font newFont9 = currentFont.deriveFont(currentFont9.getSize() - 2f);
        Font newFont10 = currentFont.deriveFont(currentFont10.getSize() - 2f);
        Font newFont11 = currentFont.deriveFont(currentFont11.getSize() - 2f);
        a.setFont(newFont);
        b.setFont(newFont1);
        c.setFont(newFont2);
        d.setFont(newFont3);
        e.setFont(newFont4);
        f.setFont(newFont5);
        g.setFont(newFont6);
        h.setFont(newFont7);
        i.setFont(newFont8);
        j.setFont(newFont9);
        k.setFont(newFont10);
        l.setFont(newFont11);
    }

    public int Speedtest(int i) {
        if (i == 0) {
            i = 1000;
            jSlider1.setToolTipText("X 1");
        } else if (i == 1) {
            i = 750;
            jSlider1.setToolTipText("X 1.5");
        } else if (i == 2) {
            i = 500;
            jSlider1.setToolTipText("X 2");
        } else if (i == 3) {
            i = 250;
            jSlider1.setToolTipText("X 2.5");
        }
        return i;
    }
}
