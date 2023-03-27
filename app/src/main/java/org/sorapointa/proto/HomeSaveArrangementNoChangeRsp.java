package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSaveArrangementNoChangeRsp {
    public enum JOPFOMPDJAL {
        @Tag(tag=0) None ,
        @Tag(tag=4762) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer sceneId = null;
}
