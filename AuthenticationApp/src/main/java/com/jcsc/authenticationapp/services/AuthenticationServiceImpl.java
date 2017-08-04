package com.jcsc.authenticationapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.jcsc.apps.persistence.beans.User;
import com.jcsc.apps.persistence.dao.UserDAO;
import com.jcsc.authenticationapp.beans.UserAdeA;

/**
 * Implements a type of AuthenticationService.
 * @author Kasugami
 *
 */
public class AuthenticationServiceImpl implements AuthenticationService {
    
    @Autowired
    private UserDAO userDAO;

    @Override
    public final void loginProcess(final UserAdeA user) {
        System.out.println("Logenado");
        User userSaved = this.userDAO.getUser(user.getUser());
        if (userSaved != null) {
            System.out.println("----> (JCSC) Si encontro usuario:" + userSaved.getPassword());
        } else {
            System.out.println("----> (JCSC) No encontro nada de nada");
        }
        

    }

}
