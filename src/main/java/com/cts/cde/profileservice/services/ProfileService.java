/**
 * 
 */
package com.cts.cde.profileservice.services;

import org.springframework.stereotype.Service;

import com.cts.cde.profileservice.models.ProfileModel;

/**
 * @author phani kumar
 *
 */
@Service
public interface ProfileService {
	void create(ProfileModel model);
	void update(ProfileModel model);
	ProfileModel findByUserName(String userName);
}
