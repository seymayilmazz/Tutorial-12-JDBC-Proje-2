import java.util.Scanner;

/**
 * Created by Şeyma Yılmaz on 22.2.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("durum başarılı");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("durum aşarısız");
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("----MENÜ----");
        System.out.println("1-Müşteri Ekle");
        System.out.println("2-Müşteri Sil");
        System.out.println("3-Müşteri Listele");
        System.out.println("4-Ürün Ekle");
        System.out.println("5-Ürün sil");
        System.out.println("6-Ürün Listele");
        System.out.print("Lütfen seçinizi giriniz: ");
        int secim = scanner.nextInt();

        if (secim == MenuIslemleri.MUSTERI_EKLE) {
            Musteri musteriKaydi = new Musteri();
            System.out.print("Müşteri adını giriniz:");
            String ad = scanner.next();
            musteriKaydi.setAd(ad);
            System.out.print("Müşteri soyadını giriniz:");
            String soyad = scanner.next();
            musteriKaydi.setSoyad(soyad);
            System.out.print("E-maili giriniz:");
            String email = scanner.next();
            musteriKaydi.setEmail(email);
            System.out.print("Yaşınıız giriniz:");
            int yas = scanner.nextInt();
            musteriKaydi.setYas(yas);
            System.out.println("Müşteri Ekleme Başarılı!");
            Islemler.MusteriEkle(musteriKaydi);
        } else if (secim == MenuIslemleri.MUSTERI_SIL) {
            Islemler.musteriListele();
            System.out.print("Silinecek musterinin id'si giriniz : ");
            int id = scanner.nextInt();
            Islemler.musteriSil(id);
        } else if (secim == MenuIslemleri.MUSTERI_LISTELE) {
            Islemler.musteriListele();
        } else if (secim == MenuIslemleri.URUN_EKLE) {
            Urun urunKaydi = new Urun();
            System.out.print("Ürün adını giriniz:   ");
            String urunAd = scanner.next();
            urunKaydi.setUrunIsmi(urunAd);
            System.out.print("ürün fiyatını giriniz:  ");
            int urunFiyat = scanner.nextInt();
            urunKaydi.setFiyat(urunFiyat);
            System.out.print("ürünün stok adedini giriniz: ");
            int urunStok = scanner.nextInt();
            urunKaydi.setStokAdedi(urunStok);
            Islemler.urunEkle(urunKaydi);
        } else if (secim == MenuIslemleri.URUN_SIL) {
            System.out.print("Silinecek urunun id'si giriniz : ");
            int id = scanner.nextInt();
            Islemler.urunSil(id);
        }
          else if(secim==MenuIslemleri.URUN_LISTELE) {
            Islemler.UrunleriListele();
        }
    }

}
