package org.example;

import java.util.List;

public class ServiceCapteur {
    private CapteurRepo capteurRepo;

    public ServiceCapteur(CapteurRepo capteurRepo) {
        this.capteurRepo = new CapteurRepo() {
            @Override
            public List<ReleveCapteur> getAllReleveCapteur() {
                return List.of();
            }
        };
    }

    public List<ReleveCapteur> getReleves() {
        return capteurRepo.getAllReleveCapteur();
    }
}
