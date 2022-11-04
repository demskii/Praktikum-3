public class Manager extends Pegawai {
    double Tunjangan;

    public void setTunjangan(double Tunjangan) {
        this.Tunjangan = Tunjangan;

    }

    public double getTunjangan() {
        return this.Tunjangan;

    }

    public void cetakinfo() {
        super.cetakinfo();

    }

    public void cetakTunjangan() {
        Tunjangan = 3000000;
        System.out.println("Tunjang :" + this.Tunjangan);

    }

}
