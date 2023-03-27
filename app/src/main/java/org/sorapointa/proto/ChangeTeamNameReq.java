package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeTeamNameReq {
    public enum ChangeTeamNameReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1631) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public String teamName = null;
    @Tag(tag=1,isSigned=true) public Integer teamId = null;
}
