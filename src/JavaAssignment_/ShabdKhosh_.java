package JavaAssignment_;

import java.util.ArrayList;
import java.util.Scanner;

public class ShabdKhosh_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] st = new String[n];

        for (int i = 0; i < n; i++) {

            st[i] = sc.next();

        }

        ArrayList<String> list = new ArrayList<>();

        list.add(st[0]);

        boolean[] used = new boolean[n];

        used[0] = true;

        if (findChain(list, used, st, n)) {
            for (String ele : list) {

                System.out.println(ele);

            }

        } else {

            System.out.println("IMPOSSIBLE");

        }

    }

    public static boolean findChain(ArrayList<String> list, boolean[] used, String[] words, int n) {

        if (list.size() == n) return true;

        String lastWord = list.get(list.size() - 1);

        for (int j = 0; j < n; j++) {

            if (!used[j]) {

                for (int k = 3; k <= lastWord.length(); k++) {

                    if (words[j].startsWith(lastWord.substring(lastWord.length() - k))) {

                        list.add(words[j]);

                        used[j] = true;
                        if (findChain(list, used, words, n)) return true;

                        list.remove(list.size() - 1);

                        used[j] = false;
                    }

                }

            }

        }
        return false;
    }
}
