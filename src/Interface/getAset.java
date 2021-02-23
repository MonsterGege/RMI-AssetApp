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
public interface getAset extends Remote {
    public String getData() throws RemoteException;
}
