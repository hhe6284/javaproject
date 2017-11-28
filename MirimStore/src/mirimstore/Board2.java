package mirimstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
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
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.SystemColor;


	
class WritingFrame extends JFrame implements ActionListener {
	protected JButton �Է¿Ϸ�;
	/*private static JTextField number;
	private static JTextField school;
	private static JTextField hakbun;
	private static JTextField name;*/
	private static JTextField title;
	private static JTextField content;
	JLabel lblNewLabel;
	GridBagConstraints cc;
	public WritingFrame()
	  {
		super("�̸�����");
		Container c = this.getContentPane();
	    c.setBackground(Color.WHITE);
	     
	   �Է¿Ϸ� = new JButton(new ImageIcon("img/q-02.png"));
	   
	   �Է¿Ϸ�.setBackground(Color.WHITE);
	   
	   �Է¿Ϸ�.setBorderPainted(false);
	   
	  �Է¿Ϸ�.addActionListener(this);
       
	   setLayout(null);
	   
	   �Է¿Ϸ�.setBounds(130, 400, 250, 50);
	   c.add(�Է¿Ϸ�);
	   
		JLabel label_2 = new JLabel("\uAE00\uC81C\uBAA9");
		label_2.setBounds(49, 50, 62, 18);
		getContentPane().add(label_2);
		
		title = new JTextField();
		title.setColumns(10);
		title.setBounds(100, 50, 320, 24);
		getContentPane().add(title);
		
		JLabel label_3 = new JLabel("\uB0B4\uC6A9");
		label_3.setBounds(49, 100, 62, 18);
		getContentPane().add(label_3);
		
		content = new JTextField();
		content.setColumns(10);
		content.setBounds(100, 100, 320, 182);
		getContentPane().add(content);
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // ���α׷� ���� 
	   setSize(500, 500);
	   setVisible(true);
		setResizable(false);
		getContentPane().setLayout(null);
	  }
		public void actionPerformed(ActionEvent e){
			if(e.getSource().equals(�Է¿Ϸ�)){
				{if(title.getText()==null||content.getText()==null){
		         	try{
		         		JOptionPane.showMessageDialog(null, "��� ���� �Է��ϼ���", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
		         	}catch(Exception e3){
		         		e3.getMessage();
		         	}
		         }
				try{
					   Connection con = null;
				       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
				      
				       ResultSet result = null;
				      // ResultSet result2 = null;
				       java.sql.Statement st = null;
				       st = con.createStatement();
				       st.execute("use menu;"); // ����� DB�� �����Ѵ�.
				       // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
				       result = st.executeQuery("select * from login where id = (select max(id) from login);");
				       //result.close();
				     //  result2 = st.executeQuery("select * from board;");
				       
				       // ����� �ϳ��� ����Ѵ�.
				       while (result.next()){
				    	   java.sql.Statement st2 = null;
			                 //ResultSet result = null;
			                
			                 st2 = con.createStatement();
			                 st2.execute("use menu;"); // ����� DB�� �����Ѵ�.
			                 st2.execute("insert into board values(null,'"+result.getString(2)+"','"+
			                 result.getString(3)+"','"+result.getString(4)+"','"+title.getText()+
			                 "','"+content.getText()+"')"); // ����� DB�� �����Ѵ�.
				          
				       }
					   }catch(Exception e3){e3.printStackTrace();}
		        
		        
		     while(!(title.getText()==null||content.getText()==null)){
						if(e.getSource().equals(�Է¿Ϸ�)){
							try{
				                dispose();
								BoardFrame menu = new BoardFrame();
			   					menu.setVisible(true);
			   					break;
							}catch(Exception eee){
								eee.printStackTrace();
							};
			   			}
					}
				}
			}
		}
}
				
			
		
		   
		
			
public class Board2{
	public static void main(String args[]){
		new WritingFrame();
		
	}
}
