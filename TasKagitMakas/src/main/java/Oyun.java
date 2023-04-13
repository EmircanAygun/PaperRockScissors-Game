
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import java.util.Random;

public class Oyun extends javax.swing.JFrame {
    
    public Oyun() {
        initComponents();
    }
    Kullanici kullanici = new Kullanici(0);
    Bilgisayar bilgisayar = new Bilgisayar(0);
    Bilgisayar bilgisayar2 = new Bilgisayar(0);
    Random rand = new Random();
    private static int i=0,i2=0,i3=0,i4=0;
    private static int b=0,b2=0,b3=0;
    private static int t=0,t2=5;
    public static List<Integer> loop = new ArrayList<>();
    public static List<Integer> loop2 = new ArrayList<>();
    public static float skor1=0, skor2=0;
    public static int hamleSayisi=0,maxHamle=100;
    private static int kontrol=0;
    private int r=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        KBButon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        BBButon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        tasButon = new javax.swing.JButton();
        kagitButon = new javax.swing.JButton();
        makasButon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        nesneSecimiButon = new javax.swing.JButton();
        OynaButon = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("oyuncu adı");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        KBButon.setText("K-B");
        KBButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KBButonActionPerformed(evt);
            }
        });

        jLabel4.setText("oyuncu id");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        BBButon.setText("B-B");
        BBButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addComponent(KBButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBButon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBButon)
                    .addComponent(KBButon))
                .addGap(20, 20, 20))
        );

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        tasButon.setText("tas");
        tasButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasButonActionPerformed(evt);
            }
        });

        kagitButon.setText("kagit");
        kagitButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kagitButonActionPerformed(evt);
            }
        });

        makasButon.setText("makas");
        makasButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makasButonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane3.setViewportView(jList2);

        nesneSecimiButon.setText("Nesne Seçimi");
        nesneSecimiButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nesneSecimiButonActionPerformed(evt);
            }
        });

        OynaButon.setText("Oyna");
        OynaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OynaButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(kagitButon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tasButon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(makasButon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nesneSecimiButon)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(OynaButon)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nesneSecimiButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OynaButon))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tasButon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(kagitButon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(makasButon))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setText("Oyuncu");

        jLabel3.setText("Bilgisayar");

        jLabel5.setText("0");

        jLabel6.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(226, 226, 226))))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DefaultListModel model = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
            
    private void tasButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasButonActionPerformed
        // TODO add your handling code here:
        if(!kullanici.nesneListesi("tas").contentEquals("dolu")){
            model.addElement("Tas");jList1.setModel(model);
            model2.addElement(bilgisayar.nesneListesi("sec"));jList2.setModel(model2);
        }
        if(kullanici.i4==5){tasButon.setEnabled(false);kagitButon.setEnabled(false);makasButon.setEnabled(false);}
        
    }//GEN-LAST:event_tasButonActionPerformed

    private void kagitButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kagitButonActionPerformed
        // TODO add your handling code here:
        if(!kullanici.nesneListesi("kagit").contentEquals("dolu")){
            model.addElement("Kagit");jList1.setModel(model);
            model2.addElement(bilgisayar.nesneListesi("sec"));jList2.setModel(model2);
        }
        if(kullanici.i4==5){tasButon.setEnabled(false);kagitButon.setEnabled(false);makasButon.setEnabled(false);}
    }//GEN-LAST:event_kagitButonActionPerformed

    private void makasButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makasButonActionPerformed
        // TODO add your handling code here:
        if(!kullanici.nesneListesi("makas").contentEquals("dolu")){
            model.addElement("Makas");jList1.setModel(model);
            model2.addElement(bilgisayar.nesneListesi("sec"));jList2.setModel(model2);
        }
        if(kullanici.i4==5){tasButon.setEnabled(false);kagitButon.setEnabled(false);makasButon.setEnabled(false);}       
    }//GEN-LAST:event_makasButonActionPerformed

    private void KBButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KBButonActionPerformed
        // TODO add your handling code here:
        kullanici.setOyuncuAdi(jTextField2.getText());
        try{
            kullanici.setOyuncuID(Integer.parseInt(jTextField3.getText()));}
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        jLabel1.setText(kullanici.getOyuncuAdi());
        jLabel5.setText("0");
        jLabel6.setText("0");
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jPanel3.setEnabled(false);
        jPanel4.setVisible(true);
        jPanel5.setVisible(true);
        KBButon.setEnabled(false);
        tasButon.setEnabled(true);
        kagitButon.setEnabled(true);
        makasButon.setEnabled(true);
        nesneSecimiButon.setEnabled(false);
        OynaButon.setEnabled(false);
        loop.add(0);loop.add(1);loop.add(2);loop.add(3);loop.add(4);
        loop2.add(0);loop2.add(1);loop2.add(2);loop2.add(3);loop2.add(4);
        BBButon.setEnabled(false);
        jList2.setVisible(false);
    }//GEN-LAST:event_KBButonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here: 
        if(hamleSayisi%5==0)jTextArea1.setText("");
        int index2;
        int index = jList1.getSelectedIndex();
        int w=0,w2=0;
        int nextRandomNumberIndex = rand.nextInt(loop2.size());
        index2=loop2.get(nextRandomNumberIndex);
        int y=1,y2=0;
        for (int j = 0; j < loop.size(); j++) {
            if(loop.get(j)==index){y=0;y2=j;}
        }
        
        //if(loop.get(index)!=6){
        if(y==0){        
            String r = kullanici.nesneSec(index).getClass().getSimpleName();
            String r2 = bilgisayar.nesneSec(index2).getClass().getSimpleName();
            float etki = kullanici.nesneSec(index).etkiHesapla(r2);
            float etki2 = bilgisayar.nesneSec(index2).etkiHesapla(r);
            if(etki>etki2){w=1;w2=0;}
            else if(etki<etki2){w=0;w2=1;}
            else {w=0;w2=0;}
            
            jTextArea1.append("etki    D.  S. \t\t etki      D.  S.");
            
            jTextArea1.append("\n"+etki+" / " + kullanici.nesneSec(index).nesnePuaniGoster()+"    "+kullanici.nesneSec(index).getClass().getSimpleName());        
            kullanici.liste.set(index,kullanici.nesneSec(index).durumGuncelle((etki2),w,kullanici.nesneSec(index)));
            if(bilgisayar.nesneSec(index2)!=null){model.setElementAt(kullanici.nesneSec(index).getClass().getSimpleName(), index);}
            //loop.set(index, 6);
            loop.remove(y2);
            if(kullanici.nesneSec(index)==null){
                jTextArea1.append(" (silindi)");
                kullanici.liste.remove(index);
                //model.remove(index);
                model.setElementAt("-", index);
            }  
            
            if(loop.size()==0){
            for (int k = 0; k < 5; k++) {
                    loop.add(k);}}
               
            jTextArea1.append("   <--->   ");
            
            jTextArea1.append(bilgisayar.nesneSec(index2).getClass().getSimpleName()+"  "+etki2+" / "+bilgisayar.nesneSec(index2).nesnePuaniGoster()+"\n\n");
            bilgisayar.liste.set(index2, bilgisayar.nesneSec(index2).durumGuncelle((etki),w2,bilgisayar.nesneSec(index2)));
            if(bilgisayar.nesneSec(index2)!=null){model2.setElementAt(bilgisayar.nesneSec(index2).getClass().getSimpleName(), index2);}
            loop2.remove(nextRandomNumberIndex);
            if(bilgisayar.nesneSec(index2)==null){
                jTextArea1.append(" (silindi B)");
                bilgisayar.liste.remove(index2);
                model2.remove(index2);}
            if(loop2.size()==0){
                for (int j = 0; j < bilgisayar.liste.size(); j++) {
                    loop2.add(j);}
            }
            //jTextArea1.append("         "+kullanici.nesneSec(index).nesnePuaniGoster()+"  ");        
            //jTextArea1.append("\t\t    "+bilgisayar.nesneSec(index2).nesnePuaniGoster()+"  ");        
            //jTextArea1.append("\n"+bilgisayar.liste.size()+"   index2 "+loop2.size()+"       ");
            
        hamleSayisi++;
        if(hamleSayisi==maxHamle){
            skor1 = kullanici.skorGoster();
            skor2 = bilgisayar.skorGoster();
            jLabel5.setText(String.format("%s", skor1));
            jLabel6.setText(String.format("%s", skor2));
            jTextArea1.setText("");
            
            if(skor1>skor2){jTextArea1.append("----->"+kullanici.oyuncuAdi + " Kazandi <-----");}
            else if(skor1<skor2){jTextArea1.append("-----> Bilgisayar Kazandi <-----");}
            else{jTextArea1.append("Berabere");}
            
            jList1.setVisible(false);
            jList2.setVisible(false);
        }
        else if(bilgisayar.liste.size()==0){
            jTextArea1.setText("");
            jTextArea1.append("-----> "+kullanici.oyuncuAdi + " Kazandi <-----");
            jList1.setVisible(false);
            jList2.setVisible(false);
        }
        else if(kullanici.liste.isEmpty()){
            jTextArea1.setText("");
            jTextArea1.append("-----> Bilgisayar Kazandi <-----");
            jList1.setVisible(false);
            jList2.setVisible(false);
        } 
        }
        else{jTextArea1.append("Tekrar Seç\n\n");}
    }//GEN-LAST:event_jList1MouseClicked

    private void BBButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBButonActionPerformed
        // TODO add your handling code here:
        tasButon.setEnabled(false);
        kagitButon.setEnabled(false);
        makasButon.setEnabled(false);
        nesneSecimiButon.setEnabled(true);
        OynaButon.setEnabled(false);
        jList1.setVisible(true);
        jList1.setVisible(true);
        jLabel1.setText("Bilgisayar1");
        jLabel3.setText("Bilgisayar2");
        jLabel5.setText("0");
        jLabel6.setText("0");
        loop.add(0);loop.add(1);loop.add(2);loop.add(3);loop.add(4);
        loop2.add(0);loop2.add(1);loop2.add(2);loop2.add(3);loop2.add(4);
    }//GEN-LAST:event_BBButonActionPerformed

    private void nesneSecimiButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nesneSecimiButonActionPerformed
        // TODO add your handling code here:
        if(r!=5){
            model.addElement(bilgisayar.nesneListesi("sec"));jList1.setModel(model);
            model2.addElement(bilgisayar2.nesneListesi("sec"));jList2.setModel(model2);r++;}
        if(bilgisayar.i4==5){
            nesneSecimiButon.setEnabled(false);
            OynaButon.setEnabled(true);}
    }//GEN-LAST:event_nesneSecimiButonActionPerformed

    private void OynaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OynaButonActionPerformed
        // TODO add your handling code here:
        int w,w2=0;
        int nextRandomNumberIndex = rand.nextInt(loop2.size());
        int index2=loop2.get(nextRandomNumberIndex);
        String r2 = bilgisayar2.nesneSec(index2).getClass().getSimpleName();
        
        int nextRandomNumberIndex2 = rand.nextInt(loop.size());
        int index=loop.get(nextRandomNumberIndex);
        String r = bilgisayar.nesneSec(index).getClass().getSimpleName();
        
        float etki = bilgisayar.nesneSec(index).etkiHesapla(r2);
        float etki2 = bilgisayar2.nesneSec(index2).etkiHesapla(r);
        if(etki>etki2){w=1;w2=0;}
        else if(etki<etki2){w=0;w2=1;}
        else{w=0;w2=0;}
        jTextArea1.setText("      etki    D.  S. \t\t    etki      D.  S.\n");
        
        jTextArea1.append(bilgisayar.nesneSec(index).getClass().getSimpleName()+"  "+etki+" / "+bilgisayar.nesneSec(index).nesnePuaniGoster()+"\t");
            bilgisayar.liste.set(index, bilgisayar.nesneSec(index).durumGuncelle((etki2),w,bilgisayar.nesneSec(index)));
            model.setElementAt(bilgisayar.nesneSec(index).getClass().getSimpleName(), index);
            loop.remove(nextRandomNumberIndex);
            if(bilgisayar.nesneSec(index)==null){
                jTextArea1.append("silindi ");
                bilgisayar.liste.remove(index);
                model.remove(index);}
            if(loop.size()==0){
                for (int j = 0; j < bilgisayar.liste.size(); j++) {
                    loop.add(j);}
            }
            
        jTextArea1.append(bilgisayar2.nesneSec(index2).getClass().getSimpleName()+"  "+etki2+" / "+bilgisayar2.nesneSec(index2).nesnePuaniGoster()+"\n");
            bilgisayar2.liste.set(index2, bilgisayar2.nesneSec(index2).durumGuncelle((etki),w2,bilgisayar2.nesneSec(index2)));
            model2.setElementAt(bilgisayar2.nesneSec(index2).getClass().getSimpleName(), index2);
            loop2.remove(nextRandomNumberIndex2);
            if(bilgisayar2.nesneSec(index2)==null){
                jTextArea1.append("silindi ");
                bilgisayar2.liste.remove(index2);
                model2.remove(index2);}
            if(loop2.size()==0){
                for (int j = 0; j < bilgisayar2.liste.size(); j++) {
                    loop2.add(j);}
            }    
            
         
        hamleSayisi++;
        if(hamleSayisi==maxHamle){
            skor1 = bilgisayar.skorGoster();
            skor2 = bilgisayar2.skorGoster();
            jLabel5.setText(String.format("%s", skor1));
            jLabel6.setText(String.format("%s", skor2));
            jTextArea1.setText("");
            
            if(skor1>skor2){jTextArea1.append("Bilgisayar1 Kazandi");}
            else if(skor1<skor2){jTextArea1.append("Bilgisayar2 Kazandi");}
            else{jTextArea1.append("Berabere");}
            
            jList1.setVisible(false);
            jList2.setVisible(false);
        }
        else if(bilgisayar.liste.size()==0){
            jTextArea1.setText("");
            jTextArea1.append("Bilgisayar Kazandi");
            jList1.setVisible(false);
            jList2.setVisible(false);
        }
        else if(bilgisayar2.liste.isEmpty()){
            jTextArea1.setText("");
            jTextArea1.append("Bilgisayar2 Kazandi");
            jList1.setVisible(false);
            jList2.setVisible(false);
        }     
    }//GEN-LAST:event_OynaButonActionPerformed
  
    public static void main(String args[]) {
        
            
//        float f=0.2f;
//        System.out.println(1-f);
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
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBButon;
    private javax.swing.JButton KBButon;
    private javax.swing.JButton OynaButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton kagitButon;
    private javax.swing.JButton makasButon;
    private javax.swing.JButton nesneSecimiButon;
    private javax.swing.JButton tasButon;
    // End of variables declaration//GEN-END:variables
}
