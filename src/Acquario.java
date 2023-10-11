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

    public String getNome() {
        return nome;
    }

    public String getLocation() {
        return location;
    }

    public boolean addPesce(Pesce pesce){
        boolean rit = false;
        int i = 0;
        while(this.pesci[i]!=null){
            i++;
        }
        if(this.pesci[i]==null){
            this.pesci[i] = pesce;
            rit = true;
        }
        return rit;
    }

    public boolean removePesce(int pos){
        boolean rit = false;
            if(this.pesci[pos]!=null){
                this.pesci[pos] = null;
                rit = true;
            }
        return rit;
    }

    public Pesce readPesce(int pos){
        Pesce p = null;
        if(this.pesci[pos]!=null){
            p = this.pesci[pos].clone();
        }
        return p;
    }

    public String toString(){
        String rit ="{\n";
        rit += "Nome Acquario: " +this.nome +"\n";
        rit += "Location: " +this.location +"\n";
        rit += "Pesci: " +"\n";
        rit +="[\n";
        for(int i=0; i<this.pesci.length; i++){
            if(this.pesci[i]!=null){
                rit+=this.pesci[i].toString();
            }else{
                rit+= null +"\n";
            }
        }
        rit +="]\n";
        rit +="}\n";
        return rit;
    }

    public Acquario clone(){
        Acquario a = new Acquario(this.nome, this.location, this.pesci);
        return a;
    }

}
