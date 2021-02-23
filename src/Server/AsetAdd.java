/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Interface.TambahAset;
import KoneksiDB.Koneksi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eberhend
 */
public class AsetAdd extends UnicastRemoteObject implements TambahAset {
    public AsetAdd() throws RemoteException{
        
    }
    @Override
    public String TambahData(String kode, String nama, String kategori, Date tanggal_terima, String bataspemakaian, String masapemakaian, int nilaiaset, int penyusutan) throws RemoteException {
        try {
            Koneksi con = new Koneksi();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AsetAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
