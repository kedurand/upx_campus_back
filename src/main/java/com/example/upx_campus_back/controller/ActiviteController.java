package com.example.upx_campus_back.controller;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*
    Fait le mapping des URL de l'API REST.
    Chaque requête REST va lancer l'action du service associé
*/
@RestController
public class ActiviteController {
    private ActiviteService activiteService;

    @GetMapping("/activites")
    public List<Activite> getActivites(){
        return activiteService.getActivites();
    }

    @PostMapping("/activites")
    public Activite addActivite(@Valid @RequestBody Activite activite){
        return activiteService.addActivite(activite);
    }

    @PutMapping("/activites/{activiteId}")
    public Activite modifyActivite(@PathVariable Long activiteId,
                                   @Valid @RequestBody Activite activiteRequest) {
        return activiteService.modifyActivite(activiteId, activiteRequest);
    }

    @DeleteMapping("/activites/{activiteId}")
    public ResponseEntity<?> deleteActivite(@PathVariable Long activiteId) {
        return activiteService.deleteActivite(activiteId);
    }
}
