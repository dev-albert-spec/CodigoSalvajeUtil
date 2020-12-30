package com.flor2014.alberto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
  public static void main(String[] args) {    
    Procesos procesos = new Procesos();
    int total = UtilsMath.generaNumeroInt(1,25);
    List<Map<String,List<Item>>> listaPrincipal = new ArrayList<>();
    for(int i=0;i<total;i++){
      List<Item> listaDetalle = procesos.llenaLista();
      Map<String,List<Item>> mapa = procesos.llenaMapa(listaDetalle);
      listaPrincipal.add(mapa);
      mapa = null;
      listaDetalle = null;
    }

    System.out.println("Total lista principal " + total);
    Object[]  arreglo = listaPrincipal.toArray();
    for (Object o : arreglo) {
      String llave = procesos.getLlave((HashMap)o);
      List<Item> items = (List<Item>) ((HashMap)o).get(llave);
      System.out.println(llave);
      items.forEach((item) -> {
          System.out.println(item.getTipo() +": "+ item.getValue());
      });
    }
  }
} 