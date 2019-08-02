
package proxies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfCurrenciesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCurrency"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfCurrenciesByCodeResult"
})
@XmlRootElement(name = "ListOfCurrenciesByCodeResponse")
public class ListOfCurrenciesByCodeResponse {

    @XmlElement(name = "ListOfCurrenciesByCodeResult", required = true)
    protected ArrayOftCurrency listOfCurrenciesByCodeResult;

    /**
     * Gets the value of the listOfCurrenciesByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public ArrayOftCurrency getListOfCurrenciesByCodeResult() {
        return listOfCurrenciesByCodeResult;
    }

    /**
     * Sets the value of the listOfCurrenciesByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public void setListOfCurrenciesByCodeResult(ArrayOftCurrency value) {
        this.listOfCurrenciesByCodeResult = value;
    }

}
