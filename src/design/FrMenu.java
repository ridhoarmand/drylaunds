/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design;

import design.view.MasterDashboard;
import design.view.MasterOrders;

import java.awt.Color;
import java.awt.event.MouseEvent;

/**
 *
 * @author Armandho
 */
public class FrMenu extends javax.swing.JFrame {

    static boolean isLogin;

    static void checkLogin() {
        if (isLogin) {
//            menuItemPetugas.setEnabled(true);
//            logOut.setEnabled(true);
//            closeLoginForm();
        } else {
//            menuItemPetugas.setEnabled(false);
//            logOut.setEnabled(false);
//            openLoginForm();
        }
    }

    
    /**
     * Creates new form MainMenu
     */
    public FrMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_dashboard = new javax.swing.JPanel();
        pn_linedashboard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btdashboard = new javax.swing.JLabel();
        pn_Clients = new javax.swing.JPanel();
        pn_lineclient = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btCllient = new javax.swing.JLabel();
        pn_Orders = new javax.swing.JPanel();
        pn_lineorders = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btOrders = new javax.swing.JLabel();
        pn_Finance = new javax.swing.JPanel();
        pn_linefinance = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btFinance = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_atas = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_kiri.setBackground(new java.awt.Color(0, 102, 255));
        pn_kiri.setPreferredSize(new java.awt.Dimension(250, 768));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/assets/icon_washing_home.png"))); // NOI18N
        jLabel1.setText("DryLaund's");

