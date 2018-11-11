package com.example.xman.kryptonote;

public class Cipher {
    private String key;
    private String note;

    public static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher(String k, String n) {
        this.key = k;
        this.note = n;
    }

    public String makePad(String note) {
        String pad = this.key;
        for (; pad.length() < note.length(); ) {
            pad += this.key;
        }
        return pad;
        /*String pad;
          for(pad = this.key; pad.length() < note.length(); pad += this.key);
          return pad;
        */
    }

    public String encrypt() {
        String pad = makePad(note);
        String result = "";
        for (int i = 0; i < note.length(); i++) {
            String c = note.substring(i, i + 1);
            int position = ALPHABET.indexOf(c);
            int shift = Integer.parseInt(pad.substring(i, i + 1));
            int newPosition = (position + shift) % ALPHABET.length();
            result = result + ALPHABET.substring(newPosition, newPosition + 1);
            /*
            int newPosition = position + shift;
            if(newPosition > ALPHABET.length()){
            newPosition = newPosition - ALPHABET.length() }
            */
        }
        return result;
    }

    public String decrypt() {
        String pad = makePad(note);
        String result = "";
        for (int i = 0; i < note.length(); i++) {
            String c = note.substring(i, i + 1);
            int position = ALPHABET.indexOf(c);
            int shift = Integer.parseInt(pad.substring(i, i + 1));
            int newPosition = (position - shift) % ALPHABET.length();

     
            if (newPosition < 0) {
                newPosition = newPosition + ALPHABET.length();
            }
            

            result = result + ALPHABET.substring(newPosition, newPosition + 1);

        }
        return result;
    }

}





