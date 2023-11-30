package com.oskarjohansson.dungeonrun.Repository;

import com.oskarjohansson.dungeonrun.Model.Character.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
