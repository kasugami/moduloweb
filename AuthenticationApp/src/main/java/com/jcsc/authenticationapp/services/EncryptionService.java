/**
 * Copyright All rights reserved for JCSC.
 */
package com.jcsc.authenticationapp.services;

/**
 * @author Juan Carlos Sanchez Colin.
 *
 */
public interface EncryptionService {

    String encrypt(String text);
    
    String desencrypt(String text);
}
