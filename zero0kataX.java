import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Harman Bhutani
 */
public class zero0kataX extends javax.swing.JFrame {

    /**
     * Creates new form zero0kataX
     */
    public zero0kataX() {
        initComponents();
    }
    
     String buttonname;
    boolean vijeta=false;
    int count=0;
    
    public void vv()
    {
        //if((jButton1.getText().equals(x.jButton2.getText()))&&(x.jButton2.getText().equals(x.jButton3.getText()))||(x.jButton4.getText().equals(x.jButton5.getText())&&(x.jButton5.getText().equals(x.jButton6.getText())))||((x.jButton7.getText().equals(x.jButton8.getText()))&&(x.jButton8.getText().equals(x.jButton9.getText()))))
  if(jButton1.getText()==jButton2.getText() && jButton2.getText()==jButton3.getText() && jButton1.getText()!="" )
			{
				vijeta=true;
				result(buttonname);
	
			}
			// Horizontal win row 2
			else if(jButton4.getText()==jButton5.getText() && jButton5.getText()==jButton6.getText() && jButton4.getText()!="" )
						{
							vijeta=true;
							result(buttonname);
				
						}
			// horizontal win row 3
			else if(jButton7.getText()==jButton8.getText() && jButton8.getText()==jButton9.getText() && jButton7.getText()!="")
			{
				vijeta=true;
			result(buttonname);
	
			}
			
			// NOW TIME FOR VERTICAL WINS
			else if(jButton1.getText()==jButton4.getText() && jButton4.getText()==jButton7.getText() && jButton1.getText()!="")
			{
				vijeta=true;
				result(buttonname);
	
			}
			
			else if(jButton2.getText()==jButton5.getText() && jButton5.getText()==jButton8.getText() && jButton2.getText()!="")
			{
				vijeta=true;
				result(buttonname);
	
			}
			
			else if(jButton3.getText()==jButton6.getText() && jButton6.getText()==jButton9.getText()&& jButton3.getText()!="" )
			{
				vijeta=true;
				result(buttonname);
	
			}
			
			//Diagonal Wins
                        else if(jButton1.getText()==jButton5.getText() && jButton5.getText()==jButton9.getText()&& jButton1.getText()!="" )
			{
				vijeta=true;
				result(buttonname);
	
			}
			else if(jButton3.getText()==jButton5.getText() && jButton5.getText()==jButton7.getText()&& jButton3.getText()!="" )
			{
				vijeta=true;
				result(buttonname);
	
                        }
       
    }
         
    
    
    public void result(String bname)
    {
        zero0kataX z = new  zero0kataX();
        int k;
          JOptionPane.showMessageDialog(null,"WINNER IS "+bname);
         
     k=  JOptionPane.showConfirmDialog(null,"Play Again!!","?",YES_NO_OPTION);
      
           switch(k){
           case 0:
          {
            dispose();
               new zero0kataX().setVisible(true);
               
           
          }
           case 1:
           {
              dispose();
            }
      
         
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 300));
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
            
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        
        jButton1.setText(buttonname);
       // jButton1.setBackground(Color.BLACK);
       // jButton1.setBackground(Color.black);
       // jButton1.setBackground(Color.red);
       
       
        jButton1.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton2.setText(buttonname);
        jButton2.setBackground(Color.BLACK);
        jButton2.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton3.setText(buttonname);
        jButton3.setBackground(Color.BLACK);
        jButton3.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton4.setText(buttonname);
        jButton4.setBackground(Color.BLACK);
        jButton4.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton5.setText(buttonname);
        jButton5.setBackground(Color.BLACK);
        jButton5.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton6.setText(buttonname);
        jButton6.setBackground(Color.BLACK);
        jButton6.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton7.setText(buttonname);
        jButton7.setBackground(Color.BLACK);
        jButton7.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        count++;
         // draw();
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton8.setText(buttonname);
        jButton8.setBackground(Color.BLACK);
        jButton8.setEnabled(false);
        vv();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        count++;
       // draw();
        if(count==1||count==3||count==5||count==7||count==9)
        {
            buttonname="X";
        }
        else if(count==2||count==4||count==6||count==8)
        {
           buttonname="0";
        }
        jButton9.setText(buttonname);
        jButton9.setBackground(Color.BLACK);
        jButton9.setEnabled(false);
        vv();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void draw()
    {
         if(count==9&&vijeta==false)
    {
        JOptionPane.showMessageDialog(null, "GAME IS DRAW");
    }
    }
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
            java.util.logging.Logger.getLogger(zero0kataX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zero0kataX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zero0kataX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zero0kataX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
               zero0kataX z = new  zero0kataX();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // zero0kataX x = new zero0kataX();
                new zero0kataX().setVisible(true);
               
            }
        });
         
     
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
