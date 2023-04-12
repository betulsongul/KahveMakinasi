public class  Kahve  {
String kahveCesidi;

    public void setKahveCesidi(String kahveCesidi) {
        this.kahveCesidi = kahveCesidi;
    }

    boolean sutlu=false;
   boolean sekerli=false;
   int sekerSayisi=0;
   BardakBoyutu bardakBoyutu;



    public Kahve(boolean sutlu, boolean sekerli, int sekerSayisi, BardakBoyutu bardakBoyutu) {

        this.sutlu = sutlu;
        this.sekerli = sekerli;
        this.sekerSayisi = sekerSayisi;
        this.bardakBoyutu = bardakBoyutu;
    }

    public Kahve() {

    }

    public void setSekerSayisi(int sekerSayisi) {
        this.sekerSayisi = sekerSayisi;
    }
    public void setBardakBoyutu(BardakBoyutu bardakBoyutu) {
        this.bardakBoyutu = bardakBoyutu;
    }

    public int getSekerSayisi() {
        return sekerSayisi;
    }

    public void setSutlu(boolean sutlu) {
        this.sutlu = sutlu;
    }

    public void setSekerli(boolean sekerli) {
        this.sekerli = sekerli;
    }





}
