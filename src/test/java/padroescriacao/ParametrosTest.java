package padroescriacao;


class dadosMoedaTest {

    @Test
    public void deveRetornarValorMoeda() {
        DadosMoeda.getInstance().setValorMoeda(8.11);
        assertEquals(4.1, DadosMoeda.getInstance().getValorMoeda());
    }

    @Test
    public void deveretornarNomeMoeda() {
        DadosMoeda.getInstance().setNomeMoeda("dolar");
        assertEquals("dolar", DadosMoeda.getInstance().getNomeMoeda());
    }

}