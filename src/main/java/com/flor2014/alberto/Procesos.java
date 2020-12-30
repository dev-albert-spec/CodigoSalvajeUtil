package com.flor2014.alberto;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Procesos {
  public Procesos(){}
  public List<Item> llenaLista(){
    int total = UtilsMath.generaNumeroInt(1,25);
    List<Item> items = new ArrayList<>();
    for(int i = 0; i < total; i++){
      Item item = new Item();
      item.setId(i+1);
      item.setTipo(Constantes.TIPOS[UtilsMath.generaNumeroInt(0,5)]);
      item.setValue(Utils.generaValor(item.getTipo()));
      items.add(item);
    }
    return items;
  }

  public Map<String,List<Item>> llenaMapa(List<Item> items){
    Map<String,List<Item>> mapa = new HashMap<>();
    mapa.put(Constantes.LLAVES[UtilsMath.generaNumeroInt(0,5)], items);
    return mapa;
  }
  
  public String getLlave(Map mapa){
      String llave = "";
      for (String LLAVES : Constantes.LLAVES) {
          if (mapa.containsKey(LLAVES)) {
              llave = LLAVES; 
              break;
          }
      }
      return llave;
  }
}