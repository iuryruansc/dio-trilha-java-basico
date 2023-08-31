@startuml
AparelhoTelefonico <|-- iPhone
NavegadorInternet <|-- iPhone
ReprodutorMusical <|-- iPhone


interface AparelhoTelefonico {    
    -- Public methods --
    + ligar() : void
    + atender() : void
    + iniciarCorreioVoz() : void
}

interface NavegadorInternet {    
    -- Public methods --
    + exibirPagina() : void
    + adicionarNovaAba() : void
    + atualizarPagina() : void
}

interface ReprodutorMusical {    
    -- Public methods --
    + tocar() : void
    + pausar() : void
    + selecionarMusica() : void
}
@enduml
