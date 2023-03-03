package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunaRiteHintPoint.*;
import org.sorapointa.proto.LunaRiteHintPoint;
import org.sorapointa.proto.LunaRiteHintStatusType.*;
import org.sorapointa.proto.LunaRiteHintStatusType;

public class LunaRiteHintPointRsp {
    @Tag(tag=4) public Integer hintStatus = null;
    @Tag(tag=5) public Integer areaId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<LunaRiteHintPoint> hintPoint = new ArrayList<>();
}
