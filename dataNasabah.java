public class dataNasabah {

    private String NIK;
    private String Nama;
    private String Alamat;
    private String Status;
    private String TTL;
    private String noHP;
    private String noTelep;
    private String namaAyah;
    private String StatusPendidikan;
    private int jumlahTanggungan;
    private hitungKredit kredit;

    public dataNasabah(String NIK, String Nama, String Alamat, String Status, String TTL, String noHP, String noTelep, String namaAyah, String StatusPendidikan, int jumlahTanggungan, hitungKredit kredit) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Status = Status;
        this.TTL = TTL;
        this.noHP = noHP;
        this.noTelep = noTelep;
        this.namaAyah = namaAyah;
        this.StatusPendidikan = StatusPendidikan;
        this.jumlahTanggungan = jumlahTanggungan;
        this.kredit = kredit;
    }

    public hitungKredit getKredit() {
        return kredit;
    }

    
    
}
