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
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MenuSel{
	ArrayList<String> pricearr = new ArrayList<String>();
	int number;
	String name, price;
	
	public void menu() throws Exception{
		String fname = "menu2.txt";
		FileReader file = new FileReader(fname);
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = null;
		while((line = reader.readLine())!= null){
			String[] pepleline = line.split("\t");
			number = Integer.parseInt(pepleline[0]);
			name = pepleline[1];
			price = pepleline[2];	
			pricearr.add(name);
		}
	}
	
	public String printprice(int n) throws Exception{
		menu();
		return pricearr.get(n);
	}
}

class CartFrame extends JFrame implements ActionListener {
	
	protected JButton menub, choob, boarb, cartb, snackb, breab, drinkb, icecb, candb, etccb, left, right,b1,b2,b3;
	protected JLabel label, result, back;
	GridBagConstraints cc;
	private Font f1;
	MenuSel ms = new MenuSel();
	public CartFrame()
	  {
		super("미림매점");
		Container c = this.getContentPane();
	    c.setBackground(Color.WHITE);
	     
	  
	    menub = new JButton(new ImageIcon("img/m-01.png"));
		   choob = new JButton(new ImageIcon("img/m-03.png"));
		   boarb = new JButton(new ImageIcon("img/m-05.png"));
		   cartb = new JButton(new ImageIcon("img/m-08.png"));
	   snackb = new JButton(new ImageIcon("menu-01.png"));
	   breab = new JButton(new ImageIcon("menu-02.png"));
	   drinkb = new JButton(new ImageIcon("menu-03.png"));
	   icecb = new JButton(new ImageIcon("menu-06.png"));
	   candb = new JButton(new ImageIcon("menu-05.png"));
	   etccb = new JButton(new ImageIcon("menu-04.png"));

	   left = new JButton(new ImageIcon("left.jpg"));
	   back = new JLabel(new ImageIcon("img/55-01.png"));
	   right = new JButton(new ImageIcon("right.jpg"));
	   b2 = new JButton(new ImageIcon("img/a-01.png"));
		 b1 = new JButton(new ImageIcon("img/a-02.png"));
		 b3 = new JButton(new ImageIcon("img/a-03.png"));
	   //이벤트 등록
	 
	
	   menub.setBackground(Color.WHITE);
	   choob.setBackground(Color.WHITE);
	   boarb.setBackground(Color.WHITE);
	   cartb.setBackground(Color.WHITE);
	   snackb.setBackground(Color.WHITE);
	   breab.setBackground(Color.WHITE);
	   drinkb.setBackground(Color.WHITE);
	   icecb.setBackground(Color.WHITE);
	   candb.setBackground(Color.WHITE);
	   etccb.setBackground(Color.WHITE);
	   b1.setBackground(Color.WHITE);
	   b2.setBackground(Color.WHITE);
	   b3.setBackground(Color.WHITE);
	   
	   b1.setBorderPainted(false);
	   b2.setBorderPainted(false);
	   b3.setBorderPainted(false);
	
	   menub.setBorderPainted(false);
	   choob.setBorderPainted(false);
	   boarb.setBorderPainted(false);
	   cartb.setBorderPainted(false);
	   snackb.setBorderPainted(false);
	   breab.setBorderPainted(false);
	   drinkb.setBorderPainted(false);
	   icecb.setBorderPainted(false);
	   candb.setBorderPainted(false);
	   etccb.setBorderPainted(false);
	   
	   menub.setPreferredSize(new Dimension(200, 70));
	   choob.setPreferredSize(new Dimension(200, 70));
	   boarb.setPreferredSize(new Dimension(200, 70));
	   cartb.setPreferredSize(new Dimension(200, 70));
	   snackb.setPreferredSize(new Dimension(200, 70));
	   breab.setPreferredSize(new Dimension(200, 70));
	   drinkb.setPreferredSize(new Dimension(200, 70));
	   icecb.setPreferredSize(new Dimension(200,70));
	   candb.setPreferredSize(new Dimension(200,70));
	   etccb.setPreferredSize(new Dimension(200,70));
	   b1.setBorderPainted(false);
	   b1.setOpaque(false);
	   b1.setContentAreaFilled(false);
	   b2.setBorderPainted(false);
	   b2.setOpaque(false);
	   b2.setContentAreaFilled(false);
	   b3.setBorderPainted(false);
	   b3.setOpaque(false);
	   b3.setContentAreaFilled(false);
	   menub.addActionListener(this); choob.addActionListener(this); boarb.addActionListener(this); 
	   cartb.addActionListener(this); snackb.addActionListener(this); breab.addActionListener(this);
	   drinkb.addActionListener(this); icecb.addActionListener(this); candb.addActionListener(this);
	   etccb.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this);
	 //  ImageIcon logo = new ImageIcon("logo.jpg");
	   //label = new JLabel(logo, JLabel.LEFT);// 라벨에 내용, 이미지, 위치 설정
	   result = new JLabel();
	   back = new JLabel(new ImageIcon("img/1.jpg"));
	   back.setBounds(80, 20, 500, 563);
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
	   candb.setBounds(50, 600, 200, 70);
	   etccb.setBounds(50, 700, 200, 70);
	  
	   left.setBounds(580, 720, 40, 40);
	  // back.setBounds(80, 230, 500, 563);
	   right.setBounds(710, 720, 40, 40);
	 
