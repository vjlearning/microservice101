/**
 * 
 */
package entities;

import java.util.Date;

/**
 * @author Vijendra
 * @createdOn 08/07/2018
 *
 */
public class Product {
	
	private int productId;
	private String productName;
	private String productLabel;
	private Supplier supplier;
	private double costPrice;
	private double sellingPrice;
	private ProductCategory productCategory;
	private String productNotes;
	private Date createDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private int activeFlag;
	
	
	/**
	 * 
	 */
	public Product() {
		super();
	}
	/**
	 * @param productId
	 * @param productName
	 * @param productLabel
	 * @param supplier
	 * @param costPrice
	 * @param sellingPrice
	 * @param productCategory
	 * @param productNotes
	 * @param createDate
	 * @param createdBy
	 * @param updatedDate
	 * @param updatedBy
	 * @param activeFlag
	 */
	public Product(int productId, String productName, String productLabel, Supplier supplier, double costPrice,
			double sellingPrice, ProductCategory productCategory, String productNotes, Date createDate,
			String createdBy, Date updatedDate, String updatedBy, int activeFlag) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productLabel = productLabel;
		this.supplier = supplier;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.productCategory = productCategory;
		this.productNotes = productNotes;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.activeFlag = activeFlag;
	}
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productLabel
	 */
	public String getProductLabel() {
		return productLabel;
	}
	/**
	 * @param productLabel the productLabel to set
	 */
	public void setProductLabel(String productLabel) {
		this.productLabel = productLabel;
	}
	/**
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}
	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	/**
	 * @return the costPrice
	 */
	public double getCostPrice() {
		return costPrice;
	}
	/**
	 * @param costPrice the costPrice to set
	 */
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	/**
	 * @return the sellingPrice
	 */
	public double getSellingPrice() {
		return sellingPrice;
	}
	/**
	 * @param sellingPrice the sellingPrice to set
	 */
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	/**
	 * @return the productCategory
	 */
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	/**
	 * @return the productNotes
	 */
	public String getProductNotes() {
		return productNotes;
	}
	/**
	 * @param productNotes the productNotes to set
	 */
	public void setProductNotes(String productNotes) {
		this.productNotes = productNotes;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the activeFlag
	 */
	public int getActiveFlag() {
		return activeFlag;
	}
	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	
}
