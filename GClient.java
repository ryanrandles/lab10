package edu.uab.cs203.playground;

import java.rmi.RemoteException;

import edu.uab.cs203.Objectmon;
import edu.uab.cs203.Team;
import edu.uab.cs203.network.GymClient;

public class GClient implements GymClient {

	@Override
	public Team<Objectmon> getTeam() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objectmon networkApplyDamage(Objectmon arg0, Objectmon arg1, int arg2) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void networkTick() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Objectmon nextObjectmon() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printMessage(String arg0) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeam(Team arg0) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
