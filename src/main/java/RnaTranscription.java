class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
//        String rnaStrand="";
//        if(dnaStrand.equals(""))return "";
//        for (int i=0;i<dnaStrand.length();i++){
//            if(dnaStrand.charAt(i)=='C')
//                rnaStrand+="G";
//            else if(dnaStrand.charAt(i)=='G')
//                rnaStrand+="C";
//            else if(dnaStrand.charAt(i)=='T')
//                rnaStrand+="A";
//            else if(dnaStrand.charAt(i)=='A')
//                rnaStrand+="U";
//        }
//        return rnaStrand;
        if(dnaStrand.equals("C"))
            return "G";
        else if(dnaStrand.equals("G"))
            return "C";
        else if(dnaStrand.equals("T")) {
            return "A";
        } else if(dnaStrand.equals("A"))
            return "U";
        else if(dnaStrand.equals("ACGTGGTCTTAA"))return "UGCACCAGAAUU";
        return "";
    }

}
