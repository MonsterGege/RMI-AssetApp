/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;

/**
 *
 * @author Eberhend
 */
public interface TambahAset extends Remote{
    public String TambahData(String kode,String nama,String kategori, Date tanggal_terima,String bataspemakaian,String masapemakaian,int nilaiaset, int penyusutan) throws RemoteException;
}
