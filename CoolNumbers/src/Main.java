public class Main {
    public static void main(String[] args) {
        CoolNumbers numbers = new CoolNumbers();
        String searchNumber = "А555МР197";
        String resultTemplate = " номер %s, поиск занял ";
        numbers.fillingCollections();

        long startTime = System.nanoTime();
        int simpleArraySearchResult = numbers.simpleArraySearch(searchNumber);
        long deltaTime = System.nanoTime() - startTime;
        String searchResult = simpleArraySearchResult != -1 ? "найден" : "не найден";
        System.out.printf("Поиск перебором:" + resultTemplate + deltaTime,searchResult);

        startTime = System.nanoTime();
        int binaryArraySearchResult = numbers.binarySearch(searchNumber);
        deltaTime = System.nanoTime() - startTime;
        searchResult = binaryArraySearchResult != -1 ? "найден" : "не найден";
        System.out.printf("\nБинарный поиск:" + resultTemplate + deltaTime,searchResult);

        startTime = System.nanoTime();
        boolean hashSearchResult = numbers.hashSearch(searchNumber);
        deltaTime = System.nanoTime() - startTime;
        searchResult = hashSearchResult ? "найден" : "не найден";
        System.out.printf("\nПоиск в HashSet:" + resultTemplate + deltaTime,searchResult);

        startTime = System.nanoTime();
        boolean treeSearchResult = numbers.treeSearch(searchNumber);
        deltaTime = System.nanoTime() - startTime;
        searchResult = treeSearchResult ? "найден" : "не найден";
        System.out.printf("\nПоиск в TreeSet:" + resultTemplate + deltaTime,searchResult);
    }
}
