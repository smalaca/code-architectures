package com.smalaca.adapter.secondary.publisher;

import com.smalaca.application.offer.EventPublisher;
import com.smalaca.application.offer.OfferAcceptedEvent;

public class FakeEventPublisher implements EventPublisher {
    @Override
    public void publish(OfferAcceptedEvent offerAcceptedEvent) {

    }
}
