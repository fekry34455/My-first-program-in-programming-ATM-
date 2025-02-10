/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author fekry
 */
public class ATM4 extends JFrame implements ActionListener{
    String i1,i2,addn;
    JPanel p,pa,pb,pa1,pa2,pa3,pb1,pb2,pb3,mon,pagap1,pagap2;
    JButton ba11,ba12,ba13,ba14,ba21,ba22,ba23,ba24;
    JButton bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bbc1,bbc2,bbc3,bbc4;
    JPanel m,plabelr,plabell,plabelc;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
 
    public  ATM4(){
        p=new JPanel(new GridLayout(2, 1));
        //pa
        pa=new JPanel(new BorderLayout());
        pa1=new JPanel(new GridLayout(4, 1));
        
            ba11=new JButton("==>");   
            ba12=new JButton("==>");   
            ba13=new JButton("==>");   
            ba14=new JButton("==>"); 
            ba11.addActionListener(this);
             ba12.addActionListener(this);
             ba13.addActionListener(this);
             ba14.addActionListener(this);
            pa1.add(ba11);
            pa1.add(ba12);
            pa1.add(ba13);
            pa1.add(ba14);
            
            pa.add(pa1, BorderLayout.WEST);
            
        pa2=new JPanel(new BorderLayout());
        m = new JPanel(new GridLayout(1, 3));
        pa2.add(m);

        plabelr=new JPanel(new GridLayout(4, 1));
        plabelr.add(l1=new JLabel("       "+""));
        plabelr.add(l2=new JLabel("       "+""));
        plabelr.add(l3=new JLabel("       "+""));
        plabelr.add(l4=new JLabel("       "+""));
        plabelr.setBackground(Color.white);
        m.add(plabelr, BorderLayout.WEST);
        
        plabelc=new JPanel(new GridLayout(4, 1));
        plabelc.add(l9=new JLabel("                               Insert the card" ));
        plabelc.add(l10=new JLabel("       "+""));
        plabelc.add(l11=new JLabel("       "+""));
        plabelc.add(l12=new JLabel("       "+""));
        plabelc.setBackground(Color.white);
        m.add(plabelc, BorderLayout.CENTER);
        
        plabell=new JPanel(new GridLayout(4, 1));
        plabell.add(l5=new JLabel("       "+""));
        plabell.add(l6=new JLabel("       "+""));
        plabell.add(l7=new JLabel("       "+""));
        plabell.add(l8=new JLabel("       "+""));
        plabell.setBackground(Color.white);
        m.add(plabell, BorderLayout.EAST);

            pa.add(pa2);          

        pa3=new JPanel(new GridLayout(4, 1));
        pagap2=new JPanel(new GridLayout(4,1,10,50));
            ba21=new JButton("<==");   
            ba22=new JButton("<==");   
            ba23=new JButton("<==");   
            ba24=new JButton("<=="); 
            ba21.addActionListener(this);
             ba22.addActionListener(this);
             ba23.addActionListener(this);
             ba24.addActionListener(this);
            pa3.add(ba21);
            pa3.add(ba22);
            pa3.add(ba23);
            pa3.add(ba24);
            pa.add(pa3, BorderLayout.EAST);
            p.add(pa);
            
            
            //pb
             pb=new JPanel(new BorderLayout());
             pb1=new JPanel(new GridLayout(2, 1));
             pb.add(pb1, BorderLayout.EAST);
             pb1.add(bbc1=new JButton("ادخال بطاقة"));
             pb1.add(bbc2=new JButton("سحب نقدي"));
             bbc1.addActionListener(this);
             bbc2.addActionListener(this);
             //الارقام
             pb2=new JPanel(new GridLayout(4, 3));
             pb2.add(bb1=new JButton("1"));
             pb2.add(bb2=new JButton("2"));
             pb2.add(bb3=new JButton("3"));
             pb2.add(bb4=new JButton("4"));
             pb2.add(bb5=new JButton("5"));
             pb2.add(bb6=new JButton("6"));
             pb2.add(bb7=new JButton("7"));
             pb2.add(bb8=new JButton("8"));
             pb2.add(bb9=new JButton("9"));
             pb2.add(bb10=new JButton("<="));
             pb2.add(bb11=new JButton("0"));
             pb2.add(bb12=new JButton("c"));
             bb1.addActionListener(this);
             bb2.addActionListener(this);
             bb3.addActionListener(this);
             bb4.addActionListener(this);
             bb5.addActionListener(this);
             bb6.addActionListener(this);
             bb7.addActionListener(this);
             bb8.addActionListener(this);
             bb9.addActionListener(this);
             bb10.addActionListener(this);
             bb11.addActionListener(this);
             bb12.addActionListener(this);
             pb.add(pb2, BorderLayout.CENTER);
             pb3=new JPanel(new GridLayout(2, 1));
             pb3.add(bbc3=new JButton("فاتورة"));
             pb3.add(bbc4=new JButton("ادخال نقدي"));
             bbc3.addActionListener(this);
             bbc4.addActionListener(this);
             pb.add(pb3, BorderLayout.WEST);
             p.add(pb);
             this.add(p);
             

    }
    
