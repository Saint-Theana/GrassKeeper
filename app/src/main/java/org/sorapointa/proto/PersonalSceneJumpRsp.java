package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PersonalSceneJumpRsp {
    public enum PersonalSceneJumpRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=204) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer destSceneId = null;
    @Tag(tag=2) public Vector destPos = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
