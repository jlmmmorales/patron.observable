package org.curso.accenture.patron.observable;

import java.util.Observable;

/*
 * Define el elemento que queremos observar
 */

public class DataStore extends Observable {
//Controla cuando hay un nuevo dato de entrada y el observador empieza a funcionar
  private String data;
  
  public String getData() {
    return data;
  }
  
  public void setData(String data) {
    this.data = data;
    setChanged(); //
    notifyObservers(data); //Se notifica a todos los observadores que ha ocurrido algo
  }
}
