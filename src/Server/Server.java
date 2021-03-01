/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Interface.InterfaceAset;
import com.mysql.jdbc.Statement;
import java.util.List;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eberhend
 */
public class Server extends UnicastRemoteObject implements InterfaceAset{
    
    public Server() throws RemoteException{
        super();
    }
    
    public static void main(String[] args) throws RemoteException {
      Registry reg = LocateRegistry.createRegistry(212);
      Server s = new Server();
      reg.rebind("rmi", s);
       System.out.println("Server is Running....");
    }


    @Override
    public ArrayList SearchData(String kode) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Insert(String kode,String nama, String kategori,Date tanggalterima, String bataspemakaian, String masapemakaian,int nilaiaset, int penyusutan) throws RemoteException {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_aset","root","");
            Statement insertP = (Statement) con.createStatement();
            String queryInsert = "insert into tb_aset values('"+kode+"','"+nama+"','"+kategori+"','"+tanggalterima+"','"+bataspemakaian+"','"+masapemakaian+"','"+nilaiaset+"','"+penyusutan+"')";
            
            insertP.executeUpdate(queryInsert);
            
                       
        }catch(ClassNotFoundException e){
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
        }catch (SQLException es){
            return es.toString();
        }
        return "Aset ditambahkan";
    }

    @Override
    public String Delete(String kode) throws RemoteException {
           try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_aset","root","");
            Statement del = (Statement) con.createStatement();
            String sql = "delete from tb_aset where kode_aset='"+kode+"'";
            del.executeUpdate(sql);
            return "Data terhapus";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); 
        return "Data terhapus";
    }

    @Override
    public String Update(String kode, String nama, String kategori, Date tanggalterima, String bataspemakaian, String masapemakaian, int nilaiaset, int penyusutan) throws RemoteException {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_aset","root","");
            Statement updt = (Statement) con.createStatement();
            String sql = "update tb_aset set nama_aset='"+nama+"',kategori_aset='"+kategori+"',tanggal_terima='"+tanggalterima+"',bataspemakaian='"+bataspemakaian+"',masapemakaian='"+masapemakaian+"',nilaiaset='"+nilaiaset+"',penyusutan='"+penyusutan+"' where kode_aset='"+kode+"'";
            updt.executeUpdate(sql);
            return "Data ter-edit";
        }catch(Exception e){
            return (e.toString());
            
        }
        
    }

    @Override
    public List<Aset> getAset() throws RemoteException {
        List<Aset> listaset = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_aset","root","");
            PreparedStatement ps=con.prepareStatement("select * from tb_aset");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){
                Aset aset = new Aset();
                aset.setKode_aset(rs.getString(1));
                aset.setNama_aset(rs.getString(2));
                aset.setKategori_aset(rs.getString(3));
                aset.setTanggal_terima(rs.getDate(4));
                aset.setBataspemakaian(rs.getString(5));
                aset.setMasapemakaian(rs.getString(6));
                aset.setNilaiaset(rs.getInt(7));
                aset.setPenyusutan(rs.getInt(8));
                listaset.add(aset);
                
            }
            
        } catch  (SQLException | ClassNotFoundException e) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
            
        }
        
        return listaset;
    }

}
