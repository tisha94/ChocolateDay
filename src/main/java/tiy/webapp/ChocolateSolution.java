package tiy.webapp;

/**
 * Created by Tisha868 on 6/5/16.
 */
public class ChocolateSolution {
        public int smalls;
        public int bigs;
        public boolean hasSolution = false;

        public void setNoSolution() {
            smalls = -1;
            bigs = -1;
            hasSolution = false;
        }

        public void setSolution(int smalls, int bigs) {
            hasSolution = true;
            this.smalls = smalls;
            this.bigs = bigs;
        }
}
