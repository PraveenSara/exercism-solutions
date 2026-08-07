import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> cardSets = new HashSet<>();

        for (String card : cards) {
            cardSets.add(card);
        }
        return cardSets; 
    }

    static boolean addCard(String card, Set<String> collection) {
        
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.size() != theirCollection.size()) {
            return false;
        }

        if (myCollection.size() == 0 | theirCollection.size() == 0) {
            return false;
        }
        
        return !myCollection.equals(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections == null | collections.isEmpty()) {
            return Set.of();
        }

        Set<String> common = new HashSet<>(collections.get(0));

        for (int i = 0; i < collections.size(); i++) {
            common.retainAll(collections.get(i));
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {

        Set<String> all = new HashSet<>();
        
        for (Set<String> set : collections) {
            all.addAll(set);
        }

        return all;
    }
}
