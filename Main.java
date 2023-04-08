// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
// C = 5 * ((F-32) / 9).

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Informe a temperatura que está na sua região: ");
    Scanner teclado = new Scanner(System.in);
    double tempFahren = teclado.nextDouble();

    double conversaoCelsius = 5 * ((tempFahren - 32) / 9);

    System.out.println("A temperatura convertida para celsius: " + conversaoCelsius);

  }
}