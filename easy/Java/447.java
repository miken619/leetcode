/*Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example:
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]*/

class 447 {
    public int numberOfBoomerangs(int[][] points) {
       Map<Integer, Integer> map = new HashMap<>();
       int result = 0;
        
       for(int[] i: points) {
           for(int[] j: points) {
               if(i == j) continue;
               
               int dist = calculateDistance(i, j);
               int prevDist = map.getOrDefault(dist, 0);
               result += 2*prevDist;
               map.put(dist, prevDist + 1);
           }
           map.clear();
       }
        
        return result;
        
    }
    
    public int calculateDistance(int[] a, int[] b) {
        int xd = a[0] - b[0];
        int yd = a[1] - b[1];
        
        return xd*xd + yd*yd;
    } 
}