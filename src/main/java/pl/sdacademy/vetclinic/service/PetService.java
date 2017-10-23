package pl.sdacademy.vetclinic.service;

public class PetService {

    private String wlascicielKota;
    private String coRobiCalaSala;

    public PetService(String coRobiCalaSala) {
        this.coRobiCalaSala = coRobiCalaSala;
    }

    public void setKtoMaKota(String ktoMaKotaValue){
        this.wlascicielKota = ktoMaKotaValue;
    }

    @Override
    public String toString() {
        return "PetService{" +
                "wlascicielKota='" + wlascicielKota + '\'' +
                ", coRobiCalaSala='" + coRobiCalaSala + '\'' +
                '}';
    }
}