 public class invoice extends JFrame implements ActionListener{
        public JPanel p;
        public JLabel il1,il2,il3,il4;
        String aaa="ffdfdf";
      public invoice(){
         p=new JPanel(new GridLayout(4, 1));
         il1=new JLabel("account number");
         il2=new JLabel("***********463");
         il3=new JLabel(i2());
         il4=new JLabel(i1());
         p.setBackground(Color.white);
         p.add(il1);
         p.add(il2);
         p.add(il3);
         p.add(il4);
         this.add(p);
      }
//       public invoice(String a){
//        il3.setText(a);
//      }


        @Override
        public void actionPerformed(ActionEvent ae) {         
        }

 }
 public class add extends JFrame implements ActionListener{
        public JPanel padd;
        public JLabel iadd;
        JButton badd;
        JTextField Fadd;
        public add(){
        padd=new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        iadd=new JLabel("add");
        Fadd=new JTextField();
        Fadd.setColumns(10);
        badd=new JButton("add");
        badd.addActionListener(this);
        padd.add(iadd);
        padd.add(Fadd);
        padd.add(badd);
        this.add(padd);
      }
       


        @Override
        public void actionPerformed(ActionEvent ae) {    
             Object o=ae.getSource();
             if(o==badd){
                 
                 addn(Fadd.getText());
                 i1=Fadd.getText();
                 
                 
             }
        }

 }
    public static void main(String[] args) {
     ATM4  a=new  ATM4 ();
    a.setTitle("The Front View of a Microwave Oven");
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    a.setSize(1000,500);
    a.setLocation(700, 200);
    Dimension screenSize = 
    Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;
    Dimension frameSize = a.getSize();
    int x = (screenWidth - frameSize.width) / 2;
    int y = (screenHeight - frameSize.height) / 2;
    a.setLocation(x, y);
    a.setVisible(true);
        
    }
//JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    boolean in= false;
    String invn,inva;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o=e.getSource();
        invoice inv=new invoice();
        add addd=new add();
        if(o == bbc1 && l9.getText()=="                               Insert the card" ){
            l9.setText("");
            l10.setText("                               enter the password");
            l12.setText("");      
        }
        
