package it.unive.dais.po1.dandd.protection;


/**
 * This class is aimed at representing an armor in D&D
 *
 * @since 1.0
 * @author Pietro Ferrara pietro.ferrara@unive.it
 */
public class Armor implements Protection{

    private int defense;

    public Armor(int i) {
        if(i>=0)
            this.defense = i;
        else this.defense = 0;
    }

    public int getDefense() {
        return this.defense;
    }

    @Override
    public int getInfoDefence() {
        return this.defense;
    }


}
