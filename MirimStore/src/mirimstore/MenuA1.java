package mirimstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MenuFrameA1 extends JFrame implements ActionListener {
	public JButton menub, choob, boarb, cartb, snackb_c, breab, drinkb, icecb, candb, etccb, a1
	,a2,a3, a4, a5, a6, a7, a8, left, right;
	/*String b[]={"프링글스","포테토칩","a3", "a4", "a5", "a6", "a7", "a8"};
	JButton a[] = new JButton[b.length]; 버튼 배열로 속성값 다 같이 지정해 주기*/
	protected JLabel label, result, page;
	GridBagConstraints cc;
	JPanel jp = new JPanel();
	private Font f1 = new Font("나눔고딕", Font.PLAIN, 20);
	public MenuFrameA1()
	  {
		super("미림매점");
		Container c = this.getContentPane();
	    c.setBackground(Color.WHITE);
	     
	   
	   menub = new JButton(new ImageIcon("img/m-02.png"));
	   choob = new JButton(new ImageIcon("img/m-03.png"));
	   boarb = new JButton(new ImageIcon("img/m-05.png"));
	   cartb = new JButton(new ImageIcon("img/m-07.png"));
	   
	   snackb_c = new JButton(new ImageIcon("img/store-01.png"));
	   breab = new JButton(new ImageIcon("img/menu-02.png"));
	   drinkb = new JButton(new ImageIcon("img/menu-04.png"));
	   icecb = new JButton(new ImageIcon("img/menu-05.png"));
	   candb = new JButton(new ImageIcon("img/menu-03.png"));
	   etccb = new JButton(new ImageIcon("img/menu-06.png"));
	   
	   a1 = new JButton(new ImageIcon("img/s-09.png"));
	   a2 = new JButton(new ImageIcon("img/s-10.png"));
	   a3 = new JButton(new ImageIcon("img/s-11.png"));
	   a4 = new JButton(new ImageIcon("img/s-12.png"));
	   a5 = new JButton(new ImageIcon("img/s-13.png"));
	   a6 = new JButton(new ImageIcon("img/s-14.png"));
	   a7 = new JButton(new ImageIcon("img/s-15.png"));
	   a8 = new JButton(new ImageIcon("img/s-16.png"));
	   left = new JButton(new ImageIcon("img/a-50.png"));
	   page = new JLabel("2/6");
	   page.setFont(f1);
	   right = new JButton(new ImageIcon("img/a-49.png"));
	   //이벤트 등록
	   a1.addActionListener(this);
	   a2.addActionListener(this);
	   a3.addActionListener(this);
	   a4.addActionListener(this);
	   a5.addActionListener(this);
	   a6.addActionListener(this);
	   a7.addActionListener(this);
	   a8.addActionListener(this);
	   left.addActionListener(this);
	   right.addActionListener(this);
	   
	   left.setBackground(Color.WHITE);
	   right.setBackground(Color.WHITE);
	   left.setBorderPainted(false);
	   right.setBorderPainted(false);
	   menub.setBackground(Color.WHITE);
	   choob.setBackground(Color.WHITE);
	   boarb.setBackground(Color.WHITE);
	   cartb.setBackground(Color.WHITE);
	   snackb_c.setBackground(Color.WHITE);
	   breab.setBackground(Color.WHITE);
	   drinkb.setBackground(Color.WHITE);
	   icecb.setBackground(Color.WHITE);
	   candb.setBackground(Color.WHITE);
	   etccb.setBackground(Color.WHITE);
	   
	   a1.setBorderPainted(false);
	   a1.setOpaque(false);
	   a1.setContentAreaFilled(false);
	   a2.setBorderPainted(false);
	   a2.setOpaque(false);
	   a2.setContentAreaFilled(false);
	   a3.setBorderPainted(false);
	   a3.setOpaque(false);
	   a3.setContentAreaFilled(false);
	   a4.setBorderPainted(false);
	   a4.setOpaque(false);
	   a4.setContentAreaFilled(false);
	   a5.setBorderPainted(false);
	   a5.setOpaque(false);
	   a5.setContentAreaFilled(false);
	   a6.setBorderPainted(false);
	   a6.setOpaque(false);
	   a6.setContentAreaFilled(false);
	   a7.setBorderPainted(false);
	   a7.setOpaque(false);
	   a7.setContentAreaFilled(false);
	   a8.setBorderPainted(false);
	   a8.setOpaque(false);
	   a8.setContentAreaFilled(false);
	   /*for(int i=0; i<a.length; i++){
		   a[i] = new JButton(b[i]);
		   a[i].setBorderPainted(false);
		   a[i].setOpaque(false);
		   a[i].setContentAreaFilled(false);
	   }*/
	   
	   menub.setBorderPainted(false);
	   choob.setBorderPainted(false);
	   boarb.setBorderPainted(false);
	   cartb.setBorderPainted(false);
	   snackb_c.setBorderPainted(false);
	   breab.setBorderPainted(false);
	   drinkb.setBorderPainted(false);
	   icecb.setBorderPainted(false);
	   candb.setBorderPainted(false);
	   etccb.setBorderPainted(false);
	   
	  
	   menub.setPreferredSize(new Dimension(200, 70));
	   choob.setPreferredSize(new Dimension(200, 70));
	   boarb.setPreferredSize(new Dimension(200, 70));
	   cartb.setPreferredSize(new Dimension(200, 70));
	   snackb_c.setPreferredSize(new Dimension(200, 70));
	   breab.setPreferredSize(new Dimension(200, 70));
	   drinkb.setPreferredSize(new Dimension(200, 70));
	   icecb.setPreferredSize(new Dimension(200,70));
	   candb.setPreferredSize(new Dimension(200,70));
	   etccb.setPreferredSize(new Dimension(200,70));
	   
	   menub.addActionListener(this); choob.addActionListener(this); boarb.addActionListener(this); 
	   cartb.addActionListener(this); snackb_c.addActionListener(this); breab.addActionListener(this);
	   drinkb.addActionListener(this); icecb.addActionListener(this); candb.addActionListener(this);
	   etccb.addActionListener(this);  left.addActionListener(this); right.addActionListener(this);
	 //  ImageIcon logo = new ImageIcon("logo.jpg");
	   //label = new JLabel(logo, JLabel.LEFT);// 라벨에 내용, 이미지, 위치 설정
	   result = new JLabel();
       result.setText("Country Name");
       
	   setLayout(null); 
	
	   menub.setBounds(60, 60, 215, 80);
	   choob.setBounds(320, 62, 209, 69);
	   boarb.setBounds(580, 60, 209, 69);
	   cartb.setBounds(840, 60, 209, 69);
	   snackb_c.setBounds(50, 200, 200, 70);
	   breab.setBounds(50, 300, 200, 70);
	   drinkb.setBounds(50, 400, 200,70);
	   icecb.setBounds(50, 500, 200, 70);
	   candb.setBounds(50, 600, 200, 70);
	   etccb.setBounds(50, 700, 200, 70);
	   a1.setBounds(310, 200,  170, 220);
	   a2.setBounds(510, 200,  170, 220);
	   a3.setBounds(710, 200,  170, 220);
	   a4.setBounds(910, 200,  170, 220);
	   a5.setBounds(310, 470,  170, 220);
	   a6.setBounds(510, 470,  170, 220);
	   a7.setBounds(710, 470,  170, 220);
	   a8.setBounds(910, 470,  170, 220);
	   left.setBounds(580, 720, 40, 40);
	   page.setBounds(640, 714, 50, 50);
	   right.setBounds(710, 720, 40, 40);
	  // JPanel mm = new JPanel();
	   //mm.setLayout(new BoxLayout(mm, BoxLayout.Y_AXIS));
	   //setLayout(new GridLayout()); 
	   //mm.setBackground(Color.WHITE);
	   //getContentPane().add(label);
	   //mm.add(label);
	  c.add(menub); c.add(choob); c.add(boarb); c.add(cartb);
	   c.add(snackb_c); c.add(breab); c.add(drinkb); c.add(icecb); c.add(candb); 
	   c.add(etccb); 
	   c.add(a1);
	   c.add(a2); c.add(a3); c.add(a4);
	   c.add(a5); c.add(a6); c.add(a7); c.add(a8); c.add(left);
	   c.add(page); c.add(right);
	   
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // 프로그램 종료 
	   setSize(1140, 880);
	   setVisible(true);
	   setResizable(false);
	  }
		public void actionPerformed(ActionEvent e){
    			
			if(e.getSource().equals(menub)){
				try{
					dispose();
					MenuFrameA menu = new MenuFrameA();
					menu.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(choob)){
				try{
					dispose();
					RecomFrame re = new RecomFrame();
					re.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(boarb)){
				try{
					dispose();
					BoardFrame boa = new BoardFrame();
					boa.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			
			if(e.getSource().equals(cartb)){
				try{
					dispose();
					CartFrame car = new CartFrame();
					car.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(snackb_c)){
				try{
					dispose();
					MenuFrameA ma = new MenuFrameA();
					ma.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(breab)){
				try{
					dispose();
					MenuFrameB mb = new MenuFrameB();
					mb.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(drinkb)){
				try{
					dispose();
					MenuFrameC mc = new MenuFrameC();
					mc.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(icecb)){
				try{
					dispose();
					MenuFrameD md = new MenuFrameD();
					md.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(candb)){
				try{
					dispose();
					MenuFrameE me = new MenuFrameE();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(left)){
				try{
					dispose();
					MenuFrameA me = new MenuFrameA();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(right)){
				try{
					dispose();
					MenuFrameA2 me = new MenuFrameA2();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(etccb)){
				try{
					dispose();
					MenuFrameF mf = new MenuFrameF();
					mf.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
		if (e.getSource().equals(a1))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '초코파이';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='초코파이';");
                    	st2.execute("insert into cart values('초코파이','500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(a2))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '예감';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='예감';");
                    	st2.execute("insert into cart values('예감','1200')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(a3))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '구운감자';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='구운감자';");
                    	st2.execute("insert into cart values('구운감자','800')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(a4))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '양파링(빨)';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='양파링(빨)';");
                    	st2.execute("insert into cart values('양파링(빨)','1100')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(a5))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '양파링(파)';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='양파링(파)';");
                    	st2.execute("insert into cart values('양파링(파)','1400')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(a6))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '칸쵸';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='칸쵸';");
                    	st2.execute("insert into cart values('칸쵸','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}	
		else if(e.getSource().equals(a7))
		{try {
			Connection con = null;
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
            java.sql.Statement st = null;
            ResultSet result = null;
            st = con.createStatement();
            st.execute("use menu;"); 
            result = st.executeQuery("select name from allmenu where name = '빠새';");
            
            while (result.next()){
                String str = result.getNString(1) + "상품을 주문하시겠습니까?";
               int reply = JOptionPane.showConfirmDialog(this, str);
                if(reply == JOptionPane.YES_OPTION){
                	 java.sql.Statement st2 = null;
                     st2 = con.createStatement();
                	st2.execute("update allmenu set product=product+1 where name='빠새';");
                	st2.execute("insert into cart values('빠새','1400')");
                }
            }
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
		else if(e.getSource().equals(a8))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '포테토칩';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='포테토칩';");
                    	st2.execute("insert into cart values('포테토칩','1500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		}}
public class MenuA1{
	public static void main(String args[]) throws Exception{
		new MenuFrameA1();
	        }
		
	}

