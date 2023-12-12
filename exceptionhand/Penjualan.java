package exceptionhand;

public class Penjualan extends Pelanggan {
    private String NamaBarang, kodebarang;
    private int HargaBarang, JumlahBarang, TotalBayar;

    
    public Penjualan(String nabar, String kobar, int harbar, int jumbar){
        this.NamaBarang = nabar; this.kodebarang = kobar;
        this.HargaBarang = harbar; this.JumlahBarang = jumbar;
        this.TotalBayar = JumlahBarang * HargaBarang;
        CetakBill();
    }

    @Override
    public void CetakBill(){
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("------------------------------------");
        System.out.println("Kode Barang\t: "+ kodebarang);
        System.out.println("Nama Barang\t: "+ NamaBarang);
        System.out.println("Harga Barang\t: "+ HargaBarang);
        System.out.println("Jumlah Beli\t: " + JumlahBarang);
        System.out.println("TOTAL BAYAR\t: "+ TotalBayar);
    }
}
