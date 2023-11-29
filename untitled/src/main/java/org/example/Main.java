package org.example;

import java.io.IOException;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        try {

            WordProcessor wordProcessor = new WordProcessor();

            wordProcessor.readFile("src/main/resources/file1.txt");
            Set<String> set1 = wordProcessor.getDistinctWords();

            wordProcessor.readFile("src/main/resources/file2.txt");
            Set<String> set2 = wordProcessor.getDistinctWords();

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();

            double similarity = similarityCalculator.calculateSimilarity(set1, set2);

            System.out.println("Jaccard Similarity Coefficient: " + similarity);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}