package br.com.hawlab.data_structures.strings;

public class PerformanceComparisonStringVsStringBuilderVsStringBuffer {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (Strings)");

        // String
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        long durationString = endTime - startTime;
        System.out.println("Tempo de Execução (String): " + durationString + " ns");

        // StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuilder = endTime - startTime;
        System.out.println("Tempo de Execução (StringBuilder): " + durationStringBuilder + " ns");

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sbf.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Tempo de Execução (StringBuffer): " + durationStringBuffer + " ns");

        System.out.println("------------------------------------------");
    }
}
