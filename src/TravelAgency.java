
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import javax.swing.JOptionPane;


public class TravelAgency extends javax.swing.JFrame {

    CarList cl=new CarList();
    //int ncar=1;
    Date dt=new Date();
    BookCar bc=new BookCar();
    ReturnCar rc=new ReturnCar();
    BuyCar bnc =new BuyCar();
    DispalyCars dc =new DispalyCars();
    Statistics st=new Statistics();
    
    
    public TravelAgency() {
        initComponents();
        
        
        connect();
        readdata();
    }
    
    public void readdata()
   {
        File f2=new File ("record.ser");
        if(f2.exists()&&!f2.isDirectory())
        {
          try
      {
         FileInputStream fileIn = new FileInputStream("record.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         cl = (CarList) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
          
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      
      {
        
         c.printStackTrace();
         return;
      }
        } 
        else{
           // System.out.println("in else");
          init();
        }
   }
    
    void init()
    {
        int i=0;
        for( i=0;i<10;i++)
        {
           cl.cr[i].name="Ambassadors";
           cl.cr[i].id=(cl.ncar++);
           cl.cr[i].phc=20;
           cl.cr[i].pkmc=10;
           cl.cr[i].price=600000;
        }
       // System.out.println(cl.ncar);
        for(;i<12;i++)
        {
           cl.cr[i].name="Ambassadors";
           cl.cr[i].id=(cl.ncar++);
           cl.cr[i].phc=25;
           cl.cr[i].pkmc=12;
           cl.cr[i].ac=1;
           cl.cr[i].price=800000;
        }
        
        for(;i<17;i++)
        {
           cl.cr[i].name="Tata Sumo";
           cl.cr[i].id=(cl.ncar++);
           cl.cr[i].phc=30;
           cl.cr[i].pkmc=15;
           cl.cr[i].price=1500000;
        }
        
        for(;i<22;i++)
        {
           cl.cr[i].name="Tata Sumo";
           cl.cr[i].id=(cl.ncar++);
           cl.cr[i].phc=40;
           cl.cr[i].pkmc=17;
           cl.cr[i].ac=1;
           cl.cr[i].price=1500000;
        }
        
        for(;i<32;i++)
        {
           cl.cr[i].name="Maruti Omni";
           cl.cr[i].id=(cl.ncar++);
           cl.cr[i].phc=20;
           cl.cr[i].pkmc=10;
           cl.cr[i].price=1000000;
        }
        
        for(;i<42;i++)
        {
           cl.cr[i].name="Maruti Esteem";
           cl.cr[i].id=(cl.ncar++);
           cl.cr[i].phc=75;
           cl.cr[i].pkmc=25;
           cl.cr[i].ac=1;
           cl.cr[i].price=3000000;
        }
        
        for(;i<52;i++)
        {
           cl.cr[i].name="Mahindra Armada";
           cl.cr[i].id=(cl.ncar++);
           cl.cr[i].phc=20;
           cl.cr[i].pkmc=10;
           cl.cr[i].price=300000;
           
        }
        cl.ncar-=1;
      //  System.out.println(cl.ncar);
    }
    
    void connect()
    {
        bc.connect(cl);
        rc.connect(cl);
        bnc.connect(cl);
        dc.connect(cl);
        st.connect(cl);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(171, 254, 9));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setText("Welcome....");

        jButton1.setBackground(new java.awt.Color(253, 10, 10));
        jButton1.setText("Book Car");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(84, 8, 231));
        jButton2.setText("Buy Car");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(254, 230, 62));
        jButton3.setText("Repaire");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(192, 14, 254));
        jButton4.setText("Return Car");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 220));
        jButton5.setText("Display");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(254, 230, 62));
        jButton6.setText("Sold Car");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(254, 230, 62));
        jButton8.setText("Get Repair");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Display Stats");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(4, 253, 206));
        jButton10.setText("Save");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton9))
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton2, jButton3, jButton4, jButton5, jButton6, jButton8, jButton9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       bc.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       rc.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      int rid,i;
        rid = Integer.parseInt(JOptionPane.showInputDialog("Enter id of Car you want to repair"));
        
        for(i=0;i<1000;i++)
        {
            if(rid==cl.cr[i].id )
            {
                if(cl.cr[i].status==0)
                {
                cl.cr[i].status=2;
                JOptionPane.showMessageDialog(null,"Successfully Sent for reparing");
                cl.cr[i].nrepair++;
                break;
                }
                else if(cl.cr[i].status==1)
                    JOptionPane.showMessageDialog(null,"This Car is rented out");
                else if(cl.cr[i].status==2)
                    JOptionPane.showMessageDialog(null,"This Car is alredy went for Reparing");
            //    else if(cl.cr[i].status==3)
              //      JOptionPane.showMessageDialog(null,"This Car is sold off");
                break;
            }
            
            
        }
        if(i==1000)
            JOptionPane.showMessageDialog(null,"Wrong Id \nplease enter correct id");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        int rid,i;
        double cost;
        rid = Integer.parseInt(JOptionPane.showInputDialog("Enter id of Car"));
         
        
        for(i=0;i<1000;i++)
        {
            if(rid==cl.cr[i].id  )
            {
                if(cl.cr[i].id==1)
                {
                cl.cr[i].exp+=Double.parseDouble(JOptionPane.showInputDialog("Enter cost of maintenance"));
                cl.cr[i].status=0;
                break;
                }
                else
                    JOptionPane.showMessageDialog(null,"This Car is not sent for repair");
                break;
            }
        }
        if(i==1000)
            JOptionPane.showMessageDialog(null,"Not available");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       int rid,i;
        rid = Integer.parseInt(JOptionPane.showInputDialog("Enter id of Car you want to repair"));
        
        for(i=0;i<1000;i++)
        {
            if(rid==cl.cr[i].id)
            {
                if(cl.cr[i].status==0)
                {
                    cl.cr[i].status=3;
                    JOptionPane.showMessageDialog(null,"Sold out");
                    break;
                }
                else if(cl.cr[i].status==1)JOptionPane.showMessageDialog(null,"This Car is rented out cant be sold right now");
                else if(cl.cr[i].status==2) JOptionPane.showMessageDialog(null,"This Car is  went for Reparing cant be sold right now");    
                break;
            }
        }
        if(i==1000)
            JOptionPane.showMessageDialog(null,"Wrong Id \nplease enter correct id");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       bnc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dc.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       st.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            try
      {
         FileOutputStream fileOut =
         new FileOutputStream("record.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(cl);
         out.close();
         fileOut.close();
      //   System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i)
          
      {
          i.printStackTrace();
      }
    }//GEN-LAST:event_jButton10ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
