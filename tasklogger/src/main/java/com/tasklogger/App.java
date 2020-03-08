package com.tasklogger;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	//@SuppressWarnings("unused");
	private static Scanner in;
	public static void getInterest() {
		LOGGER.debug("enter principal amount ");
		double p=in.nextDouble();
		LOGGER.debug("enter time period ");
		double t= in.nextDouble();
		LOGGER.debug("Enter rate of interest ");
		double r=in.nextDouble();
		Interest i=new Interest(p,t,r);
		LOGGER.debug("\noption 1- calculate simple interest\nOption 2- Calculates the compound interest\nEnter option ");
		int  op=in.nextInt();
		if(op==1) {
			LOGGER.debug("Simple Interest is "+i.getSimpleinterest());
		}
		else {
			LOGGER.debug("Compound Interest is "+i.getCompoundInterest());
		}
	}
	public static void getCostofBuliding() {
		LOGGER.debug("• Option 1-standard materials\n• Option 2-use above standard materials\n• Option 3-high standard material\n• Option 4-high standard material and fully automated home\n Enter the type material requried for type of constuction of buliding ");
		int op2=in.nextInt();
		LOGGER.debug("Enter the area of the land to estimate the cost of buliding ");
		double area=in.nextDouble();
		Building b=new Building(area,op2);
		LOGGER.debug("Cost for construction of buliding is "+b.getCostOfBuilding());
	}
	
    public static void main( String[] args )
    {
    	in =new Scanner(System.in);
        while(true) {
        	LOGGER.debug("\n1 opion one to claculate Interest\n2 option to calculate the cost for buliding a buliding\n3 option to exit\n");
        	LOGGER.debug("Enter option ");
        	int option = in.nextInt();
        	switch(option) {
        	case 1:
        		getInterest();
        		break;
        	case 2:
        		getCostofBuliding();
        		break;
        	case 3:
        		in.close();
        		return;
        	default:
        		error();
        	}
        }
    }
    private static void error() {
    	LOGGER.debug("Enter valid opion");
	}
}
