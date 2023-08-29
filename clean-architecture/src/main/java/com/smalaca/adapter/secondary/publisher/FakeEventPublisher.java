package com.smalaca.adapter.secondary.publisher;

import com.smalaca.usecases.offer.EventPublisher;
import com.smalaca.entities.offer.OfferAcceptedEvent;

public class FakeEventPublisher implements EventPublisher {
    @Override
    public void publish(OfferAcceptedEvent offerAcceptedEvent) {

    }
}
