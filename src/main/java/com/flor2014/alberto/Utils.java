package com.flor2014.alberto;
import java.util.Random;

public class Utils {
  
  protected static Object generaValor(String tipo){
    Object objecto = new Object();
    switch(tipo){
      case "String":
        objecto = givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect();
        break;
      case "Integer":
        objecto = UtilsMath.generaNumeroInt(100,999);
        break; 
      case "Double":
      case "BigDecimal":        
        objecto = UtilsMath.generaNumeroDouble(100,999);;
        break;
      case "Boolean":
        objecto = UtilsMath.generaNumeroInt(0,1);
        break;
      case "Date":
        objecto = UtilsDate.generaFechaAleatoria();
        break; 
    }
    return objecto;
  }

  protected static String givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();

    String generatedString = random.ints(leftLimit, rightLimit + 1)
      .limit(targetStringLength)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();

    //System.out.println(generatedString);
    return generatedString;
  }
}