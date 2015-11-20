package com.klymchuk.AOP.Appartment;

import com.klymchuk.AOP.User.UserImpl;

/**
 * @author iklymchuk
 *
 */
public class AppartmentImpl implements Appartment {
	
	private UserImpl user; 

	public AppartmentImpl (UserImpl user) {
		this.user = user;
	}
	
	public UserImpl getUser() {
		return user;
	}

	public void setUser(UserImpl user) {
		this.user = user;
	}
	
	public String userAppartment(String user) {
		return user;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppartmentImpl other = (AppartmentImpl) obj;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

}
