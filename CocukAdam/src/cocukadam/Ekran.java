package cocukadam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Ekran extends javax.swing.JPanel implements ActionListener {

    private final Game oyun;
    private final Timer timer;

    public Ekran() {
        initComponents();
        timer = new Timer(100, this);
        timer.start();
        oyun = new Game();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        oyun.update();
        jLabelManufacturedCigKofte.setText(oyun.manufacturedCigKofte + "");
        jLabelCurrentCigKofte.setText(oyun.currentCigKofte + "");
        jLabelMoney.setText(oyun.money + "");
        jLabelMaterial.setText(oyun.material + "");
        jLabelPrice.setText(oyun.price + "");
        jLabelDemantRate.setText("%" + oyun.demandRate);
        jLabelLastManufacturedRate.setText((int) oyun.lastManufacturedRate + "");
        jLabelErandBoy.setText(oyun.getErrandBoyCount() + "");
        jLabelForeman.setText(oyun.getForemanCount() + "");
        jLabelMaster.setText(oyun.getMasterCount() + "");
        jButtonBuyMaterial.setText("Satın Al!(" + oyun.materialCost + ")tl");
        jButtonBuyErandBoy.setText("Satın Al!(" + oyun.getErrandBoyCost() + ")tl");
        jButtonBuyForeman.setText("Satın Al!(" + oyun.getForemanCost() + ")tl");
        jButtonBuyMaster.setText("Satın Al!(" + oyun.getMasterCost() + ")tl");
        jButtonAutoBuyer.setText("Satın Al!(" + oyun.getAutoBuyerCost() + ")tl");

        jButtonCigKofteYogur.setEnabled(oyun.canMakeCigKofte(1));
        jButtonBuyMaterial.setEnabled(oyun.canBuyMaterial());
        jButtonFiyatAzalt.setEnabled(oyun.candecreasPrice());
        jButtonBuyErandBoy.setEnabled(oyun.canBuyErrandboy());
        jButtonBuyForeman.setEnabled(oyun.canBuyForeman());
        jButtonBuyMaster.setEnabled(oyun.canBuyMaster());
        jButtonAutoBuyer.setEnabled(oyun.canBuyAutoBuyer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelManufacturedCigKofte = new javax.swing.JLabel();
        jButtonCigKofteYogur = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabelMoney = new javax.swing.JLabel();
        jLabelCurrentCigKofte = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelDemantRate = new javax.swing.JLabel();
        jButtonFiyatArttir = new javax.swing.JButton();
        jButtonFiyatAzalt = new javax.swing.JButton();
        jLabelLastManufacturedRate = new javax.swing.JLabel();
        jLabelMaterial = new javax.swing.JLabel();
        jButtonBuyMaterial = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonBuyErandBoy = new javax.swing.JButton();
        jButtonBuyForeman = new javax.swing.JButton();
        jButtonBuyMaster = new javax.swing.JButton();
        jLabelErandBoy = new javax.swing.JLabel();
        jLabelForeman = new javax.swing.JLabel();
        jLabelMaster = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelHasAutoBuyer = new javax.swing.JLabel();
        jButtonAutoBuyer = new javax.swing.JButton();

        setBackground(new java.awt.Color(39, 37, 54));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("ÇOCUK ADAM - Çiğ Köfte Diyarı");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Çiğ Köfte:");

        jLabelManufacturedCigKofte.setForeground(new java.awt.Color(240, 240, 240));
        jLabelManufacturedCigKofte.setText("0");

        jButtonCigKofteYogur.setText("Çiğ Köfte Yoğur!");
        jButtonCigKofteYogur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCigKofteYogur.setMargin(new java.awt.Insets(4, 10, 4, 14));
        jButtonCigKofteYogur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCigKofteYogurActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("İşletme");

        jLabel100.setForeground(new java.awt.Color(240, 240, 240));
        jLabel100.setText("Kasadaki Para:");

        jLabel101.setForeground(new java.awt.Color(240, 240, 240));
        jLabel101.setText("Dolaptaki Adet:");

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Fiyat:");

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Halkın Talebi:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Üretim");

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Çiğ köfte / saniye:");

        jLabel103.setForeground(new java.awt.Color(240, 240, 240));
        jLabel103.setText("Malzeme:");

        jLabelMoney.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMoney.setText("0");

        jLabelCurrentCigKofte.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCurrentCigKofte.setText("0");

        jLabelPrice.setForeground(new java.awt.Color(240, 240, 240));
        jLabelPrice.setText("0₺");

        jLabelDemantRate.setForeground(new java.awt.Color(240, 240, 240));
        jLabelDemantRate.setText("%0");

        jButtonFiyatArttir.setText("+");
        jButtonFiyatArttir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFiyatArttir.setMaximumSize(new java.awt.Dimension(13, 20));
        jButtonFiyatArttir.setMinimumSize(new java.awt.Dimension(13, 20));
        jButtonFiyatArttir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiyatArttirActionPerformed(evt);
            }
        });

        jButtonFiyatAzalt.setText("-");
        jButtonFiyatAzalt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFiyatAzalt.setMaximumSize(new java.awt.Dimension(13, 20));
        jButtonFiyatAzalt.setMinimumSize(new java.awt.Dimension(13, 20));
        jButtonFiyatAzalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiyatAzaltActionPerformed(evt);
            }
        });

        jLabelLastManufacturedRate.setForeground(new java.awt.Color(240, 240, 240));
        jLabelLastManufacturedRate.setText("0");

        jLabelMaterial.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMaterial.setText("10000");

        jButtonBuyMaterial.setText("Satın Al(500₺)");
        jButtonBuyMaterial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuyMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyMaterialActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Çalışan");

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Çırak");

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Kalfa");

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Usta");

        jButtonBuyErandBoy.setText("Satın Al(500₺)");
        jButtonBuyErandBoy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuyErandBoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyErandBoyActionPerformed(evt);
            }
        });

        jButtonBuyForeman.setText("Satın Al(500₺)");
        jButtonBuyForeman.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuyForeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyForemanActionPerformed(evt);
            }
        });

        jButtonBuyMaster.setText("Satın Al(2000₺)");
        jButtonBuyMaster.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuyMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyMasterActionPerformed(evt);
            }
        });

        jLabelErandBoy.setForeground(new java.awt.Color(240, 240, 240));
        jLabelErandBoy.setText("0");

        jLabelForeman.setForeground(new java.awt.Color(240, 240, 240));
        jLabelForeman.setText("0");

        jLabelMaster.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMaster.setText("0");

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Satın alma müdürü");

        jLabelHasAutoBuyer.setForeground(new java.awt.Color(240, 240, 240));
        jLabelHasAutoBuyer.setText("Yok");

        jButtonAutoBuyer.setText("Satın Al(500₺)");
        jButtonAutoBuyer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAutoBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAutoBuyerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelManufacturedCigKofte))
                            .addComponent(jButtonCigKofteYogur)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel103)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel11))
                                    .addGap(96, 96, 96)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelErandBoy, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(jLabelMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelForeman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonBuyForeman, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonBuyErandBoy, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jButtonBuyMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel100)
                                        .addComponent(jLabel101))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDemantRate)
                                        .addComponent(jLabelCurrentCigKofte)
                                        .addComponent(jLabelMoney)
                                        .addComponent(jLabelLastManufacturedRate)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelPrice)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonFiyatArttir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonFiyatAzalt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabelHasAutoBuyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButtonBuyMaterial))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(5, 5, 5)
                                                    .addComponent(jButtonAutoBuyer)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelManufacturedCigKofte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCigKofteYogur)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jLabelMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jLabelCurrentCigKofte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelPrice)
                    .addComponent(jButtonFiyatArttir, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiyatAzalt, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelDemantRate))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelLastManufacturedRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabelMaterial)
                    .addComponent(jButtonBuyMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabelHasAutoBuyer)
                    .addComponent(jButtonAutoBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButtonBuyErandBoy, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErandBoy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButtonBuyForeman, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelForeman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelMaster)
                    .addComponent(jButtonBuyMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFiyatAzaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiyatAzaltActionPerformed
        oyun.decreasePrice();
    }//GEN-LAST:event_jButtonFiyatAzaltActionPerformed

    private void jButtonCigKofteYogurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCigKofteYogurActionPerformed
        oyun.makeCigKofte(1);
    }//GEN-LAST:event_jButtonCigKofteYogurActionPerformed

    private void jButtonFiyatArttirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiyatArttirActionPerformed
        oyun.increasePrice();
    }//GEN-LAST:event_jButtonFiyatArttirActionPerformed

    private void jButtonBuyMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyMaterialActionPerformed
        oyun.buyMaterial();
    }//GEN-LAST:event_jButtonBuyMaterialActionPerformed

    private void jButtonBuyErandBoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyErandBoyActionPerformed
        oyun.buyErrandBoy();
    }//GEN-LAST:event_jButtonBuyErandBoyActionPerformed

    private void jButtonBuyForemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyForemanActionPerformed
        oyun.buyForeman();
    }//GEN-LAST:event_jButtonBuyForemanActionPerformed

    private void jButtonBuyMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyMasterActionPerformed
        oyun.buyMaster();
    }//GEN-LAST:event_jButtonBuyMasterActionPerformed

    private void jButtonAutoBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAutoBuyerActionPerformed
        oyun.buyAutoBuyer();
        jLabelHasAutoBuyer.setText("Aktif");
    }//GEN-LAST:event_jButtonAutoBuyerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAutoBuyer;
    private javax.swing.JButton jButtonBuyErandBoy;
    private javax.swing.JButton jButtonBuyForeman;
    private javax.swing.JButton jButtonBuyMaster;
    private javax.swing.JButton jButtonBuyMaterial;
    private javax.swing.JButton jButtonCigKofteYogur;
    private javax.swing.JButton jButtonFiyatArttir;
    private javax.swing.JButton jButtonFiyatAzalt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel103;
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
    private javax.swing.JLabel jLabelCurrentCigKofte;
    private javax.swing.JLabel jLabelDemantRate;
    private javax.swing.JLabel jLabelErandBoy;
    private javax.swing.JLabel jLabelForeman;
    private javax.swing.JLabel jLabelHasAutoBuyer;
    private javax.swing.JLabel jLabelLastManufacturedRate;
    private javax.swing.JLabel jLabelManufacturedCigKofte;
    private javax.swing.JLabel jLabelMaster;
    private javax.swing.JLabel jLabelMaterial;
    private javax.swing.JLabel jLabelMoney;
    private javax.swing.JLabel jLabelPrice;
    // End of variables declaration//GEN-END:variables

}
