/**
 * Copyright All rights reserved for JCSC.
 */
package com.jcsc.apps.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.jcsc.apps.persistence.beans.User;
import com.jcsc.apps.persistence.dao.UserDAO;



/**
 * @author Juan Carlos Sanchez Colin.
 *
 */
@ContextConfiguration(locations = {"/hibernate/servicesDAO.xml","/hibernate/hibernate.cfg.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUserDAO {
    
    @Autowired
    private UserDAO userDAO;

    @Test
    public void testSelect() {
        System.out.println("--- (JCSC) Ejecutando test");
        User user = this.userDAO.getUser("juan");
        System.out.println("---> (JCSC) Devolvio:" + user.getPassword());
        System.out.println("Termino");
        Assert.assertTrue(true);
    }
}
