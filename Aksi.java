public class Aksi {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.Nama = "Kevin";
        manager.GajiPokok = 5000000;
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("============================");
        Programmer programmer = new Programmer();
        programmer.Nama = "Iqbal";
        programmer.GajiPokok = 4500000;
        programmer.cetakinfo();
        programmer.cetakbonus();

    }

}
