package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MuqadasPotionCaptureWeaknessRsp {
    public enum PGPPGNEGGEL {
        @Tag(tag=0) None ,
        @Tag(tag=22408) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
