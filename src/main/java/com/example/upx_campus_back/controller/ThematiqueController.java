package com.example.upx_campus_back.controller;


import com.example.upx_campus_back.model.Thematique;
import com.example.upx_campus_back.service.ThematiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * The type Thematique controller.
 */
@RestController
@RequestMapping("/thematiques")
public class ThematiqueController {
    /**
     * The Thematique service.
     */
    @Autowired
    ThematiqueService thematiqueService;

    /**
     * Get thematiques list.
     *
     * @return the list
     */
    @GetMapping
    public List<Thematique> getThematiques() {
        return thematiqueService.getThematiques();
    }

    /**
     * Get thematique thematique.
     *
     * @param thematiqueId the thematique id
     * @return the thematique
     */
    @GetMapping("/{thematiqueId}")
    public Thematique getThematique(@PathVariable Long thematiqueId) {
        return thematiqueService.getThematique(thematiqueId);
    }

    /**
     * Add thematique thematique.
     *
     * @param thematique the thematique
     * @return the thematique
     */
    @PostMapping
    public Thematique addThematique(@Valid @RequestBody Thematique thematique) {
        return thematiqueService.addThematique(thematique);
    }

    /**
     * Modify thematique thematique.
     *
     * @param thematiqueId      the thematique id
     * @param thematiqueRequest the thematique request
     * @return the thematique
     */
    @PutMapping("/{thematiqueId}")
    public Thematique modifyThematique(@PathVariable Long thematiqueId,
                                       @Valid @RequestBody Thematique thematiqueRequest) {
        return thematiqueService.modifyThematique(thematiqueId, thematiqueRequest);
    }

    /**
     * Delete thematique.
     *
     * @param thematiqueId the thematique id
     */
    @DeleteMapping("/{thematiqueId}")
    public void deleteThematique(@PathVariable Long thematiqueId) {
        thematiqueService.deleteThematique(thematiqueId);
    }
}
