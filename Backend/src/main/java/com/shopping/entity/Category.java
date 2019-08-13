package com.shopping.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Category {
	
	@Id
	@GeneratedValue
	private int categoryId;
	private String categoryName;
	private String cDescription;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="cat",fetch=FetchType.EAGER)
	private Set<Product> prod;
	
	public Set<Product> getProd() {
		return prod;
	}
	public void setProd(Set<Product> prod) {
		this.prod = prod;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getcDescription() {
		return cDescription;
	}
	public void setcDescription(String cDescription) {
		this.cDescription = cDescription;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", cDescription="
				+ cDescription + ", prod=" + prod + "]";
	}
	
	
	

}
