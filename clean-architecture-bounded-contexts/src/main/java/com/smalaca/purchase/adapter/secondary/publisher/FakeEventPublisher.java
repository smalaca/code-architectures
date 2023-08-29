package com.smalaca.purchase.adapter.secondary.publisher;

import com.smalaca.purchase.entities.offer.OfferAcceptedEvent;
import com.smalaca.purchase.usecases.offer.EventPublisher;

public class FakeEventPublisher implements EventPublisher {
    @Override
    public void publish(OfferAcceptedEvent offerAcceptedEvent) {

    }
}
