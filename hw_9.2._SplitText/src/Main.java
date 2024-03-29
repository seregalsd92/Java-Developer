public class Main {
    public static void main(String[] args) {
        String text = "“I worked for years with the dead. My own experience is that the brain is pretty quick to liquefy (postmortem),” she said. “So it was a real shock when I came across a (scientific) paper referencing a 2,500 year-old brain.”\n" +
                "\n" +
                "Now a forensic anthropologist studying for a doctorate at the University of Oxford, Morton-Hayward has discovered that brains, while not as commonly found intact as bones, do preserve surprisingly well in the archaeological record.\n" +
                "\n" +
                "To understand why, the anthropologist has compiled a unique archive of information about 4,405 brains unearthed by archaeologists. Brains have surfaced from northern European peat bogs, Andean mountaintops, shipwrecks, desert tombs and Victorian poorhouses. The earliest discovered were 12,000 years old.";
        System.out.println(SplitText.splitText(text));

    }
}