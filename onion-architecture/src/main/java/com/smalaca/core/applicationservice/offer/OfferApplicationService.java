package com.smalaca.core.applicationservice.offer;

import com.smalaca.core.domain.offer.Offer;
import com.smalaca.core.domainservice.offer.OfferDomainService;

import java.util.UUID;

public class OfferApplicationService {
    private final OfferDomainService offerDomainService;

    public OfferApplicationService(OfferDomainService offerDomainService) {
        this.offerDomainService = offerDomainService;
    }

    public OfferDto display(UUID offerId) {
        Offer offer = offerDomainService.display(offerId);
        return asOfferDto(offer);
    }

    private OfferDto asOfferDto(Offer offer) {
        return null;
    }

    public void accept(UUID offerId) {
        offerDomainService.accept(offerId);
    }
}
