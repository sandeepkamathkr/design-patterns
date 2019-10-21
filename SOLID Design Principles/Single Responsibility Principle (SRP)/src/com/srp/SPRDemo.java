package com.srp;

class SRPDemo {
    public static void main(String[] args) throws Exception {
        Notes n = new Notes();
        n.addEntry("Attended Class Today");
        n.addEntry("Did Exercise Today");
        System.out.println(n);

        Persistence p = new Persistence();
        String filename = "c:\\temp\\notes.txt";
        p.saveToFile(n, filename, true);

        // windows!
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
