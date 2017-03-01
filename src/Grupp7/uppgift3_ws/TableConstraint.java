/**
 * TableConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift3_ws;

public class TableConstraint  implements java.io.Serializable {
    private java.lang.String tableConstraintCatalog;

    private java.lang.String name;

    private java.lang.String tableCatalog;

    public TableConstraint() {
    }

    public TableConstraint(
           java.lang.String tableConstraintCatalog,
           java.lang.String name,
           java.lang.String tableCatalog) {
           this.tableConstraintCatalog = tableConstraintCatalog;
           this.name = name;
           this.tableCatalog = tableCatalog;
    }


    /**
     * Gets the tableConstraintCatalog value for this TableConstraint.
     * 
     * @return tableConstraintCatalog
     */
    public java.lang.String getTableConstraintCatalog() {
        return tableConstraintCatalog;
    }


    /**
     * Sets the tableConstraintCatalog value for this TableConstraint.
     * 
     * @param tableConstraintCatalog
     */
    public void setTableConstraintCatalog(java.lang.String tableConstraintCatalog) {
        this.tableConstraintCatalog = tableConstraintCatalog;
    }


    /**
     * Gets the name value for this TableConstraint.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TableConstraint.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the tableCatalog value for this TableConstraint.
     * 
     * @return tableCatalog
     */
    public java.lang.String getTableCatalog() {
        return tableCatalog;
    }


    /**
     * Sets the tableCatalog value for this TableConstraint.
     * 
     * @param tableCatalog
     */
    public void setTableCatalog(java.lang.String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableConstraint)) return false;
        TableConstraint other = (TableConstraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tableConstraintCatalog==null && other.getTableConstraintCatalog()==null) || 
             (this.tableConstraintCatalog!=null &&
              this.tableConstraintCatalog.equals(other.getTableConstraintCatalog()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.tableCatalog==null && other.getTableCatalog()==null) || 
             (this.tableCatalog!=null &&
              this.tableCatalog.equals(other.getTableCatalog())));
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
        if (getTableConstraintCatalog() != null) {
            _hashCode += getTableConstraintCatalog().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTableCatalog() != null) {
            _hashCode += getTableCatalog().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableConstraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Grupp7", "TableConstraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableConstraintCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "TableConstraintCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "TableCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
