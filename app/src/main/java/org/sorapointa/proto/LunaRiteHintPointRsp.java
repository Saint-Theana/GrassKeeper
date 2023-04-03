package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LunaRiteHintStatusType.*;
import org.sorapointa.proto.LunaRiteHintStatusType;
import org.sorapointa.proto.LunaRiteHintPoint.*;
import org.sorapointa.proto.LunaRiteHintPoint;

public class LunaRiteHintPointRsp {
    public enum LunaRiteHintPointRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8361) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer areaId = null;
    @Tag(tag=3) public Integer hintStatus = null;
    @Tag(tag=12) public List<LunaRiteHintPoint> hintPoint = new ArrayList<>();
}
