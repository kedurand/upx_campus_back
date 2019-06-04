package com.example.upx_campus_back.controller;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*
    Fait le mapping des URL de l'API REST.
    Chaque requête REST va lancer l'action du service associé
    http://www.java2s.com/Tutorials/Java/JPA/0250__JPA_Lob_Column.htm
*/

/**
 * The type Activite controller.
 */
@RestController
@RequestMapping("/activites") //URL will start with it
public class ActiviteController {
    /**
     * The Activite service.
     */
    @Autowired // Get the bean called and auto-generated by Spring
    ActiviteService activiteService;

    /**
     * Get activites list.
     *
     * @return the list
     */
    @GetMapping
    public List<Activite> getActivites() {
        return activiteService.getActivites();
    }

    /**
     * Get activite activite.
     *
     * @param activiteId the activite id
     * @return the activite
     */
    @GetMapping("/{activiteId}")
    public Activite getActivite(@PathVariable Long activiteId) {
        return activiteService.getActivite(activiteId);
    }

    /**
     * Add activite activite.
     *
     * @param activite the activite
     * @return the activite
     */
    @PostMapping
    public Activite addActivite(@Valid @RequestBody Activite activite) {
        return activiteService.addActivite(activite);
    }

    /**
     * Modify activite activite.
     *
     * @param activiteId      the activite id
     * @param activiteRequest the activite request
     * @return the activite
     */
    @PutMapping("/{activiteId}")
    public Activite modifyActivite(@PathVariable Long activiteId,
                                   @Valid @RequestBody Activite activiteRequest) {
        return activiteService.modifyActivite(activiteId, activiteRequest);
    }

    /**
     * Delete activite.
     *
     * @param activiteId the activite id
     */
    @DeleteMapping("/{activiteId}")
    public void deleteActivite(@PathVariable Long activiteId) {
        activiteService.deleteActivite(activiteId);
    }
}
