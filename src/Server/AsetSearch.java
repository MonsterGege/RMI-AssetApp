/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Interface.SearchAset;
import KoneksiDB.Koneksi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eberhend
 */
public class AsetSearch extends UnicastRemoteObject implements SearchAset {
    public AsetSearch() throws RemoteException{
    
}
    
    
    @Override
    public String searchData(String kode) throws RemoteException {
        try {
            Koneksi con = new Koneksi();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AsetSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
