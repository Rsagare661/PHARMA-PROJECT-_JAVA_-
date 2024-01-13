package com.example.pharma.model;

import java.util.Date;

//@Data
public class PharmaProductDto {

	private Long productId;
	private String productName;
	private String productDescription;
	private String productCategory;
	// general or prescribied
	private Integer productPrice;
	private Integer productQuantity;
	private Date mgfDate;
	private Date expDate;

	public PharmaProductDto(Long productId, String productName, String productDescription, String productCategory,
			Integer productPrice, Integer productQuantity, Date mgfDate, Date expDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.mgfDate = mgfDate;
		this.expDate = expDate;
	}

	public PharmaProductDto() {
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

	@Override
	public String toString() {
		return "PharmaProductDto [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productCategory+" + productCategory + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", mgfDate=" + mgfDate + ", expDate=" + expDate + "]";
	}

}
