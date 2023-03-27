package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TryEnterNextRogueDiaryDungeonRsp {
    public enum TryEnterNextRogueDiaryDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8659) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
