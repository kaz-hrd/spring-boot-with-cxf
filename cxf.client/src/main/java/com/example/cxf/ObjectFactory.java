
package com.example.cxf;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.cxf package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Store_QNAME = new QName("http://example.com/cxf", "store");
    private static final QName _StoreResponse_QNAME = new QName("http://example.com/cxf", "storeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Store }
     * 
     * @return
     *     the new instance of {@link Store }
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link StoreResponse }
     * 
     * @return
     *     the new instance of {@link StoreResponse }
     */
    public StoreResponse createStoreResponse() {
        return new StoreResponse();
    }

    /**
     * Create an instance of {@link MultipartContent }
     * 
     * @return
     *     the new instance of {@link MultipartContent }
     */
    public MultipartContent createMultipartContent() {
        return new MultipartContent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Store }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Store }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/cxf", name = "store")
    public JAXBElement<Store> createStore(Store value) {
        return new JAXBElement<>(_Store_QNAME, Store.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.com/cxf", name = "storeResponse")
    public JAXBElement<StoreResponse> createStoreResponse(StoreResponse value) {
        return new JAXBElement<>(_StoreResponse_QNAME, StoreResponse.class, null, value);
    }

}
