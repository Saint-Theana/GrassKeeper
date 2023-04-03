package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunaRiteHintPoint.*;
import org.sorapointa.proto.LunaRiteHintPoint;
import org.sorapointa.proto.LunaRiteAreaInfo.*;
import org.sorapointa.proto.LunaRiteAreaInfo;

public class LunaRiteInfo {
    @Tag(tag=8) public List<LunaRiteHintPoint> hintPoint = new ArrayList<>();
    @Tag(tag=9) public List<LunaRiteAreaInfo> areaInfoList = new ArrayList<>();
}
