package com.example.upx_campus_back.controller;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.service.ActiviteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*
    Fait le mapping des URL de l'API REST.
    Chaque requête REST va lancer l'action du service associé
*/
@RestController
@RequestMapping("/activites")
public class ActiviteController {
    private ActiviteService activiteService;

    @GetMapping
    public List<Activite> getActivites(){
        return activiteService.getActivites();
    }

    @PostMapping
    public Activite addActivite(@Valid @RequestBody Activite activite){
        return activiteService.addActivite(activite);
    }

    @PutMapping("/{activiteId}")
    public Activite modifyActivite(@PathVariable Long activiteId,
                                   @Valid @RequestBody Activite activiteRequest) {
        return activiteService.modifyActivite(activiteId, activiteRequest);
    }

    @DeleteMapping("/{activiteId}")
    public ResponseEntity<?> deleteActivite(@PathVariable Long activiteId) {
        return activiteService.deleteActivite(activiteId);
    }
}
