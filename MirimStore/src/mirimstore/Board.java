package mirimstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


	
class BoardFrame extends JFrame implements ActionListener {
	protected JButton menub, choob, boarb, cartb, snackb, breab, drinkb, icecb, candb, etccb, 프링글스
	,포테토칩,바나나킥, 뽀또, 예감, 포스틱, 매운새우깡, 초코칩쿠키, left, right, 글쓰기;
	protected JLabel label, result, page;
	GridBagConstraints cc;
	public BoardFrame()
	  {
		super("미림매점");
		Container c = this.getContentPane();
	    c.setBackground(Color.WHITE);
	     
	    menub = new JButton(new ImageIcon("img/m-01.png"));
		   choob = new JButton(new ImageIcon("img/m-03.png"));
		   boarb = new JButton(new ImageIcon("img/m-06.png"));
		   cartb = new JButton(new ImageIcon("img/m-07.png"));
	   글쓰기 = new JButton(new ImageIcon("img/q-01.png"));
	   
	   menub.setBackground(Color.WHITE);
	   choob.setBackground(Color.WHITE);
	   boarb.setBackground(Color.WHITE);
	   cartb.setBackground(Color.WHITE);
	   글쓰기.setBackground(Color.WHITE);
	   
	   menub.setBorderPainted(false);
	   choob.setBorderPainted(false);
	   boarb.setBorderPainted(false);
	   cartb.setBorderPainted(false);
	   글쓰기.setBorderPainted(false);
	   
	   menub.setPreferredSize(new Dimension(200, 70));
	   choob.setPreferredSize(new Dimension(200, 70));
	   boarb.setPreferredSize(new Dimension(200, 70));
	   cartb.setPreferredSize(new Dimension(200, 70));
	   
	   menub.addActionListener(this); choob.addActionListener(this); boarb.addActionListener(this); 
	   cartb.addActionListener(this); 글쓰기.addActionListener(this);
	 //  ImageIcon logo = new ImageIcon("logo.jpg");
	   //label = new JLabel(logo, JLabel.LEFT);// 라벨에 내용, 이미지, 위치 설정
	   result = new JLabel();
       result.setText("Country Name");
       
	   setLayout(null);
	   
	   
	   menub.setBounds(60, 60, 215, 80);
	   choob.setBounds(320, 62, 209, 69);
	   boarb.setBounds(580, 60, 209, 69);
	   cartb.setBounds(840, 60, 209, 69);
	   
	   글쓰기.setBounds(750, 840, 250, 50);
	    c.add(menub); c.add(choob); c.add(boarb); c.add(cartb); c.add(글쓰기);
		JPanel panel = new JPanel();
		panel.setBounds(54, 188, 1015, 640);
		getContentPane().add(panel);
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // 프로그램 종료 
	   setSize(1140, 950);
	   Font f = new Font("함초롱돋움", Font.BOLD, 20);
	   setVisible(true);
		setVisible(true);
		setResizable(false);
		getContentPane().setLayout(null);
		try{
			   Connection con = null;
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
		      
		       ResultSet result = null;
		       java.sql.Statement st = null;
		       st = con.createStatement();
		       st.execute("use menu;"); // 사용할 DB를 선택한다.
		       // executeQuery : 쿼리를 실행하고 결과를 ResultSet 객체로 반환한다.
		       result = st.executeQuery("select * from board;");
		       
		       int res = result.getRow();
		       int i=0;
		       // 결과를 하나씩 출력한다.
		      while (result.next()){
		    	  java.sql.Statement st2 = null;
		 String str = result.getString(1)+" ) "+result.getString(2)+" | "+
			       result.getString(3)+" | "+result.getString(4)+" | "+result.getString(5)+" | "+result.getString(6)
			       +"      ";
			           JLabel jl = new JLabel(str);
			           jl.setFont(f);
			           System.out.println(str);
			           panel.add(jl);
			           i++;
		      } }catch(Exception e3){}
		
		
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
			if(e.getSource().equals(글쓰기)){
				try{
					WritingFrame write = new WritingFrame();
					write.setVisible(true);
					
					
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
		
	}
	
}
public class Board{
	public static void main(String args[]) throws Exception{
		new BoardFrame();
		
	}
}
