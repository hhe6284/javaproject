package mirimstore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Owner extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Owner frame = new Owner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Owner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 411);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton(new ImageIcon("img/77-01.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(49, 258, 226, 50);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton(new ImageIcon("img/77-02.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(button)){
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
				    	   if(e.getSource().equals(button)){
			                 //ResultSet result = null;
				    	   java.sql.Statement st2 = null;
			                 st2 = con.createStatement();
			                 st2.execute("use menu;"); // 사용할 DB를 선택한다.
			                
			                 st2.execute("update owner set cancel=cancel+1 where o_name='"+result.getString(3)+"';");
				    	   }
				       }
					   }catch(Exception e3){e3.printStackTrace();}}
			}
		});
		button.setBounds(305, 258, 226, 50);
		contentPane.add(button);
		button.setBorderPainted(false);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("img/77-03.png"));
		lblNewLabel.setBounds(128, 27, 296, 54);
		contentPane.add(lblNewLabel);
		JPanel panel = new JPanel();
		panel.setBounds(160, 131, 248, 80);
		contentPane.add(panel);
		Font f = new Font("나눔고딕", Font.BOLD, 20);
		try{
			   Connection con = null;
		       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
		      
		       ResultSet result = null;
		       java.sql.Statement st = null;
		       st = con.createStatement();
		       st.execute("use menu;"); // 사용할 DB를 선택한다.
		       // executeQuery : 쿼리를 실행하고 결과를 ResultSet 객체로 반환한다.
		       
		       result = st.executeQuery("select * from login where id = (select max(id) from login);");
		       //result = st.executeQuery("select * from final;");
		      
		       // 결과를 하나씩 출력한다.
		       while (result.next()){
			 String str = result.getString(2) +" " + result.getString(3);
					 String str2 = "님이 주문하셨습니다.";
				           JLabel jl = new JLabel(str);
				           JLabel j2 = new JLabel(str2);
				           jl.setFont(f);
				           j2.setFont(f);
				           jl.setBounds(70,110,5,5);
				           j2.setBounds(250,110,5,5);
				           System.out.println(str);
				           System.out.println(str2);
				           panel.add(jl);
				          panel.add(j2);
			      } }catch(Exception e3){}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

		
	
}