/**
 * Created by Şeyma Yılmaz on 22.2.2017.
 */
public class Musteri {

    private String ad;
    private String soyad;
    private String email;
    private int yas;

    public Musteri() {
    }

    public Musteri(String ad, String soyad, String email, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}


