import java.sql.*;

/**
 * Created by Şeyma Yılmaz on 22.2.2017.
 */
public class Islemler {

    public static  void MusteriEkle(Musteri musteri){

        try {
            Connection connection= DriverManager.getConnection(
                    Config.URL,Config.USER,Config.PASSWORD
            );

            String sql="INSERT INTO ticaret.musteriler(ad, soyad, email, yas) "
                    + "VALUES (?,?,?,?)";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,musteri.getAd());
            statement.setString(2,musteri.getSoyad());
            statement.setString(3,musteri.getEmail());
            statement.setInt(4,musteri.getYas());

            statement.executeUpdate();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("mysql bağlantısı yapılamadı");
        }
    }

    public static void musteriSil(int musteriId) {
        try {
            Connection connection=DriverManager.getConnection(
                    Config.URL,Config.USER,Config.PASSWORD
            );
            String sql="DELETE FROM ticaret.musteriler WHERE musteri_id=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,musteriId);

            int affectedRow = statement.executeUpdate();
            if(affectedRow != 0){
                /* islem basarili */
            }
            else{
                /* islem basarisiz */
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("mysql bağlantısı başarısız!");
        }
    }

    public static void musteriListele(){
        try {
            Connection connection=DriverManager.getConnection(
                    Config.URL,Config.USER,Config.PASSWORD
            );
            Statement statement=connection.createStatement();
            String sql="SELECT *FROM ticaret.musteriler";
            ResultSet resultSet=statement.executeQuery(sql);

            System.out.println("---Güncel Müşteri Listesi---");
            while(resultSet.next()){
                int musteriId=resultSet.getInt("musteri_id");
                String ad=resultSet.getString("ad");
                String soyad=resultSet.getString("soyad");
                String email=resultSet.getString("email");
                int yas=resultSet.getInt("yas");
                System.out.println("ID:" + musteriId + "ad:" + ad +
                        "soyad:" + soyad +"email:" +email + "yas:" + yas);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql bağlantısı sağlanamadı");
        }
    }
    public static void urunEkle(Urun urun){

        try {
            Connection connection=DriverManager.getConnection(
                    Config.URL, Config.USER, Config.PASSWORD
            );

            String sql="INSERT INTO ticaret.urunler(urunismi, fiyat, stokadedi) " +
                    "VALUES (?, ?, ?)";

            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,urun.getUrunIsmi());
            statement.setDouble(2,urun.getFiyat());
            statement.setInt(3,urun.getStokAdedi());

            statement.executeUpdate();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql bağlantısı yapılamadı");
        }
    }

    public static void urunSil(int urunId){

        try {
            Connection connection = DriverManager.getConnection(
                    Config.URL,
                    Config.USER,
                    Config.PASSWORD
            );

            String sql = "DELETE FROM ticaret.urunler WHERE urun_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, urunId);

            statement.executeUpdate();

            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql baglanti hatasi!");
        }
    }

    public static void UrunleriListele(){

        try {
            Connection connection=DriverManager.getConnection(
                    Config.URL,Config.USER,Config.PASSWORD
            );

            String sql="SELECT * FROM ticaret.urunler";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("----Güncel Ürün Listesi----");
            while (resultSet.next()){
                int urunId=resultSet.getInt("urun_id");
                String urunIsmi=resultSet.getString("urunIsmi");
                double fiyat=resultSet.getDouble("fiyat");
                int stokAdedi=resultSet.getInt("stokadedi");
                System.out.println("Id: " + urunId  +",ad: " +urunIsmi + ",fiyat: " +
                        fiyat + "stokadedi: " + stokAdedi);

            }
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql bağlantı hatası!");
        }


    }

}


