package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class HuntingGiveUpRsp {
    public enum HuntingGiveUpRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4314) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public HuntingPair huntingPair = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
