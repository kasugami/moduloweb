/**
 * This is a protected software in favor of its producer JCSC the Copyrights are
 * recognized for the Federal Copyright Act. Prohibiting their production,
 * reproduction,   distribution, marketing, sale or lease, without the without
 * the prior in writing of the holder. The violation of this prohibition is a
 * crime and an infraction, punishable under Articles 424 of Penal Code Section
 * III for D.F. in subject-matter of common law and for the Republic on
 * jurisdiction federal 231 Section I of the Federal Copyright Act.
 */
package com.jcsc.apps.persistence.beans;

/**
 * Represents a User for the application.
 * @author JCSC
 */
public class User {
    /**
     * Nick User.
     */
    private String nick;
    /**
     * Password of user.
     */
    private String password;
    /**
     * Status of user.
     */
    private String status;
    /**
     * Profile of user.
     */
    private int profile;
    /**
     * Gets value of nick attribute.
     * @return the nick
     */
    public final String getNick() {
        return nick;
    }
    /**
     * Sets nick as value for nick.
     * @param nick the nick to set
     */
    public final void setNick(String nick) {
        this.nick = nick;
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
    public final void setPassword(String password) {
        this.password = password;
    }
    /**
     * Gets value of status attribute.
     * @return the status
     */
    public final String getStatus() {
        return status;
    }
    /**
     * Sets status as value for status.
     * @param status the status to set
     */
    public final void setStatus(String status) {
        this.status = status;
    }
    /**
     * Gets value of profile attribute.
     * @return the profile
     */
    public final int getProfile() {
        return profile;
    }
    /**
     * Sets profile as value for profile.
     * @param profile the profile to set
     */
    public final void setProfile(int profile) {
        this.profile = profile;
    }

}
