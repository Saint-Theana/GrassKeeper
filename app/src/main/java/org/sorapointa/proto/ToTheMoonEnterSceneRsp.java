package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ToTheMoonEnterSceneRsp {
    public enum NBNFJDLANPD {
        @Tag(tag=0) None ,
        @Tag(tag=6120) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
