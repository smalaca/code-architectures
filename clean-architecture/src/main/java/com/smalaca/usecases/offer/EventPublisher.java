package com.smalaca.usecases.offer;

import com.smalaca.entities.offer.OfferAcceptedEvent;

public interface EventPublisher {
    void publish(OfferAcceptedEvent offerAcceptedEvent);
}
