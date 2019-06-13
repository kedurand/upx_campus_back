package com.example.upx_campus_back.controller;

import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.service.BatimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * The type Batiment controller.
 */
@RestController
@RequestMapping("/batiments")
public class BatimentController {
    /**
     * The Batiment service.
     */
    @Autowired
    BatimentService batimentService;

    /**
     * Get batiments list.
     *
     * @return the list
     */
    @GetMapping
    public List<Batiment> getBatiments() {
        return batimentService.getBatiments();
    }

    /**
     * Get batiment batiment.
     *
     * @param batimentId the batiment id
     * @return the batiment
     */
    @GetMapping("/{batimentId}")
    public Batiment getBatiment(@PathVariable Long batimentId) {
        return batimentService.getBatiment(batimentId);
    }


    /**
     * Get batiment image byte [ ].
     *
     * @param batimentId the batiment id
     * @return the byte [ ]
     */
    @GetMapping(path = "/image/{batimentId}")
    public byte[] getBatimentImage(@PathVariable Long batimentId){
        return batimentService.getBatimentImage(batimentId);
    }

    /**
     * Get Liste Batiments de l'activité
     *
     * @param idA the activite id
     * @return Une liste d'entier
     */
    @GetMapping("/activite/{idA}")
    public List<Batiment> getBatimentsByActivite(@PathVariable long idA){
        return batimentService.getBatimentsByActivite(idA);
    }

    /**
     * Get Liste Batiments de la thematique
     *
     * @param idT Id de la thematique
     * @return Une liste d'entier
     */
    @GetMapping("/thematique/{idT}")
    public List<Batiment> getBatimentsByThematique(@PathVariable long idT){
        return batimentService.getBatimentsByThematique(idT);
    }


    /**
     * Add batiment batiment.
     *
     * @param batiment the batiment
     * @return the batiment
     */
    @PostMapping
    public Batiment addBatiment(@Valid @RequestBody Batiment batiment) {
        return batimentService.addBatiment(batiment);
    }

    /**
     * Modify batiment batiment.
     *
     * @param batimentId      the batiment id
     * @param batimentRequest the batiment request
     * @return the batiment
     */
    @PutMapping("/{batimentId}")
    public Batiment modifyBatiment(@PathVariable Long batimentId,
                                   @Valid @RequestBody Batiment batimentRequest) {
        return batimentService.modifyBatiment(batimentId, batimentRequest);
    }

    /**
     * Delete batiment.
     *
     * @param batimentId the batiment id
     */
    @DeleteMapping("/{batimentId}")
    public void deleteBatiment(@PathVariable Long batimentId) {
        batimentService.deleteBatiment(batimentId);
    }
}
