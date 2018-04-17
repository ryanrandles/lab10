package edu.uab.cs203.playground;

import java.rmi.*;
import java.rmi.registry.*;
import java.io.Serializable;

public class Power implements Task, Serializable {
  private int m;
  private int n;

  Power(int m, int n) {
    this.m  = m;
    this.n = n;
  }

  public Object calculate() {
    int res = power(this.m, this.n);
    return new Integer(res);
  }

  private int power(int m, int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return m;
    }

    int j = m * power(m, n - 1);

    return j;
  }

  public static void main(String[] args) {
    String host = "localhost";
    int port = 9999;

    Power p = new Power(5, 10);

    try {
      Registry registry = LocateRegistry.getRegistry(host, port);

      ComputeServer stub = (ComputeServer) registry.lookup("ComputeServer");
      
      String s = stub.sayHello();
      System.out.println(s);

      Integer power = (Integer) stub.compute(p);
      System.out.println(power);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}