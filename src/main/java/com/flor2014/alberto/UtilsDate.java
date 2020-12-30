package com.flor2014.alberto;
import java.util.GregorianCalendar;

public class UtilsDate {
  protected static String generaFechaAleatoria(){
    GregorianCalendar gc = new GregorianCalendar();
    int year = UtilsMath.randBetween(1900, 2010);

      gc.set(gc.YEAR, year);

      int dayOfYear = UtilsMath.randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

      gc.set(gc.DAY_OF_YEAR, dayOfYear);

      String fecha = gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);
      //System.out.println(fecha);
      return fecha;
  }
}