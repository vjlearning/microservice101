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

public class Order {

	private int orderId;
	private int orderNumber;
	private int customerId;
	private String deliveryAddress;
	private Date orderDate;
	private String orderStatusCode;
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
	public Order() {
		super();
	}
	/**
	 * @param orderId
	 * @param orderNumber
	 * @param customerId
	 * @param deliveryAddress
	 * @param orderDate
	 * @param orderStatusCode
	 * @param product
	 * @param productQuantity
	 * @param createDate
	 * @param createdBy
	 * @param updatedDate
	 * @param updatedBy
	 * @param activeFlag
	 */
	public Order(int orderId, int orderNumber, int customerId, String deliveryAddress, Date orderDate,
			String orderStatusCode, Product product, int productQuantity, Date createDate, String createdBy,
			Date updatedDate, String updatedBy, int activeFlag) {
		super();
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.customerId = customerId;
		this.deliveryAddress = deliveryAddress;
		this.orderDate = orderDate;
		this.orderStatusCode = orderStatusCode;
		this.product = product;
		this.productQuantity = productQuantity;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.activeFlag = activeFlag;
	}
	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the orderStatusCode
	 */
	public String getOrderStatusCode() {
		return orderStatusCode;
	}
	/**
	 * @param orderStatusCode the orderStatusCode to set
	 */
	public void setOrderStatusCode(String orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
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
