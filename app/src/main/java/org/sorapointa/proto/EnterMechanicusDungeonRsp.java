package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterMechanicusDungeonRsp {
    public enum EnterMechanicusDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3929) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer difficultLevel = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer dungeonId = null;
    @Tag(tag=14) public Integer wrongUid = null;
}
