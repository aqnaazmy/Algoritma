package OOP;

public class inventori2 {
    String namaBarang;
    String kodeBarang;
    int jumlah;
    int harga;
    int stokMula2;
    int stokAkhir;

    public inventori2(){

    }

    public inventori2(String nbrg, String kbrg, int jumjual, int hrg, int mula){
        this.namaBarang = nbrg;
        this.kodeBarang = kbrg;
        this.jumlah = jumjual;
        this.harga = hrg;
        this.stokMula2 = mula;
        this.stokAkhir = 0;

    }
    public void jualItem(){
        stokAkhir = stokMula2 - jumlah;
        System.out.println("stok akhir " + stokAkhir);
    }

}
