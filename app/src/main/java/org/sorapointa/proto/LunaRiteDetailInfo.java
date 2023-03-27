package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LunaRiteDetailInfo {
    @Tag(tag=8) public List<LunaRiteHintPoint> hintPoint = new ArrayList<>();
    @Tag(tag=9) public List<LunaRiteAreaInfo> areaInfoList = new ArrayList<>();
}
