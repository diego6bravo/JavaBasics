
package com.example.jaxws;

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
@WebServiceClient(name = "CalcService", targetNamespace = "http://jaxws.example.com/", wsdlLocation = "http://localhost:7001/Sol05-02SOAP/CalcService?WSDL")
public class CalcService
    extends Service
{

    private final static URL CALCSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCSERVICE_EXCEPTION;
    private final static QName CALCSERVICE_QNAME = new QName("http://jaxws.example.com/", "CalcService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/Sol05-02SOAP/CalcService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCSERVICE_WSDL_LOCATION = url;
        CALCSERVICE_EXCEPTION = e;
    }

    public CalcService() {
        super(__getWsdlLocation(), CALCSERVICE_QNAME);
    }

    public CalcService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCSERVICE_QNAME, features);
    }

    public CalcService(URL wsdlLocation) {
        super(wsdlLocation, CALCSERVICE_QNAME);
    }

    public CalcService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCSERVICE_QNAME, features);
    }

    public CalcService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Calc
     */
    @WebEndpoint(name = "CalcPort")
    public Calc getCalcPort() {
        return super.getPort(new QName("http://jaxws.example.com/", "CalcPort"), Calc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calc
     */
    @WebEndpoint(name = "CalcPort")
    public Calc getCalcPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxws.example.com/", "CalcPort"), Calc.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCSERVICE_EXCEPTION!= null) {
            throw CALCSERVICE_EXCEPTION;
        }
        return CALCSERVICE_WSDL_LOCATION;
    }

}