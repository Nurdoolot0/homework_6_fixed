public class Main {
    public static void main(String[] args) {

        Weapon sword = new Weapon(WeaponType.BOW, "Bow");
        Weapon bow = new Weapon(WeaponType.BOW, "Bow");
        Weapon gun = new Weapon(WeaponType.GUN, "AK_47");
        Boss boss = new Boss("BOSS",500,gun);
        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 100, bow, 30);
        Skeleton skeleton2 = new Skeleton("Skeleton Archer", 80, bow, 50);

        System.out.println(" BOSS INFO: ");
        boss.printInfo();

        System.out.println("\nSkeleton 1 Info:");
        skeleton1.printInfo();

        System.out.println("\nSkeleton 2 Info:");
        skeleton2.printInfo();
    }
    }