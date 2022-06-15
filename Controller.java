public class Controller {
    
    public void app() {
        int[] start = {5,2,8,7,23,56,4,3,23,5};


        Solution task = new Solution();    

        int[] sort = task.sort(start);
        for (int i = 0; i < start.length; i++) {
            System.out.printf("%d ",sort[i]);
        }
    }
}
