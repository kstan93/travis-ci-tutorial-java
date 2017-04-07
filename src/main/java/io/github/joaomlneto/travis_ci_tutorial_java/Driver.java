package io.github.joaomlneto.travis_ci_tutorial_java;

/**
 * Created by Kimmy on 4/7/17.
 */
public class Driver {
  public static void main(String[] args) {
    int x = 10;
    int result = 0;
    SimpleCalculator calc = new SimpleCalculator();
    result = calc.mul(x, 3);
    result = calc.mul(result, 7);
    result = calc.mul(result, 13);
    result = calc.mul(result, 37);
    System.out.println("Result: " + result);

  }

}
