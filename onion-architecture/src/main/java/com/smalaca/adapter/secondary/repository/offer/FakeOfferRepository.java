package com.smalaca.adapter.secondary.repository.offer;

import com.smalaca.core.domain.offer.Offer;
import com.smalaca.core.domainservice.offer.OfferRepository;

import java.util.UUID;

public class FakeOfferRepository implements OfferRepository {
    @Override
    public boolean existsById(UUID offerId) {
        return false;
    }

    @Override
    public Offer findById(UUID offerId) {
        return null;
    }

    @Override
    public void save(Offer offer) {

    }
}
