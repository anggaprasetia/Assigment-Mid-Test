package com.burungkita;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int pilihanMenu;
        String namaburung, sizeburung, warnaburung, jenisburung;
        Scanner inputUser = new Scanner(System.in);
        String arahGerak;
        int kecepatanGerak;

        System.out.println("Tugas UTS Pak Bilal");
        System.out.println("Program membuat object burung");
        System.out.println("Masukkan nama burung :");
        namaburung = inputUser.next();
        System.out.println("Masukkan Ukuran burung : (Small, Medium, Big, Monster)");
        sizeburung = inputUser.next();
        System.out.println("Masukkan Warna burung : ");
        warnaburung = inputUser.next();
        System.out.println("Masukkan Jenis burung : ");
        jenisburung = inputUser.next();
        lovebird burungkuBaru = new lovebird(namaburung, sizeburung, warnaburung, jenisburung);

        System.out.println("Pilih salah satu :\n" +
                "1. Bergerak\n" +
                "2. Berhenti\n" +
                "3. Keluar Aplikasi\n" +
                "Masukkan pilihan anda :");
        pilihanMenu = inputUser.nextInt();
        do {
            if (pilihanMenu == 1) {
                System.out.println("Masukkan arah gerak : ");
                burungkuBaru.setArahGerak(arahGerak = inputUser.next());
                System.out.println("Dengan kecepatan : ");
                burungkuBaru.setKecepatanGerak(kecepatanGerak = inputUser.nextInt());
                do {
                    pilihanMenu = 0;
                    System.out.println(
                            "1. Ganti arah\n" +
                                    "2. Ubah kecepatan\n" +
                                    "3. Keadaan sekarang\n" +
                                    "4. Keluar\n" +
                                    "Masukkan pilihan anda.");
                    pilihanMenu = inputUser.nextInt();
                    if (pilihanMenu == 1) {
                        System.out.println("Masukkan Arah baru : ");
                        String arahBaru = inputUser.next();
                        burungkuBaru.gantiArah(arahBaru);
                    } else if (pilihanMenu == 2) {
                        System.out.println("Masukkan Kecepatan baru : ");
                        int kecepatanBaru = inputUser.nextInt();
                        burungkuBaru.gantiKecepatan(kecepatanBaru);
                    } else if (pilihanMenu == 3) {
                        burungkuBaru.keadaanSekarang();
                    }else if (pilihanMenu == 4) {
                        return;
                    }

                } while (pilihanMenu != 4);
            } else if (pilihanMenu == 2) {
                burungkuBaru.berhenti();
            }
        } while (pilihanMenu != 3);

    }
}
