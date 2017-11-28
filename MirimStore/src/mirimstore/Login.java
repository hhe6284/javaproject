package mirimstore;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.*;

import java.awt.*;
import mirimstore.MenuFrameA;
 
public class Login extends JFrame implements ActionListener {
    JScrollPane scrollPane;
    ImageIcon icon;
    private JLabel label1, passwordLabel,statusLabel,a;
    public JButton btn; 
    private JRadioButton checkBox;
	private JRadioButton checkBox_1;
	private JRadioButton checkBox_2;
	private JRadioButton checkBox_3;
    final TextField name,hakbun;

    private Font font= new Font("��������",Font.PLAIN,20);
    public Login() {
        icon = new ImageIcon("img/1.png");
        //��� Panel ������ �������������� ����      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); //�׸��� ǥ���ϰ� ����,�����ϰ� ����
                super.paintComponent(g);
            }
        };
        background.setLayout(null);
        label1 = new JLabel("�̸� : ");
        label1.setForeground(Color.WHITE);
        label1.setFont(font);
        label1.setBounds(200, 240, 100, 100);
        
        name = new TextField(6);
        name.setBounds(300, 280, 100, 20);
        	
        passwordLabel = new JLabel("�й� : ");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(font);
        passwordLabel.setBounds(200, 300, 100, 100);
        
        hakbun = new TextField(15);
        hakbun.setBounds(300, 340, 100, 20);  
        
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
        
    	statusLabel = new JLabel();
        statusLabel.setText("* ���Ƚ���� 3ȸ �̻��� ��� �̸����� ���α׷��� �����ϰ� ��� ����.");
        statusLabel.setFont(font);
        statusLabel.setForeground(Color.WHITE);
        statusLabel.setBounds(10, 550, 800, 90);
        //statusLabel.setSize(700, 60);
      
        Color c = new Color(255,255,255);
        
        btn = new JButton(new ImageIcon("img/enter.jpg"));
        btn.setBackground(Color.WHITE);
        //btn.setBorderPainted(false);
        btn.setBounds(185, 480, 236, 90);
        btn.setPreferredSize(new Dimension(236, 90));
        btn.addActionListener(this);
        ButtonGroup bg1 = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();
        
        checkBox = new JRadioButton("\uBBF8\uB9BC\uC5EC\uACE0");//�̸�����
        checkBox.setBackground(new Color(54,70,90));
        checkBox.setForeground(c);
        checkBox.setBounds(210, 400, 98, 30);
        background.add(checkBox);
        
        checkBox_1 = new JRadioButton("\uBBF8\uB9BC\uC815\uBCF4\uACE0");//�̸� ������
        checkBox_1.setBackground(new Color(54,70,90));
        checkBox_1.setForeground(c);
        checkBox_1.setBounds(310, 400, 131, 30);
        background.add(checkBox_1);
        
        checkBox_2 = new JRadioButton("\uD559\uC0DD");//�л�
        checkBox_2.setBackground(new Color(54,70,90));
        checkBox_2.setForeground(c);
        checkBox_2.setBounds(210, 430, 91, 30);
        background.add(checkBox_2);
        
        checkBox_3 = new JRadioButton("\uC120\uC0DD\uB2D8");//������
        checkBox_3.setBackground(new Color(54,70,90));
        checkBox_3.setForeground(c);
        checkBox_3.setBounds(310, 430, 131, 30);
        background.add(checkBox_3);
        bg1.add(checkBox);
		bg1.add(checkBox_1);
		bg2.add(checkBox_2);
		bg2.add(checkBox_3);
        background.add(label1);
        background.add(name);
        background.add(passwordLabel);
        background.add(hakbun);
        background.add(statusLabel);
        background.add(btn);	
    }
    
    public static void main(String[] args) {
    	Login frame = new Login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(660, 682);
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent a) {
		if(hakbun.getText()==null||name.getText()==null||(checkBox.isSelected()==false&&
         		checkBox_1.isSelected()==false)||(checkBox_2.isSelected()==false&&checkBox_3.isSelected()==false)){
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
		       java.sql.Statement st = null;
		       st = con.createStatement();
		       st.execute("use menu;"); // ����� DB�� �����Ѵ�.
		       // executeQuery : ������ �����ϰ� ����� ResultSet ��ü�� ��ȯ�Ѵ�.
		       result = st.executeQuery("select * from owner where cancel>=3");
		      // System.out.println(result.getString(1)+"����������������");
		       // ����� �ϳ��� ����Ѵ�.
		       while (result.next()){
		    	   if(a.getSource().equals(btn)){
		    		   System.out.println(result.getString(1));
		    		   System.out.println(hakbun.getText());
		    		   System.out.println(result.getString(2));
		    		   System.out.println(name.getText());
		    		  
		    		   if(result.getString(1).equals(hakbun.getText())&&result.getString(2).equals(name.getText())){
		    				try{
		    					JOptionPane.showMessageDialog(null, "��� Ƚ���� 3ȸ�� �Ѿ� ���α׷��� �̿����� ���մϴ�", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
		   						System.exit(1);  
		   						btn.setEnabled(true);
		   						Thread.sleep(300000);
		   						}catch(Exception e3){
		    		         		e3.getMessage();
		    		         	}
		    		   }
		    		   while(!(hakbun.getText()==null||name.getText()==null||(checkBox.isSelected()==false&&
		    	          		checkBox_1.isSelected()==false)||(checkBox_2.isSelected()==false&&checkBox_3.isSelected()==false)
		    	          		|| result.getString(1).equals(hakbun.getText())||result.getString(2).equals(name.getText()))){
		    					if(a.getSource().equals(btn)){
		    						
		    						try{
		    			                dispose();
		    							MenuFrameA menu = new MenuFrameA();
		    		   					menu.setVisible(true);
		    		   					break;
		    						}catch(Exception eee){
		    							eee.printStackTrace();
		    						};
		    						    }
		    	     				}
		    	   }
		       }
			   }catch(Exception e3){e3.printStackTrace();}
		
         try{
        	 Connection con = null;
                 String school = null;
                 String job = null;
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menu?useSSL=false", "root", "mirim");
                 java.sql.Statement st = null;
                 //ResultSet result = null;
                
                 st = con.createStatement();
                 st.execute("use menu;"); // ����� DB�� �����Ѵ�.
                 if(checkBox.isSelected())school=checkBox.getText();
                 if(checkBox_1.isSelected())school=checkBox_1.getText();
                 if(checkBox_2.isSelected())job=checkBox_2.getText();
                 if(checkBox_3.isSelected())job=checkBox_3.getText();
                 st.execute("insert into login values(null,'"  + hakbun.getText() + "', '" + name.getText() + "','" +school + "','" +job +"')");
              
         }catch(Exception eee){
        	 eee.printStackTrace();
         }
        
        
     
     
					
	   			
			}	
        
    }