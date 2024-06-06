class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // Reverse decrement using HashMap O(n) solution
        if (hand.length % groupSize != 0) {
            return false;
        }
        Map<Integer, Integer> cards = new HashMap<>();
        for (int card : hand) {
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }
        for (int card : hand) {
            int startCard = card;
            while (cards.getOrDefault(startCard - 1, 0) > 0) {
                startCard--;
            }
            while (startCard <= card) {
                while (cards.getOrDefault(startCard, 0) > 0) {
                    for (int nextCard = startCard; nextCard < startCard + groupSize; nextCard++) {
                        if (cards.getOrDefault(nextCard, 0) == 0) {
                            return false;
                        }
                        cards.put(nextCard, cards.get(nextCard) - 1);
                    }
                }
                startCard++;
            }
        }
        return true;
        /* TreeMap O(nlogn) solution
        if (hand.length % groupSize != 0) {
            return false;
        }
        Map<Integer, Integer> cards = new TreeMap<>();
        for (int i = 0; i < hand.length; i++) {
            cards.put(hand[i], cards.getOrDefault(hand[i], 0) + 1);
        }
        while (cards.size() > 0) {
            int current = cards.entrySet().iterator().next().getKey();
            for (int i = 0; i < groupSize; i++) {
                if (!cards.containsKey(current + i)) {
                    return false;
                }
                cards.put(current + i, cards.get(current + i) - 1);
                if (cards.get(current + i) == 0) {
                    cards.remove(current + i);
                }
            }
        }
        return true;
        */
    }
}

// https://leetcode.com/problems/hand-of-straights/?envType=daily-question&envId=2024-06-06