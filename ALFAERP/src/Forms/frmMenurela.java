/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Forms;

/**
 *
 * @author USUARIO
 */
public class frmMenurela extends javax.swing.JPanel {

    /**
     * Creates new form frmCadCli
     */
    public frmMenurela() {
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
        jButton1 = new javax.swing.JButton();
        btnNovoCli = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 58, 77));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));

        jButton1.setBackground(new java.awt.Color(0, 58, 95));
        jButton1.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Relatórios - Ações");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel1.add(jButton1);

        btnNovoCli.setBackground(new java.awt.Color(0, 58, 77));
        btnNovoCli.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        btnNovoCli.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCli.setText("Geral");
        btnNovoCli.setBorder(null);
        btnNovoCli.setBorderPainted(false);
        btnNovoCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoCli.setFocusPainted(false);
        btnNovoCli.setFocusable(false);
        btnNovoCli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoCli.setPreferredSize(new java.awt.Dimension(200, 50));
        btnNovoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovoCli);

        btnClose.setBackground(new java.awt.Color(0, 58, 95));
        btnClose.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Fechar");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setPreferredSize(new java.awt.Dimension(200, 50));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);

        add(jPanel1, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlCenter.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlCenter.setLayout(new java.awt.BorderLayout());
        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNovoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCliActionPerformed
        // TODO add your handling code here:
        frmCadCli cadcli = new frmCadCli();
        
        pnlCenter.removeAll();
        pnlCenter.add(cadcli);
        pnlCenter.revalidate();
        pnlCenter.repaint();
        
    }//GEN-LAST:event_btnNovoCliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNovoCli;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlCenter;
    // End of variables declaration//GEN-END:variables
}
