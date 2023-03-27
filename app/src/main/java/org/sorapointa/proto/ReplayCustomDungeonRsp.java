package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReplayCustomDungeonRsp {
    public enum ReplayCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6217) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
