
package mep.creation.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAppelParId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAppelParId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appelid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAppelParId", propOrder = {
    "appelid"
})
public class GetAppelParId {

    protected long appelid;

    /**
     * Gets the value of the appelid property.
     * 
     */
    public long getAppelid() {
        return appelid;
    }

    /**
     * Sets the value of the appelid property.
     * 
     */
    public void setAppelid(long value) {
        this.appelid = value;
    }

}
