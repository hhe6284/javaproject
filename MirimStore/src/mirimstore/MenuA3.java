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

class MenuFrameA3 extends JFrame implements ActionListener {
	public JButton menub, choob, boarb, cartb, snackb_c, breab, drinkb, icecb, candb, etccb, 프링글스
	,포테토칩,바나나킥, 뽀또, 예감, 포스틱, 매운새우깡, 초코칩쿠키, left, right;
	/*String b[]={"프링글스","포테토칩","바나나킥", "뽀또", "예감", "포스틱", "매운새우깡", "초코칩쿠키"};
	JButton a[] = new JButton[b.length]; 버튼 배열로 속성값 다 같이 지정해 주기*/
	protected JLabel label, result, page;
	GridBagConstraints cc;
	private Font f1 = new Font("나눔고딕", Font.PLAIN, 20);
	JPanel jp = new JPanel();
	public MenuFrameA3()
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
	   /*25~32*/
	   프링글스 = new JButton(new ImageIcon("img/s-26.png"));
	   포테토칩 = new JButton(new ImageIcon("img/s-25.png"));
	   바나나킥 = new JButton(new ImageIcon("img/s-24.png"));
	   뽀또 = new JButton(new ImageIcon("img/s-23.png"));
	   예감 = new JButton(new ImageIcon("img/s-22.png"));
	   포스틱 = new JButton(new ImageIcon("img/s-21.png"));
	   매운새우깡 = new JButton(new ImageIcon("img/s-31.png"));
	   초코칩쿠키 = new JButton(new ImageIcon("img/s-33.png"));
	   left = new JButton(new ImageIcon("img/a-50.png"));
	   page = new JLabel("4/6");
	   page.setFont(f1);
	   right = new JButton(new ImageIcon("img/a-49.png"));
	   //이벤트 등록
	   프링글스.addActionListener(this);
	   포테토칩.addActionListener(this);
	   바나나킥.addActionListener(this);
	   뽀또.addActionListener(this);
	   예감.addActionListener(this);
	   포스틱.addActionListener(this);
	   매운새우깡.addActionListener(this);
	   초코칩쿠키.addActionListener(this);
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
	   
	   프링글스.setBorderPainted(false);
	   프링글스.setOpaque(false);
	   프링글스.setContentAreaFilled(false);
	   포테토칩.setBorderPainted(false);
	   포테토칩.setOpaque(false);
	   포테토칩.setContentAreaFilled(false);
	   바나나킥.setBorderPainted(false);
	   바나나킥.setOpaque(false);
	   바나나킥.setContentAreaFilled(false);
	   뽀또.setBorderPainted(false);
	   뽀또.setOpaque(false);
	   뽀또.setContentAreaFilled(false);
	   예감.setBorderPainted(false);
	   예감.setOpaque(false);
	   예감.setContentAreaFilled(false);
	   포스틱.setBorderPainted(false);
	   포스틱.setOpaque(false);
	   포스틱.setContentAreaFilled(false);
	   매운새우깡.setBorderPainted(false);
	   매운새우깡.setOpaque(false);
	   매운새우깡.setContentAreaFilled(false);
	   초코칩쿠키.setBorderPainted(false);
	   초코칩쿠키.setOpaque(false);
	   초코칩쿠키.setContentAreaFilled(false);
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
	   etccb.addActionListener(this);  left.addActionListener(this);  right.addActionListener(this); 
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
	   프링글스.setBounds(310, 200,  170, 220);
	   포테토칩.setBounds(510, 200,  170, 220);
	   바나나킥.setBounds(710, 200,  170, 220);
	   뽀또.setBounds(910, 200,  170, 220);
	   예감.setBounds(310, 470,  170, 220);
	   포스틱.setBounds(510, 470,  170, 220);
	   매운새우깡.setBounds(710, 470,  170, 220);
	   초코칩쿠키.setBounds(910, 470,  170, 220);
	   left.setBounds(580, 720, 40, 40);
	   page.setBounds(640, 714, 50, 50);
	   right.setBounds(710, 720, 40, 40);
	  c.add(menub); c.add(choob); c.add(boarb); c.add(cartb);
	   c.add(snackb_c); c.add(breab); c.add(drinkb); c.add(icecb); c.add(candb); 
	   c.add(etccb); 
	   c.add(프링글스);
	   c.add(포테토칩); c.add(바나나킥); c.add(뽀또);
	   c.add(예감); c.add(포스틱); c.add(매운새우깡); c.add(초코칩쿠키); c.add(left);
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
			if(e.getSource().equals(left)){
				try{
					dispose();
					MenuFrameA2 me = new MenuFrameA2();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(right)){
				try{
					dispose();
					MenuFrameA4 me = new MenuFrameA4();
					me.setVisible(true);
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
			if(e.getSource().equals(etccb)){
				try{
					dispose();
					MenuFrameF mf = new MenuFrameF();
					mf.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
		if (e.getSource().equals(프링글스))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '오레오';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='오레오';");
                    	st2.execute("insert into cart values('오레오','1500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(포테토칩))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '닭다리';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='닭다리';");
                    	st2.execute("insert into cart values('닭다리','1400')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(바나나킥))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '쿠킹크래커';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='쿠킹크래커';");
                    	st2.execute("insert into cart values('쿠킹크래커','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(뽀또))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '피자니아';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='피자니아';");
                    	st2.execute("insert into cart values('피자니아','1400')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(예감))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '롤리폴리';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='롤리폴리';");
                    	st2.execute("insert into cart values('롤리폴리','800')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(포스틱))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '회오리감자';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='회오리감자';");
                    	st2.execute("insert into cart values('회오리감자','600')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}	
		else if(e.getSource().equals(매운새우깡))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '오징어집';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='오징어집';");
                    	st2.execute("insert into cart values('오징어집','1400')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(초코칩쿠키))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '자갈치';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='자갈치';");
                    	st2.execute("insert into cart values('자갈치','1400')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
}
}
public class MenuA3{
	public static void main(String args[]) throws Exception{
		new MenuFrameA3();
	        }
		
	}