	    c.add(menub); c.add(choob); c.add(boarb); c.add(cartb); c.add(back);
	   
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // 프로그램 종료 
	   setSize(1140, 950);
	   setVisible(true); 
		setVisible(true);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(60, 169, 1020, 688);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(59, 120, 426, 510);
		panel.add(panel_1);
		panel_1.setBorder(BorderFactory.createEmptyBorder(70 , 100 , 100 , 100)); //상하좌우 10씩 띄우기
		JPanel p = new JPanel();
		p.setBackground(Color.YELLOW);
		p.setBounds(570, 100, 400, 300);
		panel.add(p);
		p.setBorder(BorderFactory.createEmptyBorder(100 , 100 , 100 , 100)); //상하좌우 10씩 띄우기
		
		Font f = new Font("나눔고딕", Font.BOLD, 40);
		Font f1 = new Font("나눔고딕", Font.BOLD, 50);
		try{
			   Connection con = null;
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
		      
		       ResultSet result = null;
		       ResultSet result2 = null;
		       java.sql.Statement st = null;
		       java.sql.Statement st2 = null;
		       st = con.createStatement();
		       st2 = con.createStatement();
		       st.execute("use menu;"); // 사용할 DB를 선택한다.
		       // executeQuery : 쿼리를 실행하고 결과를 ResultSet 객체로 반환한다.
		       result = st.executeQuery("select * from cart;");
		       result2 = st2.executeQuery("select sum(c_price) from cart;");
		      
		       // 결과를 하나씩 출력한다.
		      while (result.next()){
		 String str = result.getString(1)+" | "+result.getString(2)+"";
			           JLabel jl = new JLabel(str);
			           jl.setFont(f);
			           panel_1.add(jl);
		      }
		      while(result2.next()){
		    	  String str2 = " 총합 : " +result2.getString(1);
		    	  JLabel j2 = new JLabel(str2);
		    	  j2.setFont(f1);
		    	  j2.setBounds(20,20, 200,200);
		    	  p.add(j2);
		      }}catch(Exception e3){}
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(512, 5, 10, 10);
		panel.add(panel_2);
		f1 = new Font("나눔고딕", Font.PLAIN, 20);
		JLabel label = new JLabel();
		label.setBounds(185, 70, 203, 50);
		label.setFont(f1);
		panel.add(label);
		
		b1.setBounds(550, 414, 200, 70);
		panel.add(b1);
		
		
		b2.setBounds(794, 414, 200, 70);
		panel.add(b2);
		
		
		b3.setBounds(676, 513, 200, 70);
		panel.add(b3);
		
		JLabel lblNewLabel = new JLabel("\uACB0\uC81C\uC218\uB2E8");
		lblNewLabel.setBounds(712, 359, 100, 50);
		lblNewLabel.setFont(f1);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD1D :");
		lblNewLabel_1.setBounds(605, 209, 62, 50);
		lblNewLabel_1.setFont(f1);
		panel.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("\uAE08\uC561 :");
		label_1.setBounds(605, 268, 100, 50);
		label_1.setFont(f1);
		panel.add(label_1);
		
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
			try{
				   Connection con = null;
			       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
			      
			       ResultSet result = null;
			       ResultSet result2 = null;
			       java.sql.Statement st = null;
			       java.sql.Statement st2 = null;
			       st = con.createStatement();
			       st2 = con.createStatement();
			       st.execute("use menu;"); // 사용할 DB를 선택한다.
			       // executeQuery : 쿼리를 실행하고 결과를 ResultSet 객체로 반환한다.
			       String how = null;
			       if(e.getSource().equals(b1)){how = "카드";

	                 st2 = con.createStatement();
	                 st.execute("use menu;"); // 사용할 DB를 선택한다.
	                 st.execute("insert into how values(null,'"+how+"')"); }// 사용할 DB를 선택한다.}
			       else if(e.getSource().equals(b2)){how = "현금";

	                 st2 = con.createStatement();
	                 st.execute("use menu;"); // 사용할 DB를 선택한다.
	                 st.execute("insert into how values(null,'"+how+"')"); // 사용할 DB를 선택한다.}
			       }
			     //  	result = st.executeQuery("select sum(c_price) from cart;");
				     //  result2 = st.executeQuery("select * from login where id = (select max(id) from login);");
				      // result = st.executeQuery("select * from final;");
				      
				       // 결과를 하나씩 출력한다.
				     //  while (result.next()){
			                
				          
				    //   }
			
				}catch(Exception ee){ee.printStackTrace();}
			
			if(e.getSource().equals(b3)){
				try{
					dispose();
					Final_2 f=new Final_2();
					try{
						   Connection con = null;
					       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
					      
					       ResultSet result = null;
					      // ResultSet result2 = null;
					       java.sql.Statement st = null;
					       st = con.createStatement();
					       st.execute("use menu;"); // 사용할 DB를 선택한다.
					       // executeQuery : 쿼리를 실행하고 결과를 ResultSet 객체로 반환한다.
					       result = st.executeQuery("select * from login where id = (select max(id) from login);");
					       //result.close();
					     //  result2 = st.executeQuery("select * from board;");
					       
					       // 결과를 하나씩 출력한다.
					       while (result.next()){
					    	   if(e.getSource().equals(b3)){
				                 //ResultSet result = null;
					    	   java.sql.Statement st2 = null;
				                 st2 = con.createStatement();
				                 st2.execute("use menu;"); // 사용할 DB를 선택한다.
				                
				                 st2.execute("insert into owner values('"+result.getString(2)+"','"+
						                 result.getString(3)+"',0)"); // 사용할 DB를 선택한다.
					    	   }
					       }
						   }catch(Exception e3){e3.printStackTrace();}
					f.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
	}
}
public class Cart{
	public static void main(String args[]) throws Exception{
		new CartFrame();
		
	}
}
