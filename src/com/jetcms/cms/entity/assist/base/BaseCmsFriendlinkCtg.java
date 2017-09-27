package com.jetcms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_friendlink_ctg table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_friendlink_ctg"
 */

public abstract class BaseCmsFriendlinkCtg  implements Serializable {

	public static String REF = "CmsFriendlinkCtg";
	public static String PROP_SITE = "site";
	public static String PROP_PRIORITY = "priority";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsFriendlinkCtg () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsFriendlinkCtg (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsFriendlinkCtg (
		Integer id,
		com.jetcms.core.entity.CmsSite site,
		String name,
		Integer priority) {

		this.setId(id);
		this.setSite(site);
		this.setName(name);
		this.setPriority(priority);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private Integer priority;

	// many to one
	private com.jetcms.core.entity.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="friendlinkctg_id"
     */
	public Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: friendlinkctg_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: friendlinkctg_name
	 * @param name the friendlinkctg_name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: priority
	 */
	public Integer getPriority () {
		return priority;
	}

	/**
	 * Set the value related to the column: priority
	 * @param priority the priority value
	 */
	public void setPriority (Integer priority) {
		this.priority = priority;
	}


	/**
	 * Return the value associated with the column: site_id
	 */
	public com.jetcms.core.entity.CmsSite getSite () {
		return site;
	}

	/**
	 * Set the value related to the column: site_id
	 * @param site the site_id value
	 */
	public void setSite (com.jetcms.core.entity.CmsSite site) {
		this.site = site;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jetcms.cms.entity.assist.CmsFriendlinkCtg)) return false;
		else {
			com.jetcms.cms.entity.assist.CmsFriendlinkCtg cmsFriendlinkCtg = (com.jetcms.cms.entity.assist.CmsFriendlinkCtg) obj;
			if (null == this.getId() || null == cmsFriendlinkCtg.getId()) return false;
			else return (this.getId().equals(cmsFriendlinkCtg.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}