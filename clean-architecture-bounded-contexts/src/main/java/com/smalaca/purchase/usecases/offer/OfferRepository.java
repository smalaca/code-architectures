package com.smalaca.purchase.usecases.offer;

import com.smalaca.purchase.entities.offer.Offer;

import java.util.UUID;

public interface OfferRepository {
    boolean existsById(UUID offerId);

    Offer findById(UUID offerId);

    void save(Offer offer);

}
