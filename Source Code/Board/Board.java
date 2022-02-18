package Board;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import Players.*;

public class Board implements ActionListener {
	public static JFrame jfrm=new JFrame("Snake and Ladder");
	public static JButton[][] b=new JButton[11][11];
	public static GridBagLayout grid=new GridBagLayout();
	public static GridBagConstraints gbc=new GridBagConstraints();
	public static ImageIcon bh[]=new ImageIcon[20];
	public static JLabel players=new JLabel();
	public static JButton exit=new JButton();
	
	public static Toolkit t=Toolkit.getDefaultToolkit();  
	public static Image i=t.getImage("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board/Game_Icon.jpg"); 
	
	public static JPanel jp=new JPanel();
	int k=0;
	public static ImageIcon p=new ImageIcon();
	public static JFrame win=new JFrame("Snake and Ladder");

	public static void winner(int ply1,int ply2,int ply3,int ply4)
	{
		Canvas m=new Canvas(); 
		jfrm.add(m);
		m.imageUpdate(i, 100, 324, 233, 200, 200);
		jfrm.setIconImage(i);
	}
	
	public static void win(int ply)
	{
		jfrm.setVisible(false);
		JLabel background;
		win.setSize(1200,700);
		win.setVisible(true);
		Canvas m=new Canvas(); 
		win.add(m);
		m.imageUpdate(i, 100, 324, 233, 200, 200);
		win.setIconImage(i);
		
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        if(ply==0)
        {
        	p=new ImageIcon("D:/Programming Languages , Certificates and Presentation/Myself/Snake_and_Ladder/src/Players/select_players.png");
       	 	p=new ImageIcon(p.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT));
        }
        else if(ply==1)
        {
        	 p=new ImageIcon("D:/Programming Languages , Certificates and Presentation/Myself/Snake_and_Ladder/src/Players/win_player1.png");
        	 p=new ImageIcon(p.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT));
        }
        else if(ply==2)
        {
        	p=new ImageIcon("D:/Programming Languages , Certificates and Presentation/Myself/Snake_and_Ladder/src/Players/win_player2.png");
        	p=new ImageIcon(p.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT));
        }
        else if(ply==3)
        {
        	p=new ImageIcon("D:/Programming Languages , Certificates and Presentation/Myself/Snake_and_Ladder/src/Players/win_player3.png");
        	p=new ImageIcon(p.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT));
        }
        else if(ply==4)
        {
        	p=new ImageIcon("D:/Programming Languages , Certificates and Presentation/Myself/Snake_and_Ladder/src/Players/win_player4.png");
        	p=new ImageIcon(p.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT));
        }
        else
        {
        	System.exit(0);
        }
        background=new JLabel("",p,JLabel.CENTER);
        win.add(background);
		win.setVisible(true);
		win.pack();
	}
	public void Board() 
	 {
			jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			jfrm.setLayout(grid);
			
			jp.setLayout(new GridLayout(15,15));

			
			jfrm.getContentPane().setBackground(Color.black);
			
			jfrm.setVisible(false);
			jfrm.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	public void buttons()
	{	
		
		exit=new JButton("Exit");
		gbc.gridx=10;
		gbc.gridy=8;
		gbc.gridwidth=3;
		gbc.gridheight=3;
		exit.setBackground(Color.white);
		exit.setActionCommand("Exit");
		exit.addActionListener(this);
		jfrm.add(exit,gbc);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Exit"))
			System.exit(0);
	}
	
	public void colorbuttons()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i%2==0&&i%2==0)
					b[i][j].setBackground(Color.GREEN);
				else
					b[i][j].setBackground(Color.ORANGE);
			
			}
		}
	}
	
	public void obstacle_and_increments()
	{
		gbc.fill=GridBagConstraints.BOTH;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i==4&&j==5)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\lion.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					k++;
				}
				else if(i==9&&j==0)
				{
					b[i][j]=new JButton("Start");
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
				}
				else if(i==0&&j==0)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\win.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==9&&j==8) 
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\tiger.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==8&&j==0)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\wolf.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==0&&j==7)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\hippo.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==3&&j==9)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\gorilla.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==2&&j==8)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\dinosaur.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==7&&j==8)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\crocodile.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==7&&j==4)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\buffalo.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==2&&j==5)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\snake.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==3&&j==1)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\bear.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==6&&j==1)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\fox.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==1&&j==3)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\chetaah.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==3&&j==2)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\+1.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==5&&j==6)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\+2.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==9&&j==6)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\+3.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==8&&j==6)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\+4.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==1&&j==7)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\+5.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==2&&j==2)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\+6.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else if(i==5&&j==3)
				{
					bh[k]=new ImageIcon("D:\\Programming Languages , Certificates and Presentation\\Myself\\Snake_and_Ladder\\src\\Board\\+7.png");
					bh[k]=new ImageIcon(bh[k].getImage().getScaledInstance(100,70,Image.SCALE_DEFAULT));
					b[i][j]=new JButton(bh[k]);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
					//
					k++;
				}
				else
				{
					b[i][j]=new JButton();
					//b[i][j]=new JButton(""+j);
					gbc.gridx=j;
					gbc.gridy=i;
					gbc.gridwidth=1;
					jfrm.add(b[i][j],gbc);
				}
			}
		}
	}
}
