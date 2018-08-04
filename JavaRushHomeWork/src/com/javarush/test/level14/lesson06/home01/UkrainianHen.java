package com.javarush.test.level14.lesson06.home01;

/**
 * Created by ab.cherkashin on 25.01.2017.
 */
class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth()
    {
        return 1;
    }

    public String getDescription() {
        return "Я курица. Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
