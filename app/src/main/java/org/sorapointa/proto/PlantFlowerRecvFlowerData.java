package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class PlantFlowerRecvFlowerData {
    public static class MapFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=12) public String nickname = null;
    @Tag(tag=8) public Integer uid = null;
    @Tag(tag=3) public ProfilePicture profilePicture = null;
    @Tag(tag=9) public List<MapFlowerNumMap> flowerNumMap = new ArrayList<>();
}
