/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Eberhend
 */
public class Server {
    public static void main(String[] args) throws RemoteException,NotBoundException{
        Registry reg = LocateRegistry.createRegistry(212);
        AsetGet ag = new AsetGet();
        AsetAdd ad = new AsetAdd();
        AsetDelete adl = new AsetDelete();
        AsetUpdate up = new AsetUpdate();
        AsetSearch sc = new AsetSearch();
        reg.rebind("AmbilData", ag);
        reg.rebind("TambahData",ad);
        reg.rebind("DeleteData", adl);
        reg.rebind("EditData", up);
        reg.rebind("SearchData", sc);
    }
}
