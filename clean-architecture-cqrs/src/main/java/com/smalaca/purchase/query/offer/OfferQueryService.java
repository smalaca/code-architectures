package com.smalaca.purchase.query.offer;

import java.util.UUID;

public class OfferQueryService {
    private final OfferQueryRepository offerQueryRepository;

    public OfferQueryService(OfferQueryRepository offerQueryRepository) {
        this.offerQueryRepository = offerQueryRepository;
    }

    public OfferDto display(UUID offerId) {
        if (offerQueryRepository.existsById(offerId)) {
            return offerQueryRepository.findById(offerId);
        } else {
            throw new OfferQueryException();
        }
    }

    public OfferDetailsDto displayDetails(UUID offerId) {
        if (offerQueryRepository.existsById(offerId)) {
            return offerQueryRepository.findDetailsById(offerId);
        } else {
            throw new OfferQueryException();
        }
    }
}
