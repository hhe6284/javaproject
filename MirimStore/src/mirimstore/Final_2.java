package mirimstore;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Final_2 extends JFrame implements ActionListener {
	protected JLabel label1, label2, hak, name, num, moeny, by, won;
	private Font f1 = new Font("��������", Font.PLAIN, 17);
	private Font f2 = new Font("��������", Font.BOLD, 25);
	private Font f3 = new Font("��������", Font.PLAIN, 20);
	private JButton jb;
	
	public Final_2(){
		super("�̸����� �ֹ� Ȯ��â");
		
		setLayout(null);
		Container c = this.getContentPane();
	    c.setBackground(Color.WHITE);  
		label1 = new JLabel("�ֹ� �Ϸ�!");
		label1.setFont(f2);
		label1.setForeground(Color.RED);
		label1.setBounds(185, 30, 120, 25);
		c.add(label1);
		
		label2 = new JLabel("������ �湮 ���� �� ���Ƚ���� �����մϴ�.");
		label2.setFont(f3);
		label2.setBounds(55, 70, 400, 20);
		c.add(label2);
		
		jb = new JButton(new ImageIcon("img/ka-01.png"));
		jb.setBounds(142, 320, 200, 61);
		jb.setBorderPainted(false);
		jb.setOpaque(false);
		jb.setContentAreaFilled(false);
		jb.setBackground(Color.WHITE);
		jb.addActionListener(this);
		c.add(jb);
		Font f = new Font("��������", Font.BOLD, 20);
		JPanel p = new JPanel();
		p.setBackground(Color.lightGray);
		p.setBounds(10,10,499,459);
		c.add(p);
		try{
			   Connection con = null;
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
		      
		       ResultSet result = null;
		       java.sql.Statement st = null;
		       st = con.createStatement();
		       st.execute("use menu;"); // ����� DB�� �����Ѵ�.
		       // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
		       
		       result = st.executeQuery("select * from login where id = (select max(id) from login);");
		       //result = st.executeQuery("select * from final;");
		      
		       // ����� �ϳ��� ����Ѵ�.
		       while (result.next()){
		    	   p.setLayout(null);
			 String str = "�й� : " + result.getString(2);
			 String str2 = "�̸�  : " + result.getString(3);
				           JLabel jl = new JLabel(str);
				           JLabel j2 = new JLabel(str2);
				           jl.setFont(f);
				           j2.setFont(f);
				           jl.setBounds(70,110,130,20);
				           j2.setBounds(250,110,150,20);
				           System.out.println(str);
				           System.out.println(str2);
				           p.add(jl);
				          p.add(j2);
			      } }catch(Exception e3){}
		try{
			   Connection con = null;
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
		      
		       ResultSet result2 = null;
		       java.sql.Statement st2 = null;
		       st2 = con.createStatement();
		       st2.execute("use menu;"); // ����� DB�� �����Ѵ�.
		       // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
		       JPanel panel_2 = new JPanel();
				panel_2.setBackground(Color.WHITE);
		       panel_2.setBounds(50, 170, 400, 80);
				p.add(panel_2);
				//panel_2.setBorder(BorderFactory.createEmptyBorder(20 , 20 , 20 , 20)); //�����¿� 10�� ����
		       result2 = st2.executeQuery("select c_name from cart;");
		       String str3 = "���� �� ���� : ";
		       JLabel j3 = new JLabel(str3);
		       j3.setBounds(70, 100, 200,100);
		       j3.setFont(f);
		       System.out.print(str3);
		       p.add(j3);
		       // ����� �ϳ��� ����Ѵ�.
		       while (result2.next()){
		    	   		    	   
			 String str4 = result2.getString(1);
				           
				           JLabel j4 = new JLabel("<html>"+str4+","+"<br></html>");
				           j4.setFont(f);
			                panel_2.add(j4);
			               
			                j4.setBounds(70, 80, 200, 200);
				           System.out.println(str4);     
			      }
		       }catch(Exception e3){}
		try{
			   Connection con = null;
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
		      
		       ResultSet result3 = null;
		       java.sql.Statement st3 = null;
		       st3 = con.createStatement();
		       st3.execute("use menu;"); // ����� DB�� �����Ѵ�.
		       // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
		       
		       result3 = st3.executeQuery("select sum(c_price) from cart;");
		       while (result3.next()){
		    	   
			 String str5 = "�հ� :" + result3.getString(1)+"��";
				           
				           JLabel j5 = new JLabel(str5);
				          j5.setBounds(70, 180, 200,200);
				           j5.setFont(f);
				           
				           System.out.println(str5);
				           p.add(j5);
			      } }catch(Exception e3){}
		try{
			   Connection con = null;
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
		      
		       ResultSet result3 = null;
		       java.sql.Statement st3 = null;
		       st3 = con.createStatement();
		       st3.execute("use menu;"); // ����� DB�� �����Ѵ�.
		       // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
		       
		       result3 = st3.executeQuery("select * from how where id = (select max(id) from how);");
		       while (result3.next()){
		    	   
			 String str5 = "�������� :" + result3.getString(2);
				           
				           JLabel j5 = new JLabel(str5);
				          j5.setBounds(250, 180, 200, 200);
				           j5.setFont(f);
				           
				           System.out.println(str5);
				           p.add(j5);
			      } }catch(Exception e3){}
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ���α׷� ���� 
	  setSize(500, 460);
	  setVisible(true);
	 setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Final_2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb)){
			try{
				dispose();
				MenuFrameA mb = new MenuFrameA();
				mb.setVisible(true);
			}catch(Exception ee){
				ee.printStackTrace();
			}
			try{
				   Connection con = null;
			       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
			      
			       ResultSet result = null;
			       java.sql.Statement st = null;
			       st = con.createStatement();
			       st.execute("use menu;"); // ����� DB�� �����Ѵ�.
			       // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
			       
			      st.execute("delete from cart;");
			     
				       }catch(Exception e3){}
		}
	}

}