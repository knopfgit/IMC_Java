def insertion_sort(produtos):
    itens = produtos.copy()

    for i in range(1, len(itens)):
        atual = itens[i]
        j = i - 1

        while j >= 0 and itens[j].id > atual.id:
            itens[j + 1] = itens[j]
            j -= 1

        itens[j + 1] = atual

    return itens
