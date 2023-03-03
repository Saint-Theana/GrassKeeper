package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkTipsType.*;
import org.sorapointa.proto.MapMarkTipsType;

public class MapMarkTipsInfo {
    @Tag(tag=1) public Integer tipsType = null;
    @Tag(tag=2) public List<Integer> pointIdList = new ArrayList<>();
}
