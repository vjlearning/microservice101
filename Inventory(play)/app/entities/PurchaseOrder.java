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
public class PurchaseOrder {
	
	private int purchaseOrderId;
	private Date purchaseOrderDate;
	private Product product;
	private int productQuantity;
	private Date createDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private int activeFlag;
	
	
	/**
	 * 
	 */
	public PurchaseOrder() {
		super();
	}
	/**
	 * @param purchaseOrderId
	 * @param purchaseOrderDate
	 * @param product
	 * @param productQuantity
	 * @param createDate
	 * @param createdBy
	 * @param updatedDate
	 * @param updatedBy
	 * @param activeFlag
	 */
	public PurchaseOrder(int purchaseOrderId, Date purchaseOrderDate, Product product, int productQuantity,
			Date createDate, String createdBy, Date updatedDate, String updatedBy, int activeFlag) {
		super();
		this.purchaseOrderId = purchaseOrderId;
		this.purchaseOrderDate = purchaseOrderDate;
		this.product = product;
		this.productQuantity = productQuantity;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.activeFlag = activeFlag;
	}
	/**
	 * @return the purchaseOrderId
	 */
	public int getPurchaseOrderId() {
		return purchaseOrderId;
	}
	/**
	 * @param purchaseOrderId the purchaseOrderId to set
	 */
	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	/**
	 * @return the purchaseOrderDate
	 */
	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}
	/**
	 * @param purchaseOrderDate the purchaseOrderDate to set
	 */
	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}
	/**
	 * @param productQuantity the productQuantity to set
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
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
