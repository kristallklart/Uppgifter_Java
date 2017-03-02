package uppgift3;

import java.rmi.RemoteException;

import javax.swing.table.DefaultTableModel;

import Grupp7.uppgift3_ws.*;

public class Uppgift3Controller {

    public static DefaultTableModel getEmployees() throws RemoteException {
        return Uppgift3Utils.getEmployees();
    }

    public static DefaultTableModel getEmployeeRelatives() throws RemoteException {
        return Uppgift3Utils.getEmployeeRelatives();
    }

    public static DefaultTableModel getSickleave() throws RemoteException {
        return Uppgift3Utils.getSickleave();
    }

    public static DefaultTableModel getMostSick() throws RemoteException {
        return Uppgift3Utils.getMostSick();
    }

    public static DefaultTableModel getKeys() throws RemoteException {
        return Uppgift3Utils.getKeys();
    }

    public static DefaultTableModel getIndices() throws RemoteException {
        return Uppgift3Utils.getIndices();
    }

    public static DefaultTableModel getConstraints() throws RemoteException {
        return Uppgift3Utils.getConstraints();
    }

    public static DefaultTableModel getTablesOne() throws RemoteException {
        return Uppgift3Utils.getTablesOne();
    }
    
    public static DefaultTableModel getTablesTwo() throws RemoteException {
        return Uppgift3Utils.getTablesTwo();
    }

    public static DefaultTableModel getColumnsOne() throws RemoteException {
        return Uppgift3Utils.getColumnsOne();
    }
    
    public static DefaultTableModel getColumnsTwo() throws RemoteException {
        return Uppgift3Utils.getColumnsTwo();
    }

    public static int updateEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Uppgift3Utils.updateEmployee(employeeNumber, firstname, lastname);
    }

    public static int addEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Uppgift3Utils.addEmployee(employeeNumber, firstname, lastname);
    }

    public static int deleteEmployee(String employeeNumber) throws RemoteException {
        return Uppgift3Utils.deleteEmployee(employeeNumber);
    }
}
