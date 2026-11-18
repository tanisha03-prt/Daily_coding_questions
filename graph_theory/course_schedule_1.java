package graph_theory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class course_schedule_1 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Step 1: Adjacency list aur indegree array initialize karo
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        
        int[] indegree = new int[numCourses];
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            
            // Direction: prereq -> course (pehle prereq, phir course)
            adj.get(prereq).add(course);
            indegree[course]++;
        }
        
        // Step 2: Jinka koi prerequisite nahi hai (indegree == 0), unhe queue mein dalo
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        
        // Step 3: Kahn's BFS chalao aur completed courses gino
        int completedCourses = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            completedCourses++;
            
            for (int nextCourse : adj.get(curr)) {
                indegree[nextCourse]--;
                if (indegree[nextCourse] == 0) {
                    q.offer(nextCourse);
                }
            }
        }
        
        // Agar saare courses complete ho gaye toh true, warna cycle thi (false)
        return completedCourses == numCourses;
    }
}

