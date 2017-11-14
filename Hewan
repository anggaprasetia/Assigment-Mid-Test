package com.burungkita;

public class Hewan {
    private String namaburung;
    private String sizeburung;

    private String arahGerak;
    private int kecepatanGerak;

    public Hewan(String namaburung, String sizeburung) {
        this.namaburung = namaburung;
        this.sizeburung = sizeburung;
        this.arahGerak = "";
        this.kecepatanGerak = 0;
    }

    public String getNamaburung() {
        return namaburung;
    }

    public void setNamaburung(String namaburung) {
        this.namaburung = namaburung;
    }

    public String getSizeburung() {
        return sizeburung;
    }

    public void setSizeburung(String sizeburung) {
        this.sizeburung = sizeburung;
    }

    public String getArahGerak() {
        return arahGerak;
    }

    public void setArahGerak(String arahGerak) {
        this.arahGerak = arahGerak;
    }

    public int getKecepatanGerak() {
        return kecepatanGerak;
    }

    public void setKecepatanGerak(int kecepatanGerak) {
        this.kecepatanGerak = kecepatanGerak;
    }

    public void ikanGerak(String arahGerak){
        System.out.println(this.getNamaburung() + " bergerak kearah " + arahGerak);
    }

    public void kecepatanGerak(int kecepatan){
        this.setKecepatanGerak(kecepatan);
        if(getKecepatanGerak() == 0 ){
            System.out.println(this.getNamaburung() + "Berhenti");
        }else{
            System.out.println(this.getNamaburung()+ "Bergerah dengan kecepatan " + this.getKecepatanGerak());
        }
    }
}
