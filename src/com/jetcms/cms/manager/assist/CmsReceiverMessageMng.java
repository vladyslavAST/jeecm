package com.jetcms.cms.manager.assist;

import java.util.Date;
import java.util.List;

import com.jetcms.cms.entity.assist.CmsReceiverMessage;
import com.jetcms.common.page.Pagination;

/**
 *江西金磊科技发展有限公司jetcms研发
 */
public interface CmsReceiverMessageMng {
	public Pagination getPage(Integer siteId, Integer sendUserId,
                              Integer receiverUserId, String title, Date sendBeginTime,
                              Date sendEndTime, Boolean status, Integer box, Boolean cacheable,
                              int pageNo, int pageSize);
	
	public List<CmsReceiverMessage> getList(Integer siteId, Integer sendUserId,
                                            Integer receiverUserId, String title, Date sendBeginTime,
                                            Date sendEndTime, Boolean status, Integer box, Boolean cacheable);
	
	public CmsReceiverMessage find(Integer messageId, Integer box);

	public CmsReceiverMessage findById(Integer id);

	public CmsReceiverMessage save(CmsReceiverMessage bean);

	public CmsReceiverMessage update(CmsReceiverMessage bean);

	public CmsReceiverMessage deleteById(Integer id);

	public CmsReceiverMessage[] deleteByIds(Integer[] ids);
}