public class hitungKredit {

    private double gajiPokok;
    private double hargaBarang;
    private double uangMuka;
    private int lamaKredit;
    private double bungaPerTahun;
    private int tanggungan;
    private double pokokCicilan;
    private double bungaPerBulan;
    private double cicilanPerBulan;

    public hitungKredit(double gajiPokok, double hargaBarang, double uangMuka, double bungaPerTahun, int tanggungan, int lamaKredit) {
        this.gajiPokok = gajiPokok;
        this.hargaBarang = hargaBarang;
        this.uangMuka = uangMuka;
        this.bungaPerTahun = bungaPerTahun / 100;
        this.tanggungan = tanggungan;
        this.lamaKredit = lamaKredit;
    }

    private double hitungPokokCicilan() {
        return hargaBarang - uangMuka;
    }

    private double hitungBungaPerBulan() {
        double lKredit = lamaKredit;
        double penampungNilaiLKreditBagi12 = lKredit / 12.0;
        return penampungNilaiLKreditBagi12 * hitungPokokCicilan() * bungaPerTahun;
    }

    private double hitungCicilanPerBulan() {
        double lKredit = lamaKredit;
        return hitungBungaPerBulan() + (hitungPokokCicilan() / lKredit);
    }

    private double hitungGajiDiBagiTanggungan() {
        return gajiPokok / (tanggungan + 1);
    }

    public boolean cekAjukanKredit() {
        boolean jawaban;
        System.out.println("Gaji Pokok :" + String.format("%,.2f", gajiPokok));
        System.out.println("Harga Barang :" + String.format("%,.2f", hargaBarang));
        System.out.println("uang muka :" + String.format("%,.2f", uangMuka));
        System.out.println("Tangguangan :" + tanggungan);
        System.out.println("lama kredit :" + lamaKredit);
        double lKredit = lamaKredit;
        double penampungNilaiLKreditBagi12 = lKredit / 12.0;
        System.out.println("Lama Kredit di bagi 1 tahun : " + String.format("%,.2f", penampungNilaiLKreditBagi12));
        System.out.println("Bunga per Tahun : " + String.format("%,.2f", bungaPerTahun));
        System.out.println("Pokok Cicilan :" + String.format("%,.2f", (hargaBarang - uangMuka)));
        System.out.println("Bunga per Bulan :" + String.format("%,.2f", ((lKredit / 12.0) * hitungPokokCicilan() * bungaPerTahun)));
        System.out.println("Cicilan per Bulan :" + String.format("%,.2f", (hitungBungaPerBulan() + (hitungPokokCicilan() / lKredit))));
        System.out.println("Gaji di Bagi Tanggungan :" + String.format("%,.2f", (gajiPokok / (tanggungan + 1))));
        System.out.println(String.format("%,.2f", hitungGajiDiBagiTanggungan()) + " dibandingkan dengan " + String.format("%,.2f", hitungCicilanPerBulan()));
        if (Math.abs(hitungGajiDiBagiTanggungan()) > Math.abs(hitungCicilanPerBulan())) {
            jawaban = true;
        } else {
            jawaban = false;
        }
        return jawaban;
    }

    public double getPokokCicilan() {
        return hitungPokokCicilan();
    }

    public double getBungaPerBulan() {
        return hitungBungaPerBulan();
    }

    public double getCicilanPerBulan() {
        return hitungCicilanPerBulan();
    }

}
