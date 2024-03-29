package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GachaInfo.*;
import org.sorapointa.proto.GachaInfo;

public class GetGachaInfoRsp {
    public enum GetGachaInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1555) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Boolean isUnderGeneralRestrict = null;
    @Tag(tag=1) public Integer dailyGachaTimes = null;
    @Tag(tag=6) public Integer gachaRandom = null;
    @Tag(tag=13) public Boolean isUnderMinorsRestrict = null;
    @Tag(tag=3) public List<GachaInfo> gachaInfoList = new ArrayList<>();
}
