package com.jetcms.cms.entity.assist.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_site_access_statistic table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_site_access_statistic"
 */

public abstract class BaseCmsSiteAccessStatistic  implements Serializable {

	public static String REF = "CmsSiteAccessStatistic";
	public static String PROP_STATISITC_TYPE = "statisitcType";
	public static String PROP_PV = "pv";
	public static String PROP_PAGES_AVER = "pagesAver";
	public static String PROP_IP = "ip";
	public static String PROP_SITE = "site";
	public static String PROP_VISITORS = "visitors";
	public static String PROP_ID = "id";
	public static String PROP_STATISTIC_DATE = "statisticDate";
	public static String PROP_STATISTIC_COLUMN_VALUE = "statisticColumnValue";
	public static String PROP_VISIT_SECOND_AVER = "visitSecondAver";


	// constructors
	public BaseCmsSiteAccessStatistic () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSiteAccessStatistic (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSiteAccessStatistic (
		Integer id,
		com.jetcms.core.entity.CmsSite site,
		java.util.Date statisticDate,
		Integer pv,
		Integer ip,
		Integer visitors,
		Integer pagesAver,
		Integer visitSecondAver,
		String statisitcType) {

		this.setId(id);
		this.setSite(site);
		this.setStatisticDate(statisticDate);
		this.setPv(pv);
		this.setIp(ip);
		this.setVisitors(visitors);
		this.setPagesAver(pagesAver);
		this.setVisitSecondAver(visitSecondAver);
		this.setStatisitcType(statisitcType);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private java.util.Date statisticDate;
	private Integer pv;
	private Integer ip;
	private Integer visitors;
	private Integer pagesAver;
	private Integer visitSecondAver;
	private String statisitcType;
	private String statisticColumnValue;

	// many to one
	private com.jetcms.core.entity.CmsSite site;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="access_statistic_id"
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
	 * Return the value associated with the column: statistic_date
	 */
	public java.util.Date getStatisticDate () {
		return statisticDate;
	}

	/**
	 * Set the value related to the column: statistic_date
	 * @param statisticDate the statistic_date value
	 */
	public void setStatisticDate (java.util.Date statisticDate) {
		this.statisticDate = statisticDate;
	}


	/**
	 * Return the value associated with the column: pv
	 */
	public Integer getPv () {
		return pv;
	}

	/**
	 * Set the value related to the column: pv
	 * @param pv the pv value
	 */
	public void setPv (Integer pv) {
		this.pv = pv;
	}


	/**
	 * Return the value associated with the column: ip
	 */
	public Integer getIp () {
		return ip;
	}

	/**
	 * Set the value related to the column: ip
	 * @param ip the ip value
	 */
	public void setIp (Integer ip) {
		this.ip = ip;
	}


	/**
	 * Return the value associated with the column: visitors
	 */
	public Integer getVisitors () {
		return visitors;
	}

	/**
	 * Set the value related to the column: visitors
	 * @param visitors the visitors value
	 */
	public void setVisitors (Integer visitors) {
		this.visitors = visitors;
	}


	/**
	 * Return the value associated with the column: pages_aver
	 */
	public Integer getPagesAver () {
		return pagesAver;
	}

	/**
	 * Set the value related to the column: pages_aver
	 * @param pagesAver the pages_aver value
	 */
	public void setPagesAver (Integer pagesAver) {
		this.pagesAver = pagesAver;
	}


	/**
	 * Return the value associated with the column: visit_second_aver
	 */
	public Integer getVisitSecondAver () {
		return visitSecondAver;
	}

	/**
	 * Set the value related to the column: visit_second_aver
	 * @param visitSecondAver the visit_second_aver value
	 */
	public void setVisitSecondAver (Integer visitSecondAver) {
		this.visitSecondAver = visitSecondAver;
	}


	/**
	 * Return the value associated with the column: statisitc_type
	 */
	public String getStatisitcType () {
		return statisitcType;
	}

	/**
	 * Set the value related to the column: statisitc_type
	 * @param statisitcType the statisitc_type value
	 */
	public void setStatisitcType (String statisitcType) {
		this.statisitcType = statisitcType;
	}


	/**
	 * Return the value associated with the column: statistic_column_value
	 */
	public String getStatisticColumnValue () {
		return statisticColumnValue;
	}

	/**
	 * Set the value related to the column: statistic_column_value
	 * @param statisticColumnValue the statistic_column_value value
	 */
	public void setStatisticColumnValue (String statisticColumnValue) {
		this.statisticColumnValue = statisticColumnValue;
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
		if (!(obj instanceof com.jetcms.cms.entity.assist.CmsSiteAccessStatistic)) return false;
		else {
			com.jetcms.cms.entity.assist.CmsSiteAccessStatistic cmsSiteAccessStatistic = (com.jetcms.cms.entity.assist.CmsSiteAccessStatistic) obj;
			if (null == this.getId() || null == cmsSiteAccessStatistic.getId()) return false;
			else return (this.getId().equals(cmsSiteAccessStatistic.getId()));
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