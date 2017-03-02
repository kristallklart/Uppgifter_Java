/**
 * Uppgift2_ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift1_2_ws;

public interface Uppgift2_ServiceSoap extends java.rmi.Remote {
    public Grupp7.uppgift1_2_ws.User[] getAllUsers() throws java.rmi.RemoteException;
    public Grupp7.uppgift1_2_ws.Purpose[] getAllPurposes() throws java.rmi.RemoteException;
    public Grupp7.uppgift1_2_ws.Location[] getAllLocations() throws java.rmi.RemoteException;
    public Grupp7.uppgift1_2_ws.UserLocationPurpose[] getAllUserLocationPurposes() throws java.rmi.RemoteException;
    public Grupp7.uppgift1_2_ws.FieldOfProfession[] getAllFieldOfProfessions() throws java.rmi.RemoteException;
    public Grupp7.uppgift1_2_ws.Message[] getAllMessages() throws java.rmi.RemoteException;
    public Grupp7.uppgift1_2_ws.Match[] getAllMatches() throws java.rmi.RemoteException;
}
