package exceptionhand;

public class Pelanggan implements Supermart {
    public String Nama;
    public String Alamat;

    public Pelanggan(){

    }

    public Pelanggan(String name, String alamat){
        this.Nama = name; this.Alamat = alamat;
        System.out.println("====================================");
        System.out.println("DATA PELANGGAN");
        System.out.println("------------------------------------");
        System.out.println("Nama Pelanggan\t: " + Nama);
        System.out.println("Alamat\t\t: " + alamat);
    }

    public void CetakBill(){

    }
}
