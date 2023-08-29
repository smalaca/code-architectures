package com.smalaca.controller;

import com.smalaca.dto.OfferDto;
import com.smalaca.entity.Offer;
import com.smalaca.exception.OfferException;
import com.smalaca.processor.OfferProcessor;
import com.smalaca.repository.OfferRepository;

import java.util.UUID;

public class OfferController {
    private final OfferProcessor offerProcessor;
    private final OfferRepository offerRepository;

    public OfferController(OfferProcessor offerProcessor, OfferRepository offerRepository) {
        this.offerProcessor = offerProcessor;
        this.offerRepository = offerRepository;
    }

    public OfferDto display(UUID offerId) {
        if (offerRepository.existsById(offerId)) {
            Offer offer = offerRepository.findById(offerId);
            return asOfferDto(offer);
        } else {
            throw new OfferException();
        }
    }

    private OfferDto asOfferDto(Offer offer) {
        return null;
    }

    public void accept(UUID offerId) {
        offerProcessor.accept(offerId);
    }
}
