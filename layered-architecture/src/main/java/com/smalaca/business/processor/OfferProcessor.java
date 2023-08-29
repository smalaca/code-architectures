package com.smalaca.business.processor;

import com.smalaca.business.event.OfferAcceptedEvent;
import com.smalaca.business.exception.OfferException;
import com.smalaca.business.publisher.EventPublisher;
import com.smalaca.persistence.entity.Offer;
import com.smalaca.persistence.repository.OfferRepository;

import java.util.UUID;

public class OfferProcessor {
    private final OfferRepository offerRepository;
    private final EventPublisher eventPublisher;

    public OfferProcessor(OfferRepository offerRepository, EventPublisher eventPublisher) {
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
