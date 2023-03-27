package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetCustomDungeonRsp {
    public enum GetCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6234) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public CustomDungeonBanInfo banInfo = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public List<CustomDungeonBrief> briefList = new ArrayList<>();
}
