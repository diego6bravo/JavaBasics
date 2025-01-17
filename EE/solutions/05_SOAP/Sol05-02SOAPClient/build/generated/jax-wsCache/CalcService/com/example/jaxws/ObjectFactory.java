
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

    private final static QName _SquaredResponse_QNAME = new QName("http://jaxws.example.com/", "squaredResponse");
    private final static QName _Squared_QNAME = new QName("http://jaxws.example.com/", "squared");
    private final static QName _AddResponse_QNAME = new QName("http://jaxws.example.com/", "addResponse");
    private final static QName _Subtract_QNAME = new QName("http://jaxws.example.com/", "subtract");
    private final static QName _SubtractResponse_QNAME = new QName("http://jaxws.example.com/", "subtractResponse");
    private final static QName _Add_QNAME = new QName("http://jaxws.example.com/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link Squared }
     * 
     */
    public Squared createSquared() {
        return new Squared();
    }

    /**
     * Create an instance of {@link SquaredResponse }
     * 
     */
    public SquaredResponse createSquaredResponse() {
        return new SquaredResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquaredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "squaredResponse")
    public JAXBElement<SquaredResponse> createSquaredResponse(SquaredResponse value) {
        return new JAXBElement<SquaredResponse>(_SquaredResponse_QNAME, SquaredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Squared }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "squared")
    public JAXBElement<Squared> createSquared(Squared value) {
        return new JAXBElement<Squared>(_Squared_QNAME, Squared.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.example.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
