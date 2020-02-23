package com.epam.Interest;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client_application {
	private static final Logger LOGGER=LogManager.getLogger(Client_application.class);
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 String str=null;
		 Calculate_interest m=new Calculate_interest();
		LOGGER.info("Enter the principle amount");
         double principle=scan.nextDouble();
         LOGGER.info("Enter the time period");
         double time_period=scan.nextDouble();
          LOGGER.info("Enter the rate of interest");
         double rateofinterest=scan.nextDouble();
         do {
          LOGGER.info("\n1.Simple Interest\n2.Compound Interest");
         LOGGER.info("Enter the choice");
         int n=scan.nextInt();
         switch(n)
         {
         case 1:
        	  LOGGER.info(m.getSimpleInterest(principle,time_period,rateofinterest));
        	  break;
         case 2:
        	 LOGGER.info(m.getCompoundInterest(principle,time_period,rateofinterest));
        	  break;
         }
         LOGGER.info("Do you want to continue Y/N?");
         str=scan.next();
	}while(str.equalsIgnoreCase("Y"));
         scan.close();
	}

}