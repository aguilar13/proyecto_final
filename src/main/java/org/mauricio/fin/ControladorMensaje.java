/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mauricio.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
@CrossOrigin
public class ControladorMensaje {
    @Autowired RepositorioMensaje rm;

    
    @RequestMapping(value="/guardar-mensaje",method=RequestMethod.GET,headers={"Accept=text/html"})
    public String guardarmensaje(){

    rm.save(new Mensaje("Mi primer registro en mongo"));
    return "Mensaje Guardado";
    
}
}