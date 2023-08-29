package com.smalaca.core.domainservice.offer;

import com.smalaca.core.domain.offer.OfferAcceptedEvent;

public interface EventPublisher {
    void publish(OfferAcceptedEvent offerAcceptedEvent);
}
