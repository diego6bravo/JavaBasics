
package com.example.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Greeter", targetNamespace = "http://jaxws.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Greeter {


    /**
     * 
     * @param firstName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GreetFirst")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GreetFirst", targetNamespace = "http://jaxws.example.com/", className = "com.example.jaxws.GreetFirst")
    @ResponseWrapper(localName = "GreetFirstResponse", targetNamespace = "http://jaxws.example.com/", className = "com.example.jaxws.GreetFirstResponse")
    @Action(input = "http://jaxws.example.com/Greeter/GreetFirstRequest", output = "http://jaxws.example.com/Greeter/GreetFirstResponse")
    public String greetFirst(
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName);

    /**
     * 
     * @param firstName
     * @param lastName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GreetFull")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GreetFull", targetNamespace = "http://jaxws.example.com/", className = "com.example.jaxws.GreetFull")
    @ResponseWrapper(localName = "GreetFullResponse", targetNamespace = "http://jaxws.example.com/", className = "com.example.jaxws.GreetFullResponse")
    @Action(input = "http://jaxws.example.com/Greeter/GreetFullRequest", output = "http://jaxws.example.com/Greeter/GreetFullResponse")
    public String greetFull(
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName,
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName);

}
