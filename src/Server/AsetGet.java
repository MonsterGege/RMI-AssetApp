/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import KoneksiDB.Koneksi;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interface.getAset;
/**
 *
 * @author Eberhend
 */
public class AsetGet extends UnicastRemoteObject implements getAset{

    public AsetGet() throws RemoteException{
        
    }
    
    @Override
    public String getData() throws RemoteException {
        try {
            Koneksi con = new Koneksi();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AsetGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
