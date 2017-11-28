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

class MenuFrameB extends JFrame implements ActionListener {
	public JButton  menub, choob, boarb, cartb, snackb, breab_c, drinkb, icecb, candb, etccb, ����
	,����,��Ʈ��, ���佺, ġ��, ��������, �̴�����, ��, right;
	protected JLabel label, result, page;
	GridBagConstraints cc;
	private Font f1 = new Font("��������", Font.PLAIN, 20);
	public MenuFrameB()
	  {
		super("�̸�����");
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
	   
	   ���� = new JButton(new ImageIcon("img/b-01.png"));
	   ���� = new JButton(new ImageIcon("img/b-04.png"));
	   ��Ʈ�� = new JButton(new ImageIcon("img/b-05.png"));
	   ���佺 = new JButton(new ImageIcon("img/b-06.png"));
	   ġ�� = new JButton(new ImageIcon("img/b-07.png"));
	   �������� = new JButton(new ImageIcon("img/b-08.png"));
	   �̴����� = new JButton(new ImageIcon("img/b-09.png"));
	   �� = new JButton(new ImageIcon("img/b-10.png"));
		   page = new JLabel("1/2");
		   page.setFont(f1);
	   right = new JButton(new ImageIcon("img/a-49.png"));
	   //�̺�Ʈ ���
	   ����.addActionListener(this);
	   ����.addActionListener(this);
	   ��Ʈ��.addActionListener(this);
	   ���佺.addActionListener(this);
	   ġ��.addActionListener(this);
	   ��������.addActionListener(this);
	   �̴�����.addActionListener(this);
	   ��.addActionListener(this);
	   right.addActionListener(this);
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
	
	   right.setBackground(Color.WHITE);
	   
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
	
	   right.setBorderPainted(false);
	   
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
	   
	   ����.setBorderPainted(false);
	   ����.setOpaque(false);
	   ����.setContentAreaFilled(false);
	   ����.setBorderPainted(false);
	   ����.setOpaque(false);
	   ����.setContentAreaFilled(false);
	   ��Ʈ��.setBorderPainted(false);
	   ��Ʈ��.setOpaque(false);
	   ��Ʈ��.setContentAreaFilled(false);
	   ���佺.setBorderPainted(false);
	   ���佺.setOpaque(false);
	   ���佺.setContentAreaFilled(false);
	   ġ��.setBorderPainted(false);
	   ġ��.setOpaque(false);
	   ġ��.setContentAreaFilled(false);
	   ��������.setBorderPainted(false);
	   ��������.setOpaque(false);
	   ��������.setContentAreaFilled(false);
	   �̴�����.setBorderPainted(false);
	   �̴�����.setOpaque(false);
	   �̴�����.setContentAreaFilled(false);
	   ��.setBorderPainted(false);
	   ��.setOpaque(false);
	   ��.setContentAreaFilled(false);
	 
	   right.setBorderPainted(false);
	   right.setOpaque(false);
	   right.setContentAreaFilled(false);
	   menub.addActionListener(this); choob.addActionListener(this); boarb.addActionListener(this); 
	   cartb.addActionListener(this); snackb.addActionListener(this); breab_c.addActionListener(this);
	   drinkb.addActionListener(this); icecb.addActionListener(this); candb.addActionListener(this);
	   etccb.addActionListener(this); right.addActionListener(this); 
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
	  
	   ����.setBounds(310, 200,  170, 220);
	   ����.setBounds(510, 200,  170, 220);
	   ��Ʈ��.setBounds(710, 200,  170, 220);
	   ���佺.setBounds(910, 200,  170, 220);
	   ġ��.setBounds(310, 470,  170, 220);
	   ��������.setBounds(510, 470,  170, 220);
	   �̴�����.setBounds(710, 470,  170, 220);
	   ��.setBounds(910, 470,  170, 220);
	 
	   page.setBounds(640, 714, 50, 50);
	   right.setBounds(710, 720, 40, 40);
	    c.add(menub); c.add(choob); c.add(boarb); c.add(cartb);
	   c.add(snackb); c.add(breab_c); c.add(drinkb); c.add(icecb); c.add(candb); 
	   c.add(etccb); 
	   
	   c.add(����); c.add(����); c.add(��Ʈ��); c.add(���佺);
	   c.add(ġ��); c.add(��������); c.add(�̴�����); c.add(��); 
	   c.add(page); c.add(right);
	   
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // ���α׷� ���� 
	   setSize(1140, 880);
	   setVisible(true);
	   setResizable(false);
	  }
	
		public void actionPerformed(ActionEvent e){
			 //Ȯ�ι�ư ������ �������� ������ 
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
			if(e.getSource().equals(right)){
				try{
					dispose();
					MenuFrameB2 me = new MenuFrameB2();
					me.setVisible(true);
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
		if (e.getSource().equals(����))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '���ϵ�ġ��';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='���ϵ�ġ��';");
                    	st2.execute("insert into cart values('���ϵ�ġ��','1000')");
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
                result = st.executeQuery("select name from allmenu where name = '����';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='ġŲ����齺��';");
                    	st2.execute("insert into cart values('����','1500')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(��Ʈ��))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '��Ʈ�κ������Ͻ�';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='��Ʈ�κ������Ͻ�';");
                    	st2.execute("insert into cart values('��Ʈ�κ������Ͻ�','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(���佺))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '���н���';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='���н���';");
                    	st2.execute("insert into cart values('���н���','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(ġ��))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = 'ġ���ķ�����';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='ġ���ķ�����';");
                    	st2.execute("insert into cart values('ġ���ķ�����','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(��������))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '�������ڵ��Ͻ�';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='�������ڵ��Ͻ�';");
                    	st2.execute("insert into cart values('�������ڵ��Ͻ�','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}	
		else if(e.getSource().equals(�̴�����))
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
                    	st2.execute("insert into cart values('������','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(��))
		{
			try {
				Connection con = null;
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                java.sql.Statement st = null;
                ResultSet result = null;
                st = con.createStatement();
                st.execute("use menu;"); 
                result = st.executeQuery("select name from allmenu where name = '�ּҽ���ġ�ƹ�Ÿ';");
                
                while (result.next()){
                    String str = result.getNString(1) + "��ǰ�� �ֹ��Ͻðڽ��ϱ�?";
                   int reply = JOptionPane.showConfirmDialog(this, str);
                    if(reply == JOptionPane.YES_OPTION){
                    	 java.sql.Statement st2 = null;
                         st2 = con.createStatement();
                    	st2.execute("update allmenu set product=product+1 where name='�ּҽ���ġ�ƹ�Ÿ';");
                    	st2.execute("insert into cart values('�ּҽ���ġ�ƹ�Ÿ','1000')");
                    }
                }
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
public class MenuB{
	public static void main(String args[]) throws Exception{
		new MenuFrameB();
		
	}

}