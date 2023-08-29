package com.smalaca.adapter.primary.rest.offer;

import com.smalaca.entities.offer.Offer;
import com.smalaca.usecases.offer.OfferUseCases;

import java.util.UUID;

public class OfferController {
    private final OfferUseCases offerUseCases;

    public OfferController(OfferUseCases offerUseCases) {
        this.offerUseCases = offerUseCases;
    }

    public OfferDto display(UUID offerId) {
        Offer offer = offerUseCases.display(offerId);
        return asOfferDto(offer);
    }

    private OfferDto asOfferDto(Offer offer) {
        return null;
    }

    public void accept(UUID offerId) {
        offerUseCases.accept(offerId);
    }
}
