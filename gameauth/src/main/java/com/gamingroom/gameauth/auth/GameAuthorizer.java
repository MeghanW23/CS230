package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // FIXME: Finish the authorize method based on BasicAuth Security Example
    	return user.getRoles() != null && user.getRoles().contains(role); // return user's roles only if its not null and is a valid role option
    	
    }
}