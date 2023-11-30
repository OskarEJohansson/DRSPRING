package com.oskarjohansson.dungeonrun.Control;

import com.oskarjohansson.dungeonrun.Model.Character.Hero;
import com.oskarjohansson.dungeonrun.Repository.HeroRepository;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Service
@Transactional
public class HeroService{

    private final HeroRepository heroRepository;

    public HeroRepository getHeroRepository() {
        return heroRepository;
    }

    @Autowired
    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }


    public Hero saveHero(Hero hero) {
        return heroRepository.save(hero);
    }

    public List<Hero> loadAllHero() {
        try {
            return heroRepository.findAll();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

//    public Hero updateHero(Hero hero){
//
//    }

    public void deleteHero(Long heroid){
        System.out.println(heroid);
        heroRepository.deleteById(heroid);
    }

    public Hero loadHero(Long heroId){
        return heroRepository.findById(heroId).orElse(null);
    }

}
