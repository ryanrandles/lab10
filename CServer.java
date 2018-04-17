package edu.uab.cs203.playground;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class CServer extends UnicastRemoteObject implements ComputeServer {
  public CServer() throws RemoteException {

  }

  public Object compute(Task task) {
    return task.calculate();
  }

  public String sayHello() {
    return "HELLO!";
  }

  public static void main(String[] args) {
    try {
      Runtime.getRuntime().exec("rmiregistry 9999");
      Registry registry = LocateRegistry.createRegistry(9999);

      CServer server = new CServer();

      registry.bind("ComputeServer", server);

    } catch (Exception e) {
      e.printStackTrace(System.err);
      System.exit(-1);
    }

    System.out.println("Ready to receive tasks");
    return;
  }
}
