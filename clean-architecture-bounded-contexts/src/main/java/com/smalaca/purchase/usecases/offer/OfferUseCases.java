package com.smalaca.purchase.usecases.offer;

import com.smalaca.purchase.entities.offer.Offer;
import com.smalaca.purchase.entities.offer.OfferAcceptedEvent;

import java.util.UUID;

public class OfferUseCases {
    private final OfferRepository offerRepository;
    private final EventPublisher eventPublisher;

    public OfferUseCases(OfferRepository offerRepository, EventPublisher eventPublisher) {
        this.offerRepository = offerRepository;
        this.eventPublisher = eventPublisher;
    }

    public Offer display(UUID offerId) {
        if (offerRepository.existsById(offerId)) {
            return offerRepository.findById(offerId);
        } else {
            throw new OfferException();
        }
    }

    public void accept(UUID offerId) {
        if (offerRepository.existsById(offerId)) {
            Offer offer = offerRepository.findById(offerId);
            offer.accept();
            offerRepository.save(offer);
            eventPublisher.publish(new OfferAcceptedEvent(offerId));
        }
    }
}
