
package com.example.cxf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>getCountryResponse complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>{@code
 * <complexType name="getCountryResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CountryServiceResult" type="{http://example.com/cxf}getCountryResult" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCountryResponse", propOrder = {
    "countryServiceResult"
})
public class GetCountryResponse {

    @XmlElement(name = "CountryServiceResult")
    protected GetCountryResult countryServiceResult;

    /**
     * countryServiceResultプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GetCountryResult }
     *     
     */
    public GetCountryResult getCountryServiceResult() {
        return countryServiceResult;
    }

    /**
     * countryServiceResultプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GetCountryResult }
     *     
     */
    public void setCountryServiceResult(GetCountryResult value) {
        this.countryServiceResult = value;
    }

}
