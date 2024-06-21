
package com.example.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _GreetFullResponse_QNAME = new QName("http://jaxws.example.com/", "GreetFullResponse");
    private final static QName _GreetFull_QNAME = new QName("http://jaxws.example.com/", "GreetFull");
    private final static QName _GreetFirstResponse_QNAME = new QName("http://jaxws.example.com/", "GreetFirstResponse");
    private final static QName _GreetFirst_QNAME = new QName("http://jaxws.example.com/", "GreetFirst");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreetFirst }
     * 
     */
    public GreetFirst createGreetFirst() {
        return new GreetFirst();
    }

    /**
     * Create an instance of {@link GreetFirstResponse }
     * 
     */
    public GreetFirstResponse createGreetFirstResponse() {
        return new GreetFirstResponse();
    }

    /**
     * Create an instance of {@link GreetFull }
     * 
     */
    public GreetFull createGreetFull() {
        return new GreetFull();
    }

    /**
     * Create an instance of {@link GreetFullResponse }
     * 
     */
    public GreetFullResponse createGreetFullResponse() {
        return new GreetFullResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetFullResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "GreetFullResponse")
    public JAXBElement<GreetFullResponse> createGreetFullResponse(GreetFullResponse value) {
        return new JAXBElement<GreetFullResponse>(_GreetFullResponse_QNAME, GreetFullResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetFull }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "GreetFull")
    public JAXBElement<GreetFull> createGreetFull(GreetFull value) {
        return new JAXBElement<GreetFull>(_GreetFull_QNAME, GreetFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetFirstResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "GreetFirstResponse")
    public JAXBElement<GreetFirstResponse> createGreetFirstResponse(GreetFirstResponse value) {
        return new JAXBElement<GreetFirstResponse>(_GreetFirstResponse_QNAME, GreetFirstResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetFirst }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "GreetFirst")
    public JAXBElement<GreetFirst> createGreetFirst(GreetFirst value) {
        return new JAXBElement<GreetFirst>(_GreetFirst_QNAME, GreetFirst.class, null, value);
    }

}
