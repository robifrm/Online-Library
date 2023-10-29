import java.util.ArrayList;

import javafx.beans.property.adapter.JavaBeanBooleanProperty;

 public class PerpusOnline {
    String judul, author, penerbit;
    int tahun, kategori;

    PerpusOnline (String judul, String author, String penerbit, int tahun, int kategori) {
        this.judul = judul;
        this.author = author;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;

    }

    public static void main(String[] args) {

        ArrayList<PerpusOnline> daftarBuku = new ArrayList<PerpusOnline>();
        daftarBuku.add(new PerpusOnline("PBO dengan Java", "Indrajani", "Elexmedia", 2007, 1));
        daftarBuku.add(new PerpusOnline("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004, 1));
        daftarBuku.add(new PerpusOnline("Komputer & Pemrograman", "Abdul Kadir", "Andi Offset", 2003, 3));

        System.out.println("========================================================================================");
        System.out.println( " Daftar Buku Yang Tersedia");
        System.out.println("========================================================================================");
        System.out.println(" No\tJudul\tPengarang\tPenerbit\t\tTahun\t\tKategori");
        System.out.println("========================================================================================");

        int bukuTeknik = 0;
        int bukuManajemen = 0;
        int bukuFiksi = 0;
        int bukuLainnya = 0;
        int bukuLawas = 0;
        int bukuBaru = 0;

        for (int i = 0; i < daftarBuku.size(); i++) {
            PerpusOnline buku = daftarBuku.get(i);
            System.out.println(i + 1 + "\t" + buku.judul + "\t\t" + buku.author + "\t" + buku.penerbit + "\t" + buku.tahun + "\t" + kategoriToString(buku.kategori));
            if (buku.kategori == 1) {
                bukuTeknik++;
            } else if (buku.kategori == 2) {
                bukuManajemen++;
            } else if (buku.kategori == 3) {
                bukuFiksi++;
            } else {
                bukuLainnya++;
            }

            if (buku.tahun < 2004) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }
        }

        System.out.println("Jumlah buku yang tersedia: " + daftarBuku.size());
        System.out.println("Buku Teknik: " + bukuTeknik);
        System.out.println("Buku Manajemen: " + bukuManajemen);
        System.out.println("Buku Fiksi: " + bukuFiksi);
        System.out.println("Buku Lainnya: " + bukuLainnya);
        System.out.println("Buku Lawas: " + bukuLawas);
        System.out.println("Buku Baru: " + bukuBaru);
    }

    public static String kategoriToString(int kategori) {
        switch (kategori) {
            case 1:
                return "Teknik";
            case 2:
                return "Manajemen";
            case 3:
                return "Fiksi";
            default:
                return "Lainnya";
        }
    }

 }