package com.oskarjohansson.dungeonrun.Model.Character;

import com.oskarjohansson.dungeonrun.Model.Items.Potions.HealthPotion;
import com.oskarjohansson.dungeonrun.Model.Items.Weapon.WeaponParentModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hero")
@Inheritance(strategy = InheritanceType.JOINED)
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private WeaponParentModel weapon;
    private String heroClass;
    private int strength;
    private int intelligence;
    private int agility;
    private int healthPoints;
    private int healthPointsBase;
    private int turningPoints;
    private int turningPointsBase;
    private int experiencePoints;
    private int gold;
    private int goldBase;
    private int level;
    private int killList;
    private int deathCount;
    private boolean codeBreaker;
    @OneToOne(cascade = CascadeType.ALL)
    private List<HealthPotion> potionStash;


    public Hero(){
        this.healthPoints = 5;
        this.healthPointsBase = 5;
        this.turningPoints = 1;
        this.turningPointsBase = 1;
        this.experiencePoints = 0;
        this.gold = 100;
        this.goldBase = 0;
        this.level = 1;
        this.killList = 0;
        this.deathCount = 0;
        this.codeBreaker = false;
        this.potionStash = new ArrayList<>();

    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    public WeaponParentModel getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponParentModel weapon) {
        this.weapon = weapon;
    }

    @Column(name = "heroClass")
    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    @Column(name = "strength")
    public int getStrength() {
        return strength;
    }


    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void addStrength(int strength){
        this.strength += strength;
    }

    @Column(name = "intelligence")
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void addIntelligence(int intelligence){
        this.intelligence += intelligence;
    }

    @Column(name = "agility")
    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void addAgility(int agility){
        this.agility += agility;
    }

    @Column(name = "healthpoints")
    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void addHealthPoints(int healthPoints) {
        this.healthPoints += healthPoints;
    }

    @Column(name = "healthPointsBase")
    public int getHealthPointsBase() {
        return healthPointsBase;
    }

    public void setHealthPointsBase(int healthPointsBase) {
        this.healthPointsBase = healthPointsBase;
    }

    public void addHealthPointsBase(int healthPointsBase){
        this.healthPointsBase += healthPointsBase;
    }

    public void resetHealthPoints(){
        this.healthPoints = this.healthPointsBase;
    }

    @Column(name = "turningPoints")
    public int getTurningPoints() {
        return turningPoints;
    }
    public void setTurningPoints(int turningPoints) {
        this.turningPoints = turningPoints;
    }

    public void addTurningPoints(int turningPoints){
        this.turningPoints += turningPoints;
    }

    @Column(name = "turningPointsBase")
    public int getTurningPointsBase() {
        return turningPointsBase;
    }

    public void setTurningPointsBase(int turningPointsBase) {
        this.turningPointsBase = turningPointsBase;
    }

    public void addTurningPointsBase(int turningPointsBase){
        this.turningPointsBase += turningPointsBase;
    }

    public void resetTurningPoints(){
        this.turningPoints = turningPointsBase;
    }

    @Column(name = "experiencePoints")
    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void addExperiencePoints(int experiencePoints){
        this.experiencePoints += experiencePoints;
    }

    @Column(name = "gold")
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void addGold(int gold){
        this.gold += gold;
    }

    public void resetGold() {
        this.gold = this.goldBase;
    }

    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level =  level;
    }

    public void addLevel(int level){
        this.level += level;
    }

    @Column(name = "killList")
    public int getKillList() {
        return killList;
    }

    public void setKillList(int killList) {
        this.killList = killList;
    }

    public void addKillList(int killList){
        this.killList += killList;
    }

    @Column(name = "deathCount")
    public int getDeathCount() {
        return deathCount;
    }

    public void setDeathCount(int deathCount) {
        this.deathCount =  deathCount;
    }

    public void addDeathCount(int deathCount){
        this.deathCount += deathCount;
    }

    @Column(name = "codebreaker")
    public boolean isCodeBreaker() {
        return codeBreaker;
    }

    public void setCodeBreaker(boolean codeBreaker) {
        this.codeBreaker = codeBreaker;
    }

    @Column(name = "potionStash")
    public List<HealthPotion> getPotionStash() {
        return potionStash;
    }

    public void addPotionStash(HealthPotion potion) {
        this.potionStash.add(potion);
    }

    public int getGoldBase() {
        return goldBase;
    }

    public void setGoldBase(int goldBase) {
        this.goldBase = goldBase;
    }

    public void setPotionStash(List<HealthPotion> potionStash) {
        this.potionStash = potionStash;
    }


}

