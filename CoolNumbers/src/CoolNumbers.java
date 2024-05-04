import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class CoolNumbers {
    public static final String[] AVAILABLE_LETTERS = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    private ArrayList<String> numberArray;
    private HashSet<String> numberHashSet;
    private TreeSet<String> numberTreeSet;
    private final int collectionsSize = 2000000;

    public CoolNumbers() {
        this.numberArray = new ArrayList<>();
        this.numberHashSet = new HashSet<>();
        this.numberTreeSet = new TreeSet<>();
    }

    public void fillingCollections() {
        for (int i = 0; i < collectionsSize; i++) {
            String randomNumber = generateCoolNumbers();
            numberArray.add(randomNumber);
            numberHashSet.add(randomNumber);
            numberTreeSet.add(randomNumber);
        }
        Collections.sort(numberArray);
    }

    private String generateCoolNumbers() {
        StringBuilder carNumber = new StringBuilder();
        int digitNumber = (int) Math.round(9 * Math.random());
        int region = (int) Math.round(1 + 198 * Math.random());
        carNumber.append(AVAILABLE_LETTERS[generateRandomArrayIndex()]);
        carNumber.append(digitNumber);
        carNumber.append(digitNumber);
        carNumber.append(digitNumber);
        carNumber.append(AVAILABLE_LETTERS[generateRandomArrayIndex()]);
        carNumber.append(AVAILABLE_LETTERS[generateRandomArrayIndex()]);
        carNumber.append(region < 10 ? "0".concat(Integer.toString(region)) : region);
        return carNumber.toString();
    }

    public int simpleArraySearch (String searchNumber) {
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i).equals(searchNumber)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch (String searchNumber) {
        int index = Collections.binarySearch(numberArray, searchNumber);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public boolean hashSearch (String searchNumber) {
        return numberHashSet.contains(searchNumber);
    }

    public boolean treeSearch(String searchNumber) {
        return numberTreeSet.contains(searchNumber);
    }

    private int generateRandomArrayIndex () {
        return (int) (AVAILABLE_LETTERS.length * Math.random());
    }

}
