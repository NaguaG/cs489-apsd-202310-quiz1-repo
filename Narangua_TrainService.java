public class Narangua_TrainService {
    public static class TrainService {

        public void register() {

            System.out.println("Hello, New Service");

        }

    }

    public static void main(String[] args) {

        TrainService trainService = new TrainService();
        trainService.register();
    }
}
