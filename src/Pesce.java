public class Pesce {

    private String specie;
    private String dieta;
    private int eta;
    private String nome;

    public Pesce(String specie, String dieta, int eta, String nome){
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
        if(eta>0){
            this.eta=eta;
        }else{
            this.eta=1;
        }
    }

}
