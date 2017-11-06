package org.curso.accenture.patron.observable;

public class Client {
  public static void main(String [] args) {
    DataStore observable = new DataStore();
    DataStoreObserver observer1 = new DataStoreObserver("Observer 1");
    DataStoreObserver observer2 = new DataStoreObserver("Observer 2");
    
    observable.addObserver(observer1);
    observable.addObserver(observer2);
    
    observable.setData("Hola");
    System.out.println("Número de observables: "+ observable.countObservers());
    
    DataStoreObserver observer3 = new DataStoreObserver("Observer 3");
    observable.addObserver(observer3);
    
    observable.setData("Adios");
    System.out.println("Número de observables: "+ observable.countObservers());
    
    observable.deleteObserver(observer2);
    observable.setData("He madato al 2");
    System.out.println("Número de observables: "+ observable.countObservers());
  }
}
