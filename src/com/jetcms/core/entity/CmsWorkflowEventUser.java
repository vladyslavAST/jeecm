package com.jetcms.core.entity;

import com.jetcms.core.entity.base.BaseCmsWorkflowEventUser;



public class CmsWorkflowEventUser extends BaseCmsWorkflowEventUser {
	private static final long serialVersionUID = 1L;

	public CmsWorkflowEventUser(CmsWorkflowEvent event, CmsUser user) {
		super(event, user);
	}
	
	

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsWorkflowEventUser () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsWorkflowEventUser (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsWorkflowEventUser (
		Integer id,
		CmsWorkflowEvent event,
		CmsUser user) {

		super (
			id,
			event,
			user);
	}


/*[CONSTRUCTOR MARKER END]*/


}