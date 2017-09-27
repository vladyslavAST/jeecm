package com.jetcms.core.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_workflow table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_workflow"
 */

public abstract class BaseCmsWorkflow  implements Serializable {

	public static String REF = "CmsWorkflow";
	public static String PROP_NAME = "name";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_SITE = "site";
	public static String PROP_DISABLED = "disabled";
	public static String PROP_ID = "id";
	public static String PROP_PRIORITY = "priority";


	// constructors
	public BaseCmsWorkflow () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsWorkflow (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsWorkflow (
		Integer id,
		com.jetcms.core.entity.CmsSite site,
		String name,
		Integer priority,
		boolean disabled) {

		this.setId(id);
		this.setSite(site);
		this.setName(name);
		this.setPriority(priority);
		this.setDisabled(disabled);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String name;
	private String description;
	private Integer priority;
	private boolean disabled;
	private boolean cross;

	// many to one
	private com.jetcms.core.entity.CmsSite site;

	// collections
	private java.util.List<com.jetcms.core.entity.CmsWorkflowNode> nodes;
	private java.util.Set<com.jetcms.core.entity.CmsWorkflowEvent> events;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="workflow_id"
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
	 * Return the value associated with the column: name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: name
	 * @param name the name value
	 */
	public void setName (String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: description
	 */
	public String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (String description) {
		this.description = description;
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
	 * Return the value associated with the column: is_disabled
	 */
	public boolean isDisabled () {
		return disabled;
	}

	/**
	 * Set the value related to the column: is_disabled
	 * @param disabled the is_disabled value
	 */
	public void setDisabled (boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isCross() {
		return cross;
	}

	public void setCross(boolean cross) {
		this.cross = cross;
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


	/**
	 * Return the value associated with the column: nodes
	 */
	public java.util.List<com.jetcms.core.entity.CmsWorkflowNode> getNodes () {
		return nodes;
	}

	/**
	 * Set the value related to the column: nodes
	 * @param nodes the nodes value
	 */
	public void setNodes (java.util.List<com.jetcms.core.entity.CmsWorkflowNode> nodes) {
		this.nodes = nodes;
	}


	/**
	 * Return the value associated with the column: events
	 */
	public java.util.Set<com.jetcms.core.entity.CmsWorkflowEvent> getEvents () {
		return events;
	}

	/**
	 * Set the value related to the column: events
	 * @param events the events value
	 */
	public void setEvents (java.util.Set<com.jetcms.core.entity.CmsWorkflowEvent> events) {
		this.events = events;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jetcms.core.entity.CmsWorkflow)) return false;
		else {
			com.jetcms.core.entity.CmsWorkflow cmsWorkflow = (com.jetcms.core.entity.CmsWorkflow) obj;
			if (null == this.getId() || null == cmsWorkflow.getId()) return false;
			else return (this.getId().equals(cmsWorkflow.getId()));
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