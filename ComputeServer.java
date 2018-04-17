
package edu.uab.cs203.playground;
import java.rmi.*;

public interface ComputeServer extends Remote {
  Object compute(Task task) throws RemoteException;

  String sayHello() throws RemoteException;
}