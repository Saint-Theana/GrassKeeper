package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HitClientTrivialNotify {
    public enum HitClientTrivialNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=272) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Vector position = null;
    @Tag(tag=4) public Integer ownerEntityId = null;
}
