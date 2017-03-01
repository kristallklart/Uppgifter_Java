/**
 * UserLocationPurpose.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7;

public class UserLocationPurpose  implements java.io.Serializable {
    private Grupp7.User user;

    private Grupp7.Location location;

    private Grupp7.Purpose purpose;

    private java.lang.String city;

    private java.lang.String username;

    private java.lang.String purposetype;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    public UserLocationPurpose() {
    }

    public UserLocationPurpose(
           Grupp7.User user,
           Grupp7.Location location,
           Grupp7.Purpose purpose,
           java.lang.String city,
           java.lang.String username,
           java.lang.String purposetype,
           java.util.Calendar fromDate,
           java.util.Calendar toDate) {
           this.user = user;
           this.location = location;
           this.purpose = purpose;
           this.city = city;
           this.username = username;
           this.purposetype = purposetype;
           this.fromDate = fromDate;
           this.toDate = toDate;
    }


    /**
     * Gets the user value for this UserLocationPurpose.
     * 
     * @return user
     */
    public Grupp7.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this UserLocationPurpose.
     * 
     * @param user
     */
    public void setUser(Grupp7.User user) {
        this.user = user;
    }


    /**
     * Gets the location value for this UserLocationPurpose.
     * 
     * @return location
     */
    public Grupp7.Location getLocation() {
        return location;
    }


    /**
     * Sets the location value for this UserLocationPurpose.
     * 
     * @param location
     */
    public void setLocation(Grupp7.Location location) {
        this.location = location;
    }


    /**
     * Gets the purpose value for this UserLocationPurpose.
     * 
     * @return purpose
     */
    public Grupp7.Purpose getPurpose() {
        return purpose;
    }


    /**
     * Sets the purpose value for this UserLocationPurpose.
     * 
     * @param purpose
     */
    public void setPurpose(Grupp7.Purpose purpose) {
        this.purpose = purpose;
    }


    /**
     * Gets the city value for this UserLocationPurpose.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this UserLocationPurpose.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the username value for this UserLocationPurpose.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserLocationPurpose.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the purposetype value for this UserLocationPurpose.
     * 
     * @return purposetype
     */
    public java.lang.String getPurposetype() {
        return purposetype;
    }


    /**
     * Sets the purposetype value for this UserLocationPurpose.
     * 
     * @param purposetype
     */
    public void setPurposetype(java.lang.String purposetype) {
        this.purposetype = purposetype;
    }


    /**
     * Gets the fromDate value for this UserLocationPurpose.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this UserLocationPurpose.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this UserLocationPurpose.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this UserLocationPurpose.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserLocationPurpose)) return false;
        UserLocationPurpose other = (UserLocationPurpose) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.purpose==null && other.getPurpose()==null) || 
             (this.purpose!=null &&
              this.purpose.equals(other.getPurpose()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.purposetype==null && other.getPurposetype()==null) || 
             (this.purposetype!=null &&
              this.purposetype.equals(other.getPurposetype()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPurpose() != null) {
            _hashCode += getPurpose().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPurposetype() != null) {
            _hashCode += getPurposetype().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserLocationPurpose.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Grupp7", "UserLocationPurpose"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("Grupp7", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("Grupp7", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purpose");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Purpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("Grupp7", "Purpose"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purposetype");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Purposetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "FromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "ToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
