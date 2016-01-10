//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eVehicleBrake complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eVehicleBrake">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tBasicBrakeType">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aVehicleBrake"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eVehicleBrake")
public class EVehicleBrake
    extends TBasicBrakeType
{

    @XmlAttribute(name = "loadSwitch")
    protected TLoadSwitch loadSwitch;
    @XmlAttribute(name = "autoBrakePercentage")
    protected Integer autoBrakePercentage;
    @XmlAttribute(name = "maxAutoBrakeMass")
    protected BigDecimal maxAutoBrakeMass;

    /**
     * Gets the value of the loadSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link TLoadSwitch }
     *     
     */
    public TLoadSwitch getLoadSwitch() {
        return loadSwitch;
    }

    /**
     * Sets the value of the loadSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLoadSwitch }
     *     
     */
    public void setLoadSwitch(TLoadSwitch value) {
        this.loadSwitch = value;
    }

    /**
     * Gets the value of the autoBrakePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoBrakePercentage() {
        return autoBrakePercentage;
    }

    /**
     * Sets the value of the autoBrakePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoBrakePercentage(Integer value) {
        this.autoBrakePercentage = value;
    }

    /**
     * Gets the value of the maxAutoBrakeMass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAutoBrakeMass() {
        return maxAutoBrakeMass;
    }

    /**
     * Sets the value of the maxAutoBrakeMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAutoBrakeMass(BigDecimal value) {
        this.maxAutoBrakeMass = value;
    }

}
