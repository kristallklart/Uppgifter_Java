/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7;

public class User  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.util.Calendar birthDate;

    private byte[] picture;

    private java.lang.String profession;

    private java.lang.String password;

    private java.lang.String about;

    private java.lang.String industry;

    private Grupp7.FieldOfProfession fieldOfProfession;

    private Grupp7.UserLocationPurpose[] userLocationPurposes;

    private Grupp7.Match[] matches;

    private Grupp7.Message[] messages;

    public User() {
    }

    public User(
           java.lang.String userName,
           java.lang.String firstName,
           java.lang.String lastName,
           java.util.Calendar birthDate,
           byte[] picture,
           java.lang.String profession,
           java.lang.String password,
           java.lang.String about,
           java.lang.String industry,
           Grupp7.FieldOfProfession fieldOfProfession,
           Grupp7.UserLocationPurpose[] userLocationPurposes,
           Grupp7.Match[] matches,
           Grupp7.Message[] messages) {
           this.userName = userName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.birthDate = birthDate;
           this.picture = picture;
           this.profession = profession;
           this.password = password;
           this.about = about;
           this.industry = industry;
           this.fieldOfProfession = fieldOfProfession;
           this.userLocationPurposes = userLocationPurposes;
           this.matches = matches;
           this.messages = messages;
    }


    /**
     * Gets the userName value for this User.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this User.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the firstName value for this User.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this User.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this User.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this User.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the birthDate value for this User.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this User.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the picture value for this User.
     * 
     * @return picture
     */
    public byte[] getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this User.
     * 
     * @param picture
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }


    /**
     * Gets the profession value for this User.
     * 
     * @return profession
     */
    public java.lang.String getProfession() {
        return profession;
    }


    /**
     * Sets the profession value for this User.
     * 
     * @param profession
     */
    public void setProfession(java.lang.String profession) {
        this.profession = profession;
    }


    /**
     * Gets the password value for this User.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this User.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the about value for this User.
     * 
     * @return about
     */
    public java.lang.String getAbout() {
        return about;
    }


    /**
     * Sets the about value for this User.
     * 
     * @param about
     */
    public void setAbout(java.lang.String about) {
        this.about = about;
    }


    /**
     * Gets the industry value for this User.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this User.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the fieldOfProfession value for this User.
     * 
     * @return fieldOfProfession
     */
    public Grupp7.FieldOfProfession getFieldOfProfession() {
        return fieldOfProfession;
    }


    /**
     * Sets the fieldOfProfession value for this User.
     * 
     * @param fieldOfProfession
     */
    public void setFieldOfProfession(Grupp7.FieldOfProfession fieldOfProfession) {
        this.fieldOfProfession = fieldOfProfession;
    }


    /**
     * Gets the userLocationPurposes value for this User.
     * 
     * @return userLocationPurposes
     */
    public Grupp7.UserLocationPurpose[] getUserLocationPurposes() {
        return userLocationPurposes;
    }


    /**
     * Sets the userLocationPurposes value for this User.
     * 
     * @param userLocationPurposes
     */
    public void setUserLocationPurposes(Grupp7.UserLocationPurpose[] userLocationPurposes) {
        this.userLocationPurposes = userLocationPurposes;
    }


    /**
     * Gets the matches value for this User.
     * 
     * @return matches
     */
    public Grupp7.Match[] getMatches() {
        return matches;
    }


    /**
     * Sets the matches value for this User.
     * 
     * @param matches
     */
    public void setMatches(Grupp7.Match[] matches) {
        this.matches = matches;
    }


    /**
     * Gets the messages value for this User.
     * 
     * @return messages
     */
    public Grupp7.Message[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this User.
     * 
     * @param messages
     */
    public void setMessages(Grupp7.Message[] messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.picture==null && other.getPicture()==null) || 
             (this.picture!=null &&
              java.util.Arrays.equals(this.picture, other.getPicture()))) &&
            ((this.profession==null && other.getProfession()==null) || 
             (this.profession!=null &&
              this.profession.equals(other.getProfession()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.about==null && other.getAbout()==null) || 
             (this.about!=null &&
              this.about.equals(other.getAbout()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.fieldOfProfession==null && other.getFieldOfProfession()==null) || 
             (this.fieldOfProfession!=null &&
              this.fieldOfProfession.equals(other.getFieldOfProfession()))) &&
            ((this.userLocationPurposes==null && other.getUserLocationPurposes()==null) || 
             (this.userLocationPurposes!=null &&
              java.util.Arrays.equals(this.userLocationPurposes, other.getUserLocationPurposes()))) &&
            ((this.matches==null && other.getMatches()==null) || 
             (this.matches!=null &&
              java.util.Arrays.equals(this.matches, other.getMatches()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getPicture() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicture());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicture(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProfession() != null) {
            _hashCode += getProfession().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getAbout() != null) {
            _hashCode += getAbout().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getFieldOfProfession() != null) {
            _hashCode += getFieldOfProfession().hashCode();
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
        if (getMatches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
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
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Grupp7", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "BirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Picture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profession");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Profession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("about");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "About"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldOfProfession");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "FieldOfProfession"));
        elemField.setXmlType(new javax.xml.namespace.QName("Grupp7", "FieldOfProfession"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matches");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Matches"));
        elemField.setXmlType(new javax.xml.namespace.QName("Grupp7", "Match"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Grupp7", "Match"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("Grupp7", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("Grupp7", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Grupp7", "Message"));
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
