package com.smalaca.persistence.repository;

import com.smalaca.persistence.entity.Offer;

import java.util.UUID;

public class OfferRepository {
    public boolean existsById(UUID offerId) {
        return false;
    }

    public Offer findById(UUID offerId) {
        return null;
    }

    public void save(Offer offer) {

    }
}
