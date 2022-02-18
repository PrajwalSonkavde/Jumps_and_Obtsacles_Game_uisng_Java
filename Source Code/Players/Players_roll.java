package Players;
import java.awt.*;

import Board.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
import main.*;


public class Players_roll implements ActionListener {
	public static JButton p=new JButton("1");
	public static JButton p1=new JButton("2");
	public static JButton p2=new JButton("3");
	public static JButton p3=new JButton("4");
	public static JLabel t=new JLabel("Select number of Players");
	public static JLabel t1=new JLabel();
	public static JLabel t2=new JLabel();
	public static ImageIcon dice= new ImageIcon();
	public static ImageIcon dice1= new ImageIcon();
	public static ImageIcon dice2= new ImageIcon();
	public static ImageIcon dice3= new ImageIcon();
	public static ImageIcon dice4= new ImageIcon();
	public static ImageIcon dice5= new ImageIcon();
	public static ImageIcon dice6= new ImageIcon();
	public static ImageIcon player1= new ImageIcon();
	public static ImageIcon player2= new ImageIcon();
	public static ImageIcon player3= new ImageIcon();
	public static ImageIcon player4= new ImageIcon();
	public static ImageIcon play2= new ImageIcon();
	public static ImageIcon play3= new ImageIcon();
	public static ImageIcon play4= new ImageIcon();
	public static ImageIcon _12_= new ImageIcon();
	public static ImageIcon _13_= new ImageIcon();
	public static ImageIcon _14_ = new ImageIcon();
	public static ImageIcon _23_ = new ImageIcon();
	public static ImageIcon _24_ = new ImageIcon();
	public static ImageIcon _34_ = new ImageIcon();
	public static ImageIcon _123_ = new ImageIcon();
	public static ImageIcon _124_ = new ImageIcon();
	public static ImageIcon _134_ = new ImageIcon();
	public static ImageIcon _324_ = new ImageIcon();
	public static ImageIcon _1234_ = new ImageIcon();

	
	public static int ply1pre=0;
	public static int ply1=0;
	public static int ply2pre=0;
	public static int ply2=0;
	public static int ply3pre=0;
	public static int ply3=0;
	public static int ply4pre=0;
	public static int ply4=0;
	
	public static JButton br=new JButton();
	public static Random rn = new Random();
	public static int check=0;
	public static int players=0;
	public static int pp=1;
	public static int pppre=1;
	
	public static int a[][]=new int[10][10];
	public static JButton btemp[][] ;
	public static Board board_object=new Board();
	

