class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int pickP = 0;
        int pickG = 0;
        int pickM = 0;

        int lastP = 0;
        int lastG = 0;
        int lastM = 0;

        // Calculate pickups and find the last occurrence of each type of garbage
        for (int i = 0; i < garbage.length; i++) {
            String curr = garbage[i];
            for (int j = 0; j < curr.length(); j++) {
                char ch = curr.charAt(j);
                if (ch == 'P') {
                    pickP++;
                    lastP = i;
                } else if (ch == 'G') {
                    pickG++;
                    lastG = i;
                } else if (ch == 'M') {
                    pickM++;
                    lastM = i;
                }
            }
        }

        // Calculate travel times
        int travelP = 0;
        for (int i = 0; i < lastP; i++) {
            travelP += travel[i];
        }

        int travelG = 0;
        for (int i = 0; i < lastG; i++) {
            travelG += travel[i];
        }

        int travelM = 0;
        for (int i = 0; i < lastM; i++) {
            travelM += travel[i];
        }

        // Calculate total time
        int ans = (pickP + travelP) + (pickG + travelG) + (pickM + travelM);
        return ans;
    }
}
