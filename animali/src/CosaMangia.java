public class CosaMangia {
    public static void main(String[] args) {
        Cane cane = new Cane("Cane", "Onnivoro", "Abbaio", "Pippo");
        Gatto gatto = new Gatto("Gatto", "Carnivoro", "Miagolio", "Silvestro");

        Animale[] listaAnimali = new Animale[2];
        listaAnimali[0] = cane;
        listaAnimali[1] = gatto;
        for (Animale animale : listaAnimali) {
            System.out.println(animale + " mangia " + animale.cosaMangia());
        }
    }
}
