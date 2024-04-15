package mediaplayer.http;

import java.io.StringReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JAXB {
    private JAXBContext jaxb;

    public JAXB(Class xjc) throws JAXBException {
        jaxb = JAXBContext.newInstance(xjc);
    }

    public Object unmarshal(String response) throws JAXBException {
        Object responseObject = new Object();

        Unmarshaller unmarshaller = jaxb.createUnmarshaller();
        responseObject = unmarshaller.unmarshal(new StringReader(response));

        return responseObject;
    }
}
