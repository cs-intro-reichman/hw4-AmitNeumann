public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String sentence1;
        
        for(int i=0;i<sentences.length;i++) { // runs on the sentences
            sentence1=sentences[i];
            String[] words = sentence1.split(" ");
            for (int j=0;j<words.length;j++){ // runs on the words of 1 sentence 
                String word1=words[j];
                for(int k=0;k<keywords.length;k++){ // compare 1 word to all the bullhit letters
                    if(word1.equalsIgnoreCase(keywords[k])){
                        System.out.println(sentence1);
                        break;
                    }
                } // on the bullshit words
            }// on the words of the sentence
        }// on the sentences
    }
}
