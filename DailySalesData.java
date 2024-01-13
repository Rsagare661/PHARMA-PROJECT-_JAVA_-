package com.example.pharma.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class DailySalesData {
	@Id
	private Long productId;
	@Column(name = "Name", length = 10, nullable = false)
	private String productName;

	@Column(name = "Description", length = 100, nullable = false)
	private String productDescription;

	@Column(name = "Category")
	private String productCategory;
	// general or prescribed

	@Column(name = "Price", nullable = false)
	private Integer productPrice;

	@Column(name = "Quantity", nullable = false)
	private Integer productQuantity;

	// import date from java.sql.Date instead of java.util.Date
	@Column(name = "Manufactured Date")
	private Date mgfDate;

	@Column(name = "Expiration Date")
	private Date expDate;

	@ManyToOne(cascade = CascadeType.ALL)
	private CustomerData customer;

	@ManyToOne(cascade = CascadeType.ALL)
	private DoctorData doctor;

	public DailySalesData() {

	}

	public DailySalesData(Long productId, String productName, String productDescription, String productCategory,
			Integer productPrice, Integer productQuantity, Date mgfDate, Date expDate, CustomerData customer,
			DoctorData doctor) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.mgfDate = mgfDate;
		this.expDate = expDate;
		this.customer = customer;
		this.doctor = doctor;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Date getMgfDate() {
		return mgfDate;
	}

	public void setMgfDate(Date mgfDate) {
		this.mgfDate = mgfDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public CustomerData getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerData customer) {
		this.customer = customer;
	}

	public DoctorData getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorData doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "DailySalesData [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productCategory=" + productCategory + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", mgfDate=" + mgfDate + ", expDate=" + expDate
				+ ", customer=" + customer + ", doctor=" + doctor + "]";
	}
}
