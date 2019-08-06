package com.examples.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table(name="CustTab")
public class Customer {
	
	@Id
	private String email;
	private String name;
	private String contactNumber;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="AddrTab",joinColumns=@JoinColumn(name="email"))
	
	/*Here I am declaring an annotation which will be used for generating the 
	 * values of a unique column using sequence of oracle with a name 
	 * genseq */
	@GenericGenerator(name="genseq" , strategy="sequence")
	
	/*@collectionId is saying we want to create a Primary key column in 
	 * addrtab table with a name AddrId and column should be long type
	 * and value of this particular column will be generated according t o the
	 * specified generator type.*/
	@CollectionId(columns={@Column(name="AddrId")},type=@Type(type="long"),
	generator="genseq")
	private List<Address> listOfAddresses=new ArrayList<Address>();
 
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(List<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name
				+ ", contactNumber=" + contactNumber + ", listOfAddresses="
				+ listOfAddresses + "]";
	}

		
	
	
	
}
