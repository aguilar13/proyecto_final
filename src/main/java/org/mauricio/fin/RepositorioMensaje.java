    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mauricio.fin;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author T-
 */
public interface RepositorioMensaje extends MongoRepository<Mensaje,String> {
    
}
