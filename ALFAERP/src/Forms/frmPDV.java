/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Forms;

/**
 *
 * @author USUARIO
 */
public class frmPDV extends javax.swing.JPanel {

    /**
     * Creates new form frmPDV
     */
    public frmPDV() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlCenterPDV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomePDV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQntdPDV = new javax.swing.JTextField();
        txtValoruPDV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalPDV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(46, 124, 149));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(46, 124, 149));

        jButton1.setBackground(new java.awt.Color(0, 58, 76));
        jButton1.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("FINALIZAR");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(774, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        pnlCenterPDV.setBackground(new java.awt.Color(46, 124, 149));
        pnlCenterPDV.setMinimumSize(new java.awt.Dimension(600, 100));
        pnlCenterPDV.setPreferredSize(new java.awt.Dimension(600, 300));

        jLabel1.setFont(new java.awt.Font("Abel", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ITEM");

        txtNomePDV.setEditable(false);
        txtNomePDV.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        txtNomePDV.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Abel", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUANTIDADE");

        txtQntdPDV.setEditable(false);
        txtQntdPDV.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        txtQntdPDV.setBorder(null);

        txtValoruPDV.setEditable(false);
        txtValoruPDV.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        txtValoruPDV.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Abel", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VALOR UNIT??RIO");

        jLabel4.setFont(new java.awt.Font("Abel", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VALOR TOTAL");

        txtTotalPDV.setEditable(false);
        txtTotalPDV.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        txtTotalPDV.setBorder(null);

        javax.swing.GroupLayout pnlCenterPDVLayout = new javax.swing.GroupLayout(pnlCenterPDV);
        pnlCenterPDV.setLayout(pnlCenterPDVLayout);
        pnlCenterPDVLayout.setHorizontalGroup(
            pnlCenterPDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterPDVLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlCenterPDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterPDVLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCenterPDVLayout.createSequentialGroup()
                        .addGroup(pnlCenterPDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCenterPDVLayout.createSequentialGroup()
                        .addGroup(pnlCenterPDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePDV)
                            .addGroup(pnlCenterPDVLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 443, Short.MAX_VALUE))
                            .addComponent(txtValoruPDV)
                            .addComponent(txtTotalPDV)
                            .addComponent(txtQntdPDV, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5))))
        );
        pnlCenterPDVLayout.setVerticalGroup(
            pnlCenterPDVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterPDVLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(txtNomePDV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtQntdPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txtValoruPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtTotalPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlCenterPDV, java.awt.BorderLayout.LINE_END);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "QUANTIDADE", "PRE??O UNIT??RIO", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlCenterPDV;
    private javax.swing.JTextField txtNomePDV;
    private javax.swing.JTextField txtQntdPDV;
    private javax.swing.JTextField txtTotalPDV;
    private javax.swing.JTextField txtValoruPDV;
    // End of variables declaration//GEN-END:variables
}
