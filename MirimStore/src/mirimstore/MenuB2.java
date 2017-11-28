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


class MenuFrameB2 extends JFrame implements ActionListener {
	public JButton  menub, choob, boarb, cartb, snackb, breab_c, drinkb, icecb, candb, etccb, 내일
	,left;
	protected JLabel label, result, page;
	GridBagConstraints cc;
	private Font f1 = new Font("나눔고딕", Font.PLAIN, 20);
	public MenuFrameB2()
	  {
		super("미림매점");
		Container c = this.getContentPane();
	    c.setBackground(Color.WHITE);
	     
	    menub = new JButton(new ImageIcon("img/m-02.png"));
		   choob = new JButton(new ImageIcon("img/m-03.png"));
		   boarb = new JButton(new ImageIcon("img/m-05.png"));
		   cartb = new JButton(new ImageIcon("img/m-07.png"));
	   
	   snackb = new JButton(new ImageIcon("img/menu-01.png"));
	   breab_c = new JButton(new ImageIcon("img/store-02.png"));
	   drinkb = new JButton(new ImageIcon("img/menu-04.png"));
	   icecb = new JButton(new ImageIcon("img/menu-05.png"));
	   candb = new JButton(new ImageIcon("img/menu-03.png"));
	   etccb = new JButton(new ImageIcon("img/menu-06.png"));
	   
	   내일 = new JButton(new ImageIcon("img/b-11.png"));
	  
	   left = new JButton(new ImageIcon("img/a-50.png"));
	   page = new JLabel("2/2");
	  
	   page.setFont(f1);
	   menub.setBackground(Color.WHITE);
	   choob.setBackground(Color.WHITE);
	   boarb.setBackground(Color.WHITE);
	   cartb.setBackground(Color.WHITE);
	   snackb.setBackground(Color.WHITE);
	   breab_c.setBackground(Color.WHITE);
	   drinkb.setBackground(Color.WHITE);
	   icecb.setBackground(Color.WHITE);
	   candb.setBackground(Color.WHITE);
	   etccb.setBackground(Color.WHITE);
	   left.setBackground(Color.WHITE);
	  
	   menub.setBorderPainted(false);
	   choob.setBorderPainted(false);
	   boarb.setBorderPainted(false);
	   cartb.setBorderPainted(false);
	   snackb.setBorderPainted(false);
	   breab_c.setBorderPainted(false);
	   drinkb.setBorderPainted(false);
	   icecb.setBorderPainted(false);
	   candb.setBorderPainted(false);
	   etccb.setBorderPainted(false);
	   left.setBorderPainted(false);

	   
	   menub.setPreferredSize(new Dimension(200, 70));
	   choob.setPreferredSize(new Dimension(200, 70));
	   boarb.setPreferredSize(new Dimension(200, 70));
	   cartb.setPreferredSize(new Dimension(200, 70));
	   snackb.setPreferredSize(new Dimension(200, 70));
	   breab_c.setPreferredSize(new Dimension(200, 70));
	   drinkb.setPreferredSize(new Dimension(200, 70));
	   icecb.setPreferredSize(new Dimension(200,70));
	   candb.setPreferredSize(new Dimension(200,70));
	   etccb.setPreferredSize(new Dimension(200,70));
	   
	   내일.setBorderPainted(false);
	   내일.setOpaque(false);
	   내일.setContentAreaFilled(false);
	  
	   left.setBorderPainted(false);
	   left.setOpaque(false);
	   left.setContentAreaFilled(false);
	 
	   menub.addActionListener(this); choob.addActionListener(this); boarb.addActionListener(this); 
	   cartb.addActionListener(this); snackb.addActionListener(this); breab_c.addActionListener(this);
	   drinkb.addActionListener(this); icecb.addActionListener(this); candb.addActionListener(this);
	   etccb.addActionListener(this); left.addActionListener(this); 내일.addActionListener(this);
	   result = new JLabel();
       result.setText("Country Name");
       
	   setLayout(null);
	   
	   menub.setBounds(60, 60, 215, 80);
	   choob.setBounds(320, 62, 209, 69);
	   boarb.setBounds(580, 60, 209, 69);
	   cartb.setBounds(840, 60, 209, 69);
	   snackb.setBounds(50, 200, 200, 70);
	   breab_c.setBounds(50, 300, 200, 70);
	   drinkb.setBounds(50, 400, 200,70);
	   icecb.setBounds(50, 500, 200, 70);
	   candb.setBounds(50, 600, 200, 70);
	   etccb.setBounds(50, 700, 200, 70);
	  
	   내일.setBounds(310, 200,  170, 220);
	
	   left.setBounds(580, 720, 40, 40);
	   page.setBounds(640, 714, 50, 50);
	    c.add(menub); c.add(choob); c.add(boarb); c.add(cartb);
	   c.add(snackb); c.add(breab_c); c.add(drinkb); c.add(icecb); c.add(candb); 
	   c.add(etccb); 
	   
	   c.add(내일); 
	  c.add(left);
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
			if(e.getSource().equals(breab_c)){
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
			if(e.getSource().equals(left)){
				try{
					dispose();
					MenuFrameB me = new MenuFrameB();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
		if (e.getSource().equals(내일))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '고구마피자파티';");
                
                while (result.next()){
                    String str = result.getNString(1) + "상품을 주문하시겠습니까?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='고구마피자파티';");
                    	st2.execute("insert into cart values('고구마피자파티','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}
}
public class MenuB2{
	public static void main(String args[]) throws Exception{
		new MenuFrameB2();
		
	}

}
