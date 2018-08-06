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
public class Supplier {
	
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private String supplierContact;
	private Date createDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private int activeFlag;
	
	
	/**
	 * 
	 */
	public Supplier() {
		super();
	}
	/**
	 * @param supplierId
	 * @param supplierName
	 * @param supplierAddress
	 * @param supplierContact
	 * @param createDate
	 * @param createdBy
	 * @param updatedDate
	 * @param updatedBy
	 * @param activeFlag
	 */
	public Supplier(int supplierId, String supplierName, String supplierAddress, String supplierContact,
			Date createDate, String createdBy, Date updatedDate, String updatedBy, int activeFlag) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.supplierContact = supplierContact;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.activeFlag = activeFlag;
	}
	/**
	 * @return the supplierId
	 */
	public int getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @return the supplierAddress
	 */
	public String getSupplierAddress() {
		return supplierAddress;
	}
	/**
	 * @param supplierAddress the supplierAddress to set
	 */
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	/**
	 * @return the supplierContact
	 */
	public String getSupplierContact() {
		return supplierContact;
	}
	/**
	 * @param supplierContact the supplierContact to set
	 */
	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
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
