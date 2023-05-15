package DataStructuresAlgorithm.DAY__80;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GREEDY_Job_Sequence_Problem {
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int id,int deadline,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int[][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0 ; i<jobsInfo.length ; i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a , b) -> b.profit - a.profit); // descending order
                            // (obj1,obj2) obj1.profit - obj2.profit //in ascending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for(int i=0 ; i<jobs.size() ; i++){
            Job currJob = jobs.get(i);
            if(currJob.deadline>time){
                seq.add(currJob.id);
                time++;
            }
        }
        System.out.println(seq);

    }
}
