public class DragonMain {
    public static void main(String[] args) {

        // Membuat 2 objek Dragon
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("=== STATUS AWAL ===");
        dragon1.printStatus();
        dragon2.printStatus();

        // Dragon 1 bergerak ke atas 5 langkah
        dragon1.changeDirection(1);
        dragon1.move(5);

        // Dragon 2 bergerak ke kanan 3 langkah
        dragon2.changeDirection(2);
        dragon2.move(3);

        System.out.println("=== SETELAH BERGERAK ===");
        dragon1.printStatus();
        dragon2.printStatus();

        // Dragon 1 berubah arah ke kanan dan bergerak 4 langkah
        dragon1.changeDirection(2);
        dragon1.move(4);

        // Dragon 2 berubah arah ke bawah dan bergerak 2 langkah
        dragon2.changeDirection(3);
        dragon2.move(2);

        System.out.println("=== SETELAH BERGERAK LAGI ===");
        dragon1.printStatus();
        dragon2.printStatus();
    }
}