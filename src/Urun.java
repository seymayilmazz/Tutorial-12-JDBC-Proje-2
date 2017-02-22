/**
 * Created by Şeyma Yılmaz on 22.2.2017.
 */
public class Urun {
    private  int urunId;
    private  String urunIsmi;
    private  double fiyat;
    private  int stokAdedi;


    public Urun() {
    }

    public Urun(String urunIsmi, double fiyat, int stokAdedi) {
        this.urunIsmi = urunIsmi;
        this.fiyat = fiyat;
        this.stokAdedi = stokAdedi;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }
}
