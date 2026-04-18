package Cooktique;

import java.util.Date;

public class Resep {
    private int resepId;
    private String judul;
    private String deskripsi;
    private Date tanggalPost;
    private String foto;
    private String tipe; // Regular / Signature
    private String namaResto;
    private String lokasi;
    private String detailKustom;
    private String bahan;
    private String langkah;
    private int waktuMasak;
    private String tingkatKesulitan;
    private int porsi;

    public void buatResep() {
        System.out.println("Resep dibuat...");
    }

    public void ubahResep() {
        System.out.println("Resep diubah...");
    }

    public void hapusResep() {
        System.out.println("Resep dihapus...");
    }

    public void bagikanResep() {
        System.out.println("Resep dibagikan...");
    }

    public void lihatDetailResep() {
        System.out.println("Detail resep...");
    }
}