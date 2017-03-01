/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift3_ws;

public interface Uppgift3_ServiceSoap extends java.rmi.Remote {
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public Grupp7.uppgift3_ws.Employee[] getEmployees() throws java.rmi.RemoteException;
    public Grupp7.uppgift3_ws.EmployeeRelative[] getEmployeeRelatives() throws java.rmi.RemoteException;
    public Grupp7.uppgift3_ws.Employee[] getSickleave() throws java.rmi.RemoteException;
    public Grupp7.uppgift3_ws.Employee[] getMostSick() throws java.rmi.RemoteException;
    public java.lang.String[] getKeys() throws java.rmi.RemoteException;
    public Grupp7.uppgift3_ws.Index[] getIndices() throws java.rmi.RemoteException;
    public Grupp7.uppgift3_ws.TableConstraint[] getConstraints() throws java.rmi.RemoteException;
    public java.lang.String[] getTablesOne() throws java.rmi.RemoteException;
    public java.lang.String[] getTablesTwo() throws java.rmi.RemoteException;
    public java.lang.String[] getColumnsOne() throws java.rmi.RemoteException;
    public java.lang.String[] getColumnsTwo() throws java.rmi.RemoteException;
    public int updateEmployee(java.lang.String employeeNumber, java.lang.String firstname, java.lang.String lastname) throws java.rmi.RemoteException;
    public int addEmployee(java.lang.String employeeNumber, java.lang.String firstname, java.lang.String lastname) throws java.rmi.RemoteException;
    public int deleteEmployee(java.lang.String employeeNumber) throws java.rmi.RemoteException;
}
