public class Acquario {

    private String nome;
    private String location;
    private Pesce[] pesci;

    public Acquario(String nome, String location, int dimAcquario){
        if(nome.equals("")){
            this.nome="Specie non identificato";
        }else{
            this.nome =nome;
        }
        if(location.equals("")){
            this.location="Location non identificata";
        }else{
            this.location=location;
        }
        if(dimAcquario<=0){
            this.pesci = new Pesce[10];
        }else{
            this.pesci = new Pesce[dimAcquario];
        }
    }

    public Acquario(String nome, String location, Pesce[] p){
        if(nome.equals("")){
            this.nome="Specie non identificato";
        }else{
            this.nome =nome;
        }
        if(location.equals("")){
            this.location="Location non identificata";
        }else{
            this.location=location;
        }
        for(int i=0; i<this.pesci.length; i++){
            this.pesci[i] = p[i];
        }
    }


}
