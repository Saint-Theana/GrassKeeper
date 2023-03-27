package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoRestartDungeonRsp {
    public enum SumoRestartDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8732) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer dungeonId = null;
    @Tag(tag=8) public Integer pointId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
