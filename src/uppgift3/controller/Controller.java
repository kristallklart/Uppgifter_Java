package uppgift3.controller;

import java.rmi.RemoteException;

import Grupp7.uppgift3_ws.*;
import uppgift3.dataAccessLayer.*;

public class Controller {

    public static Employee[] getEmployees() throws RemoteException {
        return Dal.getEmployees();
    }

    public static EmployeeRelative[] getEmployeeRelatives() throws RemoteException {
        return Dal.getEmployeeRelatives();
    }

    public static Employee[] getSickleave() throws RemoteException {
        return Dal.getSickleave();
    }

    public static Employee[] getMostSick() throws RemoteException {
        return Dal.getMostSick();
    }

    public static String[] getKeys() throws RemoteException {
        return Dal.getKeys();
    }

    public static Index[] getIndices() throws RemoteException {
        return Dal.getIndices();
    }

    public static TableConstraint[] getConstraints() throws RemoteException {
        return Dal.getConstraints();
    }

    public static String[] getTablesOne() throws RemoteException {
        return Dal.getTablesOne();
    }
    
    public static String[] getTablesTwo() throws RemoteException {
        return Dal.getTablesTwo();
    }

    public static String[] getColumnsOne() throws RemoteException {
        return Dal.getColumnsOne();
    }
    
    public static String[] getColumnsTwo() throws RemoteException {
        return Dal.getColumnsTwo();
    }

    public static int updateEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Dal.updateEmployee(employeeNumber, firstname, lastname);
    }

    public static int addEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Dal.addEmployee(employeeNumber, firstname, lastname);
    }

    public static int deleteEmployee(String employeeNumber) throws RemoteException {
        return Dal.deleteEmployee(employeeNumber);
    }
}
