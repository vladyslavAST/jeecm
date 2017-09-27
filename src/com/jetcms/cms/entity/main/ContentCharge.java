package com.jetcms.cms.entity.main;

import com.jetcms.cms.entity.main.base.BaseContentCharge;



public class ContentCharge extends BaseContentCharge {
	private static final long serialVersionUID = 1L;
	public static final Short MODEL_FREE=0;
	public static final Short MODEL_CHARGE=1;
	public static final Short MODEL_REWARD=2;
	
	public void init(){
		if(getChargeAmount()==null){
			setChargeAmount(0d);
		}
		if(getDayAmount()==null){
			setDayAmount(0d);
		}
		if(getMonthAmount()==null){
			setMonthAmount(0d);
		}
		if(getYearAmount()==null){
			setYearAmount(0d);
		}
		if(getTotalAmount()==null){
			setTotalAmount(0d);
		}
	}

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ContentCharge () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ContentCharge (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ContentCharge (
		Integer id,
		Double chargeAmount,
		Double totalAmount,
		Double yearAmount,
		Double monthAmount,
		Double dayAmount) {

		super (
			id,
			chargeAmount,
			totalAmount,
			yearAmount,
			monthAmount,
			dayAmount);
	}

/*[CONSTRUCTOR MARKER END]*/


}