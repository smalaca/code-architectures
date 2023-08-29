package com.smalaca.purchase.usecases.offer;

import com.smalaca.purchase.entities.offer.OfferAcceptedEvent;

public interface EventPublisher {
    void publish(OfferAcceptedEvent offerAcceptedEvent);
}
