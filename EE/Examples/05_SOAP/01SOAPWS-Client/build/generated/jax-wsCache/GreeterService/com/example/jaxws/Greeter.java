
package com.example.jaxws;

import javax.jws.WebMethod;
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
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "greetWorld", targetNamespace = "http://jaxws.example.com/", className = "com.example.jaxws.GreetWorld")
    @ResponseWrapper(localName = "greetWorldResponse", targetNamespace = "http://jaxws.example.com/", className = "com.example.jaxws.GreetWorldResponse")
    @Action(input = "http://jaxws.example.com/Greeter/greetWorldRequest", output = "http://jaxws.example.com/Greeter/greetWorldResponse")
    public String greetWorld();

}
