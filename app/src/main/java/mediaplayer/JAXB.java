package mediaplayer;

import java.io.*;
import jakarta.xml.bind.*;

public class JAXB {

   public JAXB() {}

   public Object unmarshal(String response, Class xjc) throws JAXBException {
      JAXBContext jaxb = JAXBContext.newInstance(xjc);

      Unmarshaller unmarshaller = jaxb.createUnmarshaller();
      return unmarshaller.unmarshal(new StringReader(response));
   }
}