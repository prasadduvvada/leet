class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            MaxHeap.offer(stone);
        }
        
        while(MaxHeap.size() > 1){
          int x = MaxHeap.poll();
          int y = MaxHeap.poll();

          if(x != y){
            MaxHeap.offer(x-y);
          }
        }
        return MaxHeap.isEmpty() ? 0:MaxHeap.peek();

    }
}