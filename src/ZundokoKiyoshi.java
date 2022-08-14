import java.util.Random;

public class ZundokoKiyoshi {
    public static void main(String[] args) {
        final String ZUN = "ズン";
        final String DOKO = "ドコ";
        final String KIYOSHI = "キ・ヨ・シ!";
        final String ELEMENTS[] = { ZUN, DOKO };
        final String PATTERN = ZUN + ZUN + ZUN + ZUN + DOKO;

        String lyrics = new String();

        Random random = new Random();
        
        while (true) {
            String word = ELEMENTS[random.nextInt(ELEMENTS.length)];
            lyrics += word;

            System.out.print(word + " ");

            if (PATTERN.matches(String.format("^%s.*", lyrics))) {
                if (PATTERN.equals(lyrics))
                    break;
            }
            else {
                System.out.println();
                lyrics = new String();
            }
        }

        System.out.println(KIYOSHI);
    }
}