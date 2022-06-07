import java.util.Scanner;
public class atmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0 ) {
            System.out.print("Kullanıcı Adınız : ");
            userName = inp.nextLine();
            System.out.print("Parolanız : ");
            password = inp.nextLine();
            if ( userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme Giriş Yapıldı.");
                System.out.println("Merhaba, Kodluyoruz Bank'a Hoşgeldiniz:");
                do {

                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.print("Yapmak istediğiniz İşlemi Seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                        System.out.print("Para Miktarı : ");
                        int price = inp.nextInt();
                        balance += price;
                        break;
                        case 2:
                        System.out.print("Para Miktarı : ");
                        price = inp.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye Yetersiz.");
                        }else {
                            balance -= price; }
                        break;
                        case 3 :
                        System.out.println("Bakiyeniz : " + balance );
                        break;
                        case 4:
                        System.out.print("Çıkış Yapıldı");
                    }
                } while (select != 4);
                break;
            }else{
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı. Yeniden Deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur. Banka ile İletişime Geçiniz.");
                }else{
                    System.out.println("Kalan Şifre Giriş Hakkı : " + right);
                }

            }
        }

    }
}



