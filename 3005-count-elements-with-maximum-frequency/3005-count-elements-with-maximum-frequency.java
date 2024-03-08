public class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Find the frequency of each element
        int[] frequencies = new int[100];
        for (int num : nums) {
            frequencies[num - 1]++;
        }

        // Determine the maximum frequency, stored in the last index of the sorted array
        Arrays.sort(frequencies);
        int maxFreqIndex = frequencies.length - 1;
        int totalFrequencies = frequencies[maxFreqIndex];

        // Calculate the total frequencies of elements with the maximum frequency
        // Start from the last index and iterate right to left
        while (maxFreqIndex > 0 && frequencies[maxFreqIndex] == frequencies[maxFreqIndex - 1]) {
            totalFrequencies += frequencies[maxFreqIndex];
            maxFreqIndex--;
        }
        return totalFrequencies;
    }
}