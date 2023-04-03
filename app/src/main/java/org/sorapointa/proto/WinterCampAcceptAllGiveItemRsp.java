package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampAcceptItemResultInfo.*;
import org.sorapointa.proto.WinterCampAcceptItemResultInfo;

public class WinterCampAcceptAllGiveItemRsp {
    public enum WinterCampAcceptAllGiveItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8366) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<WinterCampAcceptItemResultInfo> acceptItemResultInfo = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
