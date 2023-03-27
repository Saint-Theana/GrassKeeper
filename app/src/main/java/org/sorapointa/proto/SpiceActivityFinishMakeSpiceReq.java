package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpiceActivityFinishMakeSpiceReq {
    public enum SpiceActivityFinishMakeSpiceReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8744) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=12) public Boolean isSuccess = null;
    @Tag(tag=1) public List<Integer> leftMaterialIdList = new ArrayList<>();
    @Tag(tag=4) public Integer leftTurns = null;
}
