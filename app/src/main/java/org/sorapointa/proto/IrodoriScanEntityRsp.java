package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriScanEntityRsp {
    public enum IrodoriScanEntityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8540) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Boolean isGetInspiration = null;
    @Tag(tag=8) public IrodoriPoetryThemeData themeData = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
