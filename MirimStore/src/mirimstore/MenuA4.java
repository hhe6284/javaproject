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

class MenuFrameA4 extends JFrame implements ActionListener {
	public JButton menub, choob, boarb, cartb, snackb_c, breab, drinkb, icecb, candb, etccb, �����۽�
	,������Ĩ,�ٳ���ű, �Ƕ�, ����, ����ƽ, �ſ�����, ����Ĩ��Ű, left, right;
	/*String b[]={"�����۽�","������Ĩ","�ٳ���ű", "�Ƕ�", "����", "����ƽ", "�ſ�����", "����Ĩ��Ű"};
	JButton a[] = new JButton[b.length]; ��ư �迭�� �Ӽ��� �� ���� ������ �ֱ�*/
	protected JLabel label, result, page;
	GridBagConstraints cc;
	JPanel jp = new JPanel();
	private Font f1 = new Font("�������", Font.PLAIN, 20);
	public MenuFrameA4()
	  {
		super("�̸�����");
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
	   �����۽� = new JButton(new ImageIcon("img/s-34.png"));
	   ������Ĩ = new JButton(new ImageIcon("img/s-35.png"));
	   �ٳ���ű = new JButton(new ImageIcon("img/s-37.png"));
	   �Ƕ� = new JButton(new ImageIcon("img/s-36.png"));
	   ���� = new JButton(new ImageIcon("img/s-38.png"));
	   ����ƽ = new JButton(new ImageIcon("img/s-39.png"));
	   �ſ����� = new JButton(new ImageIcon("img/s-40.png"));
	   ����Ĩ��Ű = new JButton(new ImageIcon("img/s-41.png"));
	   left = new JButton(new ImageIcon("img/a-50.png"));
	   page = new JLabel("5/6");
	   page.setFont(f1);
	   right = new JButton(new ImageIcon("img/a-49.png"));
	   //�̺�Ʈ ���
	   �����۽�.addActionListener(this);
	   ������Ĩ.addActionListener(this);
	   �ٳ���ű.addActionListener(this);
	   �Ƕ�.addActionListener(this);
	   ����.addActionListener(this);
	   ����ƽ.addActionListener(this);
	   �ſ�����.addActionListener(this);
	   ����Ĩ��Ű.addActionListener(this);
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
	   
	   �����۽�.setBorderPainted(false);
	   �����۽�.setOpaque(false);
	   �����۽�.setContentAreaFilled(false);
	   ������Ĩ.setBorderPainted(false);
	   ������Ĩ.setOpaque(false);
	   ������Ĩ.setContentAreaFilled(false);
	   �ٳ���ű.setBorderPainted(false);
	   �ٳ���ű.setOpaque(false);
	   �ٳ���ű.setContentAreaFilled(false);
	   �Ƕ�.setBorderPainted(false);
	   �Ƕ�.setOpaque(false);
	   �Ƕ�.setContentAreaFilled(false);
	   ����.setBorderPainted(false);
	   ����.setOpaque(false);
	   ����.setContentAreaFilled(false);
	   ����ƽ.setBorderPainted(false);
	   ����ƽ.setOpaque(false);
	   ����ƽ.setContentAreaFilled(false);
	   �ſ�����.setBorderPainted(false);
	   �ſ�����.setOpaque(false);
	   �ſ�����.setContentAreaFilled(false);
	   ����Ĩ��Ű.setBorderPainted(false);
	   ����Ĩ��Ű.setOpaque(false);
	   ����Ĩ��Ű.setContentAreaFilled(false);
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
	   etccb.addActionListener(this); left.addActionListener(this);  right.addActionListener(this); 
	 //  ImageIcon logo = new ImageIcon("logo.jpg");
	   //label = new JLabel(logo, JLabel.LEFT);// �󺧿� ����, �̹���, ��ġ ����
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
	   �����۽�.setBounds(310, 200,  170, 220);
	   ������Ĩ.setBounds(510, 200,  170, 220);
	   �ٳ���ű.setBounds(710, 200,  170, 220);
	   �Ƕ�.setBounds(910, 200,  170, 220);
	   ����.setBounds(310, 470,  170, 220);
	   ����ƽ.setBounds(510, 470,  170, 220);
	   �ſ�����.setBounds(710, 470,  170, 220);
	   ����Ĩ��Ű.setBounds(910, 470,  170, 220);
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
	   c.add(�����۽�);
	   c.add(������Ĩ); c.add(�ٳ���ű); c.add(�Ƕ�);
	   c.add(����); c.add(����ƽ); c.add(�ſ�����); c.add(����Ĩ��Ű); c.add(left);
	   c.add(page); c.add(right);
	   
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // ���α׷� ���� 
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
					MenuFrameA3 me = new MenuFrameA3();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(right)){
				try{
					dispose();
					MenuFrameA5 me = new MenuFrameA5();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
		if (e.getSource().equals(�����۽�))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '���Ͻ�';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='���Ͻ�';");
                    	st2.execute("insert into cart values('���Ͻ�','800')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(������Ĩ))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '�Ƕ�';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='�Ƕ�';");
                    	st2.execute("insert into cart values('�Ƕ�','500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(�ٳ���ű))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '����';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='����';");
                    	st2.execute("insert into cart values('����','200')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(�Ƕ�))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '�ε�ȹ�';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='�ε�ȹ�';");
                    	st2.execute("insert into cart values('�ε�ȹ�','1400')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(����))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '��ũ�ٽ�';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='��ũ�ٽ�';");
                    	st2.execute("insert into cart values('��ũ�ٽ�','300')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(����ƽ))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '����׷�';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='����׷�';");
                    	st2.execute("insert into cart values('����׷�','1700')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}	
		else if(e.getSource().equals(�ſ�����))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = 'Ȩ����';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='Ȩ����';");
                    	st2.execute("insert into cart values('Ȩ����','1500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(����Ĩ��Ű))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '������';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='������';");
                    	st2.execute("insert into cart values('������','500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
}
}
public class MenuA4{
	public static void main(String args[]) throws Exception{
		new MenuFrameA4();
	        }
		
	}

