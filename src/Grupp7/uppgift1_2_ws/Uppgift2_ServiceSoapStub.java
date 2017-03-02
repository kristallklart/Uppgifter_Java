/**
 * Uppgift2_ServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift1_2_ws;

public class Uppgift2_ServiceSoapStub extends org.apache.axis.client.Stub implements Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllUsers");
        oper.setReturnType(new javax.xml.namespace.QName("Grupp7", "ArrayOfUser"));
        oper.setReturnClass(Grupp7.uppgift1_2_ws.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("Grupp7", "GetAllUsersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("Grupp7", "User"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllPurposes");
        oper.setReturnType(new javax.xml.namespace.QName("Grupp7", "ArrayOfPurpose"));
        oper.setReturnClass(Grupp7.uppgift1_2_ws.Purpose[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("Grupp7", "GetAllPurposesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("Grupp7", "Purpose"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllLocations");
        oper.setReturnType(new javax.xml.namespace.QName("Grupp7", "ArrayOfLocation"));
        oper.setReturnClass(Grupp7.uppgift1_2_ws.Location[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("Grupp7", "GetAllLocationsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("Grupp7", "Location"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllUserLocationPurposes");
        oper.setReturnType(new javax.xml.namespace.QName("Grupp7", "ArrayOfUserLocationPurpose"));
        oper.setReturnClass(Grupp7.uppgift1_2_ws.UserLocationPurpose[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("Grupp7", "GetAllUserLocationPurposesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("Grupp7", "UserLocationPurpose"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllFieldOfProfessions");
        oper.setReturnType(new javax.xml.namespace.QName("Grupp7", "ArrayOfFieldOfProfession"));
        oper.setReturnClass(Grupp7.uppgift1_2_ws.FieldOfProfession[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("Grupp7", "GetAllFieldOfProfessionsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("Grupp7", "FieldOfProfession"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllMessages");
        oper.setReturnType(new javax.xml.namespace.QName("Grupp7", "ArrayOfMessage"));
        oper.setReturnClass(Grupp7.uppgift1_2_ws.Message[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("Grupp7", "GetAllMessagesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("Grupp7", "Message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllMatches");
        oper.setReturnType(new javax.xml.namespace.QName("Grupp7", "ArrayOfMatch"));
        oper.setReturnClass(Grupp7.uppgift1_2_ws.Match[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("Grupp7", "GetAllMatchesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("Grupp7", "Match"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public Uppgift2_ServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Uppgift2_ServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Uppgift2_ServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("Grupp7", "ArrayOfFieldOfProfession");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.FieldOfProfession[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("Grupp7", "FieldOfProfession");
            qName2 = new javax.xml.namespace.QName("Grupp7", "FieldOfProfession");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Grupp7", "ArrayOfLocation");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Location[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("Grupp7", "Location");
            qName2 = new javax.xml.namespace.QName("Grupp7", "Location");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Grupp7", "ArrayOfMatch");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Match[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("Grupp7", "Match");
            qName2 = new javax.xml.namespace.QName("Grupp7", "Match");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Grupp7", "ArrayOfMessage");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Message[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("Grupp7", "Message");
            qName2 = new javax.xml.namespace.QName("Grupp7", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Grupp7", "ArrayOfPurpose");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Purpose[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("Grupp7", "Purpose");
            qName2 = new javax.xml.namespace.QName("Grupp7", "Purpose");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Grupp7", "ArrayOfUser");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("Grupp7", "User");
            qName2 = new javax.xml.namespace.QName("Grupp7", "User");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Grupp7", "ArrayOfUserLocationPurpose");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.UserLocationPurpose[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("Grupp7", "UserLocationPurpose");
            qName2 = new javax.xml.namespace.QName("Grupp7", "UserLocationPurpose");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Grupp7", "FieldOfProfession");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.FieldOfProfession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Grupp7", "Location");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Grupp7", "Match");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Match.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Grupp7", "Message");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Grupp7", "Purpose");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.Purpose.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Grupp7", "User");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Grupp7", "UserLocationPurpose");
            cachedSerQNames.add(qName);
            cls = Grupp7.uppgift1_2_ws.UserLocationPurpose.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public Grupp7.uppgift1_2_ws.User[] getAllUsers() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Grupp7/GetAllUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("Grupp7", "GetAllUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Grupp7.uppgift1_2_ws.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Grupp7.uppgift1_2_ws.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, Grupp7.uppgift1_2_ws.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Grupp7.uppgift1_2_ws.Purpose[] getAllPurposes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Grupp7/GetAllPurposes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("Grupp7", "GetAllPurposes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Grupp7.uppgift1_2_ws.Purpose[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Grupp7.uppgift1_2_ws.Purpose[]) org.apache.axis.utils.JavaUtils.convert(_resp, Grupp7.uppgift1_2_ws.Purpose[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Grupp7.uppgift1_2_ws.Location[] getAllLocations() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Grupp7/GetAllLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("Grupp7", "GetAllLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Grupp7.uppgift1_2_ws.Location[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Grupp7.uppgift1_2_ws.Location[]) org.apache.axis.utils.JavaUtils.convert(_resp, Grupp7.uppgift1_2_ws.Location[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Grupp7.uppgift1_2_ws.UserLocationPurpose[] getAllUserLocationPurposes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Grupp7/GetAllUserLocationPurposes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("Grupp7", "GetAllUserLocationPurposes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Grupp7.uppgift1_2_ws.UserLocationPurpose[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Grupp7.uppgift1_2_ws.UserLocationPurpose[]) org.apache.axis.utils.JavaUtils.convert(_resp, Grupp7.uppgift1_2_ws.UserLocationPurpose[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Grupp7.uppgift1_2_ws.FieldOfProfession[] getAllFieldOfProfessions() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Grupp7/GetAllFieldOfProfessions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("Grupp7", "GetAllFieldOfProfessions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Grupp7.uppgift1_2_ws.FieldOfProfession[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Grupp7.uppgift1_2_ws.FieldOfProfession[]) org.apache.axis.utils.JavaUtils.convert(_resp, Grupp7.uppgift1_2_ws.FieldOfProfession[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Grupp7.uppgift1_2_ws.Message[] getAllMessages() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Grupp7/GetAllMessages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("Grupp7", "GetAllMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Grupp7.uppgift1_2_ws.Message[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Grupp7.uppgift1_2_ws.Message[]) org.apache.axis.utils.JavaUtils.convert(_resp, Grupp7.uppgift1_2_ws.Message[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public Grupp7.uppgift1_2_ws.Match[] getAllMatches() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Grupp7/GetAllMatches");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("Grupp7", "GetAllMatches"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (Grupp7.uppgift1_2_ws.Match[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (Grupp7.uppgift1_2_ws.Match[]) org.apache.axis.utils.JavaUtils.convert(_resp, Grupp7.uppgift1_2_ws.Match[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
