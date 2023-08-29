package com.smalaca.purchase.adapter.primary.rest.offer;

import com.smalaca.purchase.query.offer.OfferDetailsDto;
import com.smalaca.purchase.query.offer.OfferDto;
import com.smalaca.purchase.query.offer.OfferQueryService;
import com.smalaca.purchase.usecases.offer.OfferUseCases;

import java.util.UUID;

public class OfferController {
    private final OfferUseCases offerUseCases;
    private final OfferQueryService offerQueryService;

    public OfferController(OfferUseCases offerUseCases, OfferQueryService offerQueryService) {
        this.offerUseCases = offerUseCases;
        this.offerQueryService = offerQueryService;
    }

    public OfferDto display(UUID offerId) {
        return offerQueryService.display(offerId);
    }

    public OfferDetailsDto displayDetails(UUID offerId) {
        return offerQueryService.displayDetails(offerId);
    }

    public void accept(UUID offerId) {
        offerUseCases.accept(offerId);
    }
}
