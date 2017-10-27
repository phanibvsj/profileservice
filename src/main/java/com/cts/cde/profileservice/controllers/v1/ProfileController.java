/**
 * 
 */
package com.cts.cde.profileservice.controllers.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cde.profileservice.models.ProfileModel;
import com.cts.cde.profileservice.services.ProfileService;


@RestController
@RequestMapping(path="/profile/v1")
public class ProfileController {
	
	@Autowired
	ProfileService profileService;

	@RequestMapping(path="/{username}", method=RequestMethod.GET)
	public ProfileModel getProfile(@PathVariable(name="username") String userName){
		System.out.println("Requested Profile: " + userName);
		ProfileModel profile = profileService.findByUserName(userName);
		
		return profile;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void createProfile(@RequestBody(required=true) ProfileModel profile){
		System.out.println("Requested Profile: " + profile.getUserName());
		System.out.println("Profile:" + profile);
		profileService.create(profile);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateProfile(@RequestBody(required=true) ProfileModel profile){
		System.out.println("Requested Profile: " + profile.getUserName());
		System.out.println("Profile:" + profile);
		profileService.update(profile);
		
	}
}
