package university.oop.ex1_5;

public class Gun {
    public int quantityCartridges = 5;

    public Gun (int quantityCartridges) {
        this.quantityCartridges = quantityCartridges;
    }

    public Gun() {
    }

    public void shot () {
        if (this.quantityCartridges > 0) {
            System.out.println("Бах!");
            this.quantityCartridges--;
        } else System.out.println("Клац(");
    }
}