        pn_dashboard.setBackground(new java.awt.Color(0, 102, 255));
        pn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_dashboardMouseEntered(evt);
            }
        });

        pn_linedashboard.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout pn_linedashboardLayout = new javax.swing.GroupLayout(pn_linedashboard);
        pn_linedashboard.setLayout(pn_linedashboardLayout);
        pn_linedashboardLayout.setHorizontalGroup(
            pn_linedashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pn_linedashboardLayout.setVerticalGroup(
            pn_linedashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/assets/icons8_dashboard_30px.png"))); // NOI18N

        btdashboard.setBackground(new java.awt.Color(102, 102, 102));
        btdashboard.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btdashboard.setForeground(new java.awt.Color(255, 255, 255));
        btdashboard.setText("Dashboard");
        btdashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btdashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btdashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btdashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_dashboardLayout = new javax.swing.GroupLayout(pn_dashboard);
        pn_dashboard.setLayout(pn_dashboardLayout);
        pn_dashboardLayout.setHorizontalGroup(
            pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_linedashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btdashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pn_dashboardLayout.setVerticalGroup(
            pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_linedashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_Clients.setBackground(new java.awt.Color(0, 102, 255));
        pn_Clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_ClientsMouseEntered(evt);
            }
        });

        pn_lineclient.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout pn_lineclientLayout = new javax.swing.GroupLayout(pn_lineclient);
        pn_lineclient.setLayout(pn_lineclientLayout);
        pn_lineclientLayout.setHorizontalGroup(
            pn_lineclientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pn_lineclientLayout.setVerticalGroup(
            pn_lineclientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/assets/icons8_user_male_circle_30px.png"))); // NOI18N

        btCllient.setBackground(new java.awt.Color(102, 102, 102));
        btCllient.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btCllient.setForeground(new java.awt.Color(255, 255, 255));
        btCllient.setText("Clients");
        btCllient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCllientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCllientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCllientMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_ClientsLayout = new javax.swing.GroupLayout(pn_Clients);
        pn_Clients.setLayout(pn_ClientsLayout);
        pn_ClientsLayout.setHorizontalGroup(
            pn_ClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_lineclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCllient, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_ClientsLayout.setVerticalGroup(
            pn_ClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ClientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ClientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(pn_lineclient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCllient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_Orders.setBackground(new java.awt.Color(0, 102, 255));
        pn_Orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_OrdersMouseEntered(evt);
            }
        });

        pn_lineorders.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout pn_lineordersLayout = new javax.swing.GroupLayout(pn_lineorders);
        pn_lineorders.setLayout(pn_lineordersLayout);
        pn_lineordersLayout.setHorizontalGroup(
            pn_lineordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pn_lineordersLayout.setVerticalGroup(
            pn_lineordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/assets/icons8_purchase_order_30px.png"))); // NOI18N

        btOrders.setBackground(new java.awt.Color(102, 102, 102));
        btOrders.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btOrders.setForeground(new java.awt.Color(255, 255, 255));
        btOrders.setText("Orders");
        btOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btOrdersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btOrdersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btOrdersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_OrdersLayout = new javax.swing.GroupLayout(pn_Orders);
        pn_Orders.setLayout(pn_OrdersLayout);
        pn_OrdersLayout.setHorizontalGroup(
            pn_OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_OrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_lineorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pn_OrdersLayout.setVerticalGroup(
            pn_OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_OrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(pn_lineorders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_Finance.setBackground(new java.awt.Color(0, 102, 255));
        pn_Finance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_FinanceMouseEntered(evt);
            }
        });

        pn_linefinance.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout pn_linefinanceLayout = new javax.swing.GroupLayout(pn_linefinance);
        pn_linefinance.setLayout(pn_linefinanceLayout);
        pn_linefinanceLayout.setHorizontalGroup(
            pn_linefinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pn_linefinanceLayout.setVerticalGroup(
            pn_linefinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/assets/icons8_finance_document__30px.png"))); // NOI18N

        btFinance.setBackground(new java.awt.Color(102, 102, 102));
        btFinance.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btFinance.setForeground(new java.awt.Color(255, 255, 255));
        btFinance.setText("Finance");
        btFinance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFinanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFinanceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_FinanceLayout = new javax.swing.GroupLayout(pn_Finance);
        pn_Finance.setLayout(pn_FinanceLayout);
        pn_FinanceLayout.setHorizontalGroup(
            pn_FinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_FinanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_linefinance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFinance, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_FinanceLayout.setVerticalGroup(
            pn_FinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_FinanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_FinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_linefinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_Clients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pn_Orders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pn_Finance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(pn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_Clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_Orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_Finance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_atas.setBackground(new java.awt.Color(204, 204, 204));
        pn_atas.setPreferredSize(new java.awt.Dimension(1116, 95));

        javax.swing.GroupLayout pn_atasLayout = new javax.swing.GroupLayout(pn_atas);
        pn_atas.setLayout(pn_atasLayout);
        pn_atasLayout.setHorizontalGroup(
            pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1116, Short.MAX_VALUE)
        );
        pn_atasLayout.setVerticalGroup(
            pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        pn_kanan.add(pn_atas, java.awt.BorderLayout.PAGE_START);

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.add(pn_utama, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // show dashboard di panel utama
    private void showDashboard() {
//        Dashboard dashboard = new Dashboard();
//        pn_utama.removeAll();
//        pn_utama.add(dashboard);
//        pn_utama.repaint();
//        pn_utama.revalidate();
    }

    private void btdashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdashboardMouseEntered
        // Untuk mengubah warna pn_dashboard menjadi orange
        pn_dashboard.setBackground(new Color(255, 165, 0)); // Warna orange

        // Untuk mengubah warna pn_line menjadi putih
        pn_linedashboard.setBackground(Color.WHITE);

    }//GEN-LAST:event_btdashboardMouseEntered

    private void pn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dashboardMouseEntered
        showDashboard();
    }//GEN-LAST:event_pn_dashboardMouseEntered

    private void btdashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdashboardMouseExited
        // Mengubah warna pn_dashboard menjadi biru (0, 102, 255)
        pn_dashboard.setBackground(new Color(0, 102, 255));

        // Mengubah warna pn_line menjadi biru (0, 102, 255)
        pn_linedashboard.setBackground(new Color(0, 102, 255));

    }//GEN-LAST:event_btdashboardMouseExited

    private void btCllientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCllientMouseEntered
        // Untuk mengubah warna pn_dashboard menjadi orange
        pn_Clients.setBackground(new Color(255, 165, 0)); // Warna orange

        // Untuk mengubah warna pn_line menjadi putih
        pn_lineclient.setBackground(Color.WHITE);
    }//GEN-LAST:event_btCllientMouseEntered

    private void btCllientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCllientMouseExited
        // Mengubah warna pn_dashboard menjadi biru (0, 102, 255)
        pn_Clients.setBackground(new Color(0, 102, 255));

        // Mengubah warna pn_line menjadi biru (0, 102, 255)
        pn_lineclient.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_btCllientMouseExited

    private void pn_ClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_ClientsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pn_ClientsMouseEntered

    private void btOrdersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOrdersMouseEntered
        // Untuk mengubah warna pn_dashboard menjadi orange
        pn_Orders.setBackground(new Color(255, 165, 0)); // Warna orange

        // Untuk mengubah warna pn_line menjadi putih
        pn_lineorders.setBackground(Color.WHITE);
    }//GEN-LAST:event_btOrdersMouseEntered

    private void btOrdersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOrdersMouseExited
        // Mengubah warna pn_dashboard menjadi biru (0, 102, 255)
        pn_Orders.setBackground(new Color(0, 102, 255));

        // Mengubah warna pn_line menjadi biru (0, 102, 255)
        pn_lineorders.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_btOrdersMouseExited

    private void pn_OrdersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_OrdersMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pn_OrdersMouseEntered

    private void btFinanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinanceMouseEntered
        // Untuk mengubah warna pn_dashboard menjadi orange
        pn_Finance.setBackground(new Color(255, 165, 0)); // Warna orange

        // Untuk mengubah warna pn_line menjadi putih
        pn_linefinance.setBackground(Color.WHITE);
    }//GEN-LAST:event_btFinanceMouseEntered

    private void btFinanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinanceMouseExited
        // Mengubah warna pn_dashboard menjadi biru (0, 102, 255)
        pn_Finance.setBackground(new Color(0, 102, 255));

        // Mengubah warna pn_line menjadi biru (0, 102, 255)
        pn_linefinance.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_btFinanceMouseExited

    private void pn_FinanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_FinanceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pn_FinanceMouseEntered

    private void btdashboardMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btdashboardMouseClicked
        pn_utama.setVisible(true);
        pn_utama.removeAll();
        pn_utama.add(new MasterDashboard());
        pn_utama.setBackground(Color.white);
        pn_utama.repaint();
        pn_utama.revalidate();

    }//GEN-LAST:event_btdashboardMouseClicked

    private void btCllientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCllientMouseClicked
        pn_utama.setVisible(true);
        pn_utama.removeAll();
        pn_utama.add(new MasterDashboard());
        pn_utama.setBackground(Color.white);
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btCllientMouseClicked

    private void btOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btOrdersMouseClicked
        pn_utama.setVisible(true);
        pn_utama.removeAll();
        pn_utama.add(new MasterOrders());
        pn_utama.setBackground(Color.white);
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btOrdersMouseClicked

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
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btCllient;
    private javax.swing.JLabel btFinance;
    private javax.swing.JLabel btOrders;
    private javax.swing.JLabel btdashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pn_Clients;
    private javax.swing.JPanel pn_Finance;
    private javax.swing.JPanel pn_Orders;
    private javax.swing.JPanel pn_atas;
    private javax.swing.JPanel pn_dashboard;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_lineclient;
    private javax.swing.JPanel pn_linedashboard;
    private javax.swing.JPanel pn_linefinance;
    private javax.swing.JPanel pn_lineorders;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
