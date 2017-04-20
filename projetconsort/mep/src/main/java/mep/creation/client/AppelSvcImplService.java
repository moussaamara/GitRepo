
package mep.creation.client;

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
@WebServiceClient(name = "AppelSvcImplService", targetNamespace = "http://service.isiwebinterface.ass.inf.suo.fr/", wsdlLocation = "http://isiservices-rec.recgroupement.systeme-u.fr/isiservices/services/appelService?wsdl")
public class AppelSvcImplService
    extends Service
{

    private final static URL APPELSVCIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(AppelSvcImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = AppelSvcImplService.class.getResource(".");
            url = new URL(baseUrl, "http://isiservices-rec.recgroupement.systeme-u.fr/isiservices/services/appelService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://isiservices-rec.recgroupement.systeme-u.fr/isiservices/services/appelService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        APPELSVCIMPLSERVICE_WSDL_LOCATION = url;
    }

    public AppelSvcImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AppelSvcImplService() {
        super(APPELSVCIMPLSERVICE_WSDL_LOCATION, new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "AppelSvcImplService"));
    }

    /**
     * 
     * @return
     *     returns ItfAppelSvc
     */
    @WebEndpoint(name = "AppelSvcImplPort")
    public ItfAppelSvc getAppelSvcImplPort() {
        return super.getPort(new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "AppelSvcImplPort"), ItfAppelSvc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ItfAppelSvc
     */
    @WebEndpoint(name = "AppelSvcImplPort")
    public ItfAppelSvc getAppelSvcImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.isiwebinterface.ass.inf.suo.fr/", "AppelSvcImplPort"), ItfAppelSvc.class, features);
    }

}