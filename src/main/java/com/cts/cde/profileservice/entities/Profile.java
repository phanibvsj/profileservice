/**
 * 
 */
package com.cts.cde.profileservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author phani kumar
 *
 */
@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long profileId;

	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	private String bio;
	
	private String email;
	
	private String webSite;
	
	private long posts;
	
	private long following;
	
	private long followers;
	
	/**
	 * @return the id
	 */
	public long getProfileId() {
		return profileId;
	}

	/**
	 * @param id the id to set
	 */
	public void setProfileId(long id) {
		this.profileId = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the webSite
	 */
	public String getWebSite() {
		return webSite;
	}

	/**
	 * @param webSite the webSite to set
	 */
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	/**
	 * @return the posts
	 */
	public long getPosts() {
		return posts;
	}

	/**
	 * @param posts the posts to set
	 */
	public void setPosts(long posts) {
		this.posts = posts;
	}

	/**
	 * @return the following
	 */
	public long getFollowing() {
		return following;
	}

	/**
	 * @param following the following to set
	 */
	public void setFollowing(long following) {
		this.following = following;
	}

	/**
	 * @return the followers
	 */
	public long getFollowers() {
		return followers;
	}

	/**
	 * @param followers the followers to set
	 */
	public void setFollowers(long followers) {
		this.followers = followers;
	}
	
	
}
