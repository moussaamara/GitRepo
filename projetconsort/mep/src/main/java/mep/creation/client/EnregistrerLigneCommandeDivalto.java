
package mep.creation.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enregistrerLigneCommandeDivalto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enregistrerLigneCommandeDivalto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.isiwebinterface.ass.inf.suo.fr/}commandeDTO" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://service.isiwebinterface.ass.inf.suo.fr/}ligneCommandeDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enregistrerLigneCommandeDivalto", propOrder = {
    "arg0",
    "arg1"
})
public class EnregistrerLigneCommandeDivalto {

    protected CommandeDTO arg0;
    protected List<LigneCommandeDTO> arg1;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link CommandeDTO }
     *     
     */
    public CommandeDTO getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandeDTO }
     *     
     */
    public void setArg0(CommandeDTO value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LigneCommandeDTO }
     * 
     * 
     */
    public List<LigneCommandeDTO> getArg1() {
        if (arg1 == null) {
            arg1 = new ArrayList<LigneCommandeDTO>();
        }
        return this.arg1;
    }

}
