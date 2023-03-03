package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunaRiteAreaInfo.*;
import org.sorapointa.proto.LunaRiteAreaInfo;
import org.sorapointa.proto.LunaRiteHintPoint.*;
import org.sorapointa.proto.LunaRiteHintPoint;

public class LunaRiteDetailInfo {
    @Tag(tag=3) public List<LunaRiteHintPoint> hintPoint = new ArrayList<>();
    @Tag(tag=13) public List<LunaRiteAreaInfo> areaInfoList = new ArrayList<>();
}
