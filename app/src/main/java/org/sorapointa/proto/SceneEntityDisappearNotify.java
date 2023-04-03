package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VisionType.*;
import org.sorapointa.proto.VisionType;

public class SceneEntityDisappearNotify {
    public enum SceneEntityDisappearNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=280) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Integer> entityList = new ArrayList<>();
    @Tag(tag=10) public Integer param = null;
    @Tag(tag=7) public Integer disappearType = null;
}
