package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VisionType.*;
import org.sorapointa.proto.VisionType;
import org.sorapointa.proto.SceneEntityInfo.*;
import org.sorapointa.proto.SceneEntityInfo;

public class SceneEntityAppearNotify {
    public enum SceneEntityAppearNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=274) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<SceneEntityInfo> entityList = new ArrayList<>();
    @Tag(tag=3) public Integer appearType = null;
    @Tag(tag=14) public Integer param = null;
}
