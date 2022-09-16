package com.tutorial;

public class NilaiMahasiswa extends Mahasiswa {
    String nama;
    int nilaiPemograman1;
    int nilaiPemograman2;
    private double nilaiAkhir;

    NilaiMahasiswa(
            String nama,
            String inputJurusan,
            int inputNim,
            int inputUmur) {
        super(nama, inputJurusan, inputNim, inputUmur);
    }

    void mencariNilaiAkhir() {
        this.nilaiAkhir = ((double) nilaiPemograman1 + (double) nilaiPemograman2) / 2;
    }

    // overiding dari method di mahasiswa
    @Override
    void show() {
        // super akan mengakses atribut superclass
        super.show();
        System.out.println("Nilai Pemrograman1\t:" + nilaiPemograman1);
        System.out.println("Nilai Pemrograman2\t:" + nilaiPemograman2);
        System.out.println("Nilai Akhir\t\t:" + nilaiAkhir);
        System.out.println("=================================");
    }

}
