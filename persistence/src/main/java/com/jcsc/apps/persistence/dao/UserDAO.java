/**
 * This is a protected software in favor of its producer JCSC the Copyrights are
 * recognized for the Federal Copyright Act. Prohibiting their production,
 * reproduction,   distribution, marketing, sale or lease, without the without
 * the prior in writing of the holder. The violation of this prohibition is a
 * crime and an infraction, punishable under Articles 424 of Penal Code Section
 * III for D.F. in subject-matter of common law and for the Republic on
 * jurisdiction federal 231 Section I of the Federal Copyright Act.
 */

package com.jcsc.apps.persistence.dao;

import java.util.List;

import com.jcsc.apps.persistence.beans.User;


/**
 * Interface to access to the user model.
 * @author JCSC
 */
public interface UserDAO {
    /**
     * Inserts a new user in DB.
     * @param user
     *            to insert.
     */
    void insertUser(User user);

    /**
     * Deletes a user of data base.
     * @param user
     *            to delete.
     */
    void deleteUser(User user);

    /**
     * Updates a user in data base.
     * @param user
     *            to update.
     */
    void updateUser(User user);

    /**
     * Gets all users existing in the data base.
     * @return List with users.
     */
    List<User> getUsers();

    /**
     * Gets a user by key.
     * @param nick
     *            is the key.
     * @return User a user.
     */
    User getUser(String nick);
}
