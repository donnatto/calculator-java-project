/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Alumno
 */
public class PilaCaracteres {

  int cima;
  String[] PilaVector;

  public PilaCaracteres(int tam) {
    PilaVector = new String[tam];
    cima = -1;
  }

  public void poner(String dato) {
    cima = cima + 1;
    PilaVector[cima] = dato;
  }

  public String sacar() {
    String aux;

    aux = PilaVector[cima];
    cima = cima - 1;

    return aux;
  }

  public int getCima() {
    return cima;
  }
  
  public String observar(){
    String aux;
    
    aux = PilaVector[cima];
    return aux;
  }

  public String getPilaVector(int n) {
    return PilaVector[n];
  }
  
}
