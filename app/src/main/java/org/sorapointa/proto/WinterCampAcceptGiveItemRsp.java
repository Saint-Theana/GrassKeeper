package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampAcceptItemResultInfo.*;
import org.sorapointa.proto.WinterCampAcceptItemResultInfo;

public class WinterCampAcceptGiveItemRsp {
    public enum WinterCampAcceptGiveItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8419) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public WinterCampAcceptItemResultInfo acceptItemResultInfo = null;
}
