package com.jetcms.core.entity;

import java.util.Calendar;

import com.jetcms.cms.entity.main.Content;
import com.jetcms.core.entity.base.BaseCmsWorkflowEvent;



public class CmsWorkflowEvent extends BaseCmsWorkflowEvent {
	private static final long serialVersionUID = 1L;
	public void init(){
		if(getStartTime()==null){
			setStartTime(Calendar.getInstance().getTime());
		}
		if(getDateType()==null){
			setDateType(Content.DATA_CONTENT);
		}
		if(getHasFinish()==null){
			setHasFinish(false);
		}
		//会签第一人建立流程轨迹 通过数为1
		if(getPassNum()==null){
			setPassNum(0);
		}
	}

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsWorkflowEvent () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsWorkflowEvent (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsWorkflowEvent (
		Integer id,
		CmsWorkflow workFlow,
		CmsUser initiator,
		Integer dateId,
		java.util.Date startTime,
		Integer nextStep,
		Integer dateType,
		Boolean hasFinish) {

		super (
			id,
			workFlow,
			initiator,
			dateId,
			startTime,
			nextStep,
			dateType,
			hasFinish);
	}

/*[CONSTRUCTOR MARKER END]*/


}