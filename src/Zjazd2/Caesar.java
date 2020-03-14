/*
Class to create opportunity to cipher your name with Caesar code with manually chosen shift.
Patryk Klimek
 */
package Zjazd2;

public class Caesar {
    private String name;
    private int shift;

    public Caesar(String name, int shift) {
        this.name = name;
        this.shift = shift;
    }

    public String cipher() {
        String cipherText = "";
        char alphabet;
        for (int i = 0; i < name.length(); i++){

            alphabet = name.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char)(alphabet + shift);
                if (alphabet > 'z'){
                    alphabet = (char)(alphabet + 'a' - 'z' - 1);
                }
                cipherText = cipherText + alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                cipherText = cipherText + alphabet;
            }
            else {
                cipherText = cipherText + alphabet;
            }

        }
        return cipherText;
    }

}
