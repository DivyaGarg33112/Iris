
package proxies;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOftCurrency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftCurrency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tCurrency" type="{http://www.oorsprong.org/websamples.countryinfo}tCurrency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftCurrency", propOrder = {
    "tCurrency"
})
public class ArrayOftCurrency {

    @XmlElement(nillable = true)
    protected List<TCurrency> tCurrency;

    /**
     * Gets the value of the tCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCurrency }
     * 
     * 
     */
    public List<TCurrency> getTCurrency() {
        if (tCurrency == null) {
            tCurrency = new ArrayList<TCurrency>();
        }
        return this.tCurrency;
    }

}
