package com.flor2014.alberto;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class UtilsMath {
   public static double roundAndPrint(double n, int round2DecimalPlace) {
      BigDecimal instance = new BigDecimal(Double.toString(n));
      instance = instance.setScale(round2DecimalPlace, RoundingMode.HALF_UP);      
      return instance.doubleValue();
   }

   public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
  }

  public static int generaNumeroInt(int min, int max){
    return (int)(Math.random()*(max-min+1)+min); 
  }

  public static double generaNumeroDouble(int min, int max){
    return (double) Math.random()*(max-min+1)+min;    
  }

}