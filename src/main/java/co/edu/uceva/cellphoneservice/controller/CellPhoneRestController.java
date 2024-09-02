package co.edu.uceva.cellphoneservice.controller;

import co.edu.uceva.cellphoneservice.model.entities.Movil;
import co.edu.uceva.cellphoneservice.model.service.MovilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase es el controlador de la entidad Movil y se mapea con la url /api/v1/movil-service
 * y se encarga de exponer los servicios rest de la entidad Movil para realizar las operaciones CRUD
 * de la entidad Movil. Se encarga de recibir las peticiones http y retornar las respuestas http.
 */
@RestController
@RequestMapping("/api/v1/movil-service")
public class CellPhoneRestController {

    @Autowired
    private MovilServiceImpl movilService; // Inyecto el servicio de la entidad Movil para realizar las operaciones CRUD

    /**
     * Este metodo se encarga de retornar una lista de todos los moviles
     * @return retorna una lista de todos los moviles
     */
    @GetMapping("/moviles")
    public List<Movil> listar() {
        return this.movilService.listar();
    }

    /**
     * Este metodo se encarga de retornar un movil por su id y se mapea con la url /api/movil-service/moviles/{id}
     * @param id es el id del movil a buscar
     * @return retorna un movil por su id
     */
    @GetMapping("/moviles/{id}")
    public Movil buscarMovil(@PathVariable Long id) {
        return this.movilService.findById(id);
    }

    /**
     * Este metodo guarda un movil y me retorna el objeto de tipo Movil ya guardado con su id asignado
     * @param movil es el objeto de tipo Movil a guardar (sin el id)
     * @return retorna el objeto de tipo Movil guardado con su id asignado
     */
    @PostMapping("/movil")
    public Movil guardarMovil(@RequestBody Movil movil) {
        return this.movilService.save(movil);
    }

    /**
     * Este metodo actualiza un movil y me retorna el objeto de tipo Movil ya actualizado
     * @param movil es el objeto de tipo Movil a actualizar (con el id)
     * @return retorna el objeto de tipo Movil actualizado
     */
    @PutMapping("/movil")
    public Movil actualizarMovil(@RequestBody Movil movil) {
        return this.movilService.save(movil);
    }

    /**
     * Este metodo elimina un movil por su id
     * @param id es el id del movil a eliminar
     */
    @DeleteMapping("/moviles/{id}")
    public void eliminarMovil(@PathVariable Long id) {
        Movil movil = this.movilService.findById(id); // Encuentro un movil por su id
        this.movilService.delete(movil);
    }

}
