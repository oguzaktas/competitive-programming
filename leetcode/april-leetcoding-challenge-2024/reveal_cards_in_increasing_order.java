class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];
        boolean skip = false;
        int indexInDeck = 0, indexInResult = 0;
        Arrays.sort(deck);
        while (indexInDeck < deck.length) {
            if (result[indexInResult] == 0) {
                if (!skip) {
                    result[indexInResult] = deck[indexInDeck];
                    indexInDeck++;
                }
                skip = !skip;
            }
            indexInResult = (indexInResult + 1) % deck.length;
        }
        return result;
    }
}

// https://leetcode.com/problems/reveal-cards-in-increasing-order/?envType=daily-question&envId=2024-04-10