	 public void getplayers(JFrame jfrm,GridBagConstraints gbc,JButton b[][])
	{
		this.btemp= b;
		gbc.gridx=10;
		gbc.gridy=0;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		t.setForeground(Color.orange);
		jfrm.add(t,gbc);
		

		gbc.gridx=10;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p.setBackground(Color.BLUE);
		p.setActionCommand("1");
		p.addActionListener(this);
		jfrm.add(p,gbc);
		
		
		gbc.gridx=11;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p1.setBackground(Color.BLUE);
		p1.setActionCommand("2");
		p1.addActionListener(this);
		jfrm.add(p1,gbc);
		

		gbc.gridx=10;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p2.setActionCommand("3");
		p2.setBackground(Color.BLUE);
		p2.addActionListener(this);
		jfrm.add(p2,gbc);
		

		gbc.gridx=11;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		p3.setActionCommand("4");
		p3.setBackground(Color.BLUE);
		p3.addActionListener(this);
		jfrm.add(p3,gbc);
		
		gbc.gridx=10;
		gbc.gridy=3;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		t1.setForeground(Color.yellow);
		jfrm.add(t1,gbc);
		
		gbc.gridx=10;
		gbc.gridy=4;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		t2.setForeground(Color.yellow);
		t2.setText("Roll the Die Player No : ");
		jfrm.add(t2,gbc);
		
		dice= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\dice.gif");
		dice =new ImageIcon(dice.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
		
		play2= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\2players.png");
		play2 =new ImageIcon(play2.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
			
		play3= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\3players.png");
		play3 =new ImageIcon(play3.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
			
		play4= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\4players.png");
		play4 =new ImageIcon(play4.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_12_ = new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\1_2.png");
		_12_ =new ImageIcon(_12_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_13_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\1_3.png");
		_13_ =new ImageIcon(_13_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_14_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\1_4.png");
		_14_ =new ImageIcon(_14_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_23_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\2_3.png");
		_23_ =new ImageIcon(_23_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_24_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\2_4.png");
		_24_ =new ImageIcon(_24_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_34_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\3_4.png");
		_34_ =new ImageIcon(_34_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_123_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\1_2_3.png");
		_123_ =new ImageIcon(_123_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_124_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\1_2_4.png");
		_124_ =new ImageIcon(_124_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_134_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\1_3_4.png");
		_134_ =new ImageIcon(_134_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_324_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\3_2_4.png");
		_324_ =new ImageIcon(_324_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		_1234_= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\4players.png");
		_1234_ =new ImageIcon(_1234_.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
		
		player1= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\player1.png");
		player1 =new ImageIcon(player1.getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT));
		player2= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\player2.png");
		player2 =new ImageIcon(player2.getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT));
		player3 =new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\player3.png");
		player3 =new ImageIcon(player3.getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT));
		player4 =new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\player4.png");
		player4 =new ImageIcon(player4.getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT));
		
		
		br=new JButton("ROLL THE DIE");
		gbc.gridx=10;
		gbc.gridy=5;
		gbc.gridwidth=3;
		gbc.gridheight=3;
		br.setActionCommand("dierolled");
		br.addActionListener(this);
		br.setBackground(Color.white);
		br.setIcon(dice);
		jfrm.add(br,gbc);
		
		
		jfrm.setVisible(true);
	}
	public void setnumberstotemp()
	{
		int l=100;
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<10;j++)
				{
					l--;
					a[i][j]=l;
				}
			}
			else 
			{
				for(int j=9;j>=0;j--)
				{
					l--;
					a[i][j]=l;
					
				}
			}
			
		}
	}
	public static void obsta_check(int c)
	{
		if(c==1)
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					if(a[i][j]==ply1)
					{
						if(i==4&&j==5)		
						{
							ply1=ply1-25;
							obsta_check(1);
						}
						else if(i==9&&j==8)
						{
							ply1=ply1-6;
							obsta_check(1);
						}
						else if(i==8&&j==0)
						{
							ply1=ply1-3;
							obsta_check(1);
						}
						else if(i==0&&j==7)
						{
							ply1=ply1-5;
							obsta_check(1);
						}
						else if(i==3&&j==9)
						{
							ply1=ply1-7;
							obsta_check(1);
						}
						else if(i==2&&j==8)
						{
							ply1=ply1-22;
							obsta_check(1);
						}
						else if(i==7&&j==8)
						{
							ply1=ply1-12;
							obsta_check(1);
						}
						else if(i==7&&j==4)
						{
							ply1=ply1-10;
							obsta_check(1);
						}
						else if(i==2&&j==5)
						{
							ply1=ply1-5;
							obsta_check(1);
						}
						else if(i==3&&j==1)
						{
							ply1=ply1-20;
							obsta_check(1);
						}
						else if(i==6&&j==1)
						{
							ply1=ply1-15;
							obsta_check(1);
						}
						else if(i==1&&j==3)
						{
							ply1=ply1-30;
							obsta_check(1);
						}
						else if(i==3&&j==2)
						{
							ply1=ply1+13;
							obsta_check(1);
						}
						else if(i==5&&j==6)
						{
							ply1=ply1+29;
							obsta_check(1);
						}
						else if(i==9&&j==6)
						{
							ply1=ply1+17;
							obsta_check(1);
						}
						else if(i==8&&j==6)
						{
							ply1=ply1+13;
							obsta_check(1);
						}
						else if(i==1&&j==7)
						{
							ply1=ply1+7;
							obsta_check(1);
						}
						else if(i==2&&j==2)
						{
							ply1=ply1+15;
							obsta_check(1);
						}
						else if(i==5&&j==3)
						{
							ply1=ply1+21;
							obsta_check(1);
						}
						else 
						{
							if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
							{
								if(ply1==ply2)
								{
									btemp[i][j].setIcon(_12_);
								}
								if(ply1==ply3)
								{
									btemp[i][j].setIcon(_13_);
								}
								if(ply1==ply4)
								{
									btemp[i][j].setIcon(_14_);
								}
								
								if((ply1==ply2)&&(ply2==ply3))
								{
									btemp[i][j].setIcon(_123_);
								}
								if((ply1==ply2)&&(ply2==ply4))
								{
									btemp[i][j].setIcon(_124_);
								}
								if((ply1==ply3)&&(ply3==ply4))
								{
									btemp[i][j].setIcon(_134_);
								}
								
								if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
								{
									btemp[i][j].setIcon(_1234_);
								}
							}
							else
							{
								btemp[i][j].setIcon(player1);
							}
						}
					}
				}
			}
			ply1pre=ply1;
		}
		else if(c==2)
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					if(a[i][j]==ply2)
					{
						if(i==4&&j==5)		
						{
							ply2=ply2-25;
							obsta_check(2);
						}
						else if(i==9&&j==8)
						{
							ply2=ply2-6;
							obsta_check(2);
						}
						else if(i==8&&j==0)
						{
							ply2=ply2-3;
							obsta_check(2);
						}
						else if(i==0&&j==7)
						{
							ply2=ply2-5;
							obsta_check(2);
						}
						else if(i==3&&j==9)
						{
							ply2=ply2-7;
							obsta_check(2);
						}
						else if(i==2&&j==8)
						{
							ply2=ply2-22;
							obsta_check(2);
						}
						else if(i==7&&j==8)
						{
							ply2=ply2-12;
							obsta_check(2);
						}
						else if(i==7&&j==4)
						{
							ply2=ply2-10;
							obsta_check(2);
						}
						else if(i==2&&j==5)
						{
							ply2=ply2-5;
							obsta_check(2);
						}
						else if(i==3&&j==1)
						{
							ply2=ply2-20;
							obsta_check(2);
						}
						else if(i==6&&j==1)
						{
							ply2=ply2-15;
							obsta_check(2);
						}
						else if(i==1&&j==3)
						{
							ply2=ply2-30;
							obsta_check(2);
						}
						else if(i==3&&j==2)
						{
							ply2=ply2+13;
							obsta_check(2);
						}
						else if(i==5&&j==6)
						{
							ply2=ply2+29;
							obsta_check(2);
						}
						else if(i==9&&j==6)
						{
							ply2=ply2+17;
							obsta_check(2);
						}
						else if(i==8&&j==6)
						{
							ply2=ply2+13;
							obsta_check(2);
						}
						else if(i==1&&j==7)
						{
							ply2=ply2+7;
							obsta_check(2);
						}
						else if(i==2&&j==2)
						{
							ply2=ply2+15;
							obsta_check(2);
						}
						else if(i==5&&j==3)
						{
							ply2=ply2+21;
							obsta_check(2);
						}
						else 
						{
							if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
							{
								if(ply1==ply2)
								{
									btemp[i][j].setIcon(_12_);
								}
								if(ply2==ply3)
								{
									btemp[i][j].setIcon(_23_);
								}
								if(ply2==ply4)
								{
									btemp[i][j].setIcon(_24_);
								}
								
								if((ply1==ply2)&&(ply2==ply3))
								{
									btemp[i][j].setIcon(_123_);
								}
								if((ply1==ply2)&&(ply2==ply4))
								{
									btemp[i][j].setIcon(_124_);
								}
								
								if((ply3==ply2)&&(ply2==ply4))
								{
									btemp[i][j].setIcon(_324_);
								}
								if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
								{
									btemp[i][j].setIcon(_1234_);
								}
							}
							else
							{
								btemp[i][j].setIcon(player2);	
							}
						}
							
				
					}
				}
			}
			ply2pre=ply2;

		}
		else if(c==3)
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					if(a[i][j]==ply3)
					{
						if(i==4&&j==5)		
						{
							ply3=ply3-25;
							obsta_check(3);
						}
						else if(i==9&&j==8)
						{
							ply3=ply3-6;
							obsta_check(3);
						}
						else if(i==8&&j==0)
						{
							ply3=ply3-3;
							obsta_check(3);
						}
						else if(i==0&&j==7)
						{
							ply3=ply3-5;
							obsta_check(3);
						}
						else if(i==3&&j==9)
						{
							ply3=ply3-7;
							obsta_check(3);
						}
						else if(i==2&&j==8)
						{
							ply3=ply3-22;
							obsta_check(3);
						}
						else if(i==7&&j==8)
						{
							ply3=ply3-12;
							obsta_check(3);
						}
						else if(i==7&&j==4)
						{
							ply3=ply3-10;
							obsta_check(3);
						}
						else if(i==2&&j==5)
						{
							ply3=ply3-5;
							obsta_check(3);
						}
						else if(i==3&&j==1)
						{
							ply3=ply3-20;
							obsta_check(3);
						}
						else if(i==6&&j==1)
						{
							ply3=ply3-15;
							obsta_check(3);
						}
						else if(i==1&&j==3)
						{
							ply3=ply3-30;
							obsta_check(3);
						}
						else if(i==3&&j==2)
						{
							ply3=ply3+13;
							obsta_check(3);
						}
						else if(i==5&&j==6)
						{
							ply3=ply3+29;
							obsta_check(3);
						}
						else if(i==9&&j==6)
						{
							ply3=ply3+17;
							obsta_check(3);
						}
						else if(i==8&&j==6)
						{
							ply3=ply3+13;
							obsta_check(3);
						}
						else if(i==1&&j==7)
						{
							ply3=ply3+7;
							obsta_check(3);
						}
						else if(i==2&&j==2)
						{
							ply3=ply3+15;
							obsta_check(3);
						}
						else if(i==5&&j==3)
						{
							ply3=ply3+21;
							obsta_check(3);
						}
						else
						{
							if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
							{
								
								if(ply1==ply3)
								{
									btemp[i][j].setIcon(_13_);
								}
								
								if(ply2==ply3)
								{
									btemp[i][j].setIcon(_23_);
								}
								
								if(ply3==ply4)
								{
									btemp[i][j].setIcon(_34_);
								}
								if((ply1==ply2)&&(ply2==ply3))
								{
									btemp[i][j].setIcon(_123_);
								}
								
								if((ply1==ply3)&&(ply3==ply4))
								{
									btemp[i][j].setIcon(_134_);
								}
								if((ply3==ply2)&&(ply2==ply4))
								{
									btemp[i][j].setIcon(_324_);
								}
								if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
								{
									btemp[i][j].setIcon(_1234_);
								}
							}
							else
							{
								btemp[i][j].setIcon(player3);
							}
						}
					}
				}
			}
			ply3pre=ply3;
		}
		else if(c==4)
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					if(a[i][j]==ply4)
					{
						if(i==4&&j==5)		
						{
							ply4=ply4-25;
							obsta_check(4);
						}
						else if(i==9&&j==8)
						{
							ply4=ply4-6;
							obsta_check(4);
						}
						else if(i==8&&j==0)
						{
							ply4=ply4-3;
							obsta_check(4);
						}
						else if(i==0&&j==7)
						{
							ply4=ply4-5;
							obsta_check(4);
						}
						else if(i==3&&j==9)
						{
							ply4=ply4-7;
							obsta_check(4);
						}
						else if(i==2&&j==8)
						{
							ply4=ply4-22;
							obsta_check(4);
						}
						else if(i==7&&j==8)
						{
							ply4=ply4-12;
							obsta_check(4);
						}
						else if(i==7&&j==4)
						{
							ply4=ply4-10;
							obsta_check(4);
						}
						else if(i==2&&j==5)
						{
							ply4=ply4-5;
							obsta_check(4);
						}
						else if(i==3&&j==1)
						{
							ply4=ply4-20;
							obsta_check(4);
						}
						else if(i==6&&j==1)
						{
							ply4=ply4-15;
							obsta_check(4);
						}
						else if(i==1&&j==3)
						{
							ply4=ply4-30;
							obsta_check(4);
						}
						else if(i==3&&j==2)
						{
							ply4=ply4+13;
							obsta_check(4);
						}
						else if(i==5&&j==6)
						{
							ply4=ply4+29;
							obsta_check(4);
						}
						else if(i==9&&j==6)
						{
							ply4=ply4+17;
							obsta_check(4);
						}
						else if(i==8&&j==6)
						{
							ply4=ply4+13;
							obsta_check(4);
						}
						else if(i==1&&j==7)
						{
							ply4=ply4+7;
							obsta_check(4);
						}
						else if(i==2&&j==2)
						{
							ply4=ply4+15;
							obsta_check(4);
						}
						else if(i==5&&j==3)
						{
							ply4=ply4+21;
							obsta_check(4);
						}
						else 
						{					
							if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
							{
						
								if(ply1==ply4)
								{
									btemp[i][j].setIcon(_14_);
								}
								
								if(ply2==ply4)
								{
									btemp[i][j].setIcon(_24_);
								}
								if(ply3==ply4)
								{
									btemp[i][j].setIcon(_34_);
								}
								
								if((ply1==ply2)&&(ply2==ply4))
								{
									btemp[i][j].setIcon(_124_);
								}
								if((ply1==ply3)&&(ply3==ply4))
								{
									btemp[i][j].setIcon(_134_);
								}
								if((ply3==ply2)&&(ply2==ply4))
								{
									btemp[i][j].setIcon(_324_);
								}
								if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
								{
									btemp[i][j].setIcon(_1234_);
								}
							}
							else
							{
								btemp[i][j].setIcon(player4);
							}
						}
					}
				}
			}
			ply4pre=ply4;
		}
		else
		{
			System.exit(0);
		}
	}
	 public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("1"))
		{
			System.exit(0);
		}
		
			
		 if(ae.getActionCommand().equals("3"))
		{
			 t1.setText("Total Players : 3");
			 players=3;
			 t2.setText("Roll the Die Player No : "+pp);
			// pp++;
		 	 p.setEnabled(false);
		 	p1.setEnabled(false);
			p2.setEnabled(false);
		    p3.setEnabled(false);
		    btemp[9][0].setIcon(play3);
		    
		}
		 if(ae.getActionCommand().equals("2"))
		 {
			 t1.setText("Total Players : 2");
			 players=2;
			 t2.setText("Roll the Die Player No : "+pp);
			 pp++;
			 p.setEnabled(false);
			 p1.setEnabled(false);
				p2.setEnabled(false);
				p3.setEnabled(false);
				btemp[9][0].setIcon(play2);
		 }
		
		if(ae.getActionCommand().equals("4"))
		{
			btemp[3][3].setIcon(dice1);
			t1.setText("Total Players : 4");
			players=4;
			
			t2.setText("Roll the Die Player No : 1");
			p.setEnabled(false);
			p1.setEnabled(false);
			p2.setEnabled(false);
			p3.setEnabled(false);
			btemp[9][0].setIcon(play4);
			

		}
		if(ae.getActionCommand().equals("dierolled"))
		{
			
			if(players==2)
			{
				
				if(pp==2)
				{
					 t2.setText("Roll the Die Player No : "+pp);
					pp=1;
				}
				else
				{
					 t2.setText("Roll the Die Player No : "+pp);
					++pp;
				}
			}
			else if(players==3)
			{
				if((pp==1)&&(pppre==1))
				{
					++pppre;
					 t2.setText("Roll the Die Player No : 2");
				}
				else if(pp==1)
				{
					++pp;
					++pppre;
					 t2.setText("Roll the Die Player No : 3");
				}
				else if(pp==2)
				{
					++pp;
					pppre=1;
					t2.setText("Roll the Die Player No : 1");
				}
				else 
				{
					pp=1;
					++pppre;
					t2.setText("Roll the Die Player No : 2");
				}
			}
			else
			{
				if(pp==1&&pppre==1)
				{
					++pppre;
					t2.setText("Roll the Die Player No : 2");
				}
				else if(pp==1)
				{
					++pp;
					t2.setText("Roll the Die Player No : 3");
				}
				else if(pp==2)
				{
					++pp;
					t2.setText("Roll the Die Player No : 4");
				}
				else if(pp==3)
				{
					++pp;
					t2.setText("Roll the Die Player No : 1");
				}
				else 
				{
					pp=1;
					t2.setText("Roll the Die Player No : 2");
				}
				
			}
			check= rn.nextInt(6)+1;
			if(players==0)
			{
				board_object.win(0);
			}
			if(check==1)
			{
				
				dice1= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\dice1.png");
				dice1 =new ImageIcon(dice1.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
				br.setIcon(dice1);
				if(pp==1)
				{
					for(int i=0;i<10;i++)
					{ 
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply1pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
			
					ply1=ply1+check;
					if(ply1>=99)
					{
						if(ply1==99)
						{
							ply1=0;
							board_object.win(1);
						}
						else
						{
							ply1=ply1-check;
						}
					}
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply1)
							{
								if(i==4&&j==5)		
								{
									ply1=ply1-25;
									obsta_check(1);
								}
								else if(i==9&&j==8)
								{
									ply1=ply1-6;
									obsta_check(1);
								}
								else if(i==8&&j==0)
								{
									ply1=ply1-3;
									obsta_check(1);
								}
								else if(i==0&&j==7)
								{
									ply1=ply1-5;
									obsta_check(1);
								}
								else if(i==3&&j==9)
								{
									ply1=ply1-7;
									obsta_check(1);
								}
								else if(i==2&&j==8)
								{
									ply1=ply1-22;
									obsta_check(1);
								}
								else if(i==7&&j==8)
								{
									ply1=ply1-12;
									obsta_check(1);
								}
								else if(i==7&&j==4)
								{
									ply1=ply1-10;
									obsta_check(1);
								}
								else if(i==2&&j==5)
								{
									ply1=ply1-5;
									obsta_check(1);
								}
								else if(i==3&&j==1)
								{
									ply1=ply1-20;
									obsta_check(1);
								}
								else if(i==6&&j==1)
								{
									ply1=ply1-15;
									obsta_check(1);
								}
								else if(i==1&&j==3)
								{
									ply1=ply1-30;
									obsta_check(1);
								}
								else if(i==3&&j==2)
								{
									ply1=ply1+13;
									obsta_check(1);
								}
								else if(i==5&&j==6)
								{
									ply1=ply1+29;
									obsta_check(1);
								}
								else if(i==9&&j==6)
								{
									ply1=ply1+17;
									obsta_check(1);
								}
								else if(i==8&&j==6)
								{
									ply1=ply1+13;
									obsta_check(1);
								}
								else if(i==1&&j==7)
								{
									ply1=ply1+7;
									obsta_check(1);
								}
								else if(i==2&&j==2)
								{
									ply1=ply1+15;
									obsta_check(1);
								}
								else if(i==5&&j==3)
								{
									ply1=ply1+21;
									obsta_check(1);
								}
								else 
								{
									if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(_12_);
										}
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(_13_);
										}
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_123_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
										
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_1234_);
										}
									}
									else
									{
										btemp[i][j].setIcon(player1);
									}
								}
							}
						}
					}
					ply1pre=ply1;
				}
				if(pp==2)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply2pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					
					ply2=ply2+check;
					if(ply2>=99)
					{
						if(ply2==99)
						{
							ply2=0;
							board_object.win(2);
						}
						else
						{
							ply2=ply2-check;
						}
					}
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply2)
							{
								if(i==4&&j==5)		
								{
									ply2=ply2-25;
									obsta_check(2);
								}								
								else if(i==9&&j==8)
								{
									ply2=ply2-6;
									obsta_check(2);
								}
								else if(i==8&&j==0)
								{
									ply2=ply2-3;
									obsta_check(2);
								}
								else if(i==0&&j==7)
								{
									ply2=ply2-5;
									obsta_check(2);
								}
								else if(i==3&&j==9)
								{
									ply2=ply2-7;
									obsta_check(2);
								}
								else if(i==2&&j==8)
								{
									ply2=ply2-22;
									obsta_check(2);
								}
								else if(i==7&&j==8)
								{
									ply2=ply2-12;
									obsta_check(2);
								}
								else if(i==7&&j==4)
								{
									ply2=ply2-10;
									obsta_check(2);
								}
								else if(i==2&&j==5)
								{
									ply2=ply2-5;
									obsta_check(2);
								}
								else if(i==3&&j==1)
								{
									ply2=ply2-20;
									obsta_check(2);
								}
								else if(i==6&&j==1)
								{
									ply2=ply2-15;
									obsta_check(2);
								}
								else if(i==1&&j==3)
								{
									ply2=ply2-30;
									obsta_check(2);
								}
								else if(i==3&&j==2)
								{
									ply2=ply2+13;
									obsta_check(2);
								}
								else if(i==5&&j==6)
								{
									ply2=ply2+29;
									obsta_check(2);
								}
								else if(i==9&&j==6)
								{
									ply2=ply2+17;
									obsta_check(2);
								}
								else if(i==8&&j==6)
								{
									ply2=ply2+13;
									obsta_check(2);
								}
								else if(i==1&&j==7)
								{
									ply2=ply2+7;
									obsta_check(2);
								}
								else if(i==2&&j==2)
								{
									ply2=ply2+15;
									obsta_check(2);
								}
								else if(i==5&&j==3)
								{
									ply2=ply2+21;
									obsta_check(2);
								}
								else 
								{
									if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(_12_);
										}
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(_23_);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(_24_);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_123_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
										
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_1234_);
										}
									}
									else
									{
										btemp[i][j].setIcon(player2);	
									}
								}
									
						
							}
						}
					}
					ply2pre=ply2;
				}
				if(pp==3)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply3pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player1);
										}
										
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player2);
										}
										
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_12_);
										}
										
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply3=ply3+check;
					if(ply3>=99)
					{
						if(ply3==99)
						{
							ply3=0;
							board_object.win(3);
						}
						else
						{
							ply3=ply3-check;
						}
					}
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply3)
							{
								if(i==4&&j==5)		
								{
									ply3=ply3-25;
									obsta_check(3);
								}
								else if(i==9&&j==8)
								{
									ply3=ply3-6;
									obsta_check(3);
								}
								else if(i==8&&j==0)
								{
									ply3=ply3-3;
									obsta_check(3);
								}
								else if(i==0&&j==7)
								{
									ply3=ply3-5;
									obsta_check(3);
								}
								else if(i==3&&j==9)
								{
									ply3=ply3-7;
									obsta_check(3);
								}
								else if(i==2&&j==8)
								{
									ply3=ply3-22;
									obsta_check(3);
								}
								else if(i==7&&j==8)
								{
									ply3=ply3-12;
									obsta_check(3);
								}
								else if(i==7&&j==4)
								{
									ply3=ply3-10;
									obsta_check(3);
								}
								else if(i==2&&j==5)
								{
									ply3=ply3-5;
									obsta_check(3);
								}
								else if(i==3&&j==1)
								{
									ply3=ply3-20;
									obsta_check(3);
								}
								else if(i==6&&j==1)
								{
									ply3=ply3-15;
									obsta_check(3);
								}
								else if(i==1&&j==3)
								{
									ply3=ply3-30;
									obsta_check(3);
								}
								else if(i==3&&j==2)
								{
									ply3=ply3+13;
									obsta_check(3);
								}
								else if(i==5&&j==6)
								{
									ply3=ply3+29;
									obsta_check(3);
								}
								else if(i==9&&j==6)
								{
									ply3=ply3+17;
									obsta_check(3);
								}
								else if(i==8&&j==6)
								{
									ply3=ply3+13;
									obsta_check(3);
								}
								else if(i==1&&j==7)
								{
									ply3=ply3+7;
									obsta_check(3);
								}
								else if(i==2&&j==2)
								{
									ply3=ply3+15;
									obsta_check(3);
								}
								else if(i==5&&j==3)
								{
									ply3=ply3+21;
									obsta_check(3);
								}
								else
								{
									if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(_13_);
										}
										
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(_23_);
										}
										
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(_34_);
										}
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_123_);
										}
										
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_1234_);
										}
									}
									else
									{
										btemp[i][j].setIcon(player3);
									}
								}
							}
						}
					}
					ply3pre=ply3;
				}
				if(pp==4)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply4pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
									{
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player3);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_12_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_123_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply4=ply4+check;
					if(ply4>=99)
					{
						if(ply4==99)
						{
							ply4=0;
							board_object.win(4);
						}
						else
						{
							ply4=ply4-check;
						}
					}
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply4)
							{
								if(i==4&&j==5)		
								{
									ply4=ply4-25;
									obsta_check(4);
								}
								else if(i==9&&j==8)
								{
									ply4=ply4-6;
									obsta_check(4);
								}
								else if(i==8&&j==0)
								{
									ply4=ply4-3;
									obsta_check(4);
								}
								else if(i==0&&j==7)
								{
									ply4=ply4-5;
									obsta_check(4);
								}
								else if(i==3&&j==9)
								{
									ply4=ply4-7;
									obsta_check(4);
								}
								else if(i==2&&j==8)
								{
									ply4=ply4-22;
									obsta_check(4);
								}
								else if(i==7&&j==8)
								{
									ply4=ply4-12;
									obsta_check(4);
								}
								else if(i==7&&j==4)
								{
									ply4=ply4-10;
									obsta_check(4);
								}
								else if(i==2&&j==5)
								{
									ply4=ply4-5;
									obsta_check(4);
								}
								else if(i==3&&j==1)
								{
									ply4=ply4-20;
									obsta_check(4);
								}
								else if(i==6&&j==1)
								{
									ply4=ply4-15;
									obsta_check(4);
								}
								else if(i==1&&j==3)
								{
									ply4=ply4-30;
									obsta_check(4);
								}
								else if(i==3&&j==2)
								{
									ply4=ply4+13;
									obsta_check(4);
								}
								else if(i==5&&j==6)
								{
									ply4=ply4+29;
									obsta_check(4);
								}
								else if(i==9&&j==6)
								{
									ply4=ply4+17;
									obsta_check(4);
								}
								else if(i==8&&j==6)
								{
									ply4=ply4+13;
									obsta_check(4);
								}
								else if(i==1&&j==7)
								{
									ply4=ply4+7;
									obsta_check(4);
								}
								else if(i==2&&j==2)
								{
									ply4=ply4+15;
									obsta_check(4);
								}
								else if(i==5&&j==3)
								{
									ply4=ply4+21;
									obsta_check(4);
								}
								else 
								{					
									if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
									{
								
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(_24_);
										}
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(_34_);
										}
										
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_1234_);
										}
									}
									else
									{
										btemp[i][j].setIcon(player4);
									}
								}
							}
						}
					}
					ply4pre=ply4;
				}
			}
			if(check==2)
			{
				dice2= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\dice2.png");
				dice2 =new ImageIcon(dice2.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
				br.setIcon(dice2);
				if(pp==1)
				{
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply1pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply1=ply1+check;
					if(ply1>=99)
					{
						if(ply1==99)
						{
							ply1=0;
							board_object.win(1);
						}
						else
						{
							ply1=ply1-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply1)
								{
									if(i==4&&j==5)		
									{
										ply1=ply1-25;
										obsta_check(1);
									}
									else if(i==9&&j==8)
									{
										ply1=ply1-6;
										obsta_check(1);
									}
									else if(i==8&&j==0)
									{
										ply1=ply1-3;
										obsta_check(1);
									}
									else if(i==0&&j==7)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==9)
									{
										ply1=ply1-7;
										obsta_check(1);
									}
									else if(i==2&&j==8)
									{
										ply1=ply1-22;
										obsta_check(1);
									}
									else if(i==7&&j==8)
									{
										ply1=ply1-12;
										obsta_check(1);
									}
									else if(i==7&&j==4)
									{
										ply1=ply1-10;
										obsta_check(1);
									}
									else if(i==2&&j==5)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==1)
									{
										ply1=ply1-20;
										obsta_check(1);
									}
									else if(i==6&&j==1)
									{
										ply1=ply1-15;
										obsta_check(1);
									}
									else if(i==1&&j==3)
									{
										ply1=ply1-30;
										obsta_check(1);
									}
									else if(i==3&&j==2)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==5&&j==6)
									{
										ply1=ply1+29;
										obsta_check(1);
									}
									else if(i==9&&j==6)
									{
										ply1=ply1+17;
										obsta_check(1);
									}
									else if(i==8&&j==6)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==1&&j==7)
									{
										ply1=ply1+7;
										obsta_check(1);
									}
									else if(i==2&&j==2)
									{
										ply1=ply1+15;
										obsta_check(1);
									}
									else if(i==5&&j==3)
									{
										ply1=ply1+21;
										obsta_check(1);
									}

									else
									{
										if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player1);
										}
											

									}
							}
						}
					}
					ply1pre=ply1;
				}
				if(pp==2)
				{
					
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply2pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
								
								}
								else
								{
									if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply2=ply2+check;
					if(ply2>=99)
					{
						if(ply2==99)
						{
							ply2=0;
							board_object.win(2);
						}
						else
						{
							ply2=ply2-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply2)
								{
									if(i==4&&j==5)		
									{
										ply2=ply2-25;
										obsta_check(2);
									}								
									else if(i==9&&j==8)
									{
										ply2=ply2-6;
										obsta_check(2);
									}
									else if(i==8&&j==0)
									{
										ply2=ply2-3;
										obsta_check(2);
									}
									else if(i==0&&j==7)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==9)
									{
										ply2=ply2-7;
										obsta_check(2);
									}
									else if(i==2&&j==8)
									{
										ply2=ply2-22;
										obsta_check(2);
									}
									else if(i==7&&j==8)
									{
										ply2=ply2-12;
										obsta_check(2);
									}
									else if(i==7&&j==4)
									{
										ply2=ply2-10;
										obsta_check(2);
									}
									else if(i==2&&j==5)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==1)
									{
										ply2=ply2-20;
										obsta_check(2);
									}
									else if(i==6&&j==1)
									{
										ply2=ply2-15;
										obsta_check(2);
									}
									else if(i==1&&j==3)
									{
										ply2=ply2-30;
										obsta_check(2);
									}
									else if(i==3&&j==2)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==5&&j==6)
									{
										ply2=ply2+29;
										obsta_check(2);
									}
									else if(i==9&&j==6)
									{
										ply2=ply2+17;
										obsta_check(2);
									}
									else if(i==8&&j==6)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==1&&j==7)
									{
										ply2=ply2+7;
										obsta_check(2);
									}
									else if(i==2&&j==2)
									{
										ply2=ply2+15;
										obsta_check(2);
									}
									else if(i==5&&j==3)
									{
										ply2=ply2+21;
										obsta_check(2);
									}
									else 
									{
										if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player2);	
										}
									}
							
								}
							}
						}
					ply2pre=ply2;
				}
				if(pp==3)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply3pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player1);
										}
										
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player2);
										}
										
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_12_);
										}
										
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply3=ply3+check;
					if(ply3>=99)
					{
						if(ply3==99)
						{
							ply3=0;
							board_object.win(3);
						}
						else
						{
							ply3=ply3-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply3)
								{
									if(i==4&&j==5)		
									{
										ply3=ply3-25;
										obsta_check(3);
									}
									else if(i==9&&j==8)
									{
										ply3=ply3-6;
										obsta_check(3);
									}
									else if(i==8&&j==0)
									{
										ply3=ply3-3;
										obsta_check(3);
									}
									else if(i==0&&j==7)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==9)
									{
										ply3=ply3-7;
										obsta_check(3);
									}
									else if(i==2&&j==8)
									{
										ply3=ply3-22;
										obsta_check(3);
									}
									else if(i==7&&j==8)
									{
										ply3=ply3-12;
										obsta_check(3);
									}
									else if(i==7&&j==4)
									{
										ply3=ply3-10;
										obsta_check(3);
									}
									else if(i==2&&j==5)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==1)
									{
										ply3=ply3-20;
										obsta_check(3);
									}
									else if(i==6&&j==1)
									{
										ply3=ply3-15;
										obsta_check(3);
									}
									else if(i==1&&j==3)
									{
										ply3=ply3-30;
										obsta_check(3);
									}
									else if(i==3&&j==2)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==5&&j==6)
									{
										ply3=ply3+29;
										obsta_check(3);
									}
									else if(i==9&&j==6)
									{
										ply3=ply3+17;
										obsta_check(3);
									}
									else if(i==8&&j==6)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==1&&j==7)
									{
										ply3=ply3+7;
										obsta_check(3);
									}
									else if(i==2&&j==2)
									{
										ply3=ply3+15;
										obsta_check(3);
									}
									else if(i==5&&j==3)
									{
										ply3=ply3+21;
										obsta_check(3);
									}
									else
									{
										if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player3);
										}
									}
								}
							}
						}
					ply3pre=ply3;
				}
				
				if(pp==4)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply4pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
							
								else
								{
									if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
									{
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player3);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_12_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_123_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply4=ply4+check;
					if(ply4>=99)
					{
						if(ply4==99)
						{
							ply4=0;
							board_object.win(4);
						}
						else
						{
							ply4=ply4-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply4)
								{
									if(i==4&&j==5)		
									{
										ply4=ply4-25;
										obsta_check(4);
									}
									else if(i==9&&j==8)
									{
										ply4=ply4-6;
										obsta_check(4);
									}
									else if(i==8&&j==0)
									{
										ply4=ply4-3;
										obsta_check(4);
									}
									else if(i==0&&j==7)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==9)
									{
										ply4=ply4-7;
										obsta_check(4);
									}
									else if(i==2&&j==8)
									{
										ply4=ply4-22;
										obsta_check(4);
									}
									else if(i==7&&j==8)
									{
										ply4=ply4-12;
										obsta_check(4);
									}
									else if(i==7&&j==4)
									{
										ply4=ply4-10;
										obsta_check(4);
									}
									else if(i==2&&j==5)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==1)
									{
										ply4=ply4-20;
										obsta_check(4);
									}
									else if(i==6&&j==1)
									{
										ply4=ply4-15;
										obsta_check(4);
									}
									else if(i==1&&j==3)
									{
										ply4=ply4-30;
										obsta_check(4);
									}
									else if(i==3&&j==2)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==5&&j==6)
									{
										ply4=ply4+29;
										obsta_check(4);
									}
									else if(i==9&&j==6)
									{
										ply4=ply4+17;
										obsta_check(4);
									}
									else if(i==8&&j==6)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==1&&j==7)
									{
										ply4=ply4+7;
										obsta_check(4);
									}
									else if(i==2&&j==2)
									{
										ply4=ply4+15;
										obsta_check(4);
									}
									else if(i==5&&j==3)
									{
										ply4=ply4+21;
										obsta_check(4);
									}

									else 
									{	
										if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
										{
									
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player4);
										}
									}
								}
							}
						}
					ply4pre=ply4;
				}
			}
			if(check==3)
			{
				dice3= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\dice3.png");
				dice3 =new ImageIcon(dice3.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
				br.setIcon(dice3);
				if(pp==1)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply1pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply1=ply1+check;
					if(ply1>=99)
					{
						if(ply1==99)
						{
							ply1=0;
							board_object.win(1);
						}
						else
						{
							ply1=ply1-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply1)
								{
									if(i==4&&j==5)		
									{
										ply1=ply1-25;
										obsta_check(1);
									}
									else if(i==9&&j==8)
									{
										ply1=ply1-6;
										obsta_check(1);
									}
									else if(i==8&&j==0)
									{
										ply1=ply1-3;
										obsta_check(1);
									}
									else if(i==0&&j==7)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==9)
									{
										ply1=ply1-7;
										obsta_check(1);
									}
									else if(i==2&&j==8)
									{
										ply1=ply1-22;
										obsta_check(1);
									}
									else if(i==7&&j==8)
									{
										ply1=ply1-12;
										obsta_check(1);
									}
									else if(i==7&&j==4)
									{
										ply1=ply1-10;
										obsta_check(1);
									}
									else if(i==2&&j==5)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==1)
									{
										ply1=ply1-20;
										obsta_check(1);
									}
									else if(i==6&&j==1)
									{
										ply1=ply1-15;
										obsta_check(1);
									}
									else if(i==1&&j==3)
									{
										ply1=ply1-30;
										obsta_check(1);
									}
									else if(i==3&&j==2)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==5&&j==6)
									{
										ply1=ply1+29;
										obsta_check(1);
									}
									else if(i==9&&j==6)
									{
										ply1=ply1+17;
										obsta_check(1);
									}
									else if(i==8&&j==6)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==1&&j==7)
									{
										ply1=ply1+7;
										obsta_check(1);
									}
									else if(i==2&&j==2)
									{
										ply1=ply1+15;
										obsta_check(1);
									}
									else if(i==5&&j==3)
									{
										ply1=ply1+21;
										obsta_check(1);
									}

									else 
									{
										if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player1);
										}
									}
								}
							}
						}
					ply1pre=ply1;
				}
				if(pp==2)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply2pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply2=ply2+check;
					if(ply2>=99)
					{
						if(ply2==99)
						{
							ply2=0;
							board_object.win(2);
						}
						else
						{
							ply2=ply2-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply2)
								{
									if(i==4&&j==5)		
									{
										ply2=ply2-25;
										obsta_check(2);
									}
									else if(i==9&&j==8)
									{
										ply2=ply2-6;
										obsta_check(2);
									}
									else if(i==8&&j==0)
									{
										ply2=ply2-3;
										obsta_check(2);
									}
									else if(i==0&&j==7)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==9)
									{
										ply2=ply2-7;
										obsta_check(2);
									}
									else if(i==2&&j==8)
									{
										ply2=ply2-22;
										obsta_check(2);
									}
									else if(i==7&&j==8)
									{
										ply2=ply2-12;
										obsta_check(2);
									}
									else if(i==7&&j==4)
									{
										ply2=ply2-10;
										obsta_check(2);
									}
									else if(i==2&&j==5)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==1)
									{
										ply2=ply2-20;
										obsta_check(2);
									}
									else if(i==6&&j==1)
									{
										ply2=ply2-15;
										obsta_check(2);
									}
									else if(i==1&&j==3)
									{
										ply2=ply2-30;
										obsta_check(2);
									}
									else if(i==3&&j==2)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==5&&j==6)
									{
										ply2=ply2+29;
										obsta_check(2);
									}
									else if(i==9&&j==6)
									{
										ply2=ply2+17;
										obsta_check(2);
									}
									else if(i==8&&j==6)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==1&&j==7)
									{
										ply2=ply2+7;
										obsta_check(2);
									}
									else if(i==2&&j==2)
									{
										ply2=ply2+15;
										obsta_check(2);
									}
									else if(i==5&&j==3)
									{
										ply2=ply2+21;
										obsta_check(2);
									}
									else 
									{
										if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player2);	
										}
									}
								}
							}
						}
					ply2pre=ply2;
				}
				if(pp==3)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply3pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player1);
										}
										
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player2);
										}
										
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_12_);
										}
										
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply3=ply3+check;
					if(ply3>=99)
					{
						if(ply3==99)
						{
							ply3=0;
							board_object.win(3);
						}
						else
						{
							ply3=ply3-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply3)
								{
									if(i==4&&j==5)		
									{
										ply3=ply3-25;
										obsta_check(3);
									}
									else if(i==9&&j==8)
									{
										ply3=ply3-6;
										obsta_check(3);
									}
									else if(i==8&&j==0)
									{
										ply3=ply3-3;
										obsta_check(3);
									}
									else if(i==0&&j==7)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==9)
									{
										ply3=ply3-7;
										obsta_check(3);
									}
									else if(i==2&&j==8)
									{
										ply3=ply3-22;
										obsta_check(3);
									}
									else if(i==7&&j==8)
									{
										ply3=ply3-12;
										obsta_check(3);
									}
									else if(i==7&&j==4)
									{
										ply3=ply3-10;
										obsta_check(3);
									}
									else if(i==2&&j==5)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==1)
									{
										ply3=ply3-20;
										obsta_check(3);
									}
									else if(i==6&&j==1)
									{
										ply3=ply3-15;
										obsta_check(3);
									}
									else if(i==1&&j==3)
									{
										ply3=ply3-30;
										obsta_check(3);
									}
									else if(i==3&&j==2)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==5&&j==6)
									{
										ply3=ply3+29;
										obsta_check(3);
									}
									else if(i==9&&j==6)
									{
										ply3=ply3+17;
										obsta_check(3);
									}
									else if(i==8&&j==6)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==1&&j==7)
									{
										ply3=ply3+7;
										obsta_check(3);
									}
									else if(i==2&&j==2)
									{
										ply3=ply3+15;
										obsta_check(3);
									}
									else if(i==5&&j==3)
									{
										ply3=ply3+21;
										obsta_check(3);
									}
									else
									{
										if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player3);
										}
									}
								}
							}
						}
					ply3pre=ply3;
				}
				if(pp==4)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply4pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
									{
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player3);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_12_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_123_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply4=ply4+check;
					if(ply4>=99)
					{
						if(ply4==99)
						{
							ply4=0;
							board_object.win(4);
						}
						else
						{
							ply4=ply4-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply4)
								{
									if(i==4&&j==5)		
									{
										ply4=ply4-25;
										obsta_check(4);
									}
									else if(i==9&&j==8)
									{
										ply4=ply4-6;
										obsta_check(4);
									}
									else if(i==8&&j==0)
									{
										ply4=ply4-3;
										obsta_check(4);
									}
									else if(i==0&&j==7)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==9)
									{
										ply4=ply4-7;
										obsta_check(4);
									}
									else if(i==2&&j==8)
									{
										ply4=ply4-22;
										obsta_check(4);
									}
									else if(i==7&&j==8)
									{
										ply4=ply4-12;
										obsta_check(4);
									}
									else if(i==7&&j==4)
									{
										ply4=ply4-10;
										obsta_check(4);
									}
									else if(i==2&&j==5)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==1)
									{
										ply4=ply4-20;
										obsta_check(4);
									}
									else if(i==6&&j==1)
									{
										ply4=ply4-15;
										obsta_check(4);
									}
									else if(i==1&&j==3)
									{
										ply4=ply4-30;
										obsta_check(4);
									}
									else if(i==3&&j==2)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==5&&j==6)
									{
										ply4=ply4+29;
										obsta_check(4);
									}
									else if(i==9&&j==6)
									{
										ply4=ply4+17;
										obsta_check(4);
									}
									else if(i==8&&j==6)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==1&&j==7)
									{
										ply4=ply4+7;
										obsta_check(4);
									}
									else if(i==2&&j==2)
									{
										ply4=ply4+15;
										obsta_check(4);
									}
									else if(i==5&&j==3)
									{
										ply4=ply4+21;
										obsta_check(4);
									}

									else 
									{	
										if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
										{
									
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player4);
										}
									}
								}
							}
						}
					ply4pre=ply4;
				}
			}
			if(check==4)
			{
				dice4= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\dice4.png");
				dice4 =new ImageIcon(dice4.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
				br.setIcon(dice4);
				if(pp==1)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply1pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply1=ply1+check;
					if(ply1>=99)
					{
						if(ply1==99)
						{
							ply1=0;
							board_object.win(1);
						}
						else
						{
							ply1=ply1-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply1)
								{
									if(i==4&&j==5)		
									{
										ply1=ply1-25;
										obsta_check(1);
									}
									else if(i==9&&j==8)
									{
										ply1=ply1-6;
										obsta_check(1);
									}
									else if(i==8&&j==0)
									{
										ply1=ply1-3;
										obsta_check(1);
									}
									else if(i==0&&j==7)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==9)
									{
										ply1=ply1-7;
										obsta_check(1);
									}
									else if(i==2&&j==8)
									{
										ply1=ply1-22;
										obsta_check(1);
									}
									else if(i==7&&j==8)
									{
										ply1=ply1-12;
										obsta_check(1);
									}
									else if(i==7&&j==4)
									{
										ply1=ply1-10;
										obsta_check(1);
									}
									else if(i==2&&j==5)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==1)
									{
										ply1=ply1-20;
										obsta_check(1);
									}
									else if(i==6&&j==1)
									{
										ply1=ply1-15;
										obsta_check(1);
									}
									else if(i==1&&j==3)
									{
										ply1=ply1-30;
										obsta_check(1);
									}
									else if(i==3&&j==2)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==5&&j==6)
									{
										ply1=ply1+29;
										obsta_check(1);
									}
									else if(i==9&&j==6)
									{
										ply1=ply1+17;
										obsta_check(1);
									}
									else if(i==8&&j==6)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==1&&j==7)
									{
										ply1=ply1+7;
										obsta_check(1);
									}
									else if(i==2&&j==2)
									{
										ply1=ply1+15;
										obsta_check(1);
									}
									else if(i==5&&j==3)
									{
										ply1=ply1+21;
										obsta_check(1);
									}

									else 
									{
										if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player1);
										}
									}
								}
							}
						}
					ply1pre=ply1;
				}
				if(pp==2)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply2pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply2=ply2+check;
					if(ply2>=99)
					{
						if(ply2==99)
						{
							ply2=0;
							board_object.win(2);
						}
						else
						{
							ply2=ply2-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply2)
								{
									if(i==4&&j==5)		
									{
										ply2=ply2-25;
										obsta_check(2);
									}									
									else if(i==9&&j==8)
									{
										ply2=ply2-6;
										obsta_check(2);
									}
									else if(i==8&&j==0)
									{
										ply2=ply2-3;
										obsta_check(2);
									}
									else if(i==0&&j==7)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==9)
									{
										ply2=ply2-7;
										obsta_check(2);
									}
									else if(i==2&&j==8)
									{
										ply2=ply2-22;
										obsta_check(2);
									}
									else if(i==7&&j==8)
									{
										ply2=ply2-12;
										obsta_check(2);
									}
									else if(i==7&&j==4)
									{
										ply2=ply2-10;
										obsta_check(2);
									}
									else if(i==2&&j==5)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==1)
									{
										ply2=ply2-20;
										obsta_check(2);
									}
									else if(i==6&&j==1)
									{
										ply2=ply2-15;
										obsta_check(2);
									}
									else if(i==1&&j==3)
									{
										ply2=ply2-30;
										obsta_check(2);
									}
									else if(i==3&&j==2)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==5&&j==6)
									{
										ply2=ply2+29;
										obsta_check(2);
									}
									else if(i==9&&j==6)
									{
										ply2=ply2+17;
										obsta_check(2);
									}
									else if(i==8&&j==6)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==1&&j==7)
									{
										ply2=ply2+7;
										obsta_check(2);
									}
									else if(i==2&&j==2)
									{
										ply2=ply2+15;
										obsta_check(2);
									}
									else if(i==5&&j==3)
									{
										ply2=ply2+21;
										obsta_check(2);
									}
									else 
									{
										if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player2);	
										}
									}
								}
							}
						}
					ply2pre=ply2;
				}
				if(pp==3)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply3pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player1);
										}
										
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player2);
										}
										
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_12_);
										}
										
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply3=ply3+check;
					if(ply3>=99)
					{
						if(ply3==99)
						{
							ply3=0;
							board_object.win(3);
						}
						else
						{
							ply3=ply3-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply3)
								{
									
									if(i==4&&j==5)		
									{
										ply3=ply3-25;
										obsta_check(3);
									}								
									else if(i==9&&j==8)
									{
										ply3=ply3-6;
										obsta_check(3);
									}
									else if(i==8&&j==0)
									{
										ply3=ply3-3;
										obsta_check(3);
									}
									else if(i==0&&j==7)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==9)
									{
										ply3=ply3-7;
										obsta_check(3);
									}
									else if(i==2&&j==8)
									{
										ply3=ply3-22;
										obsta_check(3);
									}
									else if(i==7&&j==8)
									{
										ply3=ply3-12;
										obsta_check(3);
									}
									else if(i==7&&j==4)
									{
										ply3=ply3-10;
										obsta_check(3);
									}
									else if(i==2&&j==5)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==1)
									{
										ply3=ply3-20;
										obsta_check(3);
									}
									else if(i==6&&j==1)
									{
										ply3=ply3-15;
										obsta_check(3);
									}
									else if(i==1&&j==3)
									{
										ply3=ply3-30;
										obsta_check(3);
									}
									else if(i==3&&j==2)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==5&&j==6)
									{
										ply3=ply3+29;
										obsta_check(3);
									}
									else if(i==9&&j==6)
									{
										ply3=ply3+17;
										obsta_check(3);
									}
									else if(i==8&&j==6)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==1&&j==7)
									{
										ply3=ply3+7;
										obsta_check(3);
									}
									else if(i==2&&j==2)
									{
										ply3=ply3+15;
										obsta_check(3);
									}
									else if(i==5&&j==3)
									{
										ply3=ply3+21;
										obsta_check(3);
									}
										else
										{
											if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
											{
												
												if(ply1==ply3)
												{
													btemp[i][j].setIcon(_13_);
												}
												
												if(ply2==ply3)
												{
													btemp[i][j].setIcon(_23_);
												}
												
												if(ply3==ply4)
												{
													btemp[i][j].setIcon(_34_);
												}
												if((ply1==ply2)&&(ply2==ply3))
												{
													btemp[i][j].setIcon(_123_);
												}
												
												if((ply1==ply3)&&(ply3==ply4))
												{
													btemp[i][j].setIcon(_134_);
												}
												if((ply3==ply2)&&(ply2==ply4))
												{
													btemp[i][j].setIcon(_324_);
												}
												if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
												{
													btemp[i][j].setIcon(_1234_);
												}
											}
											else
											{
												btemp[i][j].setIcon(player3);
											}
									}
								}
							}
						}
					ply3pre=ply3;
				}
				if(pp==4)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply4pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
									{
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player3);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_12_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_123_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply4=ply4+check;
					if(ply4>=99)
					{
						if(ply4==99)
						{
							ply4=0;
							board_object.win(4);
						}
						else
						{
							ply4=ply4-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply4)
								{
									if(i==4&&j==5)		
									{
										ply4=ply4-25;
										obsta_check(4);
									}
									else if(i==9&&j==8)
									{
										ply4=ply4-6;
										obsta_check(4);
									}
									else if(i==8&&j==0)
									{
										ply4=ply4-3;
										obsta_check(4);
									}
									else if(i==0&&j==7)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==9)
									{
										ply4=ply4-7;
										obsta_check(4);
									}
									else if(i==2&&j==8)
									{
										ply4=ply4-22;
										obsta_check(4);
									}
									else if(i==7&&j==8)
									{
										ply4=ply4-12;
										obsta_check(4);
									}
									else if(i==7&&j==4)
									{
										ply4=ply4-10;
										obsta_check(4);
									}
									else if(i==2&&j==5)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==1)
									{
										ply4=ply4-20;
										obsta_check(4);
									}
									else if(i==6&&j==1)
									{
										ply4=ply4-15;
										obsta_check(4);
									}
									else if(i==1&&j==3)
									{
										ply4=ply4-30;
										obsta_check(4);
									}
									else if(i==3&&j==2)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==5&&j==6)
									{
										ply4=ply4+29;
										obsta_check(4);
									}
									else if(i==9&&j==6)
									{
										ply4=ply4+17;
										obsta_check(4);
									}
									else if(i==8&&j==6)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==1&&j==7)
									{
										ply4=ply4+7;
										obsta_check(4);
									}
									else if(i==2&&j==2)
									{
										ply4=ply4+15;
										obsta_check(4);
									}
									else if(i==5&&j==3)
									{
										ply4=ply4+21;
										obsta_check(4);
									}

									else 
									{
										if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
										{
									
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player4);
										}
									}
								}
							}
						}
					ply4pre=ply4;
				}
			}
			if(check==5)
			{
				dice5= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\dice5.png");
				dice5 =new ImageIcon(dice5.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
				br.setIcon(dice5);
				if(pp==1)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply1pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply1=ply1+check;
					if(ply1>=99)
					{
						if(ply1==99)
						{
							ply1=0;
							board_object.win(1);
						}
						else
						{
							ply1=ply1-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply1)
								{
									if(i==4&&j==5)		
									{
										ply1=ply1-25;
										obsta_check(1);
									}
									else if(i==9&&j==8)
									{
										ply1=ply1-6;
										obsta_check(1);
									}
									else if(i==8&&j==0)
									{
										ply1=ply1-3;
										obsta_check(1);
									}
									else if(i==0&&j==7)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==9)
									{
										ply1=ply1-7;
										obsta_check(1);
									}
									else if(i==2&&j==8)
									{
										ply1=ply1-22;
										obsta_check(1);
									}
									else if(i==7&&j==8)
									{
										ply1=ply1-12;
										obsta_check(1);
									}
									else if(i==7&&j==4)
									{
										ply1=ply1-10;
										obsta_check(1);
									}
									else if(i==2&&j==5)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==1)
									{
										ply1=ply1-20;
										obsta_check(1);
									}
									else if(i==6&&j==1)
									{
										ply1=ply1-15;
										obsta_check(1);
									}
									else if(i==1&&j==3)
									{
										ply1=ply1-30;
										obsta_check(1);
									}
									else if(i==3&&j==2)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==5&&j==6)
									{
										ply1=ply1+29;
										obsta_check(1);
									}
									else if(i==9&&j==6)
									{
										ply1=ply1+17;
										obsta_check(1);
									}
									else if(i==8&&j==6)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==1&&j==7)
									{
										ply1=ply1+7;
										obsta_check(1);
									}
									else if(i==2&&j==2)
									{
										ply1=ply1+15;
										obsta_check(1);
									}
									else if(i==5&&j==3)
									{
										ply1=ply1+21;
										obsta_check(1);
									}

									else 
									{
										if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player1);
										}
									}
								}
							}
						}
					ply1pre=ply1;
				}
				if(pp==2)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply2pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply2=ply2+check;
					if(ply2>=99)
					{
						if(ply2==99)
						{
							ply2=0;
							board_object.win(2);
						}
						else
						{
							ply2=ply2-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply2)
								{
									if(i==4&&j==5)		
									{
										ply2=ply2-25;
										obsta_check(2);
									}
									else if(i==9&&j==8)
									{
										ply2=ply2-6;
										obsta_check(2);
									}
									else if(i==8&&j==0)
									{
										ply2=ply2-3;
										obsta_check(2);
									}
									else if(i==0&&j==7)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==9)
									{
										ply2=ply2-7;
										obsta_check(2);
									}
									else if(i==2&&j==8)
									{
										ply2=ply2-22;
										obsta_check(2);
									}
									else if(i==7&&j==8)
									{
										ply2=ply2-12;
										obsta_check(2);
									}
									else if(i==7&&j==4)
									{
										ply2=ply2-10;
										obsta_check(2);
									}
									else if(i==2&&j==5)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==1)
									{
										ply2=ply2-20;
										obsta_check(2);
									}
									else if(i==6&&j==1)
									{
										ply2=ply2-15;
										obsta_check(2);
									}
									else if(i==1&&j==3)
									{
										ply2=ply2-30;
										obsta_check(2);
									}
									else if(i==3&&j==2)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==5&&j==6)
									{
										ply2=ply2+29;
										obsta_check(2);
									}
									else if(i==9&&j==6)
									{
										ply2=ply2+17;
										obsta_check(2);
									}
									else if(i==8&&j==6)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==1&&j==7)
									{
										ply2=ply2+7;
										obsta_check(2);
									}
									else if(i==2&&j==2)
									{
										ply2=ply2+15;
										obsta_check(2);
									}
									else if(i==5&&j==3)
									{
										ply2=ply2+21;
										obsta_check(2);
									}
									else 
									{
										if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player2);	
										}
									}
								}
							}
						}
					ply2pre=ply2;
				}
				if(pp==3)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply3pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player1);
										}
										
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player2);
										}
										
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_12_);
										}
										
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply3=ply3+check;
					if(ply3>=99)
					{
						if(ply3==99)
						{
							ply3=0;
							board_object.win(3);
						}
						else
						{
							ply3=ply3-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply3)
								{
									if(i==4&&j==5)		
									{
										ply3=ply3-25;
										obsta_check(3);
									}
									else if(i==9&&j==8)
									{
										ply3=ply3-6;
										obsta_check(3);
									}
									else if(i==8&&j==0)
									{
										ply3=ply3-3;
										obsta_check(3);
									}
									else if(i==0&&j==7)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==9)
									{
										ply3=ply3-7;
										obsta_check(3);
									}
									else if(i==2&&j==8)
									{
										ply3=ply3-22;
										obsta_check(3);
									}
									else if(i==7&&j==8)
									{
										ply3=ply3-12;
										obsta_check(3);
									}
									else if(i==7&&j==4)
									{
										ply3=ply3-10;
										obsta_check(3);
									}
									else if(i==2&&j==5)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==1)
									{
										ply3=ply3-20;
										obsta_check(3);
									}
									else if(i==6&&j==1)
									{
										ply3=ply3-15;
										obsta_check(3);
									}
									else if(i==1&&j==3)
									{
										ply3=ply3-30;
										obsta_check(3);
									}
									else if(i==3&&j==2)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==5&&j==6)
									{
										ply3=ply3+29;
										obsta_check(3);
									}
									else if(i==9&&j==6)
									{
										ply3=ply3+17;
										obsta_check(3);
									}
									else if(i==8&&j==6)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==1&&j==7)
									{
										ply3=ply3+7;
										obsta_check(3);
									}
									else if(i==2&&j==2)
									{
										ply3=ply3+15;
										obsta_check(3);
									}
									else if(i==5&&j==3)
									{
										ply3=ply3+21;
										obsta_check(3);
									}
									else
									{
										if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player3);
										}
									}
								}
							}
						}
					ply3pre=ply3;
				}
				if(pp==4)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply4pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
									{
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player3);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_12_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_123_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply4=ply4+check;
					if(ply4>=99)
					{
						if(ply4==99)
						{
							ply4=0;
							board_object.win(4);
						}
						else
						{
							ply4=ply4-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply4)
								{
									if(i==4&&j==5)		
									{
										ply4=ply4-25;
										obsta_check(4);
									}
									else if(i==9&&j==8)
									{
										ply4=ply4-6;
										obsta_check(4);
									}
									else if(i==8&&j==0)
									{
										ply4=ply4-3;
										obsta_check(4);
									}
									else if(i==0&&j==7)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==9)
									{
										ply4=ply4-7;
										obsta_check(4);
									}
									else if(i==2&&j==8)
									{
										ply4=ply4-22;
										obsta_check(4);
									}
									else if(i==7&&j==8)
									{
										ply4=ply4-12;
										obsta_check(4);
									}
									else if(i==7&&j==4)
									{
										ply4=ply4-10;
										obsta_check(4);
									}
									else if(i==2&&j==5)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==1)
									{
										ply4=ply4-20;
										obsta_check(4);
									}
									else if(i==6&&j==1)
									{
										ply4=ply4-15;
										obsta_check(4);
									}
									else if(i==1&&j==3)
									{
										ply4=ply4-30;
										obsta_check(4);
									}
									else if(i==3&&j==2)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==5&&j==6)
									{
										ply4=ply4+29;
										obsta_check(4);
									}
									else if(i==9&&j==6)
									{
										ply4=ply4+17;
										obsta_check(4);
									}
									else if(i==8&&j==6)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==1&&j==7)
									{
										ply4=ply4+7;
										obsta_check(4);
									}
									else if(i==2&&j==2)
									{
										ply4=ply4+15;
										obsta_check(4);
									}
									else if(i==5&&j==3)
									{
										ply4=ply4+21;
										obsta_check(4);
									}

									else 
									{
										if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
										{
									
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player4);
										}
									}
								}
							}
						}
					ply4pre=ply4;
				}
			}
			if(check==6)
			{
				dice6= new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Players\\dice6.png");
				dice6 =new ImageIcon(dice6.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
				br.setIcon(dice6);
				if(pp==1)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply1pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_324_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply1=ply1+check;
					if(ply1>=99)
					{
						if(ply1==99)
						{
							ply1=0;
							board_object.win(1);
						}
						else
						{
							ply1=ply1-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply1)
								{
									if(i==4&&j==5)		
									{
										ply1=ply1-25;
										obsta_check(1);
									}
									else if(i==9&&j==8)
									{
										ply1=ply1-6;
										obsta_check(1);
									}
									else if(i==8&&j==0)
									{
										ply1=ply1-3;
										obsta_check(1);
									}
									else if(i==0&&j==7)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==9)
									{
										ply1=ply1-7;
										obsta_check(1);
									}
									else if(i==2&&j==8)
									{
										ply1=ply1-22;
										obsta_check(1);
									}
									else if(i==7&&j==8)
									{
										ply1=ply1-12;
										obsta_check(1);
									}
									else if(i==7&&j==4)
									{
										ply1=ply1-10;
										obsta_check(1);
									}
									else if(i==2&&j==5)
									{
										ply1=ply1-5;
										obsta_check(1);
									}
									else if(i==3&&j==1)
									{
										ply1=ply1-20;
										obsta_check(1);
									}
									else if(i==6&&j==1)
									{
										ply1=ply1-15;
										obsta_check(1);
									}
									else if(i==1&&j==3)
									{
										ply1=ply1-30;
										obsta_check(1);
									}
									else if(i==3&&j==2)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==5&&j==6)
									{
										ply1=ply1+29;
										obsta_check(1);
									}
									else if(i==9&&j==6)
									{
										ply1=ply1+17;
										obsta_check(1);
									}
									else if(i==8&&j==6)
									{
										ply1=ply1+13;
										obsta_check(1);
									}
									else if(i==1&&j==7)
									{
										ply1=ply1+7;
										obsta_check(1);
									}
									else if(i==2&&j==2)
									{
										ply1=ply1+15;
										obsta_check(1);
									}
									else if(i==5&&j==3)
									{
										ply1=ply1+21;
										obsta_check(1);
									}

									else 
									{
										if((ply1==ply2)||(ply1==ply3)||(ply1==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player1);
										}
									}
								}
							}
						}
					ply1pre=ply1;
				}
				if(pp==2)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply2pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										if(ply1==ply2)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player3);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_34_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_134_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply2=ply2+check;
					if(ply2>=99)
					{
						if(ply2==99)
						{
							ply2=0;
							board_object.win(2);
						}
						else
						{
							ply2=ply2-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply2)
								{
									if(i==4&&j==5)		
									{
										ply2=ply2-25;
										obsta_check(2);
									}
									else if(i==9&&j==8)
									{
										ply2=ply2-6;
										obsta_check(2);
									}
									else if(i==8&&j==0)
									{
										ply2=ply2-3;
										obsta_check(2);
									}
									else if(i==0&&j==7)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==9)
									{
										ply2=ply2-7;
										obsta_check(2);
									}
									else if(i==2&&j==8)
									{
										ply2=ply2-22;
										obsta_check(2);
									}
									else if(i==7&&j==8)
									{
										ply2=ply2-12;
										obsta_check(2);
									}
									else if(i==7&&j==4)
									{
										ply2=ply2-10;
										obsta_check(2);
									}
									else if(i==2&&j==5)
									{
										ply2=ply2-5;
										obsta_check(2);
									}
									else if(i==3&&j==1)
									{
										ply2=ply2-20;
										obsta_check(2);
									}
									else if(i==6&&j==1)
									{
										ply2=ply2-15;
										obsta_check(2);
									}
									else if(i==1&&j==3)
									{
										ply2=ply2-30;
										obsta_check(2);
									}
									else if(i==3&&j==2)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==5&&j==6)
									{
										ply2=ply2+29;
										obsta_check(2);
									}
									else if(i==9&&j==6)
									{
										ply2=ply2+17;
										obsta_check(2);
									}
									else if(i==8&&j==6)
									{
										ply2=ply2+13;
										obsta_check(2);
									}
									else if(i==1&&j==7)
									{
										ply2=ply2+7;
										obsta_check(2);
									}
									else if(i==2&&j==2)
									{
										ply2=ply2+15;
										obsta_check(2);
									}
									else if(i==5&&j==3)
									{
										ply2=ply2+21;
										obsta_check(2);
									}
									else 
									{
										if((ply1==ply2)||(ply2==ply3)||(ply2==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply2)&&(ply2==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											if(ply1==ply2)
											{
												btemp[i][j].setIcon(_12_);
											}
											
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player2);	
										}
									}
							
								}
							}
						}
					ply2pre=ply2;
				}
				if(pp==3)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply3pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
									{
										
										if(ply1==ply3)
										{
											btemp[i][j].setIcon(player1);
										}
										
										if(ply2==ply3)
										{
											btemp[i][j].setIcon(player2);
										}
										
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player4);
										}
										if((ply1==ply2)&&(ply2==ply3))
										{
											btemp[i][j].setIcon(_12_);
										}
										
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_14_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_24_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_124_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}		
								}
								
							}
						}
					}
					ply3=ply3+check;
					if(ply3>=99)
					{
						if(ply3==99)
						{
							ply3=0;
							board_object.win(3);
						}
						else
						{
							ply3=ply3-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply3)
								{
									if(i==4&&j==5)		
									{
										ply3=ply3-25;
										obsta_check(3);
									}
									else if(i==9&&j==8)
									{
										ply3=ply3-6;
										obsta_check(3);
									}
									else if(i==8&&j==0)
									{
										ply3=ply3-3;
										obsta_check(3);
									}
									else if(i==0&&j==7)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==9)
									{
										ply3=ply3-7;
										obsta_check(3);
									}
									else if(i==2&&j==8)
									{
										ply3=ply3-22;
										obsta_check(3);
									}
									else if(i==7&&j==8)
									{
										ply3=ply3-12;
										obsta_check(3);
									}
									else if(i==7&&j==4)
									{
										ply3=ply3-10;
										obsta_check(3);
									}
									else if(i==2&&j==5)
									{
										ply3=ply3-5;
										obsta_check(3);
									}
									else if(i==3&&j==1)
									{
										ply3=ply3-20;
										obsta_check(3);
									}
									else if(i==6&&j==1)
									{
										ply3=ply3-15;
										obsta_check(3);
									}
									else if(i==1&&j==3)
									{
										ply3=ply3-30;
										obsta_check(3);
									}
									else if(i==3&&j==2)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==5&&j==6)
									{
										ply3=ply3+29;
										obsta_check(3);
									}
									else if(i==9&&j==6)
									{
										ply3=ply3+17;
										obsta_check(3);
									}
									else if(i==8&&j==6)
									{
										ply3=ply3+13;
										obsta_check(3);
									}
									else if(i==1&&j==7)
									{
										ply3=ply3+7;
										obsta_check(3);
									}
									else if(i==2&&j==2)
									{
										ply3=ply3+15;
										obsta_check(3);
									}
									else if(i==5&&j==3)
									{
										ply3=ply3+21;
										obsta_check(3);
									}
									else
									{
										if((ply1==ply3)||(ply2==ply3)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply3))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))
										{
											
											if(ply1==ply3)
											{
												btemp[i][j].setIcon(_13_);
											}
											
											if(ply2==ply3)
											{
												btemp[i][j].setIcon(_23_);
											}
											
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											if((ply1==ply2)&&(ply2==ply3))
											{
												btemp[i][j].setIcon(_123_);
											}
											
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player3);
										}
									}
								}
							}
						}
					ply3pre=ply3;
				}
				if(pp==4)
				{
					
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<10;j++)
						{
							if(a[i][j]==ply4pre)
							{
								if((i==4&&j==5)||(i==9&&j==8)||(i==8&&j==0)||(i==0&&j==7)||(i==3&&j==9)||(i==2&&j==8)||(i==7&&j==8)||(i==7&&j==4)||(i==2&&j==5)||(i==3&&j==1)||(i==6&&j==1)||(i==1&&j==3)||(i==3&&j==2)||(i==5&&j==6)||(i==9&&j==6)||(i==8&&j==6)||(i==1&&j==7)||(i==2&&j==2)||(i==5&&j==3))
								{
									
								}
								else
								{
									if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
									{
										if(ply1==ply4)
										{
											btemp[i][j].setIcon(player1);
										}
										if(ply2==ply4)
										{
											btemp[i][j].setIcon(player2);
										}
										if(ply3==ply4)
										{
											btemp[i][j].setIcon(player3);
										}
										if((ply1==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_12_);
										}
										if((ply1==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_13_);
										}
										if((ply3==ply2)&&(ply2==ply4))
										{
											btemp[i][j].setIcon(_23_);
										}
										if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
										{
											btemp[i][j].setIcon(_123_);
										}
									}
									else
									{
										btemp[i][j].setIcon(null);
									}
								}
								
							}
						}
					}
					ply4=ply4+check;
					if(ply4>=99)
					{
						if(ply4==99)
						{
							ply4=0;
							board_object.win(4);
						}
						else
						{
							ply4=ply4-check;
						}
					}
						for(int i=0;i<10;i++)
						{
							for(int j=0;j<10;j++)
							{
								if(a[i][j]==ply4)
								{	
									if(i==4&&j==5)		
									{
										ply4=ply4-25;
										obsta_check(4);
									}
									else if(i==9&&j==8)
									{
										ply4=ply4-6;
										obsta_check(4);
									}
									else if(i==8&&j==0)
									{
										ply4=ply4-3;
										obsta_check(4);
									}
									else if(i==0&&j==7)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==9)
									{
										ply4=ply4-7;
										obsta_check(4);
									}
									else if(i==2&&j==8)
									{
										ply4=ply4-22;
										obsta_check(4);
									}
									else if(i==7&&j==8)
									{
										ply4=ply4-12;
										obsta_check(4);
									}
									else if(i==7&&j==4)
									{
										ply4=ply4-10;
										obsta_check(4);
									}
									else if(i==2&&j==5)
									{
										ply4=ply4-5;
										obsta_check(4);
									}
									else if(i==3&&j==1)
									{
										ply4=ply4-20;
										obsta_check(4);
									}
									else if(i==6&&j==1)
									{
										ply4=ply4-15;
										obsta_check(4);
									}
									else if(i==1&&j==3)
									{
										ply4=ply4-30;
										obsta_check(4);
									}
									else if(i==3&&j==2)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==5&&j==6)
									{
										ply4=ply4+29;
										obsta_check(4);
									}
									else if(i==9&&j==6)
									{
										ply4=ply4+17;
										obsta_check(4);
									}
									else if(i==8&&j==6)
									{
										ply4=ply4+13;
										obsta_check(4);
									}
									else if(i==1&&j==7)
									{
										ply4=ply4+7;
										obsta_check(4);
									}
									else if(i==2&&j==2)
									{
										ply4=ply4+15;
										obsta_check(4);
									}
									else if(i==5&&j==3)
									{
										ply4=ply4+21;
										obsta_check(4);
									}
									else 
									{
										if((ply1==ply4)||(ply2==ply4)||(ply3==ply4)||((ply1==ply2)&&(ply2==ply4))||((ply1==ply3)&&(ply3==ply4))||((ply3==ply2)&&(ply2==ply4))||((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4)))		
										{
									
											if(ply1==ply4)
											{
												btemp[i][j].setIcon(_14_);
											}
											
											if(ply2==ply4)
											{
												btemp[i][j].setIcon(_24_);
											}
											if(ply3==ply4)
											{
												btemp[i][j].setIcon(_34_);
											}
											
											if((ply1==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_124_);
											}
											if((ply1==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_134_);
											}
											if((ply3==ply2)&&(ply2==ply4))
											{
												btemp[i][j].setIcon(_324_);
											}
											if((ply1==ply2)&&(ply2==ply3)&&(ply3==ply4))
											{
												btemp[i][j].setIcon(_1234_);
											}
										}
										else
										{
											btemp[i][j].setIcon(player4);
										}
									}
								}
							}
						}
					ply4pre=ply4;
				}
			}
		}
	}				
	
}


