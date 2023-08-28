package com.codetalksdna.CodingPrograms;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

 interface BinaryToDecimalInterface extends Remote {
    int binaryToDecimal(String binary) throws RemoteException;
}

 class BinaryToDecimalImpl extends UnicastRemoteObject implements BinaryToDecimalInterface {
    protected BinaryToDecimalImpl() throws RemoteException {
        super();
    }

    @Override
    public int binaryToDecimal(String binary) throws RemoteException {
        return Integer.parseInt(binary, 2);
    }
}

public class BinaryToDecimalServer {
    public static void main(String[] args) {
        try {
            BinaryToDecimalInterface binaryToDecimal = new BinaryToDecimalImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("BinaryToDecimalService", binaryToDecimal);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}

