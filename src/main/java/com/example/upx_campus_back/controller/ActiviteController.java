package com.example.upx_campus_back.controller;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.model.Thematique;
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
public class ActiviteController {
    private ActiviteService activiteService;

    @RequestMapping(value = "/activites", method = RequestMethod.GET)
    public List<Activite> getActivites(){
        return activiteService.getActivites();
    }

    @RequestMapping(value = "/addactivite/{id}/{text}/{thematique}/[{liseBatiment}]",method = RequestMethod.POST)
    public ResponseEntity<Activite> saveActivite (@PathVariable Long id, @PathVariable String text, @PathVariable Thematique thematique, @PathVariable Batiment[] listeBatiment){
        Activite activite = new Activite();
        activite.setId(id);
        activite.setText(text);
        activite.setThematique(thematique);
// a finir
return null;

    }

  /*  @PostMapping
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
    }*/
}
