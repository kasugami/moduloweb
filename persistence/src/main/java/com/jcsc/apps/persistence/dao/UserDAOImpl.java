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

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.jcsc.apps.persistence.beans.User;



/**
 * Implements the UserDAO interface.
 * @author JCSC
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

    @Override
    public final void insertUser(final User user) {
        getHibernateTemplate().save(user);
    }

    @Override
    public final void deleteUser(final User user) {
        getHibernateTemplate().delete(user);
    }

    @Override
    public final void updateUser(final User user) {
        getHibernateTemplate().update(user);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public final List<User> getUsers() {
        DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
        return (List<User>) getHibernateTemplate().findByCriteria(criteria);
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public final User getUser(final String nick) {
        DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
        criteria.add(Restrictions.eq("nick", nick));
        List<User> users = (List<User>) getHibernateTemplate().findByCriteria(criteria);
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

}
