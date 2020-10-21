public class NPSService {
    public double nps(int[] votes){
        int detractors = 0;
        int promoters = 0;
        int neutrals = 0;
        for (int vote : votes) {
            if (vote < 7){
                detractors++;
                continue;
            }
            if (vote > 8){
                promoters++;
                continue;
            }
            neutrals++;
        }
        int all = detractors + promoters + neutrals;
        if (all != 0){
            return (double)promoters*100/all - (double)detractors*100/all;
        }
        return 0.0;
    }
}
