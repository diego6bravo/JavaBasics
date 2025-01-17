
package com.practices.services.concurrency;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WordWebService", targetNamespace = "http://concurrency.services.practices.com/", wsdlLocation = "http://localhost:7005/ConcurrencyServices/WordWebService?wsdl")
public class WordWebService_Service
    extends Service
{

    private final static URL WORDWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException WORDWEBSERVICE_EXCEPTION;
    private final static QName WORDWEBSERVICE_QNAME = new QName("http://concurrency.services.practices.com/", "WordWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7005/ConcurrencyServices/WordWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORDWEBSERVICE_WSDL_LOCATION = url;
        WORDWEBSERVICE_EXCEPTION = e;
    }

    public WordWebService_Service() {
        super(__getWsdlLocation(), WORDWEBSERVICE_QNAME);
    }

    public WordWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORDWEBSERVICE_QNAME, features);
    }

    public WordWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, WORDWEBSERVICE_QNAME);
    }

    public WordWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORDWEBSERVICE_QNAME, features);
    }

    public WordWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WordWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WordWebService
     */
    @WebEndpoint(name = "WordWebServicePort")
    public WordWebService getWordWebServicePort() {
        return super.getPort(new QName("http://concurrency.services.practices.com/", "WordWebServicePort"), WordWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WordWebService
     */
    @WebEndpoint(name = "WordWebServicePort")
    public WordWebService getWordWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://concurrency.services.practices.com/", "WordWebServicePort"), WordWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORDWEBSERVICE_EXCEPTION!= null) {
            throw WORDWEBSERVICE_EXCEPTION;
        }
        return WORDWEBSERVICE_WSDL_LOCATION;
    }

}
