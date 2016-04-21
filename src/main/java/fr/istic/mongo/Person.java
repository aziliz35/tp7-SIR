package fr.istic.mongo;

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Person {
	
	@Id
    private ObjectId id;
	private String name;
	
	@Embedded
	private Address Ad;
	

	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAd() {
		return Ad;
	}
	public void setAd(Address ad) {
		Ad = ad;
	}
	
	

}
