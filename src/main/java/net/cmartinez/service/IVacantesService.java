package net.cmartinez.service;

import java.util.List;
import net.cmartinez.model.Vacante;

public interface IVacantesService 
{
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
}
