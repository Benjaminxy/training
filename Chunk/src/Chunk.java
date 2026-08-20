
import java.util.ArrayList;
import java.util.List;

class  Chunk{

    public static void main(String[] args) {

        ArrayList<Integer> ids = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int chunkSize = 3;

        ArrayList<ArrayList<Integer>> chunks = new ArrayList<>();

        for (int i = 0; i < ids.size(); i += chunkSize) {

            int end = i + chunkSize;
            if (end > ids.size()) {
                end = ids.size() ;
            }

            ArrayList<Integer> chunk = new ArrayList<>(ids.subList(i, end));
            chunks.add(chunk);

        }
        System.out.println(chunks);

    }
}