package com.jcsc.authenticationapp.beans;

/**
 * Represent a User.
 * @author Kasugami
 *
 */
public class UserAdeA {

    /**
     * User name.
     */
    private String user;
    /**
     * Key or password.
     */
    private String password;
    /**
     * Gets value of user attribute.
     * @return the user
     */
    public final String getUser() {
        return user;
    }
    /**
     * Sets user as value for user.
     * @param user the user to set
     */
    public final void setUser(final String user) {
        this.user = user;
    }
    /**
     * Gets value of password attribute.
     * @return the password
     */
    public final String getPassword() {
        return password;
    }
    /**
     * Sets password as value for password.
     * @param password the password to set
     */
    public final void setPassword(final String password) {
        this.password = password;
    }

}
