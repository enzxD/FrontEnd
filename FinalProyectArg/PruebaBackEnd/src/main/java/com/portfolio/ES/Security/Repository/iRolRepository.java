/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.EFS.Security.Repository;

import com.portfolio.EFS.Security.Entity.Rol;
import com.portfolio.EFS.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UltraToxico
 */
@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> finByRolNombre (RolNombre rolNombre);

    public Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
