/**
 * Uppgift2_ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7;

public interface Uppgift2_ServiceSoap extends java.rmi.Remote {
    public Grupp7.User[] getAllUsers() throws java.rmi.RemoteException;
    public Grupp7.Purpose[] getAllPurposes() throws java.rmi.RemoteException;
    public Grupp7.Location[] getAllLocations() throws java.rmi.RemoteException;
    public Grupp7.UserLocationPurpose[] getAllUserLocationPurposes() throws java.rmi.RemoteException;
    public Grupp7.FieldOfProfession[] getAllFieldOfProfessions() throws java.rmi.RemoteException;
}
