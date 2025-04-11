
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author HP&
 */
public class Menu extends javax.swing.JFrame {

      
    public Menu() {
       initComponents(); 
    }

    

    @SuppressWarnings("empty-statement")
    public void addtable(int id, String Name, int Qty, Double price) {
        DefaultTableModel dt = (DefaultTableModel) tabtable.getModel();
        DecimalFormat df = new DecimalFormat("##0.00");
        double totprice = price * Double.valueOf(Qty);
        String total = df.format(totprice);
        Vector v = new Vector();
        for (int row = tabtable.getRowCount() - 1; row >= 0; row--) {
            if (Name.equals(tabtable.getValueAt(row, 1))) {
                dt.removeRow(row);
            }
        }

        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(totprice);
        dt.addRow(v);
    }

    @SuppressWarnings("empty-statement")
    public void cal() {
        int numOfRow = tabtable.getRowCount();
        double tot = 0.0;

        for (int i = 0; i < numOfRow; i++) {

            Object value = tabtable.getValueAt(i, 3);

            if (value != null) {
                try {

                    double numValue = Double.valueOf(value.toString());
                    tot += numValue;
                } catch (Exception e) {

                    System.out.println("Erreur à la ligne " + i + ": La valeur dans la cellule n'est pas un nombre valide.");
                }
            }
        }

        DecimalFormat df = new DecimalFormat("##00.00");
        total.setText(df.format(tot));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdb2 = new javax.swing.JButton();
        q2 = new javax.swing.JLabel();
        cmdb1 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        cmdb3 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        cmdb5 = new javax.swing.JButton();
        cmdb6 = new javax.swing.JButton();
        cmd7 = new javax.swing.JButton();
        q4 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabtable = new javax.swing.JTable();
        cmdb8 = new javax.swing.JButton();
        cmdb9 = new javax.swing.JButton();
        cmdb4 = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        p = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        btnprint = new javax.swing.JButton();
        btnpay = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo3.jpg"))); // NOI18N
        cmdb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb2ActionPerformed(evt);
            }
        });

        q2.setBackground(new java.awt.Color(204, 204, 204));
        q2.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q2.setText("0");

        cmdb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo1.jpg"))); // NOI18N
        cmdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb1ActionPerformed(evt);
            }
        });

        q1.setBackground(new java.awt.Color(153, 153, 153));
        q1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q1.setText(" 0");

        cmdb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo2.jpg"))); // NOI18N
        cmdb3.setText("jButton1");
        cmdb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb3ActionPerformed(evt);
            }
        });

        q3.setBackground(new java.awt.Color(153, 153, 153));
        q3.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q3.setText("0");

        cmdb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo5.jpg"))); // NOI18N
        cmdb5.setText("jButton1");
        cmdb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb5ActionPerformed(evt);
            }
        });

        cmdb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo6.jpg"))); // NOI18N
        cmdb6.setText("jButton1");
        cmdb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb6ActionPerformed(evt);
            }
        });

        cmd7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo7.jpg"))); // NOI18N
        cmd7.setText("jButton1");
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });

        q4.setBackground(new java.awt.Color(153, 153, 153));
        q4.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q4.setText("0");

        q6.setBackground(new java.awt.Color(204, 204, 204));
        q6.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q6.setText("0");

        q5.setBackground(new java.awt.Color(204, 204, 204));
        q5.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q5.setText("0");

        tabtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(tabtable);

        cmdb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo8.jpg"))); // NOI18N
        cmdb8.setText("jButton1");
        cmdb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb8ActionPerformed(evt);
            }
        });

        cmdb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo9.jpg"))); // NOI18N
        cmdb9.setText("jButton1");
        cmdb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb9ActionPerformed(evt);
            }
        });

        cmdb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo4.jpg"))); // NOI18N
        cmdb4.setText("jButton1");
        cmdb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdb4ActionPerformed(evt);
            }
        });

        q7.setBackground(new java.awt.Color(153, 153, 153));
        q7.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q7.setText("0");

        q9.setBackground(new java.awt.Color(153, 153, 153));
        q9.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q9.setText("0");

        q8.setBackground(new java.awt.Color(153, 153, 153));
        q8.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        q8.setText("0");

        p.setColumns(20);
        p.setRows(5);
        jScrollPane2.setViewportView(p);

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel10.setText("Total:");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel11.setText("Blance:");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel12.setText("cash:");

        total.setText("  00");

        bal.setText(" 00");

        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        btnprint.setBackground(new java.awt.Color(0, 51, 255));
        btnprint.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnprint.setForeground(new java.awt.Color(51, 51, 51));
        btnprint.setText("print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        btnpay.setBackground(new java.awt.Color(51, 255, 51));
        btnpay.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btnpay.setText("Pay");
        btnpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnpay, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnprint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(bal))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        btndelete.setBackground(new java.awt.Color(255, 51, 0));
        btndelete.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdb1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdb2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdb5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmd7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmdb8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmdb3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addComponent(cmdb9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdb6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cmdb3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(q3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdb1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cmdb2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(q1)
                                    .addComponent(q2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmdb5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmdb6)
                                    .addComponent(cmdb4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(q6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(q4)
                                        .addComponent(q5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmd7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmdb8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmdb9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(q7)
                                .addComponent(q8))
                            .addComponent(q9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb1ActionPerformed
        String text = q1.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q1.setText(String.valueOf(i));
                addtable(1, "steak Trtare", i, 2.99);
                cal();
            } else {
                System.out.println("Le champ q1 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }


    }//GEN-LAST:event_cmdb1ActionPerformed

    private void cmdb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb2ActionPerformed
        String text = q2.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q2.setText(String.valueOf(i));
                addtable(2, "spaghetti à la bolognaise", i, 30.00);
                cal();
            } else {
                System.out.println("Le champ q2 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }

    }//GEN-LAST:event_cmdb2ActionPerformed

    private void cmdb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb3ActionPerformed
        String text = q3.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q3.setText(String.valueOf(i));
                addtable(3, "pizza rustique", i, 89.00);
                cal();
            } else {
                System.out.println("Le champ q3 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }

    }//GEN-LAST:event_cmdb3ActionPerformed

    private void cmdb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb4ActionPerformed
        String text = q4.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q4.setText(String.valueOf(i));
                addtable(4, "poke bowl", i, 15.99);
                cal();
            } else {
                System.out.println("Le champ q4 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }

    }//GEN-LAST:event_cmdb4ActionPerformed

    private void cmdb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb5ActionPerformed
        String text = q5.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q5.setText(String.valueOf(i));
                addtable(5, "crouque-madame", i, 2.99);
                cal();
            } else {
                System.out.println("Le champ q5 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }

    }//GEN-LAST:event_cmdb5ActionPerformed

    private void cmdb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb6ActionPerformed
        String text = q6.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q6.setText(String.valueOf(i));
                addtable(6, "pizza blanche aux tomat", i, 17.99);
                cal();
            } else {
                System.out.println("Le champ q6 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }

    }//GEN-LAST:event_cmdb6ActionPerformed

    private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
        String text = q7.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q7.setText(String.valueOf(i));
                addtable(7, "paella", i, 20.00);
                cal();
            } else {
                System.out.println("Le champ q7 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }

    }//GEN-LAST:event_cmd7ActionPerformed

    private void cmdb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb8ActionPerformed
        String text = q8.getText().trim();

        try {
            if (!text.isEmpty()) {
                int i = Integer.valueOf(text);
                ++i;
                q8.setText(String.valueOf(i));
                addtable(8, "burger de boeuf", i, 20.00);
                cal();
            } else {
                System.out.println("Le champ q8 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }

    }//GEN-LAST:event_cmdb8ActionPerformed

    private void cmdb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdb9ActionPerformed
        String text = q9.getText().trim();
        try {
            if (!text.isEmpty()) {
                int i = Integer.parseInt(text);
                ++i;
                q9.setText(String.valueOf(i));
                addtable(9, "Tteokbokki avec oeufs", i, 20.99);
                cal();
            } else {
                System.out.println("Le champ q9 est vide.");
            }
        } catch (Exception e) {
            System.out.println("Erreur : la valeur entrée n'est pas un nombre valide.");
        }
    }//GEN-LAST:event_cmdb9ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        DefaultTableModel dt = (DefaultTableModel) tabtable.getModel();
        String r = dt.getValueAt(tabtable.getSelectedRow(), 0).toString();
        int rw = tabtable.getSelectedRow();

        dt.removeRow(rw);
        System.out.println(r);
        switch (r) {
            case "1":
                q1.setText("0");
                break;
            case "2":
                q2.setText("0");
                break;
            case "3":
                q3.setText("0");
                break;
            case "4":
                q4.setText("0");
                break;
            case "5":
                q5.setText("0");
                break;
            case "6":
                q6.setText("0");
                break;
            case "7":
                q7.setText("0");
                break;
            case "8":
                q8.setText("0");
                break;
            case "9":
                q9.setText("0");
                break;
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed

    }//GEN-LAST:event_payActionPerformed

    private void btnpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpayActionPerformed
        try {
            // Vérification que les champs ne sont pas vides et contiennent des valeurs valides
            String totalText = total.getText().trim();
            String payText = pay.getText().trim();

            if (totalText.isEmpty() || payText.isEmpty()) {
                System.out.println("Erreur : Veuillez entrer des valeurs valides dans les champs Total et Montant payé.");
                return; // Retourne si l'un des champs est vide
            }

            // Remplacer les virgules par des points si nécessaire (pour les séparateurs décimaux)
            totalText = totalText.replace(",", ".");
            payText = payText.replace(",", ".");

            // Convertir les champs texte en Double
            double tot = Double.parseDouble(totalText);
            double paid = Double.parseDouble(payText);

            // Calculer le solde
            double balance = paid - tot;

            // Formater le solde à deux décimales
            DecimalFormat df = new DecimalFormat("0.00");  // Correct format pour 2 décimales

            // Afficher le solde
            bal.setText(df.format(balance));  // Mettre à jour le label ou le champ 'bal'
        } catch (Exception e) {
            // Si une erreur se produit lors de la conversion, afficher un message d'erreur
            System.out.println("Erreur : Format de nombre invalide. Assurez-vous que les valeurs sont numériques.");
        }
    }//GEN-LAST:event_btnpayActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            // Initialisation du texte dans JTextArea
            p.setText("                        Code DAPP FkD\n");
            p.setText(p.getText() + " \t123, Avenue Mohammed V\n");
            p.setText(p.getText() + " \tKenitra, Maroc\n");
            p.setText(p.getText() + "\t+212 537 123 456\n");
            p.setText(p.getText() + "--------------------------------------------------------------------------\n");
            p.setText(p.getText() + "\tName \tQty \tPrice\n");

            // Récupérer les données du modèle de la table
            DefaultTableModel df = (DefaultTableModel) tabtable.getModel();

            // Parcourir les lignes du modèle de la table et récupérer les données
            for (int i = 0; i < tabtable.getRowCount(); i++) {
                // Récupération des valeurs
                String name = df.getValueAt(i, 1).toString();  // Nom de l'article (colonne 1)
                String qty = df.getValueAt(i, 2).toString();   // Quantité (colonne 2)
                String price = df.getValueAt(i, 3).toString(); // Prix (colonne 3)

                // Formatage de la ligne à ajouter avec alignement
                p.setText(p.getText() + String.format("\t%-20s %-10s %-10s\n", name, qty, price));
            }

            // S'assurer que le texte est bien mis à jour
            p.setCaretPosition(p.getDocument().getLength());  // Déplace le curseur à la fin du texte (optionnel)

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnprintActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                 System.out.println("Lancement de l'application...");
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bal;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnpay;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton cmd7;
    private javax.swing.JButton cmdb1;
    private javax.swing.JButton cmdb2;
    private javax.swing.JButton cmdb3;
    private javax.swing.JButton cmdb4;
    private javax.swing.JButton cmdb5;
    private javax.swing.JButton cmdb6;
    private javax.swing.JButton cmdb8;
    private javax.swing.JButton cmdb9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea p;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JTable tabtable;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
