class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> outgoing = new HashSet<>();

        for (List<String> path: paths) {
            outgoing.add(path.get(0));
        }

        for (List<String> path: paths) {
            String destination = path.get(1);
            if(!outgoing.contains(destination)) {
                return destination;
            }
        }
        return "";
    }
}