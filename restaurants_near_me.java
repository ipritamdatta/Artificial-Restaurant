/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pritam
 */
public class restaurants_near_me extends javax.swing.JFrame {

    /**
     * Creates new form restaurants_near_me
     */
    public restaurants_near_me() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Lalbag Fort", "Hatirjheel", "Liberation War Museum", "National Parliament House", "Ahsan Manzil" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(270, 20, 240, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("YOUR DESIRED LOCATION:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 60, 250, 30);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 360, 69, 27);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("SELECT A LANDMARK :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 230, 26);

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(270, 60, 100, 30);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 17)); // NOI18N
        jButton2.setText("GO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 60, 60, 30);

        jTextArea1.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 110, 400, 140);

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 360, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("in miles (eX: 0.1)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 90, 140, 19);

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(520, 110, 10, 140);

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 110, 10, 140);

        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(560, 110, 10, 140);

        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 110, 10, 140);

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 110, 10, 140);

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 110, 10, 140);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Liberation War Museum"))
        {
            double getmile = Double.parseDouble(jTextField1.getText());
            if(getmile==0.0 || getmile==0.1)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. you will find it nearby\n"
                        +"you will find restaurant after 0.1 miles\n");
            }
            if(getmile==0.2)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                            +"  ////   Kasturi   \\\\\\\\\n\n"
                            +"Location: \n"
                            +"Bijoy Nagar, Dhaka City 1000, Bangladesh\n"
                            +"0.2 Miles from Liberation War Museum\n"
                            +"Call           +8801715-677458\n\n");
            }
            if(getmile==0.3)
            {
                jTextArea1.append("\nLiberation War Museum\n\n"
                                   +" ////   Breeze Cafe   \\\\\\\\\n\n"
                            +"Location: \n"
                            +"34/1 Topkhana Road | \n"
                            +"Asia Hotel & Resorts\n"
                            +"Dhaka City 1000, Bangladesh\n"
                            +"0.3 miles from Liberation War Museum\n"
                            +"Call           +8801812001144\n\n");  
            }
            if(getmile==0.4)
            {
                jTextArea1.append("\nLiberation War Museum\n\n"
                                +" ////   Korai Gost    \\\\\\\\\n\n"
                            +"Location: \n"
                            +"VIP Road, Dhaka City 1000, Bangladesh\n"
                            +"0.4 Miles From Liberation War Museum\n"
                            +"Call            +8801195-326807\n\n");
            }
            if(getmile==0.5||getmile==0.7||getmile==0.8||getmile==1.2)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. you will find it nearby\n"
                        + "there are some restaurants within 0.6miles\n");
            }
            if(getmile==0.6)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                            +"////   Swiss Bakery    \\\\\\\\\n\n"
                            +"Location: \n"
                            +"9 New Bailey Road, Ramna\n"
                            +"Dhaka City , Bangladesh\n"
                            +"0.6 Miles from Liberation War Museum\n"
                            +"Call            +8801919-233331\n\n"
                            +"////   The Cream & Fudge Factory    \\\n\n"
                            +"Location: \n"
                            +"Road 11 | Banani\n"
                            +"Dhaka City, Bangladesh\n"
                            +"0.6 Miles from Liberation War Museum\n"
                            +"Call            +8801919-554741\n\n"
                            +"////   Thirty3    \\\\\n\n"
                            +"Location: \n"
                            +"3 New Baily Road\n"
                            +"Dhaka City 1000,Bangladesh\n"
                            +"0.6 Miles from Liberation War Museum\n"
                            +"Call            +8801616-173303\n\n");
            }
            if(getmile==0.9)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                                +"////   Hazir Biriani    \\\\\n\n"
                            +"Location: \n"
                            +"70 Kazi Alauddin Road Or Bashundhara R/A\n"
                            +"Nazira Bazar, Dhaka City, Bangladesh\n"
                            +"0.9 Miles From Liberation War Museum\n"
                            +"Call            +8801711-523505\n\n");
            }
            if(getmile==1.0)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                                +"////   Nirob Hotel Restaurant   \\\\n\n"
                            +"Location: \n"
                            +"Najimuddin Road\n"
                            +"Dhaka City 1100, Bangladesh\n"
                            +"1.0 Miles from Liberation War Museum\n"
                            +"Call            +8802-7300265\n\n");
            }
            if(getmile==1.1)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                                 +"////   Kolkata Kacchi Ghor    \\\\n\n"
                            +"Location: \n"
                            +"14 Abul Hasnat Road\n"
                            +"Street Running Opposite Of Central Jail\n"
                            +"Dhaka City 1100 , Bangladesh\n"
                            +"1.1 miles from Liberation War Museum\n"
                            +"Call            +8801718-939933\n\n");
            }
            if(getmile==1.3)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                                +"////   Star    \\\\\n"
                            +"Location: \n"
                            +"Kawran Bazar\n"
                            +"Dhaka City 1215, Bangladesh\n"
                            +"1.3 miles from Liberation War Museum\n"
                            +"Call            02-091-25955\n\n");
            }
            if(getmile>1.3)
            {
                jTextArea1.append("\nLiberation War Museum\n\n\n"
                        +"No restaurant is present in this"
                        +"exact location. But\n"
                        + "there are some restaurants within 1.3mile\n");
            }
            if(getmile<0.0)
            {
                jTextArea1.append("enter valid input\n");
            }
        }
        if(jComboBox1.getSelectedItem().equals("National Parliament House"))
        {
            double getmile = Double.parseDouble(jTextField1.getText());
            if(getmile==0.0||getmile==0.1||getmile==0.2)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. you will find it nearby\n"
                        +"you will find restaurant after 0.2 miles\n");
            }
            if(getmile==0.3)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                        +"////    The Red Window   \\\n\n"
                            +"Location: \n"
                            +"Road# 16 | House 19/A ,Dhanmondi 27\n"
                            +"Dhaka City 1209, Bangladesh\n"
                            +"0.3 Miles from National Parliament House\n"
                            +"Call            +017187344444\n\n");
            }
            if(getmile==0.4)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                                  +"////    Bfc    \\\\n\n"
                            +"Location: \n"
                            +"Road# 28 Old Dhanmondi - 5\n"
                            +"Located at Orchid Plaza\n"
                            +"Dhaka City 1216, Bangladesh\n"
                            +"0.4 Miles from National Parliament House\n"
                            +"Call            +8801712-097206\n\n"
                            +"////    Bhooter Bari Dhanmondi   \\\\\n\n"
                            +"Location: \n"
                            +"House 1/5, Block D, Lalmatia\n"
                            +"Dhaka City, Bangladesh\n"
                            +"0.4 Miles from National Parliament House\n"
                            +"Call            +8801990-480673\n\n");
            }
            if(getmile==0.5)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                                +"////    Santoor     \\\\\n\n"
                            +"Location: \n"
                            +"Road-11 New| 32 - Old |\n"
                            +"Mirpur Road, Dhanmondi Dhaka-1209\n"
                            +"Dhaka City , Bangladesh\n"
                            +"0.5 Miles from National Parliament House\n"
                            +"Call            +8802-9128737\n\n"
                             +"////    Kings  Confectionery   \\\\\n\n"
                            +"Location: \n"
                            +"House 25, Road no 11, Block F\n"
                            +"Dhaka City, Bangladesh\n"
                            +"0.5 Miles from National Parliament House\n\n"
                            +"////    Cafe Mango    \\\\\n\n"
                            +"Location: \n"
                            +"Dhanmondi, Dhaka City, Bangladesh\n"
                            +"0.5 Miles from National Parliament House\n\n");
            }
            if(getmile==0.6)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                                +"////    Baburchi    \\\\\n\n"
                            +"Location: \n"
                            +"No 55/A House, Dhaka City 1209, Bangladesh\n"
                            +"0.6 Miles from National Parliament House\n"
                            +"Call             +880-1611-12-22-22\n\n"
                            +"////    Thai-Chi Restaurant    \\\\n\n"
                            +"Location: \n"
                            +"117/A Bijoy Sarani| Rangs Bhaban, Level 7\n"
                            +"Dhaka City, Bangladesh\n"
                            +"0.6 Miles from National Parliament House\n"
                            +"Call             +8801712-592085\n\n"
                            +"////    Crimson Cup Coffee House   \\\n\n"
                            +"Location: \n"
                            +"Road 27 | House #275/D\n"
                            +"Dhaka City 1209, Bangladesh\n"
                            +"0.6 Miles from National Parliament House\n"
                            +"Call             +8801788609654\n\n");
            }
            if(getmile==0.7)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. you will find it nearby\n"
                        +"you will find restaurant after 0.2 miles\n"
                        +"and within 0.6miles\n");
            }
            if(getmile==0.8)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                                +"////    Bar-B-Q Tonight   \\\n\n"
                            +"Location: \n"
                            +"Dhanmondi 27, Dhaka City, Bangladesh\n"
                            +"0.8 Miles from National Parliament House\n"
                            +"Call            +8801763-772110\n\n");
            }
            if(getmile>0.8)
            {
                jTextArea1.append("\nNational Parliament House\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant\n"
                        +"within 0.8miles\n");
            }
            if(getmile<0.0)
            {
                jTextArea1.append("enter valid input\n");
            }
        }
        if(jComboBox1.getSelectedItem().equals("Ahsan Manzil"))
        {
            double getmile = Double.parseDouble(jTextField1.getText());
            if(getmile==0.0||getmile==0.2||getmile==0.3)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant\n"
                        +"from 0.4 miles,although there are \n"
                        +"restaurants in 0.1 mile\n");
            }
            if(getmile==0.1)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                                +"////    Kostori   \\\\n\n"
                            +"Location: \n"
                            +"Gulshan| Zaman Chamber, 7th Floor\n"
                            +"Dhaka City 1000, Bangladesh\n"
                            +"0.1 Miles from Ahsan Manzil\n"
                            +"Call             01709974005\n\n"
                            +"////    Pizza Hatt    \\n\n"
                            +"Location: \n"
                            +"Bashundhara City, Dhaka City, Bangladesh\n"
                            +"0.1 Miles from Ahsan Manzil\n\n");
            }
            if(getmile==0.4)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                                  +"////    Beauty Lacchi    \\\\n\n"
                            +"Location: \n"
                            +"30 A Johnson Road, Dhaka City 1100, Bangladesh\n"
                            +"0.4 Miles from Ahsan Manzil\n\n");
            }
            if(getmile==0.5)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant\n"
                        +"from 0.8 miles,although there are \n"
                        +"restaurants in 0.1 mile and 0.4\n");
            }
            if(getmile==0.6||getmile==0.7||getmile==1.0||getmile==1.1)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant\n"
                        +"within 0.8,0.9 and 1.2 miles\n"
                        +"thank you\n");
            }
            if(getmile==0.8)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                                +"////   Kolkata Kacchi Ghor   \\\n\n"
                            +"Location: \n"
                            +"14 Abul Hasnat Road | Street Running Opposite Of Central Jail\n"
                            +"Dhaka City 1100 ,  Bangladesh\n"
                            +"0.8 Miles from Ahsan Manzil\n"
                            +"Call             +8801718-939933\n\n"
                            +"////    Grand Nawab   \\\\n\n"
                            +"Location: \n"
                            +"13/1 Abul Hasnat Road | Satrowja Near Bangshal\n"
                            +"Dhaka City , Bangladesh\n"
                            +"0.8 Miles from Ahsan Manzil\n"
                            +"Call             +8801718-360657\n\n");
            }
            if(getmile==0.9)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                                +"////    Hazir Biriani    \\\\n\n"
                            +"Location: \n"
                            +"70 Kazi Alauddin Road Or Bashundhara R/A\n"
                            +"Nazira Bazaar, Dhaka City, Bangladesh\n"
                            +"0.9 Miles from Ahsan Manzil\n"
                            +"Call             +8801711-523505\n\n");
            }
            if(getmile==1.2)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                                +"////    Plate 21    \\\\n\n"
                            +"Location: \n"
                            +"19 Shayesta Khan Road,Dhaka City 1211, Bangladesh\n"
                            +"1.2 Miles from Ahsan Manzil\n"
                            +"Call             +8801611-538888\n\n"
                            +"////    Dawat-e-Kabab   \\\\n\n"
                            +"Location: \n"
                            +"157, Distilary Road | Near Katherpool Mor Gandaria\n"
                            +"Dhaka City 1204 , Bangladesh\n"
                            +"1.2 Miles from Ahsan Manzil\n"
                            +"Call             +8801622-221444\n\n");
            }
            if(getmile>=1.3 && getmile<=1.5)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant\n"
                        +"within 1.2miles and\n"
                        +"another one is far away within 1.6miles\n");
            }
            if(getmile==1.6)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                                +"////    Bluelights Cafe    \\n\n"
                            +"Location: \n"
                            +"87 Motijheel C.A., Dhaka City 1000, Bangladesh\n"
                            +"1.6 Miles from Ahsan Manzil\n"
                            +"Call             +8801619-192099\n\n");
            }
            if(getmile>=1.7 && getmile<=5.5)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant\n"
                        +"within 1.6miles and\n"
                        +"another one is far away within 5.6miles\n");
            }
            if(getmile==5.6)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                                +"////    Izumi    \\\n\n"
                            +"Location: \n"
                            +"House 24, Road 113 | Gulshan-2, Dhaka City, Bangladesh\n"
                            +"Dhaka City Bangladesh\n"
                            +"5.6 Miles from Ahsan Manzil\n"
                            +"Call             +8801762-635083\n\n");
            }
            if(getmile>5.6)
            {
                jTextArea1.append("\nAhsan Manzil\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant\n"
                        +"within 0.1 to 1.2miles or 5.6miles\n");
            }
            if(getmile<0.0)
            {
                jTextArea1.append("enter valid input\n");
            }
        }
        if(jComboBox1.getSelectedItem().equals("Lalbag Fort"))
        {
            double getmile = Double.parseDouble(jTextField1.getText());
            if(getmile==0.0||getmile==0.2||getmile==0.3||getmile==0.4||getmile==0.5||getmile==0.6)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant near 0.1\n"     
                        +"mile or 0.7 mile\n"
                        +"two restaurants are present there\n");
            }
            if(getmile==0.1)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"////  Plate 21  \\n\n"
                            +"Location: \n"
                            +"19 Shayesta Khan Road\n"
                            +"Dhaka City 1211, Bangladesh\n"
                            +"0.1 miles from Lalbag Fort\n"
                            +"Call          +8801611-538888\n\n");
            }
            if(getmile==0.7)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"////   Nirob Hotel Restaurant   \\\n\n"
                            +"Location: \n"
                            +"Najimuddin Road, Dhaka City 1100, Bangladesh\n"
                            +"0.7 miles from Lalbag Fort\n"
                            +"Call          +8802-7300265\n\n");
            }
            if(getmile==0.8)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"////   Kolkata Kacchi Ghor   \\\n\n"
                            +"Location: \n"
                            +"14 Abul Hasnat Road| \n"
                            +"Street Running Opposite Of Central Jail\n"
                            +"Dhaka City 1100, Bangladesh\n"
                            +"0.8 miles from Lalbag Fort\n"
                            +"Call           +8801718-939933\n\n"
                            +"////   Grand Nawab   \\n\n"
                            +"13/1, Abul Hasnat Road|\n"
                            +"Satrowja, Near Bangshal, Dhaka City, Bangladesh\n"
                            +"0.8 miles from Lalbag Fort\n"
                            +"Call           +8801718-360657\n\n");
            }
            if(getmile==0.9||getmile==1.0||getmile==1.1)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant near 0.8\n"     
                        +"mile or 1.2 mile\n"
                        +"\n");
            }
            if(getmile==1.2)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"////   Hazir Biriyani   \\n\n"
                            +"Location: \n"
                            +"70 Kazi Alauddin Road Or Bashundhara R/A\n"
                            +"Nazira Bazar, Dhaka City, Bangladesh\n"
                            +"1.2 miles from Lalbag Fort\n"
                            +"Call          +8801711-523505 \n\n");
            }
            if(getmile==1.3||getmile==1.4||getmile==1.5||getmile==1.6)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant near 1.2\n"     
                        +"mile or 1.7 mile\n"
                        +"you can also find restaurants within 0.8mile\n");
            }
            if(getmile==1.7)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"////   Shwrma House   \\\\n\n"
                            +"Location: \n"
                            +"Hatirpool, Dhaka City, Bangladesh\n"
                            +"1.7 miles from Lalbag Fort\n"
                            +"Call           +88029663060\n\n");
            }
            if(getmile>1.7)
            {
                jTextArea1.append("\nLalbag Fort\n\n\n"
                                +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant within \n"     
                        +"1.7 mile\n"
                        +"you can also find restaurants within 1.2 mile\n");
            }
            if(getmile<0.0)
            {
                jTextArea1.append("enter valid input\n");
            }
        }
        if(jComboBox1.getSelectedItem().equals("Hatirjheel"))
        {
            double getmile = Double.parseDouble(jTextField1.getText());
            if(getmile==0.0|getmile==0.1||getmile==0.2)
            {
                jTextArea1.append("\n\nHatirjheel\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant near 0.3\n");
            }
            if(getmile==0.3)
            {
                jTextArea1.append("\n\nHatirjheel\n\n"
                                +"////   Tripti   \\n\n"
                            +"Location: \n"
                            +"1 Bir Uttam Rafiqul Islam Avenue|\n"
                            +"C-13, Dhaka City 1212, Bangladesh\n"
                            +"0.3 miles from Hatirjheel\n");
            }
            if(getmile==0.4)
            {
                jTextArea1.append("\n\nHatirjheel\n\n"
                                +"////   KFC   \\\\n\n"
                            +"Location: \n"
                            +"Gulshan South, Dhaka City 1200, Bangladesh\n"
                            +"0.4 miles from Hatirjheel\n"
                            +"Call           88029893028\n\n");
            }
            if(getmile==0.5)
            {
                jTextArea1.append("\n\nHatirjheel\n\n"
                                +"////   Fish & Co. Bangladesh   \\\n\n"
                            +"Location: \n"
                            +"Crystal Palace, 22 Gulshan South Avenue\n"
                            +"Dhaka City 1212, Bangladesh\n"
                            +"0.5 miles from Hatirjheel\n"
                            +"Call           +8801777-794181\n\n"
                            +"////   Nandos\\\n\n"
                            +"Location: \n"
                            +"Gulshan South Avenue | Plot #5E / F- 1\n"
                            +"Gulshan #01, Dhaka City 1212, Bangladesh\n"
                            +"0.5 miles from Hatirjheel\n"
                            +"Call           +8802-8812121\n\n");
            }
            if(getmile==0.6)
            {
                jTextArea1.append("\n\nHatirjheel\n\n"
                                +"////   Gloria Jeans Coffees  \\\n\n"
                            +"Location: \n"
                            +"Gulshan Avenue, House 35| Road 71\n"
                            +"Dhaka City, Bangladesh\n"
                            +"0.6 miles from Hatirjheel\n"
                            +"Call           +8801929-333999\n\n");
            }
            if(getmile>0.6)
            {
                jTextArea1.append("\n\nHatirjheel\n\n"
                        +"No restaurant is present in this\n"
                        +"exact location. But\n"
                        +"you will find restaurant near 0.3 to 0.6mile\n");
            }
            if(getmile<0.0)
            {
                jTextArea1.append("enter valid input\n");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText(null);
        jTextField1.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(restaurants_near_me.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurants_near_me.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurants_near_me.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurants_near_me.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restaurants_near_me().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}