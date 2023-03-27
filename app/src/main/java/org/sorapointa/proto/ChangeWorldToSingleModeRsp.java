package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeWorldToSingleModeRsp {
    public enum ChangeWorldToSingleModeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3197) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer quitMpValidTime = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
