/**
 * 
 */
package com.cts.cde.profileservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cts.cde.profileservice.entities.Profile;

/**
 * @author phani kumar
 *
 */
public interface ProfileRepository extends CrudRepository<Profile, Long> {

	Profile findByUserName(String userName);
}
