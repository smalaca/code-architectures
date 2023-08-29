package com.smalaca.application.offer;

public interface EventPublisher {
    void publish(OfferAcceptedEvent offerAcceptedEvent);
}
