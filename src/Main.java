public class Main {
    public static void main(String[] args){

        System.out.println("Prova creazione pesce");
        Pesce p = new Pesce("Squalo balena", "Onnivoro", "Gilberto");
        System.out.println(p.toString());

        System.out.println("\nProva creazione acquario");
        Acquario a = new Acquario("Gardacquario", "Riva del Garda", 7);
        a.addPesce(p);
        System.out.println(a.toString());
        Pesce p1 = new Pesce("Pesce palla", "Erbivoro", "Baloo");
        a.addPesce(p1);
        System.out.println(a.toString());
        a.addPesce(p);
        System.out.println(a.toString());
        System.out.println("Rimozione pesce");
        a.removePesce(2);
        System.out.println(a.toString());
    }

}
