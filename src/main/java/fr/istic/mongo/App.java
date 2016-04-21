package fr.istic.mongo;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws UnknownHostException
	{
	    Morphia morphia = new Morphia();    
	    Mongo mongo = new Mongo();
	    morphia.map(Person.class).map(Address.class);
	    Datastore ds = morphia.createDatastore(mongo, "my_database");
	    
	    //----personnes
	    Person p = new Person();
	    p.setName("Tintin");
	    
	    Person p1 = new Person();
	    p.setName("Ismail");
	    
	    Person p2 = new Person();
	    p.setName("Aziliz");

	    //-----Articles
	    Article a = new Article();
	    a.setName("stylo");
	    Article a1 = new Article();
	    a.setName("gomme");
	    Article a2 = new Article();
	    a.setName("moto");
	    
	    a.setP(p);
	    a1.setP(p2);
	    a2.setP(p1);
	    
	    
	    //------Adresses
	    Address address = new Address();
	    address.setStreet("123 Some street");
	    address.setCity("Some city");
	    address.setPostCode("123 456");
	    address.setCountry("Some country");
	    //set address
	    p.setAd(address);
	    
	    Address address2 = new Address();
	    address.setStreet("6 rue des Gantelles");
	    address.setCity("Rennes");
	    address.setPostCode("35700");
	    address.setCountry("France");
	    //set address
	    p1.setAd(address2);
	    
	    Address address3 = new Address();
	    address.setStreet("Geuliz");
	    address.setCity("Marrakech");
	    address.setPostCode("40000");
	    address.setCountry("Maroc");
	    //set address
	    p2.setAd(address3);
	    
	    // Save the POJO
	    ds.save(p);
	    ds.save(p2);
	    ds.save(p1);
	    
	    for (Person e : ds.find(Person.class))
	         System.err.println(e);

	}

}
