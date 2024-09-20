
package com.example.consumingwebservice.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "SOAPDemo", targetNamespace = "http://tempuri.org", wsdlLocation = "https://www.crcind.com/csp/samples/SOAP.Demo.CLS?WSDL")
public class SOAPDemo
    extends Service
{

    private final static URL SOAPDEMO_WSDL_LOCATION;
    private final static WebServiceException SOAPDEMO_EXCEPTION;
    private final static QName SOAPDEMO_QNAME = new QName("http://tempuri.org", "SOAPDemo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.crcind.com/csp/samples/SOAP.Demo.CLS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPDEMO_WSDL_LOCATION = url;
        SOAPDEMO_EXCEPTION = e;
    }

    public SOAPDemo() {
        super(__getWsdlLocation(), SOAPDEMO_QNAME);
    }

    public SOAPDemo(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPDEMO_QNAME, features);
    }

    public SOAPDemo(URL wsdlLocation) {
        super(wsdlLocation, SOAPDEMO_QNAME);
    }

    public SOAPDemo(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPDEMO_QNAME, features);
    }

    public SOAPDemo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SOAPDemo(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SOAPDemoSoap
     */
    @WebEndpoint(name = "SOAPDemoSoap")
    public SOAPDemoSoap getSOAPDemoSoap() {
        return super.getPort(new QName("http://tempuri.org", "SOAPDemoSoap"), SOAPDemoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SOAPDemoSoap
     */
    @WebEndpoint(name = "SOAPDemoSoap")
    public SOAPDemoSoap getSOAPDemoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org", "SOAPDemoSoap"), SOAPDemoSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPDEMO_EXCEPTION!= null) {
            throw SOAPDEMO_EXCEPTION;
        }
        return SOAPDEMO_WSDL_LOCATION;
    }

}