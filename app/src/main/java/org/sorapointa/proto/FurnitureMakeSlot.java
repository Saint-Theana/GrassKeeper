package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeData.*;
import org.sorapointa.proto.FurnitureMakeData;

public class FurnitureMakeSlot {
    @Tag(tag=4) public List<FurnitureMakeData> furnitureMakeDataList = new ArrayList<>();
}
