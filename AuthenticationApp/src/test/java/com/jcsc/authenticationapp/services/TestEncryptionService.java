/**
 * Copyright All rights reserved for JCSC.
 */
package com.jcsc.authenticationapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;



/**
 * @author Juan Carlos Sanchez Colin.
 *
 */
@ContextConfiguration(locations = {"/hibernate/servicesDAO.xml","/hibernate/hibernate.cfg.xml", "/services/services.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestEncryptionService {
    
    @Autowired
    private EncryptionService encryptionService;

    @Test
    public void testEncryption() {
        System.out.println("---> Iniciando pruebas");
        String result = this.encryptionService.encrypt("Encryptando este texto");
        System.out.println("Resultado:" + result);
        String denuez = this.encryptionService.desencrypt(result);
        System.out.println("---> Al final:" + denuez);
        Assert.assertTrue(true);
    }
}
