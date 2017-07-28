
package wsdl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CallWebService", targetNamespace = "http://webservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CallWebService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://webservice.com/", className = "wsdl.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://webservice.com/", className = "wsdl.AddResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<wsdl.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "data", targetNamespace = "http://webservice.com/", className = "wsdl.Data")
    @ResponseWrapper(localName = "dataResponse", targetNamespace = "http://webservice.com/", className = "wsdl.DataResponse")
    public List<Student> data(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}