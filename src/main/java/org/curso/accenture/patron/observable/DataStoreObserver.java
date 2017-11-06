package org.curso.accenture.patron.observable;

import java.util.Observable;
import java.util.Observer;

/*
 * Es el que nos define que hacer cuando se produzca algo sobre
 * el elemento que esta siendo observado
 */
public class DataStoreObserver implements Observer {
  private String name;
  
  public DataStoreObserver(String name) {
    this.name = name;
    
  }
  
  public void update(Observable o, Object arg) {
    String message = (String) arg;
    System.out.println(name +": "+ message);
  }

}
