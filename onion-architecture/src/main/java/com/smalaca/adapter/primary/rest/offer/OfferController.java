package com.smalaca.adapter.primary.rest.offer;

import com.smalaca.core.applicationservice.offer.OfferApplicationService;
import com.smalaca.core.applicationservice.offer.OfferDto;

import java.util.UUID;

public class OfferController {
    private final OfferApplicationService offerApplicationService;

    public OfferController(OfferApplicationService offerApplicationService) {
        this.offerApplicationService = offerApplicationService;
    }

    public OfferDto display(UUID offerId) {
        return offerApplicationService.display(offerId);
    }

    public void accept(UUID offerId) {
        offerApplicationService.accept(offerId);
    }
}
