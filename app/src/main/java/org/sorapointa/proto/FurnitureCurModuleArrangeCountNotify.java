package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class FurnitureCurModuleArrangeCountNotify {
    @Tag(tag=13) public List<Uint32Pair> furnitureArrangeCountList = new ArrayList<>();
}
