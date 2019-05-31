package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

/*
    Permet d'ajouter des controls supplémentaire vis à vis du métier
    https://openclassrooms.com/fr/courses/4668056-construisez-des-microservices/5123366-utilisez-jpa-pour-communiquer-avec-une-base-de-donnees
 */
public class ActiviteServiceImpl implements ActiviteService{
    // Il n'utilise que l'interface, pas besoin d'implémentation
    // Autowired permet de le construire automatiquement ?
    @Autowired
    private ActiviteRepository activiteRepository;

    @Override
    public List<Activite> getActivites() {
        return activiteRepository.findAll();
    }

    @Override
    public Activite addActivite(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public Activite modifyActivite(Long activiteId, Activite activiteRequest) {
        Activite activite = activiteRepository.findById(activiteId);
        tedoqjdoqspjdo^q
        return activiteRepository.findById(activiteId)
                    .map(
                        question -> {
                            question.setTitle(questionRequest.getTitle());
                            question.setDescription(questionRequest.getDescription());
                        return questionRepository.save(question);
                    }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
    }

    @Override
    public ResponseEntity<?> deleteActivite(Long activiteId) {
        return questionRepository.findById(questionId)
                .map(question -> {
                    questionRepository.delete(question);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + questionId));
    }
}
