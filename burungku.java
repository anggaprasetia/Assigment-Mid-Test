package com.burungkita;

public class burungku extends Hewan{
    private String warnaburung;
    private String jenisburung;

    public burungku(String namaburung, String sizeburung, String warnaburung, String jenisburung) {
        super(namaburung, sizeburung);
        this.warnaburung = warnaburung;
        this.jenisburung = jenisburung;
    }

    public void gantiArah(String arahBaru){
        System.out.println("Semula bergerak kearah " + this.getArahGerak() + "\nSekarang bergerak kearah " + arahBaru);
        this.setArahGerak(arahBaru);
    }

    public void gantiKecepatan(int kecepatanBaru){
        System.out.println("Semula bergerak dengan kecepatan " + this.getKecepatanGerak() + "\nSekarang bergerak dengan kecepatan " + kecepatanBaru);
        this.setKecepatanGerak(kecepatanBaru);
    }

    public void berhenti(){
        this.setKecepatanGerak(0);
        this.setArahGerak("Diam");
        System.out.println("burungmu sekarang berada pada posisi " + this.getArahGerak() + "dengan kecepatan " + getKecepatanGerak());
    }

    public void keadaanSekarang(){
        System.out.println("burungmu sekarang berada pada posisi " + this.getArahGerak() + "dengan kecepatan " + getKecepatanGerak());

    }
}
