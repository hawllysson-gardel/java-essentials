# Comparação: HashMap, LinkedHashMap, TreeMap, EnumMap, WeakHashMap, ConcurrentHashMap

## Diferenças Principais

### HashMap

- **Características**:
    - Implementa a interface `Map` usando uma tabela hash.
    - Não garante a ordem das entradas.
    - Permite chaves e valores nulos.

- **Complexidade (Big O)**:
    - **Inserção**: O(1) em média
    - **Remoção**: O(1) em média
    - **Verificação de Existência**: O(1) em média
    - **Iteração**: O(n), onde n é o número de elementos

- **Segurança em Multithreading**: Não é thread-safe. Para um uso seguro em ambientes multithreaded, use `Collections.synchronizedMap(new HashMap<>())` ou `ConcurrentHashMap`.

- **Uso Recomendado**:
    - Quando a ordem das entradas não é importante.
    - Para operações rápidas de inserção, remoção e busca.

- **Redimensionamento**:
    - O `HashMap` redimensiona sua tabela interna quando a carga (número de entradas / capacidade da tabela) atinge um determinado limite, geralmente 75%.

### LinkedHashMap

- **Características**:
    - Extende `HashMap` para manter a ordem de inserção das entradas.
    - Utiliza uma lista duplamente encadeada para manter a ordem de acesso.

- **Complexidade (Big O)**:
    - **Inserção**: O(1)
    - **Remoção**: O(1)
    - **Verificação de Existência**: O(1)
    - **Iteração**: O(n), onde n é o número de elementos

- **Segurança em Multithreading**: Não é thread-safe. Utilize `Collections.synchronizedMap(new LinkedHashMap<>())` para operações seguras em ambientes multithreaded.

- **Uso Recomendado**:
    - Quando a ordem de inserção precisa ser preservada.
    - Para manter a ordem de acesso.

- **Redimensionamento**:
    - Similar ao `HashMap`, redimensiona a tabela quando necessário. A lista de encadeamento mantém a ordem de inserção.

### TreeMap

- **Características**:
    - Implementa `SortedMap` e mantém as entradas em ordem crescente de acordo com a chave.
    - Utiliza uma árvore Red-Black internamente.

- **Complexidade (Big O)**:
    - **Inserção**: O(log n)
    - **Remoção**: O(log n)
    - **Verificação de Existência**: O(log n)
    - **Iteração**: O(n), onde n é o número de elementos

- **Segurança em Multithreading**: Não é thread-safe. Use `Collections.synchronizedSortedMap(new TreeMap<>())` para operações seguras em ambientes multithreaded.

- **Uso Recomendado**:
    - Quando uma ordem específica das chaves é necessária.
    - Para operações que requerem pesquisa, inserção e remoção ordenadas.

- **Redimensionamento**:
    - A árvore Red-Black ajusta seu tamanho automaticamente durante as operações de inserção e remoção.

### EnumMap

- **Características**:
    - Implementa `Map` para chaves que são enumerações.
    - Internamente usa arrays para armazenar os valores.

- **Complexidade (Big O)**:
    - **Inserção**: O(1)
    - **Remoção**: O(1)
    - **Verificação de Existência**: O(1)
    - **Iteração**: O(n), onde n é o número de elementos (número de valores enum)

- **Segurança em Multithreading**: Não é thread-safe. Para operações seguras em ambientes multithreaded, use `Collections.synchronizedMap(new EnumMap<>(EnumType.class))`.

- **Uso Recomendado**:
    - Quando as chaves são do tipo enum.
    - Para otimização quando o número de chaves é pequeno e fixo.

- **Redimensionamento**:
    - O `EnumMap` não precisa redimensionar, pois o tamanho é fixo e baseado no número de constantes do enum.

### WeakHashMap

- **Características**:
    - Utiliza referências fracas para as chaves.
    - Permite que o GC colete chaves quando não há outras referências fortes.

- **Complexidade (Big O)**:
    - **Inserção**: O(1) em média
    - **Remoção**: O(1) em média
    - **Verificação de Existência**: O(1) em média
    - **Iteração**: O(n), onde n é o número de elementos

- **Segurança em Multithreading**: Não é thread-safe. Utilize `Collections.synchronizedMap(new WeakHashMap<>())` para operações seguras em ambientes multithreaded.

- **Uso Recomendado**:
    - Para caches ou mapeamentos onde as entradas devem ser removidas automaticamente quando não são mais referenciadas.

- **Redimensionamento**:
    - Similar ao `HashMap`, redimensiona a tabela conforme necessário. As entradas são removidas quando as chaves são coletadas pelo GC.

### ConcurrentHashMap

- **Características**:
    - Implementa um mapa thread-safe com alta concorrência.
    - Divide o mapa em segmentos para permitir acessos concorrentes.

- **Complexidade (Big O)**:
    - **Inserção**: O(1) em média
    - **Remoção**: O(1) em média
    - **Verificação de Existência**: O(1) em média
    - **Iteração**: O(n), onde n é o número de elementos

- **Segurança em Multithreading**: Thread-safe. Suporta alta concorrência e operações simultâneas.

- **Uso Recomendado**:
    - Em ambientes multithreaded onde múltiplos threads precisam acessar e modificar o mapa simultaneamente.

- **Redimensionamento**:
    - Redimensiona de forma dinâmica e eficiente, dividindo o mapa em segmentos e ajustando conforme necessário.
