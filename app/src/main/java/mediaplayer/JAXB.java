package mediaplayer;

import java.io.StringReader;
import java.io.StringWriter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class JAXB {
   private JAXBContext jaxb;

   public JAXB(Class jclass) {
      try {
         jaxb = JAXBContext.newInstance(jclass);
      } catch (Exception e) {}
   }

   public String marshal(Object obj) {
      StringWriter xml = new StringWriter();
      try {
         Marshaller marshaller = jaxb.createMarshaller();
         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         marshaller.marshal(obj, xml);
      } catch (Exception e) {}
      return xml.toString();
   }

   public Object unmarshal(String response) {
      Object responseObject = new Object();
      try {
         Unmarshaller unmarshaller = jaxb.createUnmarshaller();
         responseObject = unmarshaller.unmarshal(new StringReader(response));
      } catch (Exception e) {}
      return responseObject;
   }
}