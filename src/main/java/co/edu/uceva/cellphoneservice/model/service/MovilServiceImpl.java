package co.edu.uceva.cellphoneservice.model.service;

import co.edu.uceva.cellphoneservice.model.dao.MovilDao;
import co.edu.uceva.cellphoneservice.model.entities.Movil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase implementa los métodos de la interfaz IMovilService y se encarga de realizar
 * las operaciones CRUD de la entidad Movil.
 */
@Service
public class MovilServiceImpl implements IMovilService {
    @Autowired
    MovilDao movilDao;

    /**
     * Este método se encarga de listar los moviles.
     * @return retorna una lista de moviles.
     */
    @Override
    public List<Movil> listar() {
        return (List<Movil>) movilDao.findAll();
    }

    /**
     * Este método se encarga de eliminar un movil.
     * @param movil movil a eliminar.
     */
    @Override
    public void delete(Movil movil) {
        movilDao.delete(movil);
    }

    /**
     * Este método se encarga de guardar un movil.
     * @param movil movil a guardar.
     * @return retorna el objeto movil guardado incluyendo el id.
     */
    @Override
    public Movil save(Movil movil) {
        return movilDao.save(movil);
    }

    /**
     * Este método se encarga de buscar un movil por su id.
     * @param id id del movil a buscar.
     * @return retorna un movil por su id.
     */
    @Override
    public Movil findById(Long id) {
        return movilDao.findById(id).orElse(null);
    }

    /**
     * Este método se encarga de actualizar un movil.
     * @param movil movil a actualizar.
     * @return retorna el objeto movil actualizado.
     */
    @Override
    public Movil update(Movil movil) {
        return movilDao.save(movil);
    }
}
