/**
 * JCSC Copy Right.
 */
package com.jcsc.authenticationapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jcsc.authenticationapp.beans.ResponseAuth;
import com.jcsc.authenticationapp.beans.UserAdeA;
import com.jcsc.authenticationapp.constants.GeneralConstants;
import com.jcsc.authenticationapp.services.AuthenticationService;


/**
 * @author Kasugami
 */
@RestController
public class AuthenticationController {

    /**
     * Service for authentication.
     */
    @Autowired
    private AuthenticationService authenticationService;

    /**
     * Attending request for login.
     * @param user User information
     * @return ResponseAuth Response.
     */
    @RequestMapping(method = RequestMethod.POST, value = "session/login")
    public final ResponseAuth login(@RequestBody final UserAdeA user) {
        System.out.println("Iniciando sesionO");
        System.out.println("--> ](JCSC) user:" + user.getUser());
        this.authenticationService.loginProcess(user);
        return new ResponseAuth(GeneralConstants.HTTP_OK, "Usuario correcto");
    }
}
