package com.smalaca.controller.rest;

import com.smalaca.business.processor.OfferProcessor;
import com.smalaca.controller.dto.OfferDto;
import com.smalaca.persistence.entity.Offer;

import java.util.UUID;

public class OfferController {
    private final OfferProcessor offerProcessor;

    public OfferController(OfferProcessor offerProcessor) {
        this.offerProcessor = offerProcessor;
    }

    public OfferDto display(UUID offerId) {
        Offer offer = offerProcessor.display(offerId);
        return asOfferDto(offer);
    }

    private OfferDto asOfferDto(Offer offer) {
        return null;
    }

    public void accept(UUID offerId) {
        offerProcessor.accept(offerId);
    }
}
