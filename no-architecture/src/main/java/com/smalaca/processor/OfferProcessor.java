package com.smalaca.processor;

import com.smalaca.entity.Offer;
import com.smalaca.event.OfferAcceptedEvent;
import com.smalaca.publisher.EventPublisher;
import com.smalaca.repository.OfferRepository;

import java.util.UUID;

public class OfferProcessor {
    private final OfferRepository offerRepository;
    private final EventPublisher eventPublisher;

    public OfferProcessor(OfferRepository offerRepository, EventPublisher eventPublisher) {
        this.offerRepository = offerRepository;
        this.eventPublisher = eventPublisher;
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
