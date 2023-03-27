package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2RestartDungeonRsp {
    public enum SummerTimeV2RestartDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8606) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
