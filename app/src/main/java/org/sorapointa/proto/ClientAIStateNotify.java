package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientAIStateNotify {
    public enum ClientAIStateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1113) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=10) public Integer curTactic = null;
}
