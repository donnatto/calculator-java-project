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
public class PilaNros {

  int cima;
  double[] PilaVector;

  public PilaNros(int tam) {
    PilaVector = new double[tam];
    cima = -1;
  }

  public void poner(double dato) {
    cima = cima + 1;
    PilaVector[cima] = dato;
  }

  public double sacar() {
    double aux;

    aux = PilaVector[cima];
    cima = cima - 1;

    return aux;
  }
}
