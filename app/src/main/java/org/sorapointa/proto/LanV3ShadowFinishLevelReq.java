package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanV3ShadowFinishLevelReq {
    public enum GDKHCIJMJLF {
        @Tag(tag=0) None ,
        @Tag(tag=23802) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer finishTime = null;
    @Tag(tag=6) public Integer levelId = null;
}
