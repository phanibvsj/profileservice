/**
 * 
 */
package com.cts.cde.profileservice.services;

import org.springframework.stereotype.Service;

import com.cts.cde.profileservice.entities.Profile;
import com.cts.cde.profileservice.models.ProfileModel;
import com.cts.cde.profileservice.repositories.ProfileRepository;


@Service
public class ProfileServiceImpl implements ProfileService {

	ProfileRepository profileRepository;
	
	public ProfileServiceImpl(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	/* (non-Javadoc)
	 * @see com.cts.cde.profileservice.services.ProfileService#create()
	 */
	@Override
	public void create(ProfileModel model) {
		System.out.println("creating profile");
		Profile profile = new Profile();
		profile.setUserName(model.getUserName());
		profile.setFirstName(model.getFirstName());
		profile.setLastName(model.getLastName());
		profile.setBio(model.getBio());
		profile.setEmail(model.getEmail());
		profile.setWebSite(model.getWebSite());
		
		profileRepository.save(profile);
	}

	/* (non-Javadoc)
	 * @see com.cts.cde.profileservice.services.ProfileService#update()
	 */
	@Override
	public void update(ProfileModel model) {
		Profile profile = profileRepository.findByUserName(model.getUserName());
		if ( profile != null ){
			System.out.println("updating profile");
			
			profile.setUserName(model.getUserName());
			profile.setFirstName(model.getFirstName());
			profile.setLastName(model.getLastName());
			profile.setBio(model.getBio());
			profile.setEmail(model.getEmail());
			profile.setWebSite(model.getWebSite());
			
			profileRepository.save(profile);
			
		}

	}

	@Override
	public ProfileModel findByUserName(String userName) {
		Profile profile = profileRepository.findByUserName(userName);
		if ( profile != null ){
			ProfileModel model = new ProfileModel();
			model.setBio(profile.getBio());
			model.setEmail(profile.getEmail());
			model.setFirstName(profile.getFirstName());
			model.setFollowers(profile.getFollowers());
			model.setLastName(profile.getLastName());
			model.setUserName(profile.getUserName());
			model.setWebSite(profile.getWebSite());
			
			return model;
		}
		
		return null;
	}
}
