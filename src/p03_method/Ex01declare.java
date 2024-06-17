package p03_method;

import common.Utils;

public class Ex01declare {
  boolean b1;
  // return type (10가지)
  // return 없는 경우 : void
  // return 있는 경우 : primitive, reference (9가지)
  void print1() {
    System.out.println("Hello method~!");
    return; // 암묵적으로 return 생략
  }
  boolean print2() {
    /* boolean result;
    Ex01declare ex01declare = new Ex01declare();
    result = ex01declare.b1;
    return result; */
    return new Ex01declare().b1; // false를 리턴
  }
  char print3() {
    return 'C';
  }
  int print4() {
    return 10;
  }
  int print6() {
    return (int) 0.0;
  }
  double print5() {
    return 10;
  }
  boolean print() {
    boolean result = false;
    return result;
  }
  boolean print(boolean result) {
    return result;
  }
  char print(char c) {
    return c;
  }
  int print(int i) {
    return i;
  }
  double print(double db) {
    return db;
  }
  public static void main(String[] args) {
    Ex01declare e1 = new Ex01declare();
    e1.print1();
    System.out.println(e1.print2());
    System.out.println(e1.print());
    System.out.println(e1.print(true));
    System.out.println(e1.print('Z'));
    System.out.println(e1.print(1));
    System.out.println(e1.print(1.1));
    Utils.typeOf(10/3);
    System.out.println(MyMath.divied(10, 3));
    System.out.println(Math.max(1,3));
    System.out.println(MyMath.share(10, 3));
  }
}

class MyMath {
  static double add(int n1, int n2) {
    //return n1 + n2;
    //return (double) (n1 + n2);
    return n1 + n2 + 0.0;
  }
  static int subtract(int n1, int n2) {
    return n1 - n2;
  }

  static int multiply(int n1, int n2) {
    return n1 * n2;
  }

  static double divied(int n1, int n2) {
    // double result = (double) (n1 / n2);
    double result = n1 / (double) n2;
    return result;

  }
  public static int share(int n1, int n2) {
    return n1 / n2;
  }
  public static int remain(int n1, int n2) {
    return n1 % n2;
  }
  public static void shareRemain(int n1 ,int n2) {
    System.out.println("몫" + share(n1, n2));
    System.out.println("나머지" + remain(n1, n2));
  }

  public static void main(String[] args) {
    MyMath m1 = new MyMath();
    System.out.println(m1.add(1, 1));
    System.out.println(m1.subtract(1, 2));
    System.out.println(m1.multiply(8, 8));
    System.out.println(m1.divied(3, 5));
  }

}