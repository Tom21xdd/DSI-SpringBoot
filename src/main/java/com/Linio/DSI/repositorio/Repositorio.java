/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linio.DSI.repositorio;
import com.Linio.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import com.Linio.DSI.Entidad.Persona;
/**
 *
 * @SneiderQuintero
 */
@Repository
public interface Repositorio extends JpaRepository<Persona, Long>{
    
}
