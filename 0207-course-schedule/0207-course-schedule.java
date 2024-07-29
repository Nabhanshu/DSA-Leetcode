class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
         if (numCourses <= 1 || prerequisites == null || prerequisites.length <= 1) {
            return true;
        }
        int[][] matrix = new int[numCourses][numCourses];
        int[] requirements = new int[numCourses];

        for (int[] each : prerequisites) {
            int course = each[0];
            int pre = each[1];
            if (matrix[pre][course] == 0) {
                requirements[course]++;
            }
            matrix[pre][course] = 1;
        }
        java.util.Queue<Integer> stack = new java.util.LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (requirements[i] == 0) {
                stack.add(i);
            }
        }
        int counter = 0;
        while (!stack.isEmpty()) {
            int course = stack.poll();
            counter++;
            for (int i = 0; i < numCourses; i++) {
                if (matrix[course][i] != 0) {
                    requirements[i]--;
                    if (requirements[i] == 0) {
                        stack.add(i);
                    }
                }
            }
        }
        return counter == numCourses;
    }
}