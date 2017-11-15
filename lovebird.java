package com.burungkita;

public class lovebird extends burungku {
    public lovebird(String namaburung, String sizeburung, String warnaburung, String jenisburung) {
        super(namaburung, sizeburung, warnaburung, jenisburung);
        System.out.println("burung yang baru telah dibuat atas nama " + getNamaburung());
    }
}
