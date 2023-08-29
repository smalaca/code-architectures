package com.smalaca.usecases.offer;

import com.smalaca.entities.offer.Offer;

import java.util.UUID;

public interface OfferRepository {
    boolean existsById(UUID offerId);

    Offer findById(UUID offerId);

    void save(Offer offer);

}
