public class Programmer extends Pegawai {
    double Bonus;

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;

    }

    public double getBonus() {
        return this.Bonus;

    }

    public void cetakinfo() {
        super.cetakinfo();

    }

    public void cetakbonus() {
        Bonus = 2500000;
        System.out.println("Bonus :" + this.Bonus);

    }
}
