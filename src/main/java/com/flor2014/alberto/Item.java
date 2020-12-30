package com.flor2014.alberto;

public class Item {
  private Integer id;
  private Object value;
  private String tipo;

  public Integer getId(){
    return this.id;
  }

  public void setId(Integer id){
    this.id = id;
  }

  public Object getValue(){
    return this.value;
  }

  public void setValue(Object value){
    this.value = value;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public Item(){}
}