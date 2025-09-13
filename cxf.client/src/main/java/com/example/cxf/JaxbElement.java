
package com.example.cxf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>jaxbElement complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>{@code
 * <complexType name="jaxbElement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nil" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jaxbElement", propOrder = {
    "nil",
    "value"
})
public class JaxbElement {

    protected boolean nil;
    protected Object value;

    /**
     * nilプロパティの値を取得します。
     * 
     */
    public boolean isNil() {
        return nil;
    }

    /**
     * nilプロパティの値を設定します。
     * 
     */
    public void setNil(boolean value) {
        this.nil = value;
    }

    /**
     * valueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * valueプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

}
