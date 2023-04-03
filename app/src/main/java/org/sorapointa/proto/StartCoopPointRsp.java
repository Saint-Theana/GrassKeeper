package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MainCoop.*;
import org.sorapointa.proto.MainCoop;

public class StartCoopPointRsp {
    public enum StartCoopPointRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1992) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Boolean isStart = null;
    @Tag(tag=7) public MainCoop startMainCoop = null;
    @Tag(tag=13) public Integer coopPoint = null;
}
