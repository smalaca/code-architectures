package com.smalaca.adapter.secondary.publisher;

import com.smalaca.core.domain.offer.OfferAcceptedEvent;
import com.smalaca.core.domainservice.offer.EventPublisher;

public class FakeEventPublisher implements EventPublisher {
    @Override
    public void publish(OfferAcceptedEvent offerAcceptedEvent) {

    }
}