        else if(o== bb1 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb1.getText());
        }
        else if(o== bb2 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb2.getText());
        }
        else if(o== bb3 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb3.getText());
        }
        else if(o== bb4 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb4.getText());
        }
        else if(o== bb5 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb5.getText());
        }
        else if(o== bb6 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb6.getText());
        }
        else if(o== bb7 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb7.getText());
        }
        else if(o== bb8 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb8.getText());
        }
        else if(o== bb9 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb9.getText());
        }
        else if(o== bb10 && l12.getText().length()<=5 && l10.getText().endsWith("                               enter the password")){
            if(Integer.parseInt(l12.getText()) != 12345){
                l11.setText("                               invalid");
                l12.setText("");
            }
            else if(Integer.parseInt(l12.getText()) == 12345){
                l11.setText("");
                l2.setText("                               Deposit");
                l6.setText("                               Withdrawal");
                l12.setText("");
                l10.setText("");
            }
        }
        else if(o== bb11 && l12.getText().length()<5 && l10.getText().endsWith("                               enter the password")){
            l12.setText(l12.getText()+bb11.getText());
        }
        else if(o== bb12){
            l12.setText("");
        }
        else if(o== ba11){
            if(l1.getText()=="                               100"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="100";
        }
        }
         else if(o== ba12){
            if(l2.getText()== "                               Deposit"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            
            l5.setText("");
            l6.setText("");
            l7.setText("");
            l8.setText("");
            
            l9.setText("");
            l10.setText("                               Enter the money");
            l11.setText("");
            l12.setText("");
            i2="Deposit";
            i1=addn;
            }
            else if(l2.getText()=="                               200"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="200";
        }
         }
         else if(o== ba13){
             if(l3.getText()=="                               500"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="500";
        }
         }
         else if(o== ba14){
             if(l4.getText()=="                               600"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="600";
        }
         }
         
           else if(o== ba22){
              if(l6.getText() == "                               Withdrawal"){
            l1.setText("                               100");
            l2.setText("                               200");
            l3.setText("                               500");
            l4.setText("                               600");
            l5.setText("                               800");
            l6.setText("                               1000");
            l7.setText("                               1500");
            l8.setText("                               2000");
            i2="Withdrawal";
        }
              else  if(l5.getText()=="                               800"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="800";
        }
              
         }
        else if(o== ba21){
             if(l6.getText()=="                               1000"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="1000";
        }
             
        }
       
        else if(o== ba23){
             if(l7.getText()=="                               1500"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="1500";
        }
             else if(l7.getText()=="                               yes" && l6.getText()=="                               Do you want a withdrawal bill?"){
                 in =true;
                 l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("");
            l7.setText("");
            l8.setText("");
            l9.setText("");
            l10.setText("                               Take the cash");
            l11.setText("");
            l12.setText("");
             }
             else if(l7.getText()=="                               yes" && l6.getText()=="                               Do you want a deposit invoice?"){
                 in =true;
                 l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("");
            l7.setText("");
            l8.setText("");
            l9.setText("");
            l10.setText("                               Take the invoice");
            l11.setText("");
            l12.setText("");
             }
           
        }
        else if(o== ba24){
             if(l8.getText()=="                               2000"){
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("                               Do you want a withdrawal bill?");
            l7.setText("                               yes");
            l8.setText("                               no");
            l9.setText("");
            l10.setText("");
            l11.setText("");
            l12.setText("");
            i1="2000";
        }
             else if(l8.getText()=="                               no" && l6.getText()=="                               Do you want a withdrawal bill?"){
                 in =false;
                 l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("");
            l7.setText("");
            l8.setText("");
            l9.setText("");
            l10.setText("                               Take the cash");
            l11.setText("");
            l12.setText("");
             }
              else if(l8.getText()=="                               no" && l6.getText()=="                               Do you want a deposit invoice?"){
                 in =false;

              default1();
             }
    }
        else if(o==bbc2){
            if(l10.getText()=="                               Take the cash" && in ){
                l10.setText("                               Take the invoice");
            }
            else if(l10.getText()=="                               Take the cash"){
               default1();
            }
            else if(l10.getText()=="                               Deposited" && in){
                
               
            }

        }
        else if(o==bbc3){
           
            if(l10.getText()=="                               Take the invoice" && in){
                inv.setTitle("invoice");                
                inv.setSize(170,200);
                inv.setLocation(200, 200);
                inv.setVisible(true);
                Dimension screenSize = 
                Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;  
                Dimension frameSize = inv.getSize();
                int x = (screenWidth - frameSize.width) / 2;
                int y = (screenHeight - frameSize.height) / 2;

                inv.setLocation(x, y);
                inv.setVisible(true);
                 default1();
            }
            else if(l10.getText()=="                               Deposited" && in){
                inv.setTitle("invoice");
                
                inv.setSize(170,200);
                inv.setLocation(200, 200);
                inv.setVisible(true);
                Dimension screenSize = 
                Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;
                Dimension frameSize = inv.getSize();
                int x = (screenWidth - frameSize.width) / 2;
                int y = (screenHeight - frameSize.height) / 2;
                inv.setLocation(x, y);
                inv.setVisible(true);
                 default1();
            }
           
        }
       // l10.setText("Enter the money");
        else if(o==bbc4){
           if(l10.getText() == "                               Enter the money"){
                addd.setTitle("addd");               
                addd.setSize(170,200);
                addd.setLocation(200, 200);
                addd.setVisible(true);
                Dimension screenSize = 
                Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;
                Dimension frameSize = addd.getSize();
                int x = (screenWidth - frameSize.width) / 2;
                int y = (screenHeight - frameSize.height) / 2;
                addd.setLocation(x, y);
                addd.setVisible(true);
           }
            if(l10.getText() == "                               Enter the money"){
            l10.setText("                               Deposited");
//            l11.setText(addn);
            l6.setText("                               Do you want a deposit invoice?");
            l7.setText("                               yes");
            l8.setText("                               no");
           
            }
                
        }
        
    }
        
       private void  default1() {
            l1.setText("");
            l2.setText("");
            l3.setText("");
            l4.setText("");
            l5.setText("");
            l6.setText("");
            l7.setText("");
            l8.setText("");
            l9.setText("                               Insert the card");
            l10.setText("");
            l11.setText("");
            l12.setText("");
       
       
    }

    private String i1(){
         
        return i1;
        
    }   
    
      private String i2(){
         
        return i2;
        
    }  
  
     private void addn(String a){
         
        l11.setText(a);
        
    }  
    }
