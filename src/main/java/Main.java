import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KahveMakinasi kahveMakinasi=new KahveMakinasi();
        System.out.println("Hangi Kahveyi İstersiniz?" + '\n' + "1.Türk kahvesi" + '\n' + "2.Filtre Kahve" + '\n' + "3.Espresso");
        Scanner input = new Scanner(System.in);
        int hangiKahve = input.nextInt();
       Kahve secilenKahve= kahveMakinasi.kahveSecimi(hangiKahve);
        System.out.println(secilenKahve.toString()+" Hazırlanıyor.");

        System.out.println("Süt eklenmesini ister misiniz? (Evet veya Hayır olarak cevaplayınız):    ");
        Scanner input2=new Scanner(System.in);
        String sutlu=input2.nextLine().toLowerCase();
        kahveMakinasi.sutSecimi(secilenKahve,sutlu);
        
        System.out.println("Şeker eklenmesini ister misiniz? (Evet veya Hayır olarak cevaplayınız)");
        Scanner input3 = new Scanner(System.in);
        String sekerli = input3.nextLine().toLowerCase();
       boolean sekerEkleme= kahveMakinasi.sekerSecimi(secilenKahve,sekerli);

        //şeker sayısı kullanıcıdan alınıcak
        if (sekerEkleme==true) {
            System.out.println("Şeker sayısını giriniz: ");
            Scanner input4 = new Scanner(System.in);
            int sekerSayisi = input4.nextInt();
            System.out.println(kahveMakinasi.sekerSayisiBelirleme(secilenKahve, sekerEkleme, sekerSayisi));
        }
        System.out.println("Bardak Boyutu Giriniz(Büyük Boy/Orta Boy/Küçük Boy) : ");
        Scanner input5 = new Scanner(System.in);
        String bardakBoyutu = input5.nextLine().toLowerCase();
        System.out.println(kahveMakinasi.bardakBoyutuSecimi(secilenKahve,bardakBoyutu));

        System.out.println( '\n'+"Sipariş Özeti:"+'\n'+kahveMakinasi.siparisOzeti(secilenKahve));
    }


}
