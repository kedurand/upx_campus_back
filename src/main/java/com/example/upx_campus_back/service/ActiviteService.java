package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Activite;
import org.jvnet.hk2.annotations.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ActiviteService {
    List<Activite> getActivites();
    Activite addActivite(Activite activite);
    Activite modifyActivite(Long activiteId, Activite activiteRequest);
    ResponseEntity<?> deleteActivite(Long activiteId);
}
