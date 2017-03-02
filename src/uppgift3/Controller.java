package uppgift3;

import java.rmi.RemoteException;

import javax.swing.table.DefaultTableModel;

import Grupp7.uppgift3_ws.*;

public class Controller {

    public static DefaultTableModel getEmployees() throws RemoteException {
        return Utils.getEmployees();
    }

    public static DefaultTableModel getEmployeeRelatives() throws RemoteException {
        return Utils.getEmployeeRelatives();
    }

    public static DefaultTableModel getSickleave() throws RemoteException {
        return Utils.getSickleave();
    }

    public static DefaultTableModel getMostSick() throws RemoteException {
        return Utils.getMostSick();
    }

    public static DefaultTableModel getKeys() throws RemoteException {
        return Utils.getKeys();
    }

    public static DefaultTableModel getIndices() throws RemoteException {
        return Utils.getIndices();
    }

    public static DefaultTableModel getConstraints() throws RemoteException {
        return Utils.getConstraints();
    }

    public static DefaultTableModel getTablesOne() throws RemoteException {
        return Utils.getTablesOne();
    }
    
    public static DefaultTableModel getTablesTwo() throws RemoteException {
        return Utils.getTablesTwo();
    }

    public static DefaultTableModel getColumnsOne() throws RemoteException {
        return Utils.getColumnsOne();
    }
    
    public static DefaultTableModel getColumnsTwo() throws RemoteException {
        return Utils.getColumnsTwo();
    }

    public static int updateEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Utils.updateEmployee(employeeNumber, firstname, lastname);
    }

    public static int addEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Utils.addEmployee(employeeNumber, firstname, lastname);
    }

    public static int deleteEmployee(String employeeNumber) throws RemoteException {
        return Utils.deleteEmployee(employeeNumber);
    }
}
