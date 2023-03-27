package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RestartCoinCollectPlaySingleModeReq {
    public enum HMOLHOLNNMC {
        @Tag(tag=0) None ,
        @Tag(tag=22217) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer levelId = null;
    @Tag(tag=4) public Integer multistagePlayIndex = null;
}
