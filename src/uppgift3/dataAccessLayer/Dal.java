package uppgift3.dataAccessLayer;
import java.rmi.RemoteException;


import Grupp7.uppgift3_ws.*;

public class Dal {
	
	static Uppgift3_ServiceSoapProxy proxy = new Uppgift3_ServiceSoapProxy();
	
	public static Employee[] getEmployees() throws RemoteException {
        return proxy.getEmployees();
    }

    public static EmployeeRelative[] getEmployeeRelatives() throws RemoteException {
        return proxy.getEmployeeRelatives();
    }

    public static Employee[] getSickleave() throws RemoteException {
        return proxy.getSickleave();
    }

    public static Employee[] getMostSick() throws RemoteException {
        return proxy.getMostSick();
    }

    public static String[] getKeys() throws RemoteException {
        return proxy.getKeys();
    }

    public static Index[] getIndices() throws RemoteException {
        return proxy.getIndices();
    }

    public static TableConstraint[] getConstraints() throws RemoteException {
        return proxy.getConstraints();
    }

    public static String[] getTablesOne() throws RemoteException {
        return proxy.getTablesOne();
    }
    
    public static String[] getTablesTwo() throws RemoteException {
        return proxy.getTablesTwo();
    }

    public static String[] getColumnsOne() throws RemoteException {
        return proxy.getColumnsOne();
    }
    
    public static String[] getColumnsTwo() throws RemoteException {
        return proxy.getColumnsTwo();
    }

    public static int updateEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return proxy.updateEmployee(employeeNumber, firstname, lastname);
    }

    public static int addEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return proxy.addEmployee(employeeNumber, firstname, lastname);
    }

    public static int deleteEmployee(String employeeNumber) throws RemoteException {
        return proxy.deleteEmployee(employeeNumber);
    }

}
