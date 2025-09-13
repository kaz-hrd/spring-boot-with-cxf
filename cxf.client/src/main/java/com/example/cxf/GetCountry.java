
package com.example.cxf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>getCountry complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>{@code
 * <complexType name="getCountry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CountryServiceParam" type="{http://example.com/cxf}getCountryParam" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCountry", propOrder = {
    "countryServiceParam"
})
public class GetCountry {

    @XmlElement(name = "CountryServiceParam")
    protected GetCountryParam countryServiceParam;

    /**
     * countryServiceParamプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GetCountryParam }
     *     
     */
    public GetCountryParam getCountryServiceParam() {
        return countryServiceParam;
    }

    /**
     * countryServiceParamプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GetCountryParam }
     *     
     */
    public void setCountryServiceParam(GetCountryParam value) {
        this.countryServiceParam = value;
    }

}
