/**
 * 
 */
package com.ctrip.framework.apollo.portal.spi.zentao;

import java.util.List;

import org.springframework.util.StringUtils;

import com.ctrip.framework.apollo.portal.entity.bo.UserInfo;
import com.ctrip.framework.apollo.portal.spi.UserService;

/**
 * @author Cacti
 * 
 *	2017年3月21日
 * 
 */
public class ZentaoUserService implements UserService {
	private static final String ZENTAO_LOGIN_URL = "zentao.login.url";
	
	public ZentaoUserService() {
		String zentaoUrl = System.getenv(ZENTAO_LOGIN_URL);
		if(StringUtils.isEmpty(zentaoUrl)){
			throw new RuntimeException("Zentao login url is not specified.");
		}
	}

	/* (non-Javadoc)
	 * @see com.ctrip.framework.apollo.portal.spi.UserService#searchUsers(java.lang.String, int, int)
	 */
	@Override
	public List<UserInfo> searchUsers(String keyword, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ctrip.framework.apollo.portal.spi.UserService#findByUserId(java.lang.String)
	 */
	@Override
	public UserInfo findByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ctrip.framework.apollo.portal.spi.UserService#findByUserIds(java.util.List)
	 */
	@Override
	public List<UserInfo> findByUserIds(List<String> userIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
