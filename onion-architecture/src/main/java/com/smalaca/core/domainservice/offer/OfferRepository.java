package com.smalaca.core.domainservice.offer;

import com.smalaca.core.domain.offer.Offer;

import java.util.UUID;

public interface OfferRepository {
    boolean existsById(UUID offerId);

    Offer findById(UUID offerId);

    void save(Offer offer);

}
