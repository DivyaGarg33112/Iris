
package proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOftCountryCodeAndNameGroupedByContinent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftCountryCodeAndNameGroupedByContinent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tCountryCodeAndNameGroupedByContinent" type="{http://www.oorsprong.org/websamples.countryinfo}tCountryCodeAndNameGroupedByContinent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCountryCodeAndNameGroupedByContinent", propOrder = {
    "tCountryCodeAndNameGroupedByContinent"
})
public class ArrayOftCountryCodeAndNameGroupedByContinent {

    @XmlElement(nillable = true)
    protected List<TCountryCodeAndNameGroupedByContinent> tCountryCodeAndNameGroupedByContinent;

    /**
     * Gets the value of the tCountryCodeAndNameGroupedByContinent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tCountryCodeAndNameGroupedByContinent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCountryCodeAndNameGroupedByContinent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCountryCodeAndNameGroupedByContinent }
     * 
     * 
     */
    public List<TCountryCodeAndNameGroupedByContinent> getTCountryCodeAndNameGroupedByContinent() {
        if (tCountryCodeAndNameGroupedByContinent == null) {
            tCountryCodeAndNameGroupedByContinent = new ArrayList<TCountryCodeAndNameGroupedByContinent>();
        }
        return this.tCountryCodeAndNameGroupedByContinent;
    }

}
