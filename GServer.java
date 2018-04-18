package edu.uab.cs203.playground;

import java.awt.List;
import java.rmi.RemoteException;

import edu.uab.cs203.Team;
import edu.uab.cs203.network.GymServer;

public class GServer implements GymServer {
	
	private Team listA;
	private Team listB;
	private String message;
	private boolean Bisready;
	private boolean Aisready;

	@Override
	public String networkToString() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printMessage(String message) throws RemoteException {
		this.message = message;
				System.out.println("This will, like, be a message or something..");	
	}

	@Override
	public void registerClientA(String host, int port, String registryName) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerClientB(String host, int port, String registryName) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeamA(Team teamA) throws RemoteException {
		this.listA = teamA;
	}

	@Override
	public void setTeamAReady(boolean ready) throws RemoteException {
		// TODO Auto-generated method stub
	}

	@Override
	public void setTeamB(Team teamB) throws RemoteException {
		this.listB = teamB;
		
	}

	@Override
	public void setTeamBReady(boolean ready) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
