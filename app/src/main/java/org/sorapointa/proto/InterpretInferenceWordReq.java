package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InterpretInferenceWordReq {
    public enum MHPKOLNLDKH {
        @Tag(tag=0) None ,
        @Tag(tag=423) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer wordId = null;
    @Tag(tag=10) public Integer pageId = null;
}
