package com.danila.strings;

public class HappySmiles {
    public static void main(String[] args) {
        String smiles = "ывапавпл:)kjhjk:(:(klfgkl(lkfjdg) ;ljkh:(";

        System.out.println(smiles);
        System.out.println(changeSmiles(smiles));
    }

    public static String changeSmiles(String smiles) {
        return smiles.replace(":(", ":)");
    }
}
