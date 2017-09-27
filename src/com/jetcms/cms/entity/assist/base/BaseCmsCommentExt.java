package com.jetcms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_comment_ext table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_comment_ext"
 */

public abstract class BaseCmsCommentExt  implements Serializable {

	public static String REF = "CmsCommentExt";
	public static String PROP_COMMENT = "comment";
	public static String PROP_IP = "ip";
	public static String PROP_TEXT = "text";
	public static String PROP_REPLY = "reply";
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsCommentExt () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsCommentExt (Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String ip;
	private String text;
	private String reply;

	// one to one
	private com.jetcms.cms.entity.assist.CmsComment comment;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
     *  column="comment_id"
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
	 * Return the value associated with the column: ip
	 */
	public String getIp () {
		return ip;
	}

	/**
	 * Set the value related to the column: ip
	 * @param ip the ip value
	 */
	public void setIp (String ip) {
		this.ip = ip;
	}


	/**
	 * Return the value associated with the column: text
	 */
	public String getText () {
		return text;
	}

	/**
	 * Set the value related to the column: text
	 * @param text the text value
	 */
	public void setText (String text) {
		this.text = text;
	}


	/**
	 * Return the value associated with the column: reply
	 */
	public String getReply () {
		return reply;
	}

	/**
	 * Set the value related to the column: reply
	 * @param reply the reply value
	 */
	public void setReply (String reply) {
		this.reply = reply;
	}


	/**
	 * Return the value associated with the column: comment
	 */
	public com.jetcms.cms.entity.assist.CmsComment getComment () {
		return comment;
	}

	/**
	 * Set the value related to the column: comment
	 * @param comment the comment value
	 */
	public void setComment (com.jetcms.cms.entity.assist.CmsComment comment) {
		this.comment = comment;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jetcms.cms.entity.assist.CmsCommentExt)) return false;
		else {
			com.jetcms.cms.entity.assist.CmsCommentExt cmsCommentExt = (com.jetcms.cms.entity.assist.CmsCommentExt) obj;
			if (null == this.getId() || null == cmsCommentExt.getId()) return false;
			else return (this.getId().equals(cmsCommentExt.getId()));
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