package mirimstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MenuFrameE extends JFrame implements ActionListener {
	public JButton menub, choob, boarb, cartb, snackb, breab, drinkb, icecb, candb_c, etccb,
	신쫄이,새콤,왕꿈, 석기, 크런, 가나, 자유,크런치;
	private Font f1 = new Font("나눔고딕", Font.PLAIN, 20);
	protected JLabel label, result, page;
	GridBagConstraints cc;
	public MenuFrameE()
	  {
		super("미림매점");
		Container c = this.getContentPane();
	    c.setBackground(Color.WHITE);
	     
	    menub = new JButton(new ImageIcon("img/m-02.png"));
		   choob = new JButton(new ImageIcon("img/m-03.png"));
		   boarb = new JButton(new ImageIcon("img/m-05.png"));
		   cartb = new JButton(new ImageIcon("img/m-07.png"));
	   snackb = new JButton(new ImageIcon("img/menu-01.png"));
	   breab = new JButton(new ImageIcon("img/menu-02.png"));
	   drinkb = new JButton(new ImageIcon("img/menu-04.png"));
	   icecb = new JButton(new ImageIcon("img/menu-05.png"));
	   candb_c = new JButton(new ImageIcon("img/store-05.png"));
	   etccb = new JButton(new ImageIcon("img/menu-06.png"));
	  
	   신쫄이 = new JButton(new ImageIcon("img/c-01.png"));
	   새콤 = new JButton(new ImageIcon("img/c-02.png"));
	   왕꿈 = new JButton(new ImageIcon("img/c-03.png"));
	   석기 = new JButton(new ImageIcon("img/c-04.png"));
	   크런 = new JButton(new ImageIcon("img/c-05.png"));
	   가나 = new JButton(new ImageIcon("img/c-06.png"));
	   자유 = new JButton(new ImageIcon("img/c-07.png"));
	   크런치 = new JButton(new ImageIcon("img/c-08.png"));
	 
	   page = new JLabel("1/1");page.setFont(f1);
	
	   //이벤트 등록
	   신쫄이.addActionListener(this);
	   새콤.addActionListener(this);
	   왕꿈.addActionListener(this);
	   석기.addActionListener(this);
	   크런.addActionListener(this);
	   가나.addActionListener(this);
	   자유.addActionListener(this);
	   크런치.addActionListener(this);
	   
	   menub.setBackground(Color.WHITE);
	   choob.setBackground(Color.WHITE);
	   boarb.setBackground(Color.WHITE);
	   cartb.setBackground(Color.WHITE);
	   snackb.setBackground(Color.WHITE);
	   breab.setBackground(Color.WHITE);
	   drinkb.setBackground(Color.WHITE);
	   icecb.setBackground(Color.WHITE);
	   candb_c.setBackground(Color.WHITE);
	   etccb.setBackground(Color.WHITE);
	   
	   menub.setBorderPainted(false);
	   choob.setBorderPainted(false);
	   boarb.setBorderPainted(false);
	   cartb.setBorderPainted(false);
	   snackb.setBorderPainted(false);
	   breab.setBorderPainted(false);
	   drinkb.setBorderPainted(false);
	   icecb.setBorderPainted(false);
	   candb_c.setBorderPainted(false);
	   etccb.setBorderPainted(false);
	   
	   menub.setPreferredSize(new Dimension(200, 70));
	   choob.setPreferredSize(new Dimension(200, 70));
	   boarb.setPreferredSize(new Dimension(200, 70));
	   cartb.setPreferredSize(new Dimension(200, 70));
	   snackb.setPreferredSize(new Dimension(200, 70));
	   breab.setPreferredSize(new Dimension(200, 70));
	   drinkb.setPreferredSize(new Dimension(200, 70));
	   icecb.setPreferredSize(new Dimension(200,70));
	   candb_c.setPreferredSize(new Dimension(200,70));
	   etccb.setPreferredSize(new Dimension(200,70));
	   
	   menub.addActionListener(this); choob.addActionListener(this); boarb.addActionListener(this); 
	   cartb.addActionListener(this); snackb.addActionListener(this); breab.addActionListener(this);
	   drinkb.addActionListener(this); icecb.addActionListener(this); candb_c.addActionListener(this);
	   etccb.addActionListener(this); 
	 //  ImageIcon logo = new ImageIcon("logo.jpg");
	   //label = new JLabel(logo, JLabel.LEFT);// 라벨에 내용, 이미지, 위치 설정
	   result = new JLabel();
       result.setText("Country Name");
       
	   setLayout(null);

	   menub.setBounds(60, 60, 215, 80);
	   choob.setBounds(320, 62, 209, 69);
	   boarb.setBounds(580, 60, 209, 69);
	   cartb.setBounds(840, 60, 209, 69);
	   snackb.setBounds(50, 200, 200, 70);
	   breab.setBounds(50, 300, 200, 70);
	   drinkb.setBounds(50, 400, 200,70);
	   icecb.setBounds(50, 500, 200, 70);
	   candb_c.setBounds(50, 600, 200, 70);
	   etccb.setBounds(50, 700, 200, 70);
	  
	
	   신쫄이.setBorderPainted(false);
	   신쫄이.setOpaque(false);
	   신쫄이.setContentAreaFilled(false);
	   새콤.setBorderPainted(false);
	   새콤.setOpaque(false);
	   새콤.setContentAreaFilled(false);
	   왕꿈.setBorderPainted(false);
	   왕꿈.setOpaque(false);
	   왕꿈.setContentAreaFilled(false);
	   석기.setBorderPainted(false);
	   석기.setOpaque(false);
	   석기.setContentAreaFilled(false);
	   크런.setBorderPainted(false);
	   크런.setOpaque(false);
	   크런.setContentAreaFilled(false);
	   가나.setBorderPainted(false);
	   가나.setOpaque(false);
	   가나.setContentAreaFilled(false);
	   자유.setBorderPainted(false);
	   자유.setOpaque(false);
	   자유.setContentAreaFilled(false);
	   크런치.setBorderPainted(false);
	   크런치.setOpaque(false);
	   크런치.setContentAreaFilled(false);
	   신쫄이.setBounds(310, 200,  170, 220);
	   새콤.setBounds(510, 200,  170, 220);
	   왕꿈.setBounds(710, 200,  170, 220);
	   석기.setBounds(910, 200,  170, 220);
	   크런.setBounds(310, 470,  170, 220);
	   가나.setBounds(510, 470,  170, 220);
	   자유.setBounds(710, 470,  170, 220);
	   크런치.setBounds(910, 470,  170, 220);

	   page.setBounds(640, 714, 50, 50);
	
	  // JPanel mm = new JPanel();
	   //mm.setLayout(new BoxLayout(mm, BoxLayout.Y_AXIS));
	   //setLayout(new GridLayout()); 
	   //mm.setBackground(Color.WHITE);
	   //getContentPane().add(label);
	   //mm.add(label);
	    c.add(menub); c.add(choob); c.add(boarb); c.add(cartb);
	   c.add(snackb); c.add(breab); c.add(drinkb); c.add(icecb); c.add(candb_c); 
	   c.add(etccb); 
	   
	   c.add(신쫄이); c.add(새콤); c.add(왕꿈); c.add(석기);
	   c.add(크런); c.add(가나); c.add(자유); c.add(크런치); 
	   c.add(page);
	   
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // 프로그램 종료 
	   setSize(1140, 880);
	   setVisible(true);
	   setResizable(false);
	  }
	
		public void actionPerformed(ActionEvent e){
			 //확인버튼 누르면 프레임이 닫히고 
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
			if(e.getSource().equals(snackb)){
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
			if(e.getSource().equals(candb_c)){
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
			/*신쫄이,새콤,왕꿈, 석기, 크런, 가나, 자유,크런치,*/
		if (e.getSource().equals(신쫄이))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '신쫄이';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='신쫄이';");
                    	st2.execute("insert into cart values('신쫄이','500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(새콤))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '새콤달콤';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='새콤달콤';");
                    	st2.execute("insert into cart values('새콤달콤','500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(왕꿈))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '가나';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='가나';");
                    	st2.execute("insert into cart values('가나','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(석기))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '석기시대';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='석기시대';");
                    	st2.execute("insert into cart values('석기시대','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(크런))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '크런키';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='크런키';");
                    	st2.execute("insert into cart values('크런키','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(가나))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '햄버거젤리';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='햄버거젤리';");
                    	st2.execute("insert into cart values('햄버거젤리','300')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}	
		else if(e.getSource().equals(자유))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '하리보젤리';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='하리보젤리';");
                    	st2.execute("insert into cart values('하리보젤리','300')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(크런치))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '크런치바';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='크런치바';");
                    	st2.execute("insert into cart values('크런치바','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
public class MenuE{
	public static void main(String args[]) throws Exception{
		new MenuFrameE();
		
	}

}
