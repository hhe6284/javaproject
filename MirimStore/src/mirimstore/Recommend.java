package mirimstore;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

import org.omg.Messaging.SyncScopeHelper;
	
class RecomFrame extends JFrame implements ActionListener {
	protected JButton  menub, choob, boarb, cartb, snackb, breab, drinkb, icecb, candb, etccb,left, right,��Ȳ1, ��Ȳ2, ��Ȳ3, ��Ȳ4, ��Ȳ5, ��Ȳ6;
	protected JLabel label, result, page, �켱����, back;
	private Font f1;
	 JScrollPane scrollPane;
	ImageIcon icon;
	CardLayout card = new CardLayout();
	Container cc = this.getContentPane();
	Situation a = new Situation();
	RandomMenu r = new RandomMenu();
	public RecomFrame()
	  {
		super("mirimmajum");
	    cc.setBackground(Color.WHITE);
	    menub = new JButton(new ImageIcon("img/m-01.png"));
		   choob = new JButton(new ImageIcon("img/m-04.png"));
		   boarb = new JButton(new ImageIcon("img/m-05.png"));
		   cartb = new JButton(new ImageIcon("img/m-07.png"));
		   snackb = new JButton(new ImageIcon("img/menu-01.png"));
		   breab = new JButton(new ImageIcon("img/menu-02.png"));
		   drinkb = new JButton(new ImageIcon("img/menu-04.png"));
		   icecb = new JButton(new ImageIcon("img/menu-05.png"));
		   candb = new JButton(new ImageIcon("img/menu-03.png"));
	   left = new JButton(new ImageIcon("left.jpg"));
	   page = new JLabel(new ImageIcon("page.jpg"));
	   right = new JButton(new ImageIcon("right.jpg"));
	
	   ��Ȳ1 = new JButton(new ImageIcon("img/v-01.png"));
	   ��Ȳ2 = new JButton(new ImageIcon("img/v-02.png"));
	   ��Ȳ3 = new JButton(new ImageIcon("img/v-03.png"));
	   ��Ȳ4 = new JButton(new ImageIcon("img/v-04.png"));
	   ��Ȳ5 = new JButton(new ImageIcon("img/v-05.png"));
	   ��Ȳ6 = new JButton(new ImageIcon("img/v-06.png"));
	   �켱���� = new JLabel(new ImageIcon("img/v-07.png"));
	   back = new JLabel(new ImageIcon("img/88-01.png"));
	   snackb.addActionListener(this);
	   breab.addActionListener(this);
	   drinkb.addActionListener(this);
	   icecb.addActionListener(this);
	   candb.addActionListener(this);
	   ��Ȳ1.addActionListener(this);
	   ��Ȳ2.addActionListener(this);
	   ��Ȳ3.addActionListener(this);
	   ��Ȳ4.addActionListener(this);
	   ��Ȳ5.addActionListener(this);
	      
	 
	   menub.setBackground(Color.WHITE);
	   choob.setBackground(Color.WHITE);
	   boarb.setBackground(Color.WHITE);
	   cartb.setBackground(Color.WHITE);
	   snackb.setBackground(Color.WHITE);
	   breab.setBackground(Color.WHITE);
	   drinkb.setBackground(Color.WHITE);
	   icecb.setBackground(Color.WHITE);
	   candb.setBackground(Color.WHITE);
	   ��Ȳ1.setBackground(Color.WHITE);
	   ��Ȳ2.setBackground(Color.WHITE);
	   ��Ȳ3.setBackground(Color.WHITE);
	   ��Ȳ4.setBackground(Color.WHITE);
	   ��Ȳ5.setBackground(Color.WHITE);
	   ��Ȳ6.setBackground(Color.WHITE);
	   
	
	   menub.setBorderPainted(false);
	   choob.setBorderPainted(false);
	   boarb.setBorderPainted(false);
	   cartb.setBorderPainted(false);
	   snackb.setBorderPainted(false);
	   breab.setBorderPainted(false);
	   drinkb.setBorderPainted(false);
	   icecb.setBorderPainted(false);
	   candb.setBorderPainted(false);
	   ��Ȳ1.setBorderPainted(false);
	   ��Ȳ2.setBorderPainted(false);
	   ��Ȳ3.setBorderPainted(false);
	   ��Ȳ4.setBorderPainted(false);
	   ��Ȳ5.setBorderPainted(false);
	   ��Ȳ6.setBorderPainted(false);
	   
	   menub.addActionListener(this); choob.addActionListener(this); boarb.addActionListener(this); 
	   cartb.addActionListener(this); 
	 //  ImageIcon logo = new ImageIcon("logo.jpg");
	   //label = new JLabel(logo, JLabel.LEFT);// �󺧿� ����, �̹���, ��ġ ����
	   result = new JLabel();
       result.setText("Country Name");
      
       JLabel panel = new JLabel(new ImageIcon("img/��-03.png"));
		panel.setLayout(null);
		panel.setBounds(11, 200, 401, 530);
		cc.add(panel);
		
		JLabel panel_1 = new JLabel(new ImageIcon("img/��-02.png"));
		panel_1.setLayout(null);
		panel_1.setBounds(370, 200, 401, 530);
		cc.add(panel_1);
		
	/*	JLabel panel_2 = new JLabel(new ImageIcon("img/��-01.png"));
		panel_2.setLayout(null);
		panel_2.setBounds(730, 180, 401, 530);
		cc.add(panel_2);
	*/
		JLabel a1 = new JLabel(new ImageIcon("img/22.jpg"));
		a1.setLayout(null);
		a1.setBounds(880, 250, 100, 50);
		cc.add(a1);
		
		JLabel a2 = new JLabel(new ImageIcon("img/33.jpg"));
		a2.setLayout(null);
		a2.setBounds(880, 400, 100, 50);
		cc.add(a2);
		
		JLabel a3 = new JLabel(new ImageIcon("img/44.jpg"));
		a3.setLayout(null);
		a3.setBounds(880, 550, 100, 50);
		cc.add(a3);
	
		JLabel a4 = new JLabel(new ImageIcon("img/66.jpg"));
		a4.setLayout(null);
		a4.setBounds(790, 200, 300, 50);
		cc.add(a4);
		
	   setLayout(null);
	   cc.add(menub); cc.add(choob); cc.add(boarb); cc.add(cartb);
	  cc.add(snackb);cc.add(breab); cc.add(drinkb); cc.add(icecb); cc.add(candb); 
	     cc.add(��Ȳ1); cc.add(��Ȳ2); cc.add(��Ȳ3); cc.add(��Ȳ4); cc.add(��Ȳ5); cc.add(��Ȳ6); 
	   cc.add(�켱����);
	  
	   snackb.setBorderPainted(false);
	   snackb.setOpaque(false);
	   snackb.setContentAreaFilled(false);
	   breab.setBorderPainted(false);
	   breab.setOpaque(false);
	   breab.setContentAreaFilled(false);
	   drinkb.setBorderPainted(false);
	   drinkb.setOpaque(false);
	   drinkb.setContentAreaFilled(false);
	   icecb.setBorderPainted(false);
	   icecb.setOpaque(false);
	   icecb.setContentAreaFilled(false);
	   candb.setBorderPainted(false);
	   candb.setOpaque(false);
	   candb.setContentAreaFilled(false);
	   
	   ��Ȳ1.setBorderPainted(false);
	   ��Ȳ1.setOpaque(false);
	   ��Ȳ1.setContentAreaFilled(false);
	   ��Ȳ2.setBorderPainted(false);
	   ��Ȳ2.setOpaque(false);
	   ��Ȳ2.setContentAreaFilled(false);
	   ��Ȳ3.setBorderPainted(false);
	   ��Ȳ3.setOpaque(false);
	   ��Ȳ3.setContentAreaFilled(false);
	   ��Ȳ4.setBorderPainted(false);
	   ��Ȳ4.setOpaque(false);
	   ��Ȳ4.setContentAreaFilled(false);
	   ��Ȳ5.setBorderPainted(false);
	   ��Ȳ5.setOpaque(false);
	   ��Ȳ5.setContentAreaFilled(false);
	   ��Ȳ6.setBorderPainted(false);
	   ��Ȳ6.setOpaque(false);
	   ��Ȳ6.setContentAreaFilled(false);
	   
	   setDefaultCloseOperation(EXIT_ON_CLOSE); // ���α׷� ���� 
	   setSize(1140, 880);
	    right.setBounds(710, 720, 40, 40);
		page.setBounds(640, 714, 50, 50);
		left.setBounds(580, 720, 40, 40);
		menub.setBounds(60, 60, 215, 80);
		   choob.setBounds(320, 62, 209, 69);
		   boarb.setBounds(580, 60, 209, 69);
		   cartb.setBounds(840, 60, 209, 69);
	
		snackb.setBounds(105, 310,209, 69);
		breab.setBounds(105, 390, 209, 69);
		drinkb.setBounds(105, 470,209, 69);
		icecb.setBounds(105, 550, 209, 69);
		candb.setBounds(105, 630, 209, 69);
	
		��Ȳ1.setBounds(427, 282, 290, 60);
		��Ȳ2.setBounds(427, 352, 290, 60);
		��Ȳ3.setBounds(427, 422, 290, 60);
		��Ȳ4.setBounds(427, 492, 290, 60);
		��Ȳ5.setBounds(427, 562, 290, 60);
		��Ȳ6.setBounds(427, 632, 290, 60);
		�켱����.setBounds(750, 200, 400, 531);
	
		setVisible(true);
		setResizable(false);
		getContentPane().setLayout(null);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		//JLabel j = new JLabel(new ImageIcon("img/88-01.png"));
	//	panel_2.add(j);
		panel_2.setBounds(730, 200, 401, 530);
		getContentPane().add(panel_2);
		panel_2.setBorder(BorderFactory.createEmptyBorder(120 , 100 , 100 , 100)); //�����¿� 10�� ����
		f1 = new Font("��������", Font.PLAIN, 30);
		try {
			Connection con = null;
            
			
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
            java.sql.Statement st = null;
            ResultSet result = null;
            st = con.createStatement();
            st.execute("use menu;"); // ����� DB�� �����Ѵ�.
            // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
            result = st.executeQuery("select * from allmenu group by name order by product desc limit 3;");
            
            // ����� �ϳ��� ����Ѵ�.
            while (result.next()){
                String str = result.getString(1);
                System.out.println(str);
                
                JLabel jj = new JLabel("<html>"+str+"&nbsp;<br><br><br></html>");
                jj.setFont(f1);
                panel_2.add(jj);
               
                jj.setBounds(125, 200, 100, 400);
            }
           
			//JOptionPane.showMessageDialog(this, ms.printprice(1));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		setSize(1140, 880);
		setVisible(true);
		setResizable(false);
	  }
	public String randomtext(){
		String[] text = {"�α� �α�! ���� ���ñ�?","�޴� �������� �������?","���� ������ ���ְ� ����~!","����������, ��ȸ�� �����ϱ�!","���ִ°� �԰� ����~"}; 
		Random ran = new Random(); 
		int i = ran.nextInt(5);
		return text[i];
	}
	//a.RandomChoiceSituation();
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
			if(e.getSource().equals(snackb)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, r.randomchoice(1));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(breab)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, r.randomchoice(2));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(drinkb)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, r.randomchoice(3));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(icecb)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, r.randomchoice(4));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(candb)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, r.randomchoice(5));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(��Ȳ1)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, a.RandomChoiceSituation(1));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(��Ȳ2)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, a.RandomChoiceSituation(2));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			if(e.getSource().equals(��Ȳ3)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, a.RandomChoiceSituation(3));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}if(e.getSource().equals(��Ȳ4)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, a.RandomChoiceSituation(4));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}if(e.getSource().equals(��Ȳ5)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, a.RandomChoiceSituation(5));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}if(e.getSource().equals(��Ȳ6)){
				try{
					JOptionPane.showMessageDialog(this, randomtext());
					Thread.sleep(1000);
					JOptionPane.showMessageDialog(this, a.RandomChoiceSituation(6));
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			
	}
}
class RandomMenu extends Frame implements ActionListener{
	int sel;
	ArrayList pricearr= new ArrayList();
	String text = "", recent="";
	public void choice(int message){
		Random ran = new Random(); 
		switch(message){
		case 1 : 
		 sel = ran.nextInt(41)+1;
		 break;
		case 2 : 
		 sel = ran.nextInt(50)+42;
		 break;
		case 3 : 
			 sel = ran.nextInt(116)+87;
			 break;
		case 4 : 
			 sel = ran.nextInt(70)+51;
			 break;
		case 5 : 
			 sel = ran.nextInt(81)+71;
			 break;
		}
	}
	public String randomchoice(int n) throws Exception{
		String fname = "menu2.txt";
		FileReader file = new FileReader(fname);
		BufferedReader reader = new BufferedReader(file);
		choice(n);
		String line = null, recent=null;
		while((line = reader.readLine())!= null){
			String[] pepleline = line.split("\t");
			int num = Integer.parseInt(pepleline[0]);
			String name = pepleline[1];
			if(num == sel){recent=name; continue;}
			int price = Integer.parseInt(pepleline[2]);
		}
		return recent;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

class Situation{
	int sel;
	ArrayList pricearr= new ArrayList();
	public void choice(int message){
		Random ran = new Random(); 
		switch(message){
		case 1 : 
		 sel = ran.nextInt(11)+1;
		 break;
		case 2 : 
		 sel = ran.nextInt(24)+12;
		 break;
		case 3 : 
			 sel = ran.nextInt(37)+25;
			 break;
		case 4 : 
			 sel = ran.nextInt(73)+38;
			 break;
		case 5 : 
			 sel = ran.nextInt(88)+74;
			 break;
		case 6 : 
			 sel = ran.nextInt(117)+89;
			 break;
		default: 
			break;
		}
	}
	
	public String RandomChoiceSituation(int n) throws Exception{
		String fname = "randommenu.txt";
		FileReader file = new FileReader(fname);
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = null, recent=null;
		choice(n);
		while((line = reader.readLine())!= null){
			String[] pepleline = line.split("\t");
			int num = Integer.parseInt(pepleline[0]);
			String name = pepleline[1];
			if(num == sel){recent=name; continue;}
			int price = Integer.parseInt(pepleline[2]);
		}
		return recent;		
	}
}
public class Recommend{
	public static void main(String args[]) throws Exception{
		new RecomFrame();
	}

}