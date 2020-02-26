package com.logger.loggingdemo;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class houseCost
{
	public double CostperSqfeet(String sta,double area,int cost)
	{
		if(sta.equals("standard"))
		return (double)(area*1200);
		else if(sta.equals("abovestand"))
		return (double)(area*1500);
		else if(sta.equals("highstand"))
		return (double)(area*1800);
		else 
		return (double)(area*2500);
	}
}
public class HouseConstruct {
	private static final Logger logger = LogManager.getLogger(SimpleCompoundI.class);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter material standard");
		houseCost obj=new houseCost();
		String sta=sc.nextLine();
		System.out.println("enter the area of house");
		double area=sc.nextInt();
		System.out.println("enter cost per square feet");
		int cost=sc.nextInt();
		System.out.print("cost per square feet is:");
		logger.error(obj.CostperSqfeet(sta,area,cost));
		
	}

}

