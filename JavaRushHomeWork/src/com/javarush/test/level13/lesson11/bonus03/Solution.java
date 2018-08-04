package com.javarush.test.level13.lesson11.bonus03;

/* Битва роботов
 Изменить код согласно новой архитектуре и добавить новую логику:
1 Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
2 Отредактировать класс Robot учитывая AbstractRobot.
3 Расширить класс BodyPart новой частью тела "грудь".
4 Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).

5 http://info.javarush.ru/uploads/images/00/00/07/2014/08/12/3b9c65580b.png
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}
