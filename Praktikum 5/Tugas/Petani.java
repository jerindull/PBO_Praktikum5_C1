/*  Nama File   : Petani.java
    Deskripsi   : Subkelas Petani
    Nama        : Jerico Ash Shiddiqy Purnomo
    NIM         : 24060123140126
    Tanggal     : 21 - Maret - 2025 
*/
import java.time.LocalDate;

public class Petani extends Manusia {
    private static int counterPetani = 0;
    private String asal_kota; 

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota; 
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0;  
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); 
        System.out.println("Asal Kota: " + asal_kota); 
        System.out.println("Pajak: " + hitungPajak());
    }
}
