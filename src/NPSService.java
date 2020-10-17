public class NPSService {
    public static double nps(int[] votes){
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
        double all = detractors + promoters + neutrals;
        if (all != 0.0){
            return promoters*100/all - detractors*100/all;
        }
        return 0.0;
    }
}
