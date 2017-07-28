
package wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CallWebService", targetNamespace = "http://webservice.com/", wsdlLocation = "http://node1545-pc:8090/PrintInvoice/CallWebService?wsdl")
public class CallWebService_Service
    extends Service
{

    private final static URL CALLWEBSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(wsdl.CallWebService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = wsdl.CallWebService_Service.class.getResource(".");
            url = new URL(baseUrl, "http://node1545-pc:8090/PrintInvoice/CallWebService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://node1545-pc:8090/PrintInvoice/CallWebService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CALLWEBSERVICE_WSDL_LOCATION = url;
    }

    public CallWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CallWebService_Service() {
        super(CALLWEBSERVICE_WSDL_LOCATION, new QName("http://webservice.com/", "CallWebService"));
    }

    /**
     * 
     * @return
     *     returns CallWebService
     */
    @WebEndpoint(name = "callWebserviceSoap")
    public CallWebService getCallWebserviceSoap() {
        return super.getPort(new QName("http://webservice.com/", "callWebserviceSoap"), CallWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CallWebService
     */
    @WebEndpoint(name = "callWebserviceSoap")
    public CallWebService getCallWebserviceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.com/", "callWebserviceSoap"), CallWebService.class, features);
    }

}
