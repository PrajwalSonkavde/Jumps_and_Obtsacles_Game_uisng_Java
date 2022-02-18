package main;
import Board.*;
import Players.*;

public class main extends Thread {
	public static Board b=new Board();
	public static Players_roll p=new Players_roll();
	public static void main(String[] args) 
	{
		b.Board();
		b.winner(100, 100, 100, 100);
		b.obstacle_and_increments();
		b.buttons();
		b.colorbuttons();
		p.setnumberstotemp();
		p.getplayers(b.jfrm,b.gbc,b.b);
		
	}
}
