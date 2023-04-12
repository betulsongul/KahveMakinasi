public enum BardakBoyutu {
    BUYUK("Büyük Boy"),
    ORTA("Orta Boy"),
    KUCUK("Küçük Boy");
private String bardakBoyutu;
    BardakBoyutu(String boyut) {
        bardakBoyutu=boyut;
    }

    @Override
    public String toString() {
        return this.bardakBoyutu;
    }

    public String getBardakBoyutu() {
        return bardakBoyutu;
    }
}
