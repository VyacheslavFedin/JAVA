// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
// Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
// На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п. У лучника добавить поле расстояние поражения. 
// Создать различные виды вооружения, например, меч, лук, лопата. Обеспечить, чтобы определенный тип воина мог нести только определенной оружие
// Создать класс командира

public class Main {
    public static void main(String[] args) {
        Team<Swordman> team1 = new Team<>();
        team1.addWarrior(new Swordman("Vasya", 250, new Sword(25), new RoundShield(50)))
                .addWarrior(new Swordman("John", 200, new Sword(50), new RoundShield(50)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team<Archer> team2 = new Team<>();
        team2.addWarrior(new Archer("Kolya", 150, new Bow(100, 50), new TowerShield(100)))
                .addWarrior(new Archer("Paul", 200, new Bow(75, 70), new TowerShield(100)));

        for (Archer person : team2) {
            System.out.println(person);
        }

        System.out.println("-----------");
        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());

        System.out.println("-----------");
        System.out.println(team1.maxTeamSafe());
        System.out.println(team2.maxTeamSafe());
    }

}
