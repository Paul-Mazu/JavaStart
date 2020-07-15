package innerClasses.zad1;

public class App {
    public static void main(String[] args) {

        Sortable sorter = new Sortable() {

            @Override
            public void sort(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 0; j < tab.length-i; j++) {
                        if (tab[j + 1] < tab[j]) {
                            int temp = tab[j];
                            tab[j] = tab[j + 1];
                            tab[j + 1] = temp;
                        }
                    }
                }
            }
        };

        int[] tabela = {5, 3, 7, 9, 1, 2, 6, 4, 8};
        printArray(tabela);
        System.out.println();
        sorter.sort(tabela);
        printArray(tabela);

    }

    private static void printArray(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
