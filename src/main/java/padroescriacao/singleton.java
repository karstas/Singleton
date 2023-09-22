package padroescriacao;

public class DadosMoeda {

    private DadosMoeda() {};

    private static DadosMoeda instance = new DadosMoeda();
    public static DadosMoeda getInstance() {return instance;}

    private double valorMoeda;

    private String nomeMoeda;

    public String getNomeMoeda() {return nomeMoeda;}

    public void setNomeMoeda(String nomeMoeda) {this.nomeMoeda = nomeMoeda;}

    public double getValorMoeda() {return this.valorMoeda;}

    public void setValorMoeda(double valorMoeda) {this.valorMoeda = valorMoeda;}




}