
package proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOftCountryCodeAndName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftCountryCodeAndName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tCountryCodeAndName" type="{http://www.oorsprong.org/websamples.countryinfo}tCountryCodeAndName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCountryCodeAndName", propOrder = {
    "tCountryCodeAndName"
})
public class ArrayOftCountryCodeAndName {

    @XmlElement(nillable = true)
    protected List<TCountryCodeAndName> tCountryCodeAndName;

    /**
     * Gets the value of the tCountryCodeAndName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tCountryCodeAndName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCountryCodeAndName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCountryCodeAndName }
     * 
     * 
     */
    public List<TCountryCodeAndName> getTCountryCodeAndName() {
        if (tCountryCodeAndName == null) {
            tCountryCodeAndName = new ArrayList<TCountryCodeAndName>();
        }
        return this.tCountryCodeAndName;
    }

}
