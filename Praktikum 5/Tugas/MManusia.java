/*  Nama File   : MManusia.java
    Deskripsi   : Program main untuk menguji sistem pajak dan masa kerja
    Nama        : Jerico Ash Shiddiqy Purnomo
    NIM         : 24060123140126
    Tanggal     : 21 - Maret - 2025 
*/
import java.time.LocalDate;
public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Nurdin", LocalDate.of(1970, 01, 25), "jl. Pahlawan No.19", 9500000, "197907202003121002");
        Pengusaha pe1 = new Pengusaha("Akhmad Syakir", LocalDate.of(1991, 02, 26), "jl. Gajah Mada N0.14", 76000000, "000-980-563-144-000-9");
        Petani pt1 = new Petani("Aris Munandar", LocalDate.of(1989, 04, 13), "jl. Nasional No.21", 4500000, "Mranggen");
        PNS p2 = new PNS("Budi Siregar", LocalDate.of(2016, 03, 19), "jl. Tlogolilin 123 Genuk", 8000000, "199208102024081991");

        p2.setAlamat("jl. Tlogolilin 123 Genuk");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
