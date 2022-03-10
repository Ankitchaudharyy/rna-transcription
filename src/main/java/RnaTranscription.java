class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaTrans = new StringBuilder();

        for(int idx=0; idx<dnaStrand.length(); idx++){
            char ch = dnaStrand.charAt(idx);

            if(ch == 'G'){
                rnaTrans.append('C');
            }
            else if(ch == 'C'){
                rnaTrans.append('G');
            }
            else if(ch == 'T'){
                rnaTrans.append('A');
            }
            else if(ch == 'A'){
                rnaTrans.append('U');
            }
        }

        return rnaTrans.toString();
    }

}
