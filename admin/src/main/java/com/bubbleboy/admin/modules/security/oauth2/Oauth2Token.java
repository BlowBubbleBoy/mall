
package com.bubbleboy.admin.modules.security.oauth2;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 */
public class Oauth2Token implements AuthenticationToken {
    private final String token;

    public Oauth2Token(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
