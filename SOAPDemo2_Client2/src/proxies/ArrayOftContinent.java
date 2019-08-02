
package proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOftContinent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftContinent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tContinent" type="{http://www.oorsprong.org/websamples.countryinfo}tContinent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftContinent", propOrder = {
    "tContinent"
})
public class ArrayOftContinent {

    @XmlElement(nillable = true)
    protected List<TContinent> tContinent;

    /**
     * Gets the value of the tContinent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tContinent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTContinent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TContinent }
     * 
     * 
     */
    public List<TContinent> getTContinent() {
        if (tContinent == null) {
            tContinent = new ArrayList<TContinent>();
        }
        return this.tContinent;
    }

}
