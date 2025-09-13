
package com.example.cxf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>store complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>{@code
 * <complexType name="store">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MultipartContent" type="{http://example.com/cxf}multipartContent" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "store", propOrder = {
    "actionId",
    "multipartContent"
})
public class Store {

    @XmlElement(name = "ActionId")
    protected String actionId;
    @XmlElement(name = "MultipartContent")
    protected MultipartContent multipartContent;

    /**
     * actionIdプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * actionIdプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionId(String value) {
        this.actionId = value;
    }

    /**
     * multipartContentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MultipartContent }
     *     
     */
    public MultipartContent getMultipartContent() {
        return multipartContent;
    }

    /**
     * multipartContentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MultipartContent }
     *     
     */
    public void setMultipartContent(MultipartContent value) {
        this.multipartContent = value;
    }

}
