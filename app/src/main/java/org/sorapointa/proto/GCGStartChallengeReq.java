package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGLevelType.*;
import org.sorapointa.proto.GCGLevelType;

public class GCGStartChallengeReq {
    public enum KLADMGMNMPN {
        @Tag(tag=0) None ,
        @Tag(tag=7857) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer configId = null;
    @Tag(tag=11) public Integer levelType = null;
    @Tag(tag=10) public Integer levelId = null;
}
