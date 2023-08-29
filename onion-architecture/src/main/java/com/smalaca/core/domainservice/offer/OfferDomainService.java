package com.smalaca.core.domainservice.offer;

import com.smalaca.core.domain.offer.Offer;
import com.smalaca.core.domain.offer.OfferAcceptedEvent;

import java.util.UUID;

public class OfferDomainService {
    private final OfferRepository offerRepository;
    private final EventPublisher eventPublisher;

    public OfferDomainService(OfferRepository offerRepository, EventPublisher eventPublisher) {
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
