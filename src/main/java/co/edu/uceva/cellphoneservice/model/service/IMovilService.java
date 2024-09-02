package co.edu.uceva.cellphoneservice.model.service;

import co.edu.uceva.cellphoneservice.model.entities.Movil;
import java.util.List;

public interface IMovilService {
    List<Movil> listar(); // Retorna una lista de todos los moviles
    void delete(Movil movil); // Elimina un movil de la base de datos
    Movil save(Movil movil); // Guarda un movil y me retorna un objeto de tipo Movil
    Movil findById(Long id); // Busca un movil por su id y me retorna un objeto de tipo Movil
    Movil update(Movil movil); // Actualiza un movil y me retorna un objeto de tipo Movil
}
