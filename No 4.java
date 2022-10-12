import java.util.Set;

public class Soal4 {
    static String jenis_hp;
    static int tahun_pembuatan;

     public void setDataHP (String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    public String getJenis_hp() {
        return jenis_hp;
    }
    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }
    public static void main(String[] args) {
        Handphone hp = Handphone();
        hp.setDataHP(jenis_hp, tahun_pembuatan);
        hp.getJenis_hp();
        hp.getTahun_pembuatan();
    }
    private static Handphone Handphone() {
        return null;
    }

}
