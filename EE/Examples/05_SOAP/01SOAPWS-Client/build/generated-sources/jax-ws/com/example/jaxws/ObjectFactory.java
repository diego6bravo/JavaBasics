
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

    private final static QName _GreetWorld_QNAME = new QName("http://jaxws.example.com/", "greetWorld");
    private final static QName _GreetWorldResponse_QNAME = new QName("http://jaxws.example.com/", "greetWorldResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreetWorld }
     * 
     */
    public GreetWorld createGreetWorld() {
        return new GreetWorld();
    }

    /**
     * Create an instance of {@link GreetWorldResponse }
     * 
     */
    public GreetWorldResponse createGreetWorldResponse() {
        return new GreetWorldResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "greetWorld")
    public JAXBElement<GreetWorld> createGreetWorld(GreetWorld value) {
        return new JAXBElement<GreetWorld>(_GreetWorld_QNAME, GreetWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "greetWorldResponse")
    public JAXBElement<GreetWorldResponse> createGreetWorldResponse(GreetWorldResponse value) {
        return new JAXBElement<GreetWorldResponse>(_GreetWorldResponse_QNAME, GreetWorldResponse.class, null, value);
    }

}
