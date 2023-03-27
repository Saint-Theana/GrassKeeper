package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockedFurnitureFormulaDataNotify {
    public enum UnlockedFurnitureFormulaDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4510) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Boolean isAll = null;
    @Tag(tag=8) public List<Integer> furnitureIdList = new ArrayList<>();
}
