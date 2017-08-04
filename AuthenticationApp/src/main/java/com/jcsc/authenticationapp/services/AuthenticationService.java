package com.jcsc.authenticationapp.services;

import com.jcsc.authenticationapp.beans.UserAdeA;
/**
 * Service that contains methods for login and logout process.
 * @author Kasugami
 *
 */
public interface AuthenticationService {

    /**
     * Process of login.
     * @param user Represent a user.
     */
    void loginProcess(UserAdeA user);
}
