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
public class ProductCategory {

	private int productCategoryId;
	private String productCategoryName;
	private String productCategoryDesc;
	private Date createDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private int activeFlag;
	
		
	/**
	 * 
	 */
	public ProductCategory() {
		super();
	}
	/**
	 * @param productCategoryId
	 * @param productCategoryName
	 * @param productCategoryDesc
	 * @param createDate
	 * @param createdBy
	 * @param updatedDate
	 * @param updatedBy
	 * @param activeFlag
	 */
	public ProductCategory(int productCategoryId, String productCategoryName, String productCategoryDesc,
			Date createDate, String createdBy, Date updatedDate, String updatedBy, int activeFlag) {
		super();
		this.productCategoryId = productCategoryId;
		this.productCategoryName = productCategoryName;
		this.productCategoryDesc = productCategoryDesc;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.activeFlag = activeFlag;
	}
	/**
	 * @return the productCategoryId
	 */
	public int getProductCategoryId() {
		return productCategoryId;
	}
	/**
	 * @param productCategoryId the productCategoryId to set
	 */
	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	/**
	 * @return the productCategoryName
	 */
	public String getProductCategoryName() {
		return productCategoryName;
	}
	/**
	 * @param productCategoryName the productCategoryName to set
	 */
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	/**
	 * @return the productCategoryDesc
	 */
	public String getProductCategoryDesc() {
		return productCategoryDesc;
	}
	/**
	 * @param productCategoryDesc the productCategoryDesc to set
	 */
	public void setProductCategoryDesc(String productCategoryDesc) {
		this.productCategoryDesc = productCategoryDesc;
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
