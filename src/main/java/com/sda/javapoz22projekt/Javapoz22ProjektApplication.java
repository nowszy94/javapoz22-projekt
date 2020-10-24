package com.sda.javapoz22projekt;

import com.sda.javapoz22projekt.model.Offer;
import com.sda.javapoz22projekt.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Javapoz22ProjektApplication {

    @Autowired
    private OfferRepository offerRepository;

    public static void main(String[] args) {
        SpringApplication.run(Javapoz22ProjektApplication.class, args);
    }

    @PostConstruct
    public void init() {
        offerRepository.save(new Offer(null, "Iphone 12", "Super telefon", "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-12-family-select-2020?wid=882&amp;hei=1058&amp;fmt=jpeg&amp;qlt=80&amp;op_usm=0.5,0.5&amp;.v=1601844983000"));
        offerRepository.save(new Offer(null, "Xioami mi a2 lite", "Super Xiaomi", "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-12-family-select-2020?wid=882&amp;hei=1058&amp;fmt=jpeg&amp;qlt=80&amp;op_usm=0.5,0.5&amp;.v=1601844983000"));
    }
}
