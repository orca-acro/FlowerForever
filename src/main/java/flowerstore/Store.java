package flowerstore;



import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBucket = new ArrayList<>();

    public String search(FlowerType flowerType) {
        List<FlowerBucket> avaible = new ArrayList<>();
        for(int i=0; i < flowerBucket.size(); i++) {
            for (int j = 0; j < flowerBucket.get(i).getFlowerPacks().size(); j++) {
                if (flowerBucket.get(i).getFlowerPacks().get(j).getFlower().getFlowerType() == flowerType) {
                    avaible.add(flowerBucket.get(i));
                }
            }
        }
        if (avaible.isEmpty()) {
            return "Sorry, no flowers left :(";
        }
        else {
            return avaible.toString();
        }
    }
    public void setFlowerBucket(FlowerBucket flowerBucket) {
        this.flowerBucket.add(flowerBucket);
    }
}
