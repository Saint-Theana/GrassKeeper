package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;

public class PlantFlowerEditFlowerCombinationReq {
    @Tag(tag=10) public CustomGadgetTreeInfo flowerCombinationInfo = null;
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=9) public Integer scheduleId = null;
}
