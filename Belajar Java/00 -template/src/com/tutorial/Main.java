package com.tutorial;

import com.terminal.Console;
import static com.terminal.Console.log;;

public class Main {
    public static void main(String[] args) {
        // instansiasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "Teknik Elektro", 1810953025, 25);
        mahasiswa1.show();
        mahasiswa2.show();
        mahasiswa1.setNama("Fadel Putra ");
        mahasiswa1.show();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        Console.log("[Message] Hallo");
        log("[Message] Ini log\n");

        NilaiMahasiswa mahasiswa3 = new NilaiMahasiswa("Anton", "Teknik Informatika", 1810883006, 22);
        mahasiswa3.nama = "budi";
        mahasiswa3.nilaiPemograman1 = 75;
        mahasiswa3.nilaiPemograman2 = 80;
        mahasiswa3.mencariNilaiAkhir();
        mahasiswa3.show();
    }
}
