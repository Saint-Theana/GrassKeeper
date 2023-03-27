package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCompoundMaterialBoostRsp {
    public enum HAJAHDPJKBC {
        @Tag(tag=0) None ,
        @Tag(tag=119) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<CompoundQueueData> compoundQueDataList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<ItemParam> takeItemList = new ArrayList<>();
    @Tag(tag=8) public Integer takeStatus = null;
}
