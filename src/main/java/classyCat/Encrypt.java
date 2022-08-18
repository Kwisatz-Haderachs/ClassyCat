package classyCat;

public class Encrypt {
    private String string;
    private int cipher;

    public Encrypt(String s, int x){
        this.string =  s;
        this.cipher =  x;
    }

    public String encryption(){
        String ciphertext = getString();
        int shift = getCipher();
        char[] cipherArray = ciphertext.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cipherArray) {
            if(c != ' ') {
                int origin = c - 'a';
                int change = (origin + shift) % 26;
                char cc = (char) ('a' + change);
                sb.append(cc);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String getString() {
        return string;
    }

    public int getCipher() {
        return cipher;
    }
}
