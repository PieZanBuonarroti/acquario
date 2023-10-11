public class Pesce {

    private String specie;
    private String dieta;
    private String nome;

    public Pesce(String specie, String dieta, String nome){
        if(specie.equals("")){
            this.specie="Specie non identificata";
        }else{
            this.specie=specie;
        }
        if(dieta.equals("")){
            this.dieta="Dieta non identificata";
        }else{
            this.dieta=dieta;
        }
        if(nome.equals("")){
            this.nome="Nome non identificato";
        }else{
            this.nome=nome;
        }
    }

    public String getSpecie() {
        return specie;
    }

    public String getDieta() {
        return dieta;
    }

    public String getNome() {
        return nome;
    }

    
}
