package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneAudioNotify {
    public enum SceneAudioNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3132) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14,isSigned=true) public Integer type = null;
    @Tag(tag=12) public List<String> param3 = new ArrayList<>();
    @Tag(tag=4,isFloat=true) public List<Float> param2 = new ArrayList<>();
    @Tag(tag=5) public Integer sourceUid = null;
    @Tag(tag=9) public List<Integer> param1 = new ArrayList<>();
}
