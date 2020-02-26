package com.logger.loggingdemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
class Interest
{
	public double SimpleInterest(double princpal_amount,int rate,int time)
	{
		return (double)(princpal_amount*time*rate)/100f;
	}
	public double CompoundInterest(double princpal_amount,int rate,int time)
	{
		return (double)princpal_amount*(Math.pow((1+rate/100f),time));
	}
}
public class SimpleCompoundI {
	private static final Logger logger = LogManager.getLogger(SimpleCompoundI.class);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount");
		Interest obj=new Interest();
		double princpal_amount=sc.nextDouble();
		System.out.println("enter the rate");
		int rate=sc.nextInt();
		System.out.println("enter the time");
		int time=sc.nextInt();
		logger.error(obj.SimpleInterest(princpal_amount,rate,time));
		logger.error(obj.CompoundInterest(princpal_amount,rate,time));		
	}

}

