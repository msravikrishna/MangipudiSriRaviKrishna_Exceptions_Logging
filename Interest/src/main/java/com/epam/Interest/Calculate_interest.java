package com.epam.Interest;

public class Calculate_interest {
	   public double getSimpleInterest(double p,double t,double r)
	   {
		   double simple_interest=(p*t*r)/100;
		   return simple_interest;
	   }
	   public double getCompoundInterest(double p,double t,double r)
	   {
		    double q=p;
		   double hr=(1+(r/100));
		  double answer= Math.pow(hr,t);
		   return answer*p-q;
	   }
	}
