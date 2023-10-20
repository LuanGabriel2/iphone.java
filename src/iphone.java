// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
    void avancarMusica();
    void voltarMusica();
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void desligarChamada();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void abrirPagina(String url);
    void fecharPagina();
}

// Classe que implementa os papéis do iPhone
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação para o Reprodutor Musical
    public void tocarMusica() {
        // Implementação aqui
    }

    public void pausarMusica() {
        // Implementação aqui
    }

    public void avancarMusica() {
        // Implementação aqui
    }

    public void voltarMusica() {
        // Implementação aqui
    }

    // Implementação para o Aparelho Telefônico
    public void fazerChamada(String numero) {
        // Implementação aqui
    }

    public void receberChamada(String numero) {
        // Implementação aqui
    }

    public void desligarChamada() {
        // Implementação aqui
    }

    // Implementação para o Navegador na Internet
    public void abrirPagina(String url) {
        // Implementação aqui
    }

    public void fecharPagina() {
        // Implementação aqui
    }
}