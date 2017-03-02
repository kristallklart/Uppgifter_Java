/**
 * Purpose.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift1_2_ws;

public class Purpose  implements java.io.Serializable {
    private java.lang.String purposeType;

    private Grupp7.uppgift1_2_ws.UserLocationPurpose[] userLocationPurposes;

    public Purpose() {
    }

    public Purpose(
           java.lang.String purposeType,
           Grupp7.uppgift1_2_ws.UserLocationPurpose[] userLocationPurposes) {
           this.purposeType = purposeType;
           this.userLocationPurposes = userLocationPurposes;
    }


    /**
     * Gets the purposeType value for this Purpose.
     * 
     * @return purposeType
     */
    public java.lang.String getPurposeType() {
        return purposeType;
    }


    /**
     * Sets the purposeType value for this Purpose.
     * 
     * @param purposeType
     */
    public void setPurposeType(java.lang.String purposeType) {
        this.purposeType = purposeType;
    }


    /**
     * Gets the userLocationPurposes value for this Purpose.
     * 
     * @return userLocationPurposes
     */
    public Grupp7.uppgift1_2_ws.UserLocationPurpose[] getUserLocationPurposes() {
        return userLocationPurposes;
    }


    /**
     * Sets the userLocationPurposes value for this Purpose.
     * 
     * @param userLocationPurposes
     */
    public void setUserLocationPurposes(Grupp7.uppgift1_2_ws.UserLocationPurpose[] userLocationPurposes) {
        this.userLocationPurposes = userLocationPurposes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Purpose)) return false;
        Purpose other = (Purpose) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.purposeType==null && other.getPurposeType()==null) || 
             (this.purposeType!=null &&
              this.purposeType.equals(other.getPurposeType()))) &&
            ((this.userLocationPurposes==null && other.getUserLocationPurposes()==null) || 
             (this.userLocationPurposes!=null &&
              java.util.Arrays.equals(this.userLocationPurposes, other.getUserLocationPurposes())));
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
        if (getPurposeType() != null) {
            _hashCode += getPurposeType().hashCode();
        }
        if (getUserLocationPurposes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserLocationPurposes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserLocationPurposes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Purpose.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Grupp7", "Purpose"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purposeType");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "PurposeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLocationPurposes");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "UserLocationPurposes"));
        elemField.setXmlType(new javax.xml.namespace.QName("Grupp7", "UserLocationPurpose"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Grupp7", "UserLocationPurpose"));
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
