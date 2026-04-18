package Cooktique;

import java.util.Date;

public class Member {
    private int memberId;
    private String username;
    private String email;
    private String password;
    private String fotoProfil;
    private Date tanggalDaftar;

    public void login() {
        System.out.println("Member login...");
    }

    public void logout(){
        System.out.println("Member logout...");
    }

    public void kelolaResep() {
        System.out.println("Kelola resep...");
    }

    public void kelolaPantry() {
        System.out.println("Kelola pantry...");
    }

    public void editProfil() {
        System.out.println("Edit profil...");
    }

    public void lihatProfil() {
        System.out.println("Lihat profil...");
    }
}
