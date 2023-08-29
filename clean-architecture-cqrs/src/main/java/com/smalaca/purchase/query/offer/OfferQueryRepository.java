package com.smalaca.purchase.query.offer;

import java.util.UUID;

public class OfferQueryRepository {
    boolean existsById(UUID offerId) {
        return false;
    }

    OfferDto findById(UUID offerId) {
        return null;
    }

    OfferDetailsDto findDetailsById(UUID offerId) {
        return null;
    }
}
