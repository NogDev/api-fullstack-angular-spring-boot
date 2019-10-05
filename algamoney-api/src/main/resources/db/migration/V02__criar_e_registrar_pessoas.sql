CREATE TABLE pessoa(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    ativo BOOLEAN NOT NULL,
    logradouro VARCHAR(50),
    numero VARCHAR(8),
    complemento VARCHAR(50),
    bairro VARCHAR(50),
    cep VARCHAR(9),
    cidade VARCHAR(20),
    estado VARCHAR(20)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo) VALUES ('João Silva', '1');
INSERT INTO pessoa (nome, ativo) VALUES ('Maria Quiteria', '1');
INSERT INTO pessoa (nome, ativo) VALUES ('Joaquim Jose', '1');
INSERT INTO pessoa (nome, ativo) VALUES ('Bob Marley', '1');
INSERT INTO pessoa (nome, ativo) VALUES ('Isaque Newton', '1');