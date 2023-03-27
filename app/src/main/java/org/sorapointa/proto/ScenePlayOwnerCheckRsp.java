package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerCheckRsp {
    public enum ScenePlayOwnerCheckRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4437) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=7) public Boolean isSkipMatch = null;
    @Tag(tag=8) public Integer playId = null;
    @Tag(tag=6) public Integer wrongUid = null;
}
