package day_44_custom_classes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class App {
    String name;//null by default
    double version;// 0.0 by default

    public void open(){
        System.out.println("Open "+name + " app - version "+version);
    }
}
