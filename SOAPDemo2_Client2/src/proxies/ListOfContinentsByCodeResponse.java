
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
 *         &lt;element name="ListOfContinentsByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftContinent"/>
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
    "listOfContinentsByCodeResult"
})
@XmlRootElement(name = "ListOfContinentsByCodeResponse")
public class ListOfContinentsByCodeResponse {

    @XmlElement(name = "ListOfContinentsByCodeResult", required = true)
    protected ArrayOftContinent listOfContinentsByCodeResult;

    /**
     * Gets the value of the listOfContinentsByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftContinent }
     *     
     */
    public ArrayOftContinent getListOfContinentsByCodeResult() {
        return listOfContinentsByCodeResult;
    }

    /**
     * Sets the value of the listOfContinentsByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftContinent }
     *     
     */
    public void setListOfContinentsByCodeResult(ArrayOftContinent value) {
        this.listOfContinentsByCodeResult = value;
    }

}
