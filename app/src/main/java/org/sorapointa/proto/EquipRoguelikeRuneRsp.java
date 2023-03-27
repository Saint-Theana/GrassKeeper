package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EquipRoguelikeRuneRsp {
    public enum EquipRoguelikeRuneRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8054) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Integer> runeList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
