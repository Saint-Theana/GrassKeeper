package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFurnitureArrangementMuipData.*;
import org.sorapointa.proto.HomeFurnitureArrangementMuipData;

public class HomeBlockArrangementMuipData {
    @Tag(tag=1) public Integer blockId = null;
    @Tag(tag=2) public List<HomeFurnitureArrangementMuipData> furnitureDataList = new ArrayList<>();
}
