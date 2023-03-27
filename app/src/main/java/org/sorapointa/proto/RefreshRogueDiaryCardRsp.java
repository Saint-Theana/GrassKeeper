package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshRogueDiaryCardRsp {
    public enum RefreshRogueDiaryCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8910) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<Integer> randCardList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
