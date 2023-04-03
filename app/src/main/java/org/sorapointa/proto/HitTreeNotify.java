package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HitTreeNotify {
    public enum HitTreeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3118) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Vector dropPos = null;
    @Tag(tag=4) public Vector treePos = null;
    @Tag(tag=5) public Integer treeType = null;
}
