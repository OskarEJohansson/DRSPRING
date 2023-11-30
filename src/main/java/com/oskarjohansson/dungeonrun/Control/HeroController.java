package com.oskarjohansson.dungeonrun.Control;

import com.oskarjohansson.dungeonrun.Model.Character.Hero;
import com.oskarjohansson.dungeonrun.Repository.HeroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dungeonrun")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @Autowired
    HeroRepository heroRepository;

    @GetMapping("/hero")
    public List<Hero> getAllHeros() {
        return heroRepository.findAll();
    }

    @GetMapping("/hero/{id}")
    public ResponseEntity<Hero> getHeroById(@PathVariable(value = "id") Long heroid) throws ResourceNotFoundException {
        Hero hero = heroRepository.findById(heroid).orElseThrow(() -> new ResourceNotFoundException("Hero not found for this id :: " + heroid));
        return ResponseEntity.ok().body(hero);
    }

    @PostMapping("/hero")
    public Hero createHero(@Valid @RequestBody Hero hero) {
        return heroRepository.save(hero);
    }

    // PUTMAPPING


    @DeleteMapping("/hero/{id}")
    public Map<String, Boolean> deleteHero(@PathVariable(value = "id") Long heroid)
            throws ResourceNotFoundException {
        Hero hero = heroRepository.findById((heroid)).orElseThrow(() -> new ResourceNotFoundException("Hero not found for this id :: " + heroid));

        heroRepository.delete(hero);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
