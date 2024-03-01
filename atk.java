public class atk implements Comparable<atk>  {
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    int stokBarang;

    public atk (String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    @Override
    public int compareTo(atk o) {
        // TODO Auto-generated method stub
        return this.kodeBarang.compareTo(kodeBarang);
    }
    
}