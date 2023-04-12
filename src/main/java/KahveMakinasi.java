import java.util.Scanner;

public class  KahveMakinasi {
    Kahve hangiKahve = null;

    protected Kahve kahveSecimi(int input) {
        if (input == 1) {
            Kahve secilenKahve = new TurkKahvesi();
            hangiKahve = secilenKahve;
            // secim(secilenKahve);
        } else if (input == 2) {
            Kahve secilenKahve = new FiltreKahve();
            hangiKahve = secilenKahve;
            // secim(secilenKahve);
        } else if (input == 3) {
            Kahve secilenKahve = new Espresso();
            hangiKahve = secilenKahve;
            //secim(secilenKahve);
        } else {
            System.out.println("Lutfen verilen kahvelerden birini giriniz");
        }
        return hangiKahve;
    }

    public void sutSecimi(Kahve secilenKahve, String input) {
        if (input.equals("evet")) {
            secilenKahve.sutlu = true;
            System.out.println("Süt ekleniyor");

        } else if (input.equals("hayır")) {
            secilenKahve.sutlu = false;
            System.out.println("Süt eklenmiyor");
        } else {
            System.out.println("Lutfen makinayı tekrar calıstırıp evet veya hayır giriniz");
        }

    }
   public boolean sekerSecimi(Kahve secilenKahve, String input){
       boolean sekerli=false;
        if (input.equals("evet")) {
            secilenKahve.sekerli = true;
          sekerli=true;

        } else if (input.equals("hayır")) {
            secilenKahve.sekerli = false;
           sekerli= false;
        } else {
            System.out.println("Lutfen makinayı tekrar calıstırıp evet veya hayır giriniz");
        }
        return sekerli;
    }
    protected String sekerSayisiBelirleme(Kahve secilenKahve, boolean sekerli,int sekerSayisi){
        if (sekerli==true){
            secilenKahve.setSekerSayisi(sekerSayisi);

        }else{

           return "Şeker eklenmiyor...";
        }
        return sekerSayisi+" Şeker ekleniyor..." ;

    }
    protected String bardakBoyutuSecimi(Kahve secilenKahve,String bardakBoyutu){
        if (bardakBoyutu.equals("büyük boy")){
            secilenKahve.setBardakBoyutu(BardakBoyutu.BUYUK);
        } else if (bardakBoyutu.equals("orta boy")) {
            secilenKahve.setBardakBoyutu(BardakBoyutu.ORTA);

        } else if (bardakBoyutu.equals("küçük boy")) {
            secilenKahve.setBardakBoyutu(BardakBoyutu.KUCUK);

        }else {
            return "Lütfen sistemi tekrar başlatıp boyutu doğru giriniz.";
        }
        return "Kahveniz "+ secilenKahve.bardakBoyutu+" hazırlanıyor.";
    }
    public String siparisOzeti(Kahve kahve) {
        return "Seçilen Kahve: "+kahve.toString()+ '\n'+"Seker Sayısı: "+kahve.sekerSayisi+'\n'+"Bardak: "+kahve.bardakBoyutu.toString()+'\n'+"Siparişiniz hazırlanıyor. Afiyet olsun:)";

    }
}
