/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Server.Aset;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;

/**
 *
 * @author Eberhend
 */
public interface InterfaceAset extends Remote {

    /**
     *
     * @return
     * @throws RemoteException
     */
    public List<Aset> getAset() throws RemoteException;
    public List<Aset> SearchData(String kode) throws RemoteException;
    public String Insert(String kode,String nama, String kategori,Date tanggalterima, String bataspemakaian, String masapemakaian,int nilaiaset, int penyusutan) throws RemoteException;
    public String Delete(String kode) throws RemoteException;
    public String Update(String kode,String nama, String kategori,Date tanggalterima, String bataspemakaian, String masapemakaian,int nilaiaset, int penyusutan) throws RemoteException;
}
