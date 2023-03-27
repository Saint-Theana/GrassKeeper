package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MuqadasPotionActivityEnterDungeonRsp {
    public enum PFCAJHFEFDM {
        @Tag(tag=0) None ,
        @Tag(tag=20138) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer levelId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
