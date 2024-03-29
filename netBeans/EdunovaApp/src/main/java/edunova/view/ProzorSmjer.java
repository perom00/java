/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.util.Alati;
import edunova.util.EdunovaException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author petar
 */
public class ProzorSmjer extends javax.swing.JFrame implements EdunovaViewSucelje{

    private ObradaSmjer obrada;
    private DecimalFormat df;
    /**
     * Creates new form ProzorSmjer
     */
    public ProzorSmjer() {
        initComponents();
        obrada = new ObradaSmjer();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.of("hr", "HR"));
        df = new DecimalFormat("###,##0.00", dfs);

        setTitle(Alati.NAZIV_APP + " | SMJEROVI");
        ucitaj();
    }
    
      @Override
     public void ucitaj() {
        DefaultListModel<Smjer> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTrajanje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUpisnina = new javax.swing.JTextField();
        chkVerificiran = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Naziv");

        txtNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNazivActionPerformed(evt);
            }
        });

        jLabel2.setText("Trajanje");

        txtTrajanje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrajanjeActionPerformed(evt);
            }
        });

        jLabel3.setText("Upisnina");

        txtUpisnina.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUpisnina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpisninaActionPerformed(evt);
            }
        });

        chkVerificiran.setText("Verificiran");

        jLabel4.setText("Cijena");

        txtCijena.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCijena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCijenaActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjeni");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnObrisi1.setText("Obriši");
        btnObrisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkVerificiran)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUpisnina, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(87, 87, 87)
                                .addComponent(btnPromjena)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(675, Short.MAX_VALUE)
                    .addComponent(btnObrisi1)
                    .addGap(125, 125, 125)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkVerificiran))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(txtUpisnina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnDodaj)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnPromjena)
                                .addGap(36, 36, 36))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(255, Short.MAX_VALUE)
                    .addComponent(btnObrisi1)
                    .addGap(22, 22, 22)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNazivActionPerformed
        //visak
    }//GEN-LAST:event_txtNazivActionPerformed

    private void txtTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrajanjeActionPerformed

    private void txtUpisninaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpisninaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpisninaActionPerformed

    private void txtCijenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCijenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCijenaActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstPodaci.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());

        popuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        
        obrada.setEntitet(new Smjer());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        obrada.setEntitet(e);
        popuniModel();
        
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
        }
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisi1ActionPerformed
         if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        
        if (JOptionPane.showConfirmDialog(getRootPane(), e.getNaziv() , "Sigurno obrisati?",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION){
            return;
        }
        
        obrada.setEntitet(e);
        
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisi1ActionPerformed
    
     
     @Override
     public void popuniView() {
          var e = obrada.getEntitet();

        txtNaziv.setText(e.getNaziv());

        try {
            txtTrajanje.setText(String.valueOf(e.getTrajanje()));
        } catch (Exception ex) {
            txtTrajanje.setText("");
        }

        try {
            txtCijena.setText(df.format(e.getCijena()));
        } catch (Exception ex) {
            txtCijena.setText(df.format(0));
        }

        try {
            txtUpisnina.setText(df.format(e.getUpisnina()));
        } catch (Exception ex) {
            txtUpisnina.setText(df.format(0));
        }

        chkVerificiran.setSelected(e.isVerificiran());
     }
     
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi1;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JCheckBox chkVerificiran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Smjer> lstPodaci;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtTrajanje;
    private javax.swing.JTextField txtUpisnina;
    // End of variables declaration//GEN-END:variables

   

    @Override
    public void popuniModel() {
        var e = obrada.getEntitet();
        
        e.setNaziv(txtNaziv.getText());
        
        try {
            e.setTrajanje(Integer.parseInt(txtTrajanje.getText()));
        } catch (Exception ex) {
            e.setTrajanje(0);
        }
        
        try {
            e.setCijena(BigDecimal.valueOf(df.parse(txtCijena.getText()).doubleValue()));
        } catch (Exception ex) {
            e.setCijena(null);
        }
        
        try {
            e.setUpisnina(BigDecimal.valueOf(df.parse(txtUpisnina.getText()).doubleValue()));
        } catch (Exception ex) {
            e.setUpisnina(BigDecimal.ZERO);
        }
        
        e.setVerificiran(chkVerificiran.isSelected());
    }
}
