package com.tutorial;

class Mahasiswa {
    String nama;
    String jurusan;
    int NIM;
    int umur;

    public Mahasiswa() {
        nama = "Syah Fadel Putra Dwingga";
        NIM = 1810953019;
        jurusan = "Teknik Elektro";
        umur = 22;
    }

    public Mahasiswa(
            String nama,
            String inputJurusan,
            int inputNim,
            int inputUmur) {
        this.nama = nama;
        NIM = inputNim;
        jurusan = inputJurusan;
        umur = inputUmur;
    }

    void show() {
        System.out.println("Nama\t:" + nama);
        System.out.println("NIM\t:" + NIM);
        System.out.println("Jurusan\t:" + jurusan);
        System.out.println("Umur\t:" + umur);
        System.out.println("=================================");
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    int getNIM() {
        return this.NIM;
    }
}
