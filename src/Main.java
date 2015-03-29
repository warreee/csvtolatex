import com.opencsv.*;

import java.io.*;

public class Main {

    static boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z = false;

    public static void main(String[] args) {
        String csvFilename = "woordenlijst.csv";
        CSVReader csvReader = null;
        PrintWriter writer = null;



        try {
            writer = new PrintWriter("output.tex", "UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            csvReader = new CSVReader(new FileReader(csvFilename), ';');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] row = null;
        try {
            while((row = csvReader.readNext()) != null) {
                if (writer != null) {
                    try {
                        String answer = getDictChar(row[1].substring(0, 1));
                        if (!answer.equals("")) {
                            writer.println(answer);
                        }
                    } catch (NullPointerException e){
                        e.printStackTrace();
                    }
                    System.out.println(5);
                    writer.println("\\dictentry{" + row[1] + "}{"
                                    + /*row[2] + */"}{"
                                    + row[2] + "}{"
                                    + row[3] + " " + row[5] + "}{"
                                    + row[0] + "}" +
                                    "{}{"
                                    + row[4] + "}{" +
                                    "}"
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            csvReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    NEEDS REWRITING!!!
     */
    private static String getDictChar(String firstLetter){
        firstLetter = firstLetter.toLowerCase();
        switch (firstLetter) {
            case "a":
                if (!a){
                    a = true;
                    return "\\dictchar{A}";

                } else {
                    return null;
                }

            case "b":
                if (!b){
                    b = true;
                    return "\\dictchar{B}";
                } else {
                    return null;
                }

            case "c":
                if (!c){
                    c = true;
                    return "\\dictchar{C}";
                } else {
                    return null;
                }

            case "d":
                if (!d){
                    d = true;
                    return "\\dictchar{D}";
                } else {
                    return null;
                }

            case "e":
                if (!e){
                    e = true;
                    return "\\dictchar{E}";
                } else {
                    return null;
                }

            case "f":
                if (!f){
                    f = true;
                    return "\\dictchar{F}";
                } else {
                    return null;
                }

            case "g":
                if (!g){
                    g = true;
                    return "\\dictchar{G}";
                } else {
                    return null;
                }

            case "h":
                if (!h){
                    h = true;
                    return "\\dictchar{H}";
                } else {
                    return null;
                }

            case "i":
                if (!i){
                    i = true;
                    return "\\dictchar{I}";
                } else {
                    return null;
                }

            case "j":
                if (!j){
                    j = true;
                    return "\\dictchar{J}";
                } else {
                    return null;
                }

            case "k":
                if (!k){
                    k = true;
                    return "\\dictchar{K}";
                } else {
                    return null;
                }

            case "l":
                if (!l){
                    l = true;
                    return "\\dictchar{L}";
                } else {
                    return null;
                }

            case "m":
                if (!m){
                    m = true;
                    return "\\dictchar{M}";
                } else {
                    return null;
                }

            case "n":
                if (!n){
                    n = true;
                    return "\\dictchar{N}";
                } else {
                    return null;
                }

            case "o":
                if (!o){
                    o = true;
                    return "\\dictchar{O}";
                } else {
                    return null;
                }

            case "p":
                if (!p){
                    p = true;
                    return "\\dictchar{P}";
                } else {
                    return null;
                }

            case "q":
                if (!q){
                    q = true;
                    return "\\dictchar{Q}";
                } else {
                    return null;
                }

            case "r":
                if (!r){
                    r = true;
                    return "\\dictchar{R}";
                } else {
                    return null;
                }

            case "s":

                if (!s){
                    s = true;
                    return "\\dictchar{S}";
                } else {
                    return null;
                }

            case "t":

                if (!t){
                    t = true;
                    return "\\dictchar{T}";
                } else {
                    return null;
                }

            case "u":
                if (!u){
                    u = true;
                    return "\\dictchar{U}";
                } else {
                    return null;
                }

            case "v":
                if (!v){
                    v = true;
                    return "\\dictchar{V}";
                } else {
                    return null;
                }

            case "w":
                if (!w){
                    w = true;
                    return "\\dictchar{W}";
                } else {
                    return null;
                }

            case "x":
                if (!x){
                    x = true;
                    return "\\dictchar{X}";
                } else {
                    return null;
                }

            case "y":
                if (!y){
                    y = true;
                    return "\\dictchar{Y}";
                } else {
                    return null;
                }

            case "z":
                if (!z){
                    z = true;
                    return "\\dictchar{Z}";
                } else {
                    return null;
                }



        }

        return null;
    }
}
