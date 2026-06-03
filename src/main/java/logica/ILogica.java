/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica;

import Modelo.Asignatura;
import co.edu.uvpalmira.fpoe.jpalib.NonexistentEntityException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 *
 * @author Hassan Jimenez
 */
public interface ILogica {

    public void crearAsignatura(Asignatura asignatura) throws SQLIntegrityConstraintViolationException, Exception;

    public void modificarAsignatura(Asignatura asignatura)throws NonexistentEntityException, Exception;

    public Asignatura buscarAsignatura(String codigo);

    public List<Asignatura> buscarAsignaturas();

}
