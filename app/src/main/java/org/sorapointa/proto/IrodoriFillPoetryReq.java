package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriFillPoetryReq {
    public enum IrodoriFillPoetryReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8590) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer lineId = null;
    @Tag(tag=2) public Integer themeId = null;
}
