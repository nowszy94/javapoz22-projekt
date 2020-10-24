package com.sda.javapoz22projekt.service;

import com.sda.javapoz22projekt.model.Offer;
import com.sda.javapoz22projekt.repository.OfferRepository;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    private OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public Offer getById(Long id) {
        return offerRepository.findById(id).get();
    }

    public Iterable<Offer> getAll() {
        return offerRepository.findAll();
    }
}
