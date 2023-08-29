package com.smalaca.application.offer;

import java.util.UUID;

public interface OfferRepository {
    boolean existsById(UUID offerId);

    Offer findById(UUID offerId);

    void save(Offer offer);

}
