def busca_binaria(produtos, id_produto):
    inicio = 0
    fim = len(produtos) - 1

    while inicio <= fim:
        meio = (inicio + fim) // 2
        id_atual = produtos[meio].id

        if id_atual == id_produto:
            return produtos[meio]
        if id_atual < id_produto:
            inicio = meio + 1
        else:
            fim = meio - 1

    return None